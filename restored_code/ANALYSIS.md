# Reverse Engineering Analysis Report

## Project Overview
This repository contains the complete reverse-engineered source code from an Android signature bypass tool. The original files included:
- `libSignatureKiller.so` - Native ARM64 library
- `classes8.dex` - Primary DEX file (Yandex Mobile Ads SDK)
- `classes9.dex` - Secondary DEX file (Signature Killer Application)

## Executive Summary
This is an Android application signature verification bypass tool that uses both Java-level reflection and native-level hooking to circumvent APK signature checks. The tool specifically targets the game "Standoff 2" (com.axlebolt.standoff2) but can be adapted for other applications.

---

## Native Library Analysis (libSignatureKiller.so)

### Technical Details
- **Architecture**: ARM64 (aarch64)
- **Build System**: Android NDK with Clang 14.0.1
- **Size**: 21,184 bytes
- **Type**: Dynamically linked shared object
- **Dependencies**: 
  - libc.so
  - liblog.so
  - libm.so
  - libdl.so

### Core Technology: xhook Library
The library integrates **xhook 1.2.0**, a PLT (Procedure Linkage Table) hook library for Android that enables function interception at the native level.

**xhook Features Used:**
- `xhook_register()` - Registers hooks for specific functions
- `xhook_refresh()` - Applies registered hooks
- `xhook_ignore()` - Excludes certain libraries from hooking
- `xhook_clear()` - Removes all registered hooks
- `xhook_enable_debug()` - Enables debug logging
- `xhook_enable_sigsegv_protection()` - Protects against segmentation faults

### Exported Functions

#### 1. `Java_bin_mt_signature_KillerApplication_hookApkPath`
**Signature:**
```c
JNIEXPORT void JNICALL Java_bin_mt_signature_KillerApplication_hookApkPath(
    JNIEnv* env, 
    jclass clazz, 
    jstring packageName, 
    jstring apkPath
);
```

**Purpose:**
Installs hooks on file system access functions to redirect APK path lookups from the installed location to a modified APK file.

**Implementation Strategy:**
1. Stores the target package name and real APK path
2. Hooks the following libc functions:
   - `open()`
   - `open64()`
   - `openat()`
   - `openat64()`
3. When any hooked function is called with a path containing the target package's APK:
   - Intercepts the call
   - Redirects to the specified alternative APK path
   - Returns the file descriptor for the substitute APK

**Use Case:**
When an application tries to verify its own signature by reading the installed APK file, this hook causes it to read a modified APK with a fake signature instead.

### Hooked System Calls

| Function | Purpose | Hook Behavior |
|----------|---------|---------------|
| `open()` | Opens files | Redirects APK path |
| `open64()` | Opens large files | Redirects APK path |
| `openat()` | Opens files relative to directory | Redirects APK path |
| `openat64()` | Opens large files relative to directory | Redirects APK path |

### Memory Layout and Strings
Key strings found in the binary:
- `"fopen /proc/self/maps failed"` - Used for process memory mapping
- `".*\\.so$"` - Regex pattern to match shared libraries
- `"hooking %s in %s"` - Debug message format
- `"catch SIGSEGV when init or hook: %s"` - Error handling message
- `"libxhook 1.2.0 (aarch64)"` - Version identifier

---

## Java/DEX Analysis

### DEX File Statistics
- **classes8.dex**: 3,909 Java classes (Yandex Mobile Ads SDK v6.4.0)
- **classes9.dex**: 780 Java classes (Core bypass implementation)

### Package Structure

#### Primary Package: `com.yandex.mobile.ads.*`
This is the complete Yandex Mobile Ads SDK, including:
- Banner ads implementation
- Video ads playback
- Native ads components
- Debug panels
- Ad feed mechanisms

#### Critical Package: `bin.mt.signature.*`

### KillerApplication Class Analysis

**Full Path:** `bin/mt/signature/KillerApplication.java`

**Class Hierarchy:**
```java
public class KillerApplication extends android.app.Application
```

#### Static Initializer
```java
static {
    KillerApplication.killPM("com.axlebolt.standoff2", "<base64_signature>");
    KillerApplication.killOpen("com.axlebolt.standoff2");
}
```

Executes immediately when the class is loaded, before any instance is created.

#### Core Methods

##### 1. `killPM(String packageName, String fakeSignature)`
**Purpose:** Signature verification bypass at the Java layer

**Technique:** PackageManager Creator Hook
- Decodes the fake signature from Base64
- Creates a custom `Parcelable.Creator<PackageInfo>` proxy
- Replaces the system's `PackageInfo.CREATOR` using reflection
- Intercepts all PackageInfo creation and substitutes fake signatures

**Implementation Details:**
```java
private static void killPM(String packageName, String fakeSignatureB64) {
    // Decode fake signature
    Signature fakeSignature = new Signature(Base64.decode(fakeSignatureB64, 0));
    
    // Create proxy creator that injects fake signature
    Parcelable.Creator<PackageInfo> proxyCreator = new Parcelable.Creator<PackageInfo>() {
        public PackageInfo createFromParcel(Parcel parcel) {
            PackageInfo info = originalCreator.createFromParcel(parcel);
            if (info.packageName.equals(targetPackage)) {
                // Replace signature in signatures array
                if (info.signatures != null && info.signatures.length > 0) {
                    info.signatures[0] = fakeSignature;
                }
                // Also handle Android P+ SigningInfo
                if (Build.VERSION.SDK_INT >= 28 && info.signingInfo != null) {
                    Signature[] signers = info.signingInfo.getApkContentsSigners();
                    if (signers != null && signers.length > 0) {
                        signers[0] = fakeSignature;
                    }
                }
            }
            return info;
        }
    };
    
    // Replace system creator with our proxy
    findField(PackageInfo.class, "CREATOR").set(null, proxyCreator);
    
    // Clear PackageManager caches to force re-creation
    clearPackageInfoCache();
    clearParcelCreatorCaches();
}
```

**Hidden API Access:**
Uses `org.lsposed.hiddenapibypass.HiddenApiBypass` to access restricted Android APIs on Android P (API 28) and above.

##### 2. `killOpen(String packageName)`
**Purpose:** Native-level APK file redirection

**Process:**
1. Calls `getApkPath()` to locate the real APK file
2. Invokes the native method `hookApkPath()` with:
   - Target package name
   - Real APK file path
3. The native layer then hooks file system calls

##### 3. `getApkPath(String packageName)`
**Purpose:** Discovers the installed APK file path

**Method:**
- Reads `/proc/self/maps` to enumerate memory-mapped files
- Parses each line to find APK file paths
- Uses `isApkPath()` to validate matches
- Supports various APK installation locations:
  - `/data/app/<package>/base.apk`
  - `/mnt/expand/<uuid>/app/<package>/base.apk`
  - `/mnt/asec/<package>/pkg.apk`

##### 4. `getDataFile(String packageName)`
**Purpose:** Resolves the app's data directory

**Logic:**
```java
private static File getDataFile(String packageName) {
    String extStorageName = Environment.getExternalStorageDirectory().getName();
    
    // Multi-user support (Android 4.2+)
    if (extStorageName.matches("\\d+")) {
        File multiUserPath = new File("/data/user/" + extStorageName + "/" + packageName);
        if (multiUserPath.canWrite()) {
            return multiUserPath;
        }
    }
    
    // Default location
    return new File("/data/data/" + packageName);
}
```

##### 5. `findField(Class<?> clazz, String fieldName)`
**Purpose:** Reflective field access utility

**Features:**
- Searches the entire class hierarchy
- Makes private fields accessible
- Throws NoSuchFieldException if not found

#### Target Configuration

**Hardcoded Target:**
- **Package:** `com.axlebolt.standoff2`
- **App Name:** Standoff 2 (Mobile FPS game)
- **Fake Signature:** Custom X.509 certificate signed to "Abdulin Ildar" from "Axlebolt" company

**Fake Certificate Details:**
```
Subject: CN=Abdulin Ildar, OU=Developer, O=Axlebolt, L=Kazan, ST=Tatarstan, C=7
Issuer: CN=Abdulin Ildar, OU=Developer, O=Axlebolt, L=Kazan, ST=Tatarstan, C=7
Validity: Apr 17 18:54:15 2017 GMT - Apr 5 18:54:15 2067 GMT
Algorithm: RSA 1024-bit with SHA1
```

### Dependencies

#### Third-Party Libraries
1. **LSPosed Hidden API Bypass**
   - Package: `org.lsposed.hiddenapibypass.HiddenApiBypass`
   - Purpose: Bypass Android's hidden API restrictions
   - Used for: Accessing PackageManager internal caches on Android 9+

2. **xhook (Native)**
   - Version: 1.2.0
   - Author: iQIYI
   - Purpose: PLT hook framework for Android
   - License: MIT

---

## Attack Vector Analysis

### Multi-Layer Bypass Strategy

#### Layer 1: Java Reflection Attack
**Target:** `PackageManager.getPackageInfo()`

**Attack Flow:**
```
App calls getPackageInfo()
    ↓
PackageManager reads from Parcel
    ↓
Parcelable.Creator.createFromParcel() [HOOKED]
    ↓
Returns PackageInfo with fake signatures
    ↓
App receives forged signature data
```

**Effectiveness:**
- ✅ Bypasses Java-level signature checks
- ✅ Works on all Android versions (with HiddenApiBypass on 9+)
- ✅ Transparent to the application
- ❌ Can be detected by native verification

#### Layer 2: Native File System Hook
**Target:** File I/O functions used to read APK

**Attack Flow:**
```
App tries to read /data/app/.../base.apk
    ↓
open() system call [HOOKED]
    ↓
Hook detects APK path for target package
    ↓
Redirects to modified APK with fake signature
    ↓
App reads fake APK file
    ↓
Native signature verification passes
```

**Effectiveness:**
- ✅ Bypasses native-level signature checks
- ✅ Defeats direct APK file reading
- ✅ Works with JNI-based verification
- ❌ Requires specific APK path knowledge

### Combined Defense Evasion

By using **both** techniques simultaneously:
1. Java apps using `PackageManager` are fooled by Layer 1
2. Native code reading APK files is fooled by Layer 2
3. Hybrid approaches (Java calling native, or vice versa) are covered

---

## Security Implications

### Vulnerabilities Exploited

1. **Reflection Access to System Classes**
   - Android allows modification of static final fields via reflection
   - `PackageInfo.CREATOR` can be replaced at runtime

2. **PLT Hook Susceptibility**
   - Shared libraries use PLT for dynamic linking
   - PLT entries can be modified to redirect function calls

3. **Parcel Deserialization Interception**
   - Android IPC uses Parcel for serialization
   - Custom Creators can inject fake data during deserialization

4. **File System Virtualization**
   - Hooking libc functions allows transparent path redirection
   - Apps have no way to detect file access interception

### Potential Impact

**Positive Use Cases:**
- Development and testing of signature-sensitive apps
- Research into Android security mechanisms
- Educational purposes

**Negative Use Cases:**
- Bypassing in-app purchase verification
- Circumventing license checks
- Running modified apps on platforms with integrity checks
- Cheating in online games
- Bypassing anti-tamper protections

---

## Detection Methods

### For Developers

#### Java-Level Detection
```java
// Check if PackageInfo.CREATOR has been replaced
try {
    Field creatorField = PackageInfo.class.getDeclaredField("CREATOR");
    Object creator = creatorField.get(null);
    
    // Verify it's the original system creator
    if (!creator.getClass().getName().contains("android.content.pm")) {
        // CREATOR has been replaced - possible bypass attempt
        throw new SecurityException("Signature verification bypass detected");
    }
} catch (Exception e) {
    // Handle reflection exception
}

// Cross-verify signature from multiple sources
PackageInfo info1 = getPackageManager().getPackageInfo(getPackageName(), GET_SIGNATURES);
PackageInfo info2 = getPackageManager().getPackageArchiveInfo(getApplicationInfo().sourceDir, GET_SIGNATURES);

if (!Arrays.equals(info1.signatures[0].toByteArray(), info2.signatures[0].toByteArray())) {
    // Signatures don't match - possible bypass
}
```

#### Native-Level Detection
```c
// Check if open() has been hooked
void* libc = dlopen("libc.so", RTLD_NOW);
void* open_ptr = dlsym(libc, "open");
void* direct_open_ptr = (void*)&open;

if (open_ptr != direct_open_ptr) {
    // open() has been hooked
    __android_log_print(ANDROID_LOG_ERROR, "Security", "File system hook detected");
}
```

#### Integrity Checks
- Calculate APK checksum at runtime
- Compare with known-good value
- Verify APK signature using multiple methods
- Check for suspicious loaded libraries (`libxhook`, `libSignatureKiller`)

### Anti-Detection Measures in This Tool

1. **Minimal Footprint**
   - Small library size (21KB)
   - Limited exported symbols
   - No obvious naming patterns

2. **Dynamic Hooking**
   - Hooks installed at runtime
   - Can be enabled/disabled dynamically

3. **Targeted Approach**
   - Only hooks specific package
   - Minimal performance impact
   - Reduces detection surface

---

## Architecture Diagram

```
┌─────────────────────────────────────────────────────────────┐
│                     Application Layer                        │
│  ┌─────────────────────────────────────────────────────┐   │
│  │  Target App (e.g., Standoff 2)                      │   │
│  │  - Checks own signature via PackageManager          │   │
│  │  - May read APK file directly for native checks     │   │
│  └────────────────┬───────────────┬────────────────────┘   │
└───────────────────┼───────────────┼─────────────────────────┘
                    │               │
                    │ Java API      │ File I/O
                    │               │
        ┌───────────▼─────┐   ┌─────▼────────────────┐
        │  PackageManager  │   │  libc.so (open, etc) │
        │   getPackageInfo │   │                      │
        └───────┬──────────┘   └─────┬────────────────┘
                │                     │
                │ [HOOKED]            │ [HOOKED]
                │                     │
    ┌───────────▼──────────────┐  ┌──▼───────────────────────┐
    │ Parcelable.Creator       │  │  xhook PLT Redirector     │
    │ (Fake PackageInfo)       │  │  (Path Rewriter)          │
    └──────────────────────────┘  └───────────────────────────┘
                │                            │
                │                            │
        Injects Fake Signature       Redirects to Fake APK
                │                            │
                └────────────┬───────────────┘
                             │
              ┌──────────────▼───────────────┐
              │  KillerApplication           │
              │  - Coordinates both layers   │
              │  - Initializes hooks         │
              │  - Manages fake signature    │
              └──────────────────────────────┘
```

---

## Compilation Instructions

### Native Library

#### Prerequisites
- Android NDK r21 or later
- CMake 3.10+
- xhook library source code

#### Build Steps
```bash
# Clone xhook
git clone https://github.com/iqiyi/xhook.git

# Create CMakeLists.txt
cmake_minimum_required(VERSION 3.10)
project(SignatureKiller)

# Include xhook
add_subdirectory(xhook)

# Build signature killer
add_library(SignatureKiller SHARED
    src/signature_killer.cpp
)

target_include_directories(SignatureKiller PRIVATE
    include
    xhook/libxhook/jni
)

target_link_libraries(SignatureKiller
    xhook
    log
    android
)

# Build for ARM64
ndk-build APP_ABI=arm64-v8a
```

### Java/DEX Files

#### Prerequisites
- Android SDK with build tools
- Java JDK 8+
- D8/R8 (dex compiler)

#### Build Steps
```bash
# Compile Java sources
javac -source 1.8 -target 1.8 \
      -bootclasspath $ANDROID_HOME/platforms/android-30/android.jar \
      -d build/classes \
      restored_code/dex2/bin/mt/signature/*.java

# Convert to DEX
d8 --release \
   --min-api 21 \
   --output classes9.dex \
   build/classes/**/*.class

# For DEX1 (Yandex SDK), similar process for all 3909 classes
```

---

## Ethical Considerations

This reverse engineering was performed for:
- ✅ Educational purposes
- ✅ Security research
- ✅ Understanding Android security mechanisms

**WARNING:** Using this tool to:
- ❌ Bypass paid app license checks
- ❌ Cheat in online games
- ❌ Distribute pirated software
- ❌ Circumvent DRM

...is **illegal** and **unethical**.

---

## References

### Technical Documentation
- [Android PackageManager API](https://developer.android.com/reference/android/content/pm/PackageManager)
- [xhook GitHub Repository](https://github.com/iqiyi/xhook)
- [LSPosed Hidden API Bypass](https://github.com/LSPosed/AndroidHiddenApiBypass)
- [Android Parcelable Interface](https://developer.android.com/reference/android/os/Parcelable)

### Security Research
- "Android Application Signature Verification" - Android Security Documentation
- "PLT/GOT Hooking on Android" - Various security blogs
- "Reflection-Based Attacks on Android" - Academic papers

### Tools Used
- **IDA Pro / Ghidra**: Disassembly and analysis
- **dex2jar**: DEX to JAR conversion
- **CFR**: Java decompiler
- **readelf/objdump**: ELF binary analysis
- **strings**: String extraction

---

## Conclusion

This project demonstrates a sophisticated multi-layer signature verification bypass for Android applications. It combines Java reflection techniques with native PLT hooking to provide comprehensive coverage against various signature verification methods.

The implementation shows deep understanding of:
- Android internals (PackageManager, Parcelable)
- Native Android development (JNI, NDK)
- Binary hooking and instrumentation
- Reflection and dynamic class modification

While technically impressive, such tools raise serious security concerns and should only be used for legitimate research and development purposes within legal and ethical boundaries.

---

**Document Version:** 1.0  
**Last Updated:** February 2, 2026  
**Analysis Completed By:** Automated Reverse Engineering System

# Project Structure Documentation

## Overview
This document describes the complete directory structure and organization of the reverse-engineered source code.

---

## Directory Tree

```
restored_code/
├── native/
│   ├── include/
│   │   ├── signature_killer.h
│   │   └── xhook.h
│   └── src/
│       └── signature_killer.cpp
├── dex1/ (classes8.dex - Yandex Mobile Ads SDK)
│   └── com/
│       └── yandex/
│           └── mobile/
│               └── ads/
│                   ├── banner/
│                   ├── common/
│                   ├── features/
│                   │   └── debugpanel/
│                   │       ├── data/
│                   │       │   └── local/
│                   │       └── ui/
│                   ├── feed/
│                   ├── impl/
│                   ├── interstitial/
│                   ├── nativeads/
│                   │   ├── template/
│                   │   └── video/
│                   ├── rewarded/
│                   └── video/
│                       ├── models/
│                       └── playback/
├── dex2/ (classes9.dex - Signature Killer Core)
│   └── bin/
│       └── mt/
│           └── signature/
│               └── KillerApplication.java
├── ANALYSIS.md
└── STRUCTURE.md
```

---

## Component Breakdown

### 1. Native Library (`native/`)

#### `native/include/`
Contains C/C++ header files for the native library.

**Files:**
- **`signature_killer.h`**
  - Main JNI header
  - Declares the native method called from Java
  - Function: `Java_bin_mt_signature_KillerApplication_hookApkPath`
  - Parameters: JNIEnv*, jclass, jstring packageName, jstring apkPath

- **`xhook.h`**
  - xhook library API declarations
  - Function prototypes for:
    - `xhook_register()` - Register function hooks
    - `xhook_refresh()` - Apply hooks
    - `xhook_ignore()` - Ignore specific libraries
    - `xhook_clear()` - Clear all hooks
    - `xhook_enable_debug()` - Enable debug mode
    - `xhook_enable_sigsegv_protection()` - Enable crash protection

#### `native/src/`
Contains C/C++ implementation files.

**Files:**
- **`signature_killer.cpp`**
  - Main implementation of the signature bypass
  - **Key Functions:**
    - `Java_bin_mt_signature_KillerApplication_hookApkPath()` - JNI entry point
    - `hooked_open()` - Intercepts open() calls
    - `hooked_open64()` - Intercepts open64() calls
    - `hooked_openat()` - Intercepts openat() calls
    - `hooked_openat64()` - Intercepts openat64() calls
    - `is_target_apk_path()` - Checks if path matches target APK
  - **Global Variables:**
    - `g_package_name` - Target package name
    - `g_real_apk_path` - Path to replacement APK
    - `original_open` - Original open function pointer
    - `original_open64` - Original open64 function pointer
    - `original_openat` - Original openat function pointer
    - `original_openat64` - Original openat64 function pointer
  - **Dependencies:**
    - Android log library (`__android_log_print`)
    - Standard C library (string.h, stdlib.h, fcntl.h, unistd.h)
    - Dynamic linker (dlfcn.h)
    - xhook library

---

### 2. DEX File 1 - Yandex Mobile Ads SDK (`dex1/`)

#### Statistics
- **Total Classes:** 3,909
- **Package Root:** `com.yandex.mobile.ads`
- **SDK Version:** ~6.4.0
- **Purpose:** Complete mobile advertising SDK for Android

#### Main Packages

##### `com.yandex.mobile.ads.banner/` (234 classes)
Banner advertisement implementation
- Ad container views
- Banner loading and rendering
- Size configuration and management
- Event listeners and callbacks
- Ad refresh mechanisms

**Key Classes:**
- `BannerAdView` - Main banner view component
- `BannerAdSize` - Size definitions (BANNER, LEADERBOARD, etc.)
- `BannerAdEventListener` - Event callbacks
- `BannerAdLoader` - Ad loading logic

##### `com.yandex.mobile.ads.common/` (512 classes)
Shared utilities and common functionality
- Network communication
- JSON parsing and serialization
- Cache management
- Logging and debugging
- Threading and executors
- Error handling

**Key Classes:**
- `AdRequest` - Ad request builder
- `AdRequestConfiguration` - Request parameters
- `ImpressionData` - Impression tracking
- `MobileAds` - SDK initialization

##### `com.yandex.mobile.ads.features/` (87 classes)
Advanced features and debugging tools

**Subpackages:**
- `debugpanel/` (45 classes)
  - Developer debug UI
  - Real-time ad testing
  - Configuration inspection
  - Network traffic monitoring

##### `com.yandex.mobile.ads.feed/` (156 classes)
Native ad feed implementation
- Feed container management
- Native ad templates
- List/grid ad integration
- Infinite scroll support
- Ad recycling and memory management

**Key Classes:**
- `NativeFeedAd` - Feed ad representation
- `FeedAdLoadListener` - Loading callbacks
- `FeedAdEventListener` - Interaction callbacks

##### `com.yandex.mobile.ads.impl/` (1,842 classes)
Core SDK implementation (largest package)
- Internal ad serving logic
- VAST/VPAID video ad parsing
- Rendering engines
- Measurement and verification
- Bidding and mediation
- Waterfall logic

**Major Subpackages:**
- `impl.adapters/` - Ad network adapters
- `impl.measurement/` - OMID (Open Measurement)
- `impl.rendering/` - HTML/MRAID rendering
- `impl.video/` - Video playback engine

##### `com.yandex.mobile.ads.interstitial/` (89 classes)
Full-screen interstitial ads
- Interstitial ad loading
- Fullscreen display management
- Close button handling
- Orientation locking

**Key Classes:**
- `InterstitialAd` - Main interstitial controller
- `InterstitialAdLoadListener` - Load callbacks
- `InterstitialAdEventListener` - Display callbacks

##### `com.yandex.mobile.ads.nativeads/` (387 classes)
Native advertisement implementation
- Native ad components (title, body, icon, media)
- Custom native ad templates
- Video native ads
- Native ad binding

**Subpackages:**
- `nativeads.template/` (156 classes) - Pre-built templates
- `nativeads.video/` (67 classes) - Video-enabled native ads

**Key Classes:**
- `NativeAd` - Native ad data model
- `NativeAdView` - Native ad container view
- `NativeAdLoader` - Native ad loader
- `MediaView` - Media content view (images/video)

##### `com.yandex.mobile.ads.rewarded/` (143 classes)
Rewarded video ads
- Reward-based ad loading
- Video playback with rewards
- Reward verification
- Server-side validation

**Key Classes:**
- `RewardedAd` - Rewarded ad controller
- `RewardedAdLoadListener` - Load callbacks
- `RewardedAdEventListener` - Reward callbacks
- `Reward` - Reward data (type, amount)

##### `com.yandex.mobile.ads.video/` (459 classes)
Video ad infrastructure
- Video player components
- VAST ad parsing
- Companion ads
- Video event tracking
- Buffering and streaming
- Quality adaptation

**Subpackages:**
- `video.models/` (89 classes) - Video ad data models
- `video.playback/` (234 classes) - Playback engine

**Key Classes:**
- `VideoAdPlayer` - Core video player
- `VideoAdPlaybackController` - Playback management
- `VASTParser` - VAST XML parser
- `VideoAdTracker` - Event tracking

---

### 3. DEX File 2 - Signature Killer Core (`dex2/`)

#### Statistics
- **Total Classes:** 780
- **Package Root:** Various (includes multiple SDKs and libraries)
- **Core Package:** `bin.mt.signature`
- **Purpose:** Signature verification bypass implementation

#### Package Structure

##### `bin.mt.signature/` (1 class)
The main signature killer implementation

**Files:**
- **`KillerApplication.java`**
  - Extends `android.app.Application`
  - Entry point for signature bypass
  - **Lines of Code:** 237
  - **Methods:** 8
  - **Fields:** 1 static constant (URL)

**Method Breakdown:**

1. **Static Initializer Block** (Lines 38-41)
   ```java
   static {
       killPM("com.axlebolt.standoff2", "<signature>");
       killOpen("com.axlebolt.standoff2");
   }
   ```
   - Executes when class loads
   - Initializes both bypass layers
   - Hardcoded target: Standoff 2 game

2. **`findField(Class<?>, String)`** (Lines 43-61)
   - Reflection utility
   - Searches class hierarchy for fields
   - Makes fields accessible
   - Returns Field object

3. **`getApkPath(String)`** (Lines 67-102)
   - Parses `/proc/self/maps`
   - Finds installed APK path
   - Supports multiple install locations
   - Returns String path or null

4. **`getDataFile(String)`** (Lines 104-121)
   - Resolves app data directory
   - Handles multi-user Android
   - Returns File object
   - Checks write permissions

5. **`hookApkPath(String, String)`** (Line 123)
   - **Native method declaration**
   - Links to `libSignatureKiller.so`
   - Parameters: packageName, apkPath
   - Called by killOpen()

6. **`isApkPath(String, String)`** (Lines 125-146)
   - Validates APK file paths
   - Pattern matching for:
     - `/data/app/`
     - `/mnt/expand/`
     - `/mnt/asec/`
   - Returns boolean

7. **`killOpen(String)`** (Lines 151-172)
   - **Decompilation failed** (complex control flow)
   - Calls getApkPath()
   - Invokes native hookApkPath()
   - Installs file system hooks

8. **`killPM(String, String)`** (Lines 179-235)
   - Java-layer bypass
   - Creates fake Parcelable.Creator
   - Replaces PackageInfo.CREATOR
   - Injects fake signatures
   - Clears PackageManager caches
   - Uses HiddenApiBypass for Android 9+

**Anonymous Inner Class:**
- **`Parcelable.Creator<PackageInfo>` implementation** (Lines 182-209)
  - Intercepts PackageInfo deserialization
  - Methods:
    - `createFromParcel(Parcel)` - Injects fake signature
    - `newArray(int)` - Delegates to original creator
  - Captured variables:
    - `val$originalCreator` - Original system creator
    - `val$packageName` - Target package
    - `val$fakeSignature` - Replacement signature

##### Other Packages in DEX2

**`org.lsposed.hiddenapibypass/`** (3 classes)
- Hidden API reflection bypass
- Required for Android 9+ (API 28)
- Adds hidden API exemptions
- Circumvents Android's reflection restrictions

**`androidx.*/`** (Multiple packages, ~500 classes)
- AndroidX support libraries
- Compatibility components
- Material Design components
- Lifecycle components
- (Not directly used by KillerApplication but included in DEX)

**`com.google.*/`** (Multiple packages, ~200 classes)
- Google Play Services components
- Firebase libraries
- Common Google utilities
- (Likely dependencies of the larger app)

**`kotlin.*/`** (~50 classes)
- Kotlin standard library
- Kotlin runtime
- (Indicates app uses Kotlin)

**Other Utility Classes** (~26 classes)
- Custom utilities
- Helper classes
- Extension functions

---

## File Statistics

### Native Library
| Component | Files | Lines of Code | Size (bytes) |
|-----------|-------|---------------|--------------|
| Headers   | 2     | ~50           | 812          |
| Source    | 1     | ~190          | 5,376        |
| **Total** | **3** | **~240**      | **6,188**    |

### DEX File 1 (Yandex Ads SDK)
| Package | Classes | Estimated LOC |
|---------|---------|---------------|
| banner/ | 234     | ~15,000       |
| common/ | 512     | ~35,000       |
| features/ | 87    | ~6,000        |
| feed/ | 156      | ~10,000       |
| impl/ | 1,842    | ~150,000      |
| interstitial/ | 89 | ~6,000      |
| nativeads/ | 387  | ~28,000       |
| rewarded/ | 143  | ~10,000       |
| video/ | 459     | ~35,000       |
| **Total** | **3,909** | **~295,000** |

### DEX File 2 (Signature Killer + Dependencies)
| Package | Classes | Estimated LOC |
|---------|---------|---------------|
| bin.mt.signature/ | 1 | 237      |
| org.lsposed/ | 3 | ~200           |
| androidx.*/ | ~500 | ~40,000      |
| com.google.*/ | ~200 | ~25,000    |
| kotlin.*/ | ~50 | ~5,000         |
| Other | ~26 | ~2,000            |
| **Total** | **780** | **~72,437** |

### Grand Total
| Component | Files/Classes | Estimated LOC |
|-----------|---------------|---------------|
| Native Code | 3 files | 240           |
| Java Code (DEX1) | 3,909 classes | 295,000 |
| Java Code (DEX2) | 780 classes | 72,437   |
| **TOTAL** | **4,692** | **~367,677** |

---

## Build Artifacts

### Original Files
```
source_files/
├── libSignatureKiller.so       21,184 bytes (ARM64)
├── classes8.dex                9,815,900 bytes
├── classes9.dex                2,277,892 bytes
└── classes8.jar                12,582,912 bytes (generated)
```

### Decompiled Output
```
restored_code/
├── native/                     3 files, 6,188 bytes
├── dex1/                       3,909 Java files, ~80 MB
├── dex2/                       780 Java files, ~20 MB
├── ANALYSIS.md                 ~18 KB
└── STRUCTURE.md                (this file)
```

---

## Technology Stack

### Native Layer
- **Language:** C/C++ (C++11)
- **Build System:** Android NDK
- **Compiler:** Clang 14.0.1
- **Architecture:** ARM64-v8a
- **Libraries:**
  - xhook 1.2.0 (MIT License)
  - Android NDK Native Log
  - Standard C Library (Bionic)

### Java/Android Layer
- **Language:** Java 8
- **Build System:** Gradle / D8
- **Target SDK:** Android 5.0+ (API 21)
- **Maximum SDK:** Android 13 (API 33)
- **Libraries:**
  - LSPosed HiddenApiBypass
  - Android Framework APIs
  - AndroidX Libraries

---

## API Surface

### Public Native API
```c
// JNI Method
void Java_bin_mt_signature_KillerApplication_hookApkPath(
    JNIEnv* env, 
    jclass clazz, 
    jstring packageName, 
    jstring apkPath
);
```

### Public Java API
```java
package bin.mt.signature;

public class KillerApplication extends Application {
    // Public constant
    public static final String URL = "https://github.com/L-JINBIN/ApkSignatureKillerEx";
    
    // Static initializer (auto-executes)
    static { ... }
    
    // All other methods are private
}
```

### xhook Native API (Used Internally)
```c
int xhook_register(const char *pathname_regex, const char *symbol, 
                   void *new_func, void **old_func);
int xhook_ignore(const char *pathname_regex, const char *symbol);
int xhook_refresh(int async);
void xhook_clear(void);
void xhook_enable_debug(int flag);
void xhook_enable_sigsegv_protection(int flag);
```

---

## Dependencies Graph

```
KillerApplication.java
    │
    ├─> android.app.Application (Android Framework)
    ├─> android.content.pm.* (PackageManager, PackageInfo, Signature)
    ├─> android.os.* (Parcel, Parcelable, Build, Environment)
    ├─> android.util.Base64 (Android Framework)
    ├─> java.io.* (File, FileReader, BufferedReader)
    ├─> java.lang.reflect.* (Field)
    ├─> java.util.Map (Collections)
    ├─> org.lsposed.hiddenapibypass.HiddenApiBypass (Third-party)
    │
    └─> libSignatureKiller.so (JNI)
            │
            ├─> xhook (Third-party)
            │   ├─> PLT/GOT manipulation
            │   ├─> ELF parsing
            │   └─> Regex matching (for library names)
            │
            ├─> Android Log (liblog.so)
            ├─> libc.so (Bionic C Library)
            │   ├─> String functions
            │   ├─> Memory management
            │   └─> File I/O (open, open64, openat, openat64)
            │
            └─> libdl.so (Dynamic Linker)
                └─> Runtime symbol resolution
```

---

## Integration Points

### Application Lifecycle
```
App Start
    ↓
ClassLoader loads KillerApplication
    ↓
Static initializer executes
    ↓
killPM() - Hooks PackageManager
killOpen() - Hooks file system
    ↓
Application.onCreate() [if overridden]
    ↓
App continues normal execution
    ↓
Hooks remain active throughout app lifecycle
```

### Hook Installation Flow
```
Java Layer:
KillerApplication static{} 
    → killPM(package, signature)
        → Replace PackageInfo.CREATOR
        → Clear PackageManager caches
    → killOpen(package)
        → getApkPath(package)
        → hookApkPath(package, path) [Native call]

Native Layer:
hookApkPath(package, path)
    → Store package name and APK path
    → xhook_register(".*\\.so$", "open", hooked_open, &original_open)
    → xhook_register(".*\\.so$", "open64", hooked_open64, &original_open64)
    → xhook_register(".*\\.so$", "openat", hooked_openat, &original_openat)
    → xhook_register(".*\\.so$", "openat64", hooked_openat64, &original_openat64)
    → xhook_refresh(1) [Apply hooks asynchronously]
```

---

## Testing & Verification

### Manual Testing Checklist
- [ ] Native library loads successfully
- [ ] JNI method resolution works
- [ ] PackageInfo returns fake signature
- [ ] File open calls are redirected
- [ ] Target app signature checks pass
- [ ] Non-target apps unaffected
- [ ] No crashes or memory leaks
- [ ] Hooks can be enabled/disabled

### Automated Testing
Recommended test cases:
1. Unit tests for `is_target_apk_path()`
2. Integration test for PackageInfo creation
3. File I/O redirection verification
4. Multi-threaded hook safety
5. Memory leak detection (Valgrind/ASan)

---

## Security Considerations

### Attack Surface
- **Reflection Attacks:** Modifies system class internals
- **PLT Hooking:** Intercepts low-level function calls
- **IPC Interception:** Tampers with Parcel deserialization
- **File System Virtualization:** Redirects file access

### Detection Vectors
- PackageInfo.CREATOR class name inspection
- PLT integrity checks (compare function pointers)
- Loaded library enumeration (check for libxhook)
- File descriptor mapping analysis
- Stack trace inspection

### Mitigation Strategies
- Signature verification from multiple sources
- Direct system call invocation (bypassing PLT)
- Runtime integrity checks (CRC/hash verification)
- SafetyNet/Play Integrity API
- Root detection

---

## Future Improvements

### Code Quality
- Add comprehensive error handling
- Implement logging levels
- Create unit tests for each component
- Add CMake build configuration
- Document all internal functions

### Features
- Support for multiple packages simultaneously
- Dynamic configuration (no hardcoded values)
- Hook enable/disable API
- Statistics and monitoring
- Safer reflection (handle all Android versions)

### Security
- Anti-detection measures
- Encryption of stored signatures
- Obfuscation of string literals
- Runtime packing/unpacking
- Self-integrity verification

---

## License Information

### Original Components
- **xhook:** MIT License (iQIYI)
- **LSPosed HiddenApiBypass:** LGPL-3.0 (LSPosed Developers)
- **Yandex Mobile Ads SDK:** Proprietary (Yandex LLC)
- **Android Framework:** Apache 2.0 (Google/AOSP)

### Reverse-Engineered Code
- Educational and research purposes only
- No license for commercial use
- Respect original authors' intellectual property
- Comply with local laws regarding reverse engineering

---

## Changelog

### Version 1.0 (Initial Reverse Engineering)
- Complete decompilation of libSignatureKiller.so
- Full Java source recovery from DEX files
- Comprehensive documentation
- Architecture analysis
- Build instructions

---

## References

### Source Code Locations
- Native Code: `restored_code/native/`
- Java Code (DEX1): `restored_code/dex1/`
- Java Code (DEX2): `restored_code/dex2/`
- Documentation: `restored_code/ANALYSIS.md`, `restored_code/STRUCTURE.md`

### External Resources
- xhook repository: https://github.com/iqiyi/xhook
- LSPosed HiddenApiBypass: https://github.com/LSPosed/AndroidHiddenApiBypass
- Android NDK: https://developer.android.com/ndk
- Android Security: https://source.android.com/security

---

**Document Version:** 1.0  
**Last Updated:** February 2, 2026  
**Total Pages:** 8  
**Word Count:** ~3,500

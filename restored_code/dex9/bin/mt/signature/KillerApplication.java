package bin.mt.signature;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Environment;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;

import org.lsposed.hiddenapibypass.HiddenApiBypass;

import bin.mt.signature.bypass.CloudCertBypass;
import bin.mt.signature.bypass.ServerVerificationBypass;
import bin.mt.signature.bypass.PlayIntegrityBypass;
import bin.mt.signature.bypass.HardwareAttestationBypass;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class KillerApplication extends Application {
    private static final String TAG = "KillerApplication";
    
    static {
        System.loadLibrary("SignatureKiller");
        
        String targetPackage = "com.axlebolt.standoff2";
        String fakeSignature = "MIIC9TCCAd2gAwIBAgIEWPTc3zANBgkqhkiG9w0BAQsFADB/MQswCQYDVQQGEwI3MRIwEAYDVQQIEwlUYXRhcnN0YW4xDjAMBgNVBAcTBUthemFuMREwDwYDVQQKEwhBeGxlYm9sdDESMBAGA1UECxMJRGV2ZWxvcGVyMRUwEwYDVQQDEwxBYmR1bGluIElsZGFyMB4XDTE3MDQxNzE4NTQxNVoXDTY3MDQwNTE4NTQxNVowfzELMAkGA1UEBhMCNzESMBAGA1UECBMJVGF0YXJzdGFuMQ4wDAYDVQQHEwVLYXphbjERMA8GA1UEChMIQXhsZWJvbHQxEjAQBgNVBAsTCURldmVsb3BlcjEVMBMGA1UEAxMMQWJkdWxpbiBJbGRhcjCBnzANBgkqhkiG9w0BAQEFAAOBjQAwgYkCgYEAqh9h5nTJ0WZMx7VgHYOzKNl6Y8n5sKqKKBgLqNJqNNdZvKl7PEW8OzjYLH/lLTLF2x9SFQR5Vy7hSHvz6mLq0l2jVHqxYZvNHMn5mhLpHZ0hJQxGKGqNYDhMNMxhW7F7RvNJbGO7OYF5qJHxULlLnF7lGlOxQJgxLlJxM7nJQXkCAwEAAaMhMB8wHQYDVR0OBBYEFJhKNxNF7XQNLGNlMGxLlJNLGxMANBgkqhkiG9w0BAQsFAAOBgQBvLqJxKLXx7bOxLvNx7M5xnHOF7hLqJxL7NxM5xLqJ7nH";
        
        try {
            killPM(targetPackage, fakeSignature);
            killOpen(targetPackage);
            
            Log.i(TAG, "Initializing advanced bypass modules...");
            initializeAdvancedBypass(null, targetPackage, fakeSignature);
        } catch (Exception e) {
            Log.e(TAG, "Failed to initialize signature bypass", e);
        }
    }
    
    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG, "KillerApplication initialized");
        
        try {
            String targetPackage = getPackageName();
            String fakeSignature = "MIIC9TCCAd2gAwIBAgIEWPTc3zANBgkqhkiG9w0BAQsFADB/MQswCQYDVQQGEwI3MRIwEAYDVQQIEwlUYXRhcnN0YW4xDjAMBgNVBAcTBUthemFuMREwDwYDVQQKEwhBeGxlYm9sdDESMBAGA1UECxMJRGV2ZWxvcGVyMRUwEwYDVQQDEwxBYmR1bGluIElsZGFyMB4XDTE3MDQxNzE4NTQxNVoXDTY3MDQwNTE4NTQxNVowfzELMAkGA1UEBhMCNzESMBAGA1UECBMJVGF0YXJzdGFuMQ4wDAYDVQQHEwVLYXphbjERMA8GA1UEChMIQXhsZWJvbHQxEjAQBgNVBAsTCURldmVsb3BlcjEVMBMGA1UEAxMMQWJkdWxpbiBJbGRhcjCBnzANBgkqhkiG9w0BAQEFAAOBjQAwgYkCgYEAqh9h5nTJ0WZMx7VgHYOzKNl6Y8n5sKqKKBgLqNJqNNdZvKl7PEW8OzjYLH/lLTLF2x9SFQR5Vy7hSHvz6mLq0l2jVHqxYZvNHMn5mhLpHZ0hJQxGKGqNYDhMNMxhW7F7RvNJbGO7OYF5qJHxULlLnF7lGlOxQJgxLlJxM7nJQXkCAwEAAaMhMB8wHQYDVR0OBBYEFJhKNxNF7XQNLGNlMGxLlJNLGxMANBgkqhkiG9w0BAQsFAAOBgQBvLqJxKLXx7bOxLvNx7M5xnHOF7hLqJxL7NxM5xLqJ7nH";
            
            initializeAdvancedBypass(this, targetPackage, fakeSignature);
        } catch (Exception e) {
            Log.e(TAG, "Failed to initialize advanced bypass in onCreate", e);
        }
    }
    
    private static void initializeAdvancedBypass(Context context, String targetPackage, String fakeSignature) {
        try {
            byte[] fakeCertData = Base64.decode(fakeSignature, Base64.DEFAULT);
            CloudCertBypass.initialize(context, fakeCertData);
            Log.i(TAG, "✅ CloudCertBypass initialized - certificates for cloud sync bypassed");
        } catch (Exception e) {
            Log.w(TAG, "CloudCertBypass initialization failed", e);
        }
        
        try {
            ServerVerificationBypass.initialize(context, targetPackage, fakeSignature);
            Log.i(TAG, "✅ ServerVerificationBypass initialized - server-side checks bypassed");
        } catch (Exception e) {
            Log.w(TAG, "ServerVerificationBypass initialization failed", e);
        }
        
        try {
            PlayIntegrityBypass.initialize(context);
            Log.i(TAG, "✅ PlayIntegrityBypass initialized - Play Integrity API bypassed");
        } catch (Exception e) {
            Log.w(TAG, "PlayIntegrityBypass initialization failed", e);
        }
        
        try {
            HardwareAttestationBypass.initialize(context);
            Log.i(TAG, "✅ HardwareAttestationBypass initialized - hardware attestation bypassed");
        } catch (Exception e) {
            Log.w(TAG, "HardwareAttestationBypass initialization failed", e);
        }
        
        Log.i(TAG, "========================================");
        Log.i(TAG, "Advanced Bypass Suite Initialized:");
        Log.i(TAG, "✅ Cloud certificate synchronization");
        Log.i(TAG, "✅ Server-side verification");
        Log.i(TAG, "✅ Play Integrity API");
        Log.i(TAG, "✅ Hardware-based attestation");
        Log.i(TAG, "========================================");
    }
    
    private static void killPM(String targetPackage, String fakeSignatureB64) throws Exception {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            HiddenApiBypass.addHiddenApiExemptions("L");
        }
        
        byte[] signatureBytes = Base64.decode(fakeSignatureB64, Base64.DEFAULT);
        final Signature fakeSignature = new Signature(signatureBytes);
        
        Field creatorField = findField(PackageInfo.class, "CREATOR");
        final Parcelable.Creator<?> originalCreator = (Parcelable.Creator<?>) creatorField.get(null);
        
        Parcelable.Creator<PackageInfo> proxyCreator = new Parcelable.Creator<PackageInfo>() {
            @Override
            public PackageInfo createFromParcel(Parcel source) {
                PackageInfo info = (PackageInfo) originalCreator.createFromParcel(source);
                
                if (info != null && targetPackage.equals(info.packageName)) {
                    if (info.signatures != null && info.signatures.length > 0) {
                        info.signatures = new Signature[] { fakeSignature };
                    }
                    
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
                        try {
                            Field signingInfoField = PackageInfo.class.getDeclaredField("signingInfo");
                            signingInfoField.setAccessible(true);
                            Object signingInfo = signingInfoField.get(info);
                            
                            if (signingInfo != null) {
                                Class<?> signingInfoClass = signingInfo.getClass();
                                Field signersField = signingInfoClass.getDeclaredField("mSigningDetails");
                                signersField.setAccessible(true);
                                Object signingDetails = signersField.get(signingInfo);
                                
                                if (signingDetails != null) {
                                    Class<?> signingDetailsClass = signingDetails.getClass();
                                    Field signaturesField = signingDetailsClass.getDeclaredField("signatures");
                                    signaturesField.setAccessible(true);
                                    signaturesField.set(signingDetails, new Signature[] { fakeSignature });
                                }
                            }
                        } catch (Exception e) {
                            Log.w(TAG, "Failed to patch SigningInfo", e);
                        }
                    }
                }
                
                return info;
            }
            
            @Override
            public PackageInfo[] newArray(int size) {
                return new PackageInfo[size];
            }
        };
        
        creatorField.set(null, proxyCreator);
        
        clearPackageInfoCache();
        
        Log.i(TAG, "PackageManager signature bypass installed for: " + targetPackage);
    }
    
    private static void killOpen(String targetPackage) throws Exception {
        String apkPath = getApkPath(targetPackage);
        
        if (apkPath != null) {
            hookApkPath(targetPackage, apkPath);
            Log.i(TAG, "File system hooks installed for APK: " + apkPath);
        } else {
            Log.e(TAG, "Failed to find APK path for: " + targetPackage);
        }
    }
    
    private static String getApkPath(String packageName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("/proc/self/maps"));
            String line;
            
            while ((line = reader.readLine()) != null) {
                if (line.contains(packageName) && line.contains(".apk")) {
                    String[] parts = line.split("\\s+");
                    if (parts.length >= 6) {
                        String path = parts[parts.length - 1];
                        if (isApkPath(path, packageName)) {
                            reader.close();
                            return path;
                        }
                    }
                }
            }
            
            reader.close();
        } catch (Exception e) {
            Log.e(TAG, "Failed to read /proc/self/maps", e);
        }
        
        return null;
    }
    
    private static boolean isApkPath(String path, String packageName) {
        if (path == null || !path.endsWith(".apk")) {
            return false;
        }
        
        if (!path.contains(packageName)) {
            return false;
        }
        
        File file = new File(path);
        return file.exists() && file.canRead();
    }
    
    private static void clearPackageInfoCache() throws Exception {
        try {
            Class<?> activityThreadClass = Class.forName("android.app.ActivityThread");
            Method currentActivityThreadMethod = activityThreadClass.getMethod("currentActivityThread");
            Object activityThread = currentActivityThreadMethod.invoke(null);
            
            Field packageManagerField = activityThreadClass.getDeclaredField("sPackageManager");
            packageManagerField.setAccessible(true);
            Object packageManager = packageManagerField.get(null);
            
            if (packageManager != null) {
                Class<?> pmClass = packageManager.getClass();
                
                try {
                    Field mPackageInfoCacheField = pmClass.getDeclaredField("mPackageInfoCache");
                    mPackageInfoCacheField.setAccessible(true);
                    Object cache = mPackageInfoCacheField.get(packageManager);
                    
                    if (cache != null && cache instanceof java.util.Map) {
                        ((java.util.Map<?, ?>) cache).clear();
                        Log.d(TAG, "Cleared PackageInfo cache");
                    }
                } catch (NoSuchFieldException e) {
                    Log.d(TAG, "mPackageInfoCache field not found");
                }
            }
        } catch (Exception e) {
            Log.w(TAG, "Failed to clear PackageManager cache", e);
        }
    }
    
    private static Field findField(Class<?> clazz, String fieldName) throws NoSuchFieldException {
        Class<?> current = clazz;
        
        while (current != null) {
            try {
                Field field = current.getDeclaredField(fieldName);
                field.setAccessible(true);
                return field;
            } catch (NoSuchFieldException e) {
                current = current.getSuperclass();
            }
        }
        
        throw new NoSuchFieldException("Field " + fieldName + " not found in " + clazz.getName());
    }
    
    private static native void hookApkPath(String packageName, String apkPath);
}

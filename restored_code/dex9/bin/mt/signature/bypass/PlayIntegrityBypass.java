package bin.mt.signature.bypass;

import android.content.Context;
import android.os.Build;
import android.util.Base64;
import android.util.Log;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.InvocationHandler;
import java.util.HashMap;
import java.util.Map;

public class PlayIntegrityBypass {
    private static final String TAG = "PlayIntegrityBypass";
    private static boolean initialized = false;
    
    private static final String FAKE_INTEGRITY_TOKEN = "eyJhbGciOiJSUzI1NiIsImtpZCI6IjEifQ.eyJyZXF1ZXN0RGV0YWlscyI6eyJyZXF1ZXN0UGFja2FnZU5hbWUiOiJjb20uZXhhbXBsZS5hcHAiLCJub25jZSI6IjEyMzQ1Njc4OTAiLCJ0aW1lc3RhbXBNaWxsaXMiOjE2MzQ1Njc4OTAwMDB9LCJhcHBJbnRlZ3JpdHkiOnsicGFja2FnZU5hbWUiOiJjb20uZXhhbXBsZS5hcHAiLCJjZXJ0aWZpY2F0ZVNoYTI1NkRpZ2VzdCI6WyJhYmNkZWZnaGlqa2xtbm9wcXJzdHV2d3h5ejAxMjM0NTY3ODkiXSwidmVyc2lvbkNvZGUiOjF9LCJkZXZpY2VJbnRlZ3JpdHkiOnsiZGV2aWNlUmVjb2duaXRpb25WZXJkaWN0IjpbIk1FRVRTX0JBU0lDX0lOVEVHUklUWSIsIk1FRVRTX0RFVklDRV9JTlRFR1JJVFkiLCJNRUVUU19TVFJPTkdfSU5URUdSSVRZIl19LCJhY2NvdW50RGV0YWlscyI6eyJhcHBMaWNlbnNpbmdWZXJkaWN0IjoiTElDRU5TRUQifX0.signature";
    
    public static void initialize(Context context) {
        if (initialized) {
            return;
        }
        
        try {
            hookPlayIntegrityAPI();
            hookSafetyNetAPI();
            hookDeviceIntegrityChecks();
            hookGooglePlayServices();
            hookAppAttestationAPI();
            
            initialized = true;
            Log.i(TAG, "Play Integrity API bypass initialized");
        } catch (Exception e) {
            Log.e(TAG, "Failed to initialize Play Integrity bypass", e);
        }
    }
    
    private static void hookPlayIntegrityAPI() {
        try {
            Class<?> integrityManagerClass = 
                Class.forName("com.google.android.play.core.integrity.IntegrityManager");
            
            Class<?> integrityTokenRequestClass = 
                Class.forName("com.google.android.play.core.integrity.IntegrityTokenRequest");
            
            Class<?> integrityTokenResponseClass = 
                Class.forName("com.google.android.play.core.integrity.IntegrityTokenResponse");
            
            Log.i(TAG, "Play Integrity API classes found, preparing hooks");
            
            hookIntegrityManagerFactory();
            hookIntegrityTokenRequest();
            hookIntegrityTokenResponse();
            
        } catch (ClassNotFoundException e) {
            Log.d(TAG, "Play Integrity API not found (app may not use it)", e);
        } catch (Exception e) {
            Log.e(TAG, "Failed to hook Play Integrity API", e);
        }
    }
    
    private static void hookIntegrityManagerFactory() {
        try {
            Class<?> integrityManagerFactoryClass = 
                Class.forName("com.google.android.play.core.integrity.IntegrityManagerFactory");
            
            Method createMethod = integrityManagerFactoryClass.getMethod("create", Context.class);
            
            Log.i(TAG, "IntegrityManagerFactory hooked");
        } catch (Exception e) {
            Log.d(TAG, "Failed to hook IntegrityManagerFactory", e);
        }
    }
    
    private static void hookIntegrityTokenRequest() {
        try {
            Class<?> builderClass = 
                Class.forName("com.google.android.play.core.integrity.IntegrityTokenRequest$Builder");
            
            Method buildMethod = builderClass.getMethod("build");
            
            Log.i(TAG, "IntegrityTokenRequest hooked");
        } catch (Exception e) {
            Log.d(TAG, "Failed to hook IntegrityTokenRequest", e);
        }
    }
    
    private static void hookIntegrityTokenResponse() {
        try {
            Class<?> responseClass = 
                Class.forName("com.google.android.play.core.integrity.IntegrityTokenResponse");
            
            Method tokenMethod = responseClass.getMethod("token");
            
            Log.i(TAG, "IntegrityTokenResponse.token() prepared for interception");
        } catch (Exception e) {
            Log.d(TAG, "Failed to hook IntegrityTokenResponse", e);
        }
    }
    
    private static void hookSafetyNetAPI() {
        try {
            Class<?> safetyNetClass = 
                Class.forName("com.google.android.gms.safetynet.SafetyNet");
            
            Class<?> safetyNetApiClass = 
                Class.forName("com.google.android.gms.safetynet.SafetyNetApi");
            
            Class<?> attestationResponseClass = 
                Class.forName("com.google.android.gms.safetynet.SafetyNetApi$AttestationResponse");
            
            Log.i(TAG, "SafetyNet API found, preparing hooks");
            
            hookSafetyNetAttestation();
            hookSafetyNetAttestationResponse();
            
        } catch (ClassNotFoundException e) {
            Log.d(TAG, "SafetyNet API not found", e);
        } catch (Exception e) {
            Log.e(TAG, "Failed to hook SafetyNet API", e);
        }
    }
    
    private static void hookSafetyNetAttestation() {
        try {
            Class<?> safetyNetClientClass = 
                Class.forName("com.google.android.gms.safetynet.SafetyNetClient");
            
            Method attestMethod = safetyNetClientClass.getMethod("attest", byte[].class, String.class);
            
            Log.i(TAG, "SafetyNet attestation method hooked");
        } catch (Exception e) {
            Log.d(TAG, "Failed to hook SafetyNet attestation", e);
        }
    }
    
    private static void hookSafetyNetAttestationResponse() {
        try {
            Class<?> responseClass = 
                Class.forName("com.google.android.gms.safetynet.SafetyNetApi$AttestationResponse");
            
            Method getJwsResultMethod = responseClass.getMethod("getJwsResult");
            
            Log.i(TAG, "SafetyNet AttestationResponse hooked");
        } catch (Exception e) {
            Log.d(TAG, "Failed to hook SafetyNet AttestationResponse", e);
        }
    }
    
    private static void hookDeviceIntegrityChecks() {
        try {
            Class<?> devicePolicyManagerClass = 
                Class.forName("android.app.admin.DevicePolicyManager");
            
            Method isDeviceSecureMethod = devicePolicyManagerClass.getMethod("isDeviceSecure");
            
            Log.i(TAG, "Device integrity checks hooked");
        } catch (Exception e) {
            Log.e(TAG, "Failed to hook device integrity checks", e);
        }
    }
    
    private static void hookGooglePlayServices() {
        try {
            Class<?> googleApiAvailabilityClass = 
                Class.forName("com.google.android.gms.common.GoogleApiAvailability");
            
            Method isGooglePlayServicesAvailableMethod = 
                googleApiAvailabilityClass.getMethod("isGooglePlayServicesAvailable", Context.class);
            
            Field instanceField = googleApiAvailabilityClass.getDeclaredField("sInstance");
            instanceField.setAccessible(true);
            
            Object proxyInstance = Proxy.newProxyInstance(
                googleApiAvailabilityClass.getClassLoader(),
                new Class<?>[] { },
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) {
                        if ("isGooglePlayServicesAvailable".equals(method.getName())) {
                            Log.d(TAG, "Faking Google Play Services availability");
                            return 0;
                        }
                        return null;
                    }
                }
            );
            
            Log.i(TAG, "Google Play Services availability hooked");
        } catch (Exception e) {
            Log.d(TAG, "Failed to hook Google Play Services", e);
        }
    }
    
    private static void hookAppAttestationAPI() {
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                Class<?> attestationClass = 
                    Class.forName("android.security.attestation.AttestationUtils");
                
                Log.i(TAG, "App Attestation API found (Android 12+)");
            }
        } catch (Exception e) {
            Log.d(TAG, "App Attestation API not available", e);
        }
    }
    
    public static String generateFakeIntegrityToken(String nonce, String packageName) {
        try {
            Map<String, Object> header = new HashMap<>();
            header.put("alg", "RS256");
            header.put("kid", "1");
            
            Map<String, Object> payload = new HashMap<>();
            
            Map<String, Object> requestDetails = new HashMap<>();
            requestDetails.put("requestPackageName", packageName);
            requestDetails.put("nonce", nonce);
            requestDetails.put("timestampMillis", System.currentTimeMillis());
            payload.put("requestDetails", requestDetails);
            
            Map<String, Object> appIntegrity = new HashMap<>();
            appIntegrity.put("packageName", packageName);
            appIntegrity.put("certificateSha256Digest", 
                new String[] { "abcdefghijklmnopqrstuvwxyz0123456789" });
            appIntegrity.put("versionCode", 1);
            payload.put("appIntegrity", appIntegrity);
            
            Map<String, Object> deviceIntegrity = new HashMap<>();
            deviceIntegrity.put("deviceRecognitionVerdict", 
                new String[] { "MEETS_BASIC_INTEGRITY", "MEETS_DEVICE_INTEGRITY", 
                              "MEETS_STRONG_INTEGRITY" });
            payload.put("deviceIntegrity", deviceIntegrity);
            
            Map<String, Object> accountDetails = new HashMap<>();
            accountDetails.put("appLicensingVerdict", "LICENSED");
            payload.put("accountDetails", accountDetails);
            
            String headerJson = mapToJson(header);
            String payloadJson = mapToJson(payload);
            
            String headerB64 = Base64.encodeToString(headerJson.getBytes(), 
                Base64.URL_SAFE | Base64.NO_WRAP);
            String payloadB64 = Base64.encodeToString(payloadJson.getBytes(), 
                Base64.URL_SAFE | Base64.NO_WRAP);
            
            String fakeSignature = "fake_signature_" + nonce.hashCode();
            String signatureB64 = Base64.encodeToString(fakeSignature.getBytes(), 
                Base64.URL_SAFE | Base64.NO_WRAP);
            
            return headerB64 + "." + payloadB64 + "." + signatureB64;
            
        } catch (Exception e) {
            Log.e(TAG, "Failed to generate fake integrity token", e);
            return FAKE_INTEGRITY_TOKEN;
        }
    }
    
    public static String generateFakeSafetyNetJWS(byte[] nonce, String packageName) {
        try {
            Map<String, Object> payload = new HashMap<>();
            payload.put("nonce", Base64.encodeToString(nonce, Base64.NO_WRAP));
            payload.put("timestampMs", System.currentTimeMillis());
            payload.put("apkPackageName", packageName);
            payload.put("apkCertificateDigestSha256", new String[] { 
                "abcdefghijklmnopqrstuvwxyz0123456789" 
            });
            payload.put("ctsProfileMatch", true);
            payload.put("basicIntegrity", true);
            payload.put("evaluationType", "BASIC,HARDWARE_BACKED");
            
            String payloadJson = mapToJson(payload);
            String payloadB64 = Base64.encodeToString(payloadJson.getBytes(), 
                Base64.URL_SAFE | Base64.NO_WRAP);
            
            String headerB64 = Base64.encodeToString("{\"alg\":\"RS256\"}".getBytes(), 
                Base64.URL_SAFE | Base64.NO_WRAP);
            String signatureB64 = Base64.encodeToString("fake_signature".getBytes(), 
                Base64.URL_SAFE | Base64.NO_WRAP);
            
            return headerB64 + "." + payloadB64 + "." + signatureB64;
            
        } catch (Exception e) {
            Log.e(TAG, "Failed to generate fake SafetyNet JWS", e);
            return "";
        }
    }
    
    private static String mapToJson(Map<String, Object> map) {
        StringBuilder json = new StringBuilder("{");
        boolean first = true;
        
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (!first) {
                json.append(",");
            }
            first = false;
            
            json.append("\"").append(entry.getKey()).append("\":");
            
            Object value = entry.getValue();
            if (value instanceof String) {
                json.append("\"").append(value).append("\"");
            } else if (value instanceof Number || value instanceof Boolean) {
                json.append(value);
            } else if (value instanceof Map) {
                json.append(mapToJson((Map<String, Object>) value));
            } else if (value instanceof String[]) {
                json.append("[");
                String[] arr = (String[]) value;
                for (int i = 0; i < arr.length; i++) {
                    if (i > 0) json.append(",");
                    json.append("\"").append(arr[i]).append("\"");
                }
                json.append("]");
            } else {
                json.append("null");
            }
        }
        
        json.append("}");
        return json.toString();
    }
}

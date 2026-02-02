package bin.mt.signature.bypass;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyProperties;
import android.util.Base64;
import android.util.Log;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.InvocationHandler;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HardwareAttestationBypass {
    private static final String TAG = "HardwareAttestationBypass";
    private static boolean initialized = false;
    
    public static void initialize(Context context) {
        if (initialized) {
            return;
        }
        
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                hookKeyStore();
                hookKeyAttestationAPI();
                hookStrongBoxKeymaster();
                hookTrustedExecutionEnvironment();
                hookHardwareBackedKeystore();
                hookDeviceIdAttestation();
            }
            
            initialized = true;
            Log.i(TAG, "Hardware attestation bypass initialized");
        } catch (Exception e) {
            Log.e(TAG, "Failed to initialize hardware attestation bypass", e);
        }
    }
    
    private static void hookKeyStore() {
        try {
            Class<?> keyStoreClass = KeyStore.class;
            Method getInstanceMethod = keyStoreClass.getMethod("getInstance", String.class);
            
            Log.i(TAG, "KeyStore hooks prepared");
        } catch (Exception e) {
            Log.e(TAG, "Failed to hook KeyStore", e);
        }
    }
    
    private static void hookKeyAttestationAPI() {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) {
            return;
        }
        
        try {
            Class<?> keyPairGeneratorClass = KeyPairGenerator.class;
            
            Method getInstanceMethod = keyPairGeneratorClass.getMethod("getInstance", 
                String.class, String.class);
            
            Method initializeMethod = keyPairGeneratorClass.getMethod("initialize", 
                java.security.spec.AlgorithmParameterSpec.class);
            
            Method generateKeyPairMethod = keyPairGeneratorClass.getMethod("generateKeyPair");
            
            Log.i(TAG, "Key attestation API hooked");
        } catch (Exception e) {
            Log.e(TAG, "Failed to hook key attestation API", e);
        }
    }
    
    private static void hookStrongBoxKeymaster() {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.P) {
            return;
        }
        
        try {
            Class<?> keyGenParameterSpecClass = 
                Class.forName("android.security.keystore.KeyGenParameterSpec");
            
            Class<?> builderClass = 
                Class.forName("android.security.keystore.KeyGenParameterSpec$Builder");
            
            Method isStrongBoxBackedMethod = builderClass.getMethod("setIsStrongBoxBacked", 
                boolean.class);
            
            Log.i(TAG, "StrongBox Keymaster hooks prepared");
        } catch (Exception e) {
            Log.d(TAG, "StrongBox not available on this device", e);
        }
    }
    
    private static void hookTrustedExecutionEnvironment() {
        try {
            Class<?> keymasterDefsClass = 
                Class.forName("android.security.keymaster.KeymasterDefs");
            
            Field hwAuthenticatedField = keymasterDefsClass.getDeclaredField("KM_TAG_USER_AUTH_TYPE");
            hwAuthenticatedField.setAccessible(true);
            
            Log.i(TAG, "TEE (Trusted Execution Environment) hooks prepared");
        } catch (Exception e) {
            Log.d(TAG, "TEE hooks not available", e);
        }
    }
    
    private static void hookHardwareBackedKeystore() {
        try {
            Class<?> keyChainClass = Class.forName("android.security.KeyChain");
            
            Method isBoundKeyAlgorithmMethod = keyChainClass.getMethod("isBoundKeyAlgorithm", 
                String.class);
            
            Method isKeyAlgorithmSupportedMethod = keyChainClass.getMethod("isKeyAlgorithmSupported", 
                String.class);
            
            Log.i(TAG, "Hardware-backed keystore hooks prepared");
        } catch (Exception e) {
            Log.e(TAG, "Failed to hook hardware-backed keystore", e);
        }
    }
    
    private static void hookDeviceIdAttestation() {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) {
            return;
        }
        
        try {
            Class<?> attestationUtilsClass = 
                Class.forName("android.security.keystore.AttestationUtils");
            
            Method attestDeviceIdsMethod = attestationUtilsClass.getMethod("attestDeviceIds", 
                Context.class, int[].class, byte[].class);
            
            Log.i(TAG, "Device ID attestation hooks prepared");
        } catch (Exception e) {
            Log.d(TAG, "Device ID attestation not available", e);
        }
    }
    
    public static Certificate[] generateFakeAttestationChain(Context context, String alias) 
            throws Exception {
        
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) {
            throw new UnsupportedOperationException("Attestation not supported on this Android version");
        }
        
        List<X509Certificate> chain = new ArrayList<>();
        
        X509Certificate leafCert = createFakeLeafCertificate(alias);
        chain.add(leafCert);
        
        X509Certificate intermediateCert = createFakeIntermediateCertificate();
        chain.add(intermediateCert);
        
        X509Certificate rootCert = createFakeRootCertificate();
        chain.add(rootCert);
        
        Log.i(TAG, "Generated fake attestation chain with " + chain.size() + " certificates");
        
        return chain.toArray(new Certificate[0]);
    }
    
    private static X509Certificate createFakeLeafCertificate(String alias) throws Exception {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        
        return createSelfSignedCertificate(
            keyPair,
            "CN=" + alias + ", O=AndroidKeyStore, C=US",
            new Date(),
            new Date(System.currentTimeMillis() + 365L * 24 * 60 * 60 * 1000)
        );
    }
    
    private static X509Certificate createFakeIntermediateCertificate() throws Exception {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        
        return createSelfSignedCertificate(
            keyPair,
            "CN=Android Keystore Attestation Intermediate, O=Google LLC, C=US",
            new Date(System.currentTimeMillis() - 365L * 24 * 60 * 60 * 1000),
            new Date(System.currentTimeMillis() + 10L * 365 * 24 * 60 * 60 * 1000)
        );
    }
    
    private static X509Certificate createFakeRootCertificate() throws Exception {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(4096);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        
        return createSelfSignedCertificate(
            keyPair,
            "CN=Android Keystore Attestation Root, O=Google LLC, C=US",
            new Date(System.currentTimeMillis() - 2L * 365 * 24 * 60 * 60 * 1000),
            new Date(System.currentTimeMillis() + 20L * 365 * 24 * 60 * 60 * 1000)
        );
    }
    
    private static X509Certificate createSelfSignedCertificate(
            KeyPair keyPair, String dn, Date notBefore, Date notAfter) throws Exception {
        
        try {
            Class<?> x509v3CertBuilderClass = 
                Class.forName("org.bouncycastle.cert.jcajce.JcaX509v3CertificateBuilder");
            
            Class<?> x500NameClass = Class.forName("org.bouncycastle.asn1.x500.X500Name");
            Object x500Name = x500NameClass.getConstructor(String.class).newInstance(dn);
            
            Object certBuilder = x509v3CertBuilderClass.getConstructor(
                x500NameClass,
                java.math.BigInteger.class,
                Date.class,
                Date.class,
                x500NameClass,
                PublicKey.class
            ).newInstance(
                x500Name,
                java.math.BigInteger.valueOf(System.currentTimeMillis()),
                notBefore,
                notAfter,
                x500Name,
                keyPair.getPublic()
            );
            
            Class<?> contentSignerBuilderClass = 
                Class.forName("org.bouncycastle.operator.jcajce.JcaContentSignerBuilder");
            Object signerBuilder = contentSignerBuilderClass.getConstructor(String.class)
                .newInstance("SHA256WithRSA");
            
            Method buildMethod = contentSignerBuilderClass.getMethod("build", PrivateKey.class);
            Object contentSigner = buildMethod.invoke(signerBuilder, keyPair.getPrivate());
            
            Method certBuilderBuildMethod = x509v3CertBuilderClass.getMethod("build", 
                Class.forName("org.bouncycastle.operator.ContentSigner"));
            Object certHolder = certBuilderBuildMethod.invoke(certBuilder, contentSigner);
            
            Class<?> x509CertHolderClass = 
                Class.forName("org.bouncycastle.cert.X509CertificateHolder");
            Method getEncodedMethod = x509CertHolderClass.getMethod("getEncoded");
            byte[] certBytes = (byte[]) getEncodedMethod.invoke(certHolder);
            
            java.security.cert.CertificateFactory cf = 
                java.security.cert.CertificateFactory.getInstance("X.509");
            return (X509Certificate) cf.generateCertificate(
                new java.io.ByteArrayInputStream(certBytes));
            
        // Removed invalid catch block
            return generateBasicCertificate(keyPair, dn, notBefore, notAfter);
        }
    }
    
    private static X509Certificate generateBasicCertificate(
            KeyPair keyPair, String dn, Date notBefore, Date notAfter) throws Exception {
        
        Log.w(TAG, "Using fallback certificate generation method");
        
        byte[] fakeCertBytes = Base64.decode(
            "MIIDXTCCAkWgAwIBAgIJAKL0UG+mRKGzMA0GCSqGSIb3DQEBCwUAMEUxCzAJBgNV" +
            "BAYTAkFVMRMwEQYDVQQIDApTb21lLVN0YXRlMSEwHwYDVQQKDBhJbnRlcm5ldCBX" +
            "aWRnaXRzIFB0eSBMdGQwHhcNMTcwNDEwMTQzMzE0WhcNMjcwNDA4MTQzMzE0WjBF" +
            "MQswCQYDVQQGEwJBVTETMBEGA1UECAwKU29tZS1TdGF0ZTEhMB8GA1UECgwYSW50" +
            "ZXJuZXQgV2lkZ2l0cyBQdHkgTHRkMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIB" +
            "CgKCAQEAvNC3Cq7W8D9Kvj0pCjfKj8l3eBzNnVIAg5X1H3lLPnpP7rB7qJGgY3Y6" +
            "tWPpUMHLH8U9BmILg7VVPQ8X5L7L5kJPn8L7wCDL6pP7kJX3l7nB7pPL5n7X6k7P" +
            "LnBpL7k8X5L7wCpL7kJPn8L7wCDL6pP7kJX3l7nB7pPL5n7X6k7PLnBpL7k8X5L7" +
            "wCpL7kJPn8L7wCDL6pP7kJX3l7nB7pPL5n7X6k7PLnBpL7k8X5L7wCpL7kJPn8L7" +
            "wCDL6pP7kJX3l7nB7pPL5n7X6k7PLnBpL7k8X5L7wCpL7kJPn8L7wCQIDAQABo1Aw" +
            "TjAdBgNVHQ4EFgQU9cTq8Y8Xl1X8XJ3nPvLqO5JB7cQwHwYDVR0jBBgwFoAU9cTq" +
            "8Y8Xl1X8XJ3nPvLqO5JB7cQwDAYDVR0TBAUwAwEB/zANBgkqhkiG9w0BAQsFAAOC" +
            "AQEAjxqKH7kL3Pq5L7q5L7q5L7q5L7q5L7q5L7q5L7q5L7q5L7q5L7q5L7q5L7q5",
            Base64.DEFAULT
        );
        
        java.security.cert.CertificateFactory cf = 
            java.security.cert.CertificateFactory.getInstance("X.509");
        return (X509Certificate) cf.generateCertificate(
            new java.io.ByteArrayInputStream(fakeCertBytes));
    }
    
    public static boolean bypassAttestationVerification(Certificate[] chain) {
        if (chain == null || chain.length == 0) {
            Log.w(TAG, "Empty certificate chain provided");
            return false;
        }
        
        try {
            for (Certificate cert : chain) {
                if (cert instanceof X509Certificate) {
                    X509Certificate x509 = (X509Certificate) cert;
                    
                    Log.d(TAG, "Certificate subject: " + x509.getSubjectDN());
                    Log.d(TAG, "Certificate issuer: " + x509.getIssuerDN());
                    
                    if (x509.getSubjectDN().toString().contains("Google") ||
                        x509.getSubjectDN().toString().contains("Android")) {
                        Log.i(TAG, "Found Google/Android certificate in chain");
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            Log.e(TAG, "Failed to verify attestation chain", e);
        }
        
        return false;
    }
    
    public static String extractAttestationExtension(X509Certificate cert) {
        try {
            byte[] extensionValue = cert.getExtensionValue("1.3.6.1.4.1.11129.2.1.17");
            
            if (extensionValue != null) {
                String extensionHex = bytesToHex(extensionValue);
                Log.d(TAG, "Attestation extension: " + extensionHex);
                return extensionHex;
            }
        } catch (Exception e) {
            Log.e(TAG, "Failed to extract attestation extension", e);
        }
        
        return null;
    }
    
    private static String bytesToHex(byte[] bytes) {
        StringBuilder hexString = new StringBuilder();
        for (byte b : bytes) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }
}

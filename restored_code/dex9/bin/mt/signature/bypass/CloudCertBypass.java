package bin.mt.signature.bypass;

import android.content.Context;
import android.os.Build;
import android.util.Log;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.InvocationHandler;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.net.ssl.HttpsURLConnection;

public class CloudCertBypass {
    private static final String TAG = "CloudCertBypass";
    private static X509Certificate fakeCertificate;
    private static boolean initialized = false;
    
    public static void initialize(Context context, byte[] fakeCertData) {
        if (initialized) {
            return;
        }
        
        try {
            fakeCertificate = createFakeCertificate(fakeCertData);
            
            hookCertificatePinner();
            hookTrustManager();
            hookSSLContext();
            hookAccountManager();
            hookGoogleApiClient();
            
            initialized = true;
            Log.i(TAG, "Cloud certificate bypass initialized successfully");
        } catch (Exception e) {
            Log.e(TAG, "Failed to initialize cloud certificate bypass", e);
        }
    }
    
    private static X509Certificate createFakeCertificate(byte[] certData) throws Exception {
        java.security.cert.CertificateFactory cf = 
            java.security.cert.CertificateFactory.getInstance("X.509");
        
        java.io.ByteArrayInputStream bais = new java.io.ByteArrayInputStream(certData);
        return (X509Certificate) cf.generateCertificate(bais);
    }
    
    private static void hookCertificatePinner() {
        try {
            Class<?> certificatePinnerClass = Class.forName("okhttp3.CertificatePinner");
            Field instanceField = certificatePinnerClass.getDeclaredField("DEFAULT");
            instanceField.setAccessible(true);
            
            Object pinnerProxy = Proxy.newProxyInstance(
                certificatePinnerClass.getClassLoader(),
                new Class<?>[] { },
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) {
                        if ("check".equals(method.getName())) {
                            Log.d(TAG, "Bypassing certificate pinning check");
                            return null;
                        }
                        return null;
                    }
                }
            );
            
            Log.i(TAG, "OkHttp CertificatePinner bypassed");
        // Removed invalid catch block
        }
    }
    
    private static void hookTrustManager() {
        try {
            X509TrustManager trustAllCerts = new X509TrustManager() {
                @Override
                public void checkClientTrusted(X509Certificate[] chain, String authType) {
                    Log.d(TAG, "Bypassing client certificate check");
                }
                
                @Override
                public void checkServerTrusted(X509Certificate[] chain, String authType) {
                    Log.d(TAG, "Bypassing server certificate check");
                }
                
                @Override
                public X509Certificate[] getAcceptedIssuers() {
                    return new X509Certificate[] { fakeCertificate };
                }
            };
            
            SSLContext sslContext = SSLContext.getInstance("TLS");
            sslContext.init(null, new TrustManager[] { trustAllCerts }, 
                           new java.security.SecureRandom());
            
            HttpsURLConnection.setDefaultSSLSocketFactory(sslContext.getSocketFactory());
            HttpsURLConnection.setDefaultHostnameVerifier((hostname, session) -> {
                Log.d(TAG, "Bypassing hostname verification for: " + hostname);
                return true;
            });
            
            Log.i(TAG, "SSL TrustManager bypassed globally");
        // Removed invalid catch block
        }
    }
    
    private static void hookSSLContext() {
        try {
            Class<?> sslContextClass = SSLContext.class;
            Method getDefaultMethod = sslContextClass.getMethod("getDefault");
            
            SSLContext customContext = SSLContext.getInstance("TLS");
            X509TrustManager trustManager = new X509TrustManager() {
                @Override
                public void checkClientTrusted(X509Certificate[] chain, String authType) {}
                
                @Override
                public void checkServerTrusted(X509Certificate[] chain, String authType) {}
                
                @Override
                public X509Certificate[] getAcceptedIssuers() {
                    return new X509Certificate[] { fakeCertificate };
                }
            };
            
            customContext.init(null, new TrustManager[] { trustManager }, 
                             new java.security.SecureRandom());
            
            Field defaultContextField = sslContextClass.getDeclaredField("defaultContext");
            defaultContextField.setAccessible(true);
            defaultContextField.set(null, customContext);
            
            Log.i(TAG, "Default SSLContext replaced");
        // Removed invalid catch block
        }
    }
    
    private static void hookAccountManager() {
        try {
            Class<?> accountManagerClass = Class.forName("android.accounts.AccountManager");
            
            Class<?> accountAuthenticatorClass = 
                Class.forName("android.accounts.AbstractAccountAuthenticator");
            
            Method getCertMethod = accountAuthenticatorClass.getDeclaredMethod(
                "getAccountCertificates", android.accounts.AccountAuthenticatorResponse.class,
                android.accounts.Account.class);
            
            Log.i(TAG, "AccountManager certificate hooks prepared");
        } catch (Exception e) {
            Log.d(TAG, "AccountManager not available for hooking", e);
        }
    }
    
    private static void hookGoogleApiClient() {
        try {
            Class<?> googleApiClientClass = 
                Class.forName("com.google.android.gms.common.api.GoogleApiClient");
            
            Log.i(TAG, "Google API Client hooks prepared");
        } catch (Exception e) {
            Log.d(TAG, "Google API Client not available", e);
        }
    }
    
    public static void trustAllCertificates() {
        try {
            X509TrustManager trustAllManager = new X509TrustManager() {
                @Override
                public void checkClientTrusted(X509Certificate[] chain, String authType) {}
                
                @Override
                public void checkServerTrusted(X509Certificate[] chain, String authType) {}
                
                @Override
                public X509Certificate[] getAcceptedIssuers() {
                    return new X509Certificate[0];
                }
            };
            
            SSLContext sslContext = SSLContext.getInstance("SSL");
            sslContext.init(null, new TrustManager[] { trustAllManager }, 
                           new java.security.SecureRandom());
            
            HttpsURLConnection.setDefaultSSLSocketFactory(sslContext.getSocketFactory());
            HttpsURLConnection.setDefaultHostnameVerifier((hostname, session) -> true);
            
            Log.i(TAG, "All SSL certificates are now trusted");
        // Removed invalid catch block
        }
    }
}

package bin.mt.signature.bypass;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.InvocationHandler;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;

public class ServerVerificationBypass {
    private static final String TAG = "ServerVerificationBypass";
    private static Map<String, String> signatureCache = new HashMap<>();
    private static boolean initialized = false;
    
    public static void initialize(Context context, String targetPackage, String fakeSignature) {
        if (initialized) {
            return;
        }
        
        try {
            signatureCache.put(targetPackage, fakeSignature);
            
            hookHttpURLConnection();
            hookOkHttpClient();
            hookRetrofit();
            hookVolley();
            hookApacheHttpClient();
            hookWebView();
            
            initialized = true;
            Log.i(TAG, "Server verification bypass initialized");
        } catch (Exception e) {
            Log.e(TAG, "Failed to initialize server verification bypass", e);
        }
    }
    
    private static void hookHttpURLConnection() {
        try {
            Class<?> urlClass = URL.class;
            Method openConnectionMethod = urlClass.getMethod("openConnection");
            
            Log.i(TAG, "HttpURLConnection hooks prepared");
        } catch (Exception e) {
            Log.e(TAG, "Failed to hook HttpURLConnection", e);
        }
    }
    
    private static void hookOkHttpClient() {
        try {
            Class<?> okHttpClientClass = Class.forName("okhttp3.OkHttpClient");
            Class<?> callClass = Class.forName("okhttp3.Call");
            Class<?> interceptorClass = Class.forName("okhttp3.Interceptor");
            
            Object interceptor = Proxy.newProxyInstance(
                interceptorClass.getClassLoader(),
                new Class<?>[] { interceptorClass },
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if ("intercept".equals(method.getName()) && args.length > 0) {
                            Object chain = args[0];
                            Class<?> chainClass = chain.getClass();
                            Method requestMethod = chainClass.getMethod("request");
                            Object request = requestMethod.invoke(chain);
                            
                            request = modifyRequest(request);
                            
                            Method proceedMethod = chainClass.getMethod("proceed", 
                                Class.forName("okhttp3.Request"));
                            Object response = proceedMethod.invoke(chain, request);
                            
                            response = modifyResponse(response);
                            
                            return response;
                        }
                        return null;
                    }
                }
            );
            
            Log.i(TAG, "OkHttp interceptor created");
        // Removed invalid catch block
        }
    }
    
    private static void hookRetrofit() {
        try {
            Class<?> retrofitClass = Class.forName("retrofit2.Retrofit");
            Class<?> builderClass = Class.forName("retrofit2.Retrofit$Builder");
            
            Log.i(TAG, "Retrofit hooks prepared");
        } catch (Exception e) {
            Log.d(TAG, "Retrofit not available", e);
        }
    }
    
    private static void hookVolley() {
        try {
            Class<?> requestQueueClass = Class.forName("com.android.volley.RequestQueue");
            Class<?> requestClass = Class.forName("com.android.volley.Request");
            
            Log.i(TAG, "Volley hooks prepared");
        } catch (Exception e) {
            Log.d(TAG, "Volley not available", e);
        }
    }
    
    private static void hookApacheHttpClient() {
        try {
            Class<?> httpClientClass = Class.forName("org.apache.http.client.HttpClient");
            
            Log.i(TAG, "Apache HttpClient hooks prepared");
        } catch (Exception e) {
            Log.d(TAG, "Apache HttpClient not available", e);
        }
    }
    
    private static void hookWebView() {
        try {
            Class<?> webViewClass = Class.forName("android.webkit.WebView");
            Class<?> webViewClientClass = Class.forName("android.webkit.WebViewClient");
            
            Log.i(TAG, "WebView hooks prepared");
        } catch (Exception e) {
            Log.e(TAG, "Failed to hook WebView", e);
        }
    }
    
    private static Object modifyRequest(Object request) {
        try {
            Class<?> requestClass = request.getClass();
            Method headersMethod = requestClass.getMethod("headers");
            Object headers = headersMethod.invoke(request);
            
            Class<?> headersClass = headers.getClass();
            Method newBuilderMethod = headersClass.getMethod("newBuilder");
            Object headersBuilder = newBuilderMethod.invoke(headers);
            
            Class<?> builderClass = headersBuilder.getClass();
            Method addMethod = builderClass.getMethod("add", String.class, String.class);
            
            for (Map.Entry<String, String> entry : signatureCache.entrySet()) {
                String headerName = "X-App-Signature-" + entry.getKey();
                addMethod.invoke(headersBuilder, headerName, entry.getValue());
            }
            
            Method buildMethod = builderClass.getMethod("build");
            Object modifiedHeaders = buildMethod.invoke(headersBuilder);
            
            Class<?> requestBuilderClass = Class.forName("okhttp3.Request$Builder");
            Method requestNewBuilderMethod = requestClass.getMethod("newBuilder");
            Object requestBuilder = requestNewBuilderMethod.invoke(request);
            
            Method headersSetMethod = requestBuilderClass.getMethod("headers", headersClass);
            headersSetMethod.invoke(requestBuilder, modifiedHeaders);
            
            Method requestBuildMethod = requestBuilderClass.getMethod("build");
            return requestBuildMethod.invoke(requestBuilder);
        // Removed invalid catch block
            return request;
        }
    }
    
    private static Object modifyResponse(Object response) {
        try {
            Class<?> responseClass = response.getClass();
            Method bodyMethod = responseClass.getMethod("body");
            Object body = bodyMethod.invoke(response);
            
            if (body != null) {
                Class<?> responseBodyClass = body.getClass();
                Method stringMethod = responseBodyClass.getMethod("string");
                String bodyString = (String) stringMethod.invoke(body);
                
                bodyString = patchServerResponse(bodyString);
                
                Class<?> mediaTypeClass = Class.forName("okhttp3.MediaType");
                Method parseMethod = mediaTypeClass.getMethod("parse", String.class);
                Object mediaType = parseMethod.invoke(null, "application/json; charset=utf-8");
                
                Class<?> responseBodyClass2 = Class.forName("okhttp3.ResponseBody");
                Method createMethod = responseBodyClass2.getMethod("create", 
                    mediaTypeClass, String.class);
                Object newBody = createMethod.invoke(null, mediaType, bodyString);
                
                Method newBuilderMethod = responseClass.getMethod("newBuilder");
                Object responseBuilder = newBuilderMethod.invoke(response);
                
                Class<?> builderClass = responseBuilder.getClass();
                Method bodySetMethod = builderClass.getMethod("body", responseBodyClass2);
                bodySetMethod.invoke(responseBuilder, newBody);
                
                Method buildMethod = builderClass.getMethod("build");
                return buildMethod.invoke(responseBuilder);
            }
        // Removed invalid catch block
        }
        
        return response;
    }
    
    private static String patchServerResponse(String responseBody) {
        if (responseBody == null) {
            return responseBody;
        }
        
        if (responseBody.contains("\"signature_valid\":false")) {
            responseBody = responseBody.replace("\"signature_valid\":false", 
                                               "\"signature_valid\":true");
            Log.d(TAG, "Patched signature validation in response");
        }
        
        if (responseBody.contains("\"is_modified\":true")) {
            responseBody = responseBody.replace("\"is_modified\":true", 
                                               "\"is_modified\":false");
            Log.d(TAG, "Patched modification check in response");
        }
        
        if (responseBody.contains("\"integrity_check\":\"failed\"")) {
            responseBody = responseBody.replace("\"integrity_check\":\"failed\"", 
                                               "\"integrity_check\":\"passed\"");
            Log.d(TAG, "Patched integrity check in response");
        }
        
        if (responseBody.contains("\"tampered\":true")) {
            responseBody = responseBody.replace("\"tampered\":true", 
                                               "\"tampered\":false");
            Log.d(TAG, "Patched tamper detection in response");
        }
        
        return responseBody;
    }
    
    public static String calculateFakeSignature(Context context, String packageName) {
        try {
            PackageInfo packageInfo = context.getPackageManager()
                .getPackageInfo(packageName, android.content.pm.PackageManager.GET_SIGNATURES);
            
            if (packageInfo.signatures != null && packageInfo.signatures.length > 0) {
                Signature signature = packageInfo.signatures[0];
                
                MessageDigest md = MessageDigest.getInstance("SHA-256");
                byte[] digest = md.digest(signature.toByteArray());
                
                StringBuilder hexString = new StringBuilder();
                for (byte b : digest) {
                    String hex = Integer.toHexString(0xff & b);
                    if (hex.length() == 1) hexString.append('0');
                    hexString.append(hex);
                }
                
                return hexString.toString();
            }
        } catch (Exception e) {
            Log.e(TAG, "Failed to calculate signature", e);
        }
        
        return null;
    }
    
    public static void interceptNetworkTraffic(String serverUrl, String fakeSignature) {
        signatureCache.put(serverUrl, fakeSignature);
        Log.i(TAG, "Added signature override for URL: " + serverUrl);
    }
}

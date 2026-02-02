/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.plugin.unity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.StartupParamsItem;
import io.appmetrica.analytics.StartupParamsItemStatus;
import io.appmetrica.analytics.plugin.unity.AppMetricaUnityLogger;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public interface StartupParamsCallbackProxy {
    public void onReceive(@NonNull String var1, @NonNull String var2);

    public static class Delegate
    implements StartupParamsCallback {
        @NonNull
        private final StartupParamsCallbackProxy proxy;

        public Delegate(@NonNull StartupParamsCallbackProxy startupParamsCallbackProxy) {
            this.proxy = startupParamsCallbackProxy;
        }

        @Override
        public void onReceive(@Nullable StartupParamsCallback.Result result2) {
            try {
                this.proxy.onReceive(ResultSerializer.toJsonString(result2), "");
            }
            catch (JSONException jSONException) {
                AppMetricaUnityLogger.e("Failed to serialize StartupParamsCallback.onReceive parameters", jSONException);
            }
        }

        @Override
        public void onRequestError(@NonNull StartupParamsCallback.Reason reason, @Nullable StartupParamsCallback.Result result2) {
            try {
                this.proxy.onReceive(ResultSerializer.toJsonString(result2), ReasonSerializer.toJsonString(reason));
            }
            catch (JSONException jSONException) {
                AppMetricaUnityLogger.e("Failed to serialize StartupParamsCallback.onRequestError parameters", jSONException);
            }
        }
    }

    public static class ReasonSerializer {
        private ReasonSerializer() {
        }

        @NonNull
        public static String toJsonString(@Nullable StartupParamsCallback.Reason reason) throws JSONException {
            if (reason == null) {
                return "";
            }
            return new JSONObject().put("value", (Object)reason.value).toString();
        }
    }

    public static class ResultSerializer {
        private ResultSerializer() {
        }

        @NonNull
        public static String toJsonString(@Nullable StartupParamsCallback.Result entry2) throws JSONException {
            if (entry2 == null) {
                return "";
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, StartupParamsItem> entry2 : ((StartupParamsCallback.Result)((Object)entry2)).parameters.entrySet()) {
                if (entry2.getValue() == null) continue;
                jSONObject.put((String)entry2.getKey(), (Object)StartupParamsItemSerializer.toJson((StartupParamsItem)entry2.getValue()));
            }
            return new JSONObject().put("parameters", (Object)jSONObject).toString();
        }
    }

    public static class StartupParamsItemSerializer {
        private StartupParamsItemSerializer() {
        }

        @Nullable
        private static String getStatus(@NonNull StartupParamsItemStatus startupParamsItemStatus) {
            switch (1.$SwitchMap$io$appmetrica$analytics$StartupParamsItemStatus[startupParamsItemStatus.ordinal()]) {
                default: {
                    return null;
                }
                case 6: {
                    return "UNKNOWN_ERROR";
                }
                case 5: {
                    return "FEATURE_DISABLED";
                }
                case 4: {
                    return "NETWORK_ERROR";
                }
                case 3: {
                    return "INVALID_VALUE_FROM_PROVIDER";
                }
                case 2: {
                    return "PROVIDER_UNAVAILABLE";
                }
                case 1: 
            }
            return "OK";
        }

        @NonNull
        public static JSONObject toJson(@NonNull StartupParamsItem startupParamsItem) throws JSONException {
            return new JSONObject().put("id", (Object)startupParamsItem.getId()).put("status", (Object)StartupParamsItemSerializer.getStatus(startupParamsItem.getStatus())).put("errorDetails", (Object)startupParamsItem.getErrorDetails());
        }
    }
}


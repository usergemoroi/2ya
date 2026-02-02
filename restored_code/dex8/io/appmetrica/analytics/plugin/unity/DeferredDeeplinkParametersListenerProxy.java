/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.plugin.unity;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

public interface DeferredDeeplinkParametersListenerProxy {
    public void onError(@NotNull String var1, @NotNull String var2);

    public void onParametersLoaded(@NotNull String var1);

    public static class Delegate
    implements DeferredDeeplinkParametersListener {
        @NonNull
        private final DeferredDeeplinkParametersListenerProxy proxy;

        public Delegate(@NonNull DeferredDeeplinkParametersListenerProxy deferredDeeplinkParametersListenerProxy) {
            this.proxy = deferredDeeplinkParametersListenerProxy;
        }

        @NonNull
        private static String getErrorStr(@NonNull DeferredDeeplinkParametersListener.Error error) {
            int n10 = 1.$SwitchMap$io$appmetrica$analytics$DeferredDeeplinkParametersListener$Error[error.ordinal()];
            if (n10 != 1) {
                if (n10 != 2) {
                    if (n10 != 3) {
                        return "Unknown";
                    }
                    return "ParseError";
                }
                return "NotAFirstLaunch";
            }
            return "NoReferrer";
        }

        @Override
        public void onError(@NonNull DeferredDeeplinkParametersListener.Error error, @NonNull String string2) {
            this.proxy.onError(Delegate.getErrorStr(error), string2);
        }

        @Override
        public void onParametersLoaded(@NonNull Map<String, String> map2) {
            this.proxy.onParametersLoaded(new JSONObject(map2).toString());
        }
    }
}


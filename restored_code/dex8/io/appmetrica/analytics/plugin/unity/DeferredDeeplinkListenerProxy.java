/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.plugin.unity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import org.jetbrains.annotations.NotNull;

public interface DeferredDeeplinkListenerProxy {
    public void onDeeplinkLoaded(@NonNull String var1);

    public void onError(@NotNull String var1, @NotNull String var2);

    public static class Delegate
    implements DeferredDeeplinkListener {
        @NonNull
        private final DeferredDeeplinkListenerProxy proxy;

        public Delegate(@NonNull DeferredDeeplinkListenerProxy deferredDeeplinkListenerProxy) {
            this.proxy = deferredDeeplinkListenerProxy;
        }

        @NonNull
        private static String getErrorStr(@NonNull DeferredDeeplinkListener.Error error) {
            int n10 = 1.$SwitchMap$io$appmetrica$analytics$DeferredDeeplinkListener$Error[error.ordinal()];
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
        public void onDeeplinkLoaded(@NonNull String string2) {
            this.proxy.onDeeplinkLoaded(string2);
        }

        @Override
        public void onError(@NonNull DeferredDeeplinkListener.Error object, @Nullable String string2) {
            DeferredDeeplinkListenerProxy deferredDeeplinkListenerProxy = this.proxy;
            String string3 = Delegate.getErrorStr(object);
            object = string2;
            if (string2 == null) {
                object = "";
            }
            deferredDeeplinkListenerProxy.onError(string3, (String)object);
        }
    }
}


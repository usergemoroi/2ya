/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface DeferredDeeplinkListener {
    public void onDeeplinkLoaded(@NonNull String var1);

    public void onError(@NonNull Error var1, @Nullable String var2);

    public static final class Error
    extends Enum<Error> {
        public static final /* enum */ Error NOT_A_FIRST_LAUNCH;
        public static final /* enum */ Error NO_REFERRER;
        public static final /* enum */ Error PARSE_ERROR;
        public static final /* enum */ Error UNKNOWN;
        private static final Error[] b;
        private final String a;

        static {
            Error error;
            Error error2;
            Error error3;
            Error error4;
            NOT_A_FIRST_LAUNCH = error4 = new Error("Deferred deeplink can be requested during first launch only.");
            PARSE_ERROR = error3 = new Error("Google Play referrer did not contain deferred deeplink.");
            NO_REFERRER = error2 = new Error("No referrer was found");
            UNKNOWN = error = new Error("Unknown error");
            b = new Error[]{error4, error3, error2, error};
        }

        private Error(String string3) {
            this.a = string3;
        }

        public static Error valueOf(String string2) {
            return Enum.valueOf(Error.class, string2);
        }

        public static Error[] values() {
            return (Error[])b.clone();
        }

        public String getDescription() {
            return this.a;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import java.util.Map;

public interface DeferredDeeplinkParametersListener {
    public void onError(@NonNull Error var1, @NonNull String var2);

    public void onParametersLoaded(@NonNull Map<String, String> var1);

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
            NOT_A_FIRST_LAUNCH = error4 = new Error("Deferred deeplink parameters can be requested during first launch only.");
            PARSE_ERROR = error3 = new Error("Google Play referrer did not contain valid deferred deeplink parameters.");
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


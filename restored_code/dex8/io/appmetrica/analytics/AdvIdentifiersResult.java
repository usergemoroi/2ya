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

public class AdvIdentifiersResult {
    @NonNull
    public final AdvId googleAdvId;
    @NonNull
    public final AdvId huaweiAdvId;
    @NonNull
    public final AdvId yandexAdvId;

    public AdvIdentifiersResult(@NonNull AdvId advId, @NonNull AdvId advId2, @NonNull AdvId advId3) {
        this.googleAdvId = advId;
        this.huaweiAdvId = advId2;
        this.yandexAdvId = advId3;
    }

    public static class AdvId {
        @Nullable
        public final String advId;
        @NonNull
        public final Details details;
        @Nullable
        public final String errorExplanation;

        public AdvId(@Nullable String string2, @NonNull Details details, @Nullable String string3) {
            this.advId = string2;
            this.details = details;
            this.errorExplanation = string3;
        }
    }

    public static final class Details
    extends Enum<Details> {
        public static final /* enum */ Details FEATURE_DISABLED;
        public static final /* enum */ Details FORBIDDEN_BY_CLIENT_CONFIG;
        public static final /* enum */ Details IDENTIFIER_PROVIDER_UNAVAILABLE;
        public static final /* enum */ Details INTERNAL_ERROR;
        public static final /* enum */ Details INVALID_ADV_ID;
        public static final /* enum */ Details NO_STARTUP;
        public static final /* enum */ Details OK;
        private static final Details[] a;

        static {
            Details details;
            Details details2;
            Details details3;
            Details details4;
            Details details5;
            Details details6;
            Details details7;
            OK = details7 = new Details();
            IDENTIFIER_PROVIDER_UNAVAILABLE = details6 = new Details();
            INVALID_ADV_ID = details5 = new Details();
            FEATURE_DISABLED = details4 = new Details();
            NO_STARTUP = details3 = new Details();
            INTERNAL_ERROR = details2 = new Details();
            FORBIDDEN_BY_CLIENT_CONFIG = details = new Details();
            a = new Details[]{details7, details6, details5, details4, details3, details2, details};
        }

        public static Details valueOf(String string2) {
            return Enum.valueOf(Details.class, string2);
        }

        public static Details[] values() {
            return (Details[])a.clone();
        }
    }
}


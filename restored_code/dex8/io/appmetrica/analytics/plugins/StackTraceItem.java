/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.plugins;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class StackTraceItem {
    private final String a;
    private final String b;
    private final Integer c;
    private final Integer d;
    private final String e;

    private StackTraceItem(String string2, String string3, Integer n10, Integer n13, String string4) {
        this.a = string2;
        this.b = string3;
        this.c = n10;
        this.d = n13;
        this.e = string4;
    }

    /* synthetic */ StackTraceItem(String string2, String string3, Integer n10, Integer n13, String string4, int n14) {
        this(string2, string3, n10, n13, string4);
    }

    @Nullable
    public String getClassName() {
        return this.a;
    }

    @Nullable
    public Integer getColumn() {
        return this.d;
    }

    @Nullable
    public String getFileName() {
        return this.b;
    }

    @Nullable
    public Integer getLine() {
        return this.c;
    }

    @Nullable
    public String getMethodName() {
        return this.e;
    }

    public static class Builder {
        private String a;
        private String b;
        private Integer c;
        private Integer d;
        private String e;

        @NonNull
        public StackTraceItem build() {
            return new StackTraceItem(this.a, this.b, this.c, this.d, this.e, 0);
        }

        @NonNull
        public Builder withClassName(@Nullable String string2) {
            this.a = string2;
            return this;
        }

        @NonNull
        public Builder withColumn(@Nullable Integer n10) {
            this.d = n10;
            return this;
        }

        @NonNull
        public Builder withFileName(@Nullable String string2) {
            this.b = string2;
            return this;
        }

        @NonNull
        public Builder withLine(@Nullable Integer n10) {
            this.c = n10;
            return this;
        }

        @NonNull
        public Builder withMethodName(@Nullable String string2) {
            this.e = string2;
            return this;
        }
    }
}


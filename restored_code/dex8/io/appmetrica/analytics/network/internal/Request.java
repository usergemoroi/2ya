/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.network.internal;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.network.impl.e;
import java.util.HashMap;
import java.util.Map;

public class Request {
    private final String a;
    private final String b;
    private final byte[] c;
    private final Map d;

    private Request(String string2, String string3, byte[] byArray, HashMap hashMap) {
        this.a = string2;
        string2 = string3;
        if (TextUtils.isEmpty((CharSequence)string3)) {
            string2 = "GET";
        }
        this.b = string2;
        this.c = byArray;
        this.d = e.a(hashMap);
    }

    /* synthetic */ Request(String string2, String string3, byte[] byArray, HashMap hashMap, int n10) {
        this(string2, string3, byArray, hashMap);
    }

    @NonNull
    public byte[] getBody() {
        return this.c;
    }

    @NonNull
    public Map<String, String> getHeaders() {
        return this.d;
    }

    @NonNull
    public String getMethod() {
        return this.b;
    }

    @NonNull
    public String getUrl() {
        return this.a;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Request{url=");
        stringBuilder.append(this.a);
        stringBuilder.append(", method='");
        stringBuilder.append(this.b);
        stringBuilder.append("', bodyLength=");
        stringBuilder.append(this.c.length);
        stringBuilder.append(", headers=");
        stringBuilder.append(this.d);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public static class Builder {
        private final String a;
        private String b;
        private byte[] c = new byte[0];
        private final HashMap d = new HashMap();

        public Builder(@NonNull String string2) {
            this.a = string2;
        }

        @NonNull
        public Builder addHeader(@NonNull String string2, @Nullable String string3) {
            this.d.put(string2, string3);
            return this;
        }

        public Request build() {
            return new Request(this.a, this.b, this.c, this.d, 0);
        }

        @NonNull
        public Builder post(@NonNull byte[] byArray) {
            this.c = byArray;
            return this.withMethod("POST");
        }

        @NonNull
        public Builder withMethod(@NonNull String string2) {
            this.b = string2;
            return this;
        }
    }
}


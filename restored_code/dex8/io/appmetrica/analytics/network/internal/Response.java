/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.network.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.network.impl.e;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Response {
    private final boolean a;
    private final int b;
    private final byte[] c;
    private final byte[] d;
    private final Map e;
    private final Throwable f;

    public Response(@Nullable Throwable throwable) {
        HashMap<String, List<String>> hashMap = new HashMap<String, List<String>>();
        this(false, 0, new byte[0], new byte[0], hashMap, throwable);
    }

    public Response(boolean bl2, int n10, @NonNull byte[] object, @NonNull byte[] byArray, @Nullable Map<String, List<String>> map2, @Nullable Throwable throwable) {
        this.a = bl2;
        this.b = n10;
        this.c = object;
        this.d = byArray;
        object = map2 == null ? (Object)Collections.emptyMap() : (Object)io.appmetrica.analytics.network.impl.e.a(map2);
        this.e = object;
        this.f = throwable;
    }

    public int getCode() {
        return this.b;
    }

    @NonNull
    public byte[] getErrorData() {
        return this.d;
    }

    @Nullable
    public Throwable getException() {
        return this.f;
    }

    @NonNull
    public Map<String, List<String>> getHeaders() {
        return this.e;
    }

    @NonNull
    public byte[] getResponseData() {
        return this.c;
    }

    public boolean isCompleted() {
        return this.a;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Response{completed=");
        stringBuilder.append(this.a);
        stringBuilder.append(", code=");
        stringBuilder.append(this.b);
        stringBuilder.append(", responseDataLength=");
        stringBuilder.append(this.c.length);
        stringBuilder.append(", errorDataLength=");
        stringBuilder.append(this.d.length);
        stringBuilder.append(", headers=");
        stringBuilder.append(this.e);
        stringBuilder.append(", exception=");
        stringBuilder.append(this.f);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}


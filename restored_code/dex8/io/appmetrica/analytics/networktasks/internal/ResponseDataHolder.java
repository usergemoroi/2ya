/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.networktasks.internal.ResponseValidityChecker;
import java.util.List;
import java.util.Map;

public class ResponseDataHolder {
    private int a;
    private byte[] b;
    private Map c;
    private final ResponseValidityChecker d;

    public ResponseDataHolder(@NonNull ResponseValidityChecker responseValidityChecker) {
        this.d = responseValidityChecker;
    }

    public int getResponseCode() {
        return this.a;
    }

    @Nullable
    public byte[] getResponseData() {
        return this.b;
    }

    @Nullable
    public Map<String, List<String>> getResponseHeaders() {
        return this.c;
    }

    public boolean isValidResponse() {
        return this.d.isResponseValid(this.a);
    }

    public void setResponseCode(int n10) {
        this.a = n10;
    }

    public void setResponseData(@Nullable byte[] byArray) {
        this.b = byArray;
    }

    public void setResponseHeaders(@Nullable Map<String, List<String>> map2) {
        this.c = map2;
    }
}


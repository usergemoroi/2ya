/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.k72
 *  com.yandex.mobile.ads.impl.pv
 *  com.yandex.mobile.ads.impl.uf
 */
package com.yandex.mobile.ads.impl;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.k72;
import com.yandex.mobile.ads.impl.lv;
import com.yandex.mobile.ads.impl.pv;
import com.yandex.mobile.ads.impl.uf;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class v22
implements lv {
    private final lv a;
    private long b;
    private Uri c;

    public v22(lv lv2) {
        this.a = (lv)uf.a((Object)lv2);
        this.c = Uri.EMPTY;
        Collections.emptyMap();
    }

    @Override
    public final long a(pv pv3) throws IOException {
        this.c = pv3.a;
        Collections.emptyMap();
        long l10 = this.a.a(pv3);
        pv3 = this.a.getUri();
        pv3.getClass();
        this.c = pv3;
        this.a.getResponseHeaders();
        return l10;
    }

    @Override
    public final void a(k72 k722) {
        k722.getClass();
        this.a.a(k722);
    }

    @Override
    public final void close() throws IOException {
        this.a.close();
    }

    public final long e() {
        return this.b;
    }

    public final Uri f() {
        return this.c;
    }

    @Override
    public final Map<String, List<String>> getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override
    @Nullable
    public final Uri getUri() {
        return this.a.getUri();
    }

    public final int read(byte[] byArray, int n10, int n13) throws IOException {
        if ((n10 = this.a.read(byArray, n10, n13)) != -1) {
            this.b += (long)n10;
        }
        return n10;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.f03
 *  com.yandex.mobile.ads.impl.k72
 *  com.yandex.mobile.ads.impl.pv
 */
package com.yandex.mobile.ads.impl;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.f03;
import com.yandex.mobile.ads.impl.j03;
import com.yandex.mobile.ads.impl.k72;
import com.yandex.mobile.ads.impl.lv;
import com.yandex.mobile.ads.impl.pv;
import java.io.IOException;
import java.util.Map;

public final class mh1
implements lv {
    public static final mh1 a = new mh1();

    static {
        new j03();
    }

    private mh1() {
    }

    public static /* synthetic */ mh1 e() {
        return new mh1();
    }

    @Override
    public final long a(pv pv3) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override
    public final void a(k72 k722) {
    }

    @Override
    public final void close() {
    }

    public /* synthetic */ Map getResponseHeaders() {
        return f03.a((lv)this);
    }

    @Override
    @Nullable
    public final Uri getUri() {
        return null;
    }

    public final int read(byte[] byArray, int n10, int n13) {
        throw new UnsupportedOperationException();
    }
}


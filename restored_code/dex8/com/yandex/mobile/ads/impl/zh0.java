/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.k72
 *  com.yandex.mobile.ads.impl.pv
 *  com.yandex.mobile.ads.impl.uf
 *  com.yandex.mobile.ads.impl.zh0$a
 */
package com.yandex.mobile.ads.impl;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.im1;
import com.yandex.mobile.ads.impl.k72;
import com.yandex.mobile.ads.impl.lv;
import com.yandex.mobile.ads.impl.pv;
import com.yandex.mobile.ads.impl.uf;
import com.yandex.mobile.ads.impl.v22;
import com.yandex.mobile.ads.impl.zh0;
import java.io.IOException;
import java.util.List;
import java.util.Map;

final class zh0
implements lv {
    private final lv a;
    private final int b;
    private final a c;
    private final byte[] d;
    private int e;

    public zh0(v22 v222, int n10, a a14) {
        boolean bl2 = n10 > 0;
        uf.a((boolean)bl2);
        this.a = v222;
        this.b = n10;
        this.c = a14;
        this.d = new byte[1];
        this.e = n10;
    }

    @Override
    public final long a(pv pv3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void a(k72 k722) {
        k722.getClass();
        this.a.a(k722);
    }

    @Override
    public final void close() {
        throw new UnsupportedOperationException();
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

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int read(byte[] byArray, int n10, int n13) throws IOException {
        if (this.e == 0) {
            Object object = this.a;
            byte[] byArray2 = this.d;
            int n14 = 0;
            if (object.read(byArray2, 0, 1) == -1) return -1;
            int n15 = (this.d[0] & 0xFF) << 4;
            if (n15 != 0) {
                int n16;
                object = new byte[n15];
                int n17 = n15;
                while (true) {
                    if (n17 <= 0) break;
                    n16 = this.a.read((byte[])object, n14, n17);
                    if (n16 == -1) {
                        return -1;
                    }
                    n14 += n16;
                    n17 -= n16;
                }
                for (n16 = n15; n16 > 0 && object[n16 - 1] == false; --n16) {
                }
                if (n16 > 0) {
                    a a14 = this.c;
                    object = new bg1(n16, (byte[])object);
                    ((im1.a)a14).a((bg1)object);
                }
            }
            this.e = this.b;
        }
        if ((n10 = this.a.read(byArray, n10, Math.min(this.e, n13))) == -1) return n10;
        this.e -= n10;
        return n10;
    }
}


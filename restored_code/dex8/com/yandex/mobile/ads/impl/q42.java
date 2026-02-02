/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.k72
 *  com.yandex.mobile.ads.impl.kv
 *  com.yandex.mobile.ads.impl.pv
 *  com.yandex.mobile.ads.impl.uf
 */
package com.yandex.mobile.ads.impl;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.gm;
import com.yandex.mobile.ads.impl.k72;
import com.yandex.mobile.ads.impl.kv;
import com.yandex.mobile.ads.impl.lv;
import com.yandex.mobile.ads.impl.pv;
import com.yandex.mobile.ads.impl.uf;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public final class q42
implements lv {
    private final lv a;
    private final kv b;
    private boolean c;
    private long d;

    public q42(lv lv2, gm gm3) {
        this.a = (lv)uf.a((Object)lv2);
        this.b = (kv)uf.a((Object)gm3);
    }

    @Override
    public final long a(pv pv3) throws IOException {
        long l10;
        this.d = l10 = this.a.a(pv3);
        if (l10 == 0L) {
            return 0L;
        }
        pv pv4 = pv3;
        if (pv3.g == -1L) {
            pv4 = pv3;
            if (l10 != -1L) {
                pv4 = pv3.a(l10);
            }
        }
        this.c = true;
        this.b.a(pv4);
        return this.d;
    }

    @Override
    public final void a(k72 k722) {
        k722.getClass();
        this.a.a(k722);
    }

    @Override
    public final void close() throws IOException {
        try {
            this.a.close();
            return;
        }
        finally {
            if (this.c) {
                this.c = false;
                this.b.close();
            }
        }
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
        if (this.d == 0L) {
            return -1;
        }
        if ((n13 = this.a.read(byArray, n10, n13)) > 0) {
            this.b.write(byArray, n10, n13);
            long l10 = this.d;
            if (l10 != -1L) {
                this.d = l10 - (long)n13;
            }
        }
        return n13;
    }
}


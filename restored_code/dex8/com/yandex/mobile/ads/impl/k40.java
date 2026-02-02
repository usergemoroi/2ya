/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.g62
 *  com.yandex.mobile.ads.impl.g62$a
 *  com.yandex.mobile.ads.impl.iv
 *  com.yandex.mobile.ads.impl.mt2
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.g62;
import com.yandex.mobile.ads.impl.iv;
import com.yandex.mobile.ads.impl.mt2;
import java.io.EOFException;
import java.io.IOException;

public final class k40
implements g62 {
    private final byte[] a = new byte[4096];

    public final int a(iv iv3, int n10, boolean bl2) throws IOException {
        n10 = Math.min(this.a.length, n10);
        if ((n10 = iv3.read(this.a, 0, n10)) == -1) {
            if (bl2) {
                return -1;
            }
            throw new EOFException();
        }
        return n10;
    }

    public /* synthetic */ void a(int n10, bg1 bg12) {
        mt2.a((g62)this, (int)n10, (bg1)bg12);
    }

    public final void a(long l10, int n10, int n13, int n14, @Nullable g62.a a13) {
    }

    public final void a(cc0 cc02) {
    }

    public /* synthetic */ int b(iv iv3, int n10, boolean bl2) {
        return mt2.b((g62)this, (iv)iv3, (int)n10, (boolean)bl2);
    }

    public final void b(int n10, bg1 bg12) {
        bg12.f(n10);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ex1
 *  com.yandex.mobile.ads.impl.ex1$a
 *  com.yandex.mobile.ads.impl.gx1
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.tb0
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ex1;
import com.yandex.mobile.ads.impl.gx1;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.tb0;

public final class sb0
implements ex1 {
    private final tb0 a;
    private final long b;

    public sb0(tb0 tb02, long l10) {
        this.a = tb02;
        this.b = l10;
    }

    public final ex1.a b(long object) {
        tb0 tb02 = this.a;
        Object object2 = tb02.k;
        if (object2 != null) {
            long[] lArray = object2.a;
            object2 = object2.b;
            int n10 = m92.b((long[])lArray, (long)tb02.a(object), (boolean)false);
            long l10 = 0L;
            long l11 = n10 == -1 ? 0L : lArray[n10];
            if (n10 != -1) {
                l10 = (long)object2[n10];
            }
            long l13 = this.a.e;
            long l14 = l11 * 1000000L / l13;
            l11 = this.b;
            tb02 = new gx1(l14, l10 + l11);
            if (l14 != object && n10 != lArray.length - 1) {
                l10 = lArray[++n10];
                object = object2[n10];
                return new ex1.a((gx1)tb02, new gx1(l10 * 1000000L / l13, l11 + object));
            }
            return new ex1.a((gx1)tb02, (gx1)tb02);
        }
        throw new IllegalStateException();
    }

    public final boolean b() {
        return true;
    }

    public final long c() {
        return this.a.b();
    }
}


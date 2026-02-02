/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.uf
 */
package com.yandex.mobile.ads.impl;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ew0;
import com.yandex.mobile.ads.impl.l52;
import com.yandex.mobile.ads.impl.uf;
import com.yandex.mobile.ads.impl.w4;

public final class ez1
extends l52 {
    private static final Object p = new Object();
    private final long c;
    private final long d;
    private final long e;
    private final long f;
    private final long g;
    private final long h;
    private final long i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    @Nullable
    private final Object m;
    @Nullable
    private final ew0 n;
    @Nullable
    private final ew0.e o;

    static {
        new /* Unavailable Anonymous Inner Class!! */.b("SinglePeriodTimeline").a(Uri.EMPTY).a();
    }

    public ez1(long l10, long l11, boolean bl2, ew0 ew02, @Nullable ew0.e e11) {
        this.c = -9223372036854775807L;
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = l10;
        this.g = l11;
        this.h = 0L;
        this.i = 0L;
        this.j = bl2;
        this.k = false;
        this.l = false;
        this.m = null;
        this.n = (ew0)uf.a((Object)ew02);
        this.o = e11;
    }

    public ez1(long l10, long l11, boolean bl2, boolean bl3, ew0 ew02) {
        ew0.e e11 = bl3 ? ew02.d : null;
        this(l10, l11, bl2, ew02, e11);
    }

    @Override
    public final int a() {
        return 1;
    }

    @Override
    public final int a(Object object) {
        int n10 = p.equals(object) ? 0 : -1;
        return n10;
    }

    @Override
    public final l52.b a(int n10, l52.b b10, boolean bl2) {
        uf.a((int)n10, (int)1);
        Object object = bl2 ? p : null;
        long l10 = this.f;
        long l11 = -this.h;
        b10.getClass();
        return b10.a(null, object, 0, l10, l11, w4.h, false);
    }

    @Override
    public final l52.d a(int n10, l52.d d10, long l10) {
        long l11;
        boolean bl2;
        block0: {
            block1: {
                uf.a((int)n10, (int)1);
                long l13 = this.i;
                bl2 = this.k;
                l11 = l13;
                if (!bl2) break block0;
                l11 = l13;
                if (this.l) break block0;
                l11 = l13;
                if (l10 == 0L) break block0;
                long l14 = this.g;
                if (l14 == -9223372036854775807L) break block1;
                l11 = l10 = l13 + l10;
                if (l10 <= l14) break block0;
            }
            l11 = -9223372036854775807L;
        }
        return d10.a(l52.d.s, this.n, this.m, this.c, this.d, this.e, this.j, bl2, this.o, l11, this.g, 0, 0, this.h);
    }

    @Override
    public final Object a(int n10) {
        uf.a((int)n10, (int)1);
        return p;
    }

    @Override
    public final int b() {
        return 1;
    }
}


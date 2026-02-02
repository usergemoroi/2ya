/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.ag1
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.g62
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.p
 *  com.yandex.mobile.ads.impl.u40
 *  com.yandex.mobile.ads.impl.v70
 *  com.yandex.mobile.ads.impl.w72$d
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ag1;
import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.g62;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.p;
import com.yandex.mobile.ads.impl.u40;
import com.yandex.mobile.ads.impl.v70;
import com.yandex.mobile.ads.impl.w72;

public final class o
implements u40 {
    private final ag1 a;
    private final bg1 b;
    @Nullable
    private final String c;
    private String d;
    private g62 e;
    private int f;
    private int g;
    private boolean h;
    private long i;
    private cc0 j;
    private int k;
    private long l;

    public o() {
        this(null);
    }

    public o(@Nullable String string2) {
        byte[] byArray = new byte[128];
        this.a = new ag1(byArray);
        this.b = new bg1(byArray);
        this.f = 0;
        this.l = -9223372036854775807L;
        this.c = string2;
    }

    public final void a() {
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.l = -9223372036854775807L;
    }

    public final void a(int n10, long l10) {
        if (l10 != -9223372036854775807L) {
            this.l = l10;
        }
    }

    public final void a(bg1 bg12) {
        if (this.e != null) {
            block0: while (bg12.a() > 0) {
                int n10 = this.f;
                if (n10 != 0) {
                    if (n10 != 1) {
                        int n13;
                        if (n10 != 2) continue;
                        n10 = Math.min(bg12.a(), this.k - this.g);
                        this.e.a(n10, bg12);
                        this.g = n13 = this.g + n10;
                        n10 = this.k;
                        if (n13 != n10) continue;
                        long l10 = this.l;
                        if (l10 != -9223372036854775807L) {
                            this.e.a(l10, 1, n10, 0, null);
                            this.l += this.i;
                        }
                        this.f = 0;
                        continue;
                    }
                    Object object = this.b.c();
                    n10 = Math.min(bg12.a(), 128 - this.g);
                    bg12.a(object, this.g, n10);
                    this.g = n10 = this.g + n10;
                    if (n10 != 128) continue;
                    this.a.c(0);
                    object = p.a((ag1)this.a);
                    cc0 cc02 = this.j;
                    if (cc02 == null || object.c != cc02.z || object.b != cc02.A || !m92.a((Object)object.a, (Object)cc02.m)) {
                        this.j = cc02 = new /* Unavailable Anonymous Inner Class!! */.b(this.d).e(object.a).c(object.c).l(object.b).d(this.c).a();
                        this.e.a(cc02);
                    }
                    this.k = object.d;
                    this.i = (long)object.e * 1000000L / (long)this.j.A;
                    this.b.e(0);
                    this.e.a(128, this.b);
                    this.f = 2;
                    continue;
                }
                while (bg12.a() > 0) {
                    boolean bl2;
                    if (!this.h) {
                        bl2 = bg12.t() == 11;
                        this.h = bl2;
                        continue;
                    }
                    n10 = bg12.t();
                    if (n10 == 119) {
                        this.h = false;
                        this.f = 1;
                        this.b.c()[0] = 11;
                        this.b.c()[1] = 119;
                        this.g = 2;
                        continue block0;
                    }
                    bl2 = n10 == 11;
                    this.h = bl2;
                }
            }
            return;
        }
        throw new IllegalStateException();
    }

    public final void a(v70 v702, w72.d d14) {
        d14.a();
        this.d = d14.b();
        this.e = v702.a(d14.c(), 1);
    }

    public final void b() {
    }
}


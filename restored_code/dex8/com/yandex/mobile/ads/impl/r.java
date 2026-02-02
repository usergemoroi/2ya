/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.ag1
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.g62
 *  com.yandex.mobile.ads.impl.s
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
import com.yandex.mobile.ads.impl.s;
import com.yandex.mobile.ads.impl.u40;
import com.yandex.mobile.ads.impl.v70;
import com.yandex.mobile.ads.impl.w72;

public final class r
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
    private boolean i;
    private long j;
    private cc0 k;
    private int l;
    private long m;

    public r() {
        this(null);
    }

    public r(@Nullable String string2) {
        byte[] byArray = new byte[16];
        this.a = new ag1(byArray);
        this.b = new bg1(byArray);
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.i = false;
        this.m = -9223372036854775807L;
        this.c = string2;
    }

    public final void a() {
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.i = false;
        this.m = -9223372036854775807L;
    }

    public final void a(int n10, long l10) {
        if (l10 != -9223372036854775807L) {
            this.m = l10;
        }
    }

    public final void a(bg1 bg12) {
        if (this.e != null) {
            block0: while (bg12.a() > 0) {
                Object object;
                int n10;
                int n13 = this.f;
                if (n13 != 0) {
                    if (n13 != 1) {
                        if (n13 != 2) continue;
                        n13 = Math.min(bg12.a(), this.l - this.g);
                        this.e.a(n13, bg12);
                        this.g = n10 = this.g + n13;
                        n13 = this.l;
                        if (n10 != n13) continue;
                        long l10 = this.m;
                        if (l10 != -9223372036854775807L) {
                            this.e.a(l10, 1, n13, 0, null);
                            this.m += this.j;
                        }
                        this.f = 0;
                        continue;
                    }
                    object = this.b.c();
                    n13 = Math.min(bg12.a(), 16 - this.g);
                    bg12.a(object, this.g, n13);
                    this.g = n13 = this.g + n13;
                    if (n13 != 16) continue;
                    this.a.c(0);
                    object = s.a((ag1)this.a);
                    cc0 cc02 = this.k;
                    if (cc02 == null || 2 != cc02.z || object.a != cc02.A || !"audio/ac4".equals(cc02.m)) {
                        this.k = cc02 = new /* Unavailable Anonymous Inner Class!! */.b(this.d).e("audio/ac4").c(2).l(object.a).d(this.c).a();
                        this.e.a(cc02);
                    }
                    this.l = object.b;
                    this.j = (long)object.c * 1000000L / (long)this.k.A;
                    this.b.e(0);
                    this.e.a(16, this.b);
                    this.f = 2;
                    continue;
                }
                while (bg12.a() > 0) {
                    boolean bl2;
                    if (!this.h) {
                        bl2 = bg12.t() == 172;
                        this.h = bl2;
                        continue;
                    }
                    n10 = bg12.t();
                    bl2 = n10 == 172;
                    this.h = bl2;
                    n13 = 64;
                    if (n10 != 64 && n10 != 65) continue;
                    bl2 = n10 == 65;
                    this.i = bl2;
                    this.f = 1;
                    this.b.c()[0] = -84;
                    object = this.b.c();
                    if (this.i) {
                        n13 = 65;
                    }
                    object[1] = (byte)n13;
                    this.g = 2;
                    continue block0;
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


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.g62
 *  com.yandex.mobile.ads.impl.u40
 *  com.yandex.mobile.ads.impl.v70
 *  com.yandex.mobile.ads.impl.w72$a
 *  com.yandex.mobile.ads.impl.w72$d
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.g62;
import com.yandex.mobile.ads.impl.u40;
import com.yandex.mobile.ads.impl.v70;
import com.yandex.mobile.ads.impl.w72;
import java.util.Collections;
import java.util.List;

public final class q40
implements u40 {
    private final List<w72.a> a;
    private final g62[] b;
    private boolean c;
    private int d;
    private int e;
    private long f;

    public q40(List<w72.a> list) {
        this.a = list;
        this.b = new g62[list.size()];
        this.f = -9223372036854775807L;
    }

    public final void a() {
        this.c = false;
        this.f = -9223372036854775807L;
    }

    public final void a(int n10, long l10) {
        if ((n10 & 4) == 0) {
            return;
        }
        this.c = true;
        if (l10 != -9223372036854775807L) {
            this.f = l10;
        }
        this.e = 0;
        this.d = 2;
    }

    public final void a(bg1 bg12) {
        block9: {
            int n10;
            int n13;
            block12: {
                block13: {
                    block10: {
                        block11: {
                            if (!this.c) break block9;
                            n13 = this.d;
                            n10 = 0;
                            if (n13 != 2) break block10;
                            if (bg12.a() == 0) break block11;
                            if (bg12.t() != 32) {
                                this.c = false;
                            }
                            --this.d;
                            if (this.c) break block10;
                        }
                        return;
                    }
                    if (this.d != 1) break block12;
                    if (bg12.a() == 0) break block13;
                    if (bg12.t() != 0) {
                        this.c = false;
                    }
                    --this.d;
                    if (this.c) break block12;
                }
                return;
            }
            int n14 = bg12.d();
            n13 = bg12.a();
            g62[] g62Array = this.b;
            int n15 = g62Array.length;
            while (n10 < n15) {
                g62 g622 = g62Array[n10];
                bg12.e(n14);
                g622.a(n13, bg12);
                ++n10;
            }
            this.e += n13;
        }
    }

    public final void a(v70 v702, w72.d d14) {
        for (int i14 = 0; i14 < this.b.length; ++i14) {
            w72.a a14 = this.a.get(i14);
            d14.a();
            g62 g622 = v702.a(d14.c(), 3);
            g622.a(new /* Unavailable Anonymous Inner Class!! */.b(d14.b()).e("application/dvbsubs").a(Collections.singletonList(a14.b)).d(a14.a).a());
            this.b[i14] = g622;
        }
    }

    public final void b() {
        if (this.c) {
            if (this.f != -9223372036854775807L) {
                g62[] g62Array = this.b;
                int n10 = g62Array.length;
                for (int i14 = 0; i14 < n10; ++i14) {
                    g62Array[i14].a(this.f, 1, this.e, 0, null);
                }
            }
            this.c = false;
        }
    }
}


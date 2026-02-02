/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.g21$a
 *  com.yandex.mobile.ads.impl.g62
 *  com.yandex.mobile.ads.impl.u40
 *  com.yandex.mobile.ads.impl.v70
 *  com.yandex.mobile.ads.impl.w72$d
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.g21;
import com.yandex.mobile.ads.impl.g62;
import com.yandex.mobile.ads.impl.u40;
import com.yandex.mobile.ads.impl.v70;
import com.yandex.mobile.ads.impl.w72;

public final class f21
implements u40 {
    private final bg1 a;
    private final g21.a b;
    @Nullable
    private final String c;
    private g62 d;
    private String e;
    private int f = 0;
    private int g;
    private boolean h;
    private boolean i;
    private long j;
    private int k;
    private long l;

    public f21(@Nullable String string2) {
        bg1 bg12;
        this.a = bg12 = new bg1(4);
        bg12.c()[0] = -1;
        this.b = new g21.a();
        this.l = -9223372036854775807L;
        this.c = string2;
    }

    public final void a() {
        this.f = 0;
        this.g = 0;
        this.i = false;
        this.l = -9223372036854775807L;
    }

    public final void a(int n10, long l10) {
        if (l10 != -9223372036854775807L) {
            this.l = l10;
        }
    }

    public final void a(bg1 bg12) {
        if (this.d != null) {
            block0: while (bg12.a() > 0) {
                Object object;
                int n10;
                int n12 = this.f;
                if (n12 != 0) {
                    if (n12 != 1) {
                        if (n12 == 2) {
                            n12 = Math.min(bg12.a(), this.k - this.g);
                            this.d.a(n12, bg12);
                            this.g = n12 = this.g + n12;
                            n10 = this.k;
                            if (n12 < n10) continue;
                            long l10 = this.l;
                            if (l10 != -9223372036854775807L) {
                                this.d.a(l10, 1, n10, 0, null);
                                this.l += this.j;
                            }
                            this.g = 0;
                            this.f = 0;
                            continue;
                        }
                        throw new IllegalStateException();
                    }
                    n12 = Math.min(bg12.a(), 4 - this.g);
                    bg12.a(this.a.c(), this.g, n12);
                    this.g = n12 = this.g + n12;
                    if (n12 < 4) continue;
                    this.a.e(0);
                    if (!this.b.a(this.a.h())) {
                        this.g = 0;
                        this.f = 1;
                        continue;
                    }
                    object = this.b;
                    this.k = object.c;
                    if (!this.h) {
                        this.j = (long)object.g * 1000000L / (long)object.d;
                        object = new /* Unavailable Anonymous Inner Class!! */.b(this.e).e(this.b.b).h(4096).c(this.b.e).l(this.b.d).d(this.c).a();
                        this.d.a((cc0)object);
                        this.h = true;
                    }
                    this.a.e(0);
                    this.d.a(4, this.a);
                    this.f = 2;
                    continue;
                }
                object = bg12.c();
                int n13 = bg12.e();
                for (n12 = bg12.d(); n12 < n13; ++n12) {
                    n10 = object[n12];
                    boolean bl2 = (n10 & 0xFF) == 255;
                    n10 = this.i && (n10 & 0xE0) == 224 ? 1 : 0;
                    this.i = bl2;
                    if (n10 == 0) continue;
                    bg12.e(n12 + 1);
                    this.i = false;
                    this.a.c()[1] = object[n12];
                    this.g = 2;
                    this.f = 1;
                    continue block0;
                }
                bg12.e(n13);
            }
            return;
        }
        throw new IllegalStateException();
    }

    public final void a(v70 v702, w72.d d10) {
        d10.a();
        this.e = d10.b();
        this.d = v702.a(d10.c(), 1);
    }

    public final void b() {
    }
}


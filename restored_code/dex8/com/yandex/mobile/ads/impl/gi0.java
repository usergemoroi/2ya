/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.g62
 *  com.yandex.mobile.ads.impl.u40
 *  com.yandex.mobile.ads.impl.v70
 *  com.yandex.mobile.ads.impl.w72$d
 *  com.yandex.mobile.ads.impl.zs0
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.g62;
import com.yandex.mobile.ads.impl.u40;
import com.yandex.mobile.ads.impl.v70;
import com.yandex.mobile.ads.impl.w72;
import com.yandex.mobile.ads.impl.zs0;

public final class gi0
implements u40 {
    private final bg1 a = new bg1(10);
    private g62 b;
    private boolean c;
    private long d = -9223372036854775807L;
    private int e;
    private int f;

    public final void a() {
        this.c = false;
        this.d = -9223372036854775807L;
    }

    public final void a(int n10, long l10) {
        if ((n10 & 4) == 0) {
            return;
        }
        this.c = true;
        if (l10 != -9223372036854775807L) {
            this.d = l10;
        }
        this.e = 0;
        this.f = 0;
    }

    public final void a(bg1 bg12) {
        if (this.b != null) {
            if (!this.c) {
                return;
            }
            int n10 = bg12.a();
            int n12 = this.f;
            if (n12 < 10) {
                n12 = Math.min(n10, 10 - n12);
                System.arraycopy(bg12.c(), bg12.d(), this.a.c(), this.f, n12);
                if (this.f + n12 == 10) {
                    this.a.e(0);
                    if (73 == this.a.t() && 68 == this.a.t() && 51 == this.a.t()) {
                        this.a.f(3);
                        this.e = this.a.s() + 10;
                    } else {
                        zs0.d((String)"Id3Reader", (String)"Discarding invalid ID3 tag");
                        this.c = false;
                        return;
                    }
                }
            }
            n10 = Math.min(n10, this.e - this.f);
            this.b.a(n10, bg12);
            this.f += n10;
            return;
        }
        throw new IllegalStateException();
    }

    public final void a(v70 v702, w72.d d10) {
        d10.a();
        v702 = v702.a(d10.c(), 5);
        this.b = v702;
        v702.a(new /* Unavailable Anonymous Inner Class!! */.b(d10.b()).e("application/id3").a());
    }

    public final void b() {
        g62 g622 = this.b;
        if (g622 != null) {
            int n10;
            if (this.c && (n10 = this.e) != 0 && this.f == n10) {
                long l10 = this.d;
                if (l10 != -9223372036854775807L) {
                    g622.a(l10, 1, n10, 0, null);
                }
                this.c = false;
            }
            return;
        }
        throw new IllegalStateException();
    }
}


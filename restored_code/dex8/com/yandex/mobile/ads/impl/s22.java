/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ex1
 *  com.yandex.mobile.ads.impl.ex1$a
 *  com.yandex.mobile.ads.impl.g62
 *  com.yandex.mobile.ads.impl.gx1
 *  com.yandex.mobile.ads.impl.v70
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ex1;
import com.yandex.mobile.ads.impl.g62;
import com.yandex.mobile.ads.impl.gx1;
import com.yandex.mobile.ads.impl.v70;

public final class s22
implements v70 {
    private final long b;
    private final v70 c;

    public s22(long l10, v70 v702) {
        this.b = l10;
        this.c = v702;
    }

    public final g62 a(int n10, int n13) {
        return this.c.a(n10, n13);
    }

    public final void a() {
        this.c.a();
    }

    public final void a(ex1 ex12) {
        this.c.a(new ex1(){
            final ex1 a;
            final s22 b;
            {
                this.b = s222;
                this.a = ex12;
            }

            public final ex1.a b(long l10) {
                ex1.a a14 = this.a.b(l10);
                gx1 gx12 = a14.a;
                l10 = gx12.a;
                long l11 = gx12.b;
                long l13 = this.b.b;
                gx12 = new gx1(l10, l11 + l13);
                a14 = a14.b;
                return new ex1.a(gx12, new gx1(a14.a, a14.b + l13));
            }

            public final boolean b() {
                return this.a.b();
            }

            public final long c() {
                return this.a.c();
            }
        });
    }
}


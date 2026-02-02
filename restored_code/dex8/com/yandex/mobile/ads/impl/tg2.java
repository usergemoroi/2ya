/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.fe
 *  com.yandex.mobile.ads.impl.fg1
 *  com.yandex.mobile.ads.impl.g41
 *  com.yandex.mobile.ads.impl.g62
 *  com.yandex.mobile.ads.impl.h42
 *  com.yandex.mobile.ads.impl.wh
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.fe;
import com.yandex.mobile.ads.impl.fg1;
import com.yandex.mobile.ads.impl.g41;
import com.yandex.mobile.ads.impl.g62;
import com.yandex.mobile.ads.impl.h42;
import com.yandex.mobile.ads.impl.wh;

final class tg2
extends h42 {
    private final bg1 b = new bg1(g41.a);
    private final bg1 c = new bg1(4);
    private int d;
    private boolean e;
    private boolean f;
    private int g;

    public tg2(g62 g622) {
        super(g622);
    }

    protected final boolean a(long l10, bg1 object) throws fg1 {
        int n10 = object.t();
        long l11 = object.i();
        if (n10 == 0 && !this.e) {
            bg1 bg12 = new bg1(new byte[object.a()]);
            object.a(bg12.c(), 0, object.a());
            object = wh.a((bg1)bg12);
            this.d = object.b;
            object = new /* Unavailable Anonymous Inner Class!! */.e("video/avc").a(object.f).o(object.c).f(object.d).b(object.e).a(object.a).a();
            this.a.a((cc0)object);
            this.e = true;
            return false;
        }
        if (n10 == 1 && this.e) {
            n10 = this.g == 1 ? 1 : 0;
            if (!this.f && n10 == 0) {
                return false;
            }
            byte[] byArray = this.c.c();
            byArray[0] = 0;
            byArray[1] = 0;
            byArray[2] = 0;
            int n13 = this.d;
            int n14 = 0;
            while (object.a() > 0) {
                object.a(this.c.c(), 4 - n13, this.d);
                this.c.e(0);
                int n15 = this.c.x();
                this.b.e(0);
                this.a.a(4, this.b);
                this.a.a(n15, object);
                n14 = n14 + 4 + n15;
            }
            this.a.a(l11 * 1000L + l10, n10, n14, 0, null);
            this.f = true;
            return true;
        }
        return false;
    }

    protected final boolean a(bg1 bg12) throws h42.a {
        int n10 = bg12.t();
        int n13 = n10 >> 4 & 0xF;
        if ((n10 &= 0xF) == 7) {
            this.g = n13;
            boolean bl2 = n13 != 5;
            return bl2;
        }
        throw new h42.a(fe.a((String)"Video format not supported: ", (int)n10));
    }
}


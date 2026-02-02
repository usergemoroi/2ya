/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.cx1
 *  com.yandex.mobile.ads.impl.g62
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.s52
 *  com.yandex.mobile.ads.impl.v70
 *  com.yandex.mobile.ads.impl.w72$d
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.cx1;
import com.yandex.mobile.ads.impl.g62;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.s52;
import com.yandex.mobile.ads.impl.v70;
import com.yandex.mobile.ads.impl.w72;

public final class lg1
implements cx1 {
    private cc0 a;
    private s52 b;
    private g62 c;

    public lg1(String string2) {
        this.a = new /* Unavailable Anonymous Inner Class!! */.e(string2).a();
    }

    public final void a(bg1 bg12) {
        Object object = this.b;
        if (object != null) {
            int n10 = m92.a;
            long l10 = object.b();
            long l11 = this.b.c();
            if (l10 != -9223372036854775807L && l11 != -9223372036854775807L) {
                object = this.a;
                if (l11 != ((cc0)object).q) {
                    this.a = object = ((cc0)object).a().a(l11).a();
                    this.c.a((cc0)object);
                }
                n10 = bg12.a();
                this.c.a(n10, bg12);
                this.c.a(l10, 1, n10, 0, null);
            }
            return;
        }
        throw new IllegalStateException();
    }

    public final void a(s52 s522, v70 v702, w72.d d14) {
        this.b = s522;
        d14.a();
        s522 = v702.a(d14.c(), 5);
        this.c = s522;
        s522.a(this.a);
    }
}


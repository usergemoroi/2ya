/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.a
 *  com.yandex.mobile.ads.impl.ag1
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.fg1
 *  com.yandex.mobile.ads.impl.g62
 *  com.yandex.mobile.ads.impl.h42
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.a;
import com.yandex.mobile.ads.impl.ag1;
import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.fg1;
import com.yandex.mobile.ads.impl.g62;
import com.yandex.mobile.ads.impl.h42;
import java.util.Collections;

final class mh
extends h42 {
    private static final int[] e = new int[]{5512, 11025, 22050, 44100};
    private boolean b;
    private boolean c;
    private int d;

    public mh(g62 g622) {
        super(g622);
    }

    protected final boolean a(long l10, bg1 object) throws fg1 {
        if (this.d == 2) {
            int n10 = object.a();
            this.a.a(n10, object);
            this.a.a(l10, 1, n10, 0, null);
            return true;
        }
        int n13 = object.t();
        if (n13 == 0 && !this.c) {
            n13 = object.a();
            byte[] byArray = new byte[n13];
            object.a(byArray, 0, n13);
            object = a.a((ag1)new ag1(n13, byArray), (boolean)false);
            object = new /* Unavailable Anonymous Inner Class!! */.e("audio/mp4a-latm").a(object.c).c(object.b).l(object.a).a(Collections.singletonList(byArray)).a();
            this.a.a((cc0)object);
            this.c = true;
            return false;
        }
        if (this.d == 10 && n13 != 1) {
            return false;
        }
        n13 = object.a();
        this.a.a(n13, object);
        this.a.a(l10, 1, n13, 0, null);
        return true;
    }

    protected final boolean a(bg1 object) throws h42.a {
        if (!this.b) {
            int n10;
            int n13 = object.t();
            this.d = n10 = n13 >> 4 & 0xF;
            if (n10 == 2) {
                n13 = e[n13 >> 2 & 3];
                object = new /* Unavailable Anonymous Inner Class!! */.e("audio/mpeg").c(1).l(n13).a();
                this.a.a((cc0)object);
                this.c = true;
            } else if (n10 != 7 && n10 != 8) {
                if (n10 != 10) {
                    object = new StringBuilder("Audio format not supported: ");
                    ((StringBuilder)object).append(this.d);
                    throw new h42.a(((StringBuilder)object).toString());
                }
            } else {
                object = n10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                object = new /* Unavailable Anonymous Inner Class!! */.e((String)object).c(1).l(8000).a();
                this.a.a((cc0)object);
                this.c = true;
            }
            this.b = true;
        } else {
            object.f(1);
        }
        return true;
    }
}


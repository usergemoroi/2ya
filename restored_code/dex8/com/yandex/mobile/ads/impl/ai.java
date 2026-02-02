/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.xh
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.xh;

final class ai
implements xh {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    private ai(int n10, int n12, int n13, int n14, int n15) {
        this.a = n10;
        this.b = n12;
        this.c = n13;
        this.d = n14;
        this.e = n15;
    }

    public static ai a(bg1 bg12) {
        int n10 = bg12.k();
        bg12.f(12);
        bg12.k();
        int n12 = bg12.k();
        int n13 = bg12.k();
        bg12.f(4);
        int n14 = bg12.k();
        int n15 = bg12.k();
        bg12.f(8);
        return new ai(n10, n12, n13, n14, n15);
    }

    public final int getType() {
        return 1752331379;
    }
}


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

final class zh
implements xh {
    public final int a;
    public final int b;
    public final int c;

    private zh(int n10, int n13, int n14) {
        this.a = n10;
        this.b = n13;
        this.c = n14;
    }

    public static zh a(bg1 bg12) {
        int n10 = bg12.k();
        bg12.f(8);
        int n13 = bg12.k();
        int n14 = bg12.k();
        bg12.f(4);
        bg12.k();
        bg12.f(12);
        return new zh(n10, n13, n14);
    }

    public final int getType() {
        return 1751742049;
    }
}


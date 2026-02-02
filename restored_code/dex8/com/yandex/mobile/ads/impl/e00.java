/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.dj2
 *  com.yandex.mobile.ads.impl.qr1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.dj2;
import com.yandex.mobile.ads.impl.qr1;

public final class e00
implements qr1 {
    private int a;
    private int b;
    private final int c;
    private final float d;

    public e00() {
        this(1.0f, 2500, 1);
    }

    public e00(float f10, int n10, int n12) {
        this.a = n10;
        this.c = n12;
        this.d = f10;
    }

    public final int a() {
        return this.a;
    }

    public final void a(dj2 dj22) throws dj2 {
        int n10;
        this.b = n10 = this.b + 1;
        int n12 = this.a;
        this.a = n12 + (int)((float)n12 * this.d);
        if (n10 <= this.c) {
            return;
        }
        throw dj22;
    }
}


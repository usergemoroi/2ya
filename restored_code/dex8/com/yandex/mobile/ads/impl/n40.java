/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.o40
 *  com.yandex.mobile.ads.impl.q32
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.o40;
import com.yandex.mobile.ads.impl.p40;
import com.yandex.mobile.ads.impl.q32;
import com.yandex.mobile.ads.impl.wy1;
import java.util.List;

public final class n40
extends wy1 {
    private final o40 m;

    public n40(List<byte[]> bg12) {
        bg12 = new bg1(bg12.get(0));
        this.m = new o40(bg12.z(), bg12.z());
    }

    @Override
    protected final q32 a(byte[] byArray, int n10, boolean bl2) {
        if (bl2) {
            this.m.d();
        }
        return new p40(this.m.a(n10, byArray));
    }
}


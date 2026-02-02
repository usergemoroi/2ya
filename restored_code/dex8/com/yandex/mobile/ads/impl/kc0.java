/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.uu
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.uu;
import java.util.UUID;

public final class kc0
implements uu {
    public static final boolean d;
    public final UUID a;
    public final byte[] b;
    public final boolean c;

    static {
        String string2;
        boolean bl2 = "Amazon".equals(m92.c) && ("AFTM".equals(string2 = m92.d) || "AFTB".equals(string2));
        d = bl2;
    }

    public kc0(UUID uUID, byte[] byArray, boolean bl2) {
        this.a = uUID;
        this.b = byArray;
        this.c = bl2;
    }
}


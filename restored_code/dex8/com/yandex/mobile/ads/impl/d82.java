/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.a82
 *  com.yandex.mobile.ads.impl.c82
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.q32
 *  com.yandex.mobile.ads.impl.z72
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.a82;
import com.yandex.mobile.ads.impl.c82;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.q32;
import com.yandex.mobile.ads.impl.wu;
import com.yandex.mobile.ads.impl.z72;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class d82
implements q32 {
    private final z72 b;
    private final long[] c;
    private final Map<String, c82> d;
    private final Map<String, a82> e;
    private final Map<String, String> f;

    public d82(z72 z722, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.b = z722;
        this.e = hashMap2;
        this.f = hashMap3;
        this.d = Collections.unmodifiableMap(hashMap);
        this.c = z722.b();
    }

    public final int a() {
        return this.c.length;
    }

    public final int a(long l10) {
        int n10 = m92.a((long[])this.c, (long)l10, (boolean)false);
        if (n10 >= this.c.length) {
            n10 = -1;
        }
        return n10;
    }

    public final long a(int n10) {
        return this.c[n10];
    }

    public final List<wu> b(long l10) {
        return this.b.a(l10, this.d, this.e, this.f);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.cs0$g
 *  com.yandex.mobile.ads.impl.fg1
 *  com.yandex.mobile.ads.impl.mv
 *  com.yandex.mobile.ads.impl.yr0
 *  com.yandex.mobile.ads.impl.yr0$a
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bh0;
import com.yandex.mobile.ads.impl.cs0;
import com.yandex.mobile.ads.impl.fg1;
import com.yandex.mobile.ads.impl.mv;
import com.yandex.mobile.ads.impl.yr0;
import java.io.FileNotFoundException;
import java.io.IOException;

public final class vz
implements yr0 {
    public vz() {
        this(0);
    }

    public vz(int n10) {
    }

    public final int a(int n10) {
        n10 = n10 == 7 ? 6 : 3;
        return n10;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final long a(yr0.a a14) {
        void var5_3;
        IOException iOException = a14.a;
        if (iOException instanceof fg1) return -9223372036854775807L;
        if (iOException instanceof FileNotFoundException) return -9223372036854775807L;
        if (iOException instanceof bh0) return -9223372036854775807L;
        if (iOException instanceof cs0.g) return -9223372036854775807L;
        int n10 = mv.c;
        while (var5_3 != null) {
            if (var5_3 instanceof mv && ((mv)var5_3).b == 2008) return -9223372036854775807L;
            Throwable throwable = var5_3.getCause();
        }
        return Math.min((a14.b - 1) * 1000, 5000);
    }
}


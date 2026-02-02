/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.bq
 *  com.yandex.mobile.ads.impl.ks0
 *  com.yandex.mobile.ads.impl.m72
 *  com.yandex.mobile.ads.impl.up
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bq;
import com.yandex.mobile.ads.impl.ks0;
import com.yandex.mobile.ads.impl.m72;
import com.yandex.mobile.ads.impl.up;
import kotlin.jvm.internal.y;
import kotlin.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class zp
implements m72 {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static bq b(ks0 object, up up3) {
        void var0_9;
        void var1_12;
        String string2 = var1_12.a();
        Object var3_14 = null;
        if (string2 == null) {
            return null;
        }
        try {
            int n10 = var1_12.ordinal();
            if (n10 == 0) {
                bq.c c11 = new bq.c(object.d(string2));
                return var0_9;
            }
            if (n10 == 1) {
                bq.d d14 = new bq.d(object.d(string2));
                return var0_9;
            }
            if (n10 == 2) {
                bq.b b11 = new bq.b(object.a(string2, false));
                return var0_9;
            }
            if (n10 == 3) {
                bq.e e11 = new bq.e(object.d(string2));
                return var0_9;
            }
            if (n10 == 4) {
                bq.f f11 = new bq.f(object.d(string2));
                return var0_9;
            }
            if (n10 == 5) {
                Object var0_1 = var3_14;
                return var0_9;
            }
            r r14 = new r();
            throw r14;
        }
        // Removed invalid catch block
            return var0_9;
        }
    }

    @Nullable
    public final bq a(@NotNull ks0 ks02, @NotNull up up3) {
        String string2 = up3.a();
        bq bq2 = null;
        if (string2 == null || !ks02.c(up3.a())) {
            up3 = null;
        }
        if (up3 != null) {
            bq2 = zp.b(ks02, up3);
        }
        return bq2;
    }

    @Nullable
    public final bq a(@NotNull ks0 ks02, @NotNull String string2) {
        boolean bl2 = ks02.c(string2);
        bq bq2 = null;
        if (!bl2) {
            string2 = null;
        }
        if (string2 != null) {
            up.d.getClass();
            for (up up3 : up.values()) {
                if (!y.e(up3.a(), string2)) continue;
                string2 = up3;
                break;
            }
        } else {
            string2 = null;
        }
        if (string2 != null) {
            bq2 = zp.b(ks02, (up)string2);
        }
        return bq2;
    }
}


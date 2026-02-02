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

public final class aq
implements m72 {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static bq b(ks0 object, up object2) {
        void var0_15;
        void var1_18;
        String string2 = var1_18.b();
        Object var4_21 = null;
        try {
            void var0_12;
            void var0_9;
            int n10 = var1_18.ordinal();
            if (n10 == 0) {
                bq.c c10 = new bq.c(object.d(string2));
                return var0_15;
            }
            boolean bl2 = true;
            if (n10 != 1) {
                if (n10 != 2) {
                    if (n10 == 3) {
                        bq.e e11 = new bq.e(object.d(string2));
                        return var0_15;
                    }
                    if (n10 == 4) {
                        bq.f f10 = new bq.f(object.d(string2));
                        return var0_15;
                    }
                    if (n10 == 5) {
                        bq.a a12;
                        bq.a a13 = a12 = new bq.a(object.d(string2));
                        return var0_15;
                    }
                    r r12 = new r();
                    throw r12;
                }
                if (object.b(-1, string2) == -1) {
                    bl2 = false;
                }
                bq.b b10 = new bq.b(bl2);
                return var0_15;
            }
            n10 = object.b(-1, string2);
            Integer n12 = n10;
            if (n10 == -1) {
                Object var0_8 = null;
            }
            if (var0_9 != null) {
                String string3 = String.valueOf(var0_9.intValue());
            } else {
                Object var0_11 = null;
            }
            bq.d d10 = new bq.d((String)var0_12);
            return var0_15;
        }
        // Removed invalid catch block
            return var0_15;
        }
    }

    @Nullable
    public final bq a(@NotNull ks0 ks02, @NotNull up up3) {
        boolean bl2 = ks02.c(up3.b());
        bq bq2 = null;
        if (!bl2) {
            up3 = null;
        }
        if (up3 != null) {
            bq2 = aq.b(ks02, up3);
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
                if (!y.e(up3.b(), string2)) continue;
                string2 = up3;
                break;
            }
        } else {
            string2 = null;
        }
        if (string2 != null) {
            bq2 = aq.b(ks02, (up)string2);
        }
        return bq2;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.u00
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.u00;
import org.jetbrains.annotations.NotNull;

public final class pq
implements u00 {
    @NotNull
    private final u00[] a;

    public pq(u00 ... u00Array) {
        this.a = u00Array;
    }

    public final boolean a(@NotNull Context context) {
        boolean bl2;
        block2: {
            u00[] u00Array = this.a;
            int n10 = u00Array.length;
            bl2 = false;
            for (int i14 = 0; i14 < n10; ++i14) {
                if (u00Array[i14].a(context)) {
                    continue;
                }
                break block2;
            }
            bl2 = true;
        }
        return bl2;
    }
}


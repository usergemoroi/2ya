/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.x2
 *  com.yandex.mobile.ads.impl.yd2
 *  kotlin.collections.s0
 *  kotlin.text.p
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.yd2;
import java.util.Map;
import kotlin.collections.s0;
import kotlin.t;
import kotlin.text.p;
import kotlin.z;
import org.jetbrains.annotations.NotNull;

public final class ya1
implements yd2 {
    @NotNull
    private final x2 a;

    public ya1(@NotNull x2 x22) {
        this.a = x22;
    }

    @NotNull
    public final Map<String, String> a() {
        String string2;
        block3: {
            block2: {
                String string3 = this.a.c();
                if (string3 == null) break block2;
                string2 = string3;
                if (!p.h0((CharSequence)string3)) break block3;
            }
            string2 = "undefined";
        }
        return s0.m((t[])new t[]{z.a("block_id", string2), z.a("ad_type", this.a.b().b())});
    }
}


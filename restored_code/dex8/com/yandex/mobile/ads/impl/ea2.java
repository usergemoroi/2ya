/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.is
 *  com.yandex.mobile.ads.impl.n7
 *  com.yandex.mobile.ads.impl.yd2
 *  kotlin.collections.s0
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.is;
import com.yandex.mobile.ads.impl.n7;
import com.yandex.mobile.ads.impl.yd2;
import java.util.Map;
import kotlin.collections.s0;
import kotlin.jvm.JvmOverloads;
import kotlin.t;
import kotlin.z;
import org.jetbrains.annotations.NotNull;

public final class ea2
implements yd2 {
    @NotNull
    private final n7 a;

    @JvmOverloads
    public ea2(@NotNull n7 n73) {
        this.a = n73;
    }

    @NotNull
    public final Map<String, String> a() {
        String string2;
        String string3;
        String string4;
        block5: {
            block4: {
                string4 = this.a.d();
                string3 = "undefined";
                if (string4 == null) break block4;
                string2 = string4;
                if (string4.length() != 0) break block5;
            }
            string2 = "undefined";
        }
        t<String, String> t13 = z.a("page_id", string2);
        string4 = this.a.c();
        string2 = string3;
        if (string4 != null) {
            string2 = string4.length() == 0 ? string3 : string4;
        }
        return s0.m((t[])new t[]{t13, z.a("imp_id", string2), z.a("ad_type", is.h.b())});
    }
}


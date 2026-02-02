/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.a3$a
 *  com.yandex.mobile.ads.impl.ar1
 *  com.yandex.mobile.ads.impl.dj2
 *  com.yandex.mobile.ads.impl.em$a
 *  com.yandex.mobile.ads.impl.g3
 *  com.yandex.mobile.ads.impl.gh0
 *  com.yandex.mobile.ads.impl.hh0
 *  com.yandex.mobile.ads.impl.lq1
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.ou1
 *  com.yandex.mobile.ads.impl.pw1
 *  com.yandex.mobile.ads.impl.pw1$a
 *  com.yandex.mobile.ads.impl.uc1
 *  kotlin.collections.s0
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.a3;
import com.yandex.mobile.ads.impl.ak;
import com.yandex.mobile.ads.impl.ar1;
import com.yandex.mobile.ads.impl.av1;
import com.yandex.mobile.ads.impl.dj2;
import com.yandex.mobile.ads.impl.em;
import com.yandex.mobile.ads.impl.g3;
import com.yandex.mobile.ads.impl.gh0;
import com.yandex.mobile.ads.impl.hh0;
import com.yandex.mobile.ads.impl.lq1;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.ou1;
import com.yandex.mobile.ads.impl.ph;
import com.yandex.mobile.ads.impl.pw1;
import com.yandex.mobile.ads.impl.uc1;
import com.yandex.mobile.ads.impl.zu1;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.s0;
import org.jetbrains.annotations.NotNull;

public final class yu1
extends ak<ou1> {
    @NotNull
    private final Context w;
    @NotNull
    private final lq1<ou1> x;
    @NotNull
    private final Map<String, String> y;

    public yu1(@NotNull Context context, @NotNull String string2, @NotNull zu1 zu12, @NotNull Map map2, @NotNull av1 av12, @NotNull av1 av13) {
        super(context, 0, string2, av13, av12);
        this.w = context;
        this.x = zu12;
        this.y = map2;
        this.r();
        this.s();
    }

    @NotNull
    public final ar1<ou1> a(@NotNull uc1 uc12) {
        g3 g32;
        if (200 == uc12.a) {
            ou1 ou12 = (ou1)this.x.a(uc12);
            if (ou12 != null) {
                Map map2;
                Map map3 = map2 = uc12.c;
                if (map2 == null) {
                    map3 = s0.j();
                }
                this.a(map3);
                return ar1.a((Object)ou12, (em.a)hh0.a((uc1)uc12));
            }
            g32 = g3.c;
        } else {
            g32 = g3.e;
        }
        return ar1.a((dj2)new a3(g32, uc12));
    }

    @Override
    @NotNull
    public final dj2 b(@NotNull dj2 dj22) {
        int n10 = op0.b;
        n10 = a3.d;
        return a3.a.a((dj2)dj22);
    }

    @NotNull
    public final Map<String, String> e() throws ph {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        Context context = this.w;
        int n10 = pw1.l;
        context = pw1.a.a().a(context);
        if (context != null && context.g0()) {
            hashMap.put(gh0.U.a(), "1");
        }
        hashMap.putAll(this.y);
        return hashMap;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.ar1
 *  com.yandex.mobile.ads.impl.dj2
 *  com.yandex.mobile.ads.impl.em$a
 *  com.yandex.mobile.ads.impl.g3
 *  com.yandex.mobile.ads.impl.gh0
 *  com.yandex.mobile.ads.impl.hh0
 *  com.yandex.mobile.ads.impl.jx
 *  com.yandex.mobile.ads.impl.lq1
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.pw1
 *  com.yandex.mobile.ads.impl.pw1$a
 *  com.yandex.mobile.ads.impl.uc1
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.a3;
import com.yandex.mobile.ads.impl.ak;
import com.yandex.mobile.ads.impl.ar1;
import com.yandex.mobile.ads.impl.bl0;
import com.yandex.mobile.ads.impl.dj2;
import com.yandex.mobile.ads.impl.em;
import com.yandex.mobile.ads.impl.g3;
import com.yandex.mobile.ads.impl.gh0;
import com.yandex.mobile.ads.impl.hh0;
import com.yandex.mobile.ads.impl.jx;
import com.yandex.mobile.ads.impl.lq1;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.pw1;
import com.yandex.mobile.ads.impl.uc1;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

public final class yo0
extends ak<jx> {
    @NotNull
    private final Context w;
    @NotNull
    private final lq1<jx> x;
    @NotNull
    private final Map<String, String> y;

    public yo0(@NotNull Context context, @NotNull String string2, @NotNull lq1 lq12, @NotNull Map map2, @NotNull bl0 bl02) {
        super(context, string2, bl02);
        this.w = context;
        this.x = lq12;
        this.y = map2;
    }

    @NotNull
    protected final ar1<jx> a(@NotNull uc1 uc12) {
        jx jx3;
        uc12 = 200 == uc12.a ? ((jx3 = (jx)this.x.a(uc12)) != null ? ar1.a((Object)jx3, (em.a)hh0.a((uc1)uc12)) : ar1.a((dj2)new a3(g3.c, uc12))) : ar1.a((dj2)new a3(g3.e, uc12));
        return uc12;
    }

    @Override
    @NotNull
    protected final dj2 b(@NotNull dj2 dj22) {
        int n10 = op0.b;
        return dj22;
    }

    @NotNull
    public final Map<String, String> e() {
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


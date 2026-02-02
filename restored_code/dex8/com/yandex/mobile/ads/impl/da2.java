/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.ar1
 *  com.yandex.mobile.ads.impl.dj2
 *  com.yandex.mobile.ads.impl.ga2
 *  com.yandex.mobile.ads.impl.gh0
 *  com.yandex.mobile.ads.impl.ja2
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.qa2
 *  com.yandex.mobile.ads.impl.tx1
 *  com.yandex.mobile.ads.impl.uc1
 *  com.yandex.mobile.ads.impl.ux1
 *  com.yandex.mobile.ads.impl.x2
 *  kotlin.collections.s0
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ar1;
import com.yandex.mobile.ads.impl.dg1;
import com.yandex.mobile.ads.impl.dj2;
import com.yandex.mobile.ads.impl.ga2;
import com.yandex.mobile.ads.impl.gh0;
import com.yandex.mobile.ads.impl.ja2;
import com.yandex.mobile.ads.impl.kj2;
import com.yandex.mobile.ads.impl.o62;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.qa2;
import com.yandex.mobile.ads.impl.tx1;
import com.yandex.mobile.ads.impl.ua2;
import com.yandex.mobile.ads.impl.uc1;
import com.yandex.mobile.ads.impl.ux1;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.z40;
import java.util.Map;
import kotlin.collections.s0;
import org.jetbrains.annotations.NotNull;

public final class da2
extends o62<qa2, ga2> {
    @NotNull
    private final ux1 C;
    @NotNull
    private final tx1 D;
    @NotNull
    private final ja2 E;

    public da2(@NotNull Context context, @NotNull x2 x22, @NotNull String string2, @NotNull kj2 kj22, @NotNull qa2 qa22, @NotNull ua2 ua22, @NotNull ux1 ux12, @NotNull tx1 tx12, @NotNull ja2 ja22) {
        super(context, x22, 0, string2, kj22, qa22, ua22, null, 1920);
        this.C = ux12;
        this.D = tx12;
        this.E = ja22;
        int n10 = op0.b;
    }

    @Override
    @NotNull
    public final ar1<ga2> a(@NotNull uc1 uc12, int n10) {
        Map map2;
        Map map3 = map2 = uc12.c;
        if (map2 == null) {
            map3 = s0.j();
        }
        this.D.a(map3);
        uc12 = this.E.a(uc12);
        if (uc12 != null) {
            uc12 = uc12.b().b().isEmpty() ^ true ? ar1.a((Object)uc12, null) : ar1.a((dj2)new z40());
            return uc12;
        }
        return ar1.a((dj2)new dg1("Can't parse VAST response."));
    }

    @Override
    @NotNull
    public final Map<String, String> e() {
        Map map2 = s0.d();
        String string2 = this.C.a();
        if (string2 != null) {
            int n10 = op0.b;
            string2 = map2.put(gh0.K.a(), string2);
        }
        map2.putAll(super.e());
        return s0.c((Map)map2);
    }
}


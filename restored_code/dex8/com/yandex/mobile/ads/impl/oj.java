/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ar1
 *  com.yandex.mobile.ads.impl.b
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.d8
 *  com.yandex.mobile.ads.impl.i7
 *  com.yandex.mobile.ads.impl.oj$a
 *  com.yandex.mobile.ads.impl.p7
 *  com.yandex.mobile.ads.impl.pq1
 *  com.yandex.mobile.ads.impl.sp1
 *  com.yandex.mobile.ads.impl.sp1$b
 *  com.yandex.mobile.ads.impl.tp1
 *  com.yandex.mobile.ads.impl.up1
 *  com.yandex.mobile.ads.impl.w82$a
 *  com.yandex.mobile.ads.impl.x2
 *  kotlin.collections.s0
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ar1;
import com.yandex.mobile.ads.impl.b;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.d8;
import com.yandex.mobile.ads.impl.i7;
import com.yandex.mobile.ads.impl.oj;
import com.yandex.mobile.ads.impl.p7;
import com.yandex.mobile.ads.impl.pq1;
import com.yandex.mobile.ads.impl.sp1;
import com.yandex.mobile.ads.impl.tp1;
import com.yandex.mobile.ads.impl.up1;
import com.yandex.mobile.ads.impl.w82;
import com.yandex.mobile.ads.impl.x2;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class oj<T>
implements pq1<x2, b8<T>> {
    @NotNull
    private final p7 a = new p7();
    @NotNull
    private final d8<T> b;

    public oj(@NotNull a<T> a14) {
        this.b = new d8(a14);
    }

    public final sp1 a(ar1 object, int n10, Object object2) {
        tp1 tp12 = this.a(n10, (x2)object2, (ar1)object);
        object2 = sp1.b.l;
        object = tp12.b();
        tp12 = tp12.a();
        return new sp1(object2.a(), s0.C((Map)object), (b)tp12);
    }

    public final sp1 a(Object object) {
        tp1 tp12 = this.a((x2)object);
        sp1.b b10 = sp1.b.k;
        object = tp12.b();
        tp12 = tp12.a();
        return new sp1(b10.a(), s0.C((Map)object), (b)tp12);
    }

    @NotNull
    protected tp1 a(int n10, @NotNull x2 x22, @Nullable ar1 ar12) {
        return this.b.a(n10, x22, ar12);
    }

    @NotNull
    protected tp1 a(@NotNull x2 x22) {
        tp1 tp12 = new tp1(new HashMap(), 2);
        i7 i73 = x22.a();
        tp1 tp13 = tp12;
        if (i73 != null) {
            tp13 = up1.a((tp1)tp12, (tp1)this.a.a(i73));
        }
        tp13.b((Object)x22.c(), "block_id");
        tp13.b((Object)x22.c(), "ad_unit_id");
        tp13.b((Object)x22.b().b(), "ad_type");
        tp12 = x22.q();
        if (tp12 != null) {
            tp13.b((Object)tp12.a().a(), "size_type");
        }
        boolean bl2 = x22.s() == w82.a.c;
        tp13.b((Object)bl2, "is_passback");
        return tp13;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ga
 *  com.yandex.mobile.ads.impl.lo1
 *  com.yandex.mobile.ads.impl.p30
 *  com.yandex.mobile.ads.impl.pe2
 *  com.yandex.mobile.ads.impl.r30
 *  com.yandex.mobile.ads.impl.r30$c
 *  kotlin.collections.t
 *  kotlin.reflect.KProperty
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ga;
import com.yandex.mobile.ads.impl.ko1;
import com.yandex.mobile.ads.impl.lo1;
import com.yandex.mobile.ads.impl.p30;
import com.yandex.mobile.ads.impl.pe2;
import com.yandex.mobile.ads.impl.r30;
import java.util.Collection;
import java.util.List;
import kotlin.collections.t;
import kotlin.jvm.internal.y;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

public final class bk2
implements r30.c {
    static final KProperty<Object>[] c;
    @NotNull
    private static final List<Integer> d;
    @NotNull
    private static final List<Integer> e;
    @NotNull
    private static final List<Integer> f;
    @NotNull
    private final String a;
    @NotNull
    private final ko1 b;

    static {
        List list;
        List list2;
        c = new KProperty[]{ga.a(bk2.class, (String)"cacheListener", (String)"getCacheListener()Lcom/monetization/ads/nativeads/video/cache/VideoCacheListener;", (int)0)};
        d = list2 = t.p((Object[])new Integer[]{3, 4});
        e = list = t.p((Object[])new Integer[]{1, 5});
        f = t.M0((Collection)list2, (Iterable)list);
    }

    public bk2(@NotNull String string2, @NotNull pe2 pe22) {
        this.a = string2;
        this.b = lo1.a((Object)pe22);
    }

    public final void a(@NotNull r30 r302, @NotNull p30 p302) {
        if (y.e(p302.a.b, this.a)) {
            pe2 pe22;
            if (d.contains(p302.b) && (pe22 = (pe2)this.b.getValue(this, c[0])) != null) {
                pe22.a();
            }
            if (e.contains(p302.b) && (pe22 = (pe2)this.b.getValue(this, c[0])) != null) {
                pe22.c();
            }
            if (f.contains(p302.b)) {
                r302.a((r30.c)this);
            }
        }
    }
}


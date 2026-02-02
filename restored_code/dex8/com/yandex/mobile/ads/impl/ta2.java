/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.bb2
 *  com.yandex.mobile.ads.impl.dc2
 *  com.yandex.mobile.ads.impl.ga2
 *  com.yandex.mobile.ads.impl.hq1
 *  com.yandex.mobile.ads.impl.nb2
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bb2;
import com.yandex.mobile.ads.impl.dc2;
import com.yandex.mobile.ads.impl.g43;
import com.yandex.mobile.ads.impl.ga2;
import com.yandex.mobile.ads.impl.hq1;
import com.yandex.mobile.ads.impl.la2;
import com.yandex.mobile.ads.impl.nb2;
import com.yandex.mobile.ads.impl.xb2;
import java.util.List;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;

public final class ta2
implements hq1<ga2> {
    @NotNull
    private final hq1<List<xb2>> a;
    @NotNull
    private final bb2 b;

    @JvmOverloads
    public ta2(@NotNull la2 la22, @NotNull bb2 bb22) {
        this.a = la22;
        this.b = bb22;
    }

    private static final void a(ta2 ta22, List list) {
        ta22.a.a((Object)list);
    }

    public static /* synthetic */ void b(ta2 ta22, List list) {
        ta2.a(ta22, list);
    }

    public final void a(@NotNull dc2 dc22) {
        this.a.a(dc22);
    }

    public final void a(@NotNull ga2 object) {
        object = object.b().b();
        this.b.a((List)object, (nb2)new g43(this, (List)object));
    }
}


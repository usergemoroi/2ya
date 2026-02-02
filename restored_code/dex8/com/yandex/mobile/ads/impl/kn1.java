/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.kn1$a
 *  com.yandex.mobile.ads.impl.nd2
 *  com.yandex.mobile.ads.impl.xg2
 *  kotlin.collections.t
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.kn1;
import com.yandex.mobile.ads.impl.nd2;
import com.yandex.mobile.ads.impl.xg2;
import com.yandex.mobile.ads.impl.yg2;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.t;
import org.jetbrains.annotations.NotNull;

public final class kn1
implements nd2 {
    @NotNull
    private final xg2 a;
    @NotNull
    private final List<a> b;

    public kn1(@NotNull yg2 yg22) {
        this.a = yg22;
        this.b = t.s((Object[])new a[]{new /* Unavailable Anonymous Inner Class!! */, new /* Unavailable Anonymous Inner Class!! */, new /* Unavailable Anonymous Inner Class!! */});
    }

    public final void a(long l10, long l11) {
        if (l10 != 0L) {
            Iterator<a> iterator = this.b.iterator();
            while (iterator.hasNext()) {
                a a13 = iterator.next();
                if (!(a13.a() * (float)l10 <= (float)l11)) continue;
                this.a.a(a13.b());
                iterator.remove();
            }
        }
    }
}


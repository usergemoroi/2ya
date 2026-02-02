/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.dc2
 *  com.yandex.mobile.ads.impl.hq1
 *  com.yandex.mobile.ads.impl.ke2
 *  com.yandex.mobile.ads.impl.op0
 *  kotlinx.coroutines.n
 *  kotlinx.coroutines.p
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.dc2;
import com.yandex.mobile.ads.impl.hq1;
import com.yandex.mobile.ads.impl.ke2;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.xb2;
import java.util.List;
import kotlin.u;
import kotlinx.coroutines.n;
import kotlinx.coroutines.p;
import org.jetbrains.annotations.NotNull;

public final class le2
implements hq1<List<? extends xb2>> {
    final n<ke2> a;

    le2(p p14) {
        this.a = p14;
    }

    public final void a(@NotNull dc2 dc22) {
        dc22.a();
        int n10 = op0.b;
        if (this.a.isActive()) {
            n<ke2> n13 = this.a;
            u.a a13 = u.d;
            n13.resumeWith(u.b((Object)new ke2.a(dc22)));
        }
    }

    public final void a(Object object) {
        object = (List)object;
        if (this.a.isActive()) {
            n<ke2> n10 = this.a;
            u.a a13 = u.d;
            n10.resumeWith(u.b((Object)new ke2.b((List<xb2>)object)));
        }
    }
}


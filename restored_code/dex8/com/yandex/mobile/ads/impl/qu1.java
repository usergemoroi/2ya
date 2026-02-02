/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.ev1
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.ve
 *  com.yandex.mobile.ads.impl.yc
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ev1;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.ve;
import com.yandex.mobile.ads.impl.yc;
import io.appmetrica.analytics.AppMetricaLibraryAdapter;
import kotlin.k0;
import kotlin.u;
import kotlin.v;
import org.jetbrains.annotations.NotNull;

public final class qu1
implements ev1 {
    @NotNull
    private final ve a;

    public qu1(@NotNull ve ve2) {
        this.a = ve2;
    }

    public final void a(@NotNull Context object) {
        Object object2 = this.a.a(object);
        yc.a.getClass();
        try {
            object = u.d;
            AppMetricaLibraryAdapter.setAdvIdentifiersTracking(object2.a());
            object = u.b(k0.a);
        }
        catch (Throwable throwable) {
            object2 = u.d;
            object = u.b(v.a(throwable));
        }
        if (u.e(object) != null) {
            int n10 = op0.b;
        }
    }
}


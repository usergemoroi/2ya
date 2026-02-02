/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.a71
 *  com.yandex.mobile.ads.impl.lq1
 *  com.yandex.mobile.ads.impl.lr1
 *  com.yandex.mobile.ads.impl.uc1
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.a71;
import com.yandex.mobile.ads.impl.e71;
import com.yandex.mobile.ads.impl.lq1;
import com.yandex.mobile.ads.impl.lr1;
import com.yandex.mobile.ads.impl.uc1;
import com.yandex.mobile.ads.impl.wp1;
import org.jetbrains.annotations.NotNull;

public final class y61
implements lq1<a71> {
    @NotNull
    private final lr1<a71> a;

    public /* synthetic */ y61(Context context, wp1 wp12) {
        this(new e71(context, wp12));
    }

    public y61(@NotNull lr1 lr12) {
        this.a = lr12;
    }

    public final Object a(uc1 uc12) {
        return (a71)this.a.a(uc12);
    }

    public final boolean a() {
        return true;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  com.yandex.mobile.ads.impl.af0
 *  com.yandex.mobile.ads.impl.sa0
 *  com.yandex.mobile.ads.impl.t
 *  com.yandex.mobile.ads.impl.v
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.impl.af0;
import com.yandex.mobile.ads.impl.ia0;
import com.yandex.mobile.ads.impl.sa0;
import com.yandex.mobile.ads.impl.t;
import com.yandex.mobile.ads.impl.v;
import org.jetbrains.annotations.NotNull;

public final class ja0
implements v<ia0> {
    @NotNull
    private final sa0 a;

    public ja0(@NotNull sa0 sa02) {
        this.a = sa02;
    }

    public final af0 a(View view, t t13) {
        t13 = (ia0)t13;
        view = view.getContext();
        this.a.a((Context)view, (ia0)t13);
        return new af0(false);
    }
}


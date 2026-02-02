/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  com.yandex.mobile.ads.impl.af0
 *  com.yandex.mobile.ads.impl.qy
 *  com.yandex.mobile.ads.impl.t
 *  com.yandex.mobile.ads.impl.v
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.impl.af0;
import com.yandex.mobile.ads.impl.my;
import com.yandex.mobile.ads.impl.qy;
import com.yandex.mobile.ads.impl.t;
import com.yandex.mobile.ads.impl.v;
import org.jetbrains.annotations.NotNull;

public final class ny
implements v<my> {
    @NotNull
    private final qy a;

    public ny(@NotNull qy qy3) {
        this.a = qy3;
    }

    public final af0 a(View view, t t13) {
        t13 = (my)t13;
        view = view.getContext();
        this.a.a((Context)view, (my)t13);
        return new af0(true);
    }
}


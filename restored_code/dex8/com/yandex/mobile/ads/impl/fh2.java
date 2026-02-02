/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  com.yandex.mobile.ads.impl.dh2
 *  com.yandex.mobile.ads.impl.ee2
 *  com.yandex.mobile.ads.impl.gi2
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.dh2;
import com.yandex.mobile.ads.impl.ee2;
import com.yandex.mobile.ads.impl.gi2;
import org.jetbrains.annotations.NotNull;

public final class fh2
implements ee2 {
    @NotNull
    private final dh2 a;

    public fh2(@NotNull dh2 dh22) {
        this.a = dh22;
    }

    public final boolean a() {
        View view = this.a.getView();
        boolean bl2 = view != null && !gi2.e((View)view) && gi2.a((View)view, (int)50);
        return bl2;
    }
}


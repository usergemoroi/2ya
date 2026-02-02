/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View$MeasureSpec
 *  com.yandex.mobile.ads.impl.ou0
 *  com.yandex.mobile.ads.impl.ou0$a
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.ou0;
import org.jetbrains.annotations.NotNull;

public final class x40
implements ou0 {
    @NotNull
    private final ou0.a a = new ou0.a();

    @NotNull
    public final ou0.a a(int n10, int n13) {
        n10 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0x40000000);
        ou0.a a14 = this.a;
        a14.a = n10;
        a14.b = n10;
        return a14;
    }
}


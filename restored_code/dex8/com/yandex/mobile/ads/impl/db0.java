/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View$MeasureSpec
 *  com.yandex.mobile.ads.impl.ou0
 *  com.yandex.mobile.ads.impl.ou0$a
 *  kotlin.math.a
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.ou0;
import kotlin.math.a;
import org.jetbrains.annotations.NotNull;

public final class db0
implements ou0 {
    @NotNull
    private final ou0.a a = new ou0.a();

    @NotNull
    public final ou0.a a(int n10, int n12) {
        n12 = kotlin.math.a.d((float)((float)View.MeasureSpec.getSize((int)n12) * 0.1f));
        ou0.a a12 = this.a;
        a12.a = n10;
        a12.b = View.MeasureSpec.makeMeasureSpec((int)n12, (int)0x40000000);
        return this.a;
    }
}


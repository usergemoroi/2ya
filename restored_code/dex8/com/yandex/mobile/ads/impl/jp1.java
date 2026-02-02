/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  com.yandex.mobile.ads.impl.dl$b
 *  com.yandex.mobile.ads.impl.ip1
 *  com.yandex.mobile.ads.impl.kp1
 *  com.yandex.mobile.ads.impl.lp1
 *  com.yandex.mobile.ads.impl.vb1
 */
package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import com.yandex.mobile.ads.impl.dl;
import com.yandex.mobile.ads.impl.ip1;
import com.yandex.mobile.ads.impl.kp1;
import com.yandex.mobile.ads.impl.lp1;
import com.yandex.mobile.ads.impl.vb1;
import org.jetbrains.annotations.NotNull;

public final class jp1
implements dl.b {
    final kp1 a;
    final vb1 b;
    final lp1 c;

    jp1(kp1 kp12, vb1 vb12, lp1 lp12) {
        this.a = kp12;
        this.b = vb12;
        this.c = lp12;
    }

    public final void a(@NotNull Bitmap bitmap) {
        ip1 ip12 = kp1.a((kp1)this.a);
        vb1 vb12 = this.b;
        lp1 lp12 = this.c;
        ip12.getClass();
        ip1.a((vb1)vb12, (lp1)lp12, (Bitmap)bitmap);
    }
}


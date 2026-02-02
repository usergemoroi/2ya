/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.ProgressBar
 *  com.yandex.mobile.ads.impl.n70
 *  com.yandex.mobile.ads.impl.nd2
 *  com.yandex.mobile.ads.impl.sl1
 *  com.yandex.mobile.ads.impl.xm0
 *  com.yandex.mobile.ads.impl.ym0
 *  com.yandex.mobile.ads.impl.zm0
 */
package com.yandex.mobile.ads.impl;

import android.widget.ProgressBar;
import com.yandex.mobile.ads.impl.n70;
import com.yandex.mobile.ads.impl.nd2;
import com.yandex.mobile.ads.impl.sl1;
import com.yandex.mobile.ads.impl.xm0;
import com.yandex.mobile.ads.impl.ym0;
import com.yandex.mobile.ads.impl.zm0;
import org.jetbrains.annotations.NotNull;

public final class yl1
implements nd2 {
    @NotNull
    private final zm0 a;
    @NotNull
    private final xm0 b;
    @NotNull
    private final sl1 c;

    public /* synthetic */ yl1(zm0 zm02) {
        this(zm02, new xm0(), new sl1());
    }

    public yl1(@NotNull zm0 zm02, @NotNull xm0 xm02, @NotNull sl1 sl12) {
        this.a = zm02;
        this.b = xm02;
        this.c = sl12;
    }

    public final void a(long l10, long l11) {
        ym0 ym02 = this.a.a();
        Object var7_4 = null;
        n70 n702 = ym02 != null ? ym02.b() : null;
        ym02 = var7_4;
        if (n702 != null) {
            this.b.getClass();
            n702 = n702.getAdUiElements();
            ym02 = var7_4;
            if (n702 != null) {
                ym02 = n702.j();
            }
        }
        if (ym02 != null) {
            this.c.a((ProgressBar)ym02, l11, l10);
        }
    }
}


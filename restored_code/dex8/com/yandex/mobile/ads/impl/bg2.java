/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.ProgressBar
 *  android.widget.TextView
 *  com.yandex.mobile.ads.impl.ku
 *  com.yandex.mobile.ads.impl.nd2
 *  com.yandex.mobile.ads.impl.rd
 *  com.yandex.mobile.ads.impl.vb1
 */
package com.yandex.mobile.ads.impl;

import android.widget.ProgressBar;
import android.widget.TextView;
import com.yandex.mobile.ads.impl.ch2;
import com.yandex.mobile.ads.impl.ku;
import com.yandex.mobile.ads.impl.nd2;
import com.yandex.mobile.ads.impl.rd;
import com.yandex.mobile.ads.impl.vb1;
import org.jetbrains.annotations.NotNull;

public final class bg2
implements nd2 {
    @NotNull
    private final ch2 a;
    @NotNull
    private final rd b;
    @NotNull
    private final ku c;

    public /* synthetic */ bg2(ch2 ch22) {
        this(ch22, new rd(), new ku());
    }

    public bg2(@NotNull ch2 ch22, @NotNull rd rd2, @NotNull ku ku2) {
        this.a = ch22;
        this.b = rd2;
        this.c = ku2;
    }

    public final void a(long l10, long l11) {
        vb1 vb12 = (vb1)this.a.b();
        if (vb12 != null) {
            Object object = vb12.a().a();
            Object var6_5 = null;
            if ((object = object != null ? object.getVideoProgress() : null) != null) {
                this.b.getClass();
                rd.a((ProgressBar)object, (long)l10, (long)l11);
            }
            vb12 = vb12.a().a();
            object = var6_5;
            if (vb12 != null) {
                object = vb12.getCountDownProgress();
            }
            if (object != null) {
                this.c.a((TextView)object, l10, l11);
            }
        }
    }
}


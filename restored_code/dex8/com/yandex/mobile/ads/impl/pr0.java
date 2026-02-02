/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ProgressBar
 *  com.yandex.mobile.ads.impl.cm1
 *  com.yandex.mobile.ads.impl.lo1
 *  com.yandex.mobile.ads.impl.or0
 *  com.yandex.mobile.ads.impl.rd
 *  kotlin.jvm.internal.e0
 *  kotlin.jvm.internal.f0
 *  kotlin.reflect.KProperty
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ProgressBar;
import com.yandex.mobile.ads.impl.cm1;
import com.yandex.mobile.ads.impl.ko1;
import com.yandex.mobile.ads.impl.lo1;
import com.yandex.mobile.ads.impl.or0;
import com.yandex.mobile.ads.impl.rd;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.v0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

public final class pr0
implements cm1 {
    static final KProperty<Object>[] d = new KProperty[]{v0.f((e0)new f0(pr0.class, "progressBar", "getProgressBar()Landroid/widget/ProgressBar;", 0))};
    @NotNull
    private final or0 a;
    @NotNull
    private final rd b;
    @NotNull
    private final ko1 c;

    public pr0() {
        this(0);
    }

    public /* synthetic */ pr0(int n10) {
        this(new or0(), new rd());
    }

    public pr0(@NotNull or0 or02, @NotNull rd rd2) {
        this.a = or02;
        this.b = rd2;
        this.c = lo1.a(null);
    }

    public final void a() {
        ProgressBar progressBar = (ProgressBar)this.c.getValue(this, d[0]);
        if (progressBar != null) {
            long l10 = progressBar.getMax();
            this.b.getClass();
            rd.a((ProgressBar)progressBar, (long)l10, (long)l10);
        }
    }

    public final void a(long l10, long l11) {
        ProgressBar progressBar = (ProgressBar)this.c.getValue(this, d[0]);
        if (progressBar != null) {
            this.b.getClass();
            rd.a((ProgressBar)progressBar, (long)l10, (long)l11);
        }
    }

    public final void a(@NotNull View object) {
        this.a.getClass();
        object = object.findViewWithTag((Object)"linear_progress_view");
        object = object instanceof ProgressBar ? (ProgressBar)object : null;
        this.c.setValue(this, d[0], object);
    }

    public final void b() {
        this.c.setValue(this, d[0], null);
    }
}


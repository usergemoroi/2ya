/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.MainThread
 *  com.yandex.mobile.ads.impl.ct0
 *  com.yandex.mobile.ads.impl.dp0
 *  com.yandex.mobile.ads.impl.et
 *  com.yandex.mobile.ads.impl.gt0
 *  com.yandex.mobile.ads.impl.i7
 *  com.yandex.mobile.ads.impl.k4
 *  com.yandex.mobile.ads.impl.tp0
 *  com.yandex.mobile.ads.impl.xa3
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.MainThread;
import com.yandex.mobile.ads.impl.cd0;
import com.yandex.mobile.ads.impl.ct0;
import com.yandex.mobile.ads.impl.dp0;
import com.yandex.mobile.ads.impl.et;
import com.yandex.mobile.ads.impl.gt0;
import com.yandex.mobile.ads.impl.hn2;
import com.yandex.mobile.ads.impl.i7;
import com.yandex.mobile.ads.impl.k4;
import com.yandex.mobile.ads.impl.sp0;
import com.yandex.mobile.ads.impl.tp0;
import com.yandex.mobile.ads.impl.up0;
import com.yandex.mobile.ads.impl.xa3;
import com.yandex.mobile.ads.impl.xn2;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class yj
implements up0 {
    @NotNull
    private final Context a;
    @NotNull
    private final gt0 b;
    @NotNull
    private final ct0 c;
    @NotNull
    private final tp0 d;
    @NotNull
    private final CopyOnWriteArrayList<sp0> e;
    @Nullable
    private et f;

    @JvmOverloads
    public yj(@NotNull Context context, @NotNull xn2 xn22, @NotNull gt0 gt02, @NotNull ct0 ct02, @NotNull tp0 tp02) {
        this.a = context;
        this.b = gt02;
        this.c = ct02;
        this.d = tp02;
        this.e = new CopyOnWriteArrayList();
    }

    private static final void a(yj yj3, i7 i74) {
        sp0 sp02 = yj3.d.a(yj3.a, (k4)yj3, i74, null);
        yj3.e.add(sp02);
        sp02.a(i74.a());
        sp02.a(yj3.f);
        sp02.b(i74);
    }

    public static /* synthetic */ void b(yj yj3, i7 i74) {
        yj.a(yj3, i74);
    }

    @Override
    @MainThread
    public final void a() {
        this.b.a();
        this.c.a();
        for (sp0 sp02 : this.e) {
            sp02.a((et)null);
            sp02.d();
        }
        this.e.clear();
    }

    public final void a(cd0 cd02) {
        cd02 = (sp0)cd02;
        if (this.f == null) {
            dp0.c((String)"InterstitialAdLoader. InterstitialAdLoadListener is null on finished ad loading. Please, keep active listener until ad loading finished or use cancelLoading().", (Object[])new Object[0]);
        }
        ((sp0)cd02).a((et)null);
        this.e.remove(cd02);
    }

    @Override
    @MainThread
    public final void a(@Nullable hn2 hn22) {
        this.b.a();
        this.f = hn22;
        Iterator<sp0> iterator = this.e.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(hn22);
        }
    }

    @Override
    @MainThread
    public final void a(@NotNull i7 i74) {
        this.b.a();
        if (this.f == null) {
            dp0.c((String)"InterstitialAdLoader. InterstitialAdLoadListener is null on loading start. Please, use setAdLoadListener before loading Ad.", (Object[])new Object[0]);
        }
        this.c.a((Runnable)new xa3(this, i74));
    }
}


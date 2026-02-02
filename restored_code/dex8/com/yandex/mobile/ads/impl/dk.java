/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.MainThread
 *  com.yandex.mobile.ads.impl.ct0
 *  com.yandex.mobile.ads.impl.dp0
 *  com.yandex.mobile.ads.impl.ds2
 *  com.yandex.mobile.ads.impl.gt0
 *  com.yandex.mobile.ads.impl.hs1
 *  com.yandex.mobile.ads.impl.i7
 *  com.yandex.mobile.ads.impl.k4
 *  com.yandex.mobile.ads.impl.yt
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.MainThread;
import com.yandex.mobile.ads.impl.cd0;
import com.yandex.mobile.ads.impl.ct0;
import com.yandex.mobile.ads.impl.dp0;
import com.yandex.mobile.ads.impl.ds2;
import com.yandex.mobile.ads.impl.gs1;
import com.yandex.mobile.ads.impl.gt0;
import com.yandex.mobile.ads.impl.hs1;
import com.yandex.mobile.ads.impl.i7;
import com.yandex.mobile.ads.impl.is1;
import com.yandex.mobile.ads.impl.k4;
import com.yandex.mobile.ads.impl.wn2;
import com.yandex.mobile.ads.impl.xn2;
import com.yandex.mobile.ads.impl.yt;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class dk
implements is1 {
    @NotNull
    private final Context a;
    @NotNull
    private final gt0 b;
    @NotNull
    private final ct0 c;
    @NotNull
    private final hs1 d;
    @NotNull
    private final CopyOnWriteArrayList<gs1> e;
    @Nullable
    private yt f;

    @JvmOverloads
    public dk(@NotNull Context context, @NotNull xn2 xn22, @NotNull gt0 gt02, @NotNull ct0 ct02, @NotNull hs1 hs12) {
        this.a = context;
        this.b = gt02;
        this.c = ct02;
        this.d = hs12;
        this.e = new CopyOnWriteArrayList();
    }

    private static final void a(dk dk2, i7 i73) {
        gs1 gs12 = dk2.d.a(dk2.a, (k4)dk2, i73, null);
        dk2.e.add(gs12);
        gs12.a(i73.a());
        gs12.a(dk2.f);
        gs12.b(i73);
    }

    public static /* synthetic */ void b(dk dk2, i7 i73) {
        dk.a(dk2, i73);
    }

    @Override
    @MainThread
    public final void a() {
        this.b.a();
        this.c.a();
        for (gs1 gs12 : this.e) {
            gs12.a((yt)null);
            gs12.d();
        }
        this.e.clear();
    }

    public final void a(cd0 cd02) {
        cd02 = (gs1)cd02;
        if (this.f == null) {
            dp0.c((String)"RewardedAdLoader. RewardedAdLoadListener is null on finished ad loading. Please, keep active listener until ad loading finished or use cancelLoading().", (Object[])new Object[0]);
        }
        ((gs1)cd02).a((yt)null);
        this.e.remove(cd02);
    }

    @Override
    @MainThread
    public final void a(@NotNull i7 i73) {
        this.b.a();
        if (this.f == null) {
            dp0.c((String)"RewardedAdLoader. RewardedAdLoadListener is on loading start. Please, use setAdLoadListener before loading Ad.", (Object[])new Object[0]);
        }
        this.c.a((Runnable)new ds2(this, i73));
    }

    @Override
    @MainThread
    public final void a(@Nullable wn2 wn22) {
        this.b.a();
        this.f = wn22;
        Iterator<gs1> iterator = this.e.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(wn22);
        }
    }
}


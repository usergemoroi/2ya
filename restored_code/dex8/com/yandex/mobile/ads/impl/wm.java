/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.MainThread
 *  com.yandex.mobile.ads.impl.bq0
 *  com.yandex.mobile.ads.impl.ct
 *  com.yandex.mobile.ads.impl.ct0
 *  com.yandex.mobile.ads.impl.dp0
 *  com.yandex.mobile.ads.impl.et
 *  com.yandex.mobile.ads.impl.f3
 *  com.yandex.mobile.ads.impl.f73
 *  com.yandex.mobile.ads.impl.fd0
 *  com.yandex.mobile.ads.impl.g73
 *  com.yandex.mobile.ads.impl.gt0
 *  com.yandex.mobile.ads.impl.i7
 *  com.yandex.mobile.ads.impl.k4
 *  com.yandex.mobile.ads.impl.tp0
 *  com.yandex.mobile.ads.impl.zk1
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.MainThread;
import com.yandex.mobile.ads.impl.bq0;
import com.yandex.mobile.ads.impl.cd0;
import com.yandex.mobile.ads.impl.ct;
import com.yandex.mobile.ads.impl.ct0;
import com.yandex.mobile.ads.impl.dp0;
import com.yandex.mobile.ads.impl.et;
import com.yandex.mobile.ads.impl.f3;
import com.yandex.mobile.ads.impl.f73;
import com.yandex.mobile.ads.impl.fd0;
import com.yandex.mobile.ads.impl.g73;
import com.yandex.mobile.ads.impl.gt0;
import com.yandex.mobile.ads.impl.hn2;
import com.yandex.mobile.ads.impl.i7;
import com.yandex.mobile.ads.impl.k4;
import com.yandex.mobile.ads.impl.lj;
import com.yandex.mobile.ads.impl.sp0;
import com.yandex.mobile.ads.impl.tp0;
import com.yandex.mobile.ads.impl.up0;
import com.yandex.mobile.ads.impl.xn2;
import com.yandex.mobile.ads.impl.zk1;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class wm
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
    private final bq0 e;
    @NotNull
    private final zk1 f;
    @NotNull
    private final CopyOnWriteArrayList<sp0> g;
    @Nullable
    private et h;

    @JvmOverloads
    public wm(@NotNull Context context, @NotNull xn2 xn22, @NotNull gt0 gt02, @NotNull ct0 ct02, @NotNull tp0 tp02, @NotNull bq0 bq02, @NotNull zk1 zk12) {
        this.a = context;
        this.b = gt02;
        this.c = ct02;
        this.d = tp02;
        this.e = bq02;
        this.f = zk12;
        this.g = new CopyOnWriteArrayList();
    }

    @MainThread
    private final void a(i7 i74, et et3, String object) {
        i74 = i7.a((i7)i74, null, (String)object, (int)2047);
        object = new a(this, i74);
        object = this.d.a(this.a, (k4)this, i74, (fd0)object);
        this.g.add((sp0)object);
        ((sp0)object).a(i74.a());
        ((sp0)object).a(et3);
        ((lj)object).b(i74);
    }

    @MainThread
    private final void b(i7 i74) {
        this.c.a((Runnable)new f73(this, i74));
    }

    private static final void b(wm wm2, i7 i74) {
        wm2.f.getClass();
        if (zk1.a((i7)i74)) {
            ct ct3 = wm2.e.a(i74);
            if (ct3 != null) {
                wm2 = wm2.h;
                if (wm2 != null) {
                    wm2.a(ct3);
                }
            } else {
                wm2.a(i74, new c(wm2), "default");
            }
        } else {
            wm2.a(i74, new c(wm2), "default");
        }
    }

    private static final void c(wm wm2, i7 i74) {
        wm2.f.getClass();
        if (zk1.a((i7)i74) && wm2.e.c()) {
            wm2.a(i74, new b(wm2, i74), "render");
        }
    }

    public static /* synthetic */ void d(wm wm2, i7 i74) {
        wm.b(wm2, i74);
    }

    public static /* synthetic */ void e(wm wm2, i7 i74) {
        wm.c(wm2, i74);
    }

    @Override
    @MainThread
    public final void a() {
        this.b.a();
        this.c.a();
        for (sp0 sp02 : this.g) {
            sp02.a((et)null);
            sp02.d();
        }
        this.g.clear();
    }

    public final void a(cd0 cd02) {
        cd02 = (sp0)cd02;
        if (this.h == null) {
            dp0.c((String)"InterstitialAdLoader. InterstitialAdLoadListener is null on finished ad loading. Please, keep active listener until ad loading finished or use cancelLoading().", (Object[])new Object[0]);
        }
        ((sp0)cd02).a((et)null);
        this.g.remove(cd02);
    }

    @Override
    @MainThread
    public final void a(@Nullable hn2 hn22) {
        this.b.a();
        this.h = hn22;
    }

    @Override
    @MainThread
    public final void a(@NotNull i7 i74) {
        this.b.a();
        if (this.h == null) {
            dp0.c((String)"InterstitialAdLoader. InterstitialAdLoadListener is null on loading start. Please, use setAdLoadListener before loading Ad.", (Object[])new Object[0]);
        }
        this.c.a((Runnable)new g73(this, i74));
    }

    public final class a
    implements fd0 {
        @NotNull
        private final i7 a;
        final wm b;

        public a(wm wm2, @NotNull i7 i74) {
            this.b = wm2;
            this.a = i74;
        }

        public final void onAdShown() {
            this.b.b(this.a);
        }
    }

    public final class b
    implements et {
        @NotNull
        private final i7 a;
        final wm b;

        public b(wm wm2, @NotNull i7 i74) {
            this.b = wm2;
            this.a = i74;
        }

        public final void a(@NotNull ct ct3) {
            this.b.e.a(this.a, ct3);
        }

        public final void a(@NotNull f3 f34) {
        }
    }

    public final class c
    implements et {
        final wm a;

        public c(wm wm2) {
            this.a = wm2;
        }

        public final void a(@NotNull ct ct3) {
            et et3 = this.a.h;
            if (et3 != null) {
                et3.a(ct3);
            }
        }

        public final void a(@NotNull f3 f34) {
            et et3 = this.a.h;
            if (et3 != null) {
                et3.a(f34);
            }
        }
    }
}


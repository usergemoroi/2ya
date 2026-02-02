/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.MainThread
 *  com.yandex.mobile.ads.impl.ct0
 *  com.yandex.mobile.ads.impl.dp0
 *  com.yandex.mobile.ads.impl.f3
 *  com.yandex.mobile.ads.impl.fd0
 *  com.yandex.mobile.ads.impl.gt0
 *  com.yandex.mobile.ads.impl.hs1
 *  com.yandex.mobile.ads.impl.i7
 *  com.yandex.mobile.ads.impl.k4
 *  com.yandex.mobile.ads.impl.la3
 *  com.yandex.mobile.ads.impl.ma3
 *  com.yandex.mobile.ads.impl.us1
 *  com.yandex.mobile.ads.impl.wt
 *  com.yandex.mobile.ads.impl.yt
 *  com.yandex.mobile.ads.impl.zk1
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.MainThread;
import com.yandex.mobile.ads.impl.cd0;
import com.yandex.mobile.ads.impl.ct0;
import com.yandex.mobile.ads.impl.dp0;
import com.yandex.mobile.ads.impl.f3;
import com.yandex.mobile.ads.impl.fd0;
import com.yandex.mobile.ads.impl.gs1;
import com.yandex.mobile.ads.impl.gt0;
import com.yandex.mobile.ads.impl.hs1;
import com.yandex.mobile.ads.impl.i7;
import com.yandex.mobile.ads.impl.is1;
import com.yandex.mobile.ads.impl.k4;
import com.yandex.mobile.ads.impl.la3;
import com.yandex.mobile.ads.impl.lj;
import com.yandex.mobile.ads.impl.ma3;
import com.yandex.mobile.ads.impl.us1;
import com.yandex.mobile.ads.impl.wn2;
import com.yandex.mobile.ads.impl.wt;
import com.yandex.mobile.ads.impl.xn2;
import com.yandex.mobile.ads.impl.yt;
import com.yandex.mobile.ads.impl.zk1;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class xm
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
    private final us1 e;
    @NotNull
    private final zk1 f;
    @NotNull
    private final CopyOnWriteArrayList<gs1> g;
    @Nullable
    private yt h;

    @JvmOverloads
    public xm(@NotNull Context context, @NotNull xn2 xn22, @NotNull gt0 gt02, @NotNull ct0 ct02, @NotNull hs1 hs12, @NotNull us1 us12, @NotNull zk1 zk12) {
        this.a = context;
        this.b = gt02;
        this.c = ct02;
        this.d = hs12;
        this.e = us12;
        this.f = zk12;
        this.g = new CopyOnWriteArrayList();
    }

    @MainThread
    private final void a(i7 i74, yt yt2, String object) {
        i74 = i7.a((i7)i74, null, (String)object, (int)2047);
        object = new c(this, i74);
        object = this.d.a(this.a, (k4)this, i74, (fd0)object);
        this.g.add((gs1)object);
        ((gs1)object).a(i74.a());
        ((gs1)object).a(yt2);
        ((lj)object).b(i74);
    }

    @MainThread
    private final void b(i7 i74) {
        this.c.a((Runnable)new ma3(this, i74));
    }

    private static final void b(xm xm3, i7 i74) {
        xm3.f.getClass();
        if (zk1.a((i7)i74)) {
            wt wt2 = xm3.e.a(i74);
            if (wt2 != null) {
                xm3 = xm3.h;
                if (xm3 != null) {
                    xm3.a(wt2);
                }
            } else {
                xm3.a(i74, new b(xm3), "default");
            }
        } else {
            xm3.a(i74, new b(xm3), "default");
        }
    }

    private static final void c(xm xm3, i7 i74) {
        xm3.f.getClass();
        if (zk1.a((i7)i74) && xm3.e.c()) {
            xm3.a(i74, new a(xm3, i74), "render");
        }
    }

    public static /* synthetic */ void d(xm xm3, i7 i74) {
        xm.b(xm3, i74);
    }

    public static /* synthetic */ void e(xm xm3, i7 i74) {
        xm.c(xm3, i74);
    }

    @Override
    @MainThread
    public final void a() {
        this.b.a();
        this.c.a();
        for (gs1 gs12 : this.g) {
            gs12.a((yt)null);
            gs12.d();
        }
        this.g.clear();
    }

    public final void a(cd0 cd02) {
        cd02 = (gs1)cd02;
        if (this.h == null) {
            dp0.c((String)"RewardedAdLoader. RewardedAdLoadListener is null on finished ad loading. Please, keep active listener until ad loading finished or use cancelLoading().", (Object[])new Object[0]);
        }
        ((gs1)cd02).a((yt)null);
        this.g.remove(cd02);
    }

    @Override
    @MainThread
    public final void a(@NotNull i7 i74) {
        this.b.a();
        if (this.h == null) {
            dp0.c((String)"RewardedAdLoader. RewardedAdLoadListener is on loading start. Please, use setAdLoadListener before loading Ad.", (Object[])new Object[0]);
        }
        this.c.a((Runnable)new la3(this, i74));
    }

    @Override
    @MainThread
    public final void a(@Nullable wn2 wn22) {
        this.b.a();
        this.h = wn22;
    }

    public final class a
    implements yt {
        @NotNull
        private final i7 a;
        final xm b;

        public a(xm xm3, @NotNull i7 i74) {
            this.b = xm3;
            this.a = i74;
        }

        public final void a(@NotNull f3 f34) {
        }

        public final void a(@NotNull wt wt2) {
            this.b.e.a(this.a, wt2);
        }
    }

    public final class b
    implements yt {
        final xm a;

        public b(xm xm3) {
            this.a = xm3;
        }

        public final void a(@NotNull f3 f34) {
            yt yt2 = this.a.h;
            if (yt2 != null) {
                yt2.a(f34);
            }
        }

        public final void a(@NotNull wt wt2) {
            yt yt2 = this.a.h;
            if (yt2 != null) {
                yt2.a(wt2);
            }
        }
    }

    public final class c
    implements fd0 {
        @NotNull
        private final i7 a;
        final xm b;

        public c(xm xm3, @NotNull i7 i74) {
            this.b = xm3;
            this.a = i74;
        }

        public final void onAdShown() {
            this.b.b(this.a);
        }
    }
}


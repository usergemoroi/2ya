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
 *  com.yandex.mobile.ads.impl.i7
 *  com.yandex.mobile.ads.impl.js
 *  com.yandex.mobile.ads.impl.k4
 *  com.yandex.mobile.ads.impl.l43
 *  com.yandex.mobile.ads.impl.lf
 *  com.yandex.mobile.ads.impl.ls
 *  com.yandex.mobile.ads.impl.m43
 *  com.yandex.mobile.ads.impl.mf
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
import com.yandex.mobile.ads.impl.gm2;
import com.yandex.mobile.ads.impl.gt0;
import com.yandex.mobile.ads.impl.i7;
import com.yandex.mobile.ads.impl.if;
import com.yandex.mobile.ads.impl.jf;
import com.yandex.mobile.ads.impl.js;
import com.yandex.mobile.ads.impl.k4;
import com.yandex.mobile.ads.impl.l43;
import com.yandex.mobile.ads.impl.lf;
import com.yandex.mobile.ads.impl.lj;
import com.yandex.mobile.ads.impl.ls;
import com.yandex.mobile.ads.impl.m43;
import com.yandex.mobile.ads.impl.mf;
import com.yandex.mobile.ads.impl.xn2;
import com.yandex.mobile.ads.impl.zk1;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@MainThread
public final class tm
implements jf {
    @NotNull
    private final Context a;
    @NotNull
    private final gt0 b;
    @NotNull
    private final ct0 c;
    @NotNull
    private final lf d;
    @NotNull
    private final mf e;
    @NotNull
    private final zk1 f;
    @NotNull
    private final CopyOnWriteArrayList<if> g;
    @Nullable
    private ls h;

    @JvmOverloads
    public tm(@NotNull Context context, @NotNull xn2 xn22, @NotNull gt0 gt02, @NotNull ct0 ct02, @NotNull lf lf3, @NotNull mf mf2, @NotNull zk1 zk12) {
        this.a = context;
        this.b = gt02;
        this.c = ct02;
        this.d = lf3;
        this.e = mf2;
        this.f = zk12;
        this.g = new CopyOnWriteArrayList();
    }

    @MainThread
    private final void a(i7 i73, ls ls3, String object) {
        i73 = i7.a((i7)i73, null, (String)object, (int)2047);
        object = new a(this, i73);
        object = this.d.a(this.a, (k4)this, i73, (fd0)object);
        this.g.add((if)object);
        ((lj)object).a(i73.a());
        ((if)object).a(ls3);
        ((lj)object).b(i73);
    }

    @MainThread
    private final void b(i7 i73) {
        this.c.a((Runnable)new m43(this, i73));
    }

    private static final void b(tm tm3, i7 i73) {
        tm3.f.getClass();
        if (zk1.a((i7)i73)) {
            js js3 = tm3.e.a(i73);
            if (js3 != null) {
                tm3 = tm3.h;
                if (tm3 != null) {
                    tm3.a(js3);
                }
            } else {
                tm3.a(i73, new c(tm3), "default");
            }
        } else {
            tm3.a(i73, new c(tm3), "default");
        }
    }

    private static final void c(tm tm3, i7 i73) {
        tm3.f.getClass();
        if (zk1.a((i7)i73) && tm3.e.c()) {
            tm3.a(i73, new b(tm3, i73), "render");
        }
    }

    public static /* synthetic */ void d(tm tm3, i7 i73) {
        tm.b(tm3, i73);
    }

    public static /* synthetic */ void e(tm tm3, i7 i73) {
        tm.c(tm3, i73);
    }

    @Override
    @MainThread
    public final void a() {
        this.b.a();
        this.c.a();
        for (if if_ : this.g) {
            if_.a((ls)null);
            if_.d();
        }
        this.g.clear();
    }

    public final void a(cd0 cd02) {
        cd02 = (if)cd02;
        if (this.h == null) {
            dp0.c((String)"AppOpenAdLoader. AppOpenAdLoadListener is null on finished ad loading. Please, keep active listener until ad loading finished or use cancelLoading().", (Object[])new Object[0]);
        }
        ((if)cd02).a((ls)null);
        this.g.remove(cd02);
    }

    @Override
    @MainThread
    public final void a(@Nullable gm2 gm22) {
        this.b.a();
        this.h = gm22;
    }

    @Override
    @MainThread
    public final void a(@NotNull i7 i73) {
        this.b.a();
        if (this.h == null) {
            dp0.c((String)"AppOpenAdLoader. AppOpenAdLoadListener is null on loading start. Please, use setAdLoadListener before loading Ad.", (Object[])new Object[0]);
        }
        this.c.a((Runnable)new l43(this, i73));
    }

    public final class a
    implements fd0 {
        @NotNull
        private final i7 a;
        final tm b;

        public a(tm tm3, @NotNull i7 i73) {
            this.b = tm3;
            this.a = i73;
        }

        public final void onAdShown() {
            this.b.b(this.a);
        }
    }

    public final class b
    implements ls {
        @NotNull
        private final i7 a;
        final tm b;

        public b(tm tm3, @NotNull i7 i73) {
            this.b = tm3;
            this.a = i73;
        }

        public final void a(@NotNull f3 f34) {
        }

        public final void a(@NotNull js js3) {
            this.b.e.a(this.a, js3);
        }
    }

    public final class c
    implements ls {
        final tm a;

        public c(tm tm3) {
            this.a = tm3;
        }

        public final void a(@NotNull f3 f34) {
            ls ls3 = this.a.h;
            if (ls3 != null) {
                ls3.a(f34);
            }
        }

        public final void a(@NotNull js js3) {
            ls ls3 = this.a.h;
            if (ls3 != null) {
                ls3.a(js3);
            }
        }
    }
}


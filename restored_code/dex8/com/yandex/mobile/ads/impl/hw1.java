/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.ViewGroup
 *  android.view.ViewTreeObserver$OnPreDrawListener
 *  com.yandex.mobile.ads.impl.a71
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.bu1
 *  com.yandex.mobile.ads.impl.dp0
 *  com.yandex.mobile.ads.impl.ev2
 *  com.yandex.mobile.ads.impl.f3
 *  com.yandex.mobile.ads.impl.g61
 *  com.yandex.mobile.ads.impl.gi2
 *  com.yandex.mobile.ads.impl.gr1
 *  com.yandex.mobile.ads.impl.gv1
 *  com.yandex.mobile.ads.impl.gv2
 *  com.yandex.mobile.ads.impl.hv2
 *  com.yandex.mobile.ads.impl.iz1
 *  com.yandex.mobile.ads.impl.j7
 *  com.yandex.mobile.ads.impl.jp0
 *  com.yandex.mobile.ads.impl.kh2
 *  com.yandex.mobile.ads.impl.kz1
 *  com.yandex.mobile.ads.impl.mi
 *  com.yandex.mobile.ads.impl.ni
 *  com.yandex.mobile.ads.impl.nr
 *  com.yandex.mobile.ads.impl.o4
 *  com.yandex.mobile.ads.impl.pw1
 *  com.yandex.mobile.ads.impl.pw1$a
 *  com.yandex.mobile.ads.impl.ra
 *  com.yandex.mobile.ads.impl.t61
 *  com.yandex.mobile.ads.impl.v71
 *  com.yandex.mobile.ads.impl.vi
 *  com.yandex.mobile.ads.impl.w71
 *  com.yandex.mobile.ads.impl.w8
 *  com.yandex.mobile.ads.impl.wi
 *  com.yandex.mobile.ads.impl.y91
 *  com.yandex.mobile.ads.impl.y91$b
 *  kotlin.collections.t
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.yandex.mobile.ads.impl.a71;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.bu1;
import com.yandex.mobile.ads.impl.c02;
import com.yandex.mobile.ads.impl.c81;
import com.yandex.mobile.ads.impl.dp0;
import com.yandex.mobile.ads.impl.ev2;
import com.yandex.mobile.ads.impl.f3;
import com.yandex.mobile.ads.impl.fv2;
import com.yandex.mobile.ads.impl.g61;
import com.yandex.mobile.ads.impl.gi2;
import com.yandex.mobile.ads.impl.gr1;
import com.yandex.mobile.ads.impl.gv1;
import com.yandex.mobile.ads.impl.gv2;
import com.yandex.mobile.ads.impl.hv2;
import com.yandex.mobile.ads.impl.iz1;
import com.yandex.mobile.ads.impl.j7;
import com.yandex.mobile.ads.impl.ji;
import com.yandex.mobile.ads.impl.jp0;
import com.yandex.mobile.ads.impl.kh2;
import com.yandex.mobile.ads.impl.kz1;
import com.yandex.mobile.ads.impl.li;
import com.yandex.mobile.ads.impl.mi;
import com.yandex.mobile.ads.impl.ni;
import com.yandex.mobile.ads.impl.nr;
import com.yandex.mobile.ads.impl.o4;
import com.yandex.mobile.ads.impl.pw1;
import com.yandex.mobile.ads.impl.ra;
import com.yandex.mobile.ads.impl.t61;
import com.yandex.mobile.ads.impl.v71;
import com.yandex.mobile.ads.impl.vi;
import com.yandex.mobile.ads.impl.w71;
import com.yandex.mobile.ads.impl.w8;
import com.yandex.mobile.ads.impl.wi;
import com.yandex.mobile.ads.impl.y91;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.t;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class hw1
implements ni {
    @NotNull
    private final ji a;
    @NotNull
    private final y91 b;
    @NotNull
    private final wi c;
    @NotNull
    private final v71 d;
    @NotNull
    private final bu1 e;
    @NotNull
    private final c81 f;
    @NotNull
    private final Handler g;
    @NotNull
    private final pw1 h;
    @NotNull
    private final li i;
    @NotNull
    private final g61 j;
    @NotNull
    private final nr k;
    @NotNull
    private final ViewTreeObserver.OnPreDrawListener l;
    @Nullable
    private b8<String> m;
    @Nullable
    private t61 n;
    private boolean o;
    @Nullable
    private vi p;

    public /* synthetic */ hw1(ji ji3, gv1 gv12) {
        y91 y912 = new y91(ji3.k(), gv12, ji3.e(), ji3.h());
        wi wi2 = new wi(ji3.e());
        v71 v712 = new v71(ji3.e());
        bu1 bu12 = new bu1(ji3.e());
        c81 c812 = new c81(ji3);
        Handler handler = new Handler(Looper.getMainLooper());
        int n10 = pw1.l;
        this(ji3, gv12, y912, wi2, v712, bu12, c812, handler, pw1.a.a(), new li(), new g61(), new fv2(ji3));
    }

    public hw1(@NotNull ji ji3, @NotNull gv1 gv12, @NotNull y91 y912, @NotNull wi wi2, @NotNull v71 v712, @NotNull bu1 bu12, @NotNull c81 c812, @NotNull Handler handler, @NotNull pw1 pw12, @NotNull li li3, @NotNull g61 g612, @NotNull nr nr2) {
        this.a = ji3;
        this.b = y912;
        this.c = wi2;
        this.d = v712;
        this.e = bu12;
        this.f = c812;
        this.g = handler;
        this.h = pw12;
        this.i = li3;
        this.j = g612;
        this.k = nr2;
        this.l = new ev2(this);
    }

    private static final void a(ji ji3) {
        ji3.d();
    }

    public static final void f(hw1 hw12) {
        hw12.m = null;
        hw12.n = null;
    }

    private static final boolean g(hw1 hw12) {
        hw12.g.postDelayed((Runnable)new gv2(hw12), 50L);
        return true;
    }

    private static final void h(hw1 hw12) {
        kh2.a((ViewGroup)hw12.a.B(), (boolean)false);
    }

    public static /* synthetic */ void i(hw1 hw12) {
        hw1.h(hw12);
    }

    public static /* synthetic */ void j(ji ji3) {
        hw1.a(ji3);
    }

    public static /* synthetic */ boolean k(hw1 hw12) {
        return hw1.g(hw12);
    }

    @NotNull
    public final List<ra> a() {
        Object object = this.j;
        Object object2 = this.n;
        object.getClass();
        if (object2 instanceof c02) {
            object = ((c02)object2).e();
            object2 = new ArrayList(t.x((Iterable)object, (int)10));
            Iterator iterator = ((ArrayList)object).iterator();
            while (true) {
                object = object2;
                if (iterator.hasNext()) {
                    ((ArrayList)object2).add(((t61)iterator.next()).a());
                    continue;
                }
                break;
            }
        } else {
            object = object2 != null ? object2.a() : null;
            object = t.e((Object)object);
        }
        return t.o0((Iterable)object);
    }

    public final void a(@NotNull Context context) {
        context = this.p;
        if (context != null) {
            context.a();
        }
        this.b.a();
        this.m = null;
        this.n = null;
        this.o = true;
    }

    public final void a(@NotNull Context object, @NotNull b8<String> b82) {
        this.a.h().a(o4.c, null);
        Object object2 = this.h.a(object);
        if (object2 != null && object2.u0()) {
            if (!this.o) {
                object2 = this.a.p();
                iz1 iz12 = b82.N();
                this.m = b82;
                if (object2 != null && kz1.a((Context)object, b82, (iz1)iz12, (w8)this.i, (iz1)object2)) {
                    object2 = new b(this);
                    object = new a(this, (Context)object, b82);
                    this.b.a(b82, (y91.b)object2, (gr1)object);
                } else {
                    int n10 = object2 != null ? object2.c(object) : 0;
                    int n13 = object2 != null ? object2.a(object) : 0;
                    object = j7.a((int)n10, (int)n13, (int)iz12.getWidth(), (int)iz12.getHeight(), (int)gi2.d((Context)object), (int)gi2.b((Context)object));
                    dp0.a((String)object.d(), (Object[])new Object[0]);
                    this.a.b((f3)object);
                }
            }
        } else {
            this.a.b(j7.x());
        }
    }

    public final void b() {
        if (!this.o) {
            t61 t612;
            b8<String> b82 = this.m;
            jp0 jp02 = this.a.B();
            if (b82 != null && (t612 = this.n) != null) {
                y.h(t612, "null cannot be cast to non-null type com.monetization.ads.nativeads.NativeAdPrivate");
                jp02 = this.c.a(this.a.k(), b82, t612, jp02, this.f, this.l, this.a.D(), this.k);
                this.p = jp02;
                jp02.a(b82.N(), new mi(this){
                    final hw1 a;
                    {
                        this.a = hw12;
                    }

                    public final void a() {
                        this.a.a.t();
                    }

                    public final void a(@NotNull f3 f33) {
                        this.a.a.b(f33);
                    }
                });
            }
        } else {
            this.a.b(j7.i());
        }
    }

    @Nullable
    public final String getAdInfo() {
        return this.j.a(this.n);
    }

    public final class a
    implements gr1 {
        @NotNull
        private final Context a;
        @NotNull
        private final b8<?> b;
        final hw1 c;

        public a(hw1 hw12, @NotNull Context context, @NotNull b8<?> b82) {
            this.c = hw12;
            this.a = context;
            this.b = b82;
        }

        public final void a(@NotNull a71 a712) {
            a712 = new w71(this.b, a712, this.c.a.e());
            this.c.e.a(this.a, this.b, this.c.d);
            this.c.e.a(this.a, this.b, (w71)a712);
        }

        public final void a(@NotNull f3 f33) {
            this.c.e.a(this.a, this.b, this.c.d);
            this.c.e.a(this.a, this.b, null);
        }
    }

    public final class b
    implements y91.b {
        final hw1 a;

        public b(hw1 hw12) {
            this.a = hw12;
        }

        private static final void a(hw1 hw12) {
            hw12.b();
        }

        public static /* synthetic */ void b(hw1 hw12) {
            com.yandex.mobile.ads.impl.hw1$b.a(hw12);
        }

        public final void a(@NotNull f3 f33) {
            if (!this.a.o) {
                hw1.f(this.a);
                this.a.a.b(f33);
            }
        }

        public final void a(@NotNull t61 t612) {
            if (!this.a.o) {
                this.a.n = t612;
                this.a.g.post((Runnable)new hv2(this.a));
            }
        }
    }
}


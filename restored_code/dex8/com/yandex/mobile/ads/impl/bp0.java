/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.cx
 *  com.yandex.mobile.ads.impl.de0
 *  com.yandex.mobile.ads.impl.ee0
 *  com.yandex.mobile.ads.impl.fe0
 *  com.yandex.mobile.ads.impl.ge0
 *  com.yandex.mobile.ads.impl.he0
 *  com.yandex.mobile.ads.impl.s9
 *  com.yandex.mobile.ads.impl.sh2
 *  com.yandex.mobile.ads.impl.ux
 *  com.yandex.mobile.ads.impl.v9
 *  com.yandex.mobile.ads.impl.vx
 *  com.yandex.mobile.ads.impl.xw
 *  com.yandex.mobile.ads.impl.xx
 *  com.yandex.mobile.ads.impl.xz0
 *  com.yandex.mobile.ads.impl.y32
 *  com.yandex.mobile.ads.impl.y9
 *  com.yandex.mobile.ads.impl.zk0
 *  kotlin.collections.t
 *  kotlin.coroutines.intrinsics.b
 *  kotlin.jvm.functions.p
 *  kotlinx.coroutines.channels.g
 *  kotlinx.coroutines.d2
 *  kotlinx.coroutines.flow.c0
 *  kotlinx.coroutines.flow.q0
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.cp0;
import com.yandex.mobile.ads.impl.cx;
import com.yandex.mobile.ads.impl.de0;
import com.yandex.mobile.ads.impl.ee0;
import com.yandex.mobile.ads.impl.fe0;
import com.yandex.mobile.ads.impl.ge0;
import com.yandex.mobile.ads.impl.he0;
import com.yandex.mobile.ads.impl.s9;
import com.yandex.mobile.ads.impl.sh2;
import com.yandex.mobile.ads.impl.ux;
import com.yandex.mobile.ads.impl.v9;
import com.yandex.mobile.ads.impl.vx;
import com.yandex.mobile.ads.impl.xw;
import com.yandex.mobile.ads.impl.xx;
import com.yandex.mobile.ads.impl.xz0;
import com.yandex.mobile.ads.impl.y32;
import com.yandex.mobile.ads.impl.y9;
import com.yandex.mobile.ads.impl.zk0;
import com.yandex.mobile.ads.impl.zx;
import kotlin.collections.t;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.functions.p;
import kotlin.k0;
import kotlin.r;
import kotlin.v;
import kotlinx.coroutines.channels.g;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.flow.c0;
import kotlinx.coroutines.flow.h;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.s0;
import kotlinx.coroutines.i;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class bp0
extends sh2 {
    @NotNull
    private final ge0 b;
    @NotNull
    private final y32 c;
    @NotNull
    private final fe0 d;
    @NotNull
    private final ee0 e;
    @NotNull
    private final de0 f;
    @NotNull
    private final he0 g;
    @NotNull
    private final cx h;
    @NotNull
    private final y9 i;
    @NotNull
    private final v9 j;
    @NotNull
    private final s9 k;
    @NotNull
    private final xz0 l;
    @NotNull
    private final c0<xx> m;
    @NotNull
    private final kotlinx.coroutines.flow.q0<xx> n;
    @NotNull
    private final g<vx> o;
    @NotNull
    private final h<vx> p;

    public bp0(@NotNull ge0 g10, @NotNull y32 y322, @NotNull fe0 fe02, @NotNull ee0 ee02, @NotNull de0 de02, @NotNull he0 he02, @NotNull cx cx3, @NotNull y9 y93, @NotNull v9 v92, @NotNull s9 s92, @NotNull xz0 xz02) {
        this.b = g10;
        this.c = y322;
        this.d = fe02;
        this.e = ee02;
        this.f = de02;
        this.g = he02;
        this.h = cx3;
        this.i = y93;
        this.j = v92;
        this.k = s92;
        this.l = xz02;
        g10 = s0.a(new xx(null, (xw)xw.d.b, false, t.m()));
        this.m = g10;
        this.n = kotlinx.coroutines.flow.j.c(g10);
        this.o = g10 = kotlinx.coroutines.channels.j.b(0, null, null, 7, null);
        this.p = kotlinx.coroutines.flow.j.R(g10);
    }

    public static final /* synthetic */ s9 a(bp0 bp02) {
        return bp02.k;
    }

    private final d2 a(vx vx2) {
        return kotlinx.coroutines.i.d(this.b(), null, null, (p)new p<q0, d<? super k0>, Object>(this, vx2, null){
            int b;
            final bp0 c;
            final vx d;
            {
                this.c = bp02;
                this.d = vx2;
                super(2, d10);
            }

            @NotNull
            public final d<k0> create(@Nullable Object object, @NotNull d<?> d10) {
                return new /* invalid duplicate definition of identical inner class */;
            }

            public final Object invoke(Object object, Object object2) {
                object = (q0)object;
                object = (d)object2;
                return new /* invalid duplicate definition of identical inner class */.invokeSuspend((Object)k0.a);
            }

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @Nullable
            public final Object invokeSuspend(@NotNull Object object) {
                Object object2 = kotlin.coroutines.intrinsics.b.f();
                int n10 = this.b;
                if (n10 != 0) {
                    if (n10 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    v.b(object);
                    return k0.a;
                } else {
                    v.b(object);
                    object = this.c.o;
                    vx vx2 = this.d;
                    this.b = 1;
                    if (object.send(vx2, (d<? super k0>)((Object)this)) != object2) return k0.a;
                    return object2;
                }
            }
        }, 3, null);
    }

    public static final void a(bp0 c04, xx xx2) {
        Object object;
        c04 = c04.m;
        do {
            object = c04.getValue();
            xx xx3 = (xx)object;
        } while (!c04.c(object, (Object)xx2));
    }

    private final void a(String string2) {
        kotlinx.coroutines.i.d(this.b(), null, null, (p)new p<q0, d<? super k0>, Object>(this, string2, null){
            int b;
            final bp0 c;
            final String d;
            {
                this.c = bp02;
                this.d = string2;
                super(2, d10);
            }

            @NotNull
            public final d<k0> create(@Nullable Object object, @NotNull d<?> d10) {
                return new /* invalid duplicate definition of identical inner class */;
            }

            public final Object invoke(Object object, Object object2) {
                object = (q0)object;
                object = (d)object2;
                return new /* invalid duplicate definition of identical inner class */.invokeSuspend((Object)k0.a);
            }

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @Nullable
            public final Object invokeSuspend(@NotNull Object object) {
                Object object2 = kotlin.coroutines.intrinsics.b.f();
                int n10 = this.b;
                if (n10 != 0) {
                    if (n10 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    v.b(object);
                    return k0.a;
                } else {
                    v.b(object);
                    g g10 = this.c.o;
                    object = new vx.e(this.d);
                    this.b = 1;
                    if (g10.send(object, (d<? super k0>)((Object)this)) != object2) return k0.a;
                    return object2;
                }
            }
        }, 3, null);
    }

    public static final /* synthetic */ v9 b(bp0 bp02) {
        return bp02.j;
    }

    public static final /* synthetic */ y9 c(bp0 bp02) {
        return bp02.i;
    }

    public static final /* synthetic */ cx d(bp0 bp02) {
        return bp02.h;
    }

    public static final /* synthetic */ de0 e(bp0 bp02) {
        return bp02.f;
    }

    private final void e() {
        kotlinx.coroutines.i.d(this.b(), null, null, (p)new p<q0, d<? super k0>, Object>(this, null){
            int b;
            final bp0 c;
            {
                this.c = bp02;
                super(2, d10);
            }

            @NotNull
            public final d<k0> create(@Nullable Object object, @NotNull d<?> d10) {
                return new /* invalid duplicate definition of identical inner class */;
            }

            public final Object invoke(Object object, Object object2) {
                object = (q0)object;
                object = (d)object2;
                return new /* invalid duplicate definition of identical inner class */.invokeSuspend((Object)k0.a);
            }

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @Nullable
            public final Object invokeSuspend(@NotNull Object object) {
                Object object2 = kotlin.coroutines.intrinsics.b.f();
                int n10 = this.b;
                if (n10 != 0) {
                    if (n10 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    v.b(object);
                } else {
                    Object object3;
                    v.b(object);
                    object = this.c.b;
                    this.b = 1;
                    object = object3 = object.a((d)((Object)this));
                    if (object3 == object2) {
                        return object2;
                    }
                }
                object = (zk0)object;
                if (object instanceof zk0.c) {
                    object = new vx.d(((zk0.c)object).a());
                } else if (object instanceof zk0.a) {
                    object = new vx.c(((zk0.a)object).a());
                } else {
                    if (!(object instanceof zk0.b)) throw new r();
                    object = vx.b.a;
                }
                this.c.a((vx)object);
                return k0.a;
            }
        }, 3, null);
    }

    public static final /* synthetic */ ee0 f(bp0 bp02) {
        return bp02.e;
    }

    private final void f() {
        kotlinx.coroutines.i.d(this.b(), null, null, new cp0(this, false, null), 3, null);
    }

    public static final /* synthetic */ fe0 g(bp0 bp02) {
        return bp02.d;
    }

    public static final /* synthetic */ he0 i(bp0 bp02) {
        return bp02.g;
    }

    public static final /* synthetic */ xz0 j(bp0 bp02) {
        return bp02.l;
    }

    public static final /* synthetic */ c0 l(bp0 bp02) {
        return bp02.m;
    }

    public static final void m(bp0 bp02) {
        xx xx2 = ((xx)bp02.m.getValue()).b();
        if (xx2 == null) {
            bp02.a(vx.a.a);
        } else {
            Object object;
            xx2 = xx.a((xx)xx2, null, null, (boolean)false, null, (int)11);
            c0<xx> c04 = bp02.m;
            do {
                object = c04.getValue();
                bp02 = (xx)object;
            } while (!c04.c(object, (Object)xx2));
        }
    }

    public final void a(@NotNull ux xw3) {
        if (xw3 instanceof ux.a) {
            this.f();
        } else if (xw3 instanceof ux.g) {
            this.e();
        } else if (xw3 instanceof ux.e) {
            this.c.a();
            this.f();
        } else if (xw3 instanceof ux.d) {
            xw3 = ((xx)this.m.getValue()).b();
            if (xw3 == null) {
                this.a(vx.a.a);
            } else {
                Object object;
                xw3 = xx.a((xx)xw3, null, null, (boolean)false, null, (int)11);
                c0<xx> c04 = this.m;
                do {
                    object = c04.getValue();
                    xx xx2 = (xx)object;
                } while (!c04.c(object, (Object)xw3));
            }
        } else if (xw3 instanceof ux.c) {
            Object object;
            xw.c c10 = xw.c.b;
            xw3 = (xx)this.m.getValue();
            c10 = xx.a((xx)xw3, (xx)xw3, (xw)c10, (boolean)false, null, (int)12);
            xw3 = this.m;
            do {
                object = xw3.getValue();
                xx xx3 = (xx)object;
            } while (!xw3.c(object, (Object)c10));
            this.f();
        } else if (xw3 instanceof ux.b) {
            Object object;
            c0<xx> c05 = new c0<xx>(((ux.b)xw3).a());
            xw3 = (xx)this.m.getValue();
            xw3 = xx.a((xx)xw3, (xx)xw3, (xw)c05, (boolean)false, null, (int)12);
            c05 = this.m;
            do {
                object = c05.getValue();
                xx xx4 = (xx)object;
            } while (!c05.c(object, (Object)xw3));
            this.f();
        } else if (xw3 instanceof ux.f) {
            Object object;
            xw xw4 = ((xx)this.m.getValue()).a();
            xw3 = ((ux.f)xw3).a();
            xw3 = xw4 instanceof xw.a ? new xw.b((zx.g)xw3) : new xw.e(xw3.f());
            xw4 = (xx)this.m.getValue();
            xx xx5 = xx.a((xx)xw4, (xx)xw4, (xw)xw3, (boolean)false, null, (int)12);
            xw3 = this.m;
            do {
                object = xw3.getValue();
                xw4 = (xx)object;
            } while (!xw3.c(object, (Object)xx5));
            this.f();
        } else if (xw3 instanceof ux.h) {
            this.a(((ux.h)xw3).a());
        }
    }

    @NotNull
    public final h<vx> c() {
        return this.p;
    }

    @NotNull
    public final kotlinx.coroutines.flow.q0<xx> d() {
        return this.n;
    }
}


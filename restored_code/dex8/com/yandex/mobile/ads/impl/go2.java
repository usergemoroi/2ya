/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  com.yandex.mobile.ads.impl.ib2
 *  com.yandex.mobile.ads.impl.ic2
 *  com.yandex.mobile.ads.impl.id2
 *  com.yandex.mobile.ads.impl.ie1
 *  com.yandex.mobile.ads.impl.jb2
 *  com.yandex.mobile.ads.impl.je1
 *  com.yandex.mobile.ads.impl.je1$a
 *  com.yandex.mobile.ads.impl.ld2
 *  com.yandex.mobile.ads.impl.nc0
 *  com.yandex.mobile.ads.impl.o8
 *  com.yandex.mobile.ads.impl.oa2
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.pj1
 *  com.yandex.mobile.ads.impl.re1
 *  com.yandex.mobile.ads.impl.se1
 *  com.yandex.mobile.ads.impl.te1
 *  com.yandex.mobile.ads.impl.ug2
 *  com.yandex.mobile.ads.impl.vg2
 *  com.yandex.mobile.ads.impl.xg2
 *  com.yandex.mobile.ads.impl.xg2$a
 *  com.yandex.mobile.ads.impl.xv0
 *  com.yandex.mobile.ads.impl.y2
 *  com.yandex.mobile.ads.impl.zd2
 *  kotlin.collections.s0
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.impl.fo2;
import com.yandex.mobile.ads.impl.hb2;
import com.yandex.mobile.ads.impl.ib2;
import com.yandex.mobile.ads.impl.ic2;
import com.yandex.mobile.ads.impl.id2;
import com.yandex.mobile.ads.impl.ie1;
import com.yandex.mobile.ads.impl.jb2;
import com.yandex.mobile.ads.impl.je1;
import com.yandex.mobile.ads.impl.ld2;
import com.yandex.mobile.ads.impl.nc0;
import com.yandex.mobile.ads.impl.o8;
import com.yandex.mobile.ads.impl.oa2;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.pj1;
import com.yandex.mobile.ads.impl.re1;
import com.yandex.mobile.ads.impl.se1;
import com.yandex.mobile.ads.impl.te1;
import com.yandex.mobile.ads.impl.ug2;
import com.yandex.mobile.ads.impl.vg2;
import com.yandex.mobile.ads.impl.wp1;
import com.yandex.mobile.ads.impl.xg2;
import com.yandex.mobile.ads.impl.xv0;
import com.yandex.mobile.ads.impl.y2;
import com.yandex.mobile.ads.impl.zd2;
import java.util.List;
import java.util.Map;
import kotlin.collections.s0;
import kotlin.k0;
import kotlin.r;
import kotlin.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class go2
implements xg2 {
    @NotNull
    private final Context a;
    @NotNull
    private final ld2 b;
    @Nullable
    private final zd2 c;
    @NotNull
    private final List<hb2> d;
    @NotNull
    private final vg2 e;
    @NotNull
    private final te1 f;
    @NotNull
    private final wp1 g;
    @Nullable
    private o8 h;
    @Nullable
    private xv0 i;
    @Nullable
    private y2 j;
    private boolean k;

    public go2(@NotNull Context context, @NotNull ld2 ld22, @Nullable zd2 zd22, @NotNull List<hb2> list, @NotNull vg2 vg22, @NotNull te1 te12, @NotNull wp1 wp12) {
        this.a = context;
        this.b = ld22;
        this.c = zd22;
        this.d = list;
        this.e = vg22;
        this.f = te12;
        this.g = wp12;
    }

    public static final void a(go2 go22, ib2 ib22) {
        go22.getClass();
        Map map2 = s0.g(z.a("[REASON]", String.valueOf(ib22.a().a())));
        go22.e.a((ug2)ib22.b(), "verificationNotExecuted", map2);
    }

    public final void a() {
    }

    public final void a(float f11) {
        xv0 xv02 = this.i;
        if (xv02 != null) {
            try {
                if (!this.k) {
                    xv02.a(f11);
                }
            }
            catch (Exception exception) {
                int n10 = op0.b;
                this.g.reportError("Failed to execute safely", exception);
            }
        }
    }

    public final void a(float f11, long l10) {
        xv0 xv02 = this.i;
        if (xv02 != null) {
            try {
                if (!this.k) {
                    xv02.a((float)l10 / (float)1000L, f11);
                }
            }
            catch (Exception exception) {
                int n10 = op0.b;
                this.g.reportError("Failed to execute safely", exception);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(@NotNull View object, @NotNull List<ic2> object2) {
        Exception exception5;
        int n10;
        block23: {
            k0 k02;
            block22: {
                block18: {
                    block19: {
                        block20: {
                            block21: {
                                Context context;
                                block24: {
                                    re1 re12;
                                    this.k();
                                    this.k = false;
                                    k02 = k0.a;
                                    try {
                                        context = this.a;
                                        fo2 fo22 = new fo2(this);
                                        k02 = new ie1(context, (jb2)fo22);
                                        n10 = je1.e;
                                        je1 je12 = je1.a.a();
                                        fo22 = new se1();
                                        re12 = new re1(context, (ie1)k02, je12, (se1)fo22);
                                        context = re12.a(this.d);
                                        if (context != null) {
                                            k02 = context.b();
                                            k02.a((View)object);
                                            this.h = k02;
                                            this.i = context.c();
                                            this.j = context.a();
                                        }
                                    }
                                    catch (Exception exception2) {
                                        n10 = op0.b;
                                        this.g.reportError("Failed to execute safely", exception2);
                                    }
                                    if ((k02 = this.h) == null) break block24;
                                    object2 = object2.iterator();
                                    while (object2.hasNext()) {
                                        Exception exception32;
                                        block17: {
                                            block16: {
                                                block13: {
                                                    block14: {
                                                        block15: {
                                                            context = (ic2)object2.next();
                                                            re12 = context.c();
                                                            if (re12 == null) continue;
                                                            object = k0.a;
                                                            try {
                                                                n10 = context.b().ordinal();
                                                                if (n10 == 0) break block13;
                                                                if (n10 == 1) break block14;
                                                                if (n10 == 2) break block15;
                                                                if (n10 != 3) {
                                                                    object = new r();
                                                                    throw object;
                                                                }
                                                                object = nc0.e;
                                                                break block16;
                                                            }
                                                            catch (Exception exception32) {
                                                                break block17;
                                                            }
                                                        }
                                                        object = nc0.d;
                                                        break block16;
                                                    }
                                                    object = nc0.c;
                                                    break block16;
                                                }
                                                object = nc0.b;
                                            }
                                            k02.a((View)re12, (nc0)object, context.a());
                                            continue;
                                        }
                                        n10 = op0.b;
                                        this.g.reportError("Failed to execute safely", exception32);
                                    }
                                }
                                if ((object = this.h) != null) {
                                    try {
                                        if (!this.k) {
                                            object.b();
                                        }
                                    }
                                    catch (Exception exception4) {
                                        n10 = op0.b;
                                        this.g.reportError("Failed to execute safely", exception4);
                                    }
                                }
                                if ((object2 = this.j) == null) return;
                                try {
                                    if (this.k) return;
                                    context = this.f;
                                    k02 = this.c;
                                    object = this.b;
                                    context.getClass();
                                    n10 = ((Enum)object).ordinal();
                                    if (n10 == 0) break block18;
                                    if (n10 == 1) break block19;
                                    if (n10 == 2) break block20;
                                    if (n10 == 3) break block21;
                                    object = pj1.f;
                                    break block22;
                                }
                                catch (Exception exception5) {
                                    break block23;
                                }
                            }
                            object = pj1.f;
                            break block22;
                        }
                        object = pj1.e;
                        break block22;
                    }
                    object = pj1.d;
                    break block22;
                }
                object = pj1.c;
            }
            object = k02 != null ? oa2.a((float)((float)k02.a() / (float)1000L), (pj1)object) : oa2.a((pj1)object);
            object2.a((oa2)object);
            return;
        }
        n10 = op0.b;
        this.g.reportError("Failed to execute safely", exception5);
    }

    public final void a(@NotNull id2 id22) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(@NotNull xg2.a a13) {
        xv0 xv02 = this.i;
        if (xv02 == null) return;
        try {
            if (this.k) return;
            int n10 = a13.ordinal();
            if (n10 == 0) {
                xv02.e();
                return;
            }
            if (n10 == 1) {
                xv02.f();
                return;
            }
            if (n10 != 2) {
                return;
            }
            xv02.j();
            return;
        }
        catch (Exception exception) {}
        int n12 = op0.b;
        this.g.reportError("Failed to execute safely", exception);
    }

    public final void a(@NotNull String string2) {
        this.m();
    }

    public final void b() {
        xv0 xv02 = this.i;
        if (xv02 != null) {
            try {
                if (!this.k) {
                    xv02.d();
                }
            }
            catch (Exception exception) {
                int n10 = op0.b;
                this.g.reportError("Failed to execute safely", exception);
            }
        }
    }

    public final void c() {
        xv0 xv02 = this.i;
        if (xv02 != null) {
            try {
                if (!this.k) {
                    xv02.h();
                }
            }
            catch (Exception exception) {
                int n10 = op0.b;
                this.g.reportError("Failed to execute safely", exception);
            }
        }
    }

    public final void d() {
        xv0 xv02 = this.i;
        if (xv02 != null) {
            try {
                if (!this.k) {
                    xv02.g();
                }
            }
            catch (Exception exception) {
                int n10 = op0.b;
                this.g.reportError("Failed to execute safely", exception);
            }
        }
    }

    public final void e() {
        xv0 xv02 = this.i;
        if (xv02 != null) {
            try {
                if (!this.k) {
                    xv02.i();
                }
            }
            catch (Exception exception) {
                int n10 = op0.b;
                this.g.reportError("Failed to execute safely", exception);
            }
        }
    }

    public final void f() {
        xv0 xv02 = this.i;
        if (xv02 != null) {
            try {
                if (!this.k) {
                    xv02.c();
                }
            }
            catch (Exception exception) {
                int n10 = op0.b;
                this.g.reportError("Failed to execute safely", exception);
            }
        }
    }

    public final void g() {
    }

    public final void h() {
    }

    public final void i() {
    }

    public final void j() {
        xv0 xv02 = this.i;
        if (xv02 != null) {
            try {
                if (!this.k) {
                    xv02.b();
                }
            }
            catch (Exception exception) {
                int n10 = op0.b;
                this.g.reportError("Failed to execute safely", exception);
            }
        }
    }

    public final void k() {
        o8 o82 = this.h;
        if (o82 != null) {
            try {
                if (!this.k) {
                    o82.a();
                    this.h = null;
                    this.i = null;
                    this.j = null;
                    this.k = true;
                }
            }
            catch (Exception exception) {
                int n10 = op0.b;
                this.g.reportError("Failed to execute safely", exception);
            }
        }
    }

    public final void l() {
    }

    public final void m() {
        xv0 xv02 = this.i;
        if (xv02 != null) {
            try {
                if (!this.k) {
                    xv02.a();
                }
            }
            catch (Exception exception) {
                int n10 = op0.b;
                this.g.reportError("Failed to execute safely", exception);
            }
        }
    }

    public final void n() {
        y2 y23 = this.j;
        if (y23 != null) {
            try {
                if (!this.k) {
                    y23.a();
                }
            }
            catch (Exception exception) {
                int n10 = op0.b;
                this.g.reportError("Failed to execute safely", exception);
            }
        }
    }
}


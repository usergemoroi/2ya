/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  android.util.SparseArray
 *  androidx.annotation.CallSuper
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.bf0
 *  com.yandex.mobile.ads.impl.ed
 *  com.yandex.mobile.ads.impl.ed$a
 *  com.yandex.mobile.ads.impl.ed$b
 *  com.yandex.mobile.ads.impl.gw0
 *  com.yandex.mobile.ads.impl.hi1
 *  com.yandex.mobile.ads.impl.hy
 *  com.yandex.mobile.ads.impl.k01
 *  com.yandex.mobile.ads.impl.ly
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.mw0
 *  com.yandex.mobile.ads.impl.t93
 *  com.yandex.mobile.ads.impl.ub0
 *  com.yandex.mobile.ads.impl.uf
 *  com.yandex.mobile.ads.impl.vr0
 *  com.yandex.mobile.ads.impl.vr0$a
 *  com.yandex.mobile.ads.impl.vr0$b
 *  com.yandex.mobile.ads.impl.wy$a
 *  com.yandex.mobile.ads.impl.xo
 *  com.yandex.mobile.ads.impl.zr0
 */
package com.yandex.mobile.ads.impl;

import android.os.Looper;
import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.a10;
import com.yandex.mobile.ads.impl.a83;
import com.yandex.mobile.ads.impl.a93;
import com.yandex.mobile.ads.impl.b83;
import com.yandex.mobile.ads.impl.b93;
import com.yandex.mobile.ads.impl.bf0;
import com.yandex.mobile.ads.impl.bi1;
import com.yandex.mobile.ads.impl.c83;
import com.yandex.mobile.ads.impl.c93;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.d83;
import com.yandex.mobile.ads.impl.d93;
import com.yandex.mobile.ads.impl.e83;
import com.yandex.mobile.ads.impl.e93;
import com.yandex.mobile.ads.impl.ed;
import com.yandex.mobile.ads.impl.ew0;
import com.yandex.mobile.ads.impl.f83;
import com.yandex.mobile.ads.impl.f93;
import com.yandex.mobile.ads.impl.g60;
import com.yandex.mobile.ads.impl.g83;
import com.yandex.mobile.ads.impl.g93;
import com.yandex.mobile.ads.impl.gw0;
import com.yandex.mobile.ads.impl.h83;
import com.yandex.mobile.ads.impl.h93;
import com.yandex.mobile.ads.impl.hi1;
import com.yandex.mobile.ads.impl.hw0;
import com.yandex.mobile.ads.impl.hy;
import com.yandex.mobile.ads.impl.i72;
import com.yandex.mobile.ads.impl.i83;
import com.yandex.mobile.ads.impl.i93;
import com.yandex.mobile.ads.impl.iw0;
import com.yandex.mobile.ads.impl.j83;
import com.yandex.mobile.ads.impl.j93;
import com.yandex.mobile.ads.impl.k01;
import com.yandex.mobile.ads.impl.k83;
import com.yandex.mobile.ads.impl.k93;
import com.yandex.mobile.ads.impl.l52;
import com.yandex.mobile.ads.impl.l83;
import com.yandex.mobile.ads.impl.l93;
import com.yandex.mobile.ads.impl.ly;
import com.yandex.mobile.ads.impl.m83;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.m93;
import com.yandex.mobile.ads.impl.mw0;
import com.yandex.mobile.ads.impl.n83;
import com.yandex.mobile.ads.impl.n93;
import com.yandex.mobile.ads.impl.ng2;
import com.yandex.mobile.ads.impl.o83;
import com.yandex.mobile.ads.impl.o93;
import com.yandex.mobile.ads.impl.p83;
import com.yandex.mobile.ads.impl.p93;
import com.yandex.mobile.ads.impl.q73;
import com.yandex.mobile.ads.impl.q83;
import com.yandex.mobile.ads.impl.q93;
import com.yandex.mobile.ads.impl.qw0;
import com.yandex.mobile.ads.impl.r73;
import com.yandex.mobile.ads.impl.r83;
import com.yandex.mobile.ads.impl.r93;
import com.yandex.mobile.ads.impl.s73;
import com.yandex.mobile.ads.impl.s83;
import com.yandex.mobile.ads.impl.s93;
import com.yandex.mobile.ads.impl.t73;
import com.yandex.mobile.ads.impl.t83;
import com.yandex.mobile.ads.impl.t93;
import com.yandex.mobile.ads.impl.u73;
import com.yandex.mobile.ads.impl.u83;
import com.yandex.mobile.ads.impl.u93;
import com.yandex.mobile.ads.impl.ub0;
import com.yandex.mobile.ads.impl.uf;
import com.yandex.mobile.ads.impl.v73;
import com.yandex.mobile.ads.impl.v83;
import com.yandex.mobile.ads.impl.v93;
import com.yandex.mobile.ads.impl.vr0;
import com.yandex.mobile.ads.impl.w73;
import com.yandex.mobile.ads.impl.w83;
import com.yandex.mobile.ads.impl.wu;
import com.yandex.mobile.ads.impl.wy;
import com.yandex.mobile.ads.impl.x73;
import com.yandex.mobile.ads.impl.x83;
import com.yandex.mobile.ads.impl.xc;
import com.yandex.mobile.ads.impl.xj0;
import com.yandex.mobile.ads.impl.xo;
import com.yandex.mobile.ads.impl.y73;
import com.yandex.mobile.ads.impl.y83;
import com.yandex.mobile.ads.impl.yh1;
import com.yandex.mobile.ads.impl.yu;
import com.yandex.mobile.ads.impl.z73;
import com.yandex.mobile.ads.impl.z83;
import com.yandex.mobile.ads.impl.zr0;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/*
 * Exception performing whole class analysis ignored.
 */
public final class wy
implements xc {
    private final xo a;
    private final l52.b b;
    private final l52.d c;
    private final a d;
    private final SparseArray<ed.a> e;
    private vr0<ed> f;
    private hi1 g;
    private bf0 h;

    public wy(xo object) {
        this.a = (xo)uf.a((Object)object);
        this.f = new vr0(m92.c(), object, (vr0.b)new f93());
        object = new l52.b();
        this.b = object;
        this.c = new l52.d();
        this.d = new /* Unavailable Anonymous Inner Class!! */;
        this.e = new SparseArray();
    }

    public static /* synthetic */ void A(ed.a a14, k01 k012, ed ed3) {
        ed3.getClass();
    }

    public static /* synthetic */ void B(ed.a a14, boolean bl2, ed ed3) {
        ed3.getClass();
    }

    public static /* synthetic */ void C(ed.a a14, int n10, hi1.c c11, hi1.c c13, ed ed3) {
        wy.a(a14, n10, c11, c13, ed3);
    }

    public static /* synthetic */ void D(ed.a a14, zr0 zr02, gw0 gw02, ed ed3) {
        ed3.getClass();
    }

    public static /* synthetic */ void E(ed.a a14, List list, ed ed3) {
        ed3.getClass();
    }

    public static /* synthetic */ void F(ed.a a14, yh1 yh12, ed ed3) {
        wy.a(a14, yh12, ed3);
    }

    public static /* synthetic */ void G(wy wy3, hi1 hi12, ed ed3, ub0 ub02) {
        wy3.a(hi12, ed3, ub02);
    }

    public static /* synthetic */ void H(ed.a a14, a10 a102, ed ed3) {
        ed3.getClass();
    }

    public static /* synthetic */ void I(ed.a a14, zr0 zr02, gw0 gw02, ed ed3) {
        ed3.getClass();
    }

    public static /* synthetic */ void J(ed.a a14, ed ed3) {
        ed3.getClass();
    }

    public static /* synthetic */ void K(ed.a a14, String string2, long l10, long l11, ed ed3) {
        ed3.getClass();
    }

    public static /* synthetic */ void L(ed.a a14, ed ed3) {
        ed3.getClass();
    }

    public static /* synthetic */ void M(ed.a a14, boolean bl2, ed ed3) {
        ed3.getClass();
    }

    public static /* synthetic */ void N(ed.a a14, int n10, boolean bl2, ed ed3) {
        ed3.getClass();
    }

    public static /* synthetic */ void O(ed.a a14, String string2, long l10, long l11, ed ed3) {
        ed3.getClass();
    }

    public static /* synthetic */ void P(ed.a a14, ed ed3) {
        ed3.getClass();
    }

    public static /* synthetic */ void Q(ed.a a14, int n10, int n13, ed ed3) {
        ed3.getClass();
    }

    public static /* synthetic */ void R(ed.a a14, yh1 yh12, ed ed3) {
        ed3.getClass();
    }

    public static /* synthetic */ void S(ed.a a14, int n10, ed ed3) {
        ed3.getClass();
    }

    public static /* synthetic */ void T(ed.a a14, float f11, ed ed3) {
        ed3.getClass();
    }

    public static /* synthetic */ void U(ed.a a14, hy hy3, ed ed3) {
        ed3.getClass();
    }

    public static /* synthetic */ void V(ed.a a14, boolean bl2, int n10, ed ed3) {
        ed3.getClass();
    }

    public static /* synthetic */ void W(ed.a a14, cc0 cc02, ly ly3, ed ed3) {
        ed3.getClass();
    }

    public static /* synthetic */ void X(ed.a a14, int n10, ed ed3) {
        ed3.getClass();
    }

    public static /* synthetic */ void Y(ed.a a14, ew0 ew02, int n10, ed ed3) {
        ed3.getClass();
    }

    public static /* synthetic */ void Z(ed.a a14, Exception exception, ed ed3) {
        ed3.getClass();
    }

    private ed.a a(@Nullable qw0.b object) {
        this.g.getClass();
        l52 l522 = object == null ? null : (l52)com.yandex.mobile.ads.impl.wy$a.c(this.d).get(object);
        if (object != null && l522 != null) {
            return this.a(l522, l522.a((Object)((mw0)object).a, (l52.b)this.b).d, (qw0.b)((Object)object));
        }
        int n10 = this.g.getCurrentMediaItemIndex();
        if (n10 >= ((l52)(object = this.g.getCurrentTimeline())).b()) {
            object = l52.b;
        }
        return this.a((l52)object, n10, null);
    }

    private static /* synthetic */ void a(ed.a a14, int n10, long l10, long l11, ed ed3) {
        ed3.getClass();
    }

    private static /* synthetic */ void a(ed.a a14, int n10, long l10, ed ed3) {
        ed3.getClass();
    }

    private static /* synthetic */ void a(ed.a a14, int n10, hi1.c c11, hi1.c c13, ed ed3) {
        ed3.getClass();
        ((iw0)ed3).a(n10);
    }

    private static /* synthetic */ void a(ed.a a14, long l10, int n10, ed ed3) {
        ed3.getClass();
    }

    private static /* synthetic */ void a(ed.a a14, long l10, ed ed3) {
        ed3.getClass();
    }

    private static /* synthetic */ void a(ed.a a14, bi1 bi12, ed ed3) {
        ed3.getClass();
    }

    private static /* synthetic */ void a(ed.a a14, cc0 cc02, ly ly3, ed ed3) {
        ed3.getClass();
    }

    private static /* synthetic */ void a(ed.a a14, gw0 gw02, ed ed3) {
        ((iw0)ed3).a(a14, gw02);
    }

    private static /* synthetic */ void a(ed.a a14, hi1.a a15, ed ed3) {
        ed3.getClass();
    }

    private static /* synthetic */ void a(ed.a a14, hw0 hw02, ed ed3) {
        ed3.getClass();
    }

    private static /* synthetic */ void a(ed.a a14, i72 i722, ed ed3) {
        ed3.getClass();
    }

    private static /* synthetic */ void a(ed.a a14, ng2 ng22, ed ed3) {
        ((iw0)ed3).a(ng22);
        int n10 = ng22.b;
    }

    private static /* synthetic */ void a(ed.a a14, yh1 yh12, ed ed3) {
        ((iw0)ed3).a(yh12);
    }

    private static /* synthetic */ void a(ed.a a14, yu yu3, ed ed3) {
        ed3.getClass();
    }

    private static /* synthetic */ void a(ed.a a14, zr0 zr02, gw0 gw02, IOException iOException, boolean bl2, ed ed3) {
        ((iw0)ed3).a(gw02);
    }

    private static /* synthetic */ void a(ed.a a14, Exception exception, ed ed3) {
        ed3.getClass();
    }

    private static /* synthetic */ void a(ed.a a14, Object object, long l10, ed ed3) {
        ed3.getClass();
    }

    private static /* synthetic */ void a(ed.a a14, String string2, ed ed3) {
        ed3.getClass();
    }

    private static /* synthetic */ void a(ed.a a14, boolean bl2, ed ed3) {
        ed3.getClass();
    }

    private static /* synthetic */ void a(ed ed3, ub0 ub02) {
    }

    private /* synthetic */ void a(hi1 hi12, ed ed3, ub0 ub02) {
        ub02 = new ed.b(ub02, this.e);
        ((iw0)ed3).a(hi12, (ed.b)ub02);
    }

    public static /* synthetic */ void a0(ed.a a14, ed ed3) {
        wy.d(a14, ed3);
    }

    private ed.a b() {
        return this.a(com.yandex.mobile.ads.impl.wy$a.f(this.d));
    }

    private static /* synthetic */ void b(ed.a a14, int n10, long l10, long l11, ed ed3) {
        ((iw0)ed3).a(a14, n10, l10);
    }

    private static /* synthetic */ void b(ed.a a14, ed ed3) {
        ed3.getClass();
    }

    private static /* synthetic */ void b(ed.a a14, hy hy3, ed ed3) {
        ed3.getClass();
    }

    public static /* synthetic */ void b(ed.a a14, ng2 ng22, ed ed3) {
        wy.a(a14, ng22, ed3);
    }

    private static /* synthetic */ void b(ed.a a14, Exception exception, ed ed3) {
        ed3.getClass();
    }

    private static /* synthetic */ void b(ed.a a14, String string2, ed ed3) {
        ed3.getClass();
    }

    private static /* synthetic */ void b(ed.a a14, boolean bl2, int n10, ed ed3) {
        ed3.getClass();
    }

    public static /* synthetic */ void b0(ed.a a14, int n10, ed ed3) {
        wy.d(a14, n10, ed3);
    }

    private void c() {
        ed.a a14 = this.a();
        this.a(a14, 1028, new j83(a14));
        this.f.b();
    }

    private static /* synthetic */ void c(ed.a a14, int n10, ed ed3) {
        ed3.getClass();
    }

    private static /* synthetic */ void c(ed.a a14, hy hy3, ed ed3) {
        ((iw0)ed3).a(hy3);
    }

    private static /* synthetic */ void c(ed.a a14, zr0 zr02, gw0 gw02, ed ed3) {
        ed3.getClass();
    }

    private static /* synthetic */ void c(ed.a a14, Exception exception, ed ed3) {
        ed3.getClass();
    }

    public static /* synthetic */ void c0(ed.a a14, long l10, ed ed3) {
        wy.a(a14, l10, ed3);
    }

    private static /* synthetic */ void d(ed.a a14, int n10, ed ed3) {
        ed3.getClass();
    }

    private static /* synthetic */ void d(ed.a a14, ed ed3) {
        ed3.getClass();
    }

    private static /* synthetic */ void d(ed.a a14, hy hy3, ed ed3) {
        ed3.getClass();
    }

    public static /* synthetic */ void d0(ed.a a14, String string2, ed ed3) {
        wy.a(a14, string2, ed3);
    }

    private ed.a e(int n10, @Nullable qw0.b object) {
        this.g.getClass();
        if (object != null) {
            object = (l52)com.yandex.mobile.ads.impl.wy$a.c(this.d).get(object) != null ? this.a((qw0.b)((Object)object)) : this.a(l52.b, n10, (qw0.b)((Object)object));
            return object;
        }
        object = this.g.getCurrentTimeline();
        if (n10 >= ((l52)object).b()) {
            object = l52.b;
        }
        return this.a((l52)object, n10, null);
    }

    public static /* synthetic */ void e0(ed.a a14, boolean bl2, ed ed3) {
        wy.a(a14, bl2, ed3);
    }

    public static /* synthetic */ void f(ed.a a14, ed ed3) {
        wy.b(a14, ed3);
    }

    public static /* synthetic */ void f0(ed.a a14, hw0 hw02, ed ed3) {
        wy.a(a14, hw02, ed3);
    }

    public static /* synthetic */ void g(ed.a a14, Exception exception, ed ed3) {
        wy.b(a14, exception, ed3);
    }

    public static /* synthetic */ void g0(ed.a a14, Exception exception, ed ed3) {
        wy.a(a14, exception, ed3);
    }

    public static /* synthetic */ void h(wy wy3) {
        wy3.c();
    }

    public static /* synthetic */ void h0(ed.a a14, cc0 cc02, ly ly3, ed ed3) {
        wy.a(a14, cc02, ly3, ed3);
    }

    public static /* synthetic */ void i(ed.a a14, zr0 zr02, gw0 gw02, IOException iOException, boolean bl2, ed ed3) {
        wy.a(a14, zr02, gw02, iOException, bl2, ed3);
    }

    public static /* synthetic */ void i0(ed.a a14, long l10, int n10, ed ed3) {
        wy.a(a14, l10, n10, ed3);
    }

    public static /* synthetic */ void j(ed.a a14, gw0 gw02, ed ed3) {
        wy.a(a14, gw02, ed3);
    }

    public static /* synthetic */ void j0(ed.a a14, int n10, long l10, long l11, ed ed3) {
        wy.a(a14, n10, l10, l11, ed3);
    }

    public static /* synthetic */ void k(ed.a a14, Object object, long l10, ed ed3) {
        wy.a(a14, object, l10, ed3);
    }

    public static /* synthetic */ void l(ed ed3, ub0 ub02) {
        wy.a(ed3, ub02);
    }

    public static /* synthetic */ void m(ed.a a14, zr0 zr02, gw0 gw02, ed ed3) {
        wy.c(a14, zr02, gw02, ed3);
    }

    public static /* synthetic */ void n(ed.a a14, boolean bl2, int n10, ed ed3) {
        wy.b(a14, bl2, n10, ed3);
    }

    public static /* synthetic */ void o(ed.a a14, int n10, long l10, ed ed3) {
        wy.a(a14, n10, l10, ed3);
    }

    public static /* synthetic */ void p(ed.a a14, String string2, ed ed3) {
        wy.b(a14, string2, ed3);
    }

    public static /* synthetic */ void q(ed.a a14, hi1.a a15, ed ed3) {
        wy.a(a14, a15, ed3);
    }

    public static /* synthetic */ void r(ed.a a14, hy hy3, ed ed3) {
        wy.c(a14, hy3, ed3);
    }

    public static /* synthetic */ void s(ed.a a14, hy hy3, ed ed3) {
        wy.b(a14, hy3, ed3);
    }

    public static /* synthetic */ void t(ed.a a14, int n10, long l10, long l11, ed ed3) {
        wy.b(a14, n10, l10, l11, ed3);
    }

    public static /* synthetic */ void u(ed.a a14, hy hy3, ed ed3) {
        wy.d(a14, hy3, ed3);
    }

    public static /* synthetic */ void v(ed.a a14, yu yu3, ed ed3) {
        wy.a(a14, yu3, ed3);
    }

    public static /* synthetic */ void w(ed.a a14, i72 i722, ed ed3) {
        wy.a(a14, i722, ed3);
    }

    public static /* synthetic */ void x(ed.a a14, Exception exception, ed ed3) {
        wy.c(a14, exception, ed3);
    }

    public static /* synthetic */ void y(ed.a a14, int n10, ed ed3) {
        wy.c(a14, n10, ed3);
    }

    public static /* synthetic */ void z(ed.a a14, bi1 bi12, ed ed3) {
        wy.a(a14, bi12, ed3);
    }

    protected final ed.a a() {
        return this.a(com.yandex.mobile.ads.impl.wy$a.d(this.d));
    }

    @RequiresNonNull(value={"player"})
    protected final ed.a a(l52 l522, int n10, @Nullable qw0.b b11) {
        long l10;
        if (l522.c()) {
            b11 = null;
        }
        long l11 = this.a.b();
        boolean bl2 = l522.equals(this.g.getCurrentTimeline()) && n10 == this.g.getCurrentMediaItemIndex();
        long l13 = 0L;
        if (b11 != null && b11.a()) {
            l10 = l13;
            if (bl2) {
                l10 = l13;
                if (this.g.getCurrentAdGroupIndex() == b11.b) {
                    l10 = l13;
                    if (this.g.getCurrentAdIndexInAdGroup() == b11.c) {
                        l10 = this.g.getCurrentPosition();
                    }
                }
            }
        } else {
            l10 = bl2 ? this.g.getContentPosition() : (l522.c() ? l13 : m92.b((long)l522.a((int)n10, (l52.d)this.c, (long)0L).n));
        }
        qw0.b b14 = com.yandex.mobile.ads.impl.wy$a.d(this.d);
        return new ed.a(l11, l522, n10, b11, l10, this.g.getCurrentTimeline(), this.g.getCurrentMediaItemIndex(), b14, this.g.getCurrentPosition(), this.g.getTotalBufferedDuration());
    }

    public final void a(int n10) {
        a a14 = this.d;
        hi1 hi12 = this.g;
        hi12.getClass();
        com.yandex.mobile.ads.impl.wy$a.h(a14, (qw0.b)com.yandex.mobile.ads.impl.wy$a.l((hi1)hi12, (xj0)com.yandex.mobile.ads.impl.wy$a.b(a14), (qw0.b)com.yandex.mobile.ads.impl.wy$a.e(a14), (l52.b)com.yandex.mobile.ads.impl.wy$a.a(a14)));
        com.yandex.mobile.ads.impl.wy$a.k(a14, (l52)hi12.getCurrentTimeline());
        a14 = this.a();
        this.a((ed.a)a14, 0, new s83((ed.a)a14, n10));
    }

    @Override
    public final void a(int n10, long l10) {
        ed.a a14 = this.a(com.yandex.mobile.ads.impl.wy$a.e(this.d));
        this.a(a14, 1021, new u83(a14, l10, n10));
    }

    @Override
    public final void a(int n10, long l10, long l11) {
        ed.a a14 = this.b();
        this.a(a14, 1011, new v93(a14, n10, l10, l11));
    }

    public final void a(int n10, @Nullable qw0.b b11) {
        b11 = this.e(n10, b11);
        this.a((ed.a)b11, 1025, new e83((ed.a)b11));
    }

    public final void a(int n10, @Nullable qw0.b b11, int n13) {
        b11 = this.e(n10, b11);
        this.a((ed.a)b11, 1022, new g83((ed.a)b11, n13));
    }

    public final void a(int n10, @Nullable qw0.b b11, gw0 gw02) {
        b11 = this.e(n10, b11);
        this.a((ed.a)b11, 1004, new i93((ed.a)b11, gw02));
    }

    public final void a(int n10, @Nullable qw0.b b11, zr0 zr02, gw0 gw02) {
        b11 = this.e(n10, b11);
        this.a((ed.a)b11, 1002, new r93((ed.a)b11, zr02, gw02));
    }

    public final void a(int n10, @Nullable qw0.b b11, zr0 zr02, gw0 gw02, IOException iOException, boolean bl2) {
        b11 = this.e(n10, b11);
        this.a((ed.a)b11, 1003, new v83((ed.a)b11, zr02, gw02, iOException, bl2));
    }

    public final void a(int n10, @Nullable qw0.b b11, Exception exception) {
        b11 = this.e(n10, b11);
        this.a((ed.a)b11, 1024, new y73((ed.a)b11, exception));
    }

    @Override
    public final void a(long l10) {
        ed.a a14 = this.b();
        this.a(a14, 1010, new r73(a14, l10));
    }

    public final void a(a10 a102) {
        ed.a a14 = this.a();
        this.a(a14, 29, new k93(a14, a102));
    }

    public final void a(bi1 bi12) {
        ed.a a14 = this.a();
        this.a(a14, 12, new w73(a14, bi12));
    }

    @Override
    public final void a(cc0 cc02, @Nullable ly ly3) {
        ed.a a14 = this.b();
        this.a(a14, 1009, new d93(a14, cc02, ly3));
    }

    protected final void a(ed.a vr02, int n10, vr0.a<ed> a14) {
        this.e.put(n10, (Object)vr02);
        vr02 = this.f;
        vr02.a(n10, a14);
        vr02.a();
    }

    public final void a(@Nullable ew0 ew02, int n10) {
        ed.a a14 = this.a();
        this.a(a14, 1, new c93(a14, ew02, n10));
    }

    public final void a(@Nullable g60 g602) {
        mw0 mw02;
        mw02 = g602 instanceof g60 && (mw02 = g602.i) != null ? this.a(new qw0.b(mw02)) : this.a();
        this.a((ed.a)mw02, 10, new m83((ed.a)mw02, g602));
    }

    public final void a(hi1.a a14) {
        ed.a a15 = this.a();
        this.a(a15, 13, new r83(a15, a14));
    }

    public final void a(hi1.c c11, hi1.c c13, int n10) {
        a a14 = this.d;
        hi1 hi12 = this.g;
        hi12.getClass();
        com.yandex.mobile.ads.impl.wy$a.h(a14, (qw0.b)com.yandex.mobile.ads.impl.wy$a.l((hi1)hi12, (xj0)com.yandex.mobile.ads.impl.wy$a.b(a14), (qw0.b)com.yandex.mobile.ads.impl.wy$a.e(a14), (l52.b)com.yandex.mobile.ads.impl.wy$a.a(a14)));
        a14 = this.a();
        this.a((ed.a)a14, 11, new w83((ed.a)a14, n10, c11, c13));
    }

    @Override
    @CallSuper
    public final void a(hi1 hi12, Looper looper) {
        if (this.g != null && !((AbstractCollection)((Object)com.yandex.mobile.ads.impl.wy$a.b(this.d))).isEmpty()) {
            throw new IllegalStateException();
        }
        this.g = hi12;
        this.h = this.a.a(looper, null);
        this.f = this.f.a(looper, (vr0.b)new q73(this, hi12));
    }

    public final void a(hw0 hw02) {
        ed.a a14 = this.a();
        this.a(a14, 14, new z83(a14, hw02));
    }

    @Override
    public final void a(hy hy3) {
        ed.a a14 = this.a(com.yandex.mobile.ads.impl.wy$a.e(this.d));
        this.a(a14, 1013, new p83(a14, hy3));
    }

    public final void a(i72 i722) {
        ed.a a14 = this.a();
        this.a(a14, 2, new t83(a14, i722));
    }

    @Override
    @CallSuper
    public final void a(iw0 iw02) {
        this.f.a((Object)iw02);
    }

    public final void a(k01 k012) {
        ed.a a14 = this.a();
        this.a(a14, 28, new d83(a14, k012));
    }

    public final void a(ng2 ng22) {
        ed.a a14 = this.b();
        this.a(a14, 25, new u93(a14, ng22));
    }

    public final void a(yu yu3) {
        ed.a a14 = this.a();
        this.a(a14, 27, new b93(a14, yu3));
    }

    @Override
    public final void a(Exception exception) {
        ed.a a14 = this.b();
        this.a(a14, 1014, new z73(a14, exception));
    }

    @Override
    public final void a(Object object, long l10) {
        ed.a a14 = this.b();
        this.a(a14, 26, new s73(a14, object, l10));
    }

    @Override
    public final void a(String string2) {
        ed.a a14 = this.b();
        this.a(a14, 1019, new x83(a14, string2));
    }

    @Override
    public final void a(String string2, long l10, long l11) {
        ed.a a14 = this.b();
        this.a(a14, 1016, new j93(a14, string2, l11, l10));
    }

    @Override
    public final void a(List<qw0.b> list, @Nullable qw0.b b11) {
        a a14 = this.d;
        hi1 hi12 = this.g;
        hi12.getClass();
        a14.getClass();
        com.yandex.mobile.ads.impl.wy$a.g(a14, xj0.a(list));
        if (!list.isEmpty()) {
            com.yandex.mobile.ads.impl.wy$a.i(a14, (qw0.b)list.get(0));
            ((Object)((Object)b11)).getClass();
            com.yandex.mobile.ads.impl.wy$a.j(a14, (qw0.b)b11);
        }
        if (com.yandex.mobile.ads.impl.wy$a.d(a14) == null) {
            com.yandex.mobile.ads.impl.wy$a.h(a14, (qw0.b)com.yandex.mobile.ads.impl.wy$a.l((hi1)hi12, (xj0)com.yandex.mobile.ads.impl.wy$a.b(a14), (qw0.b)com.yandex.mobile.ads.impl.wy$a.e(a14), (l52.b)com.yandex.mobile.ads.impl.wy$a.a(a14)));
        }
        com.yandex.mobile.ads.impl.wy$a.k(a14, (l52)hi12.getCurrentTimeline());
    }

    public final void a(boolean bl2, int n10) {
        ed.a a14 = this.a();
        this.a(a14, 30, new c83(a14, n10, bl2));
    }

    @Override
    public final void b(int n10, long l10) {
        ed.a a14 = this.a(com.yandex.mobile.ads.impl.wy$a.e(this.d));
        this.a(a14, 1018, new a83(a14, n10, l10));
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void b(int n10, long l10, long l11) {
        void var6_12;
        a a14 = this.d;
        if (((AbstractCollection)((Object)com.yandex.mobile.ads.impl.wy$a.b(a14))).isEmpty()) {
            Object var6_5 = null;
        } else {
            void var6_10;
            xj0 xj02 = com.yandex.mobile.ads.impl.wy$a.b(a14);
            if (xj02 instanceof List) {
                if (xj02.isEmpty()) throw new NoSuchElementException();
                Object e11 = xj02.get(xj02.size() - 1);
            } else {
                Iterator iterator = xj02.iterator();
                do {
                    Object t13 = iterator.next();
                } while (iterator.hasNext());
            }
            qw0.b b11 = (qw0.b)var6_10;
        }
        ed.a a15 = this.a((qw0.b)var6_12);
        this.a(a15, 1006, new q83(a15, n10, l10, l11));
    }

    public final void b(int n10, @Nullable qw0.b b11) {
        b11 = this.e(n10, b11);
        this.a((ed.a)b11, 1027, new l83((ed.a)b11));
    }

    public final void b(int n10, @Nullable qw0.b b11, zr0 zr02, gw0 gw02) {
        b11 = this.e(n10, b11);
        this.a((ed.a)b11, 1001, new x73((ed.a)b11, zr02, gw02));
    }

    @Override
    public final void b(cc0 cc02, @Nullable ly ly3) {
        ed.a a14 = this.b();
        this.a(a14, 1017, new l93(a14, cc02, ly3));
    }

    public final void b(g60 g602) {
        mw0 mw02;
        mw02 = g602 instanceof g60 && (mw02 = g602.i) != null ? this.a(new qw0.b(mw02)) : this.a();
        this.a((ed.a)mw02, 10, new k83((ed.a)mw02, g602));
    }

    @Override
    public final void b(hy hy3) {
        ed.a a14 = this.b();
        this.a(a14, 1007, new i83(a14, hy3));
    }

    @Override
    public final void b(Exception exception) {
        ed.a a14 = this.b();
        this.a(a14, 1029, new p93(a14, exception));
    }

    @Override
    public final void b(String string2) {
        ed.a a14 = this.b();
        this.a(a14, 1012, new o93(a14, string2));
    }

    @Override
    public final void b(String string2, long l10, long l11) {
        ed.a a14 = this.b();
        this.a(a14, 1008, new a93(a14, string2, l11, l10));
    }

    public final void c(int n10, @Nullable qw0.b b11) {
        b11 = this.e(n10, b11);
        this.a((ed.a)b11, 1023, new h93((ed.a)b11));
    }

    public final void c(int n10, @Nullable qw0.b b11, zr0 zr02, gw0 gw02) {
        b11 = this.e(n10, b11);
        this.a((ed.a)b11, 1000, new t73((ed.a)b11, zr02, gw02));
    }

    @Override
    public final void c(hy hy3) {
        ed.a a14 = this.a(com.yandex.mobile.ads.impl.wy$a.e(this.d));
        this.a(a14, 1020, new b83(a14, hy3));
    }

    @Override
    public final void c(Exception exception) {
        ed.a a14 = this.b();
        this.a(a14, 1030, new q93(a14, exception));
    }

    public final void d(int n10, @Nullable qw0.b b11) {
        b11 = this.e(n10, b11);
        this.a((ed.a)b11, 1026, new o83((ed.a)b11));
    }

    @Override
    public final void d(hy hy3) {
        ed.a a14 = this.b();
        this.a(a14, 1015, new y83(a14, hy3));
    }

    public final void onCues(List<wu> list) {
        ed.a a14 = this.a();
        this.a(a14, 27, new h83(a14, list));
    }

    public final void onIsLoadingChanged(boolean bl2) {
        ed.a a14 = this.a();
        this.a(a14, 3, new u73(a14, bl2));
    }

    public final void onIsPlayingChanged(boolean bl2) {
        ed.a a14 = this.a();
        this.a(a14, 7, new s93(a14, bl2));
    }

    public final void onPlayWhenReadyChanged(boolean bl2, int n10) {
        ed.a a14 = this.a();
        this.a(a14, 5, new f83(a14, bl2, n10));
    }

    public final void onPlaybackStateChanged(int n10) {
        ed.a a14 = this.a();
        this.a(a14, 4, new n93(a14, n10));
    }

    public final void onPlaybackSuppressionReasonChanged(int n10) {
        ed.a a14 = this.a();
        this.a(a14, 6, new v73(a14, n10));
    }

    public final void onPlayerStateChanged(boolean bl2, int n10) {
        ed.a a14 = this.a();
        this.a(a14, -1, new n83(a14, bl2, n10));
    }

    public final void onRenderedFirstFrame() {
    }

    public final void onSkipSilenceEnabledChanged(boolean bl2) {
        ed.a a14 = this.b();
        this.a(a14, 23, new m93(a14, bl2));
    }

    public final void onSurfaceSizeChanged(int n10, int n13) {
        ed.a a14 = this.b();
        this.a(a14, 24, new e93(a14, n10, n13));
    }

    public final void onVolumeChanged(float f11) {
        ed.a a14 = this.b();
        this.a(a14, 22, new g93(a14, f11));
    }

    @Override
    @CallSuper
    public final void release() {
        bf0 bf02 = this.h;
        if (bf02 != null) {
            bf02.a((Runnable)new t93(this));
            return;
        }
        throw new IllegalStateException();
    }
}


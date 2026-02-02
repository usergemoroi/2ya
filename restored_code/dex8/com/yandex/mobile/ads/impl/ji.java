/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.ViewGroup
 *  com.yandex.div.core.view2.Div2View
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.c4
 *  com.yandex.mobile.ads.impl.d30
 *  com.yandex.mobile.ads.impl.gi2
 *  com.yandex.mobile.ads.impl.iz1
 *  com.yandex.mobile.ads.impl.iz1$a
 *  com.yandex.mobile.ads.impl.jp0
 *  com.yandex.mobile.ads.impl.kh2
 *  com.yandex.mobile.ads.impl.ki
 *  com.yandex.mobile.ads.impl.kz1
 *  com.yandex.mobile.ads.impl.ni
 *  com.yandex.mobile.ads.impl.ns
 *  com.yandex.mobile.ads.impl.p4
 *  com.yandex.mobile.ads.impl.ra
 *  com.yandex.mobile.ads.impl.w8
 *  com.yandex.mobile.ads.impl.xi
 *  kotlin.collections.t
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import com.yandex.div.core.view2.Div2View;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.bf2;
import com.yandex.mobile.ads.impl.c4;
import com.yandex.mobile.ads.impl.d30;
import com.yandex.mobile.ads.impl.dg0;
import com.yandex.mobile.ads.impl.gi2;
import com.yandex.mobile.ads.impl.ii;
import com.yandex.mobile.ads.impl.iz1;
import com.yandex.mobile.ads.impl.jp0;
import com.yandex.mobile.ads.impl.kh2;
import com.yandex.mobile.ads.impl.ki;
import com.yandex.mobile.ads.impl.kz1;
import com.yandex.mobile.ads.impl.li;
import com.yandex.mobile.ads.impl.ni;
import com.yandex.mobile.ads.impl.ns;
import com.yandex.mobile.ads.impl.oo1;
import com.yandex.mobile.ads.impl.p4;
import com.yandex.mobile.ads.impl.ra;
import com.yandex.mobile.ads.impl.w8;
import com.yandex.mobile.ads.impl.xi;
import java.util.List;
import kotlin.collections.t;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ji
extends oo1
implements xi {
    @NotNull
    private final jp0 B;
    @NotNull
    private final ii C;
    @NotNull
    private final bf2 D;
    @NotNull
    private final li E;
    @NotNull
    private final ki F;
    @NotNull
    private final dg0 G;
    @NotNull
    private final d30 H;
    @Nullable
    private ni I;
    @Nullable
    private ni J;

    @JvmOverloads
    public ji(@NotNull Context context, @NotNull jp0 jp02, @NotNull ii ii3, @NotNull p4 p42, @NotNull bf2 bf22, @NotNull li li3, @NotNull ki ki3, @NotNull dg0 dg02, @NotNull d30 d302) {
        super(context, jp02, p42);
        this.B = jp02;
        this.C = ii3;
        this.D = bf22;
        this.E = li3;
        this.F = ki3;
        this.G = dg02;
        this.H = d302;
        ji.a(jp02);
        ii3.a(dg02);
    }

    private static void a(jp0 jp02) {
        jp02.setHorizontalScrollBarEnabled(false);
        jp02.setVerticalScrollBarEnabled(false);
        jp02.setVisibility(8);
        jp02.setBackgroundColor(0);
    }

    @Nullable
    public final String A() {
        Object object = this.J;
        object = object != null ? object.getAdInfo() : null;
        return object;
    }

    @NotNull
    public final jp0 B() {
        return this.B;
    }

    @NotNull
    public final List<ra> C() {
        Object object;
        block3: {
            block2: {
                object = this.J;
                if (object == null) break block2;
                List list = object.a();
                object = list;
                if (list != null) break block3;
            }
            object = t.m();
        }
        return object;
    }

    @NotNull
    public final bf2 D() {
        return this.D;
    }

    @Override
    public final void a(@NotNull b8<String> b82) {
        ni ni3;
        super.a(b82);
        this.G.a(b82);
        this.G.a(this.e());
        this.J = ni3 = this.F.a(b82).a(this);
        ni3.a(this.k(), b82);
    }

    public final void a(@Nullable c4 c43) {
        this.C.a(c43);
    }

    public final void a(@Nullable ns ns3) {
        this.a(this.C);
        this.C.a(ns3);
    }

    @Override
    public final void c() {
        super.c();
        this.C.a((ns)null);
        kh2.a((ViewGroup)this.B, (boolean)true);
        this.B.setVisibility(8);
        gi2.a((ViewGroup)this.B);
    }

    @Override
    public final void d() {
        ni ni3 = this.I;
        ni ni4 = this.J;
        for (int i14 = 0; i14 < 2; ++i14) {
            ni ni5 = (new ni[]{ni3, ni4})[i14];
            if (ni5 == null) continue;
            ni5.a(this.k());
        }
        super.d();
    }

    public final void onLeftApplication() {
        this.C.b();
    }

    public final void onReturnedToApplication() {
        this.C.c();
    }

    @Override
    public final void t() {
        super.t();
        Object object = this.I;
        if (object != this.J) {
            if ((object = (new ni[]{object})[0]) != null) {
                object.a(this.k());
            }
            this.I = this.J;
        }
        object = this.e().q();
        iz1.a a13 = iz1.a.d;
        if (a13 == (object = object != null ? object.a() : null) && this.B.getLayoutParams() != null) {
            this.B.getLayoutParams().height = -2;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean y() {
        void var2_4;
        b8 b82 = this.j();
        if (b82 != null) {
            iz1 iz12 = b82.N();
        } else {
            Object var2_3 = null;
        }
        if (var2_4 == null) return false;
        iz1 iz13 = this.e().q();
        b8 b84 = this.j();
        if (b84 == null) return false;
        if (iz13 == null) return false;
        if (!kz1.a((Context)this.k(), b84, (iz1)var2_4, (w8)this.E, (iz1)iz13)) return false;
        return true;
    }

    public final void z() {
        Object object = this.H;
        jp0 jp02 = this.B;
        object.getClass();
        object = jp02.findViewWithTag((Object)"rootDivkitView");
        object = object instanceof Div2View ? (Div2View)object : null;
        if (object != null) {
            object.setVariable("is_banner_closed", "closed");
        }
        this.C.a();
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  com.monetization.ads.nativeads.ExtendedNativeAdView
 *  com.yandex.mobile.ads.impl.bm1
 *  com.yandex.mobile.ads.impl.cs1
 *  com.yandex.mobile.ads.impl.fr0
 *  com.yandex.mobile.ads.impl.gr0
 *  com.yandex.mobile.ads.impl.ht
 *  com.yandex.mobile.ads.impl.mz1
 *  com.yandex.mobile.ads.impl.nr
 *  com.yandex.mobile.ads.impl.p5
 *  com.yandex.mobile.ads.impl.rd0
 *  com.yandex.mobile.ads.impl.t1
 *  com.yandex.mobile.ads.impl.t2
 *  com.yandex.mobile.ads.impl.t20
 *  com.yandex.mobile.ads.impl.t61
 *  com.yandex.mobile.ads.impl.u1
 *  com.yandex.mobile.ads.impl.v5
 *  com.yandex.mobile.ads.impl.wz1
 *  com.yandex.mobile.ads.impl.x5
 *  kotlin.collections.t
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import com.yandex.mobile.ads.impl.bm1;
import com.yandex.mobile.ads.impl.cs1;
import com.yandex.mobile.ads.impl.fr0;
import com.yandex.mobile.ads.impl.gr0;
import com.yandex.mobile.ads.impl.ht;
import com.yandex.mobile.ads.impl.mz1;
import com.yandex.mobile.ads.impl.nr;
import com.yandex.mobile.ads.impl.ns1;
import com.yandex.mobile.ads.impl.op;
import com.yandex.mobile.ads.impl.p5;
import com.yandex.mobile.ads.impl.rd0;
import com.yandex.mobile.ads.impl.t1;
import com.yandex.mobile.ads.impl.t2;
import com.yandex.mobile.ads.impl.t20;
import com.yandex.mobile.ads.impl.t61;
import com.yandex.mobile.ads.impl.u1;
import com.yandex.mobile.ads.impl.u5;
import com.yandex.mobile.ads.impl.v5;
import com.yandex.mobile.ads.impl.wz1;
import com.yandex.mobile.ads.impl.x5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.t;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class s5
implements rd0,
mz1 {
    @NotNull
    private final ViewGroup a;
    @NotNull
    private final u1 b;
    @NotNull
    private final nr c;
    @NotNull
    private final p5 d;
    @NotNull
    private final ExtendedNativeAdView e;
    @NotNull
    private final t1 f;
    @NotNull
    private final bm1 g;
    @NotNull
    private final op h;
    @NotNull
    private final cs1 i;
    @NotNull
    private final ArrayList j;
    @NotNull
    private final List<v5> k;
    private final long l;
    private int m;
    private boolean n;

    @JvmOverloads
    public s5(@NotNull Context context, @NotNull t61 t612, @NotNull ht ht3, @NotNull ns1 ns12, @Nullable ArrayList arrayList, @Nullable t20 t202, @NotNull ViewGroup object, @NotNull u1 u13, @NotNull nr nr2, @NotNull gr0 gr02, @NotNull p5 p53, @NotNull ExtendedNativeAdView extendedNativeAdView, @NotNull t1 t13, @NotNull bm1 bm12, @NotNull op op2, @NotNull cs1 cs12) {
        this.a = object;
        this.b = u13;
        this.c = nr2;
        this.d = p53;
        this.e = extendedNativeAdView;
        this.f = t13;
        this.g = bm12;
        this.h = op2;
        this.i = cs12;
        this.k = object = p53.b();
        object = object.iterator();
        long l10 = 0L;
        while (object.hasNext()) {
            l10 += ((v5)object.next()).a();
        }
        this.l = l10;
        this.j = gr02.a(context, this.e, t612, ht3, (t2)new a(this), ns12, this.g, new u5(this), arrayList, t202, this.d, this.h);
    }

    private final void b() {
        ViewGroup viewGroup = this.a;
        int n10 = this.m;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("pageIndex: ");
        stringBuilder.append(n10);
        viewGroup.setContentDescription((CharSequence)stringBuilder.toString());
    }

    public final void a() {
        int n10 = this.m - 1;
        if (n10 == this.d.c() && !this.n) {
            this.n = true;
            this.b.b();
        }
        if (this.m < this.j.size()) {
            Object object = (fr0)t.u0((List)this.j, (int)n10);
            if (object != null) {
                object.b();
            }
            if ((object = (object = (v5)t.u0(this.k, (int)n10)) != null && (object = object.b()) != null ? object.b() : null) == wz1.c) {
                int n13;
                this.m = n13 = this.j.size() - 1;
                object = this.k.subList(n10, n13).iterator();
                long l10 = 0L;
                while (object.hasNext()) {
                    l10 += ((v5)object.next()).a();
                }
                this.g.a(l10);
                this.h.b();
                n13 = this.m;
                this.m = n13 + 1;
                if (!((fr0)this.j.get(n13)).a()) {
                    if (this.m >= this.j.size()) {
                        this.c.e();
                    } else {
                        this.d();
                    }
                } else {
                    this.b();
                    this.i.a((View)this.e, this.l, this.g.a());
                }
            } else {
                this.d();
            }
        }
    }

    public final void c() {
        ViewGroup viewGroup = this.a;
        ExtendedNativeAdView extendedNativeAdView = this.e;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        viewGroup.removeAllViews();
        viewGroup.addView((View)extendedNativeAdView, layoutParams);
        if (this.f.a(this.e)) {
            this.m = 1;
            this.n = false;
            viewGroup = (fr0)t.t0((List)this.j);
            if (viewGroup != null && viewGroup.a()) {
                this.b();
                this.i.a((View)this.e, this.l, this.g.a());
            } else if (this.m >= this.j.size()) {
                this.c.e();
            } else {
                this.d();
            }
        }
    }

    public final void d() {
        int n10 = this.m;
        v5 v53 = (v5)t.u0(this.k, (int)(n10 - 1));
        long l10 = v53 != null ? v53.a() : 0L;
        this.g.a(l10);
        this.h.b();
        if (this.m < this.j.size()) {
            n10 = this.m;
            this.m = n10 + 1;
            if (!((fr0)this.j.get(n10)).a()) {
                if (this.m >= this.j.size()) {
                    this.c.e();
                } else {
                    this.d();
                }
            } else {
                this.b();
                this.i.a((View)this.e, this.l, this.g.a());
            }
        }
    }

    public final void invalidate() {
        Iterator iterator = this.j.iterator();
        while (iterator.hasNext()) {
            ((fr0)iterator.next()).b();
        }
        this.f.a();
    }

    private final class a
    implements t2 {
        final s5 a;

        public a(s5 s53) {
            this.a = s53;
        }

        public final void a() {
            this.a.d();
        }

        public final void b() {
            v5 v53;
            x5 x53;
            int n10 = this.a.m - 1;
            if (n10 == this.a.d.c() && !this.a.n) {
                this.a.n = true;
                this.a.b.b();
            }
            if ((x53 = (v53 = (v5)t.u0((List)this.a.k, (int)n10)) != null ? v53.c() : null) != x5.c || v53.b() == null) {
                this.a.d();
            }
        }
    }
}


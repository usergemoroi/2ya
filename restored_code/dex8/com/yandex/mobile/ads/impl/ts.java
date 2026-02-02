/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  androidx.annotation.MainThread
 *  com.yandex.mobile.ads.impl.cu
 *  com.yandex.mobile.ads.impl.gm0
 *  com.yandex.mobile.ads.impl.gv1
 *  com.yandex.mobile.ads.impl.ho0
 *  com.yandex.mobile.ads.impl.ic2
 *  com.yandex.mobile.ads.impl.il0
 *  com.yandex.mobile.ads.impl.il0$a
 *  com.yandex.mobile.ads.impl.im0
 *  com.yandex.mobile.ads.impl.km0
 *  com.yandex.mobile.ads.impl.lo0
 *  com.yandex.mobile.ads.impl.mo0
 *  com.yandex.mobile.ads.impl.n70
 *  com.yandex.mobile.ads.impl.o82
 *  com.yandex.mobile.ads.impl.oo0
 *  com.yandex.mobile.ads.impl.po0
 *  com.yandex.mobile.ads.impl.ss
 *  com.yandex.mobile.ads.impl.xl0
 *  com.yandex.mobile.ads.impl.ys
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import androidx.annotation.MainThread;
import com.yandex.mobile.ads.impl.cu;
import com.yandex.mobile.ads.impl.gm0;
import com.yandex.mobile.ads.impl.gv1;
import com.yandex.mobile.ads.impl.ho0;
import com.yandex.mobile.ads.impl.ic2;
import com.yandex.mobile.ads.impl.il0;
import com.yandex.mobile.ads.impl.im0;
import com.yandex.mobile.ads.impl.km0;
import com.yandex.mobile.ads.impl.lo0;
import com.yandex.mobile.ads.impl.mo0;
import com.yandex.mobile.ads.impl.n70;
import com.yandex.mobile.ads.impl.o82;
import com.yandex.mobile.ads.impl.oo0;
import com.yandex.mobile.ads.impl.po0;
import com.yandex.mobile.ads.impl.rf2;
import com.yandex.mobile.ads.impl.ss;
import com.yandex.mobile.ads.impl.vn0;
import com.yandex.mobile.ads.impl.xl0;
import com.yandex.mobile.ads.impl.xm2;
import com.yandex.mobile.ads.impl.yb2;
import com.yandex.mobile.ads.impl.ys;
import java.util.List;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@MainThread
public final class ts
implements o82 {
    @NotNull
    private final ys a;
    @NotNull
    private final cu b;
    @NotNull
    private final vn0 c;
    @NotNull
    private final il0 d;
    @NotNull
    private final yb2 e;
    @NotNull
    private final xl0 f;
    @NotNull
    private final im0 g;
    @NotNull
    private final lo0 h;
    @NotNull
    private final po0 i;

    public /* synthetic */ ts(Context context, gv1 gv12, ss ss3, ys ys3, cu cu3) {
        km0 km02 = new km0();
        mo0 mo02 = new mo0();
        vn0 vn02 = new vn0();
        int n10 = il0.d;
        this(context, gv12, ss3, ys3, cu3, km02, mo02, vn02, il0.a.a(), new yb2(), new xl0());
    }

    public ts(@NotNull Context context, @NotNull gv1 gv12, @NotNull ss ss3, @NotNull ys ys3, @NotNull cu cu3, @NotNull km0 km02, @NotNull mo0 mo02, @NotNull vn0 vn02, @NotNull il0 il02, @NotNull yb2 yb22, @NotNull xl0 xl02) {
        this.a = ys3;
        this.b = cu3;
        this.c = vn02;
        this.d = il02;
        this.e = yb22;
        this.f = xl02;
        km02.getClass();
        this.g = km0.a((o82)this);
        mo02.getClass();
        this.h = mo0.a((ts)this);
        context = new po0(context, gv12, ss3, new gm0(ys3), new rf2(cu3), xl02);
        this.i = context;
        context.a((oo0)vn02);
        context.a((ho0)yb22);
    }

    public final void a() {
        this.h.b(this.b);
        this.i.b();
    }

    public final void a(@Nullable ho0 ho02) {
        this.e.a(ho02);
    }

    public final void a(@NotNull n70 n702, @NotNull List<ic2> list) {
        ts ts3 = this.d.a((View)n702);
        if (!y.e(this, ts3)) {
            if (ts3 != null && ts3.d.a(ts3)) {
                ts3.i.d();
            }
            if (this.d.a(this)) {
                this.i.d();
            }
            this.d.a((View)n702, this);
        }
        this.g.a(this.a);
        this.h.a(this.b);
        this.i.a(n702, list);
    }

    public final void a(@Nullable xm2 xm22) {
        this.c.a(xm22);
    }

    public final void b() {
        this.i.c();
    }

    public final void c() {
        this.f.b();
    }

    public final void d() {
        this.f.c();
    }

    public final void e() {
        if (this.d.a(this)) {
            this.i.d();
        }
    }

    public final void invalidateAdPlayer() {
        this.g.b(this.a);
        this.i.a();
    }
}


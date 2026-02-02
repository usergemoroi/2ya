/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.ba
 *  com.yandex.mobile.ads.impl.bo
 *  com.yandex.mobile.ads.impl.dd0
 *  com.yandex.mobile.ads.impl.f3
 *  com.yandex.mobile.ads.impl.gv1
 *  com.yandex.mobile.ads.impl.j7
 *  com.yandex.mobile.ads.impl.l0
 *  com.yandex.mobile.ads.impl.md0
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.p4
 *  com.yandex.mobile.ads.impl.v8
 *  com.yandex.mobile.ads.impl.vc0
 *  com.yandex.mobile.ads.impl.wc0
 *  com.yandex.mobile.ads.impl.x2
 *  com.yandex.mobile.ads.impl.xc0
 */
package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import com.yandex.mobile.ads.impl.ag0;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.ba;
import com.yandex.mobile.ads.impl.bo;
import com.yandex.mobile.ads.impl.dd0;
import com.yandex.mobile.ads.impl.dg0;
import com.yandex.mobile.ads.impl.f3;
import com.yandex.mobile.ads.impl.gv1;
import com.yandex.mobile.ads.impl.j7;
import com.yandex.mobile.ads.impl.l0;
import com.yandex.mobile.ads.impl.md0;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.p4;
import com.yandex.mobile.ads.impl.sd0;
import com.yandex.mobile.ads.impl.v8;
import com.yandex.mobile.ads.impl.vc0;
import com.yandex.mobile.ads.impl.wc0;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.xc0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class cd0<T extends sd0<T>>
extends ag0 {
    @NotNull
    private final xc0 A;
    @Nullable
    private vc0<T> B;
    @Nullable
    private vc0<T> C;
    @Nullable
    private T D;
    @NotNull
    private final dd0<T> x;
    @NotNull
    private final md0<T> y;
    @NotNull
    private final dg0 z;

    public cd0(@NotNull Context context, @NotNull x2 x22, @NotNull dd0 dd02, @NotNull p4 p42, @NotNull md0 md02, @NotNull dg0 dg02, @NotNull xc0 xc02) {
        super(context, x22, p42);
        this.x = dd02;
        this.y = md02;
        this.z = dg02;
        this.A = xc02;
        this.a(v8.a.a());
    }

    public /* synthetic */ cd0(Context context, x2 x22, gv1 gv12, dd0 dd02, p4 p42, md0 md02, dg0 dg02) {
        this(context, x22, dd02, p42, md02, dg02, new xc0(gv12));
    }

    @NotNull
    protected abstract vc0<T> a(@NotNull wc0 var1);

    @Override
    public void a(@NotNull b8<String> b82) {
        super.a(b82);
        this.z.a(b82);
        this.z.a(this.e());
        vc0<T> vc02 = this.a(this.A.a(b82));
        this.C = this.B;
        this.B = vc02;
        this.D = this.y.a(b82, this.e(), vc02);
        Activity activity = l0.a();
        if (activity != null) {
            int n10 = op0.b;
        }
        if (activity == null) {
            activity = this.k();
        }
        vc02.a((Context)activity, b82);
    }

    @Override
    protected final void a(@NotNull f3 f33) {
        this.x.a(f33);
    }

    @Override
    public final void d() {
        if (!ba.a((bo)this)) {
            Context context = this.k();
            vc0<T> vc02 = this.C;
            vc0<T> vc03 = this.B;
            for (int i14 = 0; i14 < 2; ++i14) {
                vc0 vc04 = (new vc0[]{vc02, vc03})[i14];
                if (vc04 == null) continue;
                vc04.a(context);
            }
            super.d();
        }
    }

    @Override
    protected final void q() {
        f3 f33 = j7.q();
        this.x.a(f33);
    }

    @Override
    protected final void r() {
        T t13 = this.D;
        if (t13 != null) {
            this.x.a(t13);
        } else {
            this.x.a(j7.m());
        }
    }
}


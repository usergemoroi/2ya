/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.a6
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.bu1
 *  com.yandex.mobile.ads.impl.f3
 *  com.yandex.mobile.ads.impl.gv1
 *  com.yandex.mobile.ads.impl.lv1
 *  com.yandex.mobile.ads.impl.nv1
 *  com.yandex.mobile.ads.impl.o4
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.ov1
 *  com.yandex.mobile.ads.impl.pv1
 *  com.yandex.mobile.ads.impl.vc0
 *  com.yandex.mobile.ads.impl.w8
 *  com.yandex.mobile.ads.impl.x2
 */
package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import com.yandex.mobile.ads.impl.a6;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.bu1;
import com.yandex.mobile.ads.impl.cd0;
import com.yandex.mobile.ads.impl.f3;
import com.yandex.mobile.ads.impl.gv1;
import com.yandex.mobile.ads.impl.lv1;
import com.yandex.mobile.ads.impl.mv1;
import com.yandex.mobile.ads.impl.nd0;
import com.yandex.mobile.ads.impl.nv1;
import com.yandex.mobile.ads.impl.o4;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.ov1;
import com.yandex.mobile.ads.impl.pv1;
import com.yandex.mobile.ads.impl.sd0;
import com.yandex.mobile.ads.impl.vc0;
import com.yandex.mobile.ads.impl.w8;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.xf0;
import kotlin.jvm.JvmOverloads;
import kotlin.u;
import kotlin.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class kv1<T extends sd0<T>>
implements vc0<T> {
    @NotNull
    private final cd0<T> a;
    @NotNull
    private final bu1 b;
    @NotNull
    private final ov1<lv1> c;
    @Nullable
    private lv1 d;

    public /* synthetic */ kv1(cd0 cd02, gv1 gv12) {
        x2 x22 = cd02.e();
        nd0 nd02 = new nd0();
        mv1 mv12 = new mv1(cd02.k(), gv12, x22);
        this(cd02, gv12, new bu1(x22), new ov1(x22, (w8)nd02, (nv1)mv12));
    }

    @JvmOverloads
    public kv1(@NotNull cd0 cd02, @NotNull gv1 gv12, @NotNull bu1 bu12, @NotNull ov1 ov12) {
        this.a = cd02;
        this.b = bu12;
        this.c = ov12;
    }

    @NotNull
    public final Object a(@NotNull T t13, @NotNull Activity activity) {
        Object object = u.d;
        object = u.b(v.a((Throwable)a6.a()));
        lv1 lv12 = this.d;
        if (lv12 != null) {
            object = lv12.a((Context)activity, ((xf0)t13).i());
            this.d = null;
        }
        return object;
    }

    public final void a(@NotNull Context context) {
        int n10 = op0.b;
        this.c.a();
        context = this.d;
        if (context != null) {
            context.d();
        }
        this.d = null;
    }

    public final void a(@NotNull Context context, @NotNull b8<String> b82) {
        this.a.h().a(o4.c, null);
        this.b.a(context, b82, null);
        this.b.a(context, b82);
        a a13 = new a(this);
        this.c.a(context, b82, (pv1)a13);
    }

    @Nullable
    public final String getAdInfo() {
        Object object = this.d;
        object = object != null ? object.e() : null;
        return object;
    }

    public final class a
    implements pv1<lv1> {
        final kv1<T> a;

        public a(kv1 kv12) {
            this.a = kv12;
        }

        public final void a(@NotNull f3 f33) {
            this.a.a.b(f33);
        }

        public final void a(Object object) {
            object = (lv1)object;
            this.a.d = (lv1)object;
            this.a.a.t();
        }
    }
}


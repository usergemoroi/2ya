/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.a6
 *  com.yandex.mobile.ads.impl.a71
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.bu1
 *  com.yandex.mobile.ads.impl.f3
 *  com.yandex.mobile.ads.impl.g61
 *  com.yandex.mobile.ads.impl.gr1
 *  com.yandex.mobile.ads.impl.gv1
 *  com.yandex.mobile.ads.impl.ld0
 *  com.yandex.mobile.ads.impl.o4
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.t61
 *  com.yandex.mobile.ads.impl.v71
 *  com.yandex.mobile.ads.impl.vc0
 *  com.yandex.mobile.ads.impl.w71
 *  com.yandex.mobile.ads.impl.x2
 *  com.yandex.mobile.ads.impl.y0
 *  com.yandex.mobile.ads.impl.y0$a
 *  com.yandex.mobile.ads.impl.y91
 *  com.yandex.mobile.ads.impl.y91$b
 */
package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import com.yandex.mobile.ads.impl.a6;
import com.yandex.mobile.ads.impl.a71;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.bu1;
import com.yandex.mobile.ads.impl.cd0;
import com.yandex.mobile.ads.impl.f3;
import com.yandex.mobile.ads.impl.g61;
import com.yandex.mobile.ads.impl.gr1;
import com.yandex.mobile.ads.impl.gv1;
import com.yandex.mobile.ads.impl.ld0;
import com.yandex.mobile.ads.impl.o4;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.sd0;
import com.yandex.mobile.ads.impl.t61;
import com.yandex.mobile.ads.impl.v71;
import com.yandex.mobile.ads.impl.vc0;
import com.yandex.mobile.ads.impl.w71;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.xf0;
import com.yandex.mobile.ads.impl.y0;
import com.yandex.mobile.ads.impl.y91;
import kotlin.u;
import kotlin.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class mw1<T extends sd0<T>>
implements vc0<T> {
    @NotNull
    private final cd0<T> a;
    @NotNull
    private final g61 b;
    @NotNull
    private final bu1 c;
    @NotNull
    private final y91 d;
    @NotNull
    private final x2 e;
    @NotNull
    private final v71 f;
    @NotNull
    private final ld0 g;
    @Nullable
    private b8<String> h;
    @Nullable
    private t61 i;
    private boolean j;

    public /* synthetic */ mw1(cd0 cd02, gv1 gv12) {
        this(cd02, gv12, new g61());
    }

    public mw1(@NotNull cd0<T> p42, @NotNull gv1 gv12, @NotNull g61 g612) {
        x2 x22;
        this.a = p42;
        this.b = g612;
        g612 = p42.k();
        this.e = x22 = p42.e();
        this.f = new v71(x22);
        p42 = p42.h();
        this.c = new bu1(x22);
        this.d = new y91((Context)g612, gv12, x22, p42);
        this.g = new ld0(gv12);
    }

    @NotNull
    public final Object a(@NotNull T object, @NotNull Activity activity) {
        Object object2 = u.d;
        Object object3 = u.b(v.a((Throwable)a6.a()));
        b8<String> b82 = this.h;
        t61 t612 = this.i;
        object2 = object3;
        if (b82 != null) {
            object2 = object3;
            if (t612 != null) {
                object = new y0(new y0.a(b82, this.e, ((xf0)object).i()).a(this.e.n()).a(t612));
                object2 = this.g.a((Context)activity, object);
                this.h = null;
                this.i = null;
            }
        }
        return object2;
    }

    public final void a(@NotNull Context context) {
        this.j = true;
        this.h = null;
        this.i = null;
        this.d.a();
        int n10 = op0.b;
    }

    public final void a(@NotNull Context object, @NotNull b8<String> b82) {
        if (!this.j) {
            this.h = b82;
            this.a.h().a(o4.c, null);
            b b10 = new b(this);
            object = new a(this, (Context)object, b82);
            this.d.a(b82, (y91.b)b10, (gr1)object);
        }
    }

    @Nullable
    public final String getAdInfo() {
        return this.b.a(this.i);
    }

    private final class a
    implements gr1 {
        @NotNull
        private final b8<String> a;
        private final Context b;
        final mw1<T> c;

        public a(mw1 mw12, @NotNull Context context, @NotNull b8<String> b82) {
            this.c = mw12;
            this.a = b82;
            this.b = context.getApplicationContext();
        }

        public final void a(@NotNull a71 a712) {
            a712 = new w71(this.a, a712, this.c.e);
            this.c.c.a(this.b, this.a, this.c.f);
            this.c.c.a(this.b, this.a, (w71)a712);
        }

        public final void a(@NotNull f3 f33) {
            this.c.c.a(this.b, this.a, this.c.f);
            this.c.c.a(this.b, this.a, null);
        }
    }

    private final class b
    implements y91.b {
        final mw1<T> a;

        public b(mw1 mw12) {
            this.a = mw12;
        }

        public final void a(@NotNull f3 f33) {
            if (!this.a.j) {
                this.a.i = null;
                this.a.a.b(f33);
            }
        }

        public final void a(@NotNull t61 t612) {
            if (!this.a.j) {
                this.a.i = t612;
                this.a.a.t();
            }
        }
    }
}


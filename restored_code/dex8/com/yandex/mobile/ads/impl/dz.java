/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  com.yandex.mobile.ads.impl.cp
 *  com.yandex.mobile.ads.impl.fp
 *  com.yandex.mobile.ads.impl.mg1
 *  com.yandex.mobile.ads.impl.mg1$a
 *  com.yandex.mobile.ads.impl.og1
 *  com.yandex.mobile.ads.impl.p52
 *  com.yandex.mobile.ads.impl.uv
 *  com.yandex.mobile.ads.impl.vv
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.cp;
import com.yandex.mobile.ads.impl.fp;
import com.yandex.mobile.ads.impl.mg1;
import com.yandex.mobile.ads.impl.og1;
import com.yandex.mobile.ads.impl.op;
import com.yandex.mobile.ads.impl.p52;
import com.yandex.mobile.ads.impl.uv;
import com.yandex.mobile.ads.impl.vv;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;

public final class dz
implements fp {
    @NotNull
    private final View a;
    @NotNull
    private final cp b;
    @NotNull
    private final vv c;
    private final long d;
    @NotNull
    private final op e;
    @NotNull
    private final mg1 f;

    public /* synthetic */ dz(View view, cp cp2, vv vv2, long l10, op op2) {
        int n10 = mg1.a;
        this(view, cp2, vv2, l10, op2, mg1.a.a((boolean)true));
    }

    public dz(@NotNull View view, @NotNull cp cp2, @NotNull vv vv2, long l10, @NotNull op op2, @NotNull mg1 mg12) {
        this.a = view;
        this.b = cp2;
        this.c = vv2;
        this.d = l10;
        this.e = op2;
        this.f = mg12;
        cp2.a(this.d());
    }

    public final void a() {
        this.f.resume();
    }

    public final void a(boolean bl2) {
    }

    public final void b() {
        this.f.pause();
    }

    public final void c() {
        a a12 = new a(this.a, this.b, this.c);
        long l10 = (long)Math.max(0.0, (double)(this.d - this.e.a()));
        if (l10 == 0L) {
            this.b.b(this.a);
        } else {
            this.f.a((p52)this.e);
            this.f.a(l10, (og1)a12);
            this.c.a(uv.d);
        }
    }

    @NotNull
    public final View d() {
        return this.a;
    }

    public final void invalidate() {
        this.f.invalidate();
    }

    private static final class a
    implements og1 {
        @NotNull
        private final cp a;
        @NotNull
        private final vv b;
        @NotNull
        private final WeakReference<View> c;

        public a(@NotNull View view, @NotNull cp cp2, @NotNull vv vv2) {
            this.a = cp2;
            this.b = vv2;
            this.c = new WeakReference<View>(view);
        }

        public final void a() {
            View view = (View)this.c.get();
            if (view != null) {
                this.a.b(view);
                this.b.a(uv.e);
            }
        }
    }
}


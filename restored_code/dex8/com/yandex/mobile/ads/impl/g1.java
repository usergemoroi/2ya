/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  android.view.Window
 *  android.widget.RelativeLayout
 *  androidx.core.view.WindowCompat
 *  androidx.core.view.WindowInsetsCompat$Type
 *  com.yandex.mobile.ads.impl.a1
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.bd0
 *  com.yandex.mobile.ads.impl.f1
 *  com.yandex.mobile.ads.impl.i1
 *  com.yandex.mobile.ads.impl.is
 *  com.yandex.mobile.ads.impl.nr
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.ou1
 *  com.yandex.mobile.ads.impl.pc0
 *  com.yandex.mobile.ads.impl.rd0
 *  com.yandex.mobile.ads.impl.t61
 *  com.yandex.mobile.ads.impl.wd0
 *  com.yandex.mobile.ads.impl.x2
 *  com.yandex.mobile.ads.impl.y7
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import com.yandex.mobile.ads.impl.a1;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.bd0;
import com.yandex.mobile.ads.impl.f1;
import com.yandex.mobile.ads.impl.i1;
import com.yandex.mobile.ads.impl.is;
import com.yandex.mobile.ads.impl.nr;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.ou1;
import com.yandex.mobile.ads.impl.pc0;
import com.yandex.mobile.ads.impl.r1;
import com.yandex.mobile.ads.impl.rd0;
import com.yandex.mobile.ads.impl.t61;
import com.yandex.mobile.ads.impl.wd0;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.y7;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class g1
implements i1,
nr {
    @NotNull
    private final Context a;
    @NotNull
    private final RelativeLayout b;
    @NotNull
    private final Window c;
    @NotNull
    private final t61 d;
    @NotNull
    private final b8<?> e;
    @NotNull
    private final f1 f;
    @NotNull
    private final x2 g;
    @Nullable
    private final ou1 h;
    @NotNull
    private final pc0 i;
    @NotNull
    private final bd0 j;
    @NotNull
    private final rd0 k;

    public g1(@NotNull Context context, @NotNull RelativeLayout relativeLayout, @NotNull Window window, @NotNull t61 t612, @NotNull b8 b82, @NotNull r1 r12, @NotNull a1 a13, @NotNull x2 x22, int n10, @Nullable ou1 ou12, @NotNull pc0 pc02, @NotNull bd0 bd02) {
        this.a = context;
        this.b = relativeLayout;
        this.c = window;
        this.d = t612;
        this.e = b82;
        this.f = r12;
        this.g = x22;
        this.h = ou12;
        this.i = pc02;
        this.j = bd02;
        this.k = new wd0(context, b82, relativeLayout, (nr)this, a13, n10, r12, x22).a(context, t612, (nr)this);
    }

    public final void a() {
        this.f.a(2, null);
    }

    public final void b() {
        this.f.a(3, null);
    }

    public final void c() {
        if (this.g.b() != is.i) {
            this.b.setBackground((Drawable)y7.a);
        }
        this.k.c();
        this.f.a(0, null);
        this.f.a(5, null);
        int n10 = op0.b;
    }

    public final void d() {
        this.k.invalidate();
    }

    public final void e() {
        this.f.a();
    }

    public final boolean f() {
        return this.i.a();
    }

    public final void g() {
        ou1 ou12;
        int n10 = this.a.getResources().getConfiguration().orientation == 1 ? 7 : 6;
        this.f.a(n10);
        this.c.requestFeature(1);
        this.c.addFlags(1024);
        this.c.addFlags(0x1000000);
        if (this.e.A() || (ou12 = this.h) != null && ou12.x()) {
            bd0 bd02 = this.j;
            ou12 = this.c;
            bd02.getClass();
            ou12 = WindowCompat.getInsetsController((Window)ou12, (View)ou12.getDecorView());
            ou12.setSystemBarsBehavior(2);
            ou12.hide(WindowInsetsCompat.Type.navigationBars());
        }
        this.j.a(this.c, this.b);
    }

    public final void onAdClosed() {
        this.d.destroy();
        this.f.a(4, null);
    }
}


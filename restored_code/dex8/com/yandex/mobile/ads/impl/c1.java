/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 *  android.view.Window
 *  android.widget.RelativeLayout
 *  androidx.core.view.WindowCompat
 *  androidx.core.view.WindowInsetsCompat$Type
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.bd0
 *  com.yandex.mobile.ads.impl.f1
 *  com.yandex.mobile.ads.impl.i1
 *  com.yandex.mobile.ads.impl.lf1
 *  com.yandex.mobile.ads.impl.lv1
 *  com.yandex.mobile.ads.impl.nr
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.ou1
 *  com.yandex.mobile.ads.impl.pc0
 *  com.yandex.mobile.ads.impl.yc0
 */
package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.bd0;
import com.yandex.mobile.ads.impl.f1;
import com.yandex.mobile.ads.impl.i1;
import com.yandex.mobile.ads.impl.lf1;
import com.yandex.mobile.ads.impl.lv1;
import com.yandex.mobile.ads.impl.nr;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.ou1;
import com.yandex.mobile.ads.impl.pc0;
import com.yandex.mobile.ads.impl.r1;
import com.yandex.mobile.ads.impl.yc0;
import java.io.Serializable;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class c1
implements i1,
nr {
    @NotNull
    private final RelativeLayout a;
    @NotNull
    private final f1 b;
    @NotNull
    private final Window c;
    @Nullable
    private final ou1 d;
    @NotNull
    private final lf1 e;
    @NotNull
    private final pc0 f;
    @NotNull
    private final bd0 g;
    @NotNull
    private final b8<?> h;
    @NotNull
    private final lv1 i;

    @JvmOverloads
    public c1(@NotNull RelativeLayout relativeLayout, @NotNull r1 r12, @NotNull Window window, @NotNull yc0 yc02, @Nullable ou1 ou12, @NotNull lf1 lf12, @NotNull pc0 pc02, @NotNull bd0 bd02) {
        this.a = relativeLayout;
        this.b = r12;
        this.c = window;
        this.d = ou12;
        this.e = lf12;
        this.f = pc02;
        this.g = bd02;
        this.h = yc02.a();
        relativeLayout = yc02.b();
        this.i = relativeLayout;
        relativeLayout.a((nr)this);
    }

    public final void a() {
        this.b.a(2, null);
        this.i.i();
    }

    public final void b() {
        this.b.a(3, null);
        this.i.g();
    }

    public final void c() {
        this.i.a(this.a);
        Bundle bundle = new Bundle();
        Object object = this.i.f().a();
        object = object instanceof Serializable ? (Serializable)object : null;
        bundle.putSerializable("extra_tracking_parameters", (Serializable)object);
        this.b.a(0, bundle);
        this.b.a(5, null);
        int n10 = op0.b;
    }

    public final void d() {
        this.i.d();
    }

    public final void e() {
        this.b.a();
    }

    public final boolean f() {
        boolean bl2 = !(!this.f.a() || this.i.f().b() && this.h.R());
        return bl2;
    }

    public final void g() {
        ou1 ou12;
        this.c.requestFeature(1);
        this.c.addFlags(1024);
        this.c.addFlags(0x1000000);
        if (this.h.A() || (ou12 = this.d) != null && ou12.x()) {
            ou12 = this.g;
            Window window = this.c;
            ou12.getClass();
            ou12 = WindowCompat.getInsetsController((Window)window, (View)window.getDecorView());
            ou12.setSystemBarsBehavior(2);
            ou12.hide(WindowInsetsCompat.Type.navigationBars());
        }
        this.g.a(this.c, this.a);
        this.e.a();
    }

    public final void onAdClosed() {
        this.b.a(4, null);
    }
}


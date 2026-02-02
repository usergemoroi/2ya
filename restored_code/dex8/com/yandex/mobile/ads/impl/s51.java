/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.c4
 *  com.yandex.mobile.ads.impl.dk0$a
 *  com.yandex.mobile.ads.impl.ht
 *  com.yandex.mobile.ads.impl.i0
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.qr0
 *  com.yandex.mobile.ads.impl.r50
 *  com.yandex.mobile.ads.impl.x2
 *  com.yandex.mobile.ads.impl.z71
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.c4;
import com.yandex.mobile.ads.impl.dk0;
import com.yandex.mobile.ads.impl.ht;
import com.yandex.mobile.ads.impl.i0;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.qr0;
import com.yandex.mobile.ads.impl.r50;
import com.yandex.mobile.ads.impl.u51;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.z71;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class s51
implements r50,
dk0.a {
    @NotNull
    private final u51 a;
    @NotNull
    private final i0 b;

    public /* synthetic */ s51(Context context, x2 x22, b8 b82) {
        u51 u512 = new u51();
        this(u512, new i0(context, x22, b82, u512));
    }

    @JvmOverloads
    public s51(@NotNull u51 u512, @NotNull i0 i04) {
        this.a = u512;
        this.b = i04;
    }

    public final void a() {
        this.a.a();
    }

    public final void a(@Nullable c4 c43) {
        this.a.a(c43);
    }

    public final void a(@Nullable ht ht3) {
        this.a.a(ht3);
    }

    public final void a(@NotNull qr0 qr02) {
        this.b.a(qr02.c());
    }

    public final void a(@NotNull z71 z712) {
        this.b.a(z712);
    }

    public final void b() {
        int n10 = op0.b;
        this.b.a();
    }

    public final void c() {
        this.b.e();
    }

    public final void d() {
        this.a.onLeftApplication();
        this.b.d();
    }

    public final void e() {
        this.a.onLeftApplication();
        this.b.f();
    }

    public final void f() {
        this.b.b();
    }

    public final void g() {
        this.a.onLeftApplication();
        this.b.c();
    }
}


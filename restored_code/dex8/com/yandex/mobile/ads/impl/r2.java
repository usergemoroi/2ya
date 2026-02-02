/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  com.yandex.mobile.ads.impl.af0
 *  com.yandex.mobile.ads.impl.b0
 *  com.yandex.mobile.ads.impl.b51
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.e72
 *  com.yandex.mobile.ads.impl.gv1
 *  com.yandex.mobile.ads.impl.i42
 *  com.yandex.mobile.ads.impl.i71
 *  com.yandex.mobile.ads.impl.i9
 *  com.yandex.mobile.ads.impl.j42
 *  com.yandex.mobile.ads.impl.qr0
 *  com.yandex.mobile.ads.impl.r91
 *  com.yandex.mobile.ads.impl.s2
 *  com.yandex.mobile.ads.impl.vf
 *  com.yandex.mobile.ads.impl.w
 *  com.yandex.mobile.ads.impl.x2
 *  com.yandex.mobile.ads.impl.xp1
 *  com.yandex.mobile.ads.impl.z71
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.impl.af0;
import com.yandex.mobile.ads.impl.b0;
import com.yandex.mobile.ads.impl.b51;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.e72;
import com.yandex.mobile.ads.impl.g8;
import com.yandex.mobile.ads.impl.gv1;
import com.yandex.mobile.ads.impl.i42;
import com.yandex.mobile.ads.impl.i71;
import com.yandex.mobile.ads.impl.i9;
import com.yandex.mobile.ads.impl.j42;
import com.yandex.mobile.ads.impl.l4;
import com.yandex.mobile.ads.impl.q91;
import com.yandex.mobile.ads.impl.qr0;
import com.yandex.mobile.ads.impl.r91;
import com.yandex.mobile.ads.impl.s2;
import com.yandex.mobile.ads.impl.s51;
import com.yandex.mobile.ads.impl.vf;
import com.yandex.mobile.ads.impl.w;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.xp1;
import com.yandex.mobile.ads.impl.z71;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class r2
implements s2 {
    @NotNull
    private final gv1 a;
    @NotNull
    private final b8<?> b;
    @NotNull
    private final x2 c;
    @NotNull
    private final s51 d;
    @NotNull
    private final j42 e;
    @NotNull
    private final i9 f;
    @NotNull
    private final b51 g;
    @NotNull
    private final e72 h;
    @NotNull
    private final l4 i;
    @Nullable
    private z71 j;

    public /* synthetic */ r2(Context context, gv1 gv12, b8 b82, x2 x22, s51 s512, j42 j422) {
        i9 i94 = new i9(context, x22);
        this(gv12, b82, x22, s512, j422, i94, new b51(context, x22, b82), new e72(i94), new l4(s512));
    }

    public r2(@NotNull gv1 gv12, @NotNull b8 b82, @NotNull x2 x22, @NotNull s51 s512, @NotNull j42 j422, @NotNull i9 i94, @NotNull b51 b512, @NotNull e72 e722, @NotNull l4 l42) {
        this.a = gv12;
        this.b = b82;
        this.c = x22;
        this.d = s512;
        this.e = j422;
        this.f = i94;
        this.g = b512;
        this.h = e722;
        this.i = l42;
    }

    @NotNull
    public final af0 a(@NotNull View view, @NotNull vf<?> object, @NotNull qr0 qr02, @NotNull i71 i712) {
        this.d.a(qr02);
        Object object2 = view.getContext();
        g8 g84 = this.i.a();
        object = this.g.a(object.b(), "url");
        object2 = this.e.a((Context)object2, this.a, this.c, this.b, g84);
        g84 = new r91(this.f, (i42)object2);
        object2 = g84.a((xp1)object);
        view = new b0(new w(this.c, this.b, object, (r91)g84, i712, this.d, this.j, this.h)).a(view, qr02.a());
        this.h.a(qr02.d());
        object = qr02.e();
        if (object != null && ((String)object).length() > 0) {
            ((q91)object2).a((String)object);
        }
        return view;
    }

    public final void a(@Nullable z71 z712) {
        this.j = z712;
        this.g.a(z712);
    }
}


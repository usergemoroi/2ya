/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  com.yandex.mobile.ads.impl.a91
 *  com.yandex.mobile.ads.impl.ej0
 *  com.yandex.mobile.ads.impl.eo
 *  com.yandex.mobile.ads.impl.g81
 *  com.yandex.mobile.ads.impl.gt
 *  com.yandex.mobile.ads.impl.h51
 *  com.yandex.mobile.ads.impl.h61
 *  com.yandex.mobile.ads.impl.hr1
 *  com.yandex.mobile.ads.impl.i41
 *  com.yandex.mobile.ads.impl.j81
 *  com.yandex.mobile.ads.impl.jr1
 *  com.yandex.mobile.ads.impl.kt
 *  com.yandex.mobile.ads.impl.no
 *  com.yandex.mobile.ads.impl.no$a
 *  com.yandex.mobile.ads.impl.ot
 *  com.yandex.mobile.ads.impl.p61
 *  com.yandex.mobile.ads.impl.p7
 *  com.yandex.mobile.ads.impl.ra
 *  com.yandex.mobile.ads.impl.t61
 *  com.yandex.mobile.ads.impl.t71
 *  com.yandex.mobile.ads.impl.vk
 *  com.yandex.mobile.ads.impl.x2
 *  com.yandex.mobile.ads.impl.xq
 *  com.yandex.mobile.ads.impl.z71
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.impl.a91;
import com.yandex.mobile.ads.impl.dz1;
import com.yandex.mobile.ads.impl.ej0;
import com.yandex.mobile.ads.impl.eo;
import com.yandex.mobile.ads.impl.g81;
import com.yandex.mobile.ads.impl.gt;
import com.yandex.mobile.ads.impl.h51;
import com.yandex.mobile.ads.impl.h61;
import com.yandex.mobile.ads.impl.hr1;
import com.yandex.mobile.ads.impl.i41;
import com.yandex.mobile.ads.impl.j81;
import com.yandex.mobile.ads.impl.jr1;
import com.yandex.mobile.ads.impl.kt;
import com.yandex.mobile.ads.impl.m71;
import com.yandex.mobile.ads.impl.no;
import com.yandex.mobile.ads.impl.ot;
import com.yandex.mobile.ads.impl.p61;
import com.yandex.mobile.ads.impl.p7;
import com.yandex.mobile.ads.impl.ra;
import com.yandex.mobile.ads.impl.t61;
import com.yandex.mobile.ads.impl.t71;
import com.yandex.mobile.ads.impl.vk;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.xq;
import com.yandex.mobile.ads.impl.z71;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class a61
extends a91
implements t61 {
    @NotNull
    private final p61 O;
    @NotNull
    private ej0 P;
    @NotNull
    private final z71 Q;

    public a61(@NotNull Context context, @NotNull i41 i412, @NotNull p61 p612, @NotNull ej0 ej02, @NotNull vk vk2, @NotNull h51 h512) {
        super(context, vk2, h512);
        this.O = p612;
        this.P = ej02;
        context = this.a(i412, vk2.d().a());
        this.Q = context;
        this.a((z71)context);
    }

    private final z71 a(i41 object, x2 x22) {
        jr1 jr12 = object.h();
        object = new dz1((i41)object, new hr1(), new p7(), new xq());
        return new z71(x22, jr12.a(), this.f(), this.b(), (j81)object, null);
    }

    @Nullable
    public final ra a() {
        return this.O.c();
    }

    public final void a(@NotNull kt kt2) {
        this.O.b(kt2);
    }

    public final void b(@NotNull kt kt2) {
        this.O.a(kt2);
    }

    public final void b(@NotNull m71 m712) throws h61 {
        g81 g812 = m712.e();
        this.Q.a(g812);
        g812 = m712.d();
        t71 t712 = new t71(m712);
        m712 = this.P;
        no.a.getClass();
        this.a((View)g812, (ej0)m712, t712, no.a.a());
    }

    public final void b(@NotNull m71 m712, @NotNull eo eo3) throws h61 {
        View view = m712.d();
        m712 = new t71(m712);
        ej0 ej02 = this.P;
        no.a.getClass();
        this.a(view, ej02, (t71)m712, no.a.a(), eo3);
    }

    @NotNull
    public final gt getAdAssets() {
        return this.O.a();
    }

    @NotNull
    public final jr1 getAdType() {
        return this.O.b();
    }

    @Nullable
    public final String getInfo() {
        return this.O.d();
    }

    @NotNull
    public final ot getNativeAdVideoController() {
        return super.getNativeAdVideoController();
    }

    public final void loadImages() {
        this.O.e();
    }
}


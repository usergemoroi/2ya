/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  com.yandex.mobile.ads.impl.a91
 *  com.yandex.mobile.ads.impl.ba1
 *  com.yandex.mobile.ads.impl.ej0
 *  com.yandex.mobile.ads.impl.eo
 *  com.yandex.mobile.ads.impl.g81
 *  com.yandex.mobile.ads.impl.gt
 *  com.yandex.mobile.ads.impl.h51
 *  com.yandex.mobile.ads.impl.h61
 *  com.yandex.mobile.ads.impl.ht
 *  com.yandex.mobile.ads.impl.j81
 *  com.yandex.mobile.ads.impl.jr1
 *  com.yandex.mobile.ads.impl.kt
 *  com.yandex.mobile.ads.impl.no
 *  com.yandex.mobile.ads.impl.no$a
 *  com.yandex.mobile.ads.impl.ot
 *  com.yandex.mobile.ads.impl.ra
 *  com.yandex.mobile.ads.impl.t61
 *  com.yandex.mobile.ads.impl.t71
 *  com.yandex.mobile.ads.impl.vk
 *  com.yandex.mobile.ads.impl.x2
 *  com.yandex.mobile.ads.impl.z71
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.impl.a91;
import com.yandex.mobile.ads.impl.ba1;
import com.yandex.mobile.ads.impl.c02;
import com.yandex.mobile.ads.impl.ej0;
import com.yandex.mobile.ads.impl.eo;
import com.yandex.mobile.ads.impl.g81;
import com.yandex.mobile.ads.impl.gt;
import com.yandex.mobile.ads.impl.h51;
import com.yandex.mobile.ads.impl.h61;
import com.yandex.mobile.ads.impl.ht;
import com.yandex.mobile.ads.impl.j81;
import com.yandex.mobile.ads.impl.jr1;
import com.yandex.mobile.ads.impl.k81;
import com.yandex.mobile.ads.impl.kt;
import com.yandex.mobile.ads.impl.m71;
import com.yandex.mobile.ads.impl.no;
import com.yandex.mobile.ads.impl.ot;
import com.yandex.mobile.ads.impl.ra;
import com.yandex.mobile.ads.impl.t61;
import com.yandex.mobile.ads.impl.t71;
import com.yandex.mobile.ads.impl.vk;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.x71;
import com.yandex.mobile.ads.impl.z71;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class l81
extends a91
implements c02 {
    @NotNull
    private final k81 O;
    @NotNull
    private final ej0 P;

    public l81(@NotNull Context context, @NotNull k81 k812, @NotNull ej0 ej02, @NotNull vk vk3, @NotNull h51 h512) {
        super(context, vk3, h512);
        this.O = k812;
        this.P = ej02;
        this.a(this.a(vk3.d().a()));
    }

    private final z71 a(x2 x22) {
        String string2 = ba1.e.a();
        x71 x712 = new x71();
        x22 = new z71(x22, string2, this.f(), this.b(), (j81)x712, null);
        x22.a(g81.c);
        return x22;
    }

    @Nullable
    public final ra a() {
        return this.O.a();
    }

    public final void a(@Nullable ht ht3) {
        this.O.a(ht3);
    }

    public final void a(@NotNull kt kt2) {
        this.O.a(kt2);
    }

    @Override
    public final void a(@NotNull m71 m712) throws h61 {
        View view = m712.d();
        m712 = new t71(m712);
        ej0 ej02 = this.P;
        no.a.getClass();
        this.a(view, ej02, (t71)m712, no.a.a());
    }

    @Override
    public final void a(@NotNull m71 m712, @NotNull eo eo3) throws h61 {
        View view = m712.d();
        t71 t712 = new t71(m712);
        m712 = this.P;
        no.a.getClass();
        this.a(view, (ej0)m712, t712, no.a.a(), eo3);
    }

    @Override
    public final void b(@Nullable ht ht3) {
        super.a(ht3);
    }

    public final void b(@NotNull kt kt2) {
        this.O.b(kt2);
    }

    public final void b(@NotNull m71 m712) throws h61 {
        this.O.b(m712);
    }

    public final void b(@NotNull m71 m712, @NotNull eo eo3) throws h61 {
        this.O.b(m712, eo3);
    }

    @Override
    @NotNull
    public final ArrayList e() {
        return new ArrayList<t61>(this.O.f());
    }

    @NotNull
    public final gt getAdAssets() {
        return this.O.getAdAssets();
    }

    @NotNull
    public final jr1 getAdType() {
        return this.O.getAdType();
    }

    @Nullable
    public final String getInfo() {
        return this.O.getInfo();
    }

    @NotNull
    public final ot getNativeAdVideoController() {
        return super.getNativeAdVideoController();
    }

    public final void loadImages() {
        this.O.loadImages();
    }
}


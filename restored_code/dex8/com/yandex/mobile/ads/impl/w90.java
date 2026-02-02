/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 *  com.yandex.mobile.ads.impl.j90
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.impl.ga0;
import com.yandex.mobile.ads.impl.h90;
import com.yandex.mobile.ads.impl.j90;
import org.jetbrains.annotations.NotNull;

public final class w90
extends ga0 {
    @NotNull
    private final ViewGroup a;
    @NotNull
    private final j90 b;

    public w90(@NotNull ViewGroup viewGroup, @NotNull j90 j902) {
        super((View)viewGroup, 0);
        this.a = viewGroup;
        this.b = j902;
    }

    public final void a() {
        this.b.b();
    }

    public final void a(@NotNull h90 h902) {
        this.b.a(this.a.getContext(), h902.a(), h902.c(), h902.b());
    }
}


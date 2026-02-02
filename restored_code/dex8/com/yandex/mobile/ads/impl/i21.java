/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  com.yandex.mobile.ads.impl.jo
 *  com.yandex.mobile.ads.impl.mo
 *  com.yandex.mobile.ads.impl.qr0
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.jo;
import com.yandex.mobile.ads.impl.mo;
import com.yandex.mobile.ads.impl.qr0;
import com.yandex.mobile.ads.impl.x21;
import org.jetbrains.annotations.NotNull;

public final class i21
implements jo {
    @NotNull
    private final qr0 a;
    @NotNull
    private final mo b;

    public i21(@NotNull qr0 qr02, @NotNull mo mo3) {
        this.a = qr02;
        this.b = mo3;
    }

    public final void a(@NotNull x21 x212, @NotNull String string2) {
        string2 = new qr0(this.a.a(), this.a.c(), this.a.d(), string2, this.a.b());
        this.b.a((qr0)string2).onClick((View)x212);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.TextureView
 *  com.yandex.mobile.ads.impl.fb1
 *  com.yandex.mobile.ads.impl.vb1
 */
package com.yandex.mobile.ads.impl;

import android.view.TextureView;
import com.yandex.mobile.ads.impl.fb1;
import com.yandex.mobile.ads.impl.sa1;
import com.yandex.mobile.ads.impl.vb1;
import org.jetbrains.annotations.NotNull;

public final class ab1
implements fb1 {
    @NotNull
    private final sa1 a;
    @NotNull
    private final vb1 b;

    public ab1(@NotNull sa1 sa12, @NotNull vb1 vb12) {
        this.a = sa12;
        this.b = vb12;
    }

    public final void a() {
        this.b.b().b().clearAnimation();
        this.a.a((TextureView)null);
    }

    public final void b() {
        this.a.a(this.b.c());
    }
}


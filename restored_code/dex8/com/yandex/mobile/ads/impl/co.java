/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View$OnClickListener
 *  com.yandex.mobile.ads.impl.h82
 *  com.yandex.mobile.ads.impl.in0
 *  com.yandex.mobile.ads.impl.n70
 *  com.yandex.mobile.ads.impl.o5
 *  com.yandex.mobile.ads.impl.wm0
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.h82;
import com.yandex.mobile.ads.impl.in0;
import com.yandex.mobile.ads.impl.n70;
import com.yandex.mobile.ads.impl.o5;
import com.yandex.mobile.ads.impl.wm0;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;

public final class co
implements h82 {
    @NotNull
    private final wm0 a;
    @NotNull
    private final o5 b;

    @JvmOverloads
    public co(@NotNull wm0 wm02, @NotNull o5 o53) {
        this.a = wm02;
        this.b = o53;
    }

    public final void a(@NotNull n70 n702) {
        n702.setOnClickListener(null);
        n702.setClickable(false);
    }

    public final void a(@NotNull n70 n702, @NotNull in0 in02) {
        n702.setOnClickListener((View.OnClickListener)this.a);
        this.b.a(in02.a(), in02.d());
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  com.yandex.mobile.ads.impl.dh2
 *  com.yandex.mobile.ads.impl.ic2
 *  kotlin.collections.t
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.ch2;
import com.yandex.mobile.ads.impl.dh2;
import com.yandex.mobile.ads.impl.ic2;
import java.util.List;
import kotlin.collections.t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class zb1
implements dh2 {
    @NotNull
    private final ch2 a;

    public zb1(@NotNull ch2 ch22) {
        this.a = ch22;
    }

    @NotNull
    public final List<ic2> a() {
        return t.m();
    }

    @Nullable
    public final View getView() {
        return this.a.b();
    }
}


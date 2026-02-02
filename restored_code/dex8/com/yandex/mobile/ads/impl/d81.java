/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 *  com.yandex.mobile.ads.impl.e81
 *  com.yandex.mobile.ads.impl.m91
 *  com.yandex.mobile.ads.impl.t00
 */
package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.yandex.mobile.ads.impl.bf2;
import com.yandex.mobile.ads.impl.e81;
import com.yandex.mobile.ads.impl.f81;
import com.yandex.mobile.ads.impl.m91;
import com.yandex.mobile.ads.impl.t00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class d81<V extends ViewGroup>
implements t00<V> {
    @Nullable
    private final f81 a;

    public d81(@NotNull e81 e812) {
        this.a = e812.a();
    }

    public /* synthetic */ d81(m91 m912, bf2 bf22) {
        this(new e81(bf22, m912));
    }

    public final void a(@NotNull V object) {
        object = this.a;
        if (object != null) {
            ((f81)object).d();
        }
    }

    public final void c() {
        f81 f812 = this.a;
        if (f812 != null) {
            f812.a();
        }
    }
}


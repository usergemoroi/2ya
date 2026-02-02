/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.ob2
 *  com.yandex.mobile.ads.impl.se1
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.do2;
import com.yandex.mobile.ads.impl.ob2;
import com.yandex.mobile.ads.impl.se1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class eo2
implements ob2 {
    @NotNull
    private final se1 a;

    public eo2(@NotNull se1 se12) {
        this.a = se12;
    }

    @Nullable
    public final do2 a(@NotNull Context object) {
        object = this.a.a(object) ? new do2((Context)object) : null;
        return object;
    }
}


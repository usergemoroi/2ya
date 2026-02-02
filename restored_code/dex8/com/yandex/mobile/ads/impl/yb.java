/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.sb
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.sb;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class yb
implements sb {
    @NotNull
    private final String a;
    @NotNull
    private final Runnable b;

    public yb(@NotNull String string2, @NotNull Runnable runnable) {
        this.a = string2;
        this.b = runnable;
    }

    public final void a() {
        this.b.run();
    }

    public final boolean a(@Nullable String string2, @Nullable String string3) {
        boolean bl2 = y.e("mobileads", string2) && y.e(this.a, string3);
        return bl2;
    }
}


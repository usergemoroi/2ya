/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.yr1
 *  com.yandex.mobile.ads.rewarded.Reward
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.yr1;
import com.yandex.mobile.ads.rewarded.Reward;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class tn2
implements Reward {
    @NotNull
    private final yr1 a;

    public tn2(@NotNull yr1 yr12) {
        this.a = yr12;
    }

    public final boolean equals(@Nullable Object object) {
        boolean bl2 = object instanceof tn2 && y.e(((tn2)object).a, this.a);
        return bl2;
    }

    public final int getAmount() {
        return this.a.getAmount();
    }

    @NotNull
    public final String getType() {
        return this.a.getType();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}


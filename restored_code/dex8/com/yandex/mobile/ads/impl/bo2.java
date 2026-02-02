/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.me
 *  com.yandex.mobile.ads.impl.ou1
 *  com.yandex.mobile.ads.impl.y92
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.me;
import com.yandex.mobile.ads.impl.ou1;
import com.yandex.mobile.ads.impl.y92;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class bo2
implements y92 {
    @NotNull
    private final me a;
    @Nullable
    private final ou1 b;

    public bo2(@NotNull me me2, @Nullable ou1 ou12) {
        this.a = me2;
        this.b = ou12;
    }

    public final void setExperiments(@NotNull String string2) {
        ou1 ou12 = this.b;
        if (ou12 != null && ou12.F0()) {
            this.a.b(string2);
        }
    }

    public final void setTriggeredTestIds(@NotNull Set<Long> set) {
        ou1 ou12 = this.b;
        if (ou12 != null && ou12.F0()) {
            this.a.a(set);
        }
    }
}


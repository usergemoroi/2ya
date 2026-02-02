/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.G5;
import io.appmetrica.analytics.impl.i6;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessorsHolder;
import org.jetbrains.annotations.NotNull;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class j6
implements i6 {
    public final G5 a;

    public j6(@NotNull G5 g52) {
        this.a = g52;
    }

    @Override
    @NotNull
    public final G5 getAdRevenueProcessorsHolder() {
        return this.a;
    }

    @Override
    public final ModuleAdRevenueProcessorsHolder getAdRevenueProcessorsHolder() {
        return this.a;
    }
}


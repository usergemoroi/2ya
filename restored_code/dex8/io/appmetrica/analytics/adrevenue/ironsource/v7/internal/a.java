/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.adrevenue.ironsource.v7.internal;

import io.appmetrica.analytics.adrevenue.ironsource.v7.internal.IronSourceClientModuleEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueCollector;

public final class a
implements AdRevenueCollector {
    public final IronSourceClientModuleEntryPoint a;

    public a(IronSourceClientModuleEntryPoint ironSourceClientModuleEntryPoint) {
        this.a = ironSourceClientModuleEntryPoint;
    }

    @Override
    public final boolean getEnabled() {
        return IronSourceClientModuleEntryPoint.a(this.a).get();
    }

    @Override
    public final String getSourceIdentifier() {
        return "ironsource";
    }
}


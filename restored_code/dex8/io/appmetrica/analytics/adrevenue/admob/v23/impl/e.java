/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.adrevenue.admob.v23.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.adrevenue.admob.v23.impl.b;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;

public abstract class e
implements ModuleAdRevenueProcessor {
    @NonNull
    protected final b a;
    public final ClientContext b;

    public e(@NonNull b b11, @NonNull ClientContext clientContext) {
        this.a = b11;
        this.b = clientContext;
    }

    public final void a(@NonNull ModuleAdRevenue moduleAdRevenue) {
        this.b.getInternalClientModuleFacade().reportAdRevenue(moduleAdRevenue);
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue from AdMob was reported", new Object[0]);
    }

    @Override
    @NonNull
    public final String getDescription() {
        return "AdMob";
    }
}


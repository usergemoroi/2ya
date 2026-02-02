/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.ironsource.mediationsdk.IronSource
 *  com.ironsource.mediationsdk.impressionData.ImpressionDataListener
 */
package io.appmetrica.analytics.adrevenue.ironsource.v7.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import io.appmetrica.analytics.adrevenue.ironsource.v7.impl.c;
import io.appmetrica.analytics.adrevenue.ironsource.v7.internal.a;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueCollector;
import java.util.concurrent.atomic.AtomicBoolean;

public class IronSourceClientModuleEntryPoint
extends ModuleClientEntryPoint<Object> {
    private ClientContext a = null;
    private final AtomicBoolean b = new AtomicBoolean(false);

    static /* synthetic */ AtomicBoolean a(IronSourceClientModuleEntryPoint ironSourceClientModuleEntryPoint) {
        return ironSourceClientModuleEntryPoint.b;
    }

    @Override
    @Nullable
    public AdRevenueCollector getAdRevenueCollector() {
        return new a(this);
    }

    @Override
    @NonNull
    public String getIdentifier() {
        return "ad-revenue-ironsource-v7";
    }

    @Override
    public void initClientSide(@NonNull ClientContext clientContext) {
        this.a = clientContext;
    }

    @Override
    public void onActivated() {
        ClientContext clientContext;
        if (ReflectionUtils.detectClassExists("com.ironsource.mediationsdk.IronSource") && (clientContext = this.a) != null) {
            IronSource.addImpressionDataListener((ImpressionDataListener)new c(clientContext));
            this.b.set(true);
        }
    }
}


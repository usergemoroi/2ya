/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.adrevenue.applovin.v12.internal;

import io.appmetrica.analytics.adrevenue.applovin.v12.impl.a;
import io.appmetrica.analytics.adrevenue.applovin.v12.impl.b;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096D\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0010"}, d2={"Lio/appmetrica/analytics/adrevenue/applovin/v12/internal/AppLovinClientModuleEntryPoint;", "Lio/appmetrica/analytics/modulesapi/internal/client/ModuleClientEntryPoint;", "", "Lio/appmetrica/analytics/modulesapi/internal/client/ClientContext;", "clientContext", "Lkotlin/k0;", "initClientSide", "(Lio/appmetrica/analytics/modulesapi/internal/client/ClientContext;)V", "", "a", "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "identifier", "<init>", "()V", "ad-revenue-applovin-v12_release"}, k=1, mv={1, 6, 0})
public final class AppLovinClientModuleEntryPoint
extends ModuleClientEntryPoint<Object> {
    private final String a;

    public AppLovinClientModuleEntryPoint() {
        this.a = "ad-revenue-applovin-v12";
    }

    @Override
    @NotNull
    public String getIdentifier() {
        return this.a;
    }

    @Override
    public void initClientSide(@NotNull ClientContext clientContext) {
        if (ReflectionUtils.detectClassExists("com.applovin.sdk.AppLovinSdk")) {
            clientContext.getModuleAdRevenueContext().getAdRevenueProcessorsHolder().register(new b(new a(), clientContext));
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.impl.om;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

public final class k6
extends BaseRequestConfig.DataSource {
    @NonNull
    public final om a;
    @NonNull
    public final SdkEnvironmentProvider b;

    public k6(@NonNull om om3, @NonNull SdkEnvironmentProvider sdkEnvironmentProvider, @NonNull PlatformIdentifiers platformIdentifiers, Object object) {
        super(new SdkIdentifiers(om3.e(), om3.a(), om3.b()), sdkEnvironmentProvider, platformIdentifiers, object);
        this.a = om3;
        this.b = sdkEnvironmentProvider;
    }
}


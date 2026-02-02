/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.google.android.gms.ads.identifier.AdvertisingIdClient
 *  com.google.android.gms.ads.identifier.AdvertisingIdClient$Info
 *  com.google.android.gms.common.GooglePlayServicesNotAvailableException
 */
package io.appmetrica.analytics.identifiers.impl;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.identifiers.impl.a;
import io.appmetrica.analytics.identifiers.impl.b;
import io.appmetrica.analytics.identifiers.impl.c;
import org.jetbrains.annotations.NotNull;

public final class h
implements b {
    @Override
    @NotNull
    public final c a(@NotNull Context object) {
        try {
            AdvertisingIdClient.Info info = AdvertisingIdClient.getAdvertisingIdInfo((Context)object);
            IdentifierStatus identifierStatus = IdentifierStatus.OK;
            a a14 = new a("google", info.getId(), info.isLimitAdTrackingEnabled());
            object = new c(identifierStatus, a14, null, 4);
        }
        catch (Throwable throwable) {
            object = IdentifierStatus.UNKNOWN;
            StringBuilder stringBuilder = new StringBuilder("exception while fetching google adv_id: ");
            stringBuilder.append(throwable.getMessage());
            object = new c((IdentifierStatus)((Object)object), null, stringBuilder.toString(), 2);
        }
        catch (GooglePlayServicesNotAvailableException googlePlayServicesNotAvailableException) {
            object = new c(IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, null, "could not resolve google services", 2);
        }
        return object;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.coreapi.internal.identifiers;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2={"Lio/appmetrica/analytics/coreapi/internal/identifiers/SimpleAdvertisingIdGetter;", "", "getIdentifiers", "Lio/appmetrica/analytics/coreapi/internal/identifiers/AdvertisingIdsHolder;", "context", "Landroid/content/Context;", "core-api_release"}, k=1, mv={1, 6, 0}, xi=48)
public interface SimpleAdvertisingIdGetter {
    @NotNull
    public AdvertisingIdsHolder getIdentifiers(@NotNull Context var1);
}


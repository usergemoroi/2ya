/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;
import io.appmetrica.analytics.coreutils.internal.permission.AlwaysAllowPermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.permission.SinglePermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.kd;
import io.appmetrica.analytics.impl.xn;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

public final class ld
implements xn {
    public final Context a;
    public final PermissionResolutionStrategy b;
    public final CellularNetworkTypeExtractor c;
    public final CachedDataProvider.CachedData d;

    public ld(@NotNull Context context) {
        this.a = context;
        PermissionResolutionStrategy permissionResolutionStrategy = AndroidUtils.isApiAchieved(29) ? new SinglePermissionStrategy(Na.j().i(), "android.permission.READ_PHONE_STATE") : new AlwaysAllowPermissionStrategy();
        this.b = permissionResolutionStrategy;
        this.c = new CellularNetworkTypeExtractor(context);
        long l10 = TimeUnit.SECONDS.toMillis(20L);
        this.d = new CachedDataProvider.CachedData(l10, l10 * (long)2, "mobile-connection");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NotNull
    public final kd b() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                Object object;
                block3: {
                    try {
                        object = (kd)this.d.getData();
                        if (object == null) break block3;
                        if (!this.d.shouldUpdateData()) return object;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object = this.b.hasNecessaryPermissions(this.a) ? this.c.getNetworkType() : "unknown";
                kd kd3 = new kd((String)object);
                this.d.setData(kd3);
                return kd3;
            }
            throw throwable2;
        }
    }
}


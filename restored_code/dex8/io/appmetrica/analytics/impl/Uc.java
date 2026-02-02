/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.collections.t
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.impl.tc;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.List;
import kotlin.collections.t;
import org.jetbrains.annotations.NotNull;

public final class uc
implements PermissionStrategy,
LocationControllerObserver {
    @NotNull
    public static final tc b = new tc();
    public static final List c = t.p((Object[])new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"});
    public volatile boolean a;

    @Override
    public final boolean forbidUsePermission(@NotNull String string2) {
        if (c.contains(string2)) {
            return this.a ^ true;
        }
        return false;
    }

    @Override
    public final void startLocationTracking() {
        this.a = true;
    }

    @Override
    public final void stopLocationTracking() {
        this.a = false;
    }

    @NotNull
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LocationFlagStrategy(enabled=");
        stringBuilder.append(this.a);
        stringBuilder.append(", locationPermissions=");
        stringBuilder.append(c);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.location.Location
 *  android.location.LocationListener
 *  android.location.LocationManager
 */
package io.appmetrica.analytics.location.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.location.impl.y;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;
import org.jetbrains.annotations.NotNull;

public class u
implements LastKnownLocationExtractor {
    public final Context a;
    public final PermissionResolutionStrategy b;
    public final LocationListener c;
    public final String d;

    public u(@NotNull Context context, @NotNull PermissionResolutionStrategy permissionResolutionStrategy, @NotNull LocationListener locationListener, @NotNull String string2) {
        this.a = context;
        this.b = permissionResolutionStrategy;
        this.c = locationListener;
        this.d = string2;
    }

    public static final Location a(u u11, LocationManager locationManager) {
        return locationManager.getLastKnownLocation(u11.d);
    }

    @NotNull
    public final Context a() {
        return this.a;
    }

    @NotNull
    public final LocationListener b() {
        return this.c;
    }

    @NotNull
    public final PermissionResolutionStrategy c() {
        return this.b;
    }

    @NotNull
    public final String d() {
        return this.d;
    }

    @Override
    @SuppressLint(value={"MissingPermission"})
    public final void updateLastKnownLocation() {
        if (this.b.hasNecessaryPermissions(this.a)) {
            Context context = this.a;
            StringBuilder stringBuilder = new StringBuilder("getting last known location for provider ");
            stringBuilder.append(this.d);
            context = (Location)SystemServiceUtils.accessSystemServiceByNameSafely(context, "location", stringBuilder.toString(), "location manager", new y(this));
            if (context != null) {
                this.c.onLocationChanged((Location)context);
            }
        }
    }
}


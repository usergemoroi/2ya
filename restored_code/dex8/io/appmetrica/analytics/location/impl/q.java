/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.location.LocationListener
 *  android.os.Looper
 */
package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.permission.SinglePermissionStrategy;
import io.appmetrica.analytics.location.impl.r;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

public final class q
implements LastKnownLocationExtractorProvider,
LocationReceiverProvider {
    public final String a;
    public r b;

    public q() {
        this.a = "location-passive-provider";
    }

    @NotNull
    public final r a(@NotNull Context context, @NotNull PermissionExtractor permissionExtractor, @NotNull IHandlerExecutor iHandlerExecutor, @NotNull LocationListener locationListener) {
        return this.c(context, permissionExtractor, iHandlerExecutor, locationListener);
    }

    @NotNull
    public final r b(@NotNull Context context, @NotNull PermissionExtractor permissionExtractor, @NotNull IHandlerExecutor iHandlerExecutor, @NotNull LocationListener locationListener) {
        return this.c(context, permissionExtractor, iHandlerExecutor, locationListener);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final r c(Context object, PermissionExtractor object2, IHandlerExecutor object3, LocationListener locationListener) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        r r14;
                        if (this.b != null) break block3;
                        Looper looper = object3.getLooper();
                        object3 = new SinglePermissionStrategy((PermissionExtractor)object2, "android.permission.ACCESS_FINE_LOCATION");
                        this.b = r14 = new r((Context)object, looper, (PermissionResolutionStrategy)object3, locationListener);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object2 = this.b;
                object = object2;
                if (object2 != null) return object;
                y.B("passiveProviderLocationReceiver");
                return null;
            }
            throw throwable2;
        }
    }

    @Override
    public final LastKnownLocationExtractor getExtractor(Context context, PermissionExtractor permissionExtractor, IHandlerExecutor iHandlerExecutor, LocationListener locationListener) {
        return this.c(context, permissionExtractor, iHandlerExecutor, locationListener);
    }

    @Override
    @NotNull
    public final String getIdentifier() {
        return this.a;
    }

    @Override
    public final LocationReceiver getLocationReceiver(Context context, PermissionExtractor permissionExtractor, IHandlerExecutor iHandlerExecutor, LocationListener locationListener) {
        return this.c(context, permissionExtractor, iHandlerExecutor, locationListener);
    }
}


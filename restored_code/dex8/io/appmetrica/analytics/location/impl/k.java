/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.location.Location
 *  androidx.annotation.AnyThread
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.Location;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.cache.LocationDataCacheUpdateScheduler;
import io.appmetrica.analytics.location.impl.i;
import io.appmetrica.analytics.location.impl.j;
import io.appmetrica.analytics.location.impl.n;
import io.appmetrica.analytics.location.impl.p;
import io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import java.util.HashMap;
import java.util.Iterator;

public final class k
implements ILastKnownUpdater,
LocationControllerObserver {
    public final Context a;
    public final PermissionExtractor b;
    public final p c;
    public final IHandlerExecutor d;
    public final n e;
    public final LocationDataCacheUpdateScheduler f;
    public boolean g;
    public final HashMap h = new HashMap();
    public final HashMap i = new HashMap();
    public Location j;

    public k(@NonNull Context object, @NonNull PermissionExtractor permissionExtractor, @NonNull IHandlerExecutor iHandlerExecutor, @NonNull p p14) {
        this.a = object;
        this.c = p14;
        this.b = permissionExtractor;
        this.d = iHandlerExecutor;
        this.e = new n(p14);
        object = new LocationDataCacheUpdateScheduler(iHandlerExecutor, this, p14.a(), "loc");
        this.f = object;
        p14.a().setUpdateScheduler((CacheUpdateScheduler)object);
    }

    @Nullable
    public final Location a() {
        synchronized (this) {
            Location location = (Location)this.c.b.getData();
            return location;
        }
    }

    public final void a(@Nullable Location location) {
        synchronized (this) {
            if (location != null) {
                this.j = location;
            }
            return;
        }
    }

    @AnyThread
    public final void a(@NonNull i i14) {
        this.d.execute(new j(this, i14));
    }

    @AnyThread
    public final void a(@NonNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        LastKnownLocationExtractor lastKnownLocationExtractor = lastKnownLocationExtractorProvider.getExtractor(this.a, this.b, this.d, this.e);
                        this.h.put(lastKnownLocationExtractorProvider.getIdentifier(), lastKnownLocationExtractor);
                        if (!this.g) break block3;
                        lastKnownLocationExtractor.updateLastKnownLocation();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @AnyThread
    public final void a(@NonNull LocationReceiverProvider object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block3: {
                    LocationReceiver locationReceiver;
                    block4: {
                        try {
                            locationReceiver = object.getLocationReceiver(this.a, this.b, this.d, this.e);
                            object = this.i.put(object.getIdentifier(), locationReceiver);
                            if (!this.g) break block3;
                            if (object == null) break block4;
                            object.stopLocationUpdates();
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    locationReceiver.startLocationUpdates();
                }
                return;
            }
            throw throwable2;
        }
    }

    @Nullable
    public final Location b() {
        synchronized (this) {
            Location location = this.j;
            return location;
        }
    }

    @AnyThread
    public final void b(@NonNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        synchronized (this) {
            this.h.remove(lastKnownLocationExtractorProvider.getIdentifier());
            return;
        }
    }

    @AnyThread
    public final void b(@NonNull LocationReceiverProvider object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        object = (LocationReceiver)this.i.remove(object.getIdentifier());
                        if (object == null) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    if (!this.g) break block4;
                    object.stopLocationUpdates();
                }
                return;
            }
            throw throwable2;
        }
    }

    @Nullable
    public final Location c() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                Location location;
                block4: {
                    try {
                        Location location2;
                        location = location2 = this.j;
                        if (location2 != null) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    location = this.a();
                }
                return location;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d() {
        synchronized (this) {
            try {
                this.f.startUpdates();
                Iterator iterator = this.i.values().iterator();
                while (true) {
                    if (!iterator.hasNext()) {
                        this.updateLastKnown();
                        return;
                    }
                    ((LocationReceiver)iterator.next()).startLocationUpdates();
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final void e() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    this.f.stopUpdates();
                    Iterator iterator = this.i.values().iterator();
                    while (iterator.hasNext()) {
                        ((LocationReceiver)iterator.next()).stopLocationUpdates();
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                return;
            }
            throw throwable2;
        }
    }

    @Override
    public final void startLocationTracking() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (this.g) break block3;
                        this.g = true;
                        this.d();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    @Override
    public final void stopLocationTracking() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (!this.g) break block3;
                        this.g = false;
                        this.e();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    @Override
    public final void updateLastKnown() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    Iterator iterator = this.h.values().iterator();
                    while (iterator.hasNext()) {
                        ((LastKnownLocationExtractor)iterator.next()).updateLastKnownLocation();
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                return;
            }
            throw throwable2;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 */
package io.appmetrica.analytics.location.impl;

import android.location.Location;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import java.util.concurrent.CopyOnWriteArrayList;

public final class t {
    public LocationFilter a;
    public final TimePassedChecker b;
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public Location d;
    public long e;

    public t(LocationFilter locationFilter) {
        this.a = locationFilter;
        this.b = new TimePassedChecker();
    }
}


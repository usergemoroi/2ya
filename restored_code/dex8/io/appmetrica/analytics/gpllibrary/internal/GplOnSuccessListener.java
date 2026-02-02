/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 *  android.location.LocationListener
 *  com.google.android.gms.tasks.OnSuccessListener
 */
package io.appmetrica.analytics.gpllibrary.internal;

import android.location.Location;
import android.location.LocationListener;
import com.google.android.gms.tasks.OnSuccessListener;

class GplOnSuccessListener
implements OnSuccessListener<Location> {
    private final LocationListener a;

    GplOnSuccessListener(LocationListener locationListener) {
        this.a = locationListener;
    }

    public void onSuccess(Location location) {
        this.a.onLocationChanged(location);
    }
}


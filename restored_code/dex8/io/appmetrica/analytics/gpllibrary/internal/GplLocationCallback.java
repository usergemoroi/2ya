/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.LocationListener
 *  com.google.android.gms.location.LocationCallback
 *  com.google.android.gms.location.LocationResult
 */
package io.appmetrica.analytics.gpllibrary.internal;

import android.location.LocationListener;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;

class GplLocationCallback
extends LocationCallback {
    private final LocationListener a;

    GplLocationCallback(LocationListener locationListener) {
        this.a = locationListener;
    }

    public void onLocationResult(LocationResult locationResult) {
        this.a.onLocationChanged(locationResult.getLastLocation());
    }
}


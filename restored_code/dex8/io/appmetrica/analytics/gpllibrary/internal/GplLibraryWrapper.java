/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.location.LocationListener
 *  android.os.Looper
 *  androidx.annotation.NonNull
 *  com.google.android.gms.location.FusedLocationProviderClient
 *  com.google.android.gms.location.LocationCallback
 *  com.google.android.gms.location.LocationRequest
 *  com.google.android.gms.location.LocationServices
 *  com.google.android.gms.tasks.OnSuccessListener
 */
package io.appmetrica.analytics.gpllibrary.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnSuccessListener;
import io.appmetrica.analytics.gpllibrary.internal.GplLocationCallback;
import io.appmetrica.analytics.gpllibrary.internal.GplOnSuccessListener;
import io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper;
import java.util.concurrent.Executor;

public class GplLibraryWrapper
implements IGplLibraryWrapper {
    public static final String FUSED_PROVIDER = "fused";
    private final FusedLocationProviderClient a;
    private final LocationListener b;
    private final LocationCallback c;
    private final Looper d;
    private final Executor e;
    private final long f;

    public GplLibraryWrapper(@NonNull Context context, @NonNull LocationListener locationListener, @NonNull Looper looper, @NonNull Executor executor, long l10) throws Throwable {
        this(new ClientProvider(context), locationListener, looper, executor, l10);
    }

    GplLibraryWrapper(ClientProvider clientProvider, LocationListener locationListener, Looper looper, Executor executor, long l10) {
        this.a = clientProvider.a();
        this.b = locationListener;
        this.d = looper;
        this.e = executor;
        this.f = l10;
        this.c = new GplLocationCallback(locationListener);
    }

    @Override
    @SuppressLint(value={"MissingPermission"})
    public void startLocationUpdates(@NonNull Priority priority) throws Throwable {
        FusedLocationProviderClient fusedLocationProviderClient = this.a;
        LocationRequest locationRequest = LocationRequest.create().setInterval(this.f);
        int n10 = 1.a[priority.ordinal()];
        n10 = n10 != 1 ? (n10 != 2 ? (n10 != 3 ? 105 : 100) : 102) : 104;
        fusedLocationProviderClient.requestLocationUpdates(locationRequest.setPriority(n10), this.c, this.d);
    }

    @Override
    public void stopLocationUpdates() throws Throwable {
        this.a.removeLocationUpdates(this.c);
    }

    @Override
    @SuppressLint(value={"MissingPermission"})
    public void updateLastKnownLocation() throws Throwable {
        this.a.getLastLocation().addOnSuccessListener(this.e, (OnSuccessListener)new GplOnSuccessListener(this.b));
    }

    public static class ClientProvider {
        private final Context a;

        ClientProvider(Context context) {
            this.a = context;
        }

        final FusedLocationProviderClient a() {
            return LocationServices.getFusedLocationProviderClient((Context)this.a);
        }
    }

    public static final class Priority
    extends Enum<Priority> {
        public static final /* enum */ Priority PRIORITY_BALANCED_POWER_ACCURACY;
        public static final /* enum */ Priority PRIORITY_HIGH_ACCURACY;
        public static final /* enum */ Priority PRIORITY_LOW_POWER;
        public static final /* enum */ Priority PRIORITY_NO_POWER;
        private static final Priority[] a;

        static {
            Priority priority;
            Priority priority2;
            Priority priority3;
            Priority priority4;
            PRIORITY_NO_POWER = priority4 = new Priority();
            PRIORITY_LOW_POWER = priority3 = new Priority();
            PRIORITY_BALANCED_POWER_ACCURACY = priority2 = new Priority();
            PRIORITY_HIGH_ACCURACY = priority = new Priority();
            a = new Priority[]{priority4, priority3, priority2, priority};
        }

        public static Priority valueOf(String string2) {
            return Enum.valueOf(Priority.class, string2);
        }

        public static Priority[] values() {
            return (Priority[])a.clone();
        }
    }
}


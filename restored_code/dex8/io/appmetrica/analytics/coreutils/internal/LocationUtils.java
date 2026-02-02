/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 *  android.os.Parcel
 */
package io.appmetrica.analytics.coreutils.internal;

import android.location.Location;
import android.os.Parcel;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007\u00a8\u0006\b"}, d2={"Lio/appmetrica/analytics/coreutils/internal/LocationUtils;", "", "Landroid/location/Location;", "location", "", "locationToBytes", "locationBytes", "bytesToLocation", "core-utils_release"}, k=1, mv={1, 6, 0})
public final class LocationUtils {
    @NotNull
    public static final LocationUtils INSTANCE = new LocationUtils();

    private LocationUtils() {
    }

    @JvmStatic
    @Nullable
    public static final Location bytesToLocation(@Nullable byte[] object) {
        if (object != null) {
            Parcel parcel = Parcel.obtain();
            try {
                parcel.unmarshall(object, 0, ((byte[])object).length);
                parcel.setDataPosition(0);
                object = (Location)parcel.readValue(Location.class.getClassLoader());
                return object;
            }
            finally {
                parcel.recycle();
            }
        }
        object = null;
        return object;
    }

    @JvmStatic
    @Nullable
    public static final byte[] locationToBytes(@Nullable Location object) {
        if (object != null) {
            Parcel parcel = Parcel.obtain();
            try {
                parcel.writeValue(object);
                object = parcel.marshall();
                return object;
            }
            finally {
                parcel.recycle();
            }
        }
        object = null;
        return object;
    }
}


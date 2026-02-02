/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package io.appmetrica.analytics.internal;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.impl.a7;
import io.appmetrica.analytics.internal.CounterConfiguration;

public final class b
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new CounterConfiguration((ContentValues)parcel.readBundle(a7.class.getClassLoader()).getParcelable("io.appmetrica.analytics.internal.CounterConfiguration.data"), 0);
    }

    public final Object[] newArray(int n10) {
        return new CounterConfiguration[n10];
    }
}


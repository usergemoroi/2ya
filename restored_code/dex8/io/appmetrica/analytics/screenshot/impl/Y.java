/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  kotlin.collections.t
 */
package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.screenshot.impl.z;
import java.util.List;
import kotlin.collections.t;

public final class y
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        boolean bl2 = parcel.readByte() != 0;
        List list = parcel.createStringArrayList();
        if (list == null) {
            list = t.m();
        }
        return new z(bl2, list, parcel.readLong());
    }

    public final Object[] newArray(int n10) {
        return new z[n10];
    }
}


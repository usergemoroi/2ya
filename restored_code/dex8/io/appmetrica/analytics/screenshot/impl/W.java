/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.screenshot.impl.x;

public final class w
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        boolean bl2 = parcel.readByte() != 0;
        return new x(bl2);
    }

    public final Object[] newArray(int n10) {
        return new x[n10];
    }
}


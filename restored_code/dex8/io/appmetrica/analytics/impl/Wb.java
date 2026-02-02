/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package io.appmetrica.analytics.impl;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.impl.xb;

public final class wb
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new xb(parcel);
    }

    public final Object[] newArray(int n10) {
        return new xb[n10];
    }
}


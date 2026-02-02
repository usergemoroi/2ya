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
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;

public final class yb
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new IdentifiersResult(parcel.readString(), IdentifierStatus.from(parcel.readString()), parcel.readString());
    }

    public final Object[] newArray(int n10) {
        return new IdentifiersResult[n10];
    }
}


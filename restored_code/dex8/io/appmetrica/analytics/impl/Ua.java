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
import io.appmetrica.analytics.impl.va;

public final class ua
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        Object object = parcel.readValue(Boolean.TYPE.getClassLoader());
        object = object instanceof Boolean ? (Boolean)object : null;
        return new va((Boolean)object, IdentifierStatus.Companion.from(parcel.readString()), parcel.readString());
    }

    public final Object[] newArray(int n10) {
        return new va[n10];
    }
}


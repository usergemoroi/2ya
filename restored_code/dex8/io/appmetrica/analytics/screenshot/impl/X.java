/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 */
package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.screenshot.impl.e0;
import io.appmetrica.analytics.screenshot.impl.w;
import org.jetbrains.annotations.NotNull;

public final class x
implements Parcelable {
    @NotNull
    public static final w CREATOR = new w();
    public final boolean a;

    public x(e0 e03) {
        this(e03.a());
    }

    public x(boolean bl2) {
        this.a = bl2;
    }

    public final boolean a() {
        return this.a;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ParcelableApiCaptorConfig(enabled=");
        stringBuilder.append(this.a);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n10) {
        parcel.writeByte((byte)(this.a ? 1 : 0));
    }
}


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
import io.appmetrica.analytics.screenshot.impl.f0;
import io.appmetrica.analytics.screenshot.impl.y;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public final class z
implements Parcelable {
    @NotNull
    public static final y CREATOR = new y();
    public final boolean a;
    public final List b;
    public final long c;

    public z(f0 f04) {
        this(f04.b(), f04.c(), f04.a());
    }

    public z(boolean bl2, List list, long l10) {
        this.a = bl2;
        this.b = list;
        this.c = l10;
    }

    public final long a() {
        return this.c;
    }

    public final boolean b() {
        return this.a;
    }

    public final List c() {
        return this.b;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ParcelableContentObserverCaptorConfig(enabled=");
        stringBuilder.append(this.a);
        stringBuilder.append(", mediaStoreColumnNames=");
        stringBuilder.append(this.b);
        stringBuilder.append(", detectWindowSeconds=");
        stringBuilder.append(this.c);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n10) {
        parcel.writeByte((byte)(this.a ? 1 : 0));
        parcel.writeStringList(this.b);
        parcel.writeLong(this.c);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.y01$a
 */
package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ei0;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.y01;
import java.util.Arrays;

public final class y01
extends ei0 {
    public static final Parcelable.Creator<y01> CREATOR = new a();
    public final int c;
    public final int d;
    public final int e;
    public final int[] f;
    public final int[] g;

    public y01(int n10, int n13, int n14, int[] nArray, int[] nArray2) {
        super("MLLT");
        this.c = n10;
        this.d = n13;
        this.e = n14;
        this.f = nArray;
        this.g = nArray2;
    }

    y01(Parcel parcel) {
        super("MLLT");
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = (int[])m92.a((Object)parcel.createIntArray());
        this.g = (int[])m92.a((Object)parcel.createIntArray());
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object != null && y01.class == object.getClass()) {
            object = (y01)object;
            if (this.c != ((y01)object).c || this.d != ((y01)object).d || this.e != ((y01)object).e || !Arrays.equals(this.f, ((y01)object).f) || !Arrays.equals(this.g, ((y01)object).g)) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n10 = this.c;
        int n13 = this.d;
        int n14 = this.e;
        int n15 = Arrays.hashCode(this.f);
        return Arrays.hashCode(this.g) + (n15 + (((n10 + 527) * 31 + n13) * 31 + n14) * 31) * 31;
    }

    public final void writeToParcel(Parcel parcel, int n10) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeIntArray(this.f);
        parcel.writeIntArray(this.g);
    }
}


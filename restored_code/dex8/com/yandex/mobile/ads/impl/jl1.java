/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.jl1$a
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.nw2
 */
package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.jl1;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.nw2;
import com.yandex.mobile.ads.impl.t12;

public final class jl1
extends t12 {
    public static final Parcelable.Creator<jl1> CREATOR = new a();
    public final long b;
    public final long c;
    public final byte[] d;

    private jl1(long l10, byte[] byArray, long l11) {
        this.b = l11;
        this.c = l10;
        this.d = byArray;
    }

    private jl1(Parcel parcel) {
        this.b = parcel.readLong();
        this.c = parcel.readLong();
        this.d = (byte[])m92.a((Object)parcel.createByteArray());
    }

    /* synthetic */ jl1(Parcel parcel, nw2 nw22) {
        this(parcel);
    }

    static jl1 a(bg1 bg12, int n10, long l10) {
        long l11 = bg12.v();
        byte[] byArray = new byte[n10 -= 4];
        bg12.a(byArray, 0, n10);
        return new jl1(l11, byArray, l10);
    }

    public final void writeToParcel(Parcel parcel, int n10) {
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeByteArray(this.d);
    }
}


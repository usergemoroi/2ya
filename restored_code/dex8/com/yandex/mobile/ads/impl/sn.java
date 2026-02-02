/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.sn$a
 */
package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ei0;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.sn;
import java.util.Arrays;

public final class sn
extends ei0 {
    public static final Parcelable.Creator<sn> CREATOR = new a();
    public final String c;
    public final int d;
    public final int e;
    public final long f;
    public final long g;
    private final ei0[] h;

    sn(Parcel parcel) {
        super("CHAP");
        this.c = (String)m92.a((Object)parcel.readString());
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readLong();
        this.g = parcel.readLong();
        int n10 = parcel.readInt();
        this.h = new ei0[n10];
        for (int i14 = 0; i14 < n10; ++i14) {
            this.h[i14] = (ei0)parcel.readParcelable(ei0.class.getClassLoader());
        }
    }

    public sn(String string2, int n10, int n13, long l10, long l11, ei0[] ei0Array) {
        super("CHAP");
        this.c = string2;
        this.d = n10;
        this.e = n13;
        this.f = l10;
        this.g = l11;
        this.h = ei0Array;
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
        if (object != null && sn.class == object.getClass()) {
            object = (sn)object;
            if (this.d != ((sn)object).d || this.e != ((sn)object).e || this.f != ((sn)object).f || this.g != ((sn)object).g || !m92.a((Object)this.c, (Object)((sn)object).c) || !Arrays.equals(this.h, ((sn)object).h)) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n10 = this.d;
        int n13 = this.e;
        int n14 = (int)this.f;
        int n15 = (int)this.g;
        String string2 = this.c;
        int n16 = string2 != null ? string2.hashCode() : 0;
        return ((((n10 + 527) * 31 + n13) * 31 + n14) * 31 + n15) * 31 + n16;
    }

    public final void writeToParcel(Parcel parcel, int n10) {
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeLong(this.f);
        parcel.writeLong(this.g);
        parcel.writeInt(this.h.length);
        ei0[] ei0Array = this.h;
        int n13 = ei0Array.length;
        for (n10 = 0; n10 < n13; ++n10) {
            parcel.writeParcelable((Parcelable)ei0Array[n10], 0);
        }
    }
}


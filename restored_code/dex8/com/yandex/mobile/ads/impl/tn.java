/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.tn$a
 */
package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ei0;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.tn;
import java.util.Arrays;

public final class tn
extends ei0 {
    public static final Parcelable.Creator<tn> CREATOR = new a();
    public final String c;
    public final boolean d;
    public final boolean e;
    public final String[] f;
    private final ei0[] g;

    tn(Parcel parcel) {
        super("CTOC");
        this.c = (String)m92.a((Object)parcel.readString());
        int n10 = parcel.readByte();
        boolean bl2 = true;
        boolean bl3 = n10 != 0;
        this.d = bl3;
        bl3 = parcel.readByte() != 0 ? bl2 : false;
        this.e = bl3;
        this.f = (String[])m92.a((Object)parcel.createStringArray());
        n10 = parcel.readInt();
        this.g = new ei0[n10];
        for (int i14 = 0; i14 < n10; ++i14) {
            this.g[i14] = (ei0)parcel.readParcelable(ei0.class.getClassLoader());
        }
    }

    public tn(String string2, boolean bl2, boolean bl3, String[] stringArray, ei0[] ei0Array) {
        super("CTOC");
        this.c = string2;
        this.d = bl2;
        this.e = bl3;
        this.f = stringArray;
        this.g = ei0Array;
    }

    public final boolean equals(@Nullable Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object != null && tn.class == object.getClass()) {
            object = (tn)object;
            if (!(this.d == ((tn)object).d && this.e == ((tn)object).e && m92.a((Object)this.c, (Object)((tn)object).c) && Arrays.equals(this.f, ((tn)object).f) && Arrays.equals(this.g, ((tn)object).g))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n10 = this.d;
        int n13 = this.e;
        String string2 = this.c;
        int n14 = string2 != null ? string2.hashCode() : 0;
        return ((n10 + 527) * 31 + n13) * 31 + n14;
    }

    public final void writeToParcel(Parcel parcel, int n10) {
        parcel.writeString(this.c);
        parcel.writeByte((byte)(this.d ? 1 : 0));
        parcel.writeByte((byte)(this.e ? 1 : 0));
        parcel.writeStringArray(this.f);
        parcel.writeInt(this.g.length);
        ei0[] ei0Array = this.g;
        int n13 = ei0Array.length;
        for (n10 = 0; n10 < n13; ++n10) {
            parcel.writeParcelable((Parcelable)ei0Array[n10], 0);
        }
    }
}


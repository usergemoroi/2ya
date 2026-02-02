/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.x12$a
 *  com.yandex.mobile.ads.impl.x12$b
 *  com.yandex.mobile.ads.impl.x12$c
 *  com.yandex.mobile.ads.impl.y93
 */
package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.t12;
import com.yandex.mobile.ads.impl.x12;
import com.yandex.mobile.ads.impl.y93;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Exception performing whole class analysis ignored.
 */
public final class x12
extends t12 {
    public static final Parcelable.Creator<x12> CREATOR = new a();
    public final List<c> b;

    private x12(Parcel parcel) {
        int n10 = parcel.readInt();
        ArrayList<c> arrayList = new ArrayList<c>(n10);
        for (int i14 = 0; i14 < n10; ++i14) {
            arrayList.add(c.b((Parcel)parcel));
        }
        this.b = Collections.unmodifiableList(arrayList);
    }

    /* synthetic */ x12(Parcel parcel, y93 y932) {
        this(parcel);
    }

    private x12(ArrayList arrayList) {
        this.b = Collections.unmodifiableList(arrayList);
    }

    static x12 a(bg1 bg12) {
        int n10 = bg12.t();
        ArrayList<c> arrayList = new ArrayList<c>(n10);
        for (int i14 = 0; i14 < n10; ++i14) {
            boolean bl2;
            long l10;
            int n13;
            int n14;
            long l11;
            boolean bl3;
            boolean bl4;
            int n15;
            long l13 = bg12.v();
            boolean bl5 = (bg12.t() & 0x80) != 0;
            ArrayList<b> arrayList2 = new ArrayList<b>();
            if (!bl5) {
                n15 = bg12.t();
                bl4 = (n15 & 0x80) != 0;
                bl3 = (n15 & 0x40) != 0;
                n15 = (n15 & 0x20) != 0 ? 1 : 0;
                l11 = bl3 ? bg12.v() : -9223372036854775807L;
                if (!bl3) {
                    n14 = bg12.t();
                    arrayList2 = new ArrayList(n14);
                    for (n13 = 0; n13 < n14; ++n13) {
                        arrayList2.add(new /* Unavailable Anonymous Inner Class!! */);
                    }
                }
                if (n15 != 0) {
                    l10 = bg12.t();
                    bl2 = (l10 & 0x80L) != 0L;
                    l10 = ((l10 & 1L) << 32 | bg12.v()) * 1000L / 90L;
                } else {
                    bl2 = false;
                    l10 = -9223372036854775807L;
                }
                n13 = bg12.z();
                n15 = bg12.t();
                n14 = bg12.t();
            } else {
                bl3 = false;
                bl4 = false;
                l11 = -9223372036854775807L;
                bl2 = false;
                l10 = -9223372036854775807L;
                n13 = 0;
                n15 = 0;
                n14 = 0;
            }
            arrayList.add(new /* Unavailable Anonymous Inner Class!! */);
        }
        return new x12(arrayList);
    }

    public final void writeToParcel(Parcel parcel, int n10) {
        int n13 = this.b.size();
        parcel.writeInt(n13);
        for (n10 = 0; n10 < n13; ++n10) {
            c c11 = this.b.get(n10);
            parcel.writeLong(c11.a);
            parcel.writeByte((byte)(c11.b ? 1 : 0));
            parcel.writeByte((byte)(c11.c ? 1 : 0));
            parcel.writeByte((byte)(c11.d ? 1 : 0));
            int n14 = c11.f.size();
            parcel.writeInt(n14);
            for (int i14 = 0; i14 < n14; ++i14) {
                b b11 = c11.f.get(i14);
                parcel.writeInt(b11.a);
                parcel.writeLong(b11.b);
            }
            parcel.writeLong(c11.e);
            parcel.writeByte((byte)(c11.g ? 1 : 0));
            parcel.writeLong(c11.h);
            parcel.writeInt(c11.i);
            parcel.writeInt(c11.j);
            parcel.writeInt(c11.k);
        }
    }
}


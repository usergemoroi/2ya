/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.q53
 *  com.yandex.mobile.ads.impl.s52
 *  com.yandex.mobile.ads.impl.v12$a
 *  com.yandex.mobile.ads.impl.v12$b
 */
package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.i52;
import com.yandex.mobile.ads.impl.q53;
import com.yandex.mobile.ads.impl.s52;
import com.yandex.mobile.ads.impl.t12;
import com.yandex.mobile.ads.impl.v12;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Exception performing whole class analysis ignored.
 */
public final class v12
extends t12 {
    public static final Parcelable.Creator<v12> CREATOR = new a();
    public final long b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;
    public final List<b> i;
    public final boolean j;
    public final long k;
    public final int l;
    public final int m;
    public final int n;

    private v12(long l10, boolean bl2, boolean bl3, boolean bl4, boolean bl5, long l11, long l13, List<b> list, boolean bl6, long l14, int n10, int n13, int n14) {
        this.b = l10;
        this.c = bl2;
        this.d = bl3;
        this.e = bl4;
        this.f = bl5;
        this.g = l11;
        this.h = l13;
        this.i = Collections.unmodifiableList(list);
        this.j = bl6;
        this.k = l14;
        this.l = n10;
        this.m = n13;
        this.n = n14;
    }

    private v12(Parcel parcel) {
        this.b = parcel.readLong();
        int n10 = parcel.readByte();
        boolean bl2 = false;
        boolean bl3 = n10 == 1;
        this.c = bl3;
        bl3 = parcel.readByte() == 1;
        this.d = bl3;
        bl3 = parcel.readByte() == 1;
        this.e = bl3;
        bl3 = parcel.readByte() == 1;
        this.f = bl3;
        this.g = parcel.readLong();
        this.h = parcel.readLong();
        int n13 = parcel.readInt();
        ArrayList<b> arrayList = new ArrayList<b>(n13);
        for (n10 = 0; n10 < n13; ++n10) {
            arrayList.add(com.yandex.mobile.ads.impl.v12$b.a((Parcel)parcel));
        }
        this.i = Collections.unmodifiableList(arrayList);
        bl3 = bl2;
        if (parcel.readByte() == 1) {
            bl3 = true;
        }
        this.j = bl3;
        this.k = parcel.readLong();
        this.l = parcel.readInt();
        this.m = parcel.readInt();
        this.n = parcel.readInt();
    }

    /* synthetic */ v12(Parcel parcel, q53 q532) {
        this(parcel);
    }

    static v12 a(bg1 bg12, long l10, s52 s522) {
        boolean bl2;
        int n10;
        long l11;
        boolean bl3;
        int n13;
        boolean bl4;
        boolean bl5;
        int n14;
        long l13 = bg12.v();
        boolean bl6 = (bg12.t() & 0x80) != 0;
        List<b> list = Collections.emptyList();
        if (!bl6) {
            n14 = bg12.t();
            bl5 = (n14 & 0x80) != 0;
            bl4 = (n14 & 0x40) != 0;
            n13 = (n14 & 0x20) != 0 ? 1 : 0;
            bl3 = (n14 & 0x10) != 0;
            l11 = bl4 && !bl3 ? i52.a(l10, bg12) : -9223372036854775807L;
            if (!bl4) {
                n10 = bg12.t();
                list = new ArrayList<b>(n10);
                for (n14 = 0; n14 < n10; ++n14) {
                    int n15 = bg12.t();
                    long l14 = !bl3 ? i52.a(l10, bg12) : -9223372036854775807L;
                    ((ArrayList)list).add(new /* Unavailable Anonymous Inner Class!! */);
                }
            }
            if (n13 != 0) {
                l10 = bg12.t();
                bl2 = (0x80L & l10) != 0L;
                l10 = ((l10 & 1L) << 32 | bg12.v()) * 1000L / 90L;
            } else {
                bl2 = false;
                l10 = -9223372036854775807L;
            }
            n13 = bg12.z();
            n10 = bg12.t();
            n14 = bg12.t();
        } else {
            n13 = 0;
            bl5 = false;
            bl3 = false;
            l11 = -9223372036854775807L;
            bl2 = false;
            l10 = -9223372036854775807L;
            bl4 = false;
            n10 = 0;
            n14 = 0;
        }
        return new v12(l13, bl6, bl5, bl4, bl3, l11, s522.b(l11), list, bl2, l10, n13, n10, n14);
    }

    public final void writeToParcel(Parcel parcel, int n10) {
        parcel.writeLong(this.b);
        parcel.writeByte((byte)(this.c ? 1 : 0));
        parcel.writeByte((byte)(this.d ? 1 : 0));
        parcel.writeByte((byte)(this.e ? 1 : 0));
        parcel.writeByte((byte)(this.f ? 1 : 0));
        parcel.writeLong(this.g);
        parcel.writeLong(this.h);
        int n13 = this.i.size();
        parcel.writeInt(n13);
        for (n10 = 0; n10 < n13; ++n10) {
            b b10 = this.i.get(n10);
            parcel.writeInt(b10.a);
            parcel.writeLong(b10.b);
            parcel.writeLong(b10.c);
        }
        parcel.writeByte((byte)(this.j ? 1 : 0));
        parcel.writeLong(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
    }
}


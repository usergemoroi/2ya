/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.i52$a
 *  com.yandex.mobile.ads.impl.nv2
 *  com.yandex.mobile.ads.impl.s52
 */
package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.i52;
import com.yandex.mobile.ads.impl.nv2;
import com.yandex.mobile.ads.impl.s52;
import com.yandex.mobile.ads.impl.t12;

public final class i52
extends t12 {
    public static final Parcelable.Creator<i52> CREATOR = new a();
    public final long b;
    public final long c;

    private i52(long l10, long l11) {
        this.b = l10;
        this.c = l11;
    }

    /* synthetic */ i52(long l10, long l11, nv2 nv22) {
        this(l10, l11);
    }

    static long a(long l10, bg1 bg12) {
        long l11 = bg12.t();
        l10 = (0x80L & l11) != 0L ? 0x1FFFFFFFFL & ((l11 & 1L) << 32 | bg12.v()) + l10 : -9223372036854775807L;
        return l10;
    }

    static i52 a(bg1 bg12, long l10, s52 s522) {
        l10 = i52.a(l10, bg12);
        return new i52(l10, s522.b(l10));
    }

    public final void writeToParcel(Parcel parcel, int n10) {
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
    }
}


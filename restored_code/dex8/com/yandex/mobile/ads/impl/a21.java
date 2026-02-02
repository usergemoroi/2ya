/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.a21$a
 *  com.yandex.mobile.ads.impl.hw0$a
 *  com.yandex.mobile.ads.impl.jx2
 *  com.yandex.mobile.ads.impl.k01$b
 *  com.yandex.mobile.ads.impl.yp2
 */
package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.a21;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.hw0;
import com.yandex.mobile.ads.impl.jx2;
import com.yandex.mobile.ads.impl.k01;
import com.yandex.mobile.ads.impl.yp2;

public final class a21
implements k01.b {
    public static final Parcelable.Creator<a21> CREATOR = new a();
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public a21(long l10, long l11, long l13, long l14, long l15) {
        this.b = l10;
        this.c = l11;
        this.d = l13;
        this.e = l14;
        this.f = l15;
    }

    private a21(Parcel parcel) {
        this.b = parcel.readLong();
        this.c = parcel.readLong();
        this.d = parcel.readLong();
        this.e = parcel.readLong();
        this.f = parcel.readLong();
    }

    /* synthetic */ a21(Parcel parcel, yp2 yp22) {
        this(parcel);
    }

    public /* synthetic */ cc0 a() {
        return jx2.a((k01.b)this);
    }

    public /* synthetic */ void a(hw0.a a12) {
        jx2.b((k01.b)this, (hw0.a)a12);
    }

    public /* synthetic */ byte[] b() {
        return jx2.c((k01.b)this);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object != null && a21.class == object.getClass()) {
            object = (a21)object;
            if (this.b != ((a21)object).b || this.c != ((a21)object).c || this.d != ((a21)object).d || this.e != ((a21)object).e || this.f != ((a21)object).f) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        long l10 = this.b;
        int n10 = (int)(l10 ^ l10 >>> 32);
        l10 = this.c;
        int n12 = (int)(l10 ^ l10 >>> 32);
        l10 = this.d;
        int n13 = (int)(l10 ^ l10 >>> 32);
        l10 = this.e;
        int n14 = (int)(l10 ^ l10 >>> 32);
        l10 = this.f;
        return ((((n10 + 527) * 31 + n12) * 31 + n13) * 31 + n14) * 31 + (int)(l10 >>> 32 ^ l10);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Motion photo metadata: photoStartPosition=");
        stringBuilder.append(this.b);
        stringBuilder.append(", photoSize=");
        stringBuilder.append(this.c);
        stringBuilder.append(", photoPresentationTimestampUs=");
        stringBuilder.append(this.d);
        stringBuilder.append(", videoStartPosition=");
        stringBuilder.append(this.e);
        stringBuilder.append(", videoSize=");
        stringBuilder.append(this.f);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n10) {
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
        parcel.writeLong(this.f);
    }
}


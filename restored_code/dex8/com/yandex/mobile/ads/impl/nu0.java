/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.e3
 *  com.yandex.mobile.ads.impl.hw0$a
 *  com.yandex.mobile.ads.impl.jx2
 *  com.yandex.mobile.ads.impl.k01$b
 *  com.yandex.mobile.ads.impl.k13
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.nu0$a
 */
package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.e3;
import com.yandex.mobile.ads.impl.hw0;
import com.yandex.mobile.ads.impl.jx2;
import com.yandex.mobile.ads.impl.k01;
import com.yandex.mobile.ads.impl.k13;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.nu0;
import java.util.Arrays;

public final class nu0
implements k01.b {
    public static final Parcelable.Creator<nu0> CREATOR = new a();
    public final String b;
    public final byte[] c;
    public final int d;
    public final int e;

    public nu0(int n10, int n13, String string2, byte[] byArray) {
        this.b = string2;
        this.c = byArray;
        this.d = n10;
        this.e = n13;
    }

    private nu0(Parcel parcel) {
        this.b = (String)m92.a((Object)parcel.readString());
        this.c = (byte[])m92.a((Object)parcel.createByteArray());
        this.d = parcel.readInt();
        this.e = parcel.readInt();
    }

    /* synthetic */ nu0(Parcel parcel, k13 k132) {
        this(parcel);
    }

    public /* synthetic */ cc0 a() {
        return jx2.a((k01.b)this);
    }

    public /* synthetic */ void a(hw0.a a14) {
        jx2.b((k01.b)this, a14);
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
        if (object != null && nu0.class == object.getClass()) {
            object = (nu0)object;
            if (!this.b.equals(((nu0)object).b) || !Arrays.equals(this.c, ((nu0)object).c) || this.d != ((nu0)object).d || this.e != ((nu0)object).e) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n10 = e3.a((String)this.b, (int)527, (int)31);
        return ((Arrays.hashCode(this.c) + n10) * 31 + this.d) * 31 + this.e;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("mdta: key=");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n10) {
        parcel.writeString(this.b);
        parcel.writeByteArray(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
    }
}


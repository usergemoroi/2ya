/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.e3
 *  com.yandex.mobile.ads.impl.hw0$a
 *  com.yandex.mobile.ads.impl.jh1$a
 *  com.yandex.mobile.ads.impl.jx2
 *  com.yandex.mobile.ads.impl.k01$b
 *  com.yandex.mobile.ads.impl.m92
 */
package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.e3;
import com.yandex.mobile.ads.impl.hw0;
import com.yandex.mobile.ads.impl.jh1;
import com.yandex.mobile.ads.impl.jx2;
import com.yandex.mobile.ads.impl.k01;
import com.yandex.mobile.ads.impl.m92;
import java.util.Arrays;

public final class jh1
implements k01.b {
    public static final Parcelable.Creator<jh1> CREATOR = new a();
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final byte[] i;

    public jh1(int n10, String string2, String string3, int n13, int n14, int n15, int n16, byte[] byArray) {
        this.b = n10;
        this.c = string2;
        this.d = string3;
        this.e = n13;
        this.f = n14;
        this.g = n15;
        this.h = n16;
        this.i = byArray;
    }

    jh1(Parcel parcel) {
        this.b = parcel.readInt();
        this.c = (String)m92.a((Object)parcel.readString());
        this.d = (String)m92.a((Object)parcel.readString());
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = (byte[])m92.a((Object)parcel.createByteArray());
    }

    public /* synthetic */ cc0 a() {
        return jx2.a((k01.b)this);
    }

    public final void a(hw0.a a13) {
        byte[] byArray = this.i;
        a13.a(this.b, byArray);
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
        if (object != null && jh1.class == object.getClass()) {
            object = (jh1)object;
            if (!(this.b == ((jh1)object).b && this.c.equals(((jh1)object).c) && this.d.equals(((jh1)object).d) && this.e == ((jh1)object).e && this.f == ((jh1)object).f && this.g == ((jh1)object).g && this.h == ((jh1)object).h && Arrays.equals(this.i, ((jh1)object).i))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n10 = this.b;
        n10 = e3.a((String)this.c, (int)((n10 + 527) * 31), (int)31);
        n10 = e3.a((String)this.d, (int)n10, (int)31);
        int n13 = this.e;
        int n14 = this.f;
        int n15 = this.g;
        int n16 = this.h;
        return Arrays.hashCode(this.i) + ((((n10 + n13) * 31 + n14) * 31 + n15) * 31 + n16) * 31;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Picture: mimeType=");
        stringBuilder.append(this.c);
        stringBuilder.append(", description=");
        stringBuilder.append(this.d);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n10) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeByteArray(this.i);
    }
}


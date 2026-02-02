/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  com.yandex.mobile.ads.impl.hw0$a
 *  com.yandex.mobile.ads.impl.ie$a
 *  com.yandex.mobile.ads.impl.jx2
 *  com.yandex.mobile.ads.impl.k01$b
 */
package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.hw0;
import com.yandex.mobile.ads.impl.ie;
import com.yandex.mobile.ads.impl.jx2;
import com.yandex.mobile.ads.impl.k01;

public final class ie
implements k01.b {
    public static final Parcelable.Creator<ie> CREATOR = new a();
    public final int b;
    public final String c;

    public ie(int n10, String string2) {
        this.b = n10;
        this.c = string2;
    }

    public /* synthetic */ cc0 a() {
        return jx2.a((k01.b)this);
    }

    public /* synthetic */ void a(hw0.a a13) {
        jx2.b((k01.b)this, a13);
    }

    public /* synthetic */ byte[] b() {
        return jx2.c((k01.b)this);
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Ait(controlCode=");
        stringBuilder.append(this.b);
        stringBuilder.append(",url=");
        stringBuilder.append(this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n10) {
        parcel.writeString(this.c);
        parcel.writeInt(this.b);
    }
}


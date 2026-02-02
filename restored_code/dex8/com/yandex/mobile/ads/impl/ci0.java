/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.ci0$a
 *  com.yandex.mobile.ads.impl.hw0$a
 *  com.yandex.mobile.ads.impl.jx2
 *  com.yandex.mobile.ads.impl.k01$b
 *  com.yandex.mobile.ads.impl.uf
 */
package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.ci0;
import com.yandex.mobile.ads.impl.hw0;
import com.yandex.mobile.ads.impl.jx2;
import com.yandex.mobile.ads.impl.k01;
import com.yandex.mobile.ads.impl.uf;
import java.util.Arrays;

public final class ci0
implements k01.b {
    public static final Parcelable.Creator<ci0> CREATOR = new a();
    public final byte[] b;
    @Nullable
    public final String c;
    @Nullable
    public final String d;

    ci0(Parcel parcel) {
        this.b = (byte[])uf.a((Object)parcel.createByteArray());
        this.c = parcel.readString();
        this.d = parcel.readString();
    }

    public ci0(byte[] byArray, @Nullable String string2, @Nullable String string3) {
        this.b = byArray;
        this.c = string2;
        this.d = string3;
    }

    public /* synthetic */ cc0 a() {
        return jx2.a((k01.b)this);
    }

    public final void a(hw0.a a12) {
        String string2 = this.c;
        if (string2 != null) {
            a12.i(string2);
        }
    }

    public /* synthetic */ byte[] b() {
        return jx2.c((k01.b)this);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && ci0.class == object.getClass()) {
            object = (ci0)object;
            return Arrays.equals(this.b, ((ci0)object).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }

    public final String toString() {
        String string2 = this.c;
        String string3 = this.d;
        int n10 = this.b.length;
        StringBuilder stringBuilder = new StringBuilder("ICY: title=\"");
        stringBuilder.append(string2);
        stringBuilder.append("\", url=\"");
        stringBuilder.append(string3);
        stringBuilder.append("\", rawMetadata.length=\"");
        stringBuilder.append(n10);
        stringBuilder.append("\"");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n10) {
        parcel.writeByteArray(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}


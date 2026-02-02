/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.a53
 *  com.yandex.mobile.ads.impl.hw0$a
 *  com.yandex.mobile.ads.impl.jx2
 *  com.yandex.mobile.ads.impl.k01$b
 *  com.yandex.mobile.ads.impl.u02$a
 */
package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.a53;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.hw0;
import com.yandex.mobile.ads.impl.jx2;
import com.yandex.mobile.ads.impl.k01;
import com.yandex.mobile.ads.impl.u02;

public final class u02
implements k01.b {
    public static final Parcelable.Creator<u02> CREATOR = new a();
    public final float b;
    public final int c;

    public u02(int n10, float f11) {
        this.b = f11;
        this.c = n10;
    }

    private u02(Parcel parcel) {
        this.b = parcel.readFloat();
        this.c = parcel.readInt();
    }

    /* synthetic */ u02(Parcel parcel, a53 a532) {
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
        if (object != null && u02.class == object.getClass()) {
            object = (u02)object;
            if (this.b != ((u02)object).b || this.c != ((u02)object).c) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        return (Float.valueOf(this.b).hashCode() + 527) * 31 + this.c;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("smta: captureFrameRate=");
        stringBuilder.append(this.b);
        stringBuilder.append(", svcTemporalLayerCount=");
        stringBuilder.append(this.c);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n10) {
        parcel.writeFloat(this.b);
        parcel.writeInt(this.c);
    }
}


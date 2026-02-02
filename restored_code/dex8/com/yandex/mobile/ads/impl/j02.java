/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.hw0$a
 *  com.yandex.mobile.ads.impl.j02$a
 *  com.yandex.mobile.ads.impl.j02$b
 *  com.yandex.mobile.ads.impl.jx2
 *  com.yandex.mobile.ads.impl.k01$b
 *  com.yandex.mobile.ads.impl.uf
 */
package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.hw0;
import com.yandex.mobile.ads.impl.j02;
import com.yandex.mobile.ads.impl.jx2;
import com.yandex.mobile.ads.impl.k01;
import com.yandex.mobile.ads.impl.uf;
import java.util.ArrayList;
import java.util.List;

public final class j02
implements k01.b {
    public static final Parcelable.Creator<j02> CREATOR = new a();
    public final List<b> b;

    public j02(ArrayList arrayList) {
        this.b = arrayList;
        uf.a((boolean)(j02.a(arrayList) ^ true));
    }

    private static boolean a(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return false;
        }
        long l10 = (arrayList.get((int)0)).c;
        for (int i14 = 1; i14 < arrayList.size(); ++i14) {
            if ((arrayList.get((int)i14)).b < l10) {
                return true;
            }
            l10 = (arrayList.get((int)i14)).c;
        }
        return false;
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

    public final boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && j02.class == object.getClass()) {
            object = (j02)object;
            return this.b.equals(((j02)object).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SlowMotion: segments=");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n10) {
        parcel.writeList(this.b);
    }
}


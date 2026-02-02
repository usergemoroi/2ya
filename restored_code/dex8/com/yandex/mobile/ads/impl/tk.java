/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.e3
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.tk$a
 */
package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.e3;
import com.yandex.mobile.ads.impl.ei0;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.tk;
import java.util.Arrays;

public final class tk
extends ei0 {
    public static final Parcelable.Creator<tk> CREATOR = new a();
    public final byte[] c;

    tk(Parcel parcel) {
        super((String)m92.a((Object)parcel.readString()));
        this.c = (byte[])m92.a((Object)parcel.createByteArray());
    }

    public tk(String string2, byte[] byArray) {
        super(string2);
        this.c = byArray;
    }

    public final boolean equals(@Nullable Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object != null && tk.class == object.getClass()) {
            object = (tk)object;
            if (!this.b.equals(((ei0)object).b) || !Arrays.equals(this.c, ((tk)object).c)) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n10 = e3.a((String)this.b, (int)527, (int)31);
        return Arrays.hashCode(this.c) + n10;
    }

    public final void writeToParcel(Parcel parcel, int n10) {
        parcel.writeString(this.b);
        parcel.writeByteArray(this.c);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.hq$a
 *  com.yandex.mobile.ads.impl.m92
 */
package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ei0;
import com.yandex.mobile.ads.impl.hq;
import com.yandex.mobile.ads.impl.m92;

public final class hq
extends ei0 {
    public static final Parcelable.Creator<hq> CREATOR = new a();
    public final String c;
    public final String d;
    public final String e;

    hq(Parcel parcel) {
        super("COMM");
        this.c = (String)m92.a((Object)parcel.readString());
        this.d = (String)m92.a((Object)parcel.readString());
        this.e = (String)m92.a((Object)parcel.readString());
    }

    public hq(String string2, String string3, String string4) {
        super("COMM");
        this.c = string2;
        this.d = string3;
        this.e = string4;
    }

    public final boolean equals(@Nullable Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object != null && hq.class == object.getClass()) {
            object = (hq)object;
            if (!(m92.a((Object)this.d, (Object)((hq)object).d) && m92.a((Object)this.c, (Object)((hq)object).c) && m92.a((Object)this.e, (Object)((hq)object).e))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        String string2 = this.c;
        int n10 = 0;
        int n13 = string2 != null ? string2.hashCode() : 0;
        string2 = this.d;
        int n14 = string2 != null ? string2.hashCode() : 0;
        string2 = this.e;
        if (string2 != null) {
            n10 = string2.hashCode();
        }
        return ((n13 + 527) * 31 + n14) * 31 + n10;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b);
        stringBuilder.append(": language=");
        stringBuilder.append(this.c);
        stringBuilder.append(", description=");
        stringBuilder.append(this.d);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n10) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.e);
    }
}


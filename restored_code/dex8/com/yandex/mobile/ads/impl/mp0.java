/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.mp0$a
 */
package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ei0;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.mp0;

public final class mp0
extends ei0 {
    public static final Parcelable.Creator<mp0> CREATOR = new a();
    public final String c;
    public final String d;
    public final String e;

    mp0(Parcel parcel) {
        super("----");
        this.c = (String)m92.a((Object)parcel.readString());
        this.d = (String)m92.a((Object)parcel.readString());
        this.e = (String)m92.a((Object)parcel.readString());
    }

    public mp0(String string2, String string3, String string4) {
        super("----");
        this.c = string2;
        this.d = string3;
        this.e = string4;
    }

    public final boolean equals(@Nullable Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object != null && mp0.class == object.getClass()) {
            object = (mp0)object;
            if (!(m92.a((Object)this.d, (Object)((mp0)object).d) && m92.a((Object)this.c, (Object)((mp0)object).c) && m92.a((Object)this.e, (Object)((mp0)object).e))) {
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
        stringBuilder.append(": domain=");
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


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.e3
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.y82$a
 */
package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.e3;
import com.yandex.mobile.ads.impl.ei0;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.y82;

public final class y82
extends ei0 {
    public static final Parcelable.Creator<y82> CREATOR = new a();
    @Nullable
    public final String c;
    public final String d;

    y82(Parcel parcel) {
        super((String)m92.a((Object)parcel.readString()));
        this.c = parcel.readString();
        this.d = (String)m92.a((Object)parcel.readString());
    }

    public y82(String string2, @Nullable String string3, String string4) {
        super(string2);
        this.c = string3;
        this.d = string4;
    }

    public final boolean equals(@Nullable Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object != null && y82.class == object.getClass()) {
            object = (y82)object;
            if (!(this.b.equals(((ei0)object).b) && m92.a((Object)this.c, (Object)((y82)object).c) && m92.a((Object)this.d, (Object)((y82)object).d))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n10 = e3.a((String)this.b, (int)527, (int)31);
        String string2 = this.c;
        int n13 = 0;
        int n14 = string2 != null ? string2.hashCode() : 0;
        string2 = this.d;
        if (string2 != null) {
            n13 = string2.hashCode();
        }
        return (n10 + n14) * 31 + n13;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b);
        stringBuilder.append(": url=");
        stringBuilder.append(this.d);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n10) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}


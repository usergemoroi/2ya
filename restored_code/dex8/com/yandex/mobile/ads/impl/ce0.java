/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.ce0$a
 *  com.yandex.mobile.ads.impl.m92
 */
package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ce0;
import com.yandex.mobile.ads.impl.ei0;
import com.yandex.mobile.ads.impl.m92;
import java.util.Arrays;

public final class ce0
extends ei0 {
    public static final Parcelable.Creator<ce0> CREATOR = new a();
    public final String c;
    public final String d;
    public final String e;
    public final byte[] f;

    ce0(Parcel parcel) {
        super("GEOB");
        this.c = (String)m92.a((Object)parcel.readString());
        this.d = (String)m92.a((Object)parcel.readString());
        this.e = (String)m92.a((Object)parcel.readString());
        this.f = (byte[])m92.a((Object)parcel.createByteArray());
    }

    public ce0(String string2, String string3, String string4, byte[] byArray) {
        super("GEOB");
        this.c = string2;
        this.d = string3;
        this.e = string4;
        this.f = byArray;
    }

    public final boolean equals(@Nullable Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object != null && ce0.class == object.getClass()) {
            object = (ce0)object;
            if (!(m92.a((Object)this.c, (Object)((ce0)object).c) && m92.a((Object)this.d, (Object)((ce0)object).d) && m92.a((Object)this.e, (Object)((ce0)object).e) && Arrays.equals(this.f, ((ce0)object).f))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        String string2 = this.c;
        int n10 = 0;
        int n12 = string2 != null ? string2.hashCode() : 0;
        string2 = this.d;
        int n13 = string2 != null ? string2.hashCode() : 0;
        string2 = this.e;
        if (string2 != null) {
            n10 = string2.hashCode();
        }
        return Arrays.hashCode(this.f) + (((n12 + 527) * 31 + n13) * 31 + n10) * 31;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b);
        stringBuilder.append(": mimeType=");
        stringBuilder.append(this.c);
        stringBuilder.append(", filename=");
        stringBuilder.append(this.d);
        stringBuilder.append(", description=");
        stringBuilder.append(this.e);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n10) {
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeByteArray(this.f);
    }
}


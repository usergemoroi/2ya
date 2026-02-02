/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.hw0$a
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.yd$a
 */
package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ei0;
import com.yandex.mobile.ads.impl.hw0;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.yd;
import java.util.Arrays;

public final class yd
extends ei0 {
    public static final Parcelable.Creator<yd> CREATOR = new a();
    public final String c;
    @Nullable
    public final String d;
    public final int e;
    public final byte[] f;

    yd(Parcel parcel) {
        super("APIC");
        this.c = (String)m92.a((Object)parcel.readString());
        this.d = parcel.readString();
        this.e = parcel.readInt();
        this.f = (byte[])m92.a((Object)parcel.createByteArray());
    }

    public yd(String string2, @Nullable String string3, int n10, byte[] byArray) {
        super("APIC");
        this.c = string2;
        this.d = string3;
        this.e = n10;
        this.f = byArray;
    }

    @Override
    public final void a(hw0.a a14) {
        byte[] byArray = this.f;
        a14.a(this.e, byArray);
    }

    public final boolean equals(@Nullable Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object != null && yd.class == object.getClass()) {
            object = (yd)object;
            if (!(this.e == ((yd)object).e && m92.a((Object)this.c, (Object)((yd)object).c) && m92.a((Object)this.d, (Object)((yd)object).d) && Arrays.equals(this.f, ((yd)object).f))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n10 = this.e;
        String string2 = this.c;
        int n13 = 0;
        int n14 = string2 != null ? string2.hashCode() : 0;
        string2 = this.d;
        if (string2 != null) {
            n13 = string2.hashCode();
        }
        return Arrays.hashCode(this.f) + (((n10 + 527) * 31 + n14) * 31 + n13) * 31;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b);
        stringBuilder.append(": mimeType=");
        stringBuilder.append(this.c);
        stringBuilder.append(", description=");
        stringBuilder.append(this.d);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n10) {
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeByteArray(this.f);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.hl1$a
 *  com.yandex.mobile.ads.impl.m92
 */
package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ei0;
import com.yandex.mobile.ads.impl.hl1;
import com.yandex.mobile.ads.impl.m92;
import java.util.Arrays;

public final class hl1
extends ei0 {
    public static final Parcelable.Creator<hl1> CREATOR = new a();
    public final String c;
    public final byte[] d;

    hl1(Parcel parcel) {
        super("PRIV");
        this.c = (String)m92.a((Object)parcel.readString());
        this.d = (byte[])m92.a((Object)parcel.createByteArray());
    }

    public hl1(String string2, byte[] byArray) {
        super("PRIV");
        this.c = string2;
        this.d = byArray;
    }

    public final boolean equals(@Nullable Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object != null && hl1.class == object.getClass()) {
            object = (hl1)object;
            if (!m92.a((Object)this.c, (Object)((hl1)object).c) || !Arrays.equals(this.d, ((hl1)object).d)) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        String string2 = this.c;
        int n10 = string2 != null ? string2.hashCode() : 0;
        return Arrays.hashCode(this.d) + (n10 + 527) * 31;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b);
        stringBuilder.append(": owner=");
        stringBuilder.append(this.c);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n10) {
        parcel.writeString(this.c);
        parcel.writeByteArray(this.d);
    }
}


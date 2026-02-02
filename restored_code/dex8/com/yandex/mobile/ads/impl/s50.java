/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.hw0$a
 *  com.yandex.mobile.ads.impl.jx2
 *  com.yandex.mobile.ads.impl.k01$b
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.s50$a
 */
package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.hw0;
import com.yandex.mobile.ads.impl.jx2;
import com.yandex.mobile.ads.impl.k01;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.s50;
import java.util.Arrays;

public final class s50
implements k01.b {
    public static final Parcelable.Creator<s50> CREATOR;
    private static final cc0 h;
    private static final cc0 i;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final byte[] f;
    private int g;

    static {
        h = new /* Unavailable Anonymous Inner Class!! */.e("application/id3").a();
        i = new /* Unavailable Anonymous Inner Class!! */.e("application/x-scte35").a();
        CREATOR = new a();
    }

    s50(Parcel parcel) {
        this.b = (String)m92.a((Object)parcel.readString());
        this.c = (String)m92.a((Object)parcel.readString());
        this.d = parcel.readLong();
        this.e = parcel.readLong();
        this.f = (byte[])m92.a((Object)parcel.createByteArray());
    }

    public s50(String string2, String string3, long l10, long l11, byte[] byArray) {
        this.b = string2;
        this.c = string3;
        this.d = l10;
        this.e = l11;
        this.f = byArray;
    }

    @Nullable
    public final cc0 a() {
        String string2 = this.b;
        string2.getClass();
        int n10 = string2.hashCode();
        int n13 = -1;
        switch (n10) {
            default: {
                break;
            }
            case 1303648457: {
                if (!string2.equals("https://developer.apple.com/streaming/emsg-id3")) break;
                n13 = 2;
                break;
            }
            case -795945609: {
                if (!string2.equals("https://aomedia.org/emsg/ID3")) break;
                n13 = 1;
                break;
            }
            case -1468477611: {
                if (!string2.equals("urn:scte:scte35:2014:bin")) break;
                n13 = 0;
            }
        }
        switch (n13) {
            default: {
                return null;
            }
            case 1: 
            case 2: {
                return h;
            }
            case 0: 
        }
        return i;
    }

    public /* synthetic */ void a(hw0.a a14) {
        jx2.b((k01.b)this, a14);
    }

    @Nullable
    public final byte[] b() {
        byte[] byArray = this.a() != null ? this.f : null;
        return byArray;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object != null && s50.class == object.getClass()) {
            object = (s50)object;
            if (!(this.d == ((s50)object).d && this.e == ((s50)object).e && m92.a((Object)this.b, (Object)((s50)object).b) && m92.a((Object)this.c, (Object)((s50)object).c) && Arrays.equals(this.f, ((s50)object).f))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        if (this.g == 0) {
            String string2 = this.b;
            int n10 = 0;
            int n13 = string2 != null ? string2.hashCode() : 0;
            string2 = this.c;
            if (string2 != null) {
                n10 = string2.hashCode();
            }
            long l10 = this.d;
            int n14 = (int)(l10 ^ l10 >>> 32);
            l10 = this.e;
            int n15 = (int)(l10 ^ l10 >>> 32);
            this.g = Arrays.hashCode(this.f) + ((((n13 + 527) * 31 + n10) * 31 + n14) * 31 + n15) * 31;
        }
        return this.g;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("EMSG: scheme=");
        stringBuilder.append(this.b);
        stringBuilder.append(", id=");
        stringBuilder.append(this.e);
        stringBuilder.append(", durationMs=");
        stringBuilder.append(this.d);
        stringBuilder.append(", value=");
        stringBuilder.append(this.c);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n10) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
        parcel.writeByteArray(this.f);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.e3
 *  com.yandex.mobile.ads.impl.hw0$a
 *  com.yandex.mobile.ads.impl.jx2
 *  com.yandex.mobile.ads.impl.k01$b
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.oj2$a
 */
package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.e3;
import com.yandex.mobile.ads.impl.hw0;
import com.yandex.mobile.ads.impl.jx2;
import com.yandex.mobile.ads.impl.k01;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.oj2;

@Deprecated
public class oj2
implements k01.b {
    public static final Parcelable.Creator<oj2> CREATOR = new a();
    public final String b;
    public final String c;

    protected oj2(Parcel parcel) {
        this.b = (String)m92.a((Object)parcel.readString());
        this.c = (String)m92.a((Object)parcel.readString());
    }

    public oj2(String string2, String string3) {
        this.b = string2;
        this.c = string3;
    }

    public /* synthetic */ cc0 a() {
        return jx2.a((k01.b)this);
    }

    public final void a(hw0.a a14) {
        String string2 = this.b;
        string2.getClass();
        int n10 = string2.hashCode();
        int n13 = -1;
        switch (n10) {
            default: {
                break;
            }
            case 1939198791: {
                if (!string2.equals("ARTIST")) break;
                n13 = 4;
                break;
            }
            case 1746739798: {
                if (!string2.equals("ALBUMARTIST")) break;
                n13 = 3;
                break;
            }
            case 428414940: {
                if (!string2.equals("DESCRIPTION")) break;
                n13 = 2;
                break;
            }
            case 79833656: {
                if (!string2.equals("TITLE")) break;
                n13 = 1;
                break;
            }
            case 62359119: {
                if (!string2.equals("ALBUM")) break;
                n13 = 0;
            }
        }
        switch (n13) {
            default: {
                break;
            }
            case 4: {
                a14.c(this.c);
                break;
            }
            case 3: {
                a14.a(this.c);
                break;
            }
            case 2: {
                a14.f(this.c);
                break;
            }
            case 1: {
                a14.i(this.c);
                break;
            }
            case 0: {
                a14.b(this.c);
            }
        }
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
        if (object != null && this.getClass() == object.getClass()) {
            object = (oj2)object;
            if (!this.b.equals(((oj2)object).b) || !this.c.equals(((oj2)object).c)) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n10 = e3.a((String)this.b, (int)527, (int)31);
        return this.c.hashCode() + n10;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("VC: ");
        stringBuilder.append(this.b);
        stringBuilder.append("=");
        stringBuilder.append(this.c);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n10) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}


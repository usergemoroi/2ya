/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.e3
 *  com.yandex.mobile.ads.impl.hw0$a
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.v42$a
 */
package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.e3;
import com.yandex.mobile.ads.impl.ei0;
import com.yandex.mobile.ads.impl.hw0;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.v42;
import java.util.ArrayList;

public final class v42
extends ei0 {
    public static final Parcelable.Creator<v42> CREATOR = new a();
    @Nullable
    public final String c;
    public final String d;

    v42(Parcel parcel) {
        super((String)m92.a((Object)parcel.readString()));
        this.c = parcel.readString();
        this.d = (String)m92.a((Object)parcel.readString());
    }

    public v42(String string2, @Nullable String string3, String string4) {
        super(string2);
        this.c = string3;
        this.d = string4;
    }

    private static ArrayList a(String string2) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        try {
            if (string2.length() >= 10) {
                arrayList.add(Integer.parseInt(string2.substring(0, 4)));
                arrayList.add(Integer.parseInt(string2.substring(5, 7)));
                arrayList.add(Integer.parseInt(string2.substring(8, 10)));
            } else if (string2.length() >= 7) {
                arrayList.add(Integer.parseInt(string2.substring(0, 4)));
                arrayList.add(Integer.parseInt(string2.substring(5, 7)));
            } else if (string2.length() >= 4) {
                arrayList.add(Integer.parseInt(string2.substring(0, 4)));
            }
            return arrayList;
        }
        catch (NumberFormatException numberFormatException) {
            return new ArrayList();
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a(hw0.a a14) {
        int n10;
        Object object = this.b;
        object.getClass();
        int n13 = -1;
        switch (object.hashCode()) {
            case 2590194: {
                if (!object.equals("TYER")) break;
                n13 = 1;
                break;
            }
            case 2583398: {
                if (!object.equals("TRCK")) break;
                n13 = 2;
                break;
            }
            case 2581514: {
                if (!object.equals("TPE3")) break;
                n13 = 3;
                break;
            }
            case 2581513: {
                if (!object.equals("TPE2")) break;
                n13 = 4;
                break;
            }
            case 2581512: {
                if (!object.equals("TPE1")) break;
                n13 = 5;
                break;
            }
            case 2575251: {
                if (!object.equals("TIT2")) break;
                n13 = 6;
                break;
            }
            case 2571565: {
                if (!object.equals("TEXT")) break;
                n13 = 7;
                break;
            }
            case 2570410: {
                if (!object.equals("TDRL")) break;
                n13 = 8;
                break;
            }
            case 2570401: {
                if (!object.equals("TDRC")) break;
                n13 = 9;
                break;
            }
            case 2569891: {
                if (!object.equals("TDAT")) break;
                n13 = 10;
                break;
            }
            case 2569357: {
                if (!object.equals("TCOM")) break;
                n13 = 11;
                break;
            }
            case 2567331: {
                if (!object.equals("TALB")) break;
                n13 = 12;
                break;
            }
            case 83552: {
                if (!object.equals("TYE")) break;
                n13 = 13;
                break;
            }
            case 83536: {
                if (!object.equals("TXT")) break;
                n13 = 14;
                break;
            }
            case 83378: {
                if (!object.equals("TT2")) break;
                n13 = 15;
                break;
            }
            case 83341: {
                if (!object.equals("TRK")) break;
                n13 = 16;
                break;
            }
            case 83255: {
                if (!object.equals("TP3")) break;
                n13 = 17;
                break;
            }
            case 83254: {
                if (!object.equals("TP2")) break;
                n13 = 18;
                break;
            }
            case 83253: {
                if (!object.equals("TP1")) break;
                n13 = 19;
                break;
            }
            case 82897: {
                if (!object.equals("TDA")) break;
                n13 = 20;
                break;
            }
            case 82878: {
                if (!object.equals("TCM")) break;
                n13 = 21;
                break;
            }
            case 82815: {
                if (!object.equals("TAL")) break;
                n13 = 22;
                break;
            }
        }
        switch (n13) {
            default: {
                n10 = -1;
                break;
            }
            case 1: {
                n10 = 21;
                break;
            }
            case 2: {
                n10 = 20;
                break;
            }
            case 3: {
                n10 = 19;
                break;
            }
            case 4: {
                n10 = 18;
                break;
            }
            case 5: {
                n10 = 17;
                break;
            }
            case 6: {
                n10 = 16;
                break;
            }
            case 7: {
                n10 = 15;
                break;
            }
            case 8: {
                n10 = 14;
                break;
            }
            case 9: {
                n10 = 13;
                break;
            }
            case 10: {
                n10 = 12;
                break;
            }
            case 11: {
                n10 = 11;
                break;
            }
            case 12: {
                n10 = 10;
                break;
            }
            case 13: {
                n10 = 9;
                break;
            }
            case 14: {
                n10 = 8;
                break;
            }
            case 15: {
                n10 = 7;
                break;
            }
            case 16: {
                n10 = 6;
                break;
            }
            case 17: {
                n10 = 5;
                break;
            }
            case 18: {
                n10 = 4;
                break;
            }
            case 19: {
                n10 = 3;
                break;
            }
            case 20: {
                n10 = 2;
                break;
            }
            case 21: {
                n10 = 1;
                break;
            }
            case 22: {
                n10 = 0;
            }
        }
        switch (n10) {
            default: {
                return;
            }
            case 14: {
                object = v42.a(this.d);
                n10 = object.size();
                if (n10 != 1) {
                    if (n10 != 2) {
                        if (n10 != 3) {
                            return;
                        }
                        a14.d((Integer)object.get(2));
                    }
                    a14.e((Integer)object.get(1));
                }
                a14.f((Integer)object.get(0));
                return;
            }
            case 13: {
                object = v42.a(this.d);
                n10 = object.size();
                if (n10 != 1) {
                    if (n10 != 2) {
                        if (n10 != 3) {
                            return;
                        }
                        a14.a((Integer)object.get(2));
                    }
                    a14.b((Integer)object.get(1));
                }
                a14.c((Integer)object.get(0));
                return;
            }
            case 9: 
            case 21: {
                a14.c(Integer.valueOf(Integer.parseInt(this.d)));
                return;
            }
            case 8: 
            case 15: {
                a14.j(this.d);
                return;
            }
            case 7: 
            case 16: {
                a14.i(this.d);
                return;
            }
            case 6: 
            case 20: {
                object = this.d;
                n10 = m92.a;
                object = object.split("/", -1);
                n10 = Integer.parseInt(object[0]);
                object = ((String[])object).length > 1 ? Integer.valueOf(Integer.parseInt(object[1])) : null;
                a14.h(Integer.valueOf(n10)).g((Integer)object);
                return;
            }
            case 5: 
            case 19: {
                a14.e(this.d);
                return;
            }
            case 4: 
            case 18: {
                a14.a(this.d);
                return;
            }
            case 3: 
            case 17: {
                a14.c(this.d);
                return;
            }
            case 2: 
            case 12: {
                n10 = Integer.parseInt(this.d.substring(2, 4));
                int n14 = Integer.parseInt(this.d.substring(0, 2));
                a14.b(Integer.valueOf(n10)).a(Integer.valueOf(n14));
                return;
            }
            case 1: 
            case 11: {
                a14.d(this.d);
                return;
            }
            case 0: 
            case 10: 
        }
        a14.b(this.d);
        return;
        // Removed invalid catch block
        }
    }

    public final boolean equals(@Nullable Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object != null && v42.class == object.getClass()) {
            object = (v42)object;
            if (!(m92.a((Object)this.b, (Object)((ei0)object).b) && m92.a((Object)this.c, (Object)((v42)object).c) && m92.a((Object)this.d, (Object)((v42)object).d))) {
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
        stringBuilder.append(": description=");
        stringBuilder.append(this.c);
        stringBuilder.append(": value=");
        stringBuilder.append(this.d);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n10) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}


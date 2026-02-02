/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.bi0$a
 *  com.yandex.mobile.ads.impl.hw0$a
 *  com.yandex.mobile.ads.impl.jx2
 *  com.yandex.mobile.ads.impl.k01$b
 *  com.yandex.mobile.ads.impl.lv0
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.uf
 *  com.yandex.mobile.ads.impl.zs0
 */
package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.bi0;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.hw0;
import com.yandex.mobile.ads.impl.jx2;
import com.yandex.mobile.ads.impl.k01;
import com.yandex.mobile.ads.impl.lv0;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.uf;
import com.yandex.mobile.ads.impl.zs0;
import java.util.List;
import java.util.Map;

public final class bi0
implements k01.b {
    public static final Parcelable.Creator<bi0> CREATOR = new a();
    public final int b;
    @Nullable
    public final String c;
    @Nullable
    public final String d;
    @Nullable
    public final String e;
    public final boolean f;
    public final int g;

    public bi0(int n10, @Nullable String string2, @Nullable String string3, @Nullable String string4, boolean bl2, int n12) {
        boolean bl3 = n12 == -1 || n12 > 0;
        uf.a((boolean)bl3);
        this.b = n10;
        this.c = string2;
        this.d = string3;
        this.e = string4;
        this.f = bl2;
        this.g = n12;
    }

    bi0(Parcel parcel) {
        this.b = parcel.readInt();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = m92.a((Parcel)parcel);
        this.g = parcel.readInt();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    public static bi0 a(Map<String, List<String>> var0) {
        block19: {
            block18: {
                block20: {
                    var7_1 = (List)var0.get("icy-br");
                    var5_2 = 1;
                    var3_3 = -1;
                    if (var7_1 != null) {
                        block17: {
                            var7_1 = (String)var7_1.get(0);
                            var1_4 = Integer.parseInt((String)var7_1);
                            var2_5 = var1_4 * 1000;
                            if (var2_5 <= 0) break block17;
                            var1_4 = 1;
                        }
                        var8_6 = new StringBuilder("Invalid bitrate: ");
                        var8_6.append((String)var7_1);
                        zs0.d((String)"IcyHeaders", (String)var8_6.toString());
                    }
                    var1_4 = 0;
                    var4_9 = -1;
                    break block20;
                    catch (NumberFormatException var8_7) {
                        block21: {
                            var2_5 = -1;
                            break block21;
                            catch (NumberFormatException var8_8) {}
                        }
                        lv0.a((String)"Invalid bitrate header: ", (String)var7_1, (String)"IcyHeaders");
                        var1_4 = 0;
                    }
                    var4_9 = var2_5;
                }
                var7_1 = (List)var0.get("icy-genre");
                var10_10 = null;
                if (var7_1 != null) {
                    var7_1 = (String)var7_1.get(0);
                    var1_4 = 1;
                } else {
                    var7_1 = null;
                }
                var8_6 = (List)var0.get("icy-name");
                if (var8_6 != null) {
                    var8_6 = (String)var8_6.get(0);
                    var1_4 = 1;
                } else {
                    var8_6 = null;
                }
                var9_11 = (List)var0.get("icy-url");
                if (var9_11 != null) {
                    var9_11 = (String)var9_11.get(0);
                    var1_4 = 1;
                } else {
                    var9_11 = null;
                }
                var11_12 = (List)var0.get("icy-pub");
                if (var11_12 != null) {
                    var6_15 = ((String)var11_12.get(0)).equals("1");
                    var1_4 = 1;
                } else {
                    var6_15 = false;
                }
                var0 = (List)var0.get("icy-metaint");
                var2_5 = var3_3;
                if (var0 == null) break block19;
                var0 = (String)var0.get(0);
                var2_5 = Integer.parseInt((String)var0);
                if (var2_5 <= 0) break block18;
                var1_4 = var5_2;
                break block19;
            }
            try {
                var11_12 = new StringBuilder("Invalid metadata interval: ");
                var11_12.append((String)var0);
                zs0.d((String)"IcyHeaders", (String)var11_12.toString());
                var2_5 = var3_3;
            }
            catch (NumberFormatException var11_13) {}
            ** GOTO lbl-1000
            catch (NumberFormatException var11_14) {
                var2_5 = var3_3;
            }
lbl-1000:
            // 2 sources

            {
                lv0.a((String)"Invalid metadata interval: ", (String)var0, (String)"IcyHeaders");
            }
        }
        var0 = var10_10;
        if (var1_4 == 0) return var0;
        return new bi0(var4_9, (String)var7_1, (String)var8_6, (String)var9_11, var6_15, var2_5);
    }

    public /* synthetic */ cc0 a() {
        return jx2.a((k01.b)this);
    }

    public final void a(hw0.a a12) {
        String string2 = this.d;
        if (string2 != null) {
            a12.h(string2);
        }
        if ((string2 = this.c) != null) {
            a12.g(string2);
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
        if (object != null && bi0.class == object.getClass()) {
            object = (bi0)object;
            if (!(this.b == ((bi0)object).b && m92.a((Object)this.c, (Object)((bi0)object).c) && m92.a((Object)this.d, (Object)((bi0)object).d) && m92.a((Object)this.e, (Object)((bi0)object).e) && this.f == ((bi0)object).f && this.g == ((bi0)object).g)) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n10 = this.b;
        String string2 = this.c;
        int n12 = 0;
        int n13 = string2 != null ? string2.hashCode() : 0;
        string2 = this.d;
        int n14 = string2 != null ? string2.hashCode() : 0;
        string2 = this.e;
        if (string2 != null) {
            n12 = string2.hashCode();
        }
        return (((((n10 + 527) * 31 + n13) * 31 + n14) * 31 + n12) * 31 + this.f) * 31 + this.g;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("IcyHeaders: name=\"");
        stringBuilder.append(this.d);
        stringBuilder.append("\", genre=\"");
        stringBuilder.append(this.c);
        stringBuilder.append("\", bitrate=");
        stringBuilder.append(this.b);
        stringBuilder.append(", metadataInterval=");
        stringBuilder.append(this.g);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n10) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        n10 = this.f ? 1 : 0;
        int n12 = m92.a;
        parcel.writeInt(n10);
        parcel.writeInt(this.g);
    }
}


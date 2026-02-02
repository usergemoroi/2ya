/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.compose.animation.a
 *  com.yandex.mobile.ads.impl.fc2
 *  com.yandex.mobile.ads.impl.il2
 *  com.yandex.mobile.ads.impl.ji2
 *  com.yandex.mobile.ads.impl.n9
 *  com.yandex.mobile.ads.impl.ug2
 */
package com.yandex.mobile.ads.impl;

import androidx.compose.animation.a;
import com.yandex.mobile.ads.impl.fc2;
import com.yandex.mobile.ads.impl.hb2;
import com.yandex.mobile.ads.impl.il2;
import com.yandex.mobile.ads.impl.ji2;
import com.yandex.mobile.ads.impl.lu;
import com.yandex.mobile.ads.impl.n9;
import com.yandex.mobile.ads.impl.ug2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class xb2
implements ug2 {
    private final boolean a;
    @NotNull
    private final List<lu> b;
    @NotNull
    private final Map<String, List<String>> c;
    @NotNull
    private final fc2 d;
    @Nullable
    private final String e;
    @Nullable
    private final String f;
    @Nullable
    private final String g;
    @Nullable
    private final String h;
    @Nullable
    private final String i;
    @Nullable
    private final ji2 j;
    @Nullable
    private final Integer k;
    @Nullable
    private final String l;
    @Nullable
    private final il2 m;
    @NotNull
    private final List<hb2> n;
    @NotNull
    private final Map<String, List<String>> o;

    public xb2(boolean bl2, @NotNull ArrayList arrayList, @NotNull LinkedHashMap linkedHashMap, @NotNull fc2 fc22, @Nullable String string2, @Nullable String string3, @Nullable String string4, @Nullable String string5, @Nullable String string6, @Nullable ji2 ji22, @Nullable Integer n10, @Nullable String string7, @Nullable il2 il22, @NotNull ArrayList arrayList2, @NotNull Map map2) {
        this.a = bl2;
        this.b = arrayList;
        this.c = linkedHashMap;
        this.d = fc22;
        this.e = string2;
        this.f = string3;
        this.g = string4;
        this.h = string5;
        this.i = string6;
        this.j = ji22;
        this.k = n10;
        this.l = string7;
        this.m = il22;
        this.n = arrayList2;
        this.o = map2;
    }

    @NotNull
    public final Map<String, List<String>> a() {
        return this.o;
    }

    @Nullable
    public final String b() {
        return this.e;
    }

    @Nullable
    public final String c() {
        return this.f;
    }

    @NotNull
    public final List<hb2> d() {
        return this.n;
    }

    @NotNull
    public final List<lu> e() {
        return this.b;
    }

    public final boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof xb2)) {
            return false;
        }
        object = (xb2)object;
        if (this.a != ((xb2)object).a) {
            return false;
        }
        if (!y.e(this.b, ((xb2)object).b)) {
            return false;
        }
        if (!y.e(this.c, ((xb2)object).c)) {
            return false;
        }
        if (!y.e(this.d, ((xb2)object).d)) {
            return false;
        }
        if (!y.e(this.e, ((xb2)object).e)) {
            return false;
        }
        if (!y.e(this.f, ((xb2)object).f)) {
            return false;
        }
        if (!y.e(this.g, ((xb2)object).g)) {
            return false;
        }
        if (!y.e(this.h, ((xb2)object).h)) {
            return false;
        }
        if (!y.e(this.i, ((xb2)object).i)) {
            return false;
        }
        if (!y.e(this.j, ((xb2)object).j)) {
            return false;
        }
        if (!y.e(this.k, ((xb2)object).k)) {
            return false;
        }
        if (!y.e(this.l, ((xb2)object).l)) {
            return false;
        }
        if (!y.e(this.m, ((xb2)object).m)) {
            return false;
        }
        if (!y.e(this.n, ((xb2)object).n)) {
            return false;
        }
        return y.e(this.o, ((xb2)object).o);
    }

    @Nullable
    public final String f() {
        return this.g;
    }

    @Nullable
    public final String g() {
        return this.l;
    }

    @NotNull
    public final Map<String, List<String>> h() {
        return this.c;
    }

    public final int hashCode() {
        int n10 = androidx.compose.animation.a.a((boolean)this.a);
        int n13 = n9.a(this.b, (int)(n10 * 31), (int)31);
        int n14 = ((Object)this.c).hashCode();
        int n15 = this.d.hashCode();
        Object object = this.e;
        int n16 = 0;
        n10 = object == null ? 0 : ((String)object).hashCode();
        object = this.f;
        int n17 = object == null ? 0 : ((String)object).hashCode();
        object = this.g;
        int n18 = object == null ? 0 : ((String)object).hashCode();
        object = this.h;
        int n19 = object == null ? 0 : ((String)object).hashCode();
        object = this.i;
        int n23 = object == null ? 0 : ((String)object).hashCode();
        object = this.j;
        int n24 = object == null ? 0 : object.hashCode();
        object = this.k;
        int n25 = object == null ? 0 : object.hashCode();
        object = this.l;
        int n26 = object == null ? 0 : ((String)object).hashCode();
        object = this.m;
        if (object != null) {
            n16 = object.hashCode();
        }
        n10 = n9.a(this.n, (int)(((((((((((n15 + (n14 + n13) * 31) * 31 + n10) * 31 + n17) * 31 + n18) * 31 + n19) * 31 + n23) * 31 + n24) * 31 + n25) * 31 + n26) * 31 + n16) * 31), (int)31);
        return ((Object)this.o).hashCode() + n10;
    }

    @Nullable
    public final Integer i() {
        return this.k;
    }

    @Nullable
    public final String j() {
        return this.h;
    }

    @Nullable
    public final String k() {
        return this.i;
    }

    @NotNull
    public final fc2 l() {
        return this.d;
    }

    @Nullable
    public final ji2 m() {
        return this.j;
    }

    @Nullable
    public final il2 n() {
        return this.m;
    }

    public final boolean o() {
        return this.a;
    }

    @NotNull
    public final String toString() {
        boolean bl2 = this.a;
        List<lu> list = this.b;
        Map<String, List<String>> map2 = this.c;
        fc2 fc22 = this.d;
        String string2 = this.e;
        String string3 = this.f;
        String string4 = this.g;
        String string5 = this.h;
        String string6 = this.i;
        ji2 ji22 = this.j;
        Integer n10 = this.k;
        String string7 = this.l;
        il2 il22 = this.m;
        List<hb2> list2 = this.n;
        Map<String, List<String>> map3 = this.o;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("VideoAd(isWrapper=");
        stringBuilder.append(bl2);
        stringBuilder.append(", creatives=");
        stringBuilder.append(list);
        stringBuilder.append(", rawTrackingEvents=");
        stringBuilder.append(map2);
        stringBuilder.append(", videoAdExtensions=");
        stringBuilder.append(fc22);
        stringBuilder.append(", adSystem=");
        stringBuilder.append(string2);
        stringBuilder.append(", adTitle=");
        stringBuilder.append(string3);
        stringBuilder.append(", description=");
        stringBuilder.append(string4);
        stringBuilder.append(", survey=");
        stringBuilder.append(string5);
        stringBuilder.append(", vastAdTagUri=");
        stringBuilder.append(string6);
        stringBuilder.append(", viewableImpression=");
        stringBuilder.append(ji22);
        stringBuilder.append(", sequence=");
        stringBuilder.append(n10);
        stringBuilder.append(", id=");
        stringBuilder.append(string7);
        stringBuilder.append(", wrapperConfiguration=");
        stringBuilder.append(il22);
        stringBuilder.append(", adVerifications=");
        stringBuilder.append(list2);
        stringBuilder.append(", trackingEvents=");
        stringBuilder.append(map3);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}


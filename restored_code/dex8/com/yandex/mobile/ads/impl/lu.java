/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.fy1
 *  com.yandex.mobile.ads.impl.n9
 *  com.yandex.mobile.ads.impl.ou
 *  com.yandex.mobile.ads.impl.r62
 *  com.yandex.mobile.ads.impl.ug2
 *  com.yandex.mobile.ads.impl.uz1
 *  com.yandex.mobile.ads.impl.xh0
 *  com.yandex.mobile.ads.impl.yv0
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.fy1;
import com.yandex.mobile.ads.impl.n9;
import com.yandex.mobile.ads.impl.ou;
import com.yandex.mobile.ads.impl.r62;
import com.yandex.mobile.ads.impl.ug2;
import com.yandex.mobile.ads.impl.uz1;
import com.yandex.mobile.ads.impl.xh0;
import com.yandex.mobile.ads.impl.yv0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lu
implements ug2 {
    @NotNull
    private final List<yv0> a;
    @NotNull
    private final List<xh0> b;
    @NotNull
    private final List<r62> c;
    @Nullable
    private final ou d;
    @Nullable
    private final String e;
    @Nullable
    private final uz1 f;
    @Nullable
    private final String g;
    private final int h;
    @Nullable
    private final String i;

    public lu(@NotNull ArrayList arrayList, @NotNull ArrayList arrayList2, @NotNull ArrayList arrayList3, @Nullable ou ou3, @Nullable String string2, @Nullable uz1 uz12, @Nullable String string3, int n10, @Nullable String string4) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = arrayList3;
        this.d = ou3;
        this.e = string2;
        this.f = uz12;
        this.g = string3;
        this.h = n10;
        this.i = string4;
    }

    @NotNull
    public final Map<String, List<String>> a() {
        List<Object> list = this.c;
        LinkedHashMap<String, List<String>> linkedHashMap = new LinkedHashMap<String, List<String>>();
        for (r62 r622 : list) {
            String string2 = r622.a();
            Object v14 = linkedHashMap.get(string2);
            list = v14;
            if (v14 == null) {
                list = new ArrayList<r62>();
                linkedHashMap.put(string2, list);
            }
            list.add((r62)r622.c());
        }
        return linkedHashMap;
    }

    @Nullable
    public final String b() {
        return this.i;
    }

    @Nullable
    public final String c() {
        return this.e;
    }

    @Nullable
    public final ou d() {
        return this.d;
    }

    public final int e() {
        return this.h;
    }

    public final boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof lu)) {
            return false;
        }
        object = (lu)object;
        if (!y.e(this.a, ((lu)object).a)) {
            return false;
        }
        if (!y.e(this.b, ((lu)object).b)) {
            return false;
        }
        if (!y.e(this.c, ((lu)object).c)) {
            return false;
        }
        if (!y.e(this.d, ((lu)object).d)) {
            return false;
        }
        if (!y.e(this.e, ((lu)object).e)) {
            return false;
        }
        if (!y.e(this.f, ((lu)object).f)) {
            return false;
        }
        if (!y.e(this.g, ((lu)object).g)) {
            return false;
        }
        if (this.h != ((lu)object).h) {
            return false;
        }
        return y.e(this.i, ((lu)object).i);
    }

    @NotNull
    public final List<xh0> f() {
        return this.b;
    }

    @Nullable
    public final String g() {
        return this.g;
    }

    @NotNull
    public final List<yv0> h() {
        return this.a;
    }

    public final int hashCode() {
        int n10 = ((Object)this.a).hashCode();
        n10 = n9.a(this.b, (int)(n10 * 31), (int)31);
        int n13 = n9.a(this.c, (int)n10, (int)31);
        Object object = this.d;
        int n14 = 0;
        n10 = object == null ? 0 : object.hashCode();
        object = this.e;
        int n15 = object == null ? 0 : ((String)object).hashCode();
        object = this.f;
        int n16 = object == null ? 0 : object.hashCode();
        object = this.g;
        int n17 = object == null ? 0 : ((String)object).hashCode();
        n15 = fy1.a((int)this.h, (int)(((((n13 + n10) * 31 + n15) * 31 + n16) * 31 + n17) * 31), (int)31);
        object = this.i;
        n10 = object == null ? n14 : ((String)object).hashCode();
        return n15 + n10;
    }

    @Nullable
    public final uz1 i() {
        return this.f;
    }

    @NotNull
    public final List<r62> j() {
        return this.c;
    }

    @NotNull
    public final String toString() {
        List<yv0> list = this.a;
        List<xh0> list2 = this.b;
        List<r62> list3 = this.c;
        ou ou3 = this.d;
        String string2 = this.e;
        uz1 uz12 = this.f;
        String string3 = this.g;
        int n10 = this.h;
        String string4 = this.i;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Creative(mediaFiles=");
        stringBuilder.append(list);
        stringBuilder.append(", icons=");
        stringBuilder.append(list2);
        stringBuilder.append(", trackingEventsList=");
        stringBuilder.append(list3);
        stringBuilder.append(", creativeExtensions=");
        stringBuilder.append(ou3);
        stringBuilder.append(", clickThroughUrl=");
        stringBuilder.append(string2);
        stringBuilder.append(", skipOffset=");
        stringBuilder.append(uz12);
        stringBuilder.append(", id=");
        stringBuilder.append(string3);
        stringBuilder.append(", durationMillis=");
        stringBuilder.append(n10);
        stringBuilder.append(", adParameters=");
        stringBuilder.append(string4);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}


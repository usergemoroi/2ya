/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.kf0$a
 *  com.yandex.mobile.ads.impl.n92
 *  kotlin.collections.t
 *  kotlin.text.p
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.kf0;
import com.yandex.mobile.ads.impl.n92;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import kotlin.collections.t;
import kotlin.internal.c;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.y;
import kotlin.jvm.internal.z0;
import kotlin.text.p;
import kotlin.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class kf0
implements Iterable<kotlin.t<? extends String, ? extends String>>,
kotlin.jvm.internal.markers.a {
    @NotNull
    private final String[] b;

    private kf0(String[] stringArray) {
        this.b = stringArray;
    }

    public /* synthetic */ kf0(String[] stringArray, int n10) {
        this(stringArray);
    }

    @NotNull
    public final String a(int n10) {
        return this.b[n10 * 2];
    }

    @Nullable
    public final String a(@NotNull String string2) {
        block3: {
            String[] stringArray = this.b;
            int n10 = stringArray.length - 2;
            int n13 = c.b(n10, 0, -2);
            if (n13 <= n10) {
                while (true) {
                    if (p.z((String)string2, (String)stringArray[n10], (boolean)true)) {
                        string2 = stringArray[n10 + 1];
                        break block3;
                    }
                    if (n10 == n13) break;
                    n10 -= 2;
                }
            }
            string2 = null;
        }
        return string2;
    }

    @NotNull
    public final a b() {
        a a13 = new /* Unavailable Anonymous Inner Class!! */;
        t.G((Collection)a13.b(), (Object[])this.b);
        return a13;
    }

    @NotNull
    public final String b(int n10) {
        return this.b[n10 * 2 + 1];
    }

    @NotNull
    public final TreeMap c() {
        TreeMap<String, ArrayList<String>> treeMap = new TreeMap<String, ArrayList<String>>(p.B((z0)z0.a));
        int n10 = this.b.length / 2;
        for (int i14 = 0; i14 < n10; ++i14) {
            ArrayList<String> arrayList;
            String string2 = this.b[i14 * 2].toLowerCase(Locale.US);
            y.i(string2, "toLowerCase(...)");
            ArrayList<String> arrayList2 = arrayList = (ArrayList<String>)treeMap.get(string2);
            if (arrayList == null) {
                arrayList2 = new ArrayList<String>(2);
                treeMap.put(string2, arrayList2);
            }
            arrayList2.add(this.b(i14));
        }
        return treeMap;
    }

    @NotNull
    public final List d() {
        int n10 = this.b.length / 2;
        List list = null;
        for (int i14 = 0; i14 < n10; ++i14) {
            List list2 = list;
            if (p.z((String)"Set-Cookie", (String)this.b[i14 * 2], (boolean)true)) {
                list2 = list;
                if (list == null) {
                    list2 = new ArrayList(2);
                }
                list2.add(this.b(i14));
            }
            list = list2;
        }
        list = list != null ? Collections.unmodifiableList(list) : t.m();
        return list;
    }

    public final boolean equals(@Nullable Object object) {
        boolean bl2 = object instanceof kf0 && Arrays.equals(this.b, ((kf0)object).b);
        return bl2;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }

    @Override
    @NotNull
    public final Iterator<kotlin.t<String, String>> iterator() {
        int n10 = this.b.length / 2;
        kotlin.t[] tArray = new kotlin.t[n10];
        for (int i14 = 0; i14 < n10; ++i14) {
            tArray[i14] = z.a(this.b[i14 * 2], this.b(i14));
        }
        return f.a(tArray);
    }

    @JvmName(name="size")
    public final int size() {
        return this.b.length / 2;
    }

    @NotNull
    public final String toString() {
        String string2;
        StringBuilder stringBuilder = new StringBuilder();
        int n10 = this.b.length / 2;
        for (int i14 = 0; i14 < n10; ++i14) {
            String string3 = this.b[i14 * 2];
            string2 = this.b(i14);
            stringBuilder.append(string3);
            stringBuilder.append(": ");
            if (n92.c((String)string3)) {
                string2 = "\u2588\u2588";
            }
            stringBuilder.append(string2);
            stringBuilder.append("\n");
        }
        string2 = stringBuilder.toString();
        y.i(string2, "toString(...)");
        return string2;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.i43
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.pk2
 *  com.yandex.mobile.ads.impl.q32
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.i43;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.pk2;
import com.yandex.mobile.ads.impl.q32;
import com.yandex.mobile.ads.impl.wu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class tk2
implements q32 {
    private final List<pk2> b;
    private final long[] c;
    private final long[] d;

    public tk2(ArrayList object) {
        this.b = Collections.unmodifiableList(new ArrayList(object));
        this.c = new long[((ArrayList)object).size() * 2];
        for (int i14 = 0; i14 < ((ArrayList)object).size(); ++i14) {
            pk2 pk22 = (pk2)((ArrayList)object).get(i14);
            int n10 = i14 * 2;
            long[] lArray = this.c;
            lArray[n10] = pk22.b;
            lArray[n10 + 1] = pk22.c;
        }
        object = this.c;
        object = Arrays.copyOf((long[])object, ((Object)object).length);
        this.d = (long[])object;
        Arrays.sort((long[])object);
    }

    private static /* synthetic */ int a(pk2 pk22, pk2 pk23) {
        return Long.compare(pk22.b, pk23.b);
    }

    public static /* synthetic */ int b(pk2 pk22, pk2 pk23) {
        return tk2.a(pk22, pk23);
    }

    public final int a() {
        return this.d.length;
    }

    public final int a(long l10) {
        int n10 = m92.a((long[])this.d, (long)l10, (boolean)false);
        if (n10 >= this.d.length) {
            n10 = -1;
        }
        return n10;
    }

    public final long a(int n10) {
        if (n10 >= 0) {
            long[] lArray = this.d;
            if (n10 < lArray.length) {
                return lArray[n10];
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public final List<wu> b(long l10) {
        int n10;
        ArrayList<wu> arrayList = new ArrayList<wu>();
        ArrayList<long[]> arrayList2 = new ArrayList<long[]>();
        int n13 = 0;
        for (n10 = 0; n10 < this.b.size(); ++n10) {
            Object object = this.c;
            int n14 = n10 * 2;
            if (object[n14] > l10 || l10 >= object[n14 + 1]) continue;
            object = this.b.get(n10);
            wu wu3 = object.a;
            if (wu3.f == -3.4028235E38f) {
                arrayList2.add((long[])object);
                continue;
            }
            arrayList.add(wu3);
        }
        Collections.sort(arrayList2, new i43());
        for (n10 = n13; n10 < arrayList2.size(); ++n10) {
            arrayList.add(((pk2)arrayList2.get((int)n10)).a.a().a(1, (float)(-1 - n10)).a());
        }
        return arrayList;
    }
}


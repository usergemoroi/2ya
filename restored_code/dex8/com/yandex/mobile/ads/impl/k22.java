/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.q32
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.q32;
import com.yandex.mobile.ads.impl.wu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class k22
implements q32 {
    private final List<List<wu>> b;
    private final List<Long> c;

    public k22(ArrayList arrayList, ArrayList arrayList2) {
        this.b = arrayList;
        this.c = arrayList2;
    }

    public final int a() {
        return this.c.size();
    }

    public final int a(long l10) {
        List<Long> list = this.c;
        Long l11 = l10;
        int n10 = m92.a;
        n10 = Collections.binarySearch(list, l11);
        if (n10 < 0) {
            n10 ^= 0xFFFFFFFF;
        } else {
            int n13 = list.size();
            while (++n10 < n13 && ((Comparable)list.get(n10)).compareTo(l11) == 0) {
            }
        }
        if (n10 >= this.c.size()) {
            n10 = -1;
        }
        return n10;
    }

    public final long a(int n10) {
        if (n10 >= 0) {
            if (n10 < this.c.size()) {
                return this.c.get(n10);
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public final List<wu> b(long l10) {
        int n10 = m92.a(this.c, (Long)l10, (boolean)false);
        if (n10 == -1) {
            return Collections.emptyList();
        }
        return this.b.get(n10);
    }
}


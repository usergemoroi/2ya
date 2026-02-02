/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.dq0$a
 *  com.yandex.mobile.ads.impl.eq0
 *  com.yandex.mobile.ads.impl.l32
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.dq0;
import com.yandex.mobile.ads.impl.eq0;
import com.yandex.mobile.ads.impl.l32;
import java.util.AbstractCollection;
import java.util.Collections;
import java.util.List;

public final class dq0
extends eq0 {
    public static int a(long l10) {
        int n10 = (int)l10;
        boolean bl2 = (long)n10 == l10;
        if (bl2) {
            return n10;
        }
        throw new IllegalArgumentException(l32.a((String)"Out of range: %s", (Object[])new Object[]{l10}));
    }

    public static List<Integer> a(int ... nArray) {
        if (nArray.length == 0) {
            return Collections.emptyList();
        }
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    public static int[] a(AbstractCollection object) {
        if (object instanceof a) {
            return (object).b();
        }
        Object[] objectArray = object.toArray();
        int n10 = objectArray.length;
        object = new int[n10];
        for (int i14 = 0; i14 < n10; ++i14) {
            Object object2 = objectArray[i14];
            object2.getClass();
            object[i14] = ((Number)object2).intValue();
        }
        return object;
    }

    public static int b(long l10) {
        if (l10 > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (l10 < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int)l10;
    }
}


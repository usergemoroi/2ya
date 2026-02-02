/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.CallSuper
 *  com.yandex.mobile.ads.impl.b70$a
 *  com.yandex.mobile.ads.impl.b70$b
 *  com.yandex.mobile.ads.impl.fi
 *  com.yandex.mobile.ads.impl.oa$a
 *  com.yandex.mobile.ads.impl.w31
 *  com.yandex.mobile.ads.impl.xo
 *  com.yandex.mobile.ads.impl.zs0
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.CallSuper;
import com.yandex.mobile.ads.impl.b62;
import com.yandex.mobile.ads.impl.b70;
import com.yandex.mobile.ads.impl.ek;
import com.yandex.mobile.ads.impl.fi;
import com.yandex.mobile.ads.impl.mb0;
import com.yandex.mobile.ads.impl.oa;
import com.yandex.mobile.ads.impl.ur0;
import com.yandex.mobile.ads.impl.vj0;
import com.yandex.mobile.ads.impl.w31;
import com.yandex.mobile.ads.impl.xj0;
import com.yandex.mobile.ads.impl.xo;
import com.yandex.mobile.ads.impl.zs0;
import java.util.ArrayList;
import java.util.Arrays;

public final class oa
extends ek {
    private final fi f;
    private final xo g;

    protected oa(b62 b622, int[] nArray, int n10, fi fi3, long l10, long l11, xj0 xj02, xo xo3) {
        super(b622, nArray);
        if (l11 < l10) {
            zs0.d((String)"AdaptiveTrackSelection", (String)"Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
        }
        this.f = fi3;
        xj0.a(xj02);
        this.g = xo3;
    }

    private static xj0<xj0<a>> a(b70.a[] object) {
        Object object2;
        int n10;
        Object object3;
        Object object4;
        int n13;
        ArrayList<b70.a> arrayList = new ArrayList<b70.a>();
        for (n13 = 0; n13 < ((b70.a[])object).length; ++n13) {
            object4 = object[n13];
            if (object4 != null && object4.b.length > 1) {
                object4 = xj0.g();
                ((vj0.a)((Object)object4)).b(new /* Unavailable Anonymous Inner Class!! */);
                arrayList.add(object4);
                continue;
            }
            arrayList.add(null);
        }
        Object object5 = ((b70.a[])object).length;
        long[][] lArrayArray = new long[object5][];
        for (n13 = 0; n13 < ((b70.a[])object).length; ++n13) {
            object3 = object[n13];
            if (object3 == null) {
                lArrayArray[n13] = new long[0];
                continue;
            }
            lArrayArray[n13] = new long[object3.b.length];
            for (n10 = 0; n10 < (object4 = (Object)object3.b).length; ++n10) {
                lArrayArray[n13][n10] = object3.a.a((int)object4[n10]).i;
            }
            Arrays.sort(lArrayArray[n13]);
        }
        object4 = new int[object5];
        long[] lArray = new long[object5];
        for (n13 = 0; n13 < object5; ++n13) {
            object3 = lArrayArray[n13];
            object2 = (object3).length == 0 ? 0L : (Object)object3[0];
            lArray[n13] = object2;
        }
        oa.a(arrayList, lArray);
        ur0 ur02 = w31.a().a().b();
        block4: for (n13 = 0; n13 < object5; ++n13) {
            double d14;
            object3 = lArrayArray[n13];
            if ((object3).length <= 1) continue;
            int n14 = ((Object)object3).length;
            double[] dArray = new double[n14];
            n10 = 0;
            while (true) {
                object3 = lArrayArray[n13];
                int n15 = (object3).length;
                d14 = 0.0;
                if (n10 >= n15) break;
                object2 = object3[n10];
                if (object2 != -1L) {
                    d14 = Math.log(object2);
                }
                dArray[n10] = d14;
                ++n10;
            }
            object3 = object4;
            double d15 = dArray[--n14] - dArray[0];
            n10 = 0;
            while (true) {
                object4 = object3;
                if (n10 >= n14) continue block4;
                d14 = dArray[n10];
                double d16 = dArray[++n10];
                d14 = d15 == 0.0 ? 1.0 : ((d14 + d16) * 0.5 - dArray[0]) / d15;
                ur02.put(d14, n13);
            }
        }
        object3 = xj0.a(ur02.values());
        for (n13 = 0; n13 < object3.size(); ++n13) {
            n10 = (Integer)object3.get(n13);
            object5 = object4[n10] + true;
            object4[n10] = object5;
            lArray[n10] = lArrayArray[n10][object5];
            oa.a(arrayList, lArray);
        }
        for (n13 = 0; n13 < ((b70.a[])object).length; ++n13) {
            if (arrayList.get(n13) == null) continue;
            lArray[n13] = lArray[n13] * 2L;
        }
        oa.a(arrayList, lArray);
        object4 = xj0.g();
        for (n13 = 0; n13 < arrayList.size(); ++n13) {
            object = (xj0.a)((Object)arrayList.get(n13));
            object = object == null ? xj0.h() : object.a();
            ((vj0.a)((Object)object4)).b(object);
        }
        return ((xj0.a)((Object)object4)).a();
    }

    private static void a(ArrayList arrayList, long[] lArray) {
        long l10 = 0L;
        int n10 = 0;
        int n13 = 0;
        while (true) {
            if (n13 >= lArray.length) break;
            l10 += lArray[n13];
            ++n13;
        }
        for (int i14 = n10; i14 < arrayList.size(); ++i14) {
            xj0.a a14 = (xj0.a)((Object)arrayList.get(i14));
            if (a14 == null) continue;
            a14.b(new /* Unavailable Anonymous Inner Class!! */);
        }
    }

    @Override
    public final void a(float f11) {
    }

    @Override
    @CallSuper
    public final void c() {
    }

    @Override
    @CallSuper
    public final void d() {
    }

    public static final class b
    implements b70.b {
        public b(int n10) {
            this(null);
        }

        public b(Object object) {
        }

        public final b70[] a(b70.a[] aArray, fi fi3) {
            xj0 xj02 = oa.a(aArray);
            b70[] b70Array = new b70[aArray.length];
            for (int i14 = 0; i14 < aArray.length; ++i14) {
                b62 b622;
                Object object;
                Object object2 = aArray[i14];
                if (object2 == null || ((int[])(object = object2.b)).length == 0) continue;
                if (((int[])object).length == 1) {
                    b622 = object2.a;
                    object = new mb0(object[0], object2.c, b622);
                } else {
                    b622 = object2.a;
                    int n10 = object2.c;
                    object2 = (xj0)xj02.get(i14);
                    object = new oa(b622, (int[])object, n10, fi3, 10000, 25000, (xj0)object2, xo.a);
                }
                b70Array[i14] = object;
            }
            return b70Array;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.dp1
 *  com.yandex.mobile.ads.impl.ep1
 *  com.yandex.mobile.ads.impl.i62
 *  com.yandex.mobile.ads.impl.l62
 *  com.yandex.mobile.ads.impl.m62
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.yt0$a
 */
package com.yandex.mobile.ads.impl;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.b62;
import com.yandex.mobile.ads.impl.b70;
import com.yandex.mobile.ads.impl.c62;
import com.yandex.mobile.ads.impl.ck;
import com.yandex.mobile.ads.impl.dp1;
import com.yandex.mobile.ads.impl.ep1;
import com.yandex.mobile.ads.impl.g60;
import com.yandex.mobile.ads.impl.i62;
import com.yandex.mobile.ads.impl.i72;
import com.yandex.mobile.ads.impl.l52;
import com.yandex.mobile.ads.impl.l62;
import com.yandex.mobile.ads.impl.m62;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.qw0;
import com.yandex.mobile.ads.impl.vj0;
import com.yandex.mobile.ads.impl.xj0;
import com.yandex.mobile.ads.impl.yt0;
import java.util.Arrays;
import java.util.List;

/*
 * Exception performing whole class analysis ignored.
 */
public abstract class yt0
extends l62 {
    protected abstract Pair<ep1[], b70[]> a(a var1, int[][][] var2, int[] var3, qw0.b var4, l52 var5) throws g60;

    public final m62 a(dp1[] object, c62 object2, qw0.b pair, l52 objectArray) throws g60 {
        Object object3;
        Object[] objectArray2;
        int n10;
        int n13;
        int n14;
        Object object4 = new int[((dp1[])object).length + 1];
        int n15 = ((dp1[])object).length + 1;
        Object object5 = new b62[n15][];
        Object object6 = new int[((dp1[])object).length + 1][][];
        for (n14 = 0; n14 < n15; ++n14) {
            n13 = ((c62)object2).b;
            object5[n14] = new b62[n13];
            object6[n14] = new int[n13][];
        }
        n15 = ((dp1[])object).length;
        Object object7 = new int[n15];
        for (n14 = 0; n14 < n15; ++n14) {
            object7[n14] = object[n14].f();
        }
        for (n10 = 0; n10 < ((c62)object2).b; ++n10) {
            objectArray2 = ((c62)object2).a(n10);
            boolean bl2 = objectArray2.d == 5;
            int n16 = ((dp1[])object).length;
            int n17 = 1;
            int n18 = 0;
            for (n14 = 0; n14 < ((dp1[])object).length; ++n14) {
                int n19;
                int n23;
                int n24;
                block20: {
                    block19: {
                        object3 = object[n14];
                        n15 = 0;
                        for (n13 = 0; n13 < objectArray2.b; ++n13) {
                            n15 = Math.max(n15, object3.a(objectArray2.a(n13)) & 7);
                        }
                        n13 = object4[n14] == 0 ? 1 : 0;
                        if (n15 > n18) break block19;
                        n24 = n16;
                        n23 = n18;
                        n19 = n17;
                        if (n15 != n18) break block20;
                        n24 = n16;
                        n23 = n18;
                        n19 = n17;
                        if (!bl2) break block20;
                        n24 = n16;
                        n23 = n18;
                        n19 = n17;
                        if (n17 != 0) break block20;
                        n24 = n16;
                        n23 = n18;
                        n19 = n17;
                        if (n13 == 0) break block20;
                    }
                    n24 = n14;
                    n19 = n13;
                    n23 = n15;
                }
                n16 = n24;
                n18 = n23;
                n17 = n19;
            }
            if (n16 == ((dp1[])object).length) {
                object3 = new int[objectArray2.b];
            } else {
                dp1 dp12 = object[n16];
                object3 = new int[objectArray2.b];
                for (n14 = 0; n14 < objectArray2.b; ++n14) {
                    object3[n14] = (dp1)dp12.a(objectArray2.a(n14));
                }
            }
            n14 = object4[n16];
            object5[n16][n14] = objectArray2;
            object6[n16][n14] = (int[])object3;
            object4[n16] = n14 + 1;
        }
        objectArray2 = new c62[((dp1[])object).length];
        object3 = new String[((dp1[])object).length];
        object2 = new int[((dp1[])object).length];
        for (n14 = 0; n14 < ((dp1[])object).length; ++n14) {
            n15 = object4[n14];
            objectArray2[n14] = new c62((b62[])m92.a((int)n15, (Object[])object5[n14]));
            object6[n14] = (int[][])m92.a((int)n15, (Object[])object6[n14]);
            object3[n14] = object[n14].getName();
            object2[n14] = ((ck)object[n14]).m();
        }
        object2 = new /* Unavailable Anonymous Inner Class!! */;
        pair = this.a(object2, (int[][][])object6, (int[])object7, (qw0.b)pair, (l52)objectArray);
        object3 = (i62[])pair.second;
        objectArray = new List[((i62[])object3).length];
        for (n14 = 0; n14 < ((i62[])object3).length; ++n14) {
            object = object3[n14];
            object = object != null ? xj0.a(object) : xj0.h();
            objectArray[n14] = object;
        }
        object = new xj0.a();
        for (n14 = 0; n14 < a.a(object2); ++n14) {
            object6 = a.b(object2)[n14];
            object4 = objectArray[n14];
            for (n15 = 0; n15 < ((c62)object6).b; ++n15) {
                object5 = ((c62)object6).a(n15);
                boolean bl3 = object2.a(n14, n15) != 0;
                n13 = object5.b;
                objectArray2 = new int[n13];
                object7 = new boolean[n13];
                for (n13 = 0; n13 < object5.b; ++n13) {
                    int n25;
                    block18: {
                        objectArray2[n13] = (c62)object2.a(n14, n15, n13);
                        for (n10 = 0; n10 < object4.size(); ++n10) {
                            object3 = (i62)object4.get(n10);
                            if (!object3.a().equals(object5) || object3.c(n13) == -1) continue;
                            n25 = 1;
                            break block18;
                        }
                        n25 = 0;
                    }
                    object7[n13] = n25;
                }
                ((vj0.a)((Object)object)).b(new i72.a((b62)object5, bl3, (int[])objectArray2, (boolean[])object7));
            }
        }
        object3 = a.c(object2);
        for (n14 = 0; n14 < ((c62)object3).b; ++n14) {
            object7 = ((c62)object3).a(n14);
            objectArray = new int[object7.b];
            Arrays.fill((int[])objectArray, 0);
            ((vj0.a)((Object)object)).b(new i72.a((b62)object7, false, (int[])objectArray, new boolean[object7.b]));
        }
        object = new i72(((xj0.a)((Object)object)).a());
        return new m62((ep1[])pair.first, (b70[])pair.second, (i72)object, object2);
    }

    public final void a(@Nullable Object object) {
        object = object;
    }
}


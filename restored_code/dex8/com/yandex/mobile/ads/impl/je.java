/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.ag1
 *  com.yandex.mobile.ads.impl.k01
 *  com.yandex.mobile.ads.impl.vn
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ag1;
import com.yandex.mobile.ads.impl.ie;
import com.yandex.mobile.ads.impl.k01;
import com.yandex.mobile.ads.impl.n01;
import com.yandex.mobile.ads.impl.uy1;
import com.yandex.mobile.ads.impl.vn;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public final class je
extends uy1 {
    @Override
    @Nullable
    protected final k01 a(n01 object, ByteBuffer object2) {
        int n10 = ((ByteBuffer)object2).get();
        Object var12_4 = null;
        object = var12_4;
        if (n10 == 116) {
            object = ((ByteBuffer)object2).array();
            ag1 ag12 = new ag1(((Buffer)object2).limit(), (byte[])object);
            ag12.d(12);
            int n13 = ag12.b(12);
            int n14 = ag12.d();
            ag12.d(44);
            ag12.e(ag12.b(12));
            ag12.d(16);
            ArrayList<ie> arrayList = new ArrayList<ie>();
            while (ag12.d() < n14 + n13 - 4) {
                ag12.d(48);
                int n15 = ag12.b(8);
                ag12.d(4);
                n10 = ag12.b(12);
                int n16 = ag12.d() + n10;
                object = null;
                object2 = null;
                while (ag12.d() < n16) {
                    Object object3;
                    Object object4;
                    int n17 = ag12.b(8);
                    n10 = ag12.b(8);
                    int n18 = ag12.d() + n10;
                    if (n17 == 2) {
                        n10 = ag12.b(16);
                        ag12.d(8);
                        object4 = object;
                        object3 = object2;
                        if (n10 == 3) {
                            block2: while (true) {
                                object4 = object;
                                object3 = object2;
                                if (ag12.d() < n18) {
                                    object3 = ag12.a(ag12.b(8), vn.a);
                                    n17 = ag12.b(8);
                                    n10 = 0;
                                    while (true) {
                                        object = object3;
                                        if (n10 >= n17) continue block2;
                                        ag12.e(ag12.b(8));
                                        ++n10;
                                    }
                                }
                                break;
                            }
                        }
                    } else {
                        object4 = object;
                        object3 = object2;
                        if (n17 == 21) {
                            object3 = ag12.a(n10, vn.a);
                            object4 = object;
                        }
                    }
                    ag12.c(n18 * 8);
                    object = object4;
                    object2 = object3;
                }
                ag12.c(n16 * 8);
                if (object == null || object2 == null) continue;
                arrayList.add(new ie(n15, ((String)object).concat((String)object2)));
            }
            object = arrayList.isEmpty() ? var12_4 : new k01(arrayList);
        }
        return object;
    }
}


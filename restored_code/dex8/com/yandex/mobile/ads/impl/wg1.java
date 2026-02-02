/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.q32
 *  com.yandex.mobile.ads.impl.wg1$a
 */
package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.q32;
import com.yandex.mobile.ads.impl.s32;
import com.yandex.mobile.ads.impl.wg1;
import com.yandex.mobile.ads.impl.wu;
import com.yandex.mobile.ads.impl.wy1;
import com.yandex.mobile.ads.impl.xg1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;

/*
 * Exception performing whole class analysis ignored.
 */
public final class wg1
extends wy1 {
    private final bg1 m = new bg1();
    private final bg1 n = new bg1();
    private final a o = new /* Unavailable Anonymous Inner Class!! */;
    @Nullable
    private Inflater p;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    protected final q32 a(byte[] object, int n10, boolean bl2) throws s32 {
        int n13;
        this.m.a(n13, object);
        bg1 bg12 = this.m;
        if (bg12.a() > 0 && bg12.g() == 120) {
            if (this.p == null) {
                this.p = new Inflater();
            }
            if (m92.a((bg1)bg12, (bg1)this.n, (Inflater)this.p)) {
                byte[] byArray = this.n.c();
                bg12.a(this.n.e(), byArray);
            }
        }
        a a14 = this.o;
        n13 = 0;
        a.k(a14, (int)0);
        a.l(a14, (int)0);
        a.m(a14, (int)0);
        a.n(a14, (int)0);
        a.o(a14, (int)0);
        a.p(a14, (int)0);
        a.a(a14).c(0);
        a.j(a14, (boolean)false);
        ArrayList<void> arrayList = new ArrayList<void>();
        while (this.m.a() >= 3) {
            void var18_21;
            bg1 bg13 = this.m;
            a a15 = this.o;
            int n14 = bg13.e();
            int n15 = bg13.t();
            int n16 = bg13.z();
            int n17 = bg13.d() + n16;
            if (n17 > n14) {
                bg13.e(n14);
                Object var18_11 = null;
                n15 = n13;
            } else {
                if (n15 != 128) {
                    switch (n15) {
                        case 22: {
                            a15.getClass();
                            if (n16 < 19) break;
                            a.k(a15, (int)bg13.z());
                            a.l(a15, (int)bg13.z());
                            bg13.f(11);
                            a.m(a15, (int)bg13.z());
                            a.n(a15, (int)bg13.z());
                            break;
                        }
                        case 21: {
                            a15.getClass();
                            if (n16 < 4) break;
                            bg13.f(3);
                            n15 = (bg13.t() & 0x80) != 0 ? 1 : n13;
                            n13 = n14 = n16 - 4;
                            if (n15 != 0) {
                                if (n14 < 7 || (n13 = bg13.w()) < 4) break;
                                a.o(a15, (int)bg13.z());
                                a.p(a15, (int)bg13.z());
                                a.a(a15).c(n13 - 4);
                                n13 = n16 - 11;
                            }
                            if ((n15 = a.a(a15).d()) < (n14 = a.a(a15).e()) && n13 > 0) {
                                n13 = Math.min(n13, n14 - n15);
                                bg13.a(a.a(a15).c(), n15, n13);
                                a.a(a15).e(n15 + n13);
                                break;
                            }
                        }
                        default: {
                            break;
                        }
                        case 20: {
                            a15.getClass();
                            if (n16 % 5 != 2) break;
                            bg13.f(2);
                            Arrays.fill(a.b(a15), n13);
                            n15 = n16 / 5;
                            while (n13 < n15) {
                                n16 = bg13.t();
                                int n18 = bg13.t();
                                int n19 = bg13.t();
                                int n23 = bg13.t();
                                n14 = bg13.t();
                                double d14 = n18;
                                double d15 = n19 - 128;
                                n18 = (int)(1.402 * d15 + d14);
                                double d16 = n23 - 128;
                                n19 = (int)(d14 - 0.34414 * d16 - d15 * 0.71414);
                                int n24 = (int)(d16 * 1.772 + d14);
                                int[] nArray = a.b(a15);
                                n23 = m92.a;
                                nArray[n16] = Math.max(0, Math.min(n18, 255)) << 16 | n14 << 24 | Math.max(0, Math.min(n19, 255)) << 8 | Math.max(0, Math.min(n24, 255));
                                ++n13;
                            }
                            a.j(a15, (boolean)true);
                        }
                    }
                    Object var18_14 = null;
                } else {
                    if (a.d(a15) == 0 || a.e(a15) == 0 || a.h(a15) == 0 || a.i(a15) == 0 || a.a(a15).e() == 0 || a.a(a15).d() != a.a(a15).e() || !a.c(a15)) {
                        Object var18_18 = null;
                    } else {
                        a.a(a15).e(0);
                        n16 = a.h(a15) * a.i(a15);
                        int[] nArray = new int[n16];
                        n13 = 0;
                        while (n13 < n16) {
                            n14 = a.a(a15).t();
                            if (n14 != 0) {
                                n15 = n13 + 1;
                                nArray[n13] = a.b(a15)[n14];
                                n13 = n15;
                                continue;
                            }
                            n14 = a.a(a15).t();
                            if (n14 == 0) continue;
                            n15 = (n14 & 0x40) == 0 ? n14 & 0x3F : (n14 & 0x3F) << 8 | a.a(a15).t();
                            n14 = (n14 & 0x80) == 0 ? 0 : a.b(a15)[a.a(a15).t()];
                            Arrays.fill(nArray, n13, n15 += n13, n14);
                            n13 = n15;
                        }
                        Bitmap bitmap = Bitmap.createBitmap((int[])nArray, (int)a.h(a15), (int)a.i(a15), (Bitmap.Config)Bitmap.Config.ARGB_8888);
                        wu wu3 = new /* Unavailable Anonymous Inner Class!! */.a(bitmap).b((float)a.f(a15) / (float)a.d(a15)).b(0).a(0, (float)a.g(a15) / (float)a.e(a15)).a(0).d((float)a.h(a15) / (float)a.d(a15)).a((float)a.i(a15) / (float)a.e(a15)).a();
                    }
                    a.k(a15, (int)0);
                    a.l(a15, (int)0);
                    a.m(a15, (int)0);
                    a.n(a15, (int)0);
                    a.o(a15, (int)0);
                    a.p(a15, (int)0);
                    a.a(a15).c(0);
                    a.j(a15, (boolean)false);
                }
                n15 = 0;
                bg13.e(n17);
            }
            n13 = n15;
            if (var18_21 == null) continue;
            arrayList.add(var18_21);
            n13 = n15;
        }
        return new xg1(Collections.unmodifiableList(arrayList));
    }
}


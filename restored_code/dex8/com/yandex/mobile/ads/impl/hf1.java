/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.b32
 *  com.yandex.mobile.ads.impl.b32$a
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.fg1
 *  com.yandex.mobile.ads.impl.if1
 *  com.yandex.mobile.ads.impl.rj2
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.b32;
import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.fg1;
import com.yandex.mobile.ads.impl.if1;
import com.yandex.mobile.ads.impl.rj2;
import com.yandex.mobile.ads.impl.xj0;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

final class hf1
extends b32 {
    private static final byte[] o = new byte[]{79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] p = new byte[]{79, 112, 117, 115, 84, 97, 103, 115};
    private boolean n;

    hf1() {
    }

    public static boolean b(bg1 bg12) {
        byte[] byArray = o;
        int n10 = bg12.a();
        boolean bl2 = false;
        if (n10 >= 8) {
            n10 = bg12.d();
            byte[] byArray2 = new byte[8];
            bg12.a(byArray2, 0, 8);
            bg12.e(n10);
            bl2 = Arrays.equals(byArray2, byArray);
        }
        return bl2;
    }

    protected final long a(bg1 object) {
        int n10;
        int n13;
        Object object2 = (object = (Object)object.c())[0];
        int n14 = object2 & 3;
        if (n14 != 0) {
            n10 = n13 = 2;
            if (n14 != 1) {
                n10 = n13;
                if (n14 != 2) {
                    n10 = object[1] & 0x3F;
                }
            }
        } else {
            n10 = 1;
        }
        object2 = (object2 & 0xFF) >> 3;
        n13 = object2 & 3;
        n13 = object2 >= 16 ? 2500 << n13 : (object2 >= 12 ? 10000 << (object2 & 1) : (n13 == 3 ? 60000 : 10000 << n13));
        return this.b((long)n10 * (long)n13);
    }

    protected final void a(boolean bl2) {
        super.a(bl2);
        if (bl2) {
            this.n = false;
        }
    }

    @EnsuresNonNullIf(expression={"#3.format"}, result=false)
    protected final boolean a(bg1 object, long l10, b32.a a13) throws fg1 {
        byte[] byArray;
        Object object2;
        byte[] byArray2 = o;
        if (object.a() >= 8) {
            object2 = object.d();
            byArray = new byte[8];
            object.a(byArray, 0, 8);
            object.e(object2);
            if (Arrays.equals(byArray, byArray2)) {
                object = Arrays.copyOf(object.c(), object.e());
                object2 = object[9];
                object = if1.a((byte[])object);
                if (a13.a != null) {
                    return true;
                }
                a13.a = new /* Unavailable Anonymous Inner Class!! */.e("audio/opus").c(object2 & 0xFF).l(48000).a((List)object).a();
                return true;
            }
        }
        byArray2 = p;
        if (object.a() >= 8) {
            object2 = object.d();
            byArray = new byte[8];
            object.a(byArray, 0, 8);
            object.e(object2);
            if (Arrays.equals(byArray, byArray2)) {
                if (a13.a != null) {
                    if (this.n) {
                        return true;
                    }
                    this.n = true;
                    object.f(8);
                    object = rj2.a(xj0.b(rj2.a((bg1)object, (boolean)false, (boolean)false).a));
                    if (object == null) {
                        return true;
                    }
                    a13.a = a13.a.a().a(object.a(a13.a.k)).a();
                    return true;
                }
                throw new IllegalStateException();
            }
        }
        if (a13.a != null) {
            return false;
        }
        throw new IllegalStateException();
    }
}


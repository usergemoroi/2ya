/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 *  com.yandex.mobile.ads.impl.ky1
 */
package com.yandex.mobile.ads.impl;

import android.util.Pair;
import com.yandex.mobile.ads.impl.ky1;
import com.yandex.mobile.ads.impl.l52;

public abstract class d
extends l52 {
    private final int c;
    private final ky1 d;
    private final boolean e;

    public d(ky1 ky12) {
        this.e = false;
        this.d = ky12;
        this.c = ky12.b();
    }

    public static Object a(Object object, Object object2) {
        return Pair.create((Object)object, (Object)object2);
    }

    public static Object c(Object object) {
        return ((Pair)object).second;
    }

    public static Object d(Object object) {
        return ((Pair)object).first;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final int a(int var1_1, int var2_2, boolean var3_3) {
        block9: {
            block8: {
                var8_4 = this.e;
                var6_5 = 0;
                var4_6 = var2_2;
                if (var8_4) {
                    var4_6 = var2_2;
                    if (var2_2 == 1) {
                        var4_6 = 2;
                    }
                    var3_3 = false;
                }
                var5_7 = this.c(var1_1);
                var7_8 = this.f(var5_7);
                var9_9 = this.g(var5_7);
                var1_1 = var9_9.a(var1_1 - var7_8, var2_2 = var4_6 == 2 ? var6_5 : var4_6, var3_3);
                if (var1_1 != -1) {
                    return var7_8 + var1_1;
                }
                if (!var3_3) break block8;
                var1_1 = this.d.a(var5_7);

            }
            var2_2 = var4_6;
            var8_4 = var3_3;
            if (var5_7 >= this.c - 1) break block9;
            var1_1 = var5_7;

        }
        block0: while (true) {
            var1_1 = -1;
            var3_3 = var8_4;
            var4_6 = var2_2;
            while (var1_1 != -1 && this.g(var1_1).c()) {
                if (var3_3) {
                    var1_1 = this.d.a(var1_1);
                    continue;
                }
                var2_2 = var4_6;
                var8_4 = var3_3;
                if (var1_1 >= this.c - 1) continue block0;
lbl36:

                ++var1_1;
            }
            break;
        }
        if (var1_1 != -1) {
            var2_2 = this.f(var1_1);
            return this.g(var1_1).a(var3_3) + var2_2;
        }
        if (var4_6 == 2) {
            return this.a(var3_3);
        }
        return -1;
    }

    @Override
    public final int a(Object object) {
        boolean bl2 = object instanceof Pair;
        int n10 = -1;
        if (!bl2) {
            return -1;
        }
        Object object2 = (Pair)object;
        object = object2.first;
        object2 = object2.second;
        int n12 = this.b(object);
        if (n12 == -1) {
            return -1;
        }
        int n13 = this.g(n12).a(object2);
        if (n13 != -1) {
            n10 = this.e(n12) + n13;
        }
        return n10;
    }

    @Override
    public final int a(boolean bl2) {
        int n10;
        if (this.c == 0) {
            return -1;
        }
        boolean bl3 = this.e;
        int n12 = 0;
        if (bl3) {
            bl2 = false;
        }
        if (bl2) {
            n12 = this.d.a();
        }
        while (this.g(n12).c()) {
            n10 = bl2 ? this.d.a(n12) : (n12 < this.c - 1 ? n12 + 1 : -1);
            n12 = n10;
            if (n10 != -1) continue;
            return -1;
        }
        n10 = this.f(n12);
        return this.g(n12).a(bl2) + n10;
    }

    @Override
    public final l52.b a(int n10, l52.b b10, boolean bl2) {
        int n12 = this.b(n10);
        int n13 = this.f(n12);
        int n14 = this.e(n12);
        this.g(n12).a(n10 - n14, b10, bl2);
        b10.d += n13;
        if (bl2) {
            Object object = this.d(n12);
            Object object2 = b10.c;
            object2.getClass();
            b10.c = Pair.create((Object)object, (Object)object2);
        }
        return b10;
    }

    @Override
    public final l52.b a(Object object, l52.b b10) {
        Object object2 = (Pair)object;
        Object object3 = object2.first;
        object2 = object2.second;
        int n10 = this.b(object3);
        int n12 = this.f(n10);
        this.g(n10).a(object2, b10);
        b10.d += n12;
        b10.c = object;
        return b10;
    }

    @Override
    public final l52.d a(int n10, l52.d d10, long l10) {
        int n12 = this.c(n10);
        int n13 = this.f(n12);
        int n14 = this.e(n12);
        this.g(n12).a(n10 - n13, d10, l10);
        Object object = this.d(n12);
        if (!l52.d.s.equals(d10.b)) {
            object = Pair.create((Object)object, (Object)d10.b);
        }
        d10.b = object;
        d10.p += n14;
        d10.q += n14;
        return d10;
    }

    @Override
    public final Object a(int n10) {
        int n12 = this.b(n10);
        int n13 = this.e(n12);
        Object object = this.g(n12).a(n10 - n13);
        return Pair.create((Object)this.d(n12), (Object)object);
    }

    protected abstract int b(int var1);

    /*
     * Unable to fully structure code
     */
    @Override
    public final int b(int var1_1, int var2_2, boolean var3_3) {
        block9: {
            block8: {
                var8_4 = this.e;
                var6_5 = 0;
                var4_6 = var2_2;
                if (var8_4) {
                    var4_6 = var2_2;
                    if (var2_2 == 1) {
                        var4_6 = 2;
                    }
                    var3_3 = false;
                }
                var5_7 = this.c(var1_1);
                var7_8 = this.f(var5_7);
                var9_9 = this.g(var5_7);
                var1_1 = var9_9.b(var1_1 - var7_8, var2_2 = var4_6 == 2 ? var6_5 : var4_6, var3_3);
                if (var1_1 != -1) {
                    return var7_8 + var1_1;
                }
                if (!var3_3) break block8;
                var1_1 = this.d.d(var5_7);

            }
            var2_2 = var4_6;
            var8_4 = var3_3;
            if (var5_7 <= 0) break block9;
            var1_1 = var5_7;

        }
        block0: while (true) {
            var1_1 = -1;
            var3_3 = var8_4;
            var4_6 = var2_2;
            while (var1_1 != -1 && this.g(var1_1).c()) {
                if (var3_3) {
                    var1_1 = this.d.d(var1_1);
                    continue;
                }
                var2_2 = var4_6;
                var8_4 = var3_3;
                if (var1_1 <= 0) continue block0;
lbl36:

                --var1_1;
            }
            break;
        }
        if (var1_1 != -1) {
            var2_2 = this.f(var1_1);
            return this.g(var1_1).b(var3_3) + var2_2;
        }
        if (var4_6 == 2) {
            return this.b(var3_3);
        }
        return -1;
    }

    protected abstract int b(Object var1);

    @Override
    public final int b(boolean bl2) {
        int n10 = this.c;
        if (n10 == 0) {
            return -1;
        }
        if (this.e) {
            bl2 = false;
        }
        int n12 = bl2 ? this.d.c() : n10 - 1;
        while (this.g(n12).c()) {
            n10 = bl2 ? this.d.d(n12) : (n12 > 0 ? n12 - 1 : -1);
            n12 = n10;
            if (n10 != -1) continue;
            return -1;
        }
        n10 = this.f(n12);
        return this.g(n12).b(bl2) + n10;
    }

    protected abstract int c(int var1);

    protected abstract Object d(int var1);

    protected abstract int e(int var1);

    protected abstract int f(int var1);

    protected abstract l52 g(int var1);
}


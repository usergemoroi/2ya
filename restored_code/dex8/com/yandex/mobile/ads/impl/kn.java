/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.kn$a
 *  com.yandex.mobile.ads.impl.kn$a$a
 *  com.yandex.mobile.ads.impl.q32
 *  com.yandex.mobile.ads.impl.zs0
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.kn;
import com.yandex.mobile.ads.impl.mn;
import com.yandex.mobile.ads.impl.nn;
import com.yandex.mobile.ads.impl.q32;
import com.yandex.mobile.ads.impl.s32;
import com.yandex.mobile.ads.impl.u32;
import com.yandex.mobile.ads.impl.v32;
import com.yandex.mobile.ads.impl.wu;
import com.yandex.mobile.ads.impl.zs0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Exception performing whole class analysis ignored.
 */
public final class kn
extends mn {
    private static final int[] A;
    private static final int[] B;
    private static final int[] C;
    private static final int[] D;
    private static final int[] E;
    private static final boolean[] F;
    private static final int[] y;
    private static final int[] z;
    private final bg1 g = new bg1();
    private final int h;
    private final int i;
    private final int j;
    private final long k;
    private final ArrayList<a> l = new ArrayList();
    private a m = new /* Unavailable Anonymous Inner Class!! */;
    @Nullable
    private List<wu> n;
    @Nullable
    private List<wu> o;
    private int p;
    private int q;
    private boolean r;
    private boolean s;
    private byte t;
    private byte u;
    private int v = 0;
    private boolean w;
    private long x;

    static {
        y = new int[]{11, 1, 3, 12, 14, 5, 7, 9};
        z = new int[]{0, 4, 8, 12, 16, 20, 24, 28};
        A = new int[]{-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
        B = new int[]{32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
        C = new int[]{174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
        D = new int[]{193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
        E = new int[]{195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
        F = new boolean[]{false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    }

    public kn(String string2, int n10) {
        this.k = 16000000L;
        int n13 = "application/x-mp4-cea-608".equals(string2) ? 2 : 3;
        this.h = n13;
        if (n10 != 1) {
            if (n10 != 2) {
                if (n10 != 3) {
                    if (n10 != 4) {
                        zs0.d((String)"Cea608Decoder", (String)"Invalid channel. Defaulting to CC1.");
                        this.j = 0;
                        this.i = 0;
                    } else {
                        this.j = 1;
                        this.i = 1;
                    }
                } else {
                    this.j = 0;
                    this.i = 1;
                }
            } else {
                this.j = 1;
                this.i = 0;
            }
        } else {
            this.j = 0;
            this.i = 0;
        }
        this.a(0);
        this.j();
        this.w = true;
        this.x = -9223372036854775807L;
    }

    private void a(int n10) {
        int n13 = this.p;
        if (n13 == n10) {
            return;
        }
        this.p = n10;
        if (n10 == 3) {
            for (n13 = 0; n13 < this.l.size(); ++n13) {
                a.i(this.l.get(n13), (int)n10);
            }
            return;
        }
        this.j();
        if (n13 == 3 || n10 == 1 || n10 == 0) {
            this.n = Collections.emptyList();
        }
    }

    private ArrayList i() {
        wu wu3;
        int n10;
        int n13 = this.l.size();
        ArrayList<wu> arrayList = new ArrayList<wu>(n13);
        int n14 = 2;
        int n15 = 0;
        for (n10 = 0; n10 < n13; ++n10) {
            wu3 = this.l.get(n10).a(Integer.MIN_VALUE);
            arrayList.add(wu3);
            int n16 = n14;
            if (wu3 != null) {
                n16 = Math.min(n14, wu3.j);
            }
            n14 = n16;
        }
        ArrayList<wu> arrayList2 = new ArrayList<wu>(n13);
        for (n10 = n15; n10 < n13; ++n10) {
            wu wu4 = (wu)arrayList.get(n10);
            if (wu4 == null) continue;
            wu3 = wu4;
            if (wu4.j != n14) {
                wu3 = this.l.get(n10).a(n14);
                wu3.getClass();
            }
            arrayList2.add(wu3);
        }
        return arrayList2;
    }

    private void j() {
        this.m.b(this.p);
        this.l.clear();
        this.l.add(this.m);
    }

    static /* bridge */ /* synthetic */ int[] k() {
        return A;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    protected final void b(u32 var1_1) {
        var1_1 /* !! */  = var1_1 /* !! */ .d;
        var1_1 /* !! */ .getClass();
        var11_2 = this.g;
        var12_3 = var1_1 /* !! */ .array();
        var11_2.a(var1_1 /* !! */ .limit(), var12_3);
        var5_4 = 0;
        block18: while ((var6_8 = this.g.a()) >= (var7_9 = this.h)) {
            block39: {
                block45: {
                    block46: {
                        block44: {
                            block43: {
                                block42: {
                                    block41: {
                                        block40: {
                                            block38: {
                                                block37: {
                                                    var6_8 = var7_9 == 2 ? -4 : (int)((byte)this.g.t());
                                                    var8_10 = this.g.t();
                                                    var7_9 = this.g.t();
                                                    if ((var6_8 & 2) != 0 || (var6_8 & 1) != this.i) continue;
                                                    var3_6 = (byte)(var8_10 & 127);
                                                    var2_5 = (byte)(var7_9 & 127);
                                                    if (var3_6 == 0 && var2_5 == 0) continue;
                                                    var10_12 = this.r;
                                                    var9_11 = (var6_8 & 4) == 4 && (var1_1 /* !! */  = (u32)kn.F)[var8_10] != false && var1_1 /* !! */ [var7_9] != false;
                                                    this.r = var9_11;
                                                    if (var9_11 && (var3_6 & 240) == 16) {
                                                        if (this.s && this.t == var3_6 && this.u == var2_5) {
                                                            this.s = false;
                                                            continue;
                                                        }
                                                        this.s = true;
                                                        this.t = var3_6;
                                                        this.u = var2_5;
                                                    } else {
                                                        this.s = false;
                                                    }
                                                    if (!var9_11) {
                                                        if (!var10_12) continue;
                                                        this.j();
lbl31:

                                                        while (true) {
                                                            var5_4 = 1;
                                                            continue block18;
                                                            break;
                                                        }
                                                    }
                                                    if (1 > var3_6 || var3_6 > 15) break block37;
                                                    this.w = false;
                                                    break block38;
                                                }
                                                if ((var3_6 & 247) != 20) break block38;
                                                if (var2_5 == 32 || var2_5 == 47) ** GOTO lbl-1000
                                                block0 : switch (var2_5) {
                                                    default: {
                                                        switch (var2_5) {
                                                            default: {
                                                                break block0;
                                                            }
                                                            case 42: 
                                                            case 43: {
                                                                this.w = false;
                                                                break block0;
                                                            }
                                                            case 41: 
                                                        }
                                                    }
                                                    case 37: 
                                                    case 38: 
                                                    case 39: // 2 sources

                                                    {
                                                        this.w = true;
                                                    }
                                                }
                                            }
                                            if (!this.w) continue;
                                            var6_8 = var3_6 & 224;
                                            if (var6_8 == 0) {
                                                this.v = var3_6 >> 3 & 1;
                                            }
                                            if (this.v != this.j) continue;
                                            if (var6_8 != 0) break block39;
                                            var5_4 = var3_6 & 247;
                                            if (var5_4 != 17 || (var2_5 & 240) != 48) break block40;
                                            var1_1 /* !! */  = this.m;
                                            var4_7 = (char)kn.C[var2_5 & 15];
                                            if (a.c(var1_1 /* !! */ ).length() < 32) {
                                                a.c(var1_1 /* !! */ ).append(var4_7);
                                            }

                                        }
                                        var6_8 = var3_6 & 246;
                                        if (var6_8 != 18 || (var2_5 & 224) != 32) break block41;
                                        this.m.a();
                                        var1_1 /* !! */  = this.m;
                                        if ((var3_6 & 1) == 0) {
                                            var5_4 = kn.D[var2_5 & 31];
lbl73:

                                            while (true) {
                                                continue;
                                                break;
                                            }
                                        }
                                        var5_4 = kn.E[var2_5 & 31];

                                        var4_7 = (char)var5_4;
                                        if (a.c(var1_1 /* !! */ ).length() < 32) {
                                            a.c(var1_1 /* !! */ ).append(var4_7);
                                        }

                                    }
                                    if (var5_4 != 17 || (var2_5 & 240) != 32) break block42;
                                    var1_1 /* !! */  = this.m;
                                    if (a.c(var1_1 /* !! */ ).length() < 32) {
                                        a.c(var1_1 /* !! */ ).append(' ');
                                    }
                                    var9_11 = (var2_5 & 1) == 1;
                                    var1_1 /* !! */  = this.m;
                                    a.a(var1_1 /* !! */ ).add(new a(var2_5 >> 1 & 7, a.c(var1_1 /* !! */ ).length(), var9_11));

                                }
                                if ((var3_6 & 240) != 16 || (var2_5 & 192) != 64) break block43;
                                var5_4 = var6_8 = kn.y[var3_6 & 7];
                                if ((var2_5 & 32) != 0) {
                                    var5_4 = var6_8 + 1;
                                }
                                if (var5_4 != a.d(var1_1 /* !! */  = this.m)) {
                                    if (!(this.p == 1 || a.a(var1_1 /* !! */ ).isEmpty() && a.b(var1_1 /* !! */ ).isEmpty() && a.c(var1_1 /* !! */ ).length() == 0)) {
                                        var1_1 /* !! */  = new /* Unavailable Anonymous Inner Class!! */;
                                        this.m = var1_1 /* !! */ ;
                                        this.l.add(var1_1 /* !! */ );
                                    }
                                    a.f(this.m, (int)var5_4);
                                }
                                var5_4 = (var2_5 & 16) == 16 ? 1 : 0;
                                var9_11 = (var2_5 & 1) == 1;
                                var7_9 = var2_5 >> 1 & 7;
                                var1_1 /* !! */  = this.m;
                                var6_8 = var5_4 != 0 ? 8 : var7_9;
                                a.a(var1_1 /* !! */ ).add(new a(var6_8, a.c(var1_1 /* !! */ ).length(), var9_11));
                                if (var5_4 != 0) {
                                    a.g(this.m, (int)kn.z[var7_9]);
                                }

                            }
                            if (var5_4 != 23 || var2_5 < 33 || var2_5 > 35) break block44;
                            a.h(this.m, (int)(var2_5 - 32));

                        }
                        if (var6_8 != 20 || (var2_5 & 240) != 32) ** GOTO lbl31
                        if (var2_5 == 32) break block45;
                        if (var2_5 == 41) break block46;
                        switch (var2_5) {
                            default: {
                                var5_4 = this.p;
                                if (var5_4 == 0) ** GOTO lbl31
                                if (var2_5 == 33) ** GOTO lbl157
                                switch (var2_5) {
                                    default: {

                                    }
                                    case 47: {
                                        this.n = this.i();
                                        this.j();

                                    }
                                    case 46: {
                                        this.j();

                                    }
                                    case 45: {
                                        if (var5_4 != 1 || a.a(var1_1 /* !! */  = this.m).isEmpty() && a.b(var1_1 /* !! */ ).isEmpty() && a.c(var1_1 /* !! */ ).length() == 0) ** GOTO lbl31
                                        var1_1 /* !! */  = this.m;
                                        a.b(var1_1 /* !! */ ).add(a.k(var1_1 /* !! */ ));
                                        a.c(var1_1 /* !! */ ).setLength(0);
                                        a.a(var1_1 /* !! */ ).clear();
                                        var5_4 = Math.min(a.e(var1_1 /* !! */ ), a.d(var1_1 /* !! */ ));
                                        while (true) {
                                            if (a.b(var1_1 /* !! */ ).size() < var5_4) ** GOTO lbl31
                                            a.b(var1_1 /* !! */ ).remove(0);
                                        }
                                    }
                                    case 44: 
                                }
                                this.n = Collections.emptyList();
                                var5_4 = this.p;
                                if (var5_4 != 1 && var5_4 != 3) ** GOTO lbl31
                                this.j();

lbl157:

                                this.m.a();

                            }
                            case 39: {
                                this.a(1);
                                this.q = 4;
                                a.j(this.m, (int)4);

                            }
                            case 38: {
                                this.a(1);
                                this.q = 3;
                                a.j(this.m, (int)3);

                            }
                            case 37: 
                        }
                        this.a(1);
                        this.q = 2;
                        a.j(this.m, (int)2);

                    }
                    this.a(3);

                }
                this.a(2);

            }
            var11_2 = this.m;
            var1_1 /* !! */  = (u32)kn.B;
            var4_7 = (char)var1_1 /* !! */ [(var3_6 & 127) - 32];
            if (a.c(var11_2).length() < 32) {
                a.c(var11_2).append(var4_7);
            }
            if ((var2_5 & 224) == 0) ** GOTO lbl31
            var11_2 = this.m;
            var4_7 = (char)var1_1 /* !! */ [(var2_5 & 127) - 32];
            if (a.c(var11_2).length() >= 32) ** GOTO lbl31
            a.c(var11_2).append(var4_7);

        }
        if (var5_4 != 0 && ((var5_4 = this.p) == 1 || var5_4 == 3)) {
            this.n = this.i();
            this.x = this.g();
        }
    }

    @Override
    protected final q32 c() {
        List<wu> list = this.n;
        this.o = list;
        list.getClass();
        return new nn(list);
    }

    @Override
    @Nullable
    public final v32 e() throws s32 {
        v32 v322;
        v32 v323 = super.e();
        if (v323 != null) {
            return v323;
        }
        if (this.k != -9223372036854775807L && this.x != -9223372036854775807L && this.g() - this.x >= this.k && (v322 = this.f()) != null) {
            this.n = Collections.emptyList();
            this.x = -9223372036854775807L;
            v323 = this.c();
            v322.a(this.g(), v323, Long.MAX_VALUE);
            return v322;
        }
        return null;
    }

    @Override
    public final void flush() {
        super.flush();
        this.n = null;
        this.o = null;
        this.a(0);
        this.q = 4;
        a.j(this.m, (int)4);
        this.j();
        this.r = false;
        this.s = false;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        this.w = true;
        this.x = -9223372036854775807L;
    }

    @Override
    protected final boolean h() {
        boolean bl2 = this.n != this.o;
        return bl2;
    }

    public final void release() {
    }
}


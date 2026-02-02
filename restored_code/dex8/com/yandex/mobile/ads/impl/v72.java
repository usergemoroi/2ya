/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 *  android.util.SparseBooleanArray
 *  android.util.SparseIntArray
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.ag1
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.cx1
 *  com.yandex.mobile.ads.impl.ex1
 *  com.yandex.mobile.ads.impl.fg1
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.qj1
 *  com.yandex.mobile.ads.impl.s52
 *  com.yandex.mobile.ads.impl.t70
 *  com.yandex.mobile.ads.impl.u72
 *  com.yandex.mobile.ads.impl.uf
 *  com.yandex.mobile.ads.impl.v70
 *  com.yandex.mobile.ads.impl.vn
 *  com.yandex.mobile.ads.impl.w72
 *  com.yandex.mobile.ads.impl.w72$a
 *  com.yandex.mobile.ads.impl.w72$b
 *  com.yandex.mobile.ads.impl.w72$c
 *  com.yandex.mobile.ads.impl.w72$d
 */
package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ag1;
import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.cx1;
import com.yandex.mobile.ads.impl.dx1;
import com.yandex.mobile.ads.impl.ex1;
import com.yandex.mobile.ads.impl.fg1;
import com.yandex.mobile.ads.impl.l00;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.oz;
import com.yandex.mobile.ads.impl.qj1;
import com.yandex.mobile.ads.impl.r53;
import com.yandex.mobile.ads.impl.s52;
import com.yandex.mobile.ads.impl.t70;
import com.yandex.mobile.ads.impl.t72;
import com.yandex.mobile.ads.impl.u70;
import com.yandex.mobile.ads.impl.u72;
import com.yandex.mobile.ads.impl.uf;
import com.yandex.mobile.ads.impl.v70;
import com.yandex.mobile.ads.impl.vn;
import com.yandex.mobile.ads.impl.w72;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class v72
implements t70 {
    private final int a;
    private final int b;
    private final List<s52> c;
    private final bg1 d;
    private final SparseIntArray e;
    private final w72.c f;
    private final SparseArray<w72> g;
    private final SparseBooleanArray h;
    private final SparseBooleanArray i;
    private final u72 j;
    private t72 k;
    private v70 l;
    private int m;
    private boolean n;
    private boolean o;
    private boolean p;
    @Nullable
    private w72 q;
    private int r;
    private int s;

    static {
        new r53();
    }

    public v72(int n10) {
        this(new s52(0L), new l00());
    }

    public v72(s52 s522, l00 l002) {
        this.f = (w72.c)uf.a((Object)l002);
        this.b = 112800;
        this.a = 1;
        this.c = Collections.singletonList(s522);
        this.d = new bg1(0, new byte[9400]);
        this.h = new SparseBooleanArray();
        this.i = new SparseBooleanArray();
        this.g = new SparseArray();
        this.e = new SparseIntArray();
        this.j = new u72();
        this.l = v70.a;
        this.s = -1;
        this.b();
    }

    private static t70[] a() {
        return new t70[]{new v72(0)};
    }

    private void b() {
        this.h.clear();
        this.g.clear();
        SparseArray sparseArray = this.f.a();
        int n10 = sparseArray.size();
        for (int i14 = 0; i14 < n10; ++i14) {
            this.g.put(sparseArray.keyAt(i14), (Object)((w72)sparseArray.valueAt(i14)));
        }
        this.g.put(0, (Object)new dx1(new a(this)));
        this.q = null;
    }

    public static /* synthetic */ t70[] c() {
        return v72.a();
    }

    static /* bridge */ /* synthetic */ List e(v72 v722) {
        return v722.c;
    }

    static /* bridge */ /* synthetic */ w72.c f(v72 v722) {
        return v722.f;
    }

    static /* bridge */ /* synthetic */ SparseBooleanArray h(v72 v722) {
        return v722.h;
    }

    static /* bridge */ /* synthetic */ SparseBooleanArray i(v72 v722) {
        return v722.i;
    }

    static /* bridge */ /* synthetic */ v70 j(v72 v722) {
        return v722.l;
    }

    static /* bridge */ /* synthetic */ boolean l(v72 v722) {
        return v722.n;
    }

    static /* bridge */ /* synthetic */ w72 m(v72 v722) {
        return v722.q;
    }

    static /* bridge */ /* synthetic */ void o(v72 v722, boolean bl2) {
        v722.n = bl2;
    }

    static /* bridge */ /* synthetic */ void p(v72 v722, w72 w722) {
        v722.q = w722;
    }

    static /* bridge */ /* synthetic */ void q(v72 v722, int n10) {
        v722.s = n10;
    }

    public final int a(u70 object, qj1 object2) throws IOException {
        int n10;
        int n13;
        int n14;
        int n15;
        object = (oz)object;
        long l10 = ((oz)object).b();
        if (this.n) {
            t72 t722;
            if (l10 != -1L && this.a != 2 && !this.j.c()) {
                return this.j.a((oz)object, object2, this.s);
            }
            if (!this.o) {
                this.o = true;
                if (this.j.a() != -9223372036854775807L) {
                    this.k = t722 = new t72(this.j.b(), this.j.a(), l10, this.s, this.b);
                    this.l.a((ex1)t722.a());
                } else {
                    this.l.a((ex1)new ex1.b(this.j.a(), 0L));
                }
            }
            if (this.p) {
                this.p = false;
                this.a(0L, 0L);
                if (((oz)object).a() != 0L) {
                    object2.a = 0L;
                    return 1;
                }
            }
            if ((t722 = this.k) != null && t722.b()) {
                return this.k.a((oz)object, (qj1)object2);
            }
            object2 = object;
        } else {
            object2 = object;
        }
        object2 = this.d.c();
        if (9400 - this.d.d() < 188) {
            n15 = this.d.a();
            if (n15 > 0) {
                System.arraycopy(object2, this.d.d(), object2, 0, n15);
            }
            this.d.a(n15, (byte[])object2);
        }
        while (this.d.a() < 188) {
            n15 = this.d.e();
            n14 = ((oz)object).read((byte[])object2, n15, 9400 - n15);
            if (n14 == -1) {
                return -1;
            }
            this.d.d(n15 + n14);
        }
        n14 = this.d.d();
        int n16 = this.d.e();
        object = this.d.c();
        for (n15 = n14; n15 < n16 && object[n15] != 71; ++n15) {
        }
        this.d.e(n15);
        int n17 = n15 + 188;
        object = null;
        if (n17 > n16) {
            this.r = n15 = n15 - n14 + this.r;
            if (this.a == 2 && n15 > 376) {
                throw fg1.a((String)"Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            this.r = 0;
        }
        if (n17 > (n13 = this.d.e())) {
            return 0;
        }
        n16 = this.d.h();
        if ((0x800000 & n16) != 0) {
            this.d.e(n17);
            return 0;
        }
        n15 = (0x400000 & n16) != 0 ? 1 : 0;
        int n18 = (0x1FFF00 & n16) >> 8;
        n14 = (n16 & 0x20) != 0 ? 1 : 0;
        if ((n16 & 0x10) != 0) {
            object = (w72)this.g.get(n18);
        }
        if (object == null) {
            this.d.e(n17);
            return 0;
        }
        if (this.a != 2) {
            n10 = this.e.get(n18, (n16 &= 0xF) - 1);
            this.e.put(n18, n16);
            if (n10 == n16) {
                this.d.e(n17);
                return 0;
            }
            if (n16 != (n10 + 1 & 0xF)) {
                object.a();
            }
        }
        n16 = n15;
        if (n14 != 0) {
            n10 = this.d.t();
            n14 = (this.d.t() & 0x40) != 0 ? 2 : 0;
            n16 = n15 | n14;
            this.d.f(n10 - 1);
        }
        boolean bl2 = this.n;
        if (this.a == 2 || bl2 || !this.i.get(n18, false)) {
            this.d.d(n17);
            object.a(n16, this.d);
            this.d.d(n13);
        }
        if (this.a != 2 && !bl2 && this.n && l10 != -1L) {
            this.p = true;
        }
        this.d.e(n17);
        return 0;
    }

    public final void a(long l10, long l11) {
        if (this.a != 2) {
            Object object;
            int n10;
            int n13 = this.c.size();
            for (n10 = 0; n10 < n13; ++n10) {
                object = this.c.get(n10);
                boolean bl2 = object.c() == -9223372036854775807L;
                if (!(!bl2 ? (l10 = object.a()) != -9223372036854775807L && l10 != 0L && l10 != l11 : bl2)) continue;
                object.c(l11);
            }
            if (l11 != 0L && (object = this.k) != null) {
                object.a(l11);
            }
            this.d.c(0);
            this.e.clear();
            for (n10 = 0; n10 < this.g.size(); ++n10) {
                ((w72)this.g.valueAt(n10)).a();
            }
            this.r = 0;
            return;
        }
        throw new IllegalStateException();
    }

    public final void a(v70 v702) {
        this.l = v702;
    }

    public final boolean a(u70 u702) throws IOException {
        byte[] byArray = this.d.c();
        u702 = (oz)u702;
        ((oz)u702).b(byArray, 0, 940, false);
        block0: for (int i14 = 0; i14 < 188; ++i14) {
            for (int i15 = 0; i15 < 5; ++i15) {
                if (byArray[i15 * 188 + i14] == 71) continue;
                continue block0;
            }
            ((oz)u702).a(i14);
            return true;
        }
        return false;
    }

    public final void release() {
    }

    private final class a
    implements cx1 {
        private final ag1 a;
        final v72 b;

        public a(v72 v722) {
            this.b = v722;
            this.a = new ag1(new byte[4]);
        }

        public final void a(bg1 object) {
            if (object.t() != 0) {
                return;
            }
            if ((object.t() & 0x80) == 0) {
                return;
            }
            object.f(6);
            int n10 = object.a() / 4;
            for (int i14 = 0; i14 < n10; ++i14) {
                Object object2 = this.a;
                object.a(object2.a, 0, 4);
                object2.c(0);
                int n13 = this.a.b(16);
                this.a.d(3);
                if (n13 == 0) {
                    this.a.d(13);
                    continue;
                }
                n13 = this.a.b(13);
                if (this.b.g.get(n13) != null) continue;
                object2 = this.b;
                ((v72)object2).g.put(n13, (Object)new dx1(new b((v72)object2, n13)));
                object2 = this.b;
                ((v72)object2).m = ((v72)object2).m + 1;
            }
            object = this.b;
            if (((v72)object).a != 2) {
                ((v72)object).g.remove(0);
            }
        }

        public final void a(s52 s522, v70 v702, w72.d d14) {
        }
    }

    private final class b
    implements cx1 {
        private final ag1 a;
        private final SparseArray<w72> b;
        private final SparseIntArray c;
        private final int d;
        final v72 e;

        public b(v72 v722, int n10) {
            this.e = v722;
            this.a = new ag1(new byte[5]);
            this.b = new SparseArray();
            this.c = new SparseIntArray();
            this.d = n10;
        }

        /*
         * Unable to fully structure code
         * Could not resolve type clashes
         */
        public final void a(bg1 var1_1) {
            if (var1_1 /* !! */ .t() != 2) {
                return;
            }
            var14_2 = this.e;
            var2_3 = v72.d(var14_2);
            if (var2_3 != 1 && var2_3 != 2 && v72.k(var14_2) != 1) {
                var16_4 = new s52(((s52)v72.e(var14_2).get(0)).a());
                v72.e(this.e).add(var16_4);
            } else {
                var16_4 = (s52)v72.e(var14_2).get(0);
            }
            if ((var1_1 /* !! */ .t() & 128) == 0) {
                return;
            }
            var1_1 /* !! */ .f(1);
            var8_5 = var1_1 /* !! */ .z();
            var1_1 /* !! */ .f(3);
            var14_2 = this.a;
            var1_1 /* !! */ .a(var14_2.a, 0, 2);
            var14_2.c(0);
            this.a.d(3);
            v72.q(this.e, this.a.b(13));
            var14_2 = this.a;
            var1_1 /* !! */ .a(var14_2.a, 0, 2);
            var14_2.c(0);
            var14_2 = this.a;
            var2_3 = 4;
            var14_2.d(4);
            var1_1 /* !! */ .f(this.a.b(12));
            var14_2 = this.e;
            var3_6 = v72.d(var14_2);
            if (var3_6 == 2 && v72.m(var14_2) == null) {
                var15_7 /* !! */  = new w72.b(21, null, null, m92.f);
                var14_2 = this.e;
                v72.p(var14_2, v72.f(var14_2).a(21, var15_7 /* !! */ ));
                var15_7 /* !! */  = this.e;
                var14_2 = v72.m((v72)var15_7 /* !! */ );
                if (var14_2 != null) {
                    var14_2.a(var16_4, v72.j((v72)var15_7 /* !! */ ), new w72.d(var8_5, 21, 8192));
                }
            }
            this.b.clear();
            this.c.clear();
            var5_8 = var1_1 /* !! */ .a();
            while (var5_8 > 0) {
                block45: {
                    block44: {
                        var14_2 = this.a;
                        var1_1 /* !! */ .a(var14_2.a, 0, 5);
                        var14_2.c(0);
                        var7_11 = this.a.b(8);
                        this.a.d(3);
                        var6_10 = this.a.b(13);
                        this.a.d(var2_3);
                        var9_12 = this.a.b(12);
                        var10_13 = var1_1 /* !! */ .d();
                        var11_14 = var10_13 + var9_12;
                        var4_9 = -1;
                        var14_2 = null;
                        var17_16 = null;
                        var3_6 = var2_3;
                        var2_3 = var4_9;
                        while (var1_1 /* !! */ .d() < var11_14) {
                            block35: {
                                block43: {
                                    block42: {
                                        block39: {
                                            block41: {
                                                block38: {
                                                    block40: {
                                                        block37: {
                                                            block36: {
                                                                var4_9 = var1_1 /* !! */ .t();
                                                                var3_6 = var1_1 /* !! */ .t();
                                                                var3_6 = var1_1 /* !! */ .d() + var3_6;
                                                                if (var3_6 > var11_14) {
                                                                    var3_6 = 4;
                                                                    break;
                                                                }
                                                                if (var4_9 != 5) break block36;
                                                                var12_15 = var1_1 /* !! */ .v();
                                                                if (var12_15 == 1094921523L) break block37;
                                                                if (var12_15 == 1161904947L) break block38;
                                                                if (var12_15 != 1094921524L) {
                                                                    var15_7 /* !! */  = var14_2;
                                                                    if (var12_15 == 1212503619L) {
                                                                        var2_3 = 36;
                                                                        var15_7 /* !! */  = var14_2;
                                                                    }
lbl73:

                                                                    while (true) {
                                                                        var18_17 = var17_16;
                                                                        break block35;
                                                                        break;
                                                                    }
                                                                }
                                                                break block39;
                                                            }
                                                            if (var4_9 != 106) break block40;
                                                        }
                                                        var2_3 = 129;
                                                        var15_7 /* !! */  = var14_2;

                                                    }
                                                    if (var4_9 != 122) break block41;
                                                }
                                                var2_3 = 135;
                                                var15_7 /* !! */  = var14_2;

                                            }
                                            if (var4_9 != 127) break block42;
                                            var15_7 /* !! */  = var14_2;
                                            if (var1_1 /* !! */ .t() != 21) ** GOTO lbl73
                                        }
                                        var2_3 = 172;
                                        var15_7 /* !! */  = var14_2;

                                    }
                                    if (var4_9 != 123) break block43;
                                    var2_3 = 138;
                                    var15_7 /* !! */  = var14_2;

                                }
                                if (var4_9 == 10) {
                                    var15_7 /* !! */  = var1_1 /* !! */ .a(3, vn.c).trim();

                                }
                                if (var4_9 == 89) {
                                    var18_17 = new ArrayList<w72.a>();
                                    while (var1_1 /* !! */ .d() < var3_6) {
                                        var15_7 /* !! */  = var1_1 /* !! */ .a(3, vn.c).trim();
                                        var1_1 /* !! */ .t();
                                        var17_16 = new byte[4];
                                        var1_1 /* !! */ .a((byte[])var17_16, 0, 4);
                                        var18_17.add(new w72.a((String)var15_7 /* !! */ , (byte[])var17_16));
                                    }
                                    var2_3 = 89;
                                    var15_7 /* !! */  = var14_2;
                                } else {
                                    var15_7 /* !! */  = var14_2;
                                    var18_17 = var17_16;
                                    if (var4_9 == 111) {
                                        var2_3 = 257;
                                        var18_17 = var17_16;
                                        var15_7 /* !! */  = var14_2;
                                    }
                                }
                            }
                            var1_1 /* !! */ .f(var3_6 - var1_1 /* !! */ .d());
                            var3_6 = 4;
                            var14_2 = var15_7 /* !! */ ;
                            var17_16 = var18_17;
                        }
                        var1_1 /* !! */ .e(var11_14);
                        var14_2 = new w72.b(var2_3, (String)var14_2, var17_16, Arrays.copyOfRange(var1_1 /* !! */ .c(), var10_13, var11_14));
                        if (var7_11 == 6) break block44;
                        var4_9 = var7_11;
                        if (var7_11 != 5) break block45;
                    }
                    var4_9 = var2_3;
                }
                var5_8 -= var9_12 + 5;
                var15_7 /* !! */  = this.e;
                var2_3 = v72.d((v72)var15_7 /* !! */ ) == 2 ? var4_9 : var6_10;
                if (!v72.h((v72)var15_7 /* !! */ ).get(var2_3)) {
                    var15_7 /* !! */  = this.e;
                    var14_2 = v72.d((v72)var15_7 /* !! */ ) == 2 && var4_9 == 21 ? v72.m((v72)var15_7 /* !! */ ) : v72.f((v72)var15_7 /* !! */ ).a(var4_9, (w72.b)var14_2);
                    if (v72.d(this.e) != 2 || var6_10 < this.c.get(var2_3, 8192)) {
                        this.c.put(var2_3, var6_10);
                        this.b.put(var2_3, (Object)var14_2);
                    }
                }
                var2_3 = var3_6;
            }
            var3_6 = this.c.size();
            for (var2_3 = 0; var2_3 < var3_6; ++var2_3) {
                var5_8 = this.c.keyAt(var2_3);
                var4_9 = this.c.valueAt(var2_3);
                v72.h(this.e).put(var5_8, true);
                v72.i(this.e).put(var4_9, true);
                var1_1 /* !! */  = (w72)this.b.valueAt(var2_3);
                if (var1_1 /* !! */  == null) continue;
                var14_2 = this.e;
                if (var1_1 /* !! */  != v72.m(var14_2)) {
                    var1_1 /* !! */ .a(var16_4, v72.j(var14_2), new w72.d(var8_5, var5_8, 8192));
                }
                v72.g(this.e).put(var4_9, (Object)var1_1 /* !! */ );
            }
            var1_1 /* !! */  = this.e;
            if (v72.d((v72)var1_1 /* !! */ ) == 2) {
                if (!v72.l((v72)var1_1 /* !! */ )) {
                    v72.j((v72)var1_1 /* !! */ ).a();
                    var1_1 /* !! */  = this.e;
                    v72.n((v72)var1_1 /* !! */ , 0);
                    v72.o((v72)var1_1 /* !! */ , true);
                }
            } else {
                v72.g((v72)var1_1 /* !! */ ).remove(this.d);
                var1_1 /* !! */  = this.e;
                var2_3 = v72.d((v72)var1_1 /* !! */ ) == 1 ? 0 : v72.k((v72)var1_1 /* !! */ ) - 1;
                v72.n((v72)var1_1 /* !! */ , var2_3);
                if (var2_3 == 0) {
                    v72.j((v72)var1_1 /* !! */ ).a();
                    v72.o(this.e, true);
                }
            }
        }

        public final void a(s52 s522, v70 v702, w72.d d14) {
        }
    }
}


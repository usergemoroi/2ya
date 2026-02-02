/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.be0
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.di0$a
 *  com.yandex.mobile.ads.impl.ex1
 *  com.yandex.mobile.ads.impl.fg1
 *  com.yandex.mobile.ads.impl.fi0
 *  com.yandex.mobile.ads.impl.g21
 *  com.yandex.mobile.ads.impl.g21$a
 *  com.yandex.mobile.ads.impl.g62
 *  com.yandex.mobile.ads.impl.iv
 *  com.yandex.mobile.ads.impl.k01
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.qj1
 *  com.yandex.mobile.ads.impl.t70
 *  com.yandex.mobile.ads.impl.v70
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.be0;
import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.di0;
import com.yandex.mobile.ads.impl.ex1;
import com.yandex.mobile.ads.impl.fg1;
import com.yandex.mobile.ads.impl.fi0;
import com.yandex.mobile.ads.impl.g21;
import com.yandex.mobile.ads.impl.g62;
import com.yandex.mobile.ads.impl.gb2;
import com.yandex.mobile.ads.impl.hx1;
import com.yandex.mobile.ads.impl.iv;
import com.yandex.mobile.ads.impl.k01;
import com.yandex.mobile.ads.impl.k40;
import com.yandex.mobile.ads.impl.lr;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.nk0;
import com.yandex.mobile.ads.impl.oz;
import com.yandex.mobile.ads.impl.pl2;
import com.yandex.mobile.ads.impl.qj1;
import com.yandex.mobile.ads.impl.t70;
import com.yandex.mobile.ads.impl.u70;
import com.yandex.mobile.ads.impl.v42;
import com.yandex.mobile.ads.impl.v70;
import com.yandex.mobile.ads.impl.vq2;
import com.yandex.mobile.ads.impl.wq2;
import com.yandex.mobile.ads.impl.y01;
import com.yandex.mobile.ads.impl.z01;
import java.io.EOFException;
import java.io.IOException;

public final class b21
implements t70 {
    private static final di0.a u;
    private final int a;
    private final long b;
    private final bg1 c = new bg1(10);
    private final g21.a d = new g21.a();
    private final be0 e = new be0();
    private final fi0 f = new fi0();
    private final k40 g;
    private v70 h;
    private g62 i;
    private g62 j;
    private int k;
    @Nullable
    private k01 l;
    private long m = -9223372036854775807L;
    private long n;
    private long o;
    private int p;
    private hx1 q;
    private boolean r;
    private boolean s;
    private long t;

    static {
        new vq2();
        u = new wq2();
    }

    public b21() {
        this(0);
    }

    public b21(int n10) {
        this(null);
    }

    public b21(Object object) {
        this.a = 0;
        this.b = -9223372036854775807L;
        this.g = object = new k40();
        this.j = object;
    }

    private boolean a(oz oz3) throws IOException {
        long l10;
        hx1 hx12 = this.q;
        if (hx12 != null && (l10 = hx12.a()) != -1L && oz3.d() > l10 - 4L) {
            return true;
        }
        try {
            boolean bl2 = oz3.b(this.c.c(), 0, 4, true);
            return bl2 ^ true;
        }
        catch (EOFException eOFException) {
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean a(oz oz3, boolean bl2) throws IOException {
        int n10;
        int n12 = bl2 ? 32768 : 131072;
        oz3.c();
        if (oz3.a() == 0L) {
            di0.a a12 = (this.a & 8) == 0 ? null : u;
            a12 = this.f.a(oz3, a12);
            this.l = a12;
            if (a12 != null) {
                this.e.a((k01)a12);
            }
            n10 = (int)oz3.d();
            if (!bl2) {
                oz3.a(n10);
            }
        } else {
            n10 = 0;
        }
        int n13 = 0;
        int n14 = 0;
        int n15 = 0;
        while (true) {
            int n16;
            int n17;
            block21: {
                block19: {
                    block20: {
                        long l10;
                        block18: {
                            if (!this.a(oz3)) break block18;
                            if (n14 <= 0) {
                                throw new EOFException();
                            }
                            break block19;
                        }
                        this.c.e(0);
                        int n18 = this.c.h();
                        if (n13 != 0 && (long)(0xFFFE0C00 & n18) != ((l10 = (long)n13) & 0xFFFFFFFFFFFE0C00L) || (n17 = g21.a((int)n18)) == -1) {
                            n13 = n15 + 1;
                            if (n15 == n12) {
                                if (bl2) {
                                    return false;
                                }
                                throw fg1.a((String)"Searched too many bytes.", null);
                            }
                            if (bl2) {
                                oz3.c();
                                oz3.a(false, n10 + n13);
                            } else {
                                oz3.a(1);
                            }
                            n14 = 0;
                            n15 = n13;
                            n13 = 0;
                            continue;
                        }
                        n16 = n14 + 1;
                        if (n16 != 1) break block20;
                        this.d.a(n18);
                        n14 = n18;
                        break block21;
                    }
                    n14 = n13;
                    if (n16 != 4) break block21;
                }
                if (bl2) {
                    oz3.a(n10 + n15);
                } else {
                    oz3.c();
                }
                this.k = n13;
                return true;
            }
            oz3.a(false, n17 - 4);
            n13 = n14;
            n14 = n16;
        }
    }

    public static /* synthetic */ boolean b(int n10, int n12, int n13, int n14, int n15) {
        return bl2 = n12 == 67 && n13 == 79 && n14 == 77 && (n15 == 77 || n10 == 2) || n12 == 77 && n13 == 76 && n14 == 76 && (n15 == 84 || n10 == 2);
    }

    private static /* synthetic */ t70[] b() {
        return new t70[]{new b21()};
    }

    public static /* synthetic */ t70[] c() {
        return b21.b();
    }

    /*
     * Unable to fully structure code
     */
    public final int a(u70 var1_1, qj1 var2_3) throws IOException {
        block51: {
            block64: {
                block52: {
                    block58: {
                        block63: {
                            block62: {
                                block59: {
                                    block50: {
                                        block61: {
                                            block60: {
                                                block57: {
                                                    block49: {
                                                        block56: {
                                                            block55: {
                                                                block54: {
                                                                    block53: {
                                                                        if (this.i == null) break block51;
                                                                        var3_4 = m92.a;
                                                                        var3_4 = this.k;
                                                                        var5_5 = 0;
                                                                        if (var3_4 == 0) {
                                                                            this.a((oz)var1_1, false);
                                                                        }
                                                                        if (this.q != null) break block52;
                                                                        var2_3 = new bg1(this.d.c);
                                                                        var14_6 = var2_3.c();
                                                                        var3_4 = this.d.c;
                                                                        var15_7 = (oz)var1_1;
                                                                        var15_7.b((byte[])var14_6, 0, var3_4, false);
                                                                        var14_6 = this.d;
                                                                        if ((var14_6.a & 1) == 0) break block53;
                                                                        if (var14_6.e == 1) ** GOTO lbl-1000
                                                                        var4_8 = 36;
                                                                        break block54;
                                                                    }
                                                                    if (var14_6.e != 1) lbl-1000:
                                                                    // 2 sources

                                                                    {
                                                                        var4_8 = 21;
                                                                    } else {
                                                                        var4_8 = 13;
                                                                    }
                                                                }
                                                                if (var2_3.e() < var4_8 + 4) break block55;
                                                                var2_3.e(var4_8);
                                                                var3_4 = var6_9 = var2_3.h();
                                                                if (var6_9 == 1483304551) break block56;
                                                                if (var6_9 != 1231971951) break block55;
                                                                var3_4 = var6_9;
                                                                break block56;
                                                            }
                                                            if (var2_3.e() < 40) ** GOTO lbl-1000
                                                            var2_3.e(36);
                                                            if (var2_3.h() == 1447187017) {
                                                                var3_4 = 1447187017;
                                                            } else lbl-1000:
                                                            // 2 sources

                                                            {
                                                                var3_4 = 0;
                                                            }
                                                        }
                                                        if (var3_4 != 1483304551 && var3_4 != 1231971951) {
                                                            if (var3_4 == 1447187017) {
                                                                var2_3 = gb2.a(var15_7.b(), var15_7.a(), this.d, (bg1)var2_3);
                                                                var15_7.a(this.d.c);
                                                            } else {
                                                                var15_7.c();
                                                                var2_3 = null;
                                                            }
                                                        } else {
                                                            var14_6 = pl2.a(var15_7.b(), var15_7.a(), this.d, (bg1)var2_3);
                                                            if (var14_6 != null) {
                                                                var2_3 = this.e;
                                                                if (var2_3.a == -1 || var2_3.b == -1) {
                                                                    var15_7.c();
                                                                    var15_7.a(false, var4_8 + 141);
                                                                    var15_7.b(this.c.c(), 0, 3, false);
                                                                    this.c.e(0);
                                                                    var2_3 = this.e;
                                                                    var6_9 = this.c.w();
                                                                    var2_3.getClass();
                                                                    var4_8 = var6_9 >> 12;
                                                                    if (var4_8 > 0 || (var6_9 &= 4095) > 0) {
                                                                        var2_3.a = var4_8;
                                                                        var2_3.b = var6_9;
                                                                    }
                                                                }
                                                            }
                                                            var15_7.a(this.d.c);
                                                            var2_3 = var14_6;
                                                            if (var14_6 != null) {
                                                                var2_3 = var14_6;
                                                                if (!var14_6.b()) {
                                                                    var2_3 = var14_6;
                                                                    if (var3_4 == 1231971951) {
                                                                        var15_7.b(this.c.c(), 0, 4, false);
                                                                        this.c.e(0);
                                                                        this.d.a(this.c.h());
                                                                        var2_3 = new lr(var15_7.b(), var15_7.a(), this.d, false);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        var14_6 = this.l;
                                                        var9_10 = var15_7.a();
                                                        if (var14_6 != null) {
                                                            var4_8 = var14_6.c();
                                                            for (var3_4 = 0; var3_4 < var4_8; ++var3_4) {
                                                                block48: {
                                                                    var16_11 = var14_6.a(var3_4);
                                                                    if (!(var16_11 instanceof y01)) continue;
                                                                    var16_11 = (y01)var16_11;
                                                                    var4_8 = var14_6.c();
                                                                    for (var3_4 = 0; var3_4 < var4_8; ++var3_4) {
                                                                        var17_12 = var14_6.a(var3_4);
                                                                        if (!(var17_12 instanceof v42)) continue;
                                                                        var17_12 = (v42)var17_12;
                                                                        if (!var17_12.b.equals("TLEN")) continue;
                                                                        var7_13 = m92.a((long)Long.parseLong(var17_12.d));
                                                                        break block48;
                                                                    }
                                                                    var7_13 = -9223372036854775807L;
                                                                }
                                                                var14_6 = z01.a(var9_10, (y01)var16_11, var7_13);
                                                                break block49;
                                                            }
                                                        }
                                                        var14_6 = null;
                                                    }
                                                    if (!this.r) break block57;
                                                    var14_6 = new hx1.a();
                                                    break block58;
                                                }
                                                if ((this.a & 4) == 0) break block59;
                                                if (var14_6 != null) {
                                                    var7_13 = var14_6.c();
lbl110:
                                                    // 3 sources

                                                    while (true) {
                                                        var9_10 = -1L;
                                                        break block50;
                                                        break;
                                                    }
                                                }
                                                if (var2_3 == null) break block60;
                                                var7_13 = var2_3.c();
                                                var9_10 = var2_3.a();
                                                break block50;
                                            }
                                            var2_3 = this.l;
                                            if (var2_3 == null) break block61;
                                            var4_8 = var2_3.c();
                                            for (var3_4 = 0; var3_4 < var4_8; ++var3_4) {
                                                var14_6 = var2_3.a(var3_4);
                                                if (!(var14_6 instanceof v42)) continue;
                                                var14_6 = (v42)var14_6;
                                                if (!var14_6.b.equals("TLEN")) continue;
                                                var7_13 = m92.a((long)Long.parseLong(var14_6.d));
                                                ** GOTO lbl110
                                            }
                                        }
                                        var7_13 = -9223372036854775807L;
                                        ** while (true)
                                    }
                                    var2_3 = new nk0(var7_13, var15_7.a(), var9_10);
                                    break block62;
                                }
                                if (var14_6 != null) {
                                    var2_3 = var14_6;
                                } else if (var2_3 == null) {
                                    var2_3 = null;
                                }
                            }
                            if (var2_3 == null) break block63;
                            var14_6 = var2_3;
                            if (var2_3.b()) break block58;
                            var14_6 = var2_3;
                            if ((this.a & 1) == 0) break block58;
                        }
                        var13_14 = (this.a & 2) != 0;
                        var15_7.b(this.c.c(), 0, 4, false);
                        this.c.e(0);
                        this.d.a(this.c.h());
                        var14_6 = new lr(var15_7.b(), var15_7.a(), this.d, var13_14);
                    }
                    this.q = var14_6;
                    this.h.a((ex1)var14_6);
                    var14_6 = this.j;
                    var16_11 = new /* Unavailable Anonymous Inner Class!! */.e(this.d.b).h(4096).c(this.d.e).l(this.d.d).d(this.e.a).e(this.e.b);
                    var2_3 = (this.a & 8) != 0 ? null : this.l;
                    var14_6.a(var16_11.a((k01)var2_3).a());
                    this.o = var15_7.a();
                    break block64;
                }
                if (this.o != 0L && (var7_13 = (var2_3 = (oz)var1_1).a()) < (var9_10 = this.o)) {
                    var2_3.a((int)(var9_10 - var7_13));
                }
            }
            if (this.p != 0) ** GOTO lbl-1000
            var2_3 = (oz)var1_1;
            var2_3.c();
            if (!this.a((oz)var2_3)) {
                this.c.e(0);
                var3_4 = this.c.h();
                var7_13 = this.k;
                if ((long)(-128000 & var3_4) != (var7_13 & -128000L) || g21.a((int)var3_4) == -1) {
                    var2_3.a(1);
                    this.k = 0;
                    var3_4 = var5_5;
                } else {
                    this.d.a(var3_4);
                    if (this.m == -9223372036854775807L) {
                        this.m = this.q.a(var2_3.a());
                        if (this.b != -9223372036854775807L) {
                            var9_10 = this.q.a(0L);
                            var7_13 = this.m;
                            this.m = this.b - var9_10 + var7_13;
                        }
                    }
                    var14_6 = this.d;
                    this.p = var14_6.c;
                    var15_7 = this.q;
                    if (var15_7 instanceof nk0) {
                        var15_7 = (nk0)var15_7;
                        var9_10 = this.n;
                        var7_13 = var14_6.g;
                        var11_15 = this.m;
                        var15_7.a((var9_10 + var7_13) * 1000000L / (long)var14_6.d + var11_15, var2_3.a() + (long)this.d.c);
                        if (this.s && var15_7.c(this.t)) {
                            this.s = false;
                            this.j = this.i;
                        } else {
                            ** GOTO lbl-1000
                        }
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            }
            ** GOTO lbl-1000
lbl-1000:
            // 6 sources

            {
                var3_4 = this.j.b((iv)var1_1, this.p, true);
                if (var3_4 == -1) lbl-1000:
                // 3 sources

                {
                    while (true) {
                        var3_4 = -1;
                        break;
                    }
                } else {
                    this.p = var3_4 = this.p - var3_4;
                    if (var3_4 > 0) {
                        var3_4 = var5_5;
                    } else {
                        var1_1 = this.j;
                        var7_13 = this.n;
                        var9_10 = this.m;
                        var2_3 = this.d;
                        var1_1.a(var7_13 * 1000000L / (long)var2_3.d + var9_10, 1, var2_3.c, 0, null);
                        this.n += (long)this.d.g;
                        this.p = 0;
                        var3_4 = var5_5;
                    }
                }
            }
            if (var3_4 == -1 && (var1_1 = this.q) instanceof nk0) {
                var7_13 = this.n;
                var9_10 = this.m;
                var7_13 = var7_13 * 1000000L / (long)this.d.d + var9_10;
                if (var1_1.c() != var7_13) {
                    ((nk0)this.q).d(var7_13);
                    this.h.a((ex1)this.q);
                }
            }
            return var3_4;
        }
        throw new IllegalStateException();
        catch (EOFException var1_2) {
            ** continue;
        }
    }

    public final void a() {
        this.r = true;
    }

    public final void a(long l10, long l11) {
        this.k = 0;
        this.m = -9223372036854775807L;
        this.n = 0L;
        this.p = 0;
        this.t = l11;
        hx1 hx12 = this.q;
        if (hx12 instanceof nk0 && !((nk0)hx12).c(l11)) {
            this.s = true;
            this.j = this.g;
        }
    }

    public final void a(v70 v702) {
        this.h = v702;
        v702 = v702.a(0, 1);
        this.i = v702;
        this.j = v702;
        this.h.a();
    }

    public final boolean a(u70 u702) throws IOException {
        return this.a((oz)u702, true);
    }

    public final void release() {
    }
}


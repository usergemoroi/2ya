/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.bn1
 *  com.yandex.mobile.ads.impl.cn1$a
 *  com.yandex.mobile.ads.impl.ex1
 *  com.yandex.mobile.ads.impl.qj1
 *  com.yandex.mobile.ads.impl.s52
 *  com.yandex.mobile.ads.impl.t70
 *  com.yandex.mobile.ads.impl.v70
 *  com.yandex.mobile.ads.impl.w72$d
 */
package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.an1;
import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.bn1;
import com.yandex.mobile.ads.impl.cn1;
import com.yandex.mobile.ads.impl.ex1;
import com.yandex.mobile.ads.impl.f21;
import com.yandex.mobile.ads.impl.o;
import com.yandex.mobile.ads.impl.oz;
import com.yandex.mobile.ads.impl.qj1;
import com.yandex.mobile.ads.impl.s52;
import com.yandex.mobile.ads.impl.t70;
import com.yandex.mobile.ads.impl.u70;
import com.yandex.mobile.ads.impl.v70;
import com.yandex.mobile.ads.impl.w72;
import com.yandex.mobile.ads.impl.we0;
import com.yandex.mobile.ads.impl.wr2;
import java.io.IOException;

/*
 * Exception performing whole class analysis ignored.
 */
public final class cn1
implements t70 {
    private final s52 a;
    private final SparseArray<a> b;
    private final bg1 c;
    private final bn1 d;
    private boolean e;
    private boolean f;
    private boolean g;
    private long h;
    @Nullable
    private an1 i;
    private v70 j;
    private boolean k;

    static {
        new wr2();
    }

    public cn1(s52 s522) {
        this.a = s522;
        this.c = new bg1(4096);
        this.b = new SparseArray();
        this.d = new bn1();
    }

    private static t70[] a() {
        return new t70[]{new cn1(new s52(0L))};
    }

    public static /* synthetic */ t70[] b() {
        return cn1.a();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final int a(u70 object, qj1 qj12) throws IOException {
        void var17_30;
        long l10;
        long l11;
        oz oz3;
        block19: {
            void var1_14;
            block20: {
                void var17_26;
                a a12;
                block24: {
                    void var1_7;
                    block22: {
                        int n10;
                        block23: {
                            block21: {
                                an1 an12;
                                if (this.j == null) throw new IllegalStateException();
                                oz3 = (oz)object;
                                l11 = oz3.b();
                                long l13 = l11 - -1L;
                                l10 = l13 == 0L ? 0 : (l13 < 0L ? -1 : 1);
                                if (l10 != false && !this.d.c()) {
                                    return this.d.a(oz3, (qj1)a12);
                                }
                                if (!this.k) {
                                    this.k = true;
                                    if (this.d.a() != -9223372036854775807L) {
                                        an1 an13;
                                        this.i = an13 = new an1(this.d.b(), this.d.a(), l11);
                                        this.j.a((ex1)an13.a());
                                    } else {
                                        this.j.a((ex1)new ex1.b(this.d.a(), 0L));
                                    }
                                }
                                if ((an12 = this.i) != null && an12.b()) {
                                    return this.i.a(oz3, (qj1)a12);
                                }
                                oz3.c();
                                l11 = l10 != false ? (l11 -= oz3.d()) : -1L;
                                if (l11 != -1L && l11 < 4L) {
                                    return -1;
                                }
                                if (!oz3.b(this.c.c(), 0, 4, true)) {
                                    return -1;
                                }
                                this.c.e(0);
                                n10 = this.c.h();
                                if (n10 == 441) {
                                    return -1;
                                }
                                if (n10 == 442) {
                                    oz3.b(this.c.c(), 0, 10, false);
                                    this.c.e(9);
                                    oz3.a((this.c.t() & 7) + 14);
                                    return 0;
                                }
                                if (n10 == 443) {
                                    oz3.b(this.c.c(), 0, 2, false);
                                    this.c.e(0);
                                    oz3.a(this.c.z() + 6);
                                    return 0;
                                }
                                if ((n10 & 0xFFFFFF00) >> 8 != 1) {
                                    oz3.a(1);
                                    return 0;
                                }
                                l10 = n10 & 0xFF;
                                a a13 = a12 = this.b.get((int)l10);
                                if (this.e) break block19;
                                a a14 = a12;
                                if (a12 != null) break block20;
                                Object var17_24 = null;
                                if (l10 != 189) break block21;
                                o o11 = new o(null);
                                this.f = true;
                                this.h = oz3.a();
                                break block22;
                            }
                            if ((n10 & 0xE0) != 192) break block23;
                            f21 f212 = new f21(null);
                            this.f = true;
                            this.h = oz3.a();
                            break block22;
                        }
                        if ((n10 & 0xF0) != 224) break block24;
                        we0 we02 = new we0(null);
                        this.g = true;
                        this.h = oz3.a();
                    }
                    void var17_25 = var1_7;
                }
                a a15 = a12;
                if (var17_26 != null) {
                    w72.d d10 = new w72.d(Integer.MIN_VALUE, (int)l10, 256);
                    var17_26.a(this.j, d10);
                    a a16 = new /* Unavailable Anonymous Inner Class!! */;
                    this.b.put((int)l10, (Object)a16);
                }
            }
            l11 = this.f && this.g ? this.h + 8192L : 0x100000L;
            void var17_28 = var1_14;
            if (oz3.a() > l11) {
                this.e = true;
                this.j.a();
                void var17_29 = var1_14;
            }
        }
        oz3.b(this.c.c(), 0, 2, false);
        this.c.e(0);
        l10 = this.c.z() + 6;
        if (var17_30 == null) {
            oz3.a((int)l10);
            return 0;
        }
        this.c.c((int)l10);
        oz3.a(this.c.c(), 0, (int)l10, false);
        this.c.e(6);
        bg1 bg12 = this.c;
        bg12.a(com.yandex.mobile.ads.impl.cn1$a.c(var17_30).a, 0, 3);
        com.yandex.mobile.ads.impl.cn1$a.c(var17_30).c(0);
        com.yandex.mobile.ads.impl.cn1$a.c(var17_30).d(8);
        com.yandex.mobile.ads.impl.cn1$a.h(var17_30, (boolean)com.yandex.mobile.ads.impl.cn1$a.c(var17_30).f());
        com.yandex.mobile.ads.impl.cn1$a.i(var17_30, (boolean)com.yandex.mobile.ads.impl.cn1$a.c(var17_30).f());
        com.yandex.mobile.ads.impl.cn1$a.c(var17_30).d(6);
        l10 = com.yandex.mobile.ads.impl.cn1$a.c(var17_30).b(8);
        bg12.a(com.yandex.mobile.ads.impl.cn1$a.c(var17_30).a, 0, (int)l10);
        com.yandex.mobile.ads.impl.cn1$a.c(var17_30).c(0);
        com.yandex.mobile.ads.impl.cn1$a.k(var17_30, (long)0L);
        if (com.yandex.mobile.ads.impl.cn1$a.d(var17_30)) {
            com.yandex.mobile.ads.impl.cn1$a.c(var17_30).d(4);
            long l14 = com.yandex.mobile.ads.impl.cn1$a.c(var17_30).b(3);
            com.yandex.mobile.ads.impl.cn1$a.c(var17_30).d(1);
            long l15 = com.yandex.mobile.ads.impl.cn1$a.c(var17_30).b(15) << 15;
            com.yandex.mobile.ads.impl.cn1$a.c(var17_30).d(1);
            long l16 = com.yandex.mobile.ads.impl.cn1$a.c(var17_30).b(15);
            com.yandex.mobile.ads.impl.cn1$a.c(var17_30).d(1);
            if (!com.yandex.mobile.ads.impl.cn1$a.f(var17_30) && com.yandex.mobile.ads.impl.cn1$a.e(var17_30)) {
                com.yandex.mobile.ads.impl.cn1$a.c(var17_30).d(4);
                long l17 = com.yandex.mobile.ads.impl.cn1$a.c(var17_30).b(3);
                com.yandex.mobile.ads.impl.cn1$a.c(var17_30).d(1);
                l11 = com.yandex.mobile.ads.impl.cn1$a.c(var17_30).b(15) << 15;
                com.yandex.mobile.ads.impl.cn1$a.c(var17_30).d(1);
                long l18 = com.yandex.mobile.ads.impl.cn1$a.c(var17_30).b(15);
                com.yandex.mobile.ads.impl.cn1$a.c(var17_30).d(1);
                com.yandex.mobile.ads.impl.cn1$a.b(var17_30).b(l17 << 30 | l11 | l18);
                com.yandex.mobile.ads.impl.cn1$a.j(var17_30, (boolean)true);
            }
            com.yandex.mobile.ads.impl.cn1$a.k(var17_30, (long)com.yandex.mobile.ads.impl.cn1$a.b(var17_30).b(l14 << 30 | l15 | l16));
        }
        com.yandex.mobile.ads.impl.cn1$a.a(var17_30).a(4, com.yandex.mobile.ads.impl.cn1$a.g(var17_30));
        com.yandex.mobile.ads.impl.cn1$a.a(var17_30).a(bg12);
        com.yandex.mobile.ads.impl.cn1$a.a(var17_30).b();
        bg1 bg13 = this.c;
        bg13.d(bg13.b());
        return 0;
    }

    public final void a(long l10, long l11) {
        an1 an12;
        int n10 = this.a.c() == -9223372036854775807L ? 1 : 0;
        if (n10 == 0 ? (l10 = this.a.a()) != -9223372036854775807L && l10 != 0L && l10 != l11 : n10 != 0) {
            this.a.c(l11);
        }
        if ((an12 = this.i) != null) {
            an12.a(l11);
        }
        for (n10 = 0; n10 < this.b.size(); ++n10) {
            an12 = this.b.valueAt(n10);
            com.yandex.mobile.ads.impl.cn1$a.j(an12, (boolean)false);
            com.yandex.mobile.ads.impl.cn1$a.a(an12).a();
        }
    }

    public final void a(v70 v702) {
        this.j = v702;
    }

    public final boolean a(u70 u702) throws IOException {
        byte[] byArray = new byte[14];
        u702 = (oz)u702;
        boolean bl2 = false;
        ((oz)u702).b(byArray, 0, 14, false);
        if (442 != ((byArray[0] & 0xFF) << 24 | (byArray[1] & 0xFF) << 16 | (byArray[2] & 0xFF) << 8 | byArray[3] & 0xFF)) {
            return false;
        }
        if ((byArray[4] & 0xC4) != 68) {
            return false;
        }
        if ((byArray[6] & 4) != 4) {
            return false;
        }
        if ((byArray[8] & 4) != 4) {
            return false;
        }
        if ((byArray[9] & 1) != 1) {
            return false;
        }
        if ((byArray[12] & 3) != 3) {
            return false;
        }
        ((oz)u702).a(false, byArray[13] & 7);
        ((oz)u702).b(byArray, 0, 3, false);
        if (1 == ((byArray[0] & 0xFF) << 16 | (byArray[1] & 0xFF) << 8 | byArray[2] & 0xFF)) {
            bl2 = true;
        }
        return bl2;
    }

    public final void release() {
    }
}


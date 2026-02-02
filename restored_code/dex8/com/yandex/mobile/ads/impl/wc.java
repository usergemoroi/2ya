/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ex1
 *  com.yandex.mobile.ads.impl.fg1
 *  com.yandex.mobile.ads.impl.g62
 *  com.yandex.mobile.ads.impl.iv
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.qj1
 *  com.yandex.mobile.ads.impl.t70
 *  com.yandex.mobile.ads.impl.v70
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ex1;
import com.yandex.mobile.ads.impl.fg1;
import com.yandex.mobile.ads.impl.g62;
import com.yandex.mobile.ads.impl.iv;
import com.yandex.mobile.ads.impl.kr;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.oz;
import com.yandex.mobile.ads.impl.qj1;
import com.yandex.mobile.ads.impl.t70;
import com.yandex.mobile.ads.impl.u70;
import com.yandex.mobile.ads.impl.v70;
import com.yandex.mobile.ads.impl.x63;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

public final class wc
implements t70 {
    private static final int[] p;
    private static final int[] q;
    private static final byte[] r;
    private static final byte[] s;
    private static final int t;
    private final byte[] a = new byte[1];
    private final int b;
    private boolean c;
    private long d;
    private int e;
    private int f;
    private boolean g;
    private long h;
    private int i = -1;
    private int j;
    private long k;
    private v70 l;
    private g62 m;
    private ex1 n;
    private boolean o;

    static {
        int[] nArray;
        new x63();
        p = new int[]{13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
        int[] nArray2 = nArray = new int[16];
        nArray[0] = 18;
        nArray2[1] = 24;
        nArray2[2] = 33;
        nArray2[3] = 37;
        nArray2[4] = 41;
        nArray2[5] = 47;
        nArray2[6] = 51;
        nArray2[7] = 59;
        nArray2[8] = 61;
        nArray2[9] = 6;
        nArray2[10] = 1;
        nArray2[11] = 1;
        nArray2[12] = 1;
        nArray2[13] = 1;
        nArray2[14] = 1;
        nArray2[15] = 1;
        q = nArray;
        r = m92.c((String)"#!AMR\n");
        s = m92.c((String)"#!AMR-WB\n");
        t = nArray[8];
    }

    public wc() {
        this.b = 0;
    }

    private int a(oz object) throws IOException {
        ((oz)object).c();
        ((oz)object).b(this.a, 0, 1, false);
        int n10 = this.a[0];
        if ((n10 & 0x83) <= 0) {
            boolean bl2;
            if ((n10 = n10 >> 3 & 0xF) >= 0 && n10 <= 15 && ((bl2 = this.c) && (n10 < 10 || n10 > 13) || !bl2 && (n10 < 12 || n10 > 14))) {
                n10 = bl2 ? q[n10] : p[n10];
                return n10;
            }
            StringBuilder stringBuilder = new StringBuilder("Illegal AMR ");
            object = this.c ? "WB" : "NB";
            stringBuilder.append((String)object);
            stringBuilder.append(" frame type ");
            stringBuilder.append(n10);
            throw fg1.a((String)stringBuilder.toString(), null);
        }
        object = new StringBuilder("Invalid padding bits for frame header ");
        ((StringBuilder)object).append(n10);
        throw fg1.a((String)((StringBuilder)object).toString(), null);
    }

    private static t70[] a() {
        return new t70[]{new wc()};
    }

    public static /* synthetic */ t70[] b() {
        return wc.a();
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int a(u70 object, qj1 object2) throws IOException {
        int n10;
        boolean bl2;
        oz oz3;
        int n13;
        block16: {
            block15: {
                block14: {
                    if (this.m == null) throw new IllegalStateException();
                    n13 = m92.a;
                    oz3 = (oz)object;
                    if (oz3.a() == 0L) {
                        byte[] byArray = r;
                        oz3.c();
                        byte[] byArray2 = new byte[byArray.length];
                        oz3.b(byArray2, 0, byArray.length, false);
                        if (Arrays.equals(byArray2, byArray)) {
                            this.c = false;
                            oz3.a(byArray.length);
                        } else {
                            byArray = s;
                            oz3.c();
                            byte[] byArray3 = new byte[byArray.length];
                            oz3.b(byArray3, 0, byArray.length, false);
                            if (!Arrays.equals(byArray3, byArray)) throw fg1.a((String)"Could not find AMR header.", null);
                            this.c = true;
                            oz3.a(byArray.length);
                        }
                    }
                    if (!this.o) {
                        void var2_9;
                        this.o = true;
                        bl2 = this.c;
                        if (bl2) {
                            String string2 = "audio/amr-wb";
                        } else {
                            String string3 = "audio/3gpp";
                        }
                        n13 = bl2 ? 16000 : 8000;
                        this.m.a(new /* Unavailable Anonymous Inner Class!! */.e((String)var2_9).h(t).c(1).l(n13).a());
                    }
                    if (this.f == 0) {
                        this.e = n13 = this.a((oz)object);
                        this.f = n13;
                        if (this.i == -1) {
                            this.h = oz3.a();
                            this.i = this.e;
                        }
                        if (this.i != this.e) break block14;
                        ++this.j;
                    }
                }
                if ((n13 = this.m.b((iv)object, this.f, true)) == -1) break block15;
                this.f = n13 = this.f - n13;
                if (n13 <= 0) {
                    this.m.a(this.k + this.d, 1, this.e, 0, null);
                    this.d += 20000L;
                }
                n13 = 0;
                break block16;
        // Removed invalid catch block
            n13 = -1;
        }
        long l10 = oz3.b();
        if (this.g) {
            return n13;
        }
        int n14 = this.b;
        if ((n14 & 1) != 0 && l10 != -1L && ((n10 = this.i) == -1 || n10 == this.e)) {
            if (this.j < 20) {
                if (n13 != -1) return n13;
            }
            bl2 = (n14 & 2) != 0;
            object = new kr((int)((long)n10 * 8000000L / 20000L), n10, l10, this.h, bl2);
            this.n = object;
            this.l.a((ex1)object);
            this.g = true;
            return n13;
        }
        object = new ex1.b(-9223372036854775807L, 0L);
        this.n = object;
        this.l.a((ex1)object);
        this.g = true;
        return n13;
    }

    public final void a(long l10, long l11) {
        ex1 ex12;
        this.d = 0L;
        this.e = 0;
        this.f = 0;
        this.k = l10 != 0L && (ex12 = this.n) instanceof kr ? ((kr)ex12).c(l10) : 0L;
    }

    public final void a(v70 v702) {
        this.l = v702;
        this.m = v702.a(0, 1);
        v702.a();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean a(u70 u702) throws IOException {
        u702 = (oz)u702;
        byte[] byArray = r;
        ((oz)u702).c();
        byte[] byArray2 = new byte[byArray.length];
        int n10 = byArray.length;
        boolean bl2 = false;
        ((oz)u702).b(byArray2, 0, n10, false);
        if (Arrays.equals(byArray2, byArray)) {
            this.c = false;
            ((oz)u702).a(byArray.length);
            return true;
        }
        byArray2 = s;
        ((oz)u702).c();
        byArray = new byte[byArray2.length];
        ((oz)u702).b(byArray, 0, byArray2.length, false);
        if (!Arrays.equals(byArray, byArray2)) return bl2;
        this.c = true;
        ((oz)u702).a(byArray2.length);
        return true;
    }

    public final void release() {
    }
}


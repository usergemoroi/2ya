/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.CallSuper
 *  androidx.annotation.GuardedBy
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.a40$a
 *  com.yandex.mobile.ads.impl.b40
 *  com.yandex.mobile.ads.impl.b40$b
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.dc0
 *  com.yandex.mobile.ads.impl.g62
 *  com.yandex.mobile.ads.impl.g62$a
 *  com.yandex.mobile.ads.impl.iv
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.mr
 *  com.yandex.mobile.ads.impl.mt2
 *  com.yandex.mobile.ads.impl.nt1
 *  com.yandex.mobile.ads.impl.ot1$a
 *  com.yandex.mobile.ads.impl.ot1$b
 *  com.yandex.mobile.ads.impl.ot1$c
 *  com.yandex.mobile.ads.impl.r12
 *  com.yandex.mobile.ads.impl.vc
 *  com.yandex.mobile.ads.impl.w01
 *  com.yandex.mobile.ads.impl.y30
 *  com.yandex.mobile.ads.impl.z30
 *  com.yandex.mobile.ads.impl.zs0
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.CallSuper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.a40;
import com.yandex.mobile.ads.impl.b40;
import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.dc0;
import com.yandex.mobile.ads.impl.g62;
import com.yandex.mobile.ads.impl.im1;
import com.yandex.mobile.ads.impl.iv;
import com.yandex.mobile.ads.impl.jy;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.mr;
import com.yandex.mobile.ads.impl.mt2;
import com.yandex.mobile.ads.impl.nt1;
import com.yandex.mobile.ads.impl.ot1;
import com.yandex.mobile.ads.impl.q13;
import com.yandex.mobile.ads.impl.r12;
import com.yandex.mobile.ads.impl.vc;
import com.yandex.mobile.ads.impl.w01;
import com.yandex.mobile.ads.impl.y30;
import com.yandex.mobile.ads.impl.z30;
import com.yandex.mobile.ads.impl.zs0;
import java.io.IOException;

public final class ot1
implements g62 {
    private boolean A;
    private boolean B;
    private final nt1 a;
    private final a b;
    private final r12<b> c;
    @Nullable
    private final b40 d;
    @Nullable
    private final a40.a e;
    @Nullable
    private c f;
    @Nullable
    private cc0 g;
    @Nullable
    private z30 h;
    private int i;
    private int[] j;
    private long[] k;
    private int[] l;
    private int[] m;
    private long[] n;
    private g62.a[] o;
    private int p;
    private int q;
    private int r;
    private int s;
    private long t;
    private long u;
    private long v;
    private boolean w;
    private boolean x;
    private boolean y;
    @Nullable
    private cc0 z;

    protected ot1(vc vc3, @Nullable b40 b402, @Nullable a40.a a14) {
        this.d = b402;
        this.e = a14;
        this.a = new nt1(vc3);
        this.b = new /* Unavailable Anonymous Inner Class!! */;
        this.i = 1000;
        this.j = new int[1000];
        this.k = new long[1000];
        this.n = new long[1000];
        this.m = new int[1000];
        this.l = new int[1000];
        this.o = new g62.a[1000];
        this.c = new r12((mr)new q13());
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.y = true;
        this.x = true;
    }

    private int a(int n10, int n13, long l10, boolean bl2) {
        int n14 = -1;
        int n15 = 0;
        int n16 = n10;
        n10 = n15;
        while (true) {
            block7: {
                long l11;
                block6: {
                    n15 = n14;
                    if (n10 >= n13) break;
                    long l13 = this.n[n16] - l10;
                    l11 = l13 == 0L ? 0 : (l13 < 0L ? -1 : 1);
                    n15 = n14;
                    if (l11 > 0) break;
                    if (!bl2) break block6;
                    n15 = n14;
                    if ((this.m[n16] & 1) == 0) break block7;
                }
                n15 = n14 = n10;
                if (l11 == false) {
                    n15 = n14;
                    break;
                }
            }
            n16 = n14 = n16 + 1;
            if (n14 == this.i) {
                n16 = 0;
            }
            ++n10;
            n14 = n15;
        }
        return n15;
    }

    @GuardedBy(value="this")
    private long a(int n10) {
        int n13;
        int n14;
        this.u = Math.max(this.u, this.b(n10));
        this.p -= n10;
        this.q = n14 = this.q + n10;
        this.r = n13 = this.r + n10;
        int n15 = this.i;
        if (n13 >= n15) {
            this.r = n13 - n15;
        }
        this.s = n10 = this.s - n10;
        if (n10 < 0) {
            this.s = 0;
        }
        this.c.a(n14);
        if (this.p == 0) {
            n10 = n14 = this.r;
            if (n14 == 0) {
                n10 = this.i;
            }
            return this.k[--n10] + (long)this.l[n10];
        }
        return this.k[this.r];
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(long l10, int n10, long l11, int n13, @Nullable g62.a object) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                Object object2;
                Object object3;
                g62.a[] aArray;
                int n14;
                try {
                    n14 = this.p;
                    if (n14 > 0 && this.k[n14 = this.c(n14 - 1)] + (long)this.l[n14] > l11) {
                        object = new IllegalArgumentException();
                        throw object;
                    }
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                boolean bl2 = (0x20000000 & n10) != 0;
                this.w = bl2;
                this.v = Math.max(this.v, l10);
                n14 = this.c(this.p);
                this.n[n14] = l10;
                this.k[n14] = l11;
                this.l[n14] = n13;
                this.m[n14] = n10;
                this.o[n14] = object;
                this.j[n14] = 0;
                if (this.c.c() || !(this.c.b()).a.equals(this.z)) {
                    object = this.d;
                    object = object != null ? object.a(this.e, this.z) : b40.b.a;
                    aArray = this.c;
                    n13 = this.q;
                    n10 = this.p;
                    object3 = this.z;
                    object3.getClass();
                    object2 = new /* Unavailable Anonymous Inner Class!! */;
                    aArray.a(n13 + n10, object2);
                }
                this.p = n10 = this.p + 1;
                n14 = this.i;
                if (n10 == n14) {
                    n10 = n14 + 1000;
                    object = new int[n10];
                    object2 = new long[n10];
                    object3 = new long[n10];
                    int[] nArray = new int[n10];
                    int[] nArray2 = new int[n10];
                    aArray = new g62.a[n10];
                    n13 = this.r;
                    System.arraycopy(this.k, n13, object2, 0, n14 -= n13);
                    System.arraycopy(this.n, this.r, object3, 0, n14);
                    System.arraycopy(this.m, this.r, nArray, 0, n14);
                    System.arraycopy(this.l, this.r, nArray2, 0, n14);
                    System.arraycopy(this.o, this.r, aArray, 0, n14);
                    System.arraycopy(this.j, this.r, object, 0, n14);
                    n13 = this.r;
                    System.arraycopy(this.k, 0, object2, n14, n13);
                    System.arraycopy(this.n, 0, object3, n14, n13);
                    System.arraycopy(this.m, 0, nArray, n14, n13);
                    System.arraycopy(this.l, 0, nArray2, n14, n13);
                    System.arraycopy(this.o, 0, aArray, n14, n13);
                    System.arraycopy(this.j, 0, object, n14, n13);
                    this.k = (long[])object2;
                    this.n = (long[])object3;
                    this.m = nArray;
                    this.l = nArray2;
                    this.o = aArray;
                    this.j = (int[])object;
                    this.r = 0;
                    this.i = n10;
                }
                return;
            }
            throw throwable2;
        }
    }

    private void a(cc0 cc02, dc0 dc02) {
        cc0 cc03 = this.g;
        boolean bl2 = cc03 == null;
        cc03 = bl2 ? null : cc03.p;
        this.g = cc02;
        y30 y302 = cc02.p;
        Object object = this.d;
        object = object != null ? cc02.a(object.a(cc02)) : cc02;
        dc02.b = object;
        dc02.a = this.h;
        if (this.d == null) {
            return;
        }
        if (!bl2 && m92.a((Object)cc03, (Object)y302)) {
            return;
        }
        cc03 = this.h;
        cc02 = this.d.b(this.e, cc02);
        this.h = cc02;
        dc02.a = cc02;
        if (cc03 != null) {
            cc03.a(this.e);
        }
    }

    private long b(int n10) {
        long l10;
        long l11 = Long.MIN_VALUE;
        if (n10 == 0) {
            return Long.MIN_VALUE;
        }
        int n13 = this.c(n10 - 1);
        int n14 = 0;
        while (true) {
            int n15;
            l10 = l11;
            if (n14 >= n10) break;
            l11 = Math.max(l11, this.n[n13]);
            if ((this.m[n13] & 1) != 0) {
                l10 = l11;
                break;
            }
            n13 = n15 = n13 - 1;
            if (n15 == -1) {
                n13 = this.i - 1;
            }
            ++n14;
        }
        return l10;
    }

    public static /* synthetic */ void b(b b10) {
        b10.b.release();
    }

    private int c(int n10) {
        int n13 = this.i;
        if ((n10 = this.r + n10) >= n13) {
            n10 -= n13;
        }
        return n10;
    }

    private void j() {
        synchronized (this) {
            this.s = 0;
            this.a.c();
            return;
        }
    }

    public final int a(long l10, boolean bl2) {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                block6: {
                    int n10;
                    int n13;
                    int n14;
                    block7: {
                        try {
                            n14 = this.c(this.s);
                            n13 = this.s;
                            n10 = this.p;
                            if (n13 == n10) break block6;
                        }
                        catch (Throwable throwable2) {}
                        if (l10 < this.n[n14]) break block6;
                        long l11 = this.v;
                        if (l10 <= l11 || !bl2) break block7;
                        return n10 - n13;
                    }
                    n13 = this.a(n14, n10 - n13, l10, true);
                    // MONITOREXIT @DISABLED, blocks:[2, 3] lbl15 : MonitorExitStatement: MONITOREXIT : this
                    if (n13 == -1) {
                        return 0;
                    }
                    return n13;
                    break block8;
                }
                return 0;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @CallSuper
    public final int a(dc0 dc02, jy jy3, int n10, boolean bl2) {
        int n13;
        boolean bl3;
        block16: {
            block15: {
                block19: {
                    int n14;
                    Object object;
                    block17: {
                        cc0 cc02;
                        block18: {
                            bl3 = false;
                            n13 = (n10 & 2) != 0 ? 1 : 0;
                            object = this.b;
                            // MONITORENTER : this
                            jy3.e = false;
                            int n15 = this.s;
                            int n16 = this.p;
                            n14 = -5;
                            if (n15 == n16) break block17;
                            cc02 = (this.c.b((int)(this.q + n15))).a;
                            if (n13 != 0 || cc02 != this.g) break block18;
                            n13 = this.c(this.s);
                            dc02 = this.h;
                            if (!(dc02 == null || dc02.getState() == 4 || (this.m[n13] & 0x40000000) == 0 && this.h.playClearSamplesWithoutKeys())) {
                                jy3.e = true;
                                // MONITOREXIT : this
                            } else {
                                long l10;
                                jy3.d(this.m[n13]);
                                jy3.f = l10 = this.n[n13];
                                if (l10 < this.t) {
                                    jy3.b(Integer.MIN_VALUE);
                                }
                                object.a = this.l[n13];
                                object.b = this.k[n13];
                                object.c = this.o[n13];
                                // MONITOREXIT : this
                                break block15;
                            }
                        }
                        this.a(cc02, dc02);
                        // MONITOREXIT : this
                        n13 = n14;
                        break block16;
                    }
                    if (bl2 || this.w) break block19;
                    object = this.z;
                    if (object != null && (n13 != 0 || object != this.g)) {
                        this.a((cc0)object, dc02);
                        // MONITOREXIT : this
                        n13 = n14;
                        break block16;
                    } else {
                        // MONITOREXIT : this
                        n13 = -3;
                    }
                    break block16;
                }
                jy3.d(4);
                // MONITOREXIT : this
            }
            n13 = -4;
        }
        if (n13 != -4) return n13;
        if (jy3.f()) return n13;
        if ((n10 & 1) != 0) {
            bl3 = true;
        }
        if ((n10 & 4) == 0) {
            if (bl3) {
                this.a.a(jy3, this.b);
            } else {
                this.a.b(jy3, this.b);
            }
        }
        if (bl3) return n13;
        ++this.s;
        return n13;
    }

    public final int a(iv iv3, int n10, boolean bl2) throws IOException {
        return this.a.a(iv3, n10, bl2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        long l10;
        nt1 nt12 = this.a;
        synchronized (this) {
            int n10 = this.p;
            if (n10 == 0) {
                // MONITOREXIT @DISABLED, blocks:[2, 4] lbl5 : MonitorExitStatement: MONITOREXIT : this
                l10 = -1L;
            } else {
                l10 = this.a(n10);
            }
        }
        nt12.a(l10);
    }

    public /* synthetic */ void a(int n10, bg1 bg12) {
        mt2.a((g62)this, (int)n10, (bg1)bg12);
    }

    public final void a(long l10) {
        this.t = l10;
    }

    public final void a(long l10, int n10, int n13, int n14, @Nullable g62.a a14) {
        int n15 = n10 & 1;
        int n16 = n15 != 0 ? 1 : 0;
        if (this.x) {
            if (n16 == 0) {
                return;
            }
            this.x = false;
        }
        n16 = n10;
        if (this.A) {
            if (l10 < this.t) {
                return;
            }
            n16 = n10;
            if (n15 == 0) {
                if (!this.B) {
                    StringBuilder stringBuilder = new StringBuilder("Overriding unexpected non-sync sample for format: ");
                    stringBuilder.append(this.z);
                    zs0.d((String)"SampleQueue", (String)stringBuilder.toString());
                    this.B = true;
                }
                n16 = n10 | 1;
            }
        }
        this.a(l10, n16, this.a.a() - (long)n13 - (long)n14, n13, a14);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(long var1_1, boolean var3_2, boolean var4_3) {
        block7: {
            block8: {
                var12_4 = this.a;
                synchronized (this) {
                    var6_5 = this.p;
                    var9_6 = -1L;
                    if (var6_5 == 0 || var1_1 < (var11_7 = this.n)[var7_9 = this.r]) break block8;
                    var5_10 = var6_5;
                    if (!var4_3) ** GOTO lbl14
                    var8_11 = this.s;
                    var5_10 = var6_5;
                    if (var8_11 != var6_5) {
                        var5_10 = var8_11 + 1;
                    }
lbl14:
                    // 4 sources

                    if ((var5_10 = this.a(var7_9, var5_10, var1_1, var3_2)) != -1) ** break block6
                }
                var1_1 = var9_6;
                break block7;
                {
                    try {
                        var1_1 = this.a(var5_10);
                        break block7;
                    }
                    catch (Throwable var11_8) {}
                    ** break block9
                }
            }
            var1_1 = var9_6;
        }
        var12_4.a(var1_1);
        return;
lbl-1000:
        // 1 sources

        {
            throw var11_8;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a(cc0 cc02) {
        boolean bl2;
        block5: {
            block4: {
                // MONITORENTER : this
                bl2 = false;
                this.y = false;
                boolean bl3 = m92.a((Object)cc02, (Object)this.z);
                if (!bl3) break block4;
                break block5;
            }
            this.z = !this.c.c() && (this.c.b()).a.equals(cc02) ? (this.c.b()).a : cc02;
            cc02 = this.z;
            this.A = w01.a((String)cc02.m, (String)cc02.j);
            this.B = false;
            // MONITOREXIT : this
            bl2 = true;
        }
        cc02 = this.f;
        if (cc02 == null) return;
        if (!bl2) return;
        ((im1)((Object)cc02)).h();
    }

    public final void a(@Nullable c c11) {
        this.f = c11;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @CallSuper
    public final boolean a(boolean bl2) {
        synchronized (this) {
            Throwable throwable2;
            boolean bl3;
            block5: {
                cc0 cc02;
                boolean bl4;
                int n10;
                block6: {
                    try {
                        int n13 = this.s;
                        n10 = this.p;
                        bl3 = false;
                        bl4 = false;
                        if (n13 == n10) break block5;
                        cc02 = (this.c.b((int)(this.q + n13))).a;
                        cc0 cc03 = this.g;
                        if (cc02 == cc03) break block6;
                    }
                    catch (Throwable throwable2) {}
                    return true;
                }
                n10 = this.c(this.s);
                cc02 = this.h;
                if (cc02 == null) return true;
                if (cc02.getState() == 4) return true;
                bl2 = bl4;
                if ((this.m[n10] & 0x40000000) != 0) return bl2;
                bl3 = this.h.playClearSamplesWithoutKeys();
                bl2 = bl4;
                if (!bl3) return bl2;
                return true;
            }
            if (bl2) return true;
            if (this.w) return true;
            cc0 cc04 = this.z;
            bl2 = bl3;
            if (cc04 == null) return bl2;
            cc0 cc05 = this.g;
            bl2 = bl3;
            if (cc04 == cc05) return bl2;
            return true;
            throw throwable2;
        }
    }

    public /* synthetic */ int b(iv iv3, int n10, boolean bl2) {
        return mt2.b((g62)this, (iv)iv3, (int)n10, (boolean)bl2);
    }

    public final long b() {
        synchronized (this) {
            long l10 = this.v;
            return l10;
        }
    }

    public final void b(int n10, bg1 bg12) {
        this.a.a(n10, bg12);
    }

    @CallSuper
    public final void b(boolean bl2) {
        this.a.b();
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = true;
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = false;
        this.c.a();
        if (bl2) {
            this.z = null;
            this.y = true;
        }
    }

    public final boolean b(long l10, boolean bl2) {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                block6: {
                    int n10;
                    block7: {
                        int n13;
                        int n14;
                        try {
                            this.j();
                            n14 = this.c(this.s);
                            n10 = this.s;
                            n13 = this.p;
                            if (n10 == n13) break block6;
                        }
                        catch (Throwable throwable2) {}
                        if (l10 < this.n[n14] || l10 > this.v && !bl2) break block6;
                        n10 = this.a(n14, n13 - n10, l10, true);
                        if (n10 != -1) break block7;
                        return false;
                    }
                    this.t = l10;
                    this.s += n10;
                    return true;
                    break block8;
                }
                return false;
            }
            throw throwable2;
        }
    }

    public final int c() {
        return this.q + this.s;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public final cc0 d() {
        synchronized (this) {
            block4: {
                if (!this.y) break block4;
                return null;
            }
            return this.z;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(int n10) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                if (n10 >= 0) {
                    try {
                        n10 = this.s + n10;
                        if (n10 <= this.p) {
                            this.s = n10;
                            return;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
                throw illegalArgumentException;
            }
            throw throwable2;
        }
    }

    public final int e() {
        return this.q + this.p;
    }

    public final boolean f() {
        synchronized (this) {
            boolean bl2 = this.w;
            return bl2;
        }
    }

    @CallSuper
    public final void g() throws IOException {
        Object object = this.h;
        if (object != null && object.getState() == 1) {
            object = this.h.getError();
            object.getClass();
            throw object;
        }
    }

    @CallSuper
    public final void h() {
        this.a();
        z30 z302 = this.h;
        if (z302 != null) {
            z302.a(this.e);
            this.h = null;
            this.g = null;
        }
    }

    @CallSuper
    public final void i() {
        this.b(true);
        z30 z302 = this.h;
        if (z302 != null) {
            z302.a(this.e);
            this.h = null;
            this.g = null;
        }
    }
}


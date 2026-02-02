/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.bv0
 *  com.yandex.mobile.ads.impl.dc0
 *  com.yandex.mobile.ads.impl.dp1
 *  com.yandex.mobile.ads.impl.ep1
 *  com.yandex.mobile.ads.impl.mi1
 *  com.yandex.mobile.ads.impl.pt1
 *  com.yandex.mobile.ads.impl.xr2
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.bv0;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.cp1;
import com.yandex.mobile.ads.impl.dc0;
import com.yandex.mobile.ads.impl.dp1;
import com.yandex.mobile.ads.impl.ep1;
import com.yandex.mobile.ads.impl.g60;
import com.yandex.mobile.ads.impl.jy;
import com.yandex.mobile.ads.impl.mi1;
import com.yandex.mobile.ads.impl.pt1;
import com.yandex.mobile.ads.impl.xr2;
import java.io.IOException;

public abstract class ck
implements cp1,
dp1 {
    private final int b;
    private final dc0 c;
    @Nullable
    private ep1 d;
    private int e;
    private mi1 f;
    private int g;
    @Nullable
    private pt1 h;
    @Nullable
    private cc0[] i;
    private long j;
    private long k;
    private boolean l;
    private boolean m;

    public ck(int n10) {
        this.b = n10;
        this.c = new dc0();
        this.k = Long.MIN_VALUE;
    }

    protected final int a(dc0 dc02, jy object, int n10) {
        pt1 pt12 = this.h;
        pt12.getClass();
        int n12 = pt12.a(dc02, (jy)((Object)object), n10);
        n10 = -4;
        if (n12 == -4) {
            long l10;
            if (object.f()) {
                this.k = Long.MIN_VALUE;
                if (!this.l) {
                    n10 = -3;
                }
                return n10;
            }
            ((jy)((Object)object)).f = l10 = ((jy)((Object)object)).f + this.j;
            this.k = Math.max(this.k, l10);
        } else if (n12 == -5) {
            object = dc02.b;
            object.getClass();
            if (((cc0)object).q != Long.MAX_VALUE) {
                dc02.b = ((cc0)object).a().a(((cc0)object).q + this.j).a();
            }
        }
        return n12;
    }

    protected final g60 a(int n10, @Nullable cc0 cc02, Exception exception, boolean bl2) {
        int n12;
        block4: {
            if (cc02 != null && !this.m) {
                this.m = true;
                try {
                    n12 = this.a(cc02);
                    n12 &= 7;
                    this.m = false;
                    break block4;
                }
                catch (Throwable throwable) {
                    this.m = false;
                    throw throwable;
                }
                catch (g60 g602) {
                    this.m = false;
                }
            }
            n12 = 4;
        }
        return g60.a(exception, this.getName(), this.e, cc02, n12, bl2, n10);
    }

    protected final g60 a(Exception exception, @Nullable cc0 cc02, int n10) {
        return this.a(n10, cc02, exception, false);
    }

    @Override
    public /* synthetic */ void a(float f10, float f11) {
        xr2.a((cp1)this, (float)f10, (float)f11);
    }

    @Override
    public final void a(int n10, mi1 mi12) {
        this.e = n10;
        this.f = mi12;
    }

    public void a(int n10, @Nullable Object object) throws g60 {
    }

    @Override
    public final void a(long l10) throws g60 {
        this.l = false;
        this.k = l10;
        this.a(l10, false);
    }

    protected abstract void a(long var1, boolean var3) throws g60;

    @Override
    public final void a(ep1 ep12, cc0[] cc0Array, pt1 pt12, long l10, boolean bl2, boolean bl3, long l11, long l13) throws g60 {
        if (this.g == 0) {
            this.d = ep12;
            this.g = 1;
            this.a(bl2, bl3);
            this.a(cc0Array, pt12, l11, l13);
            this.l = false;
            this.k = l10;
            this.a(l10, bl2);
            return;
        }
        throw new IllegalStateException();
    }

    protected void a(boolean bl2, boolean bl3) throws g60 {
    }

    protected abstract void a(cc0[] var1, long var2, long var4) throws g60;

    @Override
    public final void a(cc0[] cc0Array, pt1 pt12, long l10, long l11) throws g60 {
        if (this.l ^ true) {
            this.h = pt12;
            if (this.k == Long.MIN_VALUE) {
                this.k = l10;
            }
            this.i = cc0Array;
            this.j = l11;
            this.a(cc0Array, l10, l11);
            return;
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean a() {
        return this.e();
    }

    protected final int b(long l10) {
        pt1 pt12 = this.h;
        pt12.getClass();
        return pt12.a(l10 - this.j);
    }

    @Override
    public final void b() {
        if (this.g == 0) {
            dc0 dc02 = this.c;
            dc02.a = null;
            dc02.b = null;
            this.v();
            return;
        }
        throw new IllegalStateException();
    }

    @Override
    public final void c() {
        if (this.g == 1) {
            dc0 dc02 = this.c;
            dc02.a = null;
            dc02.b = null;
            this.g = 0;
            this.h = null;
            this.i = null;
            this.l = false;
            this.u();
            return;
        }
        throw new IllegalStateException();
    }

    @Override
    public final boolean e() {
        boolean bl2 = this.k == Long.MIN_VALUE;
        return bl2;
    }

    public int f() throws g60 {
        return 0;
    }

    @Override
    @Nullable
    public final pt1 g() {
        return this.h;
    }

    @Override
    public final int getState() {
        return this.g;
    }

    @Override
    public final void h() {
        this.l = true;
    }

    @Override
    public final void i() throws IOException {
        pt1 pt12 = this.h;
        pt12.getClass();
        pt12.a();
    }

    @Override
    public final long j() {
        return this.k;
    }

    @Override
    public final boolean k() {
        return this.l;
    }

    @Override
    @Nullable
    public bv0 l() {
        return null;
    }

    @Override
    public final int m() {
        return this.b;
    }

    @Override
    public final ck n() {
        return this;
    }

    protected final ep1 p() {
        ep1 ep12 = this.d;
        ep12.getClass();
        return ep12;
    }

    protected final dc0 q() {
        dc0 dc02 = this.c;
        dc02.a = null;
        dc02.b = null;
        return dc02;
    }

    protected final mi1 r() {
        mi1 mi12 = this.f;
        mi12.getClass();
        return mi12;
    }

    protected final cc0[] s() {
        cc0[] cc0Array = this.i;
        cc0Array.getClass();
        return cc0Array;
    }

    @Override
    public final void start() throws g60 {
        if (this.g == 1) {
            this.g = 2;
            this.w();
            return;
        }
        throw new IllegalStateException();
    }

    @Override
    public final void stop() {
        if (this.g == 2) {
            this.g = 1;
            this.x();
            return;
        }
        throw new IllegalStateException();
    }

    protected final boolean t() {
        boolean bl2;
        if (this.e()) {
            bl2 = this.l;
        } else {
            pt1 pt12 = this.h;
            pt12.getClass();
            bl2 = pt12.d();
        }
        return bl2;
    }

    protected abstract void u();

    protected void v() {
    }

    protected void w() throws g60 {
    }

    protected void x() {
    }
}


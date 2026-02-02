/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.b40
 *  com.yandex.mobile.ads.impl.by2
 *  com.yandex.mobile.ads.impl.c40
 *  com.yandex.mobile.ads.impl.ew0$f
 *  com.yandex.mobile.ads.impl.hm1
 *  com.yandex.mobile.ads.impl.hm1$a
 *  com.yandex.mobile.ads.impl.im1$b
 *  com.yandex.mobile.ads.impl.k72
 *  com.yandex.mobile.ads.impl.lv$a
 *  com.yandex.mobile.ads.impl.mi1
 *  com.yandex.mobile.ads.impl.qw0$a
 *  com.yandex.mobile.ads.impl.uf
 *  com.yandex.mobile.ads.impl.vc
 *  com.yandex.mobile.ads.impl.x70
 *  com.yandex.mobile.ads.impl.yr0
 */
package com.yandex.mobile.ads.impl;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ay2;
import com.yandex.mobile.ads.impl.b40;
import com.yandex.mobile.ads.impl.by2;
import com.yandex.mobile.ads.impl.c40;
import com.yandex.mobile.ads.impl.ew0;
import com.yandex.mobile.ads.impl.ez1;
import com.yandex.mobile.ads.impl.hm1;
import com.yandex.mobile.ads.impl.im1;
import com.yandex.mobile.ads.impl.jm1;
import com.yandex.mobile.ads.impl.k72;
import com.yandex.mobile.ads.impl.kw0;
import com.yandex.mobile.ads.impl.l52;
import com.yandex.mobile.ads.impl.lv;
import com.yandex.mobile.ads.impl.lz;
import com.yandex.mobile.ads.impl.mi1;
import com.yandex.mobile.ads.impl.qw0;
import com.yandex.mobile.ads.impl.uf;
import com.yandex.mobile.ads.impl.vc;
import com.yandex.mobile.ads.impl.vz;
import com.yandex.mobile.ads.impl.x70;
import com.yandex.mobile.ads.impl.yl;
import com.yandex.mobile.ads.impl.yr0;
import com.yandex.mobile.ads.impl.zj;

public final class km1
extends zj
implements im1.b {
    private final ew0 h;
    private final ew0.f i;
    private final lv.a j;
    private final hm1.a k;
    private final b40 l;
    private final yr0 m;
    private final int n;
    private boolean o;
    private long p;
    private boolean q;
    private boolean r;
    @Nullable
    private k72 s;

    private km1(ew0 ew02, lv.a a13, hm1.a a14, b40 b402, yr0 yr02, int n10) {
        this.i = uf.a((Object)((Object)ew02.c));
        this.h = ew02;
        this.j = a13;
        this.k = a14;
        this.l = b402;
        this.m = yr02;
        this.n = n10;
        this.o = true;
        this.p = -9223372036854775807L;
    }

    /* synthetic */ km1(ew0 ew02, lv.a a13, hm1.a a14, b40 b402, yr0 yr02, int n10, by2 by22) {
        this(ew02, a13, a14, b402, yr02, n10);
    }

    public final kw0 a(qw0.b b10, vc vc3, long l10) {
        lv lv2 = this.j.a();
        k72 k722 = this.s;
        if (k722 != null) {
            lv2.a(k722);
        }
        return new im1(this.i.a, lv2, this.k.a(this.c()), this.l, this.a(b10), this.m, this.b(b10), this, vc3, this.i.e, this.n);
    }

    public final void a(long l10, boolean bl2, boolean bl3) {
        ez1 ez12;
        long l11 = l10;
        if (l10 == -9223372036854775807L) {
            l11 = this.p;
        }
        if (!this.o && this.p == l11 && this.q == bl2 && this.r == bl3) {
            return;
        }
        this.p = l11;
        this.q = bl2;
        this.r = bl3;
        this.o = false;
        l10 = this.p;
        l52 l522 = ez12 = new ez1(l10, l10, this.q, this.r, this.h);
        if (this.o) {
            l522 = new jm1(ez12);
        }
        this.a(l522);
    }

    @Override
    protected final void a(@Nullable k72 object) {
        this.s = object;
        this.l.prepare();
        Object object2 = this.l;
        object = Looper.myLooper();
        object.getClass();
        object2.a((Looper)object, this.c());
        long l10 = this.p;
        object2 = new ez1(l10, l10, this.q, this.r, this.h);
        object = object2;
        if (this.o) {
            object = new jm1((ez1)object2);
        }
        this.a((l52)object);
    }

    public final void a(kw0 kw02) {
        ((im1)kw02).i();
    }

    @Override
    protected final void e() {
        this.l.release();
    }

    public final ew0 getMediaItem() {
        return this.h;
    }

    public final void maybeThrowSourceInfoRefreshError() {
    }

    public static final class a
    implements qw0.a {
        private final lv.a a;
        private hm1.a b;
        private c40 c;
        private yr0 d;

        public a(lv.a a13, hm1.a a14) {
            this(a13, a14, new lz(), new vz());
        }

        public a(lv.a a13, hm1.a a14, lz lz3, vz vz2) {
            this.a = a13;
            this.b = a14;
            this.c = lz3;
            this.d = vz2;
        }

        public a(lv.a a13, x70 x702) {
            this(a13, new ay2(x702));
        }

        private static /* synthetic */ hm1 a(x70 x702, mi1 mi12) {
            return new yl(x702);
        }

        public static /* synthetic */ hm1 b(x70 x702, mi1 mi12) {
            return com.yandex.mobile.ads.impl.km1$a.a(x702, mi12);
        }

        public final km1 a(ew0 ew02) {
            ((Object)((Object)ew02.c)).getClass();
            Object object = ew02.c.g;
            return new km1(ew02, this.a, this.b, this.c.a(ew02), this.d, 0x100000, null);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.bt0
 *  com.yandex.mobile.ads.impl.ex1$a
 *  com.yandex.mobile.ads.impl.gx1
 *  com.yandex.mobile.ads.impl.m92
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bt0;
import com.yandex.mobile.ads.impl.ex1;
import com.yandex.mobile.ads.impl.gx1;
import com.yandex.mobile.ads.impl.hx1;
import com.yandex.mobile.ads.impl.m92;

final class nk0
implements hx1 {
    private final long a;
    private final bt0 b;
    private final bt0 c;
    private long d;

    public nk0(long l10, long l11, long l13) {
        bt0 bt02;
        bt0 bt03;
        this.d = l10;
        this.a = l13;
        this.b = bt03 = new bt0();
        this.c = bt02 = new bt0();
        bt03.a(0L);
        bt02.a(l11);
    }

    @Override
    public final long a() {
        return this.a;
    }

    @Override
    public final long a(long l10) {
        int n10 = m92.a((bt0)this.c, (long)l10);
        return this.b.a(n10);
    }

    public final void a(long l10, long l11) {
        if (this.c(l10)) {
            return;
        }
        this.b.a(l10);
        this.c.a(l11);
    }

    public final ex1.a b(long l10) {
        int n10 = m92.a((bt0)this.b, (long)l10);
        long l11 = this.b.a(n10);
        gx1 gx12 = new gx1(l11, this.c.a(n10));
        if (l11 != l10 && n10 != this.b.a() - 1) {
            bt0 bt02 = this.b;
            return new ex1.a(gx12, new gx1(bt02.a(++n10), this.c.a(n10)));
        }
        return new ex1.a(gx12, gx12);
    }

    public final boolean b() {
        return true;
    }

    public final long c() {
        return this.d;
    }

    public final boolean c(long l10) {
        bt0 bt02 = this.b;
        int n10 = bt02.a();
        boolean bl2 = true;
        if (l10 - bt02.a(n10 - 1) >= 100000L) {
            bl2 = false;
        }
        return bl2;
    }

    final void d(long l10) {
        this.d = l10;
    }
}


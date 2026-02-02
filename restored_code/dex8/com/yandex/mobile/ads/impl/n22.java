/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.bv0
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.xo
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.b42;
import com.yandex.mobile.ads.impl.bi1;
import com.yandex.mobile.ads.impl.bv0;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.xo;

public final class n22
implements bv0 {
    private final xo b;
    private boolean c;
    private long d;
    private long e;
    private bi1 f;

    public n22(b42 b422) {
        this.b = b422;
        this.f = bi1.e;
    }

    public final void a() {
        if (!this.c) {
            this.e = this.b.b();
            this.c = true;
        }
    }

    public final void a(long l10) {
        this.d = l10;
        if (this.c) {
            this.e = this.b.b();
        }
    }

    public final void a(bi1 bi12) {
        if (this.c) {
            this.a(this.o());
        }
        this.f = bi12;
    }

    public final void b() {
        if (this.c) {
            this.a(this.o());
            this.c = false;
        }
    }

    public final bi1 getPlaybackParameters() {
        return this.f;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final long o() {
        long l10;
        long l11 = l10 = this.d;
        if (!this.c) return l11;
        l11 = this.b.b() - this.e;
        bi1 bi12 = this.f;
        if (bi12.b == 1.0f) {
            l11 = m92.a((long)l11);
            return l10 + l11;
        }
        l11 = bi12.a(l11);
        return l10 + l11;
    }
}


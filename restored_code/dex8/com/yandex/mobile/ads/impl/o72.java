/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.jh$a
 *  com.yandex.mobile.ads.impl.jh$b
 *  com.yandex.mobile.ads.impl.m92
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.jh;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.sj;
import java.nio.ByteBuffer;

final class o72
extends sj {
    private int i;
    private int j;
    private boolean k;
    private int l;
    private byte[] m = m92.f;
    private int n;
    private long o;

    public final void a(int n10, int n13) {
        this.i = n10;
        this.j = n13;
    }

    public final void a(ByteBuffer byteBuffer) {
        int n10 = byteBuffer.position();
        int n13 = byteBuffer.limit();
        int n14 = n13 - n10;
        if (n14 == 0) {
            return;
        }
        int n15 = Math.min(n14, this.l);
        this.o += (long)(n15 / this.b.d);
        this.l -= n15;
        byteBuffer.position(n10 + n15);
        if (this.l > 0) {
            return;
        }
        n10 = n14 - n15;
        n14 = this.n + n10 - this.m.length;
        ByteBuffer byteBuffer2 = this.a(n14);
        int n16 = this.n;
        n15 = m92.a;
        n15 = Math.max(0, Math.min(n14, n16));
        byteBuffer2.put(this.m, 0, n15);
        n14 = Math.max(0, Math.min(n14 - n15, n10));
        byteBuffer.limit(byteBuffer.position() + n14);
        byteBuffer2.put(byteBuffer);
        byteBuffer.limit(n13);
        this.n = n13 = this.n - n15;
        byte[] byArray = this.m;
        System.arraycopy(byArray, n15, byArray, 0, n13);
        byteBuffer.get(this.m, this.n, n10 -= n14);
        this.n += n10;
        byteBuffer2.flip();
    }

    @Override
    public final boolean a() {
        boolean bl2 = super.a() && this.n == 0;
        return bl2;
    }

    @Override
    public final jh.a b(jh.a a14) throws jh.b {
        if (a14.c == 2) {
            this.k = true;
            jh.a a15 = a14;
            if (this.i == 0) {
                a15 = this.j != 0 ? a14 : jh.a.e;
            }
            return a15;
        }
        throw new jh.b(a14);
    }

    @Override
    public final ByteBuffer c() {
        int n10;
        if (super.a() && (n10 = this.n) > 0) {
            this.a(n10).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.c();
    }

    @Override
    protected final void f() {
        if (this.k) {
            this.k = false;
            int n10 = this.j;
            int n13 = this.b.d;
            this.m = new byte[n10 * n13];
            this.l = this.i * n13;
        }
        this.n = 0;
    }

    @Override
    protected final void g() {
        if (this.k) {
            int n10 = this.n;
            if (n10 > 0) {
                this.o += (long)(n10 / this.b.d);
            }
            this.n = 0;
        }
    }

    @Override
    protected final void h() {
        this.m = m92.f;
    }

    public final long i() {
        return this.o;
    }

    public final void j() {
        this.o = 0L;
    }
}


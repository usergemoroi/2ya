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

public final class ly1
extends sj {
    private final long i;
    private final long j;
    private final short k = (short)1024;
    private int l;
    private boolean m;
    private byte[] n;
    private byte[] o;
    private int p;
    private int q;
    private int r;
    private boolean s;
    private long t;

    public ly1(int n10) {
        this.i = 150000L;
        this.j = 20000L;
        byte[] byArray = m92.f;
        this.n = byArray;
        this.o = byArray;
    }

    public final void a(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !this.e()) {
            int n10;
            int n13;
            block19: {
                int n14;
                n13 = this.p;
                if (n13 != 0) {
                    int n15;
                    int n16;
                    byte[] byArray;
                    block18: {
                        if (n13 != 1) {
                            if (n13 == 2) {
                                block17: {
                                    n10 = byteBuffer.limit();
                                    for (n13 = byteBuffer.position(); n13 < byteBuffer.limit(); n13 += 2) {
                                        if (Math.abs(byteBuffer.getShort(n13)) <= this.k) continue;
                                        n14 = this.l;
                                        n13 = n13 / n14 * n14;
                                        break block17;
                                    }
                                    n13 = byteBuffer.limit();
                                }
                                byteBuffer.limit(n13);
                                this.t += (long)(byteBuffer.remaining() / this.l);
                                byArray = this.o;
                                n16 = this.r;
                                n15 = Math.min(byteBuffer.remaining(), this.r);
                                n14 = this.r - n15;
                                System.arraycopy(byArray, n16 - n14, this.o, 0, n14);
                                byteBuffer.position(byteBuffer.limit() - n15);
                                byteBuffer.get(this.o, n14, n15);
                                if (n13 >= n10) continue;
                                byArray = this.o;
                                n13 = this.r;
                                this.a(n13).put(byArray, 0, n13).flip();
                                if (n13 > 0) {
                                    this.s = true;
                                }
                                this.p = 0;
                                byteBuffer.limit(n10);
                                continue;
                            }
                            throw new IllegalStateException();
                        }
                        n10 = byteBuffer.limit();
                        for (n13 = byteBuffer.position(); n13 < byteBuffer.limit(); n13 += 2) {
                            if (Math.abs(byteBuffer.getShort(n13)) <= this.k) continue;
                            n14 = this.l;
                            n13 = n13 / n14 * n14;
                            break block18;
                        }
                        n13 = byteBuffer.limit();
                    }
                    n15 = n13 - byteBuffer.position();
                    byArray = this.n;
                    n16 = byArray.length;
                    n14 = this.q;
                    if (n13 < n10 && n15 < (n16 -= n14)) {
                        this.a(n14).put(byArray, 0, n14).flip();
                        if (n14 > 0) {
                            this.s = true;
                        }
                        this.q = 0;
                        this.p = 0;
                        continue;
                    }
                    n13 = Math.min(n15, n16);
                    byteBuffer.limit(byteBuffer.position() + n13);
                    byteBuffer.get(this.n, this.q, n13);
                    this.q = n13 = this.q + n13;
                    byArray = this.n;
                    if (n13 == byArray.length) {
                        if (this.s) {
                            n13 = this.r;
                            this.a(n13).put(byArray, 0, n13).flip();
                            if (n13 > 0) {
                                this.s = true;
                            }
                            this.t += (long)((this.q - this.r * 2) / this.l);
                        } else {
                            this.t += (long)((n13 - this.r) / this.l);
                        }
                        byArray = this.n;
                        n15 = this.q;
                        n14 = Math.min(byteBuffer.remaining(), this.r);
                        n13 = this.r - n14;
                        System.arraycopy(byArray, n15 - n13, this.o, 0, n13);
                        byteBuffer.position(byteBuffer.limit() - n14);
                        byteBuffer.get(this.o, n13, n14);
                        this.q = 0;
                        this.p = 2;
                    }
                    byteBuffer.limit(n10);
                    continue;
                }
                n10 = byteBuffer.limit();
                byteBuffer.limit(Math.min(n10, byteBuffer.position() + this.n.length));
                for (n13 = byteBuffer.limit() - 2; n13 >= byteBuffer.position(); n13 -= 2) {
                    if (Math.abs(byteBuffer.getShort(n13)) <= this.k) continue;
                    n14 = this.l;
                    n13 = n13 / n14 * n14 + n14;
                    break block19;
                }
                n13 = byteBuffer.position();
            }
            if (n13 == byteBuffer.position()) {
                this.p = 1;
            } else {
                byteBuffer.limit(n13);
                n13 = byteBuffer.remaining();
                this.a(n13).put(byteBuffer).flip();
                if (n13 > 0) {
                    this.s = true;
                }
            }
            byteBuffer.limit(n10);
        }
    }

    public final void a(boolean bl2) {
        this.m = bl2;
    }

    @Override
    public final jh.a b(jh.a a13) throws jh.b {
        if (a13.c == 2) {
            if (!this.m) {
                a13 = jh.a.e;
            }
            return a13;
        }
        throw new jh.b(a13);
    }

    @Override
    protected final void f() {
        if (this.m) {
            int n10;
            jh.a a13 = this.b;
            this.l = n10 = a13.d;
            long l10 = this.i;
            long l11 = a13.a;
            int n13 = (int)(l10 * l11 / 1000000L) * n10;
            if (this.n.length != n13) {
                this.n = new byte[n13];
            }
            this.r = n10 = (int)(this.j * l11 / 1000000L) * n10;
            if (this.o.length != n10) {
                this.o = new byte[n10];
            }
        }
        this.p = 0;
        this.t = 0L;
        this.q = 0;
        this.s = false;
    }

    @Override
    protected final void g() {
        int n10 = this.q;
        if (n10 > 0) {
            byte[] byArray = this.n;
            this.a(n10).put(byArray, 0, n10).flip();
            if (n10 > 0) {
                this.s = true;
            }
        }
        if (!this.s) {
            this.t += (long)(this.r / this.l);
        }
    }

    @Override
    protected final void h() {
        this.m = false;
        this.r = 0;
        byte[] byArray = m92.f;
        this.n = byArray;
        this.o = byArray;
    }

    public final long i() {
        return this.t;
    }

    @Override
    public final boolean isActive() {
        return this.m;
    }
}


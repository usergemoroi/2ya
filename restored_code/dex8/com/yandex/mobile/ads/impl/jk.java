/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.IntRange
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.IntRange;
import com.yandex.mobile.ads.impl.jy;
import java.nio.ByteBuffer;

final class jk
extends jy {
    private long j;
    private int k;
    private int l = 32;

    public jk() {
        super(2);
    }

    public final boolean a(jy jy2) {
        block7: {
            block8: {
                block9: {
                    int n10;
                    ByteBuffer byteBuffer;
                    block10: {
                        block11: {
                            ByteBuffer byteBuffer2;
                            if (!(jy2.i() ^ true)) break block7;
                            if (!(jy2.d() ^ true)) break block8;
                            if (!(jy2.f() ^ true)) break block9;
                            if (!this.m()) break block10;
                            if (this.k >= this.l || jy2.e() != this.e()) break block11;
                            byteBuffer = jy2.d;
                            if (byteBuffer == null || (byteBuffer2 = this.d) == null) break block10;
                            n10 = byteBuffer2.position();
                            if (byteBuffer.remaining() + n10 <= 0x2EE000) break block10;
                        }
                        return false;
                    }
                    n10 = this.k;
                    this.k = n10 + 1;
                    if (n10 == 0) {
                        this.f = jy2.f;
                        if (jy2.g()) {
                            this.d(1);
                        }
                    }
                    if (jy2.e()) {
                        this.d(Integer.MIN_VALUE);
                    }
                    if ((byteBuffer = jy2.d) != null) {
                        this.e(byteBuffer.remaining());
                        this.d.put(byteBuffer);
                    }
                    this.j = jy2.f;
                    return true;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final void b() {
        super.b();
        this.k = 0;
    }

    public final void f(@IntRange(from=1L) int n10) {
        if (n10 > 0) {
            this.l = n10;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final long k() {
        return this.j;
    }

    public final int l() {
        return this.k;
    }

    public final boolean m() {
        boolean bl2 = this.k > 0;
        return bl2;
    }
}


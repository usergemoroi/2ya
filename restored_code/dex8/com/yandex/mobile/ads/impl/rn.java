/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.jh$a
 *  com.yandex.mobile.ads.impl.jh$b
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.jh;
import com.yandex.mobile.ads.impl.sj;
import java.nio.ByteBuffer;

final class rn
extends sj {
    @Nullable
    private int[] i;
    @Nullable
    private int[] j;

    rn() {
    }

    public final void a(ByteBuffer byteBuffer) {
        int n10;
        int[] nArray = this.j;
        nArray.getClass();
        int n13 = byteBuffer.limit();
        ByteBuffer byteBuffer2 = this.a((n13 - n10) / this.b.d * this.c.d);
        for (n10 = byteBuffer.position(); n10 < n13; n10 += this.b.d) {
            int n14 = nArray.length;
            for (int i14 = 0; i14 < n14; ++i14) {
                byteBuffer2.putShort(byteBuffer.getShort(nArray[i14] * 2 + n10));
            }
        }
        byteBuffer.position(n13);
        byteBuffer2.flip();
    }

    public final void a(@Nullable int[] nArray) {
        this.i = nArray;
    }

    @Override
    public final jh.a b(jh.a a14) throws jh.b {
        int[] nArray = this.i;
        if (nArray == null) {
            return jh.a.e;
        }
        if (a14.c == 2) {
            int n10 = a14.b != nArray.length ? 1 : 0;
            for (int i14 = 0; i14 < nArray.length; ++i14) {
                int n13 = nArray[i14];
                if (n13 < a14.b) {
                    n13 = n13 != i14 ? 1 : 0;
                    n10 |= n13;
                    continue;
                }
                throw new jh.b(a14);
            }
            a14 = n10 != 0 ? new jh.a(a14.a, nArray.length, 2) : jh.a.e;
            return a14;
        }
        throw new jh.b(a14);
    }

    @Override
    protected final void f() {
        this.j = this.i;
    }

    @Override
    protected final void h() {
        this.j = null;
        this.i = null;
    }
}


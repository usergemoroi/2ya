/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.jh$a
 *  com.yandex.mobile.ads.impl.jh$b
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.jh;
import com.yandex.mobile.ads.impl.sj;
import java.nio.ByteBuffer;

final class vb0
extends sj {
    private static final int i = Float.floatToIntBits(Float.NaN);

    vb0() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void a(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int n10 = byteBuffer.position();
        int n13 = byteBuffer.limit();
        int n14 = n13 - n10;
        int n15 = this.b.c;
        if (n15 != 0x20000000) {
            if (n15 != 0x30000000) throw new IllegalStateException();
            ByteBuffer byteBuffer3 = this.a(n14);
            while (true) {
                byteBuffer2 = byteBuffer3;
                if (n10 < n13) {
                    n14 = n15 = Float.floatToIntBits((float)((double)(byteBuffer.get(n10) & 0xFF | (byteBuffer.get(n10 + 1) & 0xFF) << 8 | (byteBuffer.get(n10 + 2) & 0xFF) << 16 | (byteBuffer.get(n10 + 3) & 0xFF) << 24) * 4.656612875245797E-10));
                    if (n15 == i) {
                        n14 = Float.floatToIntBits(0.0f);
                    }
                    byteBuffer3.putInt(n14);
                    n10 += 4;
                    continue;
                }
                break;
            }
        } else {
            ByteBuffer byteBuffer4 = this.a(n14 / 3 * 4);
            while (true) {
                byteBuffer2 = byteBuffer4;
                if (n10 >= n13) break;
                n14 = n15 = Float.floatToIntBits((float)((double)((byteBuffer.get(n10) & 0xFF) << 8 | (byteBuffer.get(n10 + 1) & 0xFF) << 16 | (byteBuffer.get(n10 + 2) & 0xFF) << 24) * 4.656612875245797E-10));
                if (n15 == i) {
                    n14 = Float.floatToIntBits(0.0f);
                }
                byteBuffer4.putInt(n14);
                n10 += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }

    @Override
    public final jh.a b(jh.a a14) throws jh.b {
        int n10 = a14.c;
        if (n10 != 0x20000000 && n10 != 0x30000000 && n10 != 4) {
            throw new jh.b(a14);
        }
        a14 = n10 != 4 ? new jh.a(a14.a, a14.b, 4) : jh.a.e;
        return a14;
    }
}


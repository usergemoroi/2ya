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

final class wq1
extends sj {
    wq1() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void a(ByteBuffer byteBuffer) {
        int n10;
        int n13;
        int n14;
        int n15;
        block16: {
            block15: {
                block14: {
                    block17: {
                        n15 = byteBuffer.position();
                        n14 = byteBuffer.limit();
                        n13 = n14 - n15;
                        int n16 = this.b.c;
                        n10 = n13;
                        if (n16 == 3) break block14;
                        if (n16 == 4) break block15;
                        n10 = n13;
                        if (n16 == 0x10000000) break block16;
                        if (n16 == 0x20000000) break block17;
                        if (n16 != 0x30000000) {
                            throw new IllegalStateException();
                        }
                        break block15;
                    }
                    n10 = n13 / 3;
                }
                n10 *= 2;
                break block16;
            }
            n10 = n13 / 2;
        }
        ByteBuffer byteBuffer2 = this.a(n10);
        n13 = this.b.c;
        if (n13 != 3) {
            if (n13 != 4) {
                if (n13 != 0x10000000) {
                    if (n13 != 0x20000000) {
                        if (n13 != 0x30000000) throw new IllegalStateException();
                        while (n15 < n14) {
                            byteBuffer2.put(byteBuffer.get(n15 + 2));
                            byteBuffer2.put(byteBuffer.get(n15 + 3));
                            n15 += 4;
                        }
                    } else {
                        for (n10 = n15; n10 < n14; n10 += 3) {
                            byteBuffer2.put(byteBuffer.get(n10 + 1));
                            byteBuffer2.put(byteBuffer.get(n10 + 2));
                        }
                    }
                } else {
                    for (n10 = n15; n10 < n14; n10 += 2) {
                        byteBuffer2.put(byteBuffer.get(n10 + 1));
                        byteBuffer2.put(byteBuffer.get(n10));
                    }
                }
            } else {
                for (n10 = n15; n10 < n14; n10 += 4) {
                    float f11 = byteBuffer.getFloat(n10);
                    n15 = m92.a;
                    n15 = (short)(Math.max(-1.0f, Math.min(f11, 1.0f)) * 32767.0f);
                    byteBuffer2.put((byte)(n15 & 0xFF));
                    byteBuffer2.put((byte)(n15 >> 8 & 0xFF));
                }
            }
        } else {
            for (n10 = n15; n10 < n14; ++n10) {
                byteBuffer2.put((byte)0);
                byteBuffer2.put((byte)((byteBuffer.get(n10) & 0xFF) - 128));
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }

    @Override
    public final jh.a b(jh.a a14) throws jh.b {
        int n10 = a14.c;
        if (n10 != 3 && n10 != 2 && n10 != 0x10000000 && n10 != 0x20000000 && n10 != 0x30000000 && n10 != 4) {
            throw new jh.b(a14);
        }
        a14 = n10 != 2 ? new jh.a(a14.a, a14.b, 2) : jh.a.e;
        return a14;
    }
}


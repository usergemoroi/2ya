/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.o60
 *  com.yandex.mobile.ads.impl.rl
 *  com.yandex.mobile.ads.impl.vu
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.o60;
import com.yandex.mobile.ads.impl.rl;
import com.yandex.mobile.ads.impl.vu;
import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public class jy
extends rl {
    public final vu c = new vu();
    @Nullable
    public ByteBuffer d;
    public boolean e;
    public long f;
    @Nullable
    public ByteBuffer g;
    private final int h;
    private final int i;

    static {
        o60.a((String)"goog.exo.decoder");
    }

    public jy(int n10) {
        this(n10, 0);
    }

    public jy(int n10, int n13) {
        this.h = n10;
        this.i = 0;
    }

    public static jy j() {
        return new jy(0, 0);
    }

    public void b() {
        super.b();
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        if ((byteBuffer = this.g) != null) {
            byteBuffer.clear();
        }
        this.e = false;
    }

    @EnsuresNonNull(value={"data"})
    public final void e(int n10) {
        int n13;
        block15: {
            ByteBuffer byteBuffer;
            int n14;
            ByteBuffer byteBuffer2;
            block14: {
                int n15;
                block13: {
                    block9: {
                        block12: {
                            ByteBuffer byteBuffer3;
                            block11: {
                                block10: {
                                    n15 = n10 + this.i;
                                    byteBuffer2 = this.d;
                                    n10 = 0;
                                    n13 = 0;
                                    if (byteBuffer2 != null) break block9;
                                    n10 = this.h;
                                    if (n10 != 1) break block10;
                                    byteBuffer3 = ByteBuffer.allocate(n15);
                                    break block11;
                                }
                                if (n10 != 2) break block12;
                                byteBuffer3 = ByteBuffer.allocateDirect(n15);
                            }
                            this.d = byteBuffer3;
                            return;
                        }
                        n10 = byteBuffer2 == null ? n13 : byteBuffer2.capacity();
                        throw new /* Unavailable Anonymous Inner Class!! */;
                    }
                    int n16 = byteBuffer2.capacity();
                    if (n16 >= (n13 = n15 + (n14 = byteBuffer2.position()))) {
                        this.d = byteBuffer2;
                        return;
                    }
                    n15 = this.h;
                    if (n15 != 1) break block13;
                    byteBuffer = ByteBuffer.allocate(n13);
                    break block14;
                }
                if (n15 != 2) break block15;
                byteBuffer = ByteBuffer.allocateDirect(n13);
            }
            byteBuffer.order(byteBuffer2.order());
            if (n14 > 0) {
                byteBuffer2.flip();
                byteBuffer.put(byteBuffer2);
            }
            this.d = byteBuffer;
            return;
        }
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer != null) {
            n10 = byteBuffer.capacity();
        }
        throw new /* Unavailable Anonymous Inner Class!! */;
    }

    public final void h() {
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        if ((byteBuffer = this.g) != null) {
            byteBuffer.flip();
        }
    }

    public final boolean i() {
        return this.c(0x40000000);
    }
}


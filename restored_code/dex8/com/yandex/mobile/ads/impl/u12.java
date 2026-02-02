/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ag1
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.k01
 *  com.yandex.mobile.ads.impl.k01$b
 *  com.yandex.mobile.ads.impl.s52
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ag1;
import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.i52;
import com.yandex.mobile.ads.impl.jl1;
import com.yandex.mobile.ads.impl.k01;
import com.yandex.mobile.ads.impl.n01;
import com.yandex.mobile.ads.impl.s52;
import com.yandex.mobile.ads.impl.uy1;
import com.yandex.mobile.ads.impl.v12;
import com.yandex.mobile.ads.impl.w12;
import com.yandex.mobile.ads.impl.x12;
import java.nio.ByteBuffer;

public final class u12
extends uy1 {
    private final bg1 a = new bg1();
    private final ag1 b = new ag1();
    private s52 c;

    @Override
    protected final k01 a(n01 object, ByteBuffer byteBuffer) {
        s52 s522 = this.c;
        if (s522 == null || object.j != s522.c()) {
            this.c = s522 = new s52(object.f);
            s522.a(object.f - object.j);
        }
        object = byteBuffer.array();
        int n10 = byteBuffer.limit();
        this.a.a(n10, (byte[])object);
        this.b.a(n10, (byte[])object);
        this.b.d(39);
        long l10 = (long)this.b.b(1) << 32 | (long)this.b.b(32);
        this.b.d(20);
        int n13 = this.b.b(12);
        n10 = this.b.b(8);
        this.a.f(14);
        object = n10 != 0 ? (n10 != 255 ? (n10 != 4 ? (n10 != 5 ? (n10 != 6 ? null : i52.a(this.a, l10, this.c)) : v12.a(this.a, l10, this.c)) : x12.a(this.a)) : jl1.a(this.a, n13, l10)) : new w12();
        object = object == null ? new k01(new k01.b[0]) : new k01(new k01.b[]{object});
        return object;
    }
}


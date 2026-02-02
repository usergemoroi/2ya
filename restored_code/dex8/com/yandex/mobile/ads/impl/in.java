/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.dc0
 *  com.yandex.mobile.ads.impl.fs2
 *  com.yandex.mobile.ads.impl.hn
 *  com.yandex.mobile.ads.impl.m92
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.ck;
import com.yandex.mobile.ads.impl.dc0;
import com.yandex.mobile.ads.impl.fs2;
import com.yandex.mobile.ads.impl.g60;
import com.yandex.mobile.ads.impl.hn;
import com.yandex.mobile.ads.impl.jy;
import com.yandex.mobile.ads.impl.m92;
import java.nio.ByteBuffer;

public final class in
extends ck {
    private final jy n = new jy(1);
    private final bg1 o = new bg1();
    private long p;
    @Nullable
    private hn q;
    private long r;

    public in() {
        super(6);
    }

    public final int a(cc0 cc02) {
        int n10 = "application/x-camera-motion".equals(cc02.m) ? fs2.b((int)4, (int)0, (int)0) : fs2.b((int)0, (int)0, (int)0);
        return n10;
    }

    @Override
    public final void a(int n10, @Nullable Object object) throws g60 {
        if (n10 == 8) {
            this.q = (hn)object;
        }
    }

    @Override
    public final void a(long l10, long l11) {
        while (!this.e() && this.r < 100000L + l10) {
            this.n.b();
            Object object = this.q();
            Object object2 = this.n;
            if (this.a((dc0)object, (jy)((Object)object2), 0) != -4 || this.n.f()) break;
            object2 = this.n;
            this.r = object2.f;
            if (this.q == null || object2.e()) continue;
            this.n.h();
            ByteBuffer byteBuffer = this.n.d;
            int n10 = m92.a;
            if (byteBuffer.remaining() != 16) {
                object2 = null;
            } else {
                object2 = this.o;
                object = byteBuffer.array();
                object2.a(byteBuffer.limit(), (byte[])object);
                this.o.e(byteBuffer.arrayOffset() + 4);
                object2 = new float[3];
                for (int i14 = 0; i14 < 3; ++i14) {
                    object2[i14] = (jy)Float.intBitsToFloat(this.o.k());
                }
            }
            if (object2 == null) continue;
            this.q.a(this.r - this.p, (float[])object2);
        }
    }

    @Override
    protected final void a(long l10, boolean bl2) {
        this.r = Long.MIN_VALUE;
        hn hn3 = this.q;
        if (hn3 != null) {
            hn3.f();
        }
    }

    @Override
    protected final void a(cc0[] cc0Array, long l10, long l11) {
        this.p = l11;
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final String getName() {
        return "CameraMotionRenderer";
    }

    @Override
    protected final void u() {
        hn hn3 = this.q;
        if (hn3 != null) {
            hn3.f();
        }
    }
}


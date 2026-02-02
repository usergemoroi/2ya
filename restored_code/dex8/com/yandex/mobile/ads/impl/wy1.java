/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.q32
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.jy;
import com.yandex.mobile.ads.impl.ky;
import com.yandex.mobile.ads.impl.q32;
import com.yandex.mobile.ads.impl.r32;
import com.yandex.mobile.ads.impl.ry1;
import com.yandex.mobile.ads.impl.s32;
import com.yandex.mobile.ads.impl.u32;
import com.yandex.mobile.ads.impl.v32;
import com.yandex.mobile.ads.impl.vy1;
import java.nio.ByteBuffer;

public abstract class wy1
extends ry1<u32, v32, s32>
implements r32 {
    protected wy1() {
        super((jy[])new u32[2], (ky[])new v32[2]);
        this.f();
    }

    static /* synthetic */ void a(wy1 wy12, ky ky2) {
        wy12.a(ky2);
    }

    protected abstract q32 a(byte[] var1, int var2, boolean var3) throws s32;

    @Override
    @Nullable
    protected final s32 a(jy jy2, ky ky2, boolean bl2) {
        jy2 = (u32)jy2;
        ky2 = (v32)ky2;
        try {
            ByteBuffer byteBuffer = jy2.d;
            byteBuffer.getClass();
            byteBuffer = this.a(byteBuffer.array(), byteBuffer.limit(), bl2);
            ((v32)ky2).a(jy2.f, (q32)byteBuffer, ((u32)jy2).j);
            ky2.c();
            jy2 = null;
        }
        catch (s32 s322) {
            // empty catch block
        }
        return jy2;
    }

    @Override
    public final void a(long l10) {
    }

    @Override
    protected final u32 c() {
        return new u32();
    }

    @Override
    protected final ky d() {
        return new vy1(this);
    }
}


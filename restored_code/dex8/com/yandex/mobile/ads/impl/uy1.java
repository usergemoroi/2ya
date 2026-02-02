/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.k01
 *  com.yandex.mobile.ads.impl.l01
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.k01;
import com.yandex.mobile.ads.impl.l01;
import com.yandex.mobile.ads.impl.n01;
import java.nio.ByteBuffer;

public abstract class uy1
implements l01 {
    @Nullable
    public final k01 a(n01 n012) {
        ByteBuffer byteBuffer = n012.d;
        byteBuffer.getClass();
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            n012 = n012.e() ? null : this.a(n012, byteBuffer);
            return n012;
        }
        throw new IllegalArgumentException();
    }

    @Nullable
    protected abstract k01 a(n01 var1, ByteBuffer var2);
}


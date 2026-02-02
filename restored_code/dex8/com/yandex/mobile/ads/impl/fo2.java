/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ib2
 *  com.yandex.mobile.ads.impl.jb2
 *  kotlin.jvm.internal.v
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.go2;
import com.yandex.mobile.ads.impl.ib2;
import com.yandex.mobile.ads.impl.jb2;
import kotlin.h;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class fo2
implements jb2,
s {
    final go2 a;

    fo2(go2 go22) {
        this.a = go22;
    }

    public final void a(@NotNull ib2 ib22) {
        go2.a(this.a, ib22);
    }

    public final boolean equals(@Nullable Object object) {
        boolean bl2 = object instanceof jb2 && object instanceof s ? y.e(this.getFunctionDelegate(), ((s)object).getFunctionDelegate()) : false;
        return bl2;
    }

    @Override
    @NotNull
    public final h<?> getFunctionDelegate() {
        return new v(1, (Object)this.a, go2.class, "trackVerificationNotExecuted", "trackVerificationNotExecuted(Lcom/yandex/mobile/ads/video/playback/tracker/verification/omsdk/error/VerificationNotExecutedException;)V", 0);
    }

    public final int hashCode() {
        return this.getFunctionDelegate().hashCode();
    }
}


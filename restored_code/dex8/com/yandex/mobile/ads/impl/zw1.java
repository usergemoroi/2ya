/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.cu
 *  com.yandex.mobile.ads.impl.em1
 *  com.yandex.mobile.ads.impl.yi1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.cu;
import com.yandex.mobile.ads.impl.em1;
import com.yandex.mobile.ads.impl.vf2;
import com.yandex.mobile.ads.impl.vl1;
import com.yandex.mobile.ads.impl.wf2;
import com.yandex.mobile.ads.impl.yi1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class zw1
implements cu {
    @NotNull
    private final em1 a;
    @NotNull
    private final yi1 b;
    @NotNull
    private final vf2 c;

    public zw1(@NotNull vl1 vl12, @NotNull yi1 yi12, @NotNull vf2 vf22) {
        this.a = vl12;
        this.b = yi12;
        this.c = vf22;
    }

    public final void a(@Nullable wf2 wf22) {
        this.c.a(wf22);
    }

    public final long getVideoDuration() {
        return this.a.a().b();
    }

    public final long getVideoPosition() {
        return this.a.a().c();
    }

    public final float getVolume() {
        Float f11 = this.b.a();
        float f12 = f11 != null ? f11.floatValue() : 0.0f;
        return f12;
    }

    public final void pauseVideo() {
        this.c.onVideoPaused();
    }

    public final void prepareVideo() {
        this.c.onVideoPrepared();
    }

    public final void resumeVideo() {
        this.c.onVideoResumed();
    }
}


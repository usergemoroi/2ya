/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.cu
 *  com.yandex.mobile.ads.impl.fm1
 *  com.yandex.mobile.ads.impl.zi1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.cu;
import com.yandex.mobile.ads.impl.fm1;
import com.yandex.mobile.ads.impl.uf2;
import com.yandex.mobile.ads.impl.wf2;
import com.yandex.mobile.ads.impl.wl1;
import com.yandex.mobile.ads.impl.zi1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ax1
implements cu {
    @NotNull
    private final fm1 a;
    @NotNull
    private final zi1 b;
    @NotNull
    private final uf2 c;

    public ax1(@NotNull wl1 wl12, @NotNull zi1 zi12, @NotNull uf2 uf22) {
        this.a = wl12;
        this.b = zi12;
        this.c = uf22;
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
        Float f10 = this.b.a();
        float f11 = f10 != null ? f10.floatValue() : 0.0f;
        return f11;
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


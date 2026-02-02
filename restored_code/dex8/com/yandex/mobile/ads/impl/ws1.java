/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.monetization.ads.video.playback.view.ExtendedVideoAdControlsContainer
 *  com.yandex.mobile.ads.impl.cn0
 *  com.yandex.mobile.ads.impl.go
 *  com.yandex.mobile.ads.impl.vf
 *  com.yandex.mobile.ads.impl.zb2
 */
package com.yandex.mobile.ads.impl;

import com.monetization.ads.video.playback.view.ExtendedVideoAdControlsContainer;
import com.yandex.mobile.ads.impl.cn0;
import com.yandex.mobile.ads.impl.go;
import com.yandex.mobile.ads.impl.vf;
import com.yandex.mobile.ads.impl.zb2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ws1
implements cn0 {
    @Nullable
    private final vf<?> a;
    @NotNull
    private final go b;

    public ws1(@Nullable vf<?> vf3, @NotNull go go3) {
        this.a = vf3;
        this.b = go3;
    }

    public final void a(@NotNull zb2 vf3) {
        ExtendedVideoAdControlsContainer extendedVideoAdControlsContainer = vf3.a();
        vf3 = this.a;
        if (vf3 != null && vf3.e()) {
            this.b.a(extendedVideoAdControlsContainer);
        }
    }
}


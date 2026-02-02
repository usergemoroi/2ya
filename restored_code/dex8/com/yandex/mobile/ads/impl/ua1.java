/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.hd2
 *  com.yandex.mobile.ads.impl.kc2
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.hd2;
import com.yandex.mobile.ads.impl.jb1;
import com.yandex.mobile.ads.impl.kc2;
import com.yandex.mobile.ads.impl.sa1;
import com.yandex.mobile.ads.impl.zc2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ua1
implements hd2<jb1> {
    @NotNull
    private final sa1 a;

    public ua1(@NotNull sa1 sa12) {
        this.a = sa12;
    }

    public final void a() {
        this.a.a();
    }

    public final void a(@NotNull kc2<jb1> kc22) {
        this.a.a((jb1)kc22.e(), (jb1)kc22.c());
    }

    public final void a(@Nullable zc2 zc22) {
        this.a.a(zc22);
    }

    public final long b() {
        return this.a.b();
    }

    public final void c() {
        this.a.c();
    }

    public final long getAdPosition() {
        return this.a.getAdPosition();
    }

    public final float getVolume() {
        return this.a.getVolume();
    }

    public final boolean isPlayingAd() {
        return this.a.isPlayingAd();
    }

    public final void pauseAd() {
        this.a.pauseAd();
    }

    public final void resumeAd() {
        this.a.resumeAd();
    }
}


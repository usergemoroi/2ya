/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.android.exoplayer2.Player
 *  com.yandex.mobile.ads.impl.ci1
 *  com.yandex.mobile.ads.impl.ci1$a
 *  com.yandex.mobile.ads.impl.fm1
 *  com.yandex.mobile.ads.impl.xi1
 */
package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;
import com.yandex.mobile.ads.impl.ci1;
import com.yandex.mobile.ads.impl.fm1;
import com.yandex.mobile.ads.impl.hb0;
import com.yandex.mobile.ads.impl.xi1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class wl1
implements fm1,
xi1 {
    @NotNull
    private final fm1 a;
    @NotNull
    private ci1 b;
    @Nullable
    private hb0 c;

    public wl1(@NotNull fm1 fm12) {
        this.a = fm12;
        this.b = ci1.a.a();
    }

    @NotNull
    public final ci1 a() {
        hb0 hb02;
        hb0 hb03 = hb02 = this.c;
        if (hb02 == null) {
            hb03 = this.a;
        }
        hb03 = hb03.a();
        this.b = hb03;
        return hb03;
    }

    public final void a(@Nullable Player object) {
        object = object == null ? new hb0(this.b) : null;
        this.c = object;
    }
}


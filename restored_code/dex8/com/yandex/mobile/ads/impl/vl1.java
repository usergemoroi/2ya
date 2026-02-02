/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.media3.common.Player
 *  com.yandex.mobile.ads.impl.di1
 *  com.yandex.mobile.ads.impl.di1$a
 *  com.yandex.mobile.ads.impl.em1
 *  com.yandex.mobile.ads.impl.wi1
 */
package com.yandex.mobile.ads.impl;

import androidx.media3.common.Player;
import com.yandex.mobile.ads.impl.di1;
import com.yandex.mobile.ads.impl.em1;
import com.yandex.mobile.ads.impl.gb0;
import com.yandex.mobile.ads.impl.wi1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class vl1
implements em1,
wi1 {
    @NotNull
    private final em1 a;
    @NotNull
    private di1 b;
    @Nullable
    private gb0 c;

    public vl1(@NotNull em1 em12) {
        this.a = em12;
        this.b = di1.a.a();
    }

    @NotNull
    public final di1 a() {
        gb0 gb02;
        gb0 gb03 = gb02 = this.c;
        if (gb02 == null) {
            gb03 = this.a;
        }
        gb03 = gb03.a();
        this.b = gb03;
        return gb03;
    }

    public final void a(@Nullable Player object) {
        object = object == null ? new gb0(this.b) : null;
        this.c = object;
    }
}


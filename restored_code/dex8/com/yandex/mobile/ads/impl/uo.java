/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.qs1
 *  com.yandex.mobile.ads.impl.ss1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ow1;
import com.yandex.mobile.ads.impl.qs1;
import com.yandex.mobile.ads.impl.ss1;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;

public final class uo
implements qs1 {
    @NotNull
    private final ss1 a;
    @NotNull
    private final ow1 b;

    @JvmOverloads
    public uo(@NotNull ss1 ss12, @NotNull ow1 ow12) {
        this.a = ss12;
        this.b = ow12;
    }

    public final void a() {
        this.a.a(this.b);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  com.yandex.mobile.ads.impl.oq0
 *  com.yandex.mobile.ads.impl.v0
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.oq0;
import com.yandex.mobile.ads.impl.v0;
import com.yandex.mobile.ads.impl.zf1;
import kotlin.jvm.internal.z0;
import org.jetbrains.annotations.NotNull;

public final class x32
implements oq0 {
    @NotNull
    private final View b;

    public x32(@NotNull zf1 zf12) {
        this.b = zf12;
    }

    @NotNull
    public final String a() {
        boolean bl2 = this.b.isHardwareAccelerated();
        z0 z02 = z0.a;
        return v0.a((Object[])new Object[]{bl2}, (int)1, (String)"supports: {inlineVideo: %s}", (String)"format(...)");
    }
}


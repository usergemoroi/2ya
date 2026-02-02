/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.oq0
 *  com.yandex.mobile.ads.impl.v0
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.oq0;
import com.yandex.mobile.ads.impl.v0;
import kotlin.jvm.internal.z0;
import org.jetbrains.annotations.NotNull;

public final class mi2
implements oq0 {
    private final boolean b;

    public mi2(boolean bl2) {
        this.b = bl2;
    }

    @NotNull
    public final String a() {
        z0 z02 = z0.a;
        return v0.a((Object[])new Object[]{this.b}, (int)1, (String)"viewable: %s", (String)"format(...)");
    }
}


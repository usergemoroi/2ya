/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.gc1
 *  com.yandex.mobile.ads.impl.np
 *  com.yandex.mobile.ads.impl.rc0
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.fc1;
import com.yandex.mobile.ads.impl.gc1;
import com.yandex.mobile.ads.impl.np;
import com.yandex.mobile.ads.impl.rc0;
import org.jetbrains.annotations.NotNull;

public final class dc1
implements rc0,
gc1 {
    @NotNull
    private final fc1 a;
    @NotNull
    private final np b;

    public dc1(@NotNull fc1 fc12, @NotNull np np2) {
        this.a = fc12;
        this.b = np2;
    }

    public final void a() {
    }

    public final void a(boolean bl2) {
        if (!bl2) {
            this.b.a();
            this.a.b(this);
        }
    }

    public final void invalidate() {
        this.a.b(this);
    }

    public final void pause() {
    }

    public final void resume() {
    }

    public final void start() {
        this.a.a(this);
    }
}


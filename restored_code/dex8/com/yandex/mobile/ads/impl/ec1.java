/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.gc1
 *  com.yandex.mobile.ads.impl.rc0
 *  com.yandex.mobile.ads.impl.t2
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.fc1;
import com.yandex.mobile.ads.impl.gc1;
import com.yandex.mobile.ads.impl.rc0;
import com.yandex.mobile.ads.impl.t2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ec1
implements rc0,
gc1 {
    @NotNull
    private final fc1 a;
    @Nullable
    private t2 b;

    public ec1(@NotNull fc1 fc12, @NotNull t2 t24) {
        this.a = fc12;
        this.b = t24;
    }

    public final void a() {
        t2 t24 = this.b;
        if (t24 != null) {
            t24.b();
        }
        this.a.b(this);
        this.b = null;
    }

    public final void a(boolean bl2) {
    }

    public final void invalidate() {
        this.a.b(this);
        this.b = null;
    }

    public final void pause() {
    }

    public final void resume() {
    }

    public final void start() {
        this.a.a(this);
    }
}


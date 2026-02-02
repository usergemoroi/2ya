/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.qt0
 *  com.yandex.mobile.ads.instream.InstreamAdBreakQueue
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.qt0;
import com.yandex.mobile.ads.instream.InstreamAdBreakQueue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class vm2<T>
implements InstreamAdBreakQueue<T> {
    @NotNull
    private final qt0<T> a;

    public vm2(@NotNull qt0<T> qt02) {
        this.a = qt02;
    }

    public final int getCount() {
        return this.a.a();
    }

    @Nullable
    public final T poll() {
        return (T)this.a.b();
    }
}


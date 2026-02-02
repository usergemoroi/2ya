/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.v1
 *  com.yandex.mobile.ads.impl.v5
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.v1;
import com.yandex.mobile.ads.impl.v5;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public final class q5
implements v1 {
    private final long a;

    public q5(@NotNull List<v5> object) {
        object = object.iterator();
        long l10 = 0L;
        while (object.hasNext()) {
            l10 += ((v5)object.next()).a();
        }
        this.a = l10;
    }

    public final long a() {
        return this.a;
    }

    public final long a(long l10) {
        return this.a;
    }
}


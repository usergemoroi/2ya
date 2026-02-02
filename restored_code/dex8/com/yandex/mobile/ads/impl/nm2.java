/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.common.ImpressionData
 *  com.yandex.mobile.ads.impl.c4
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.impl.c4;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class nm2
implements ImpressionData {
    @NotNull
    private final c4 a;

    public nm2(@NotNull c4 c43) {
        this.a = c43;
    }

    public final boolean equals(@Nullable Object object) {
        boolean bl2 = object instanceof nm2 && y.e(((nm2)object).a, this.a);
        return bl2;
    }

    @NotNull
    public final String getRawData() {
        return this.a.c();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}


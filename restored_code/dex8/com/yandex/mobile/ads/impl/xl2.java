/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.common.AdError
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.AdError;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class xl2
implements AdError {
    @NotNull
    private final String a;

    public xl2(@NotNull String string2) {
        this.a = string2;
    }

    public final boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof xl2)) {
            return false;
        }
        object = (xl2)object;
        return y.e(this.a, ((xl2)object).a);
    }

    @NotNull
    public final String getDescription() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        String string2 = this.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("YandexAdError(description=");
        stringBuilder.append(string2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}


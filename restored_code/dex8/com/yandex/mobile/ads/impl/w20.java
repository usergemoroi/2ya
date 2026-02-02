/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.u00
 *  com.yandex.mobile.ads.impl.y00
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.u00;
import com.yandex.mobile.ads.impl.y00;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class w20
implements u00 {
    @NotNull
    private final b8<?> a;

    public w20(@NotNull b8<?> b82) {
        this.a = b82;
    }

    public final boolean a(@NotNull Context object) {
        object = this.a.v();
        return y.e(y00.c.a(), object);
    }

    public final boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof w20)) {
            return false;
        }
        object = (w20)object;
        return y.e(this.a, ((w20)object).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        b8<?> b82 = this.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DivKitDesignConstraint(adResponse=");
        stringBuilder.append(b82);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}


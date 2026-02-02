/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.t
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.t;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class zo
implements t {
    @NotNull
    private final String a;

    public zo(@NotNull String string2) {
        this.a = string2;
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    public final boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof zo)) {
            return false;
        }
        object = (zo)object;
        return y.e(this.a, ((zo)object).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        String string2 = this.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CloseAction(actionType=");
        stringBuilder.append(string2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}


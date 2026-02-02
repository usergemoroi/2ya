/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.yr1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.yr1;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ow1
implements yr1 {
    private final int a;
    @NotNull
    private final String b;

    public ow1(int n10, @NotNull String string2) {
        this.a = n10;
        this.b = string2;
    }

    public final boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ow1)) {
            return false;
        }
        object = (ow1)object;
        if (this.a != ((ow1)object).a) {
            return false;
        }
        return y.e(this.b, ((ow1)object).b);
    }

    public final int getAmount() {
        return this.a;
    }

    @NotNull
    public final String getType() {
        return this.b;
    }

    public final int hashCode() {
        int n10 = this.a;
        return this.b.hashCode() + n10 * 31;
    }

    @NotNull
    public final String toString() {
        int n10 = this.a;
        String string2 = this.b;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SdkReward(amount=");
        stringBuilder.append(n10);
        stringBuilder.append(", type=");
        stringBuilder.append(string2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}


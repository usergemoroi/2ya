/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.a12
 *  com.yandex.mobile.ads.impl.t
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.a12;
import com.yandex.mobile.ads.impl.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class x02
implements t {
    @NotNull
    private final String a;
    @NotNull
    private final List<a12> b;

    public x02(@NotNull String string2, @NotNull ArrayList arrayList) {
        this.a = string2;
        this.b = arrayList;
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    @NotNull
    public final List<a12> c() {
        return this.b;
    }

    public final boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof x02)) {
            return false;
        }
        object = (x02)object;
        if (!y.e(this.a, ((x02)object).a)) {
            return false;
        }
        return y.e(this.b, ((x02)object).b);
    }

    public final int hashCode() {
        int n10 = this.a.hashCode();
        return ((Object)this.b).hashCode() + n10 * 31;
    }

    @NotNull
    public final String toString() {
        String string2 = this.a;
        List<a12> list = this.b;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SocialAction(actionType=");
        stringBuilder.append(string2);
        stringBuilder.append(", items=");
        stringBuilder.append(list);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.t20
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.qj;
import com.yandex.mobile.ads.impl.t20;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class f20
implements qj {
    @NotNull
    private final String a;
    @NotNull
    private final t20 b;
    @NotNull
    private final List<String> c;

    public f20(@NotNull String string2, @NotNull t20 t202, @NotNull ArrayList arrayList) {
        this.a = string2;
        this.b = t202;
        this.c = arrayList;
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    @Override
    @NotNull
    public final List<String> b() {
        return this.c;
    }

    @NotNull
    public final t20 c() {
        return this.b;
    }

    public final boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof f20)) {
            return false;
        }
        object = (f20)object;
        if (!y.e(this.a, ((f20)object).a)) {
            return false;
        }
        if (!y.e(this.b, ((f20)object).b)) {
            return false;
        }
        return y.e(this.c, ((f20)object).c);
    }

    public final int hashCode() {
        int n10 = this.a.hashCode();
        int n12 = this.b.hashCode();
        return ((Object)this.c).hashCode() + (n12 + n10 * 31) * 31;
    }

    @NotNull
    public final String toString() {
        String string2 = this.a;
        t20 t202 = this.b;
        List<String> list = this.c;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DivKitAdtuneAction(actionType=");
        stringBuilder.append(string2);
        stringBuilder.append(", design=");
        stringBuilder.append(t202);
        stringBuilder.append(", trackingUrls=");
        stringBuilder.append(list);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}


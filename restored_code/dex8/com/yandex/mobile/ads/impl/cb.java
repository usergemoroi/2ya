/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.e3
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.e3;
import com.yandex.mobile.ads.impl.qj;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class cb
implements qj {
    @NotNull
    private final String a;
    @NotNull
    private final String b;
    @NotNull
    private final String c;
    @NotNull
    private final List<String> d;

    public cb(@NotNull String string2, @NotNull String string3, @NotNull String string4, @NotNull ArrayList arrayList) {
        this.a = string2;
        this.b = string3;
        this.c = string4;
        this.d = arrayList;
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    @Override
    @NotNull
    public final List<String> b() {
        return this.d;
    }

    @NotNull
    public final String c() {
        return this.b;
    }

    @NotNull
    public final String d() {
        return this.c;
    }

    public final boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof cb)) {
            return false;
        }
        object = (cb)object;
        if (!y.e(this.a, ((cb)object).a)) {
            return false;
        }
        if (!y.e(this.b, ((cb)object).b)) {
            return false;
        }
        if (!y.e(this.c, ((cb)object).c)) {
            return false;
        }
        return y.e(this.d, ((cb)object).d);
    }

    public final int hashCode() {
        int n10 = this.a.hashCode();
        n10 = e3.a((String)this.b, (int)(n10 * 31), (int)31);
        n10 = e3.a((String)this.c, (int)n10, (int)31);
        return ((Object)this.d).hashCode() + n10;
    }

    @NotNull
    public final String toString() {
        String string2 = this.a;
        String string3 = this.b;
        String string4 = this.c;
        List<String> list = this.d;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AdtuneAction(actionType=");
        stringBuilder.append(string2);
        stringBuilder.append(", adtuneUrl=");
        stringBuilder.append(string3);
        stringBuilder.append(", optOutUrl=");
        stringBuilder.append(string4);
        stringBuilder.append(", trackingUrls=");
        stringBuilder.append(list);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}


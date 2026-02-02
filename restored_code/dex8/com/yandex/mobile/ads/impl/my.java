/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ak1
 *  com.yandex.mobile.ads.impl.e3
 *  com.yandex.mobile.ads.impl.t
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ak1;
import com.yandex.mobile.ads.impl.e3;
import com.yandex.mobile.ads.impl.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class my
implements t {
    @NotNull
    private final String a;
    @NotNull
    private final String b;
    @Nullable
    private final List<String> c;
    @NotNull
    private final List<ak1> d;

    public my(@NotNull String string2, @NotNull String string3, @Nullable List list, @NotNull ArrayList arrayList) {
        this.a = string2;
        this.b = string3;
        this.c = list;
        this.d = arrayList;
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    @Nullable
    public final List<String> c() {
        return this.c;
    }

    @NotNull
    public final String d() {
        return this.b;
    }

    @NotNull
    public final List<ak1> e() {
        return this.d;
    }

    public final boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof my)) {
            return false;
        }
        object = (my)object;
        if (!y.e(this.a, ((my)object).a)) {
            return false;
        }
        if (!y.e(this.b, ((my)object).b)) {
            return false;
        }
        if (!y.e(this.c, ((my)object).c)) {
            return false;
        }
        return y.e(this.d, ((my)object).d);
    }

    public final int hashCode() {
        int n10 = this.a.hashCode();
        int n13 = e3.a((String)this.b, (int)(n10 * 31), (int)31);
        List<String> list = this.c;
        n10 = list == null ? 0 : ((Object)list).hashCode();
        return ((Object)this.d).hashCode() + (n13 + n10) * 31;
    }

    @NotNull
    public final String toString() {
        String string2 = this.a;
        String string3 = this.b;
        List<String> list = this.c;
        List<ak1> list2 = this.d;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DeeplinkAction(actionType=");
        stringBuilder.append(string2);
        stringBuilder.append(", fallbackUrl=");
        stringBuilder.append(string3);
        stringBuilder.append(", fallbackTrackingUrls=");
        stringBuilder.append(list);
        stringBuilder.append(", preferredPackages=");
        stringBuilder.append(list2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}


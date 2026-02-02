/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.jq0
 *  com.yandex.mobile.ads.impl.ug2
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.jq0;
import com.yandex.mobile.ads.impl.ug2;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class hb2
implements ug2 {
    @NotNull
    private final String a;
    @Nullable
    private final jq0 b;
    @Nullable
    private final String c;
    @NotNull
    private final Map<String, List<String>> d;

    public hb2(@NotNull String string2, @Nullable jq0 jq02, @Nullable String string3, @NotNull HashMap hashMap) {
        this.a = string2;
        this.b = jq02;
        this.c = string3;
        this.d = hashMap;
    }

    @NotNull
    public final Map<String, List<String>> a() {
        return Collections.unmodifiableMap(this.d);
    }

    @Nullable
    public final jq0 b() {
        return this.b;
    }

    @Nullable
    public final String c() {
        return this.c;
    }

    @NotNull
    public final String d() {
        return this.a;
    }

    public final boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof hb2)) {
            return false;
        }
        object = (hb2)object;
        if (!y.e(this.a, ((hb2)object).a)) {
            return false;
        }
        if (!y.e(this.b, ((hb2)object).b)) {
            return false;
        }
        if (!y.e(this.c, ((hb2)object).c)) {
            return false;
        }
        return y.e(this.d, ((hb2)object).d);
    }

    public final int hashCode() {
        int n10 = this.a.hashCode();
        Object object = this.b;
        int n12 = 0;
        int n13 = object == null ? 0 : object.hashCode();
        object = this.c;
        if (object != null) {
            n12 = ((String)object).hashCode();
        }
        return ((Object)this.d).hashCode() + ((n10 * 31 + n13) * 31 + n12) * 31;
    }

    @NotNull
    public final String toString() {
        String string2 = this.a;
        jq0 jq02 = this.b;
        String string3 = this.c;
        Map<String, List<String>> map2 = this.d;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Verification(vendor=");
        stringBuilder.append(string2);
        stringBuilder.append(", javaScriptResource=");
        stringBuilder.append(jq02);
        stringBuilder.append(", parameters=");
        stringBuilder.append(string3);
        stringBuilder.append(", events=");
        stringBuilder.append(map2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}


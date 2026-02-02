/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.c52
 *  com.yandex.mobile.ads.impl.ug2
 *  com.yandex.mobile.ads.impl.x8
 *  com.yandex.mobile.ads.impl.z1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.c52;
import com.yandex.mobile.ads.impl.ug2;
import com.yandex.mobile.ads.impl.x8;
import com.yandex.mobile.ads.impl.z1;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class w1
implements ug2 {
    @NotNull
    private final x8 a;
    @Nullable
    private final String b;
    @NotNull
    private final c52 c;
    @NotNull
    private final List<String> d;
    @NotNull
    private final Map<String, List<String>> e;
    @Nullable
    private z1 f;

    public w1(@NotNull x8 x84, @Nullable String string2, @NotNull c52 c522, @NotNull List list, @NotNull Map map2) {
        this.a = x84;
        this.b = string2;
        this.c = c522;
        this.d = list;
        this.e = map2;
    }

    @NotNull
    public final Map<String, List<String>> a() {
        return this.e;
    }

    public final void a(@Nullable z1 z13) {
        this.f = z13;
    }

    @NotNull
    public final x8 b() {
        return this.a;
    }

    @Nullable
    public final String c() {
        return this.b;
    }

    @NotNull
    public final List<String> d() {
        return this.d;
    }

    @Nullable
    public final z1 e() {
        return this.f;
    }

    @NotNull
    public final c52 f() {
        return this.c;
    }
}


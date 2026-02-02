/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.dj2
 *  com.yandex.mobile.ads.impl.g3
 *  com.yandex.mobile.ads.impl.uc1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.dj2;
import com.yandex.mobile.ads.impl.g3;
import com.yandex.mobile.ads.impl.uc1;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class a3
extends dj2 {
    public static final int d = 0;
    @NotNull
    private final g3 c;

    public a3(@NotNull g3 g32, @Nullable uc1 uc12) {
        super(uc12);
        this.c = g32;
    }

    @NotNull
    public final g3 a() {
        return this.c;
    }

    public final boolean equals(@Nullable Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        Class<?> clazz = object != null ? object.getClass() : null;
        if (!y.e(a3.class, clazz)) {
            return false;
        }
        y.h(object, "null cannot be cast to non-null type com.monetization.ads.base.AdFetchError");
        object = (a3)((Object)object);
        if (this.c != ((a3)((Object)object)).c) {
            bl2 = false;
        }
        return bl2;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}


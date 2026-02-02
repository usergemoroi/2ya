/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.is
 *  com.yandex.mobile.ads.impl.oq1
 *  com.yandex.mobile.ads.impl.zi2
 *  kotlin.collections.s0
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.is;
import com.yandex.mobile.ads.impl.oq1;
import com.yandex.mobile.ads.impl.zi2;
import java.util.Map;
import kotlin.collections.s0;
import kotlin.t;
import kotlin.z;
import org.jetbrains.annotations.NotNull;

public final class uo0
implements oq1 {
    @NotNull
    private final zi2 a;

    public uo0(@NotNull zi2 zi22) {
        this.a = zi22;
    }

    @NotNull
    public final Map<String, Object> a() {
        return s0.m((t[])new t[]{z.a("ad_type", is.h.b()), z.a("page_id", this.a.getPageId()), z.a("category_id", this.a.a())});
    }
}


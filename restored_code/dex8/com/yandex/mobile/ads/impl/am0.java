/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.co0
 *  com.yandex.mobile.ads.impl.nc2
 *  com.yandex.mobile.ads.impl.tp1
 *  com.yandex.mobile.ads.impl.wd2$b
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.co0;
import com.yandex.mobile.ads.impl.nc2;
import com.yandex.mobile.ads.impl.tp1;
import com.yandex.mobile.ads.impl.wd2;
import java.util.LinkedHashMap;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;

public final class am0
implements wd2.b {
    @NotNull
    private final nc2 a;

    public /* synthetic */ am0(co0 co02) {
        this(new nc2(co02));
    }

    @JvmOverloads
    public am0(@NotNull nc2 nc22) {
        this.a = nc22;
    }

    @NotNull
    public final tp1 a() {
        tp1 tp12 = new tp1(new LinkedHashMap(), 2);
        tp12.b((Object)this.a.a(), "product_type");
        return tp12;
    }
}


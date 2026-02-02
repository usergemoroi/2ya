/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.is
 *  com.yandex.mobile.ads.impl.n7
 *  com.yandex.mobile.ads.impl.tp1
 *  com.yandex.mobile.ads.impl.us
 *  com.yandex.mobile.ads.impl.wd2$a
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.is;
import com.yandex.mobile.ads.impl.n7;
import com.yandex.mobile.ads.impl.tp1;
import com.yandex.mobile.ads.impl.us;
import com.yandex.mobile.ads.impl.wd2;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

public final class ul0
implements wd2.a {
    @NotNull
    private final n7 a;

    public ul0(@NotNull us us3) {
        this.a = new n7(us3.a());
    }

    @NotNull
    public final Map<String, Object> a() {
        tp1 tp12 = new tp1(null, 3);
        tp12.b((Object)is.h.b(), "ad_type");
        tp12.b((Object)this.a.d(), "page_id");
        tp12.b((Object)this.a.b(), "category_id");
        tp12.b((Object)this.a.c(), "imp_id");
        return tp12.b();
    }
}


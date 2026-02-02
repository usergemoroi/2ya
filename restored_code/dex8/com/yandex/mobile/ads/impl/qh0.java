/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.gh0
 *  com.yandex.mobile.ads.impl.j92
 *  com.yandex.mobile.ads.impl.mh0
 *  com.yandex.mobile.ads.impl.xj
 *  com.yandex.mobile.ads.impl.yp1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.gh0;
import com.yandex.mobile.ads.impl.j92;
import com.yandex.mobile.ads.impl.mh0;
import com.yandex.mobile.ads.impl.ph;
import com.yandex.mobile.ads.impl.xj;
import com.yandex.mobile.ads.impl.yp1;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

public final class qh0
extends xj {
    @NotNull
    private final xj a;
    @NotNull
    private final j92 b;

    public qh0(@NotNull xj xj2, @NotNull j92 j922) {
        this.a = xj2;
        this.b = j922;
    }

    @NotNull
    public final mh0 a(@NotNull yp1<?> yp12, @NotNull Map<String, String> map2) throws IOException, ph {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.putAll(map2);
        hashMap.put(gh0.T.a(), this.b.a());
        return this.a.a(yp12, hashMap);
    }
}


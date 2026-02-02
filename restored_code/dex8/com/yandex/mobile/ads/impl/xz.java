/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.cv0
 *  com.yandex.mobile.ads.impl.cv0$a
 *  com.yandex.mobile.ads.impl.cv0$b
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.w01
 *  com.yandex.mobile.ads.impl.zs0
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.a42;
import com.yandex.mobile.ads.impl.cv0;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.vg;
import com.yandex.mobile.ads.impl.w01;
import com.yandex.mobile.ads.impl.zs0;
import java.io.IOException;

public final class xz
implements cv0.b {
    public final cv0 a(cv0.a a14) throws IOException {
        int n10 = m92.a;
        if (n10 >= 23 && n10 >= 31) {
            n10 = w01.c((String)a14.c.m);
            StringBuilder stringBuilder = new StringBuilder("Creating an asynchronous MediaCodec adapter for track type ");
            stringBuilder.append(m92.d((int)n10));
            zs0.c((String)"DMCodecAdapterFactory", (String)stringBuilder.toString());
            return new vg.a(n10).b(a14);
        }
        return new a42.a().a(a14);
    }
}


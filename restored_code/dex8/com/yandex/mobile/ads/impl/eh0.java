/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.fe
 *  com.yandex.mobile.ads.impl.mv
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ch0;
import com.yandex.mobile.ads.impl.fe;
import com.yandex.mobile.ads.impl.mv;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public final class eh0
extends ch0 {
    public final int e;
    public final Map<String, List<String>> f;

    public eh0(int n10, @Nullable mv mv2, Map map2) {
        super(fe.a((String)"Response code: ", (int)n10), (IOException)mv2, 2004);
        this.e = n10;
        this.f = map2;
    }
}


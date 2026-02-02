/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ig0
 *  com.yandex.mobile.ads.impl.og0
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ig0;
import com.yandex.mobile.ads.impl.og0;
import com.yandex.mobile.ads.impl.zf1;
import org.jetbrains.annotations.NotNull;

public class vj
implements ig0 {
    @NotNull
    private final zf1 a;

    public vj(@NotNull zf1 zf12) {
        this.a = zf12;
        zf12.setId(2);
    }

    public void a(@NotNull og0 og02) {
        this.a.setHtmlWebViewListener(og02);
    }

    public void a(@NotNull String string2) {
        this.a.b(string2);
    }

    public void invalidate() {
        this.a.d();
    }
}


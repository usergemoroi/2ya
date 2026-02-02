/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.cd2
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.cd2;
import org.jetbrains.annotations.NotNull;

public final class jb1
implements cd2 {
    @NotNull
    private final String a;
    private final int b;
    private final int c;

    public jb1(@NotNull String string2, int n10, int n13) {
        this.a = string2;
        this.b = n10;
        this.c = n13;
    }

    public final int getAdHeight() {
        return this.c;
    }

    public final int getAdWidth() {
        return this.b;
    }

    @NotNull
    public final String getUrl() {
        return this.a;
    }
}


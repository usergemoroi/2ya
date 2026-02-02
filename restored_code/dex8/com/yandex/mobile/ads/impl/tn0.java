/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.cd2
 *  com.yandex.mobile.ads.impl.ws
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.cd2;
import com.yandex.mobile.ads.impl.ws;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class tn0
implements cd2 {
    @NotNull
    private final ws a;
    @NotNull
    private final String b;
    private final int c;
    private final int d;
    @Nullable
    private final String e;
    @Nullable
    private final Integer f;
    @Nullable
    private final String g;

    public tn0(@NotNull ws ws3, @NotNull String string2, int n10, int n13, @Nullable String string3, @Nullable Integer n14, @Nullable String string4) {
        this.a = ws3;
        this.b = string2;
        this.c = n10;
        this.d = n13;
        this.e = string3;
        this.f = n14;
        this.g = string4;
    }

    @NotNull
    public final ws a() {
        return this.a;
    }

    public final int getAdHeight() {
        return this.d;
    }

    public final int getAdWidth() {
        return this.c;
    }

    @Nullable
    public final String getApiFramework() {
        return this.g;
    }

    @Nullable
    public final Integer getBitrate() {
        return this.f;
    }

    @Nullable
    public final String getMediaType() {
        return this.e;
    }

    @NotNull
    public final String getUrl() {
        return this.b;
    }
}


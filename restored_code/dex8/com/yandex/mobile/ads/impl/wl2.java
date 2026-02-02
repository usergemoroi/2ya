/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.gs
 *  com.yandex.mobile.ads.instream.newapi.adbreak.AdBreakRequestData
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.gs;
import com.yandex.mobile.ads.instream.newapi.adbreak.AdBreakRequestData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class wl2
implements AdBreakRequestData {
    @NotNull
    private final gs a;
    private final boolean b;

    public wl2(@NotNull gs gs3) {
        this.a = gs3;
        boolean bl2 = gs3.b() != null && gs3.a() != null;
        this.b = bl2;
    }

    @Nullable
    public final String getImpId() {
        gs gs3 = this.a;
        boolean bl2 = this.b;
        String string2 = null;
        if (!bl2) {
            gs3 = null;
        }
        if (gs3 != null) {
            string2 = gs3.a();
        }
        return string2;
    }

    @Nullable
    public final String getPageId() {
        gs gs3 = this.a;
        boolean bl2 = this.b;
        String string2 = null;
        if (!bl2) {
            gs3 = null;
        }
        if (gs3 != null) {
            string2 = gs3.b();
        }
        return string2;
    }

    @Nullable
    public final String getUrl() {
        return this.a.c();
    }
}


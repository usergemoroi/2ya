/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.R$string
 *  com.yandex.mobile.ads.impl.vf
 *  com.yandex.mobile.ads.impl.yy
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.vf;
import com.yandex.mobile.ads.impl.yy;
import org.jetbrains.annotations.NotNull;

public final class i00
implements yy {
    @NotNull
    private final Context a;

    public i00(@NotNull Context context) {
        this.a = context;
    }

    @NotNull
    public final vf<?> a() {
        return new vf("sponsored", "string", (Object)this.a.getResources().getText(R.string.monetization_ads_internal_instream_sponsored_social), null, false, true);
    }
}


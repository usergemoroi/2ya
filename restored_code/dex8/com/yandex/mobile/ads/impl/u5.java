/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  com.yandex.mobile.ads.impl.d20
 *  com.yandex.mobile.ads.impl.mz1
 */
package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.yandex.mobile.ads.impl.d20;
import com.yandex.mobile.ads.impl.mz1;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

public final class u5
implements d20 {
    @NotNull
    private final mz1 a;

    public u5(@NotNull mz1 mz12) {
        this.a = mz12;
    }

    public final boolean a(@NotNull Uri uri) {
        boolean bl2;
        if (y.e(uri.getHost(), "showNextAd")) {
            this.a.a();
            bl2 = true;
        } else {
            bl2 = false;
        }
        return bl2;
    }
}


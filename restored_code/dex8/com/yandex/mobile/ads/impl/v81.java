/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcelable
 *  com.yandex.mobile.ads.impl.c4
 *  com.yandex.mobile.ads.impl.f1
 *  com.yandex.mobile.ads.impl.ht
 *  com.yandex.mobile.ads.impl.od0
 */
package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.c4;
import com.yandex.mobile.ads.impl.f1;
import com.yandex.mobile.ads.impl.ht;
import com.yandex.mobile.ads.impl.od0;
import com.yandex.mobile.ads.impl.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class v81
implements ht {
    @NotNull
    private final f1 a;
    @NotNull
    private final od0 b;

    public v81(@NotNull r1 r14, @NotNull od0 od02) {
        this.a = r14;
        this.b = od02;
    }

    public final void a(@Nullable c4 c44) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("impression_data_key", (Parcelable)c44);
        this.a.a(16, bundle);
    }

    public final void closeNativeAd() {
        if (this.b.a()) {
            this.a.a();
        }
    }

    public final void onAdClicked() {
    }

    public final void onLeftApplication() {
        this.a.a(17, null);
    }

    public final void onReturnedToApplication() {
        this.a.a(18, null);
    }
}


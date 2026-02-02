/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  com.yandex.mobile.ads.common.AdInfo
 *  com.yandex.mobile.ads.common.AdSize
 *  com.yandex.mobile.ads.impl.ct
 *  com.yandex.mobile.ads.impl.hs
 *  com.yandex.mobile.ads.impl.yl2
 *  com.yandex.mobile.ads.interstitial.InterstitialAd
 *  com.yandex.mobile.ads.interstitial.InterstitialAdEventListener
 */
package com.yandex.mobile.ads.impl;

import android.app.Activity;
import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.common.AdSize;
import com.yandex.mobile.ads.impl.ct;
import com.yandex.mobile.ads.impl.gn2;
import com.yandex.mobile.ads.impl.hs;
import com.yandex.mobile.ads.impl.yl2;
import com.yandex.mobile.ads.interstitial.InterstitialAd;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class fn2
implements InterstitialAd {
    @NotNull
    private final ct a;
    @NotNull
    private final yl2 b;

    public fn2(@NotNull ct ct3, @NotNull yl2 yl22) {
        this.a = ct3;
        this.b = yl22;
    }

    public final boolean equals(@Nullable Object object) {
        boolean bl2 = object instanceof fn2 && y.e(((fn2)object).a, this.a);
        return bl2;
    }

    @NotNull
    public final AdInfo getInfo() {
        Object object = this.b;
        hs hs3 = this.a.getInfo();
        object.getClass();
        object = hs3.a();
        object = object != null ? new AdSize(object.b(), object.a()) : null;
        return new AdInfo(hs3.b(), (AdSize)object, hs3.c());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void setAdEventListener(@Nullable InterstitialAdEventListener object) {
        object = new gn2((InterstitialAdEventListener)object);
        this.a.a((gn2)object);
    }

    public final void show(@NotNull Activity activity) {
        this.a.show(activity);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  com.yandex.mobile.ads.common.AdInfo
 *  com.yandex.mobile.ads.common.AdSize
 *  com.yandex.mobile.ads.impl.hs
 *  com.yandex.mobile.ads.impl.wt
 *  com.yandex.mobile.ads.impl.yl2
 *  com.yandex.mobile.ads.rewarded.RewardedAd
 *  com.yandex.mobile.ads.rewarded.RewardedAdEventListener
 */
package com.yandex.mobile.ads.impl;

import android.app.Activity;
import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.common.AdSize;
import com.yandex.mobile.ads.impl.hs;
import com.yandex.mobile.ads.impl.vn2;
import com.yandex.mobile.ads.impl.wt;
import com.yandex.mobile.ads.impl.yl2;
import com.yandex.mobile.ads.rewarded.RewardedAd;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class un2
implements RewardedAd {
    @NotNull
    private final wt a;
    @NotNull
    private final yl2 b;

    public un2(@NotNull wt wt2, @NotNull yl2 yl22) {
        this.a = wt2;
        this.b = yl22;
    }

    public final boolean equals(@Nullable Object object) {
        boolean bl2 = object instanceof un2 && y.e(((un2)object).a, this.a);
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

    public final void setAdEventListener(@Nullable RewardedAdEventListener object) {
        object = new vn2((RewardedAdEventListener)object);
        this.a.a((vn2)object);
    }

    public final void show(@NotNull Activity activity) {
        this.a.show(activity);
    }
}


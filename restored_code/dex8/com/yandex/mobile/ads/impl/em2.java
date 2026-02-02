/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  com.yandex.mobile.ads.appopenad.AppOpenAd
 *  com.yandex.mobile.ads.appopenad.AppOpenAdEventListener
 *  com.yandex.mobile.ads.common.AdInfo
 *  com.yandex.mobile.ads.common.AdSize
 *  com.yandex.mobile.ads.impl.hs
 *  com.yandex.mobile.ads.impl.js
 *  com.yandex.mobile.ads.impl.yl2
 */
package com.yandex.mobile.ads.impl;

import android.app.Activity;
import com.yandex.mobile.ads.appopenad.AppOpenAd;
import com.yandex.mobile.ads.appopenad.AppOpenAdEventListener;
import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.common.AdSize;
import com.yandex.mobile.ads.impl.fm2;
import com.yandex.mobile.ads.impl.hs;
import com.yandex.mobile.ads.impl.js;
import com.yandex.mobile.ads.impl.yl2;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class em2
implements AppOpenAd {
    @NotNull
    private final js a;
    @NotNull
    private final yl2 b;

    public em2(@NotNull js js3, @NotNull yl2 yl22) {
        this.a = js3;
        this.b = yl22;
    }

    public final boolean equals(@Nullable Object object) {
        boolean bl2 = object instanceof em2 && y.e(((em2)object).a, this.a);
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

    public final void setAdEventListener(@Nullable AppOpenAdEventListener object) {
        object = new fm2((AppOpenAdEventListener)object);
        this.a.a((fm2)object);
    }

    public final void show(@NotNull Activity activity) {
        this.a.show(activity);
    }
}


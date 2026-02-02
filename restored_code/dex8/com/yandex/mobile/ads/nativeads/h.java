/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.t61
 *  com.yandex.mobile.ads.nativeads.NativeAd
 *  com.yandex.mobile.ads.nativeads.SliderAd
 *  com.yandex.mobile.ads.nativeads.g
 *  kotlin.collections.t
 */
package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.impl.c02;
import com.yandex.mobile.ads.impl.m71;
import com.yandex.mobile.ads.impl.t61;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdViewBinder;
import com.yandex.mobile.ads.nativeads.SliderAd;
import com.yandex.mobile.ads.nativeads.e;
import com.yandex.mobile.ads.nativeads.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.t;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class h
extends e
implements SliderAd {
    @NotNull
    private final c02 e;
    @NotNull
    private final g f;

    public h(@NotNull c02 c022, @NotNull g g11) {
        super(c022);
        this.e = c022;
        this.f = g11;
    }

    public final void bindSliderAd(@NotNull NativeAdViewBinder object) {
        this.f.getClass();
        object = g.a((NativeAdViewBinder)object);
        this.e.a((m71)object);
    }

    @Override
    public final boolean equals(@Nullable Object object) {
        boolean bl2 = object instanceof h && y.e(((h)object).e, this.e);
        return bl2;
    }

    @NotNull
    public final List<NativeAd> getNativeAds() {
        Object object = this.e.e();
        ArrayList<NativeAd> arrayList = new ArrayList<NativeAd>(t.x((Iterable)object, (int)10));
        object = ((ArrayList)object).iterator();
        while (object.hasNext()) {
            arrayList.add(new e((t61)object.next()));
        }
        return arrayList;
    }

    @Override
    public final int hashCode() {
        return this.e.hashCode();
    }
}


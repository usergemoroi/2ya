/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.banner.b
 *  com.yandex.mobile.ads.common.AdAttributes
 *  com.yandex.mobile.ads.impl.h61
 *  com.yandex.mobile.ads.impl.ht
 *  com.yandex.mobile.ads.impl.jr1
 *  com.yandex.mobile.ads.impl.kt
 *  com.yandex.mobile.ads.impl.ot
 *  com.yandex.mobile.ads.impl.pn2
 *  com.yandex.mobile.ads.impl.t61
 *  com.yandex.mobile.ads.impl.v61
 *  com.yandex.mobile.ads.nativeads.CustomClickHandler
 *  com.yandex.mobile.ads.nativeads.CustomClickable
 *  com.yandex.mobile.ads.nativeads.NativeAd
 *  com.yandex.mobile.ads.nativeads.NativeAdAssets
 *  com.yandex.mobile.ads.nativeads.NativeAdEventListener
 *  com.yandex.mobile.ads.nativeads.NativeAdException
 *  com.yandex.mobile.ads.nativeads.NativeAdImageLoadingListener
 *  com.yandex.mobile.ads.nativeads.NativeAdType
 *  com.yandex.mobile.ads.nativeads.g
 */
package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.common.AdAttributes;
import com.yandex.mobile.ads.impl.h61;
import com.yandex.mobile.ads.impl.ht;
import com.yandex.mobile.ads.impl.jn2;
import com.yandex.mobile.ads.impl.jr1;
import com.yandex.mobile.ads.impl.kn2;
import com.yandex.mobile.ads.impl.kt;
import com.yandex.mobile.ads.impl.m71;
import com.yandex.mobile.ads.impl.mm2;
import com.yandex.mobile.ads.impl.mn2;
import com.yandex.mobile.ads.impl.ot;
import com.yandex.mobile.ads.impl.pn2;
import com.yandex.mobile.ads.impl.qn2;
import com.yandex.mobile.ads.impl.t61;
import com.yandex.mobile.ads.impl.v61;
import com.yandex.mobile.ads.nativeads.ClosableNativeAdEventListener;
import com.yandex.mobile.ads.nativeads.CustomClickHandler;
import com.yandex.mobile.ads.nativeads.CustomClickable;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdException;
import com.yandex.mobile.ads.nativeads.NativeAdImageLoadingListener;
import com.yandex.mobile.ads.nativeads.NativeAdType;
import com.yandex.mobile.ads.nativeads.NativeAdViewBinder;
import com.yandex.mobile.ads.nativeads.c;
import com.yandex.mobile.ads.nativeads.g;
import com.yandex.mobile.ads.nativeads.video.a;
import com.yandex.mobile.ads.nativeads.video.b;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class e
implements NativeAd,
CustomClickable,
a,
v61 {
    @NotNull
    private final t61 a;
    @NotNull
    private final g b;
    @NotNull
    private final pn2 c;
    @NotNull
    private final com.yandex.mobile.ads.banner.b d;

    public /* synthetic */ e(t61 t612) {
        this(t612, new g(), new pn2(), new com.yandex.mobile.ads.banner.b());
    }

    public e(@NotNull t61 t612, @NotNull g g11, @NotNull pn2 pn22, @NotNull com.yandex.mobile.ads.banner.b b11) {
        this.a = t612;
        this.b = g11;
        this.c = pn22;
        this.d = b11;
    }

    @NotNull
    public final t61 a() {
        return this.a;
    }

    public final void addImageLoadingListener(@NotNull NativeAdImageLoadingListener object) {
        object = new mn2((NativeAdImageLoadingListener)object);
        this.a.b((kt)object);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void bindNativeAd(@NotNull NativeAdViewBinder object) throws NativeAdException {
        try {
            this.b.getClass();
            m71 m712 = g.a((NativeAdViewBinder)object);
            this.a.b(m712);
            return;
        }
        catch (h61 h612) {}
        finally {
            Throwable throwable;
            throw new NativeAdException("Ad binding failed with unexpected exception", throwable);
        }
    }

    public boolean equals(@Nullable Object object) {
        boolean bl2 = object instanceof e && y.e(((e)object).a, this.a);
        return bl2;
    }

    @NotNull
    public final NativeAdAssets getAdAssets() {
        return new jn2(this.a.getAdAssets());
    }

    @NotNull
    public final AdAttributes getAdAttributes() {
        com.yandex.mobile.ads.banner.b b11 = this.d;
        this.a.a();
        b11.getClass();
        return com.yandex.mobile.ads.banner.b.a();
    }

    @NotNull
    public final NativeAdType getAdType() {
        pn2 pn22 = this.c;
        jr1 jr12 = this.a.getAdType();
        pn22.getClass();
        int n10 = jr12.ordinal();
        jr12 = n10 != 0 ? (n10 != 1 ? (n10 != 2 ? (n10 != 3 ? NativeAdType.CONTENT : NativeAdType.CONTENT) : NativeAdType.MEDIA) : NativeAdType.APP_INSTALL) : NativeAdType.CONTENT;
        return jr12;
    }

    @Nullable
    public final String getInfo() {
        return this.a.getInfo();
    }

    @Nullable
    public final b getNativeAdVideoController() {
        Object object = this.a.getNativeAdVideoController();
        object = object != null ? new qn2((ot)object) : null;
        return object;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public final void loadImages() {
        this.a.loadImages();
    }

    public final void removeImageLoadingListener(@NotNull NativeAdImageLoadingListener object) {
        object = new mn2((NativeAdImageLoadingListener)object);
        this.a.a((kt)object);
    }

    public final void setCustomClickHandler(@Nullable CustomClickHandler object) {
        object = object != null ? new c((CustomClickHandler)object) : null;
        this.a.a((c)object);
    }

    public final void setNativeAdEventListener(@Nullable NativeAdEventListener object) {
        object = object instanceof ClosableNativeAdEventListener ? new mm2((ClosableNativeAdEventListener)object) : (object != null ? new kn2((NativeAdEventListener)object) : null);
        this.a.a((ht)object);
    }
}


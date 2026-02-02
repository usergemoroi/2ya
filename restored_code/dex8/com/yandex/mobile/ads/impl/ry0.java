/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.TextView
 *  com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
 *  com.monetization.ads.nativeads.CustomizableMediaView
 *  com.yandex.mobile.ads.impl.s71
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.impl.s71;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ry0
implements MediatedNativeAdViewProvider {
    @NotNull
    private final View a;
    @NotNull
    private final s71 b;

    public ry0(@NotNull View view, @NotNull s71 s712) {
        this.a = view;
        this.b = s712;
    }

    @Nullable
    public final TextView getAgeView() {
        Object object = this.b.a("age");
        object = object instanceof TextView ? (TextView)object : null;
        return object;
    }

    @Nullable
    public final TextView getBodyView() {
        Object object = this.b.a("body");
        object = object instanceof TextView ? (TextView)object : null;
        return object;
    }

    @Nullable
    public final TextView getCallToActionView() {
        Object object = this.b.a("call_to_action");
        object = object instanceof TextView ? (TextView)object : null;
        return object;
    }

    @Nullable
    public final TextView getDomainView() {
        Object object = this.b.a("domain");
        object = object instanceof TextView ? (TextView)object : null;
        return object;
    }

    @Nullable
    public final ImageView getFeedbackView() {
        Object object = this.b.a("feedback");
        object = object instanceof ImageView ? (ImageView)object : null;
        return object;
    }

    @Nullable
    public final ImageView getIconView() {
        Object object = this.b.a("icon");
        object = object instanceof ImageView ? (ImageView)object : null;
        return object;
    }

    @Nullable
    public final FrameLayout getMediaView() {
        Object object = this.b.a("media");
        object = object instanceof CustomizableMediaView ? (CustomizableMediaView)object : null;
        return object;
    }

    @NotNull
    public final View getNativeAdView() {
        return this.a;
    }

    @Nullable
    public final TextView getPriceView() {
        Object object = this.b.a("price");
        object = object instanceof TextView ? (TextView)object : null;
        return object;
    }

    @Nullable
    public final View getRatingView() {
        return this.b.a("rating");
    }

    @Nullable
    public final TextView getReviewCountView() {
        Object object = this.b.a("review_count");
        object = object instanceof TextView ? (TextView)object : null;
        return object;
    }

    @Nullable
    public final TextView getSponsoredView() {
        Object object = this.b.a("sponsored");
        object = object instanceof TextView ? (TextView)object : null;
        return object;
    }

    @Nullable
    public final TextView getTitleView() {
        Object object = this.b.a("title");
        object = object instanceof TextView ? (TextView)object : null;
        return object;
    }

    @Nullable
    public final TextView getWarningView() {
        Object object = this.b.a("warning");
        object = object instanceof TextView ? (TextView)object : null;
        return object;
    }
}


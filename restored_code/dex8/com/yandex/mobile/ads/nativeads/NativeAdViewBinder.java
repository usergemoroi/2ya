/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.TextView
 *  com.yandex.mobile.ads.impl.ng
 */
package com.yandex.mobile.ads.nativeads;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.mobile.ads.impl.ng;
import com.yandex.mobile.ads.nativeads.MediaView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u00011R\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R(\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0016\u0010 \u001a\u0004\u0018\u00010\u00198VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010\u001bR\u0016\u0010$\u001a\u0004\u0018\u00010!8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\"\u0010#R\u0016\u0010&\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b%\u0010\u0011R\u0016\u0010(\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b'\u0010\u0006R\u0016\u0010*\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b)\u0010\u0011R\u0016\u0010,\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b+\u0010\u0011R\u0016\u0010.\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b-\u0010\u0011R\u0016\u00100\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b/\u0010\u0011\u00a8\u00062"}, d2={"Lcom/yandex/mobile/ads/nativeads/NativeAdViewBinder;", "Lcom/yandex/mobile/ads/impl/ng;", "Landroid/view/View;", "a", "Landroid/view/View;", "getNativeAdView", "()Landroid/view/View;", "nativeAdView", "", "", "b", "Ljava/util/Map;", "getAssetViews", "()Ljava/util/Map;", "assetViews", "Landroid/widget/TextView;", "getAgeView", "()Landroid/widget/TextView;", "ageView", "getBodyView", "bodyView", "getCallToActionView", "callToActionView", "getDomainView", "domainView", "Landroid/widget/ImageView;", "getFaviconView", "()Landroid/widget/ImageView;", "faviconView", "getFeedbackView", "feedbackView", "getIconView", "iconView", "Lcom/yandex/mobile/ads/nativeads/MediaView;", "getMediaView", "()Lcom/yandex/mobile/ads/nativeads/MediaView;", "mediaView", "getPriceView", "priceView", "getRatingView", "ratingView", "getReviewCountView", "reviewCountView", "getSponsoredView", "sponsoredView", "getTitleView", "titleView", "getWarningView", "warningView", "Builder", "mobileads_externalRelease"}, k=1, mv={1, 9, 0})
public final class NativeAdViewBinder
implements ng {
    @NotNull
    private final View a;
    @NotNull
    private final Map<String, View> b;

    private NativeAdViewBinder(View view, Map<String, ? extends View> map2) {
        this.a = view;
        this.b = map2;
    }

    public /* synthetic */ NativeAdViewBinder(View view, Map map2, p p14) {
        this(view, map2);
    }

    @Nullable
    public TextView getAgeView() {
        Object object = this.getAssetViews().get("age");
        object = object instanceof TextView ? (TextView)object : null;
        return object;
    }

    @Nullable
    public View getAssetView(@NotNull String string2) {
        return (View)this.getAssetViews().get(string2);
    }

    @NotNull
    public Map<String, View> getAssetViews() {
        return this.b;
    }

    @Nullable
    public TextView getBodyView() {
        Object object = this.getAssetViews().get("body");
        object = object instanceof TextView ? (TextView)object : null;
        return object;
    }

    @Nullable
    public TextView getCallToActionView() {
        Object object = this.getAssetViews().get("call_to_action");
        object = object instanceof TextView ? (TextView)object : null;
        return object;
    }

    @Nullable
    public TextView getCloseButtonView() {
        Object object = this.getAssetView("close_button");
        object = object instanceof TextView ? (TextView)object : null;
        return object;
    }

    @Nullable
    public TextView getDomainView() {
        Object object = this.getAssetViews().get("domain");
        object = object instanceof TextView ? (TextView)object : null;
        return object;
    }

    @Nullable
    public ImageView getFaviconView() {
        Object object = this.getAssetViews().get("favicon");
        object = object instanceof ImageView ? (ImageView)object : null;
        return object;
    }

    @Nullable
    public ImageView getFeedbackView() {
        Object object = this.getAssetViews().get("feedback");
        object = object instanceof ImageView ? (ImageView)object : null;
        return object;
    }

    @Nullable
    public ImageView getIconView() {
        Object object = this.getAssetViews().get("icon");
        object = object instanceof ImageView ? (ImageView)object : null;
        return object;
    }

    @Nullable
    public MediaView getMediaView() {
        Object object = this.getAssetViews().get("media");
        object = object instanceof MediaView ? (MediaView)((Object)object) : null;
        return object;
    }

    @NotNull
    public final View getNativeAdView() {
        return this.a;
    }

    @Nullable
    public TextView getPriceView() {
        Object object = this.getAssetViews().get("price");
        object = object instanceof TextView ? (TextView)object : null;
        return object;
    }

    @Nullable
    public View getRatingView() {
        return this.getAssetViews().get("rating");
    }

    @Nullable
    public TextView getReviewCountView() {
        Object object = this.getAssetViews().get("review_count");
        object = object instanceof TextView ? (TextView)object : null;
        return object;
    }

    @Nullable
    public TextView getSponsoredView() {
        Object object = this.getAssetViews().get("sponsored");
        object = object instanceof TextView ? (TextView)object : null;
        return object;
    }

    @Nullable
    public TextView getTitleView() {
        Object object = this.getAssetViews().get("title");
        object = object instanceof TextView ? (TextView)object : null;
        return object;
    }

    @Nullable
    public TextView getWarningView() {
        Object object = this.getAssetViews().get("warning");
        object = object instanceof TextView ? (TextView)object : null;
        return object;
    }
}


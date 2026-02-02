/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  androidx.annotation.AttrRes
 *  androidx.annotation.MainThread
 *  androidx.annotation.StyleRes
 *  com.monetization.ads.nativeads.ExtendedNativeAdView
 */
package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.MainThread;
import androidx.annotation.StyleRes;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nB-\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\u000b\u001a\u00020\t\u00a2\u0006\u0002\u0010\f\u00a8\u0006\r"}, d2={"Lcom/yandex/mobile/ads/nativeads/NativeAdView;", "Lcom/monetization/ads/nativeads/ExtendedNativeAdView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "mobileads_externalRelease"}, k=1, mv={1, 9, 0}, xi=48)
@MainThread
public final class NativeAdView
extends ExtendedNativeAdView {
    public NativeAdView(@NotNull Context context) {
        super(context);
    }

    public NativeAdView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NativeAdView(@NotNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int n10) {
        super(context, attributeSet, n10);
    }

    public NativeAdView(@NotNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int n10, @StyleRes int n13) {
        super(context, attributeSet, n10, n13);
    }
}


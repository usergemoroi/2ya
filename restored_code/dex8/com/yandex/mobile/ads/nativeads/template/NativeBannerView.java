/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  androidx.annotation.AttrRes
 *  androidx.annotation.MainThread
 *  com.yandex.mobile.ads.impl.aa2
 *  com.yandex.mobile.ads.impl.cm2
 *  com.yandex.mobile.ads.impl.pt
 *  com.yandex.mobile.ads.impl.v61
 *  com.yandex.mobile.ads.impl.vt
 *  com.yandex.mobile.ads.impl.zd
 *  com.yandex.mobile.ads.nativeads.NativeAd
 *  com.yandex.mobile.ads.nativeads.template.appearance.NativeTemplateAppearance$Builder
 */
package com.yandex.mobile.ads.nativeads.template;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.MainThread;
import com.yandex.mobile.ads.impl.aa2;
import com.yandex.mobile.ads.impl.cm2;
import com.yandex.mobile.ads.impl.co2;
import com.yandex.mobile.ads.impl.dm2;
import com.yandex.mobile.ads.impl.pt;
import com.yandex.mobile.ads.impl.v61;
import com.yandex.mobile.ads.impl.vt;
import com.yandex.mobile.ads.impl.zd;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.template.appearance.NativeTemplateAppearance;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u00a2\u0006\u0004\b\r\u0010\u000eB\u001b\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\b\r\u0010\u0011B%\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\b\r\u0010\u0014J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2={"Lcom/yandex/mobile/ads/nativeads/template/NativeBannerView;", "Lcom/yandex/mobile/ads/impl/pt;", "Lcom/yandex/mobile/ads/nativeads/template/appearance/NativeTemplateAppearance;", "templateAppearance", "Lkotlin/k0;", "applyAppearance", "(Lcom/yandex/mobile/ads/nativeads/template/appearance/NativeTemplateAppearance;)V", "Lcom/yandex/mobile/ads/nativeads/NativeAd;", "nativeAd", "setAd", "(Lcom/yandex/mobile/ads/nativeads/NativeAd;)V", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mobileads_externalRelease"}, k=1, mv={1, 9, 0})
@MainThread
public final class NativeBannerView
extends pt {
    @NotNull
    private final cm2 K = new cm2();

    public NativeBannerView(@NotNull Context context) {
        this(context, null);
    }

    public NativeBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NativeBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int n10) {
        super(context, attributeSet, n10, (vt)new NativeTemplateAppearance.Builder().build(), (aa2)co2.a, (zd)new dm2(), null, null, null, 448, null);
    }

    public final void applyAppearance(@NotNull NativeTemplateAppearance nativeTemplateAppearance) {
        this.applyAppearance(nativeTemplateAppearance);
    }

    public final void setAd(@NotNull NativeAd nativeAd) {
        this.K.getClass();
        if (nativeAd instanceof v61) {
            this.setAd(((v61)nativeAd).a());
            return;
        }
        throw new IllegalArgumentException("You should pass NativeAd received from native ad loader API.");
    }
}


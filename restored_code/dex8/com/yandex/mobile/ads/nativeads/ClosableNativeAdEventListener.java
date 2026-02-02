/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.MainThread
 *  com.yandex.mobile.ads.nativeads.NativeAdEventListener
 */
package com.yandex.mobile.ads.nativeads;

import androidx.annotation.MainThread;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import kotlin.Metadata;

@Metadata(d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\b\u0003\u0010\u0004\u00a8\u0006\u0005"}, d2={"Lcom/yandex/mobile/ads/nativeads/ClosableNativeAdEventListener;", "Lcom/yandex/mobile/ads/nativeads/NativeAdEventListener;", "Lkotlin/k0;", "closeNativeAd", "()V", "mobileads_externalRelease"}, k=1, mv={1, 9, 0})
@MainThread
public interface ClosableNativeAdEventListener
extends NativeAdEventListener {
    public void closeNativeAd();
}


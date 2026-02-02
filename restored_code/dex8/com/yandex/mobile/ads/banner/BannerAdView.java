/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  androidx.annotation.MainThread
 *  com.yandex.mobile.ads.banner.BannerAdEventListener
 *  com.yandex.mobile.ads.banner.b
 *  com.yandex.mobile.ads.banner.c
 *  com.yandex.mobile.ads.common.AdAttributes
 *  com.yandex.mobile.ads.common.AdRequest
 *  com.yandex.mobile.ads.common.VideoController
 *  com.yandex.mobile.ads.impl.bm2
 *  com.yandex.mobile.ads.impl.d30
 *  com.yandex.mobile.ads.impl.dp0
 *  com.yandex.mobile.ads.impl.gv1
 *  com.yandex.mobile.ads.impl.is
 *  com.yandex.mobile.ads.impl.jp0
 *  com.yandex.mobile.ads.impl.ki
 *  com.yandex.mobile.ads.impl.ns
 *  com.yandex.mobile.ads.impl.p4
 *  com.yandex.mobile.ads.impl.x2
 *  kotlin.collections.t
 */
package com.yandex.mobile.ads.banner;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.MainThread;
import com.yandex.mobile.ads.banner.BannerAdEventListener;
import com.yandex.mobile.ads.banner.BannerAdSize;
import com.yandex.mobile.ads.banner.ClosableBannerAdEventListener;
import com.yandex.mobile.ads.banner.a;
import com.yandex.mobile.ads.banner.b;
import com.yandex.mobile.ads.banner.c;
import com.yandex.mobile.ads.common.AdAttributes;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.VideoController;
import com.yandex.mobile.ads.impl.bf2;
import com.yandex.mobile.ads.impl.bm2;
import com.yandex.mobile.ads.impl.d30;
import com.yandex.mobile.ads.impl.dg0;
import com.yandex.mobile.ads.impl.dp0;
import com.yandex.mobile.ads.impl.gv1;
import com.yandex.mobile.ads.impl.hm2;
import com.yandex.mobile.ads.impl.ii;
import com.yandex.mobile.ads.impl.is;
import com.yandex.mobile.ads.impl.ji;
import com.yandex.mobile.ads.impl.jp0;
import com.yandex.mobile.ads.impl.ki;
import com.yandex.mobile.ads.impl.li;
import com.yandex.mobile.ads.impl.lm2;
import com.yandex.mobile.ads.impl.ns;
import com.yandex.mobile.ads.impl.p4;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.xn2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010&\u001a\u00020%\u00a2\u0006\u0004\b'\u0010(B\u001b\b\u0016\u0012\u0006\u0010&\u001a\u00020%\u0012\b\u0010*\u001a\u0004\u0018\u00010)\u00a2\u0006\u0004\b'\u0010+B#\b\u0016\u0012\u0006\u0010&\u001a\u00020%\u0012\b\u0010*\u001a\u0004\u0018\u00010)\u0012\u0006\u0010-\u001a\u00020,\u00a2\u0006\u0004\b'\u0010.J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001a\u001a\u00020\u00158\u0006\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020!0 8F\u00a2\u0006\u0006\u001a\u0004\b\"\u0010#\u00a8\u0006/"}, d2={"Lcom/yandex/mobile/ads/banner/BannerAdView;", "Lcom/yandex/mobile/ads/impl/jp0;", "Lcom/yandex/mobile/ads/common/AdRequest;", "adRequest", "Lkotlin/k0;", "loadAd", "(Lcom/yandex/mobile/ads/common/AdRequest;)V", "Lcom/yandex/mobile/ads/banner/BannerAdEventListener;", "bannerAdEventListener", "setBannerAdEventListener", "(Lcom/yandex/mobile/ads/banner/BannerAdEventListener;)V", "Lcom/yandex/mobile/ads/banner/BannerAdSize;", "adSize", "setAdSize", "(Lcom/yandex/mobile/ads/banner/BannerAdSize;)V", "", "adUnitId", "setAdUnitId", "(Ljava/lang/String;)V", "destroy", "()V", "Lcom/yandex/mobile/ads/common/VideoController;", "m", "Lcom/yandex/mobile/ads/common/VideoController;", "getVideoController", "()Lcom/yandex/mobile/ads/common/VideoController;", "videoController", "getAdSize", "()Lcom/yandex/mobile/ads/banner/BannerAdSize;", "getInfo", "()Ljava/lang/String;", "info", "", "Lcom/yandex/mobile/ads/common/AdAttributes;", "getAdAttributes", "()Ljava/util/List;", "adAttributes", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mobileads_externalRelease"}, k=1, mv={1, 9, 0})
@MainThread
public final class BannerAdView
extends jp0 {
    @NotNull
    private final bm2 j = new bm2();
    @NotNull
    private final b k = new b();
    @Nullable
    private String l;
    @NotNull
    private final VideoController m = new VideoController(this.e());

    public BannerAdView(@NotNull Context context) {
        this(context, null);
    }

    public BannerAdView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BannerAdView(@NotNull Context context, @Nullable AttributeSet attributeSet, int n10) {
        super(context, attributeSet, n10, new x2(is.d, (gv1)new xn2(context)), null, null, null, null, null, 496, null);
    }

    @NotNull
    protected final ji a(@NotNull Context context, @NotNull ii ii2, @NotNull p4 p42) {
        return new ji(context, this, ii2, p42, new bf2(), new li(), new ki(this.getAdConfiguration$mobileads_externalRelease().p()), new dg0(), new d30());
    }

    public void destroy() {
        super.destroy();
    }

    @NotNull
    public final List<AdAttributes> getAdAttributes() {
        List list2 = this.b();
        ArrayList<AdAttributes> arrayList = new ArrayList<AdAttributes>(t.x((Iterable)list2, (int)10));
        for (List list2 : list2) {
            this.k.getClass();
            arrayList.add(new a());
        }
        return arrayList;
    }

    @Nullable
    public final BannerAdSize getAdSize() {
        Object object = this.c();
        object = object != null ? new BannerAdSize(object.a()) : null;
        return object;
    }

    @Nullable
    public final String getInfo() {
        return this.d();
    }

    @NotNull
    public final VideoController getVideoController() {
        return this.m;
    }

    public final void loadAd(@NotNull AdRequest adRequest) {
        String string2 = this.l;
        if (string2 != null && string2.length() > 0) {
            this.a(this.j.a(string2, adRequest));
        } else {
            dp0.a((String)"Failed to load ad with empty ad unit id", (Object[])new Object[0]);
        }
    }

    public final void setAdSize(@NotNull BannerAdSize bannerAdSize) {
        this.a(c.a((BannerAdSize)bannerAdSize));
    }

    public void setAdUnitId(@Nullable String string2) {
        this.l = string2;
        super.setAdUnitId(string2);
    }

    public final void setBannerAdEventListener(@Nullable BannerAdEventListener object) {
        object = object instanceof ClosableBannerAdEventListener ? new lm2((ClosableBannerAdEventListener)object) : (object != null ? new hm2((BannerAdEventListener)object) : null);
        this.a((ns)object);
    }
}


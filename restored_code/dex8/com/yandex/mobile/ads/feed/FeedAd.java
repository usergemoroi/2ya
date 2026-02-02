/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.feed.FeedAdLoadListener
 *  com.yandex.mobile.ads.feed.a
 *  com.yandex.mobile.ads.impl.ha0
 */
package com.yandex.mobile.ads.feed;

import com.yandex.mobile.ads.feed.FeedAdLoadListener;
import com.yandex.mobile.ads.feed.a;
import com.yandex.mobile.ads.impl.ha0;
import com.yandex.mobile.ads.impl.x80;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u000eJ\r\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004R.\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u000f"}, d2={"Lcom/yandex/mobile/ads/feed/FeedAd;", "Lcom/yandex/mobile/ads/feed/a;", "Lkotlin/k0;", "preloadAd", "()V", "Lcom/yandex/mobile/ads/feed/FeedAdLoadListener;", "value", "b", "Lcom/yandex/mobile/ads/feed/FeedAdLoadListener;", "getLoadListener", "()Lcom/yandex/mobile/ads/feed/FeedAdLoadListener;", "setLoadListener", "(Lcom/yandex/mobile/ads/feed/FeedAdLoadListener;)V", "loadListener", "Builder", "mobileads_externalRelease"}, k=1, mv={1, 9, 0})
public final class FeedAd
extends a {
    @NotNull
    private final ha0 a;
    @Nullable
    private FeedAdLoadListener b;

    private FeedAd(ha0 ha02) {
        this.a = ha02;
    }

    public /* synthetic */ FeedAd(ha0 ha02, p p14) {
        this(ha02);
    }

    @NotNull
    protected final ha0 b() {
        return this.a;
    }

    @Nullable
    public final FeedAdLoadListener getLoadListener() {
        return this.b;
    }

    public final void preloadAd() {
        this.a.f();
    }

    public final void setLoadListener(@Nullable FeedAdLoadListener feedAdLoadListener) {
        this.a.a(new x80(feedAdLoadListener));
        this.b = feedAdLoadListener;
    }
}


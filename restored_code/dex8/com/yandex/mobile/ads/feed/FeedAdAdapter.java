/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.monetization.ads.core.utils.CallbackStackTraceMarker
 *  com.yandex.mobile.ads.common.ImpressionData
 *  com.yandex.mobile.ads.feed.FeedAdEventListener
 *  com.yandex.mobile.ads.impl.c4
 *  com.yandex.mobile.ads.impl.ht
 *  kotlin.jvm.functions.a
 */
package com.yandex.mobile.ads.feed;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.feed.FeedAd;
import com.yandex.mobile.ads.feed.FeedAdEventListener;
import com.yandex.mobile.ads.impl.a90;
import com.yandex.mobile.ads.impl.bf2;
import com.yandex.mobile.ads.impl.c4;
import com.yandex.mobile.ads.impl.ht;
import com.yandex.mobile.ads.impl.nm2;
import kotlin.Metadata;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\b\f\u0010\rR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000f"}, d2={"Lcom/yandex/mobile/ads/feed/FeedAdAdapter;", "Lcom/yandex/mobile/ads/impl/a90;", "Lcom/yandex/mobile/ads/feed/FeedAdEventListener;", "g", "Lcom/yandex/mobile/ads/feed/FeedAdEventListener;", "getEventListener", "()Lcom/yandex/mobile/ads/feed/FeedAdEventListener;", "setEventListener", "(Lcom/yandex/mobile/ads/feed/FeedAdEventListener;)V", "eventListener", "Lcom/yandex/mobile/ads/feed/FeedAd;", "feedAd", "<init>", "(Lcom/yandex/mobile/ads/feed/FeedAd;)V", "a", "mobileads_externalRelease"}, k=1, mv={1, 9, 0})
public final class FeedAdAdapter
extends a90 {
    @Nullable
    private FeedAdEventListener g;
    @NotNull
    private final ht h = new a(this);
    @NotNull
    private final bf2 i = new bf2();

    public FeedAdAdapter(@NotNull FeedAd feedAd) {
        super(feedAd.a(), null, 2, null);
    }

    @Override
    @NotNull
    protected final ht a() {
        return this.h;
    }

    @Override
    @NotNull
    protected final bf2 b() {
        return this.i;
    }

    @Nullable
    public final FeedAdEventListener getEventListener() {
        return this.g;
    }

    public final void setEventListener(@Nullable FeedAdEventListener feedAdEventListener) {
        this.g = feedAdEventListener;
    }

    private final class a
    implements ht {
        final FeedAdAdapter a;

        public a(FeedAdAdapter feedAdAdapter) {
            this.a = feedAdAdapter;
        }

        public final void a(@Nullable c4 object) {
            object = object != null ? new nm2((c4)object) : null;
            new CallbackStackTraceMarker((kotlin.jvm.functions.a)new kotlin.jvm.functions.a<k0>(this.a, (nm2)object){
                final FeedAdAdapter b;
                final nm2 c;
                {
                    this.b = feedAdAdapter;
                    this.c = nm22;
                    super(0);
                }

                public final Object invoke() {
                    FeedAdEventListener feedAdEventListener = this.b.getEventListener();
                    if (feedAdEventListener != null) {
                        feedAdEventListener.onImpression((ImpressionData)this.c);
                    }
                    return k0.a;
                }
            });
        }

        public final void closeNativeAd() {
        }

        public final void onAdClicked() {
            new CallbackStackTraceMarker((kotlin.jvm.functions.a)new kotlin.jvm.functions.a<k0>(this.a){
                final FeedAdAdapter b;
                {
                    this.b = feedAdAdapter;
                    super(0);
                }

                public final Object invoke() {
                    FeedAdEventListener feedAdEventListener = this.b.getEventListener();
                    if (feedAdEventListener != null) {
                        feedAdEventListener.onAdClicked();
                    }
                    return k0.a;
                }
            });
        }

        public final void onLeftApplication() {
        }

        public final void onReturnedToApplication() {
        }
    }
}


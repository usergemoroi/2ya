/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.monetization.ads.core.utils.CallbackStackTraceMarker
 *  com.yandex.mobile.ads.impl.co0
 *  com.yandex.mobile.ads.impl.en2
 *  com.yandex.mobile.ads.impl.ho0
 *  com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener
 *  com.yandex.mobile.ads.video.playback.model.VideoAd
 *  kotlin.jvm.functions.a
 */
package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.impl.co0;
import com.yandex.mobile.ads.impl.en2;
import com.yandex.mobile.ads.impl.ho0;
import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import kotlin.jvm.functions.a;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

public final class ko2
implements ho0 {
    @NotNull
    private final VideoAdPlaybackListener a;
    @NotNull
    private final en2 b;

    public ko2(@NotNull VideoAdPlaybackListener videoAdPlaybackListener, @NotNull en2 en22) {
        this.a = videoAdPlaybackListener;
        this.b = en22;
    }

    public final void a(@NotNull co0 co02) {
        new CallbackStackTraceMarker((a)new a<k0>(this, this.b.a(co02)){
            final ko2 b;
            final VideoAd c;
            {
                this.b = ko22;
                this.c = videoAd;
                super(0);
            }

            public final Object invoke() {
                this.b.a.onAdSkipped(this.c);
                return k0.a;
            }
        });
    }

    public final void a(@NotNull co0 co02, float f11) {
        new CallbackStackTraceMarker((a)new a<k0>(this, this.b.a(co02), f11){
            final ko2 b;
            final VideoAd c;
            final float d;
            {
                this.b = ko22;
                this.c = videoAd;
                this.d = f11;
                super(0);
            }

            public final Object invoke() {
                this.b.a.onVolumeChanged(this.c, this.d);
                return k0.a;
            }
        });
    }

    public final void b(@NotNull co0 co02) {
        new CallbackStackTraceMarker((a)new a<k0>(this, this.b.a(co02)){
            final ko2 b;
            final VideoAd c;
            {
                this.b = ko22;
                this.c = videoAd;
                super(0);
            }

            public final Object invoke() {
                this.b.a.onAdPrepared(this.c);
                return k0.a;
            }
        });
    }

    public final void c(@NotNull co0 co02) {
        new CallbackStackTraceMarker((a)new a<k0>(this, this.b.a(co02)){
            final ko2 b;
            final VideoAd c;
            {
                this.b = ko22;
                this.c = videoAd;
                super(0);
            }

            public final Object invoke() {
                this.b.a.onAdPaused(this.c);
                return k0.a;
            }
        });
    }

    public final void d(@NotNull co0 co02) {
        new CallbackStackTraceMarker((a)new a<k0>(this, this.b.a(co02)){
            final ko2 b;
            final VideoAd c;
            {
                this.b = ko22;
                this.c = videoAd;
                super(0);
            }

            public final Object invoke() {
                this.b.a.onAdStarted(this.c);
                return k0.a;
            }
        });
    }

    public final void e(@NotNull co0 co02) {
        new CallbackStackTraceMarker((a)new a<k0>(this, this.b.a(co02)){
            final ko2 b;
            final VideoAd c;
            {
                this.b = ko22;
                this.c = videoAd;
                super(0);
            }

            public final Object invoke() {
                this.b.a.onAdResumed(this.c);
                return k0.a;
            }
        });
    }

    public final void f(@NotNull co0 co02) {
        new CallbackStackTraceMarker((a)new a<k0>(this, this.b.a(co02)){
            final ko2 b;
            final VideoAd c;
            {
                this.b = ko22;
                this.c = videoAd;
                super(0);
            }

            public final Object invoke() {
                this.b.a.onAdStopped(this.c);
                return k0.a;
            }
        });
    }

    public final void g(@NotNull co0 co02) {
        new CallbackStackTraceMarker((a)new a<k0>(this, this.b.a(co02)){
            final ko2 b;
            final VideoAd c;
            {
                this.b = ko22;
                this.c = videoAd;
                super(0);
            }

            public final Object invoke() {
                this.b.a.onAdCompleted(this.c);
                return k0.a;
            }
        });
    }

    public final void h(@NotNull co0 co02) {
        new CallbackStackTraceMarker((a)new a<k0>(this, this.b.a(co02)){
            final ko2 b;
            final VideoAd c;
            {
                this.b = ko22;
                this.c = videoAd;
                super(0);
            }

            public final Object invoke() {
                this.b.a.onAdError(this.c);
                return k0.a;
            }
        });
    }

    public final void i(@NotNull co0 co02) {
        new CallbackStackTraceMarker((a)new a<k0>(this, this.b.a(co02)){
            final ko2 b;
            final VideoAd c;
            {
                this.b = ko22;
                this.c = videoAd;
                super(0);
            }

            public final Object invoke() {
                this.b.a.onAdClicked(this.c);
                return k0.a;
            }
        });
    }

    public final void j(@NotNull co0 co02) {
        new CallbackStackTraceMarker((a)new a<k0>(this, this.b.a(co02)){
            final ko2 b;
            final VideoAd c;
            {
                this.b = ko22;
                this.c = videoAd;
                super(0);
            }

            public final Object invoke() {
                this.b.a.onImpression(this.c);
                return k0.a;
            }
        });
    }
}


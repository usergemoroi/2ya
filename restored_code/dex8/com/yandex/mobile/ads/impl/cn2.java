/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.bn2
 *  com.yandex.mobile.ads.impl.bn2$a
 *  com.yandex.mobile.ads.impl.co0
 *  com.yandex.mobile.ads.impl.en2
 *  com.yandex.mobile.ads.impl.id2
 *  com.yandex.mobile.ads.impl.id2$a
 *  com.yandex.mobile.ads.impl.zs
 *  com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
 *  com.yandex.mobile.ads.instream.player.ad.error.InstreamAdPlayerError
 *  com.yandex.mobile.ads.instream.player.ad.error.InstreamAdPlayerError$Reason
 *  com.yandex.mobile.ads.video.playback.model.VideoAd
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bn2;
import com.yandex.mobile.ads.impl.co0;
import com.yandex.mobile.ads.impl.en2;
import com.yandex.mobile.ads.impl.hm0;
import com.yandex.mobile.ads.impl.id2;
import com.yandex.mobile.ads.impl.zs;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener;
import com.yandex.mobile.ads.instream.player.ad.error.InstreamAdPlayerError;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import kotlin.r;
import org.jetbrains.annotations.NotNull;

public final class cn2
implements InstreamAdPlayerListener {
    @NotNull
    private final zs a;
    @NotNull
    private final en2 b;
    @NotNull
    private final bn2 c;

    public cn2(@NotNull hm0 hm02, @NotNull en2 en22, @NotNull bn2 bn22) {
        this.a = hm02;
        this.b = en22;
        this.c = bn22;
    }

    public final void onAdBufferingFinished(@NotNull VideoAd videoAd) {
        if ((videoAd = this.b.a(videoAd)) != null) {
            this.a.h((co0)videoAd);
        }
    }

    public final void onAdBufferingStarted(@NotNull VideoAd videoAd) {
        if ((videoAd = this.b.a(videoAd)) != null) {
            this.a.i((co0)videoAd);
        }
    }

    public final void onAdCompleted(@NotNull VideoAd videoAd) {
        if ((videoAd = this.b.a(videoAd)) != null) {
            this.a.g((co0)videoAd);
        }
    }

    public final void onAdPaused(@NotNull VideoAd videoAd) {
        if ((videoAd = this.b.a(videoAd)) != null) {
            this.a.c((co0)videoAd);
        }
    }

    public final void onAdPrepared(@NotNull VideoAd videoAd) {
        if ((videoAd = this.b.a(videoAd)) != null) {
            this.a.b((co0)videoAd);
        }
    }

    public final void onAdResumed(@NotNull VideoAd videoAd) {
        if ((videoAd = this.b.a(videoAd)) != null) {
            this.a.e((co0)videoAd);
        }
    }

    public final void onAdSkipped(@NotNull VideoAd videoAd) {
        co0 co02 = this.b.a(videoAd);
        if (co02 != null) {
            this.a.a(co02);
            this.b.b(videoAd);
        }
    }

    public final void onAdStarted(@NotNull VideoAd videoAd) {
        if ((videoAd = this.b.a(videoAd)) != null) {
            this.a.d((co0)videoAd);
        }
    }

    public final void onAdStopped(@NotNull VideoAd videoAd) {
        co0 co02 = this.b.a(videoAd);
        if (co02 != null) {
            this.a.f(co02);
            this.b.b(videoAd);
        }
    }

    public final void onError(@NotNull VideoAd videoAd, @NotNull InstreamAdPlayerError instreamAdPlayerError) {
        co0 co02 = this.b.a(videoAd);
        if (co02 != null) {
            this.c.getClass();
            InstreamAdPlayerError.Reason reason = instreamAdPlayerError.getReason();
            switch (bn2.a.a[reason.ordinal()]) {
                default: {
                    throw new r();
                }
                case 29: {
                    reason = id2.a.D;
                    break;
                }
                case 28: {
                    reason = id2.a.C;
                    break;
                }
                case 27: {
                    reason = id2.a.B;
                    break;
                }
                case 26: {
                    reason = id2.a.A;
                    break;
                }
                case 25: {
                    reason = id2.a.z;
                    break;
                }
                case 24: {
                    reason = id2.a.y;
                    break;
                }
                case 23: {
                    reason = id2.a.x;
                    break;
                }
                case 22: {
                    reason = id2.a.w;
                    break;
                }
                case 21: {
                    reason = id2.a.v;
                    break;
                }
                case 20: {
                    reason = id2.a.u;
                    break;
                }
                case 19: {
                    reason = id2.a.t;
                    break;
                }
                case 18: {
                    reason = id2.a.s;
                    break;
                }
                case 17: {
                    reason = id2.a.r;
                    break;
                }
                case 16: {
                    reason = id2.a.q;
                    break;
                }
                case 15: {
                    reason = id2.a.p;
                    break;
                }
                case 14: {
                    reason = id2.a.o;
                    break;
                }
                case 13: {
                    reason = id2.a.n;
                    break;
                }
                case 12: {
                    reason = id2.a.m;
                    break;
                }
                case 11: {
                    reason = id2.a.l;
                    break;
                }
                case 10: {
                    reason = id2.a.k;
                    break;
                }
                case 9: {
                    reason = id2.a.j;
                    break;
                }
                case 8: {
                    reason = id2.a.i;
                    break;
                }
                case 7: {
                    reason = id2.a.h;
                    break;
                }
                case 6: {
                    reason = id2.a.g;
                    break;
                }
                case 5: {
                    reason = id2.a.f;
                    break;
                }
                case 4: {
                    reason = id2.a.e;
                    break;
                }
                case 3: {
                    reason = id2.a.d;
                    break;
                }
                case 2: {
                    reason = id2.a.c;
                    break;
                }
                case 1: {
                    reason = id2.a.b;
                }
            }
            instreamAdPlayerError = new id2((id2.a)reason, instreamAdPlayerError.getUnderlyingError());
            this.a.a(co02, (id2)instreamAdPlayerError);
            this.b.b(videoAd);
        }
    }

    public final void onVolumeChanged(@NotNull VideoAd videoAd, float f10) {
        if ((videoAd = this.b.a(videoAd)) != null) {
            this.a.a((co0)videoAd, f10);
        }
    }
}


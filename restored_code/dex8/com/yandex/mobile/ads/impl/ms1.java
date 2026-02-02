/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.monetization.ads.mediation.base.MediatedAdRequestError
 *  com.monetization.ads.mediation.rewarded.MediatedReward
 *  com.monetization.ads.mediation.rewarded.MediatedRewardedAdapter
 *  com.monetization.ads.mediation.rewarded.MediatedRewardedAdapterListener
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.bk0
 *  com.yandex.mobile.ads.impl.f3
 *  com.yandex.mobile.ads.impl.ga
 *  com.yandex.mobile.ads.impl.lo1
 *  com.yandex.mobile.ads.impl.mx0
 *  com.yandex.mobile.ads.impl.op0
 *  kotlin.collections.s0
 *  kotlin.jvm.functions.a
 *  kotlin.jvm.functions.l
 *  kotlin.jvm.internal.e0
 *  kotlin.jvm.internal.f0
 *  kotlin.reflect.KProperty
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.base.MediatedAdRequestError;
import com.monetization.ads.mediation.rewarded.MediatedReward;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapter;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapterListener;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.bk0;
import com.yandex.mobile.ads.impl.cd0;
import com.yandex.mobile.ads.impl.es1;
import com.yandex.mobile.ads.impl.f3;
import com.yandex.mobile.ads.impl.ga;
import com.yandex.mobile.ads.impl.jj;
import com.yandex.mobile.ads.impl.ko1;
import com.yandex.mobile.ads.impl.lj;
import com.yandex.mobile.ads.impl.lo1;
import com.yandex.mobile.ads.impl.mx0;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.sd0;
import kotlin.collections.s0;
import kotlin.jvm.functions.a;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.v0;
import kotlin.k0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ms1
implements MediatedRewardedAdapterListener {
    static final KProperty<Object>[] e = new KProperty[]{v0.f((e0)new f0(ms1.class, "contentController", "getContentController()Lcom/monetization/ads/rewarded/content/RewardedAdContentController;", 0)), ga.a(ms1.class, (String)"loadController", (String)"getLoadController()Lcom/monetization/ads/fullscreen/FullScreenLoadController;", (int)0)};
    @NotNull
    private final mx0<MediatedRewardedAdapter, MediatedRewardedAdapterListener> a;
    @NotNull
    private final bk0 b;
    @NotNull
    private final ko1 c;
    @NotNull
    private final ko1 d;

    public /* synthetic */ ms1(cd0 cd02, mx0 mx02) {
        this(cd02, (mx0<MediatedRewardedAdapter, MediatedRewardedAdapterListener>)mx02, new bk0(mx02));
    }

    public ms1(@NotNull cd0<es1> cd02, @NotNull mx0<MediatedRewardedAdapter, MediatedRewardedAdapterListener> mx02, @NotNull bk0 bk02) {
        this.a = mx02;
        this.b = bk02;
        this.c = lo1.a(null);
        this.d = lo1.a(cd02);
    }

    public static final void a(ms1 ms12) {
        cd0 cd02 = (cd0)ms12.d.getValue(ms12, e[1]);
        if (cd02 != null) {
            Context context = cd02.k();
            ms12.a.c(context, s0.j());
            cd02.t();
        }
    }

    @Nullable
    public final es1 a() {
        return (es1)this.c.getValue(this, e[0]);
    }

    public final void a(@Nullable es1 es12) {
        this.c.setValue(this, e[0], es12);
    }

    public final void onAdImpression() {
        es1 es12;
        if (!this.a.b() && (es12 = this.a()) != null) {
            Context context = es12.e();
            this.a.b(context, s0.j());
            es12.a(this.b.a());
        }
    }

    public final void onRewarded(@Nullable MediatedReward object) {
        object = this.a();
        if (object != null) {
            Context context = ((jj)object).e();
            b8 b82 = ((jj)object).d();
            this.a.a(context, b82);
            ((es1)object).r();
        }
    }

    public final void onRewardedAdClicked() {
        es1 es12 = this.a();
        if (es12 != null) {
            es12 = es12.e();
            cd0 cd02 = (cd0)this.d.getValue(this, e[1]);
            if (cd02 != null && (cd02 = cd02.i()) != null) {
                cd02.a();
            }
            this.a.a((Context)es12, s0.j());
        }
    }

    public final void onRewardedAdDismissed() {
        Object object = this.a();
        if (object != null) {
            ((sd0)object).p();
        }
        if ((object = (cd0)this.d.getValue(this, e[1])) != null && (object = ((lj)object).i()) != null) {
            object.b();
        }
    }

    public final void onRewardedAdFailedToLoad(@NotNull MediatedAdRequestError mediatedAdRequestError) {
        cd0 cd02 = (cd0)this.d.getValue(this, e[1]);
        if (cd02 != null) {
            cd02 = cd02.k();
            mediatedAdRequestError = new f3(mediatedAdRequestError.getCode(), mediatedAdRequestError.getDescription(), mediatedAdRequestError.getDescription(), null);
            this.a.b((Context)cd02, (f3)mediatedAdRequestError, (Object)this);
        }
    }

    public final void onRewardedAdLeftApplication() {
        es1 es12 = this.a();
        if (es12 != null) {
            es12.onLeftApplication();
        }
    }

    public final void onRewardedAdLoaded() {
        ko1 ko12 = this.d;
        Object object = e;
        cd0 cd02 = (cd0)ko12.getValue(this, object[1]);
        if (cd02 != null) {
            ko12 = this.a.a();
            ko12 = ko12 != null && (ko12 = ko12.a()) != null ? ko12.a() : null;
            if (ko12 != null) {
                cd02.a(ko12.getAd(), ko12.getInfo(), new a<k0>(this){
                    final ms1 b;
                    {
                        this.b = ms12;
                        super(0);
                    }

                    public final Object invoke() {
                        ms1.a(this.b);
                        return k0.a;
                    }
                }, (l<String, k0>)new l<String, k0>(this){
                    final ms1 b;
                    {
                        this.b = ms12;
                        super(1);
                    }

                    public final void a(@NotNull String string2) {
                        ms1 ms12 = this.b;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Ad is blocked by quality verification with reasons:  ");
                        stringBuilder.append(string2);
                        ms12.onRewardedAdFailedToLoad(new MediatedAdRequestError(1, stringBuilder.toString()));
                    }
                });
            } else {
                int n10 = op0.b;
                if ((object = (cd0)this.d.getValue(this, object[1])) != null) {
                    ko12 = ((lj)object).k();
                    this.a.c((Context)ko12, s0.j());
                    ((lj)object).t();
                }
            }
        }
    }

    public final void onRewardedAdShown() {
        es1 es12 = this.a();
        if (es12 != null) {
            es12.q();
            this.a.c(es12.e());
        }
        if (this.a.b() && (es12 = this.a()) != null) {
            Context context = es12.e();
            this.a.b(context, s0.j());
            es12.a(this.b.a());
        }
    }
}


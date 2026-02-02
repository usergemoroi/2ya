/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.monetization.ads.mediation.base.MediatedAdRequestError
 *  com.monetization.ads.mediation.nativeads.MediatedNativeAd
 *  com.monetization.ads.mediation.nativeads.MediatedNativeAdImage
 *  com.monetization.ads.mediation.nativeads.MediatedNativeAdapter
 *  com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener
 *  com.yandex.mobile.ads.impl.a71
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.bc1
 *  com.yandex.mobile.ads.impl.bk0
 *  com.yandex.mobile.ads.impl.c4
 *  com.yandex.mobile.ads.impl.ex0
 *  com.yandex.mobile.ads.impl.f3
 *  com.yandex.mobile.ads.impl.ga
 *  com.yandex.mobile.ads.impl.h4
 *  com.yandex.mobile.ads.impl.jr1
 *  com.yandex.mobile.ads.impl.ky0
 *  com.yandex.mobile.ads.impl.lo1
 *  com.yandex.mobile.ads.impl.ly0
 *  com.yandex.mobile.ads.impl.mx0
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.rx0
 *  com.yandex.mobile.ads.impl.sp1$b
 *  com.yandex.mobile.ads.impl.t51
 *  com.yandex.mobile.ads.impl.tp1
 *  com.yandex.mobile.ads.impl.uy0
 *  com.yandex.mobile.ads.impl.v51
 *  com.yandex.mobile.ads.impl.v62
 *  com.yandex.mobile.ads.impl.vx0
 *  com.yandex.mobile.ads.impl.vx0$a
 *  com.yandex.mobile.ads.impl.wi0
 *  kotlin.collections.s0
 *  kotlin.collections.t
 *  kotlin.jvm.functions.a
 *  kotlin.jvm.functions.l
 *  kotlin.reflect.KProperty
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.base.MediatedAdRequestError;
import com.monetization.ads.mediation.nativeads.MediatedNativeAd;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdImage;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdapter;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener;
import com.yandex.mobile.ads.impl.a71;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.bc1;
import com.yandex.mobile.ads.impl.bk0;
import com.yandex.mobile.ads.impl.bx1;
import com.yandex.mobile.ads.impl.bz0;
import com.yandex.mobile.ads.impl.c4;
import com.yandex.mobile.ads.impl.cz0;
import com.yandex.mobile.ads.impl.ex0;
import com.yandex.mobile.ads.impl.f3;
import com.yandex.mobile.ads.impl.ga;
import com.yandex.mobile.ads.impl.h4;
import com.yandex.mobile.ads.impl.h53;
import com.yandex.mobile.ads.impl.i53;
import com.yandex.mobile.ads.impl.j61;
import com.yandex.mobile.ads.impl.jr1;
import com.yandex.mobile.ads.impl.ko1;
import com.yandex.mobile.ads.impl.ky0;
import com.yandex.mobile.ads.impl.lo1;
import com.yandex.mobile.ads.impl.ly0;
import com.yandex.mobile.ads.impl.mx0;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.oy0;
import com.yandex.mobile.ads.impl.qx0;
import com.yandex.mobile.ads.impl.rx0;
import com.yandex.mobile.ads.impl.s51;
import com.yandex.mobile.ads.impl.sp1;
import com.yandex.mobile.ads.impl.sx0;
import com.yandex.mobile.ads.impl.t51;
import com.yandex.mobile.ads.impl.tp1;
import com.yandex.mobile.ads.impl.uy0;
import com.yandex.mobile.ads.impl.v51;
import com.yandex.mobile.ads.impl.v62;
import com.yandex.mobile.ads.impl.vx0;
import com.yandex.mobile.ads.impl.wi0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.s0;
import kotlin.collections.t;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.a;
import kotlin.jvm.functions.l;
import kotlin.k0;
import kotlin.reflect.KProperty;
import kotlin.z;
import org.jetbrains.annotations.NotNull;

public final class u71
implements MediatedNativeAdapterListener {
    static final KProperty<Object>[] o = new KProperty[]{ga.a(u71.class, (String)"nativeAdLoadManager", (String)"getNativeAdLoadManager()Lcom/monetization/ads/nativeads/NativeAdLoadManager;", (int)0)};
    @NotNull
    private final b8<a71> a;
    @NotNull
    private final mx0<MediatedNativeAdapter, MediatedNativeAdapterListener> b;
    @NotNull
    private final rx0 c;
    @NotNull
    private final ly0 d;
    @NotNull
    private final bk0 e;
    private final Context f;
    @NotNull
    private final ko1 g;
    @NotNull
    private final LinkedHashMap h;
    @NotNull
    private final LinkedHashMap i;
    @NotNull
    private final wi0 j;
    @NotNull
    private final ky0 k;
    @NotNull
    private final vx0 l;
    @NotNull
    private final uy0 m;
    private boolean n;

    public /* synthetic */ u71(b8 b82, j61 j612, mx0 mx02) {
        this((b8<a71>)b82, j612, (mx0<MediatedNativeAdapter, MediatedNativeAdapterListener>)mx02, new rx0(), new ly0(), new bk0(mx02));
    }

    @JvmOverloads
    public u71(@NotNull b8<a71> context, @NotNull j61 j612, @NotNull mx0<MediatedNativeAdapter, MediatedNativeAdapterListener> mx02, @NotNull rx0 rx02, @NotNull ly0 ly02, @NotNull bk0 object) {
        this.a = context;
        this.b = mx02;
        this.c = rx02;
        this.d = ly02;
        this.e = object;
        this.f = context = j612.k().getApplicationContext();
        this.g = lo1.a((Object)j612);
        object = new LinkedHashMap();
        this.h = object;
        this.i = new LinkedHashMap();
        rx02 = new wi0(j612.k());
        this.j = rx02;
        ly02 = new ky0(j612.k());
        this.k = ly02;
        this.l = new vx0(j612.k(), (wi0)rx02, (ky0)ly02);
        this.m = new uy0(context, mx02, (LinkedHashMap)object);
    }

    private final void a(MediatedNativeAd mediatedNativeAd, jr1 jr12) {
        j61 j612 = (j61)this.g.getValue(this, o[0]);
        if (j612 != null) {
            this.h.put("native_ad_type", jr12.a());
            this.b.c(j612.k(), (Map)this.h);
            this.i.putAll(s0.g(z.a("title", mediatedNativeAd.getMediatedNativeAdAssets().getTitle())));
            this.d.getClass();
            Object object = mediatedNativeAd.getMediatedNativeAdAssets();
            List list = t.r((Object[])new MediatedNativeAdImage[]{object.getFavicon(), object.getIcon(), object.getImage()});
            object = this.k.b(list);
            this.j.a((LinkedHashMap)object);
            this.l.a(mediatedNativeAd, jr12, list, (vx0.a)new h53(mediatedNativeAd, this, j612));
        }
    }

    private static final void a(MediatedNativeAd object, u71 u712, j61 j612, b8 b82) {
        object = new cz0((MediatedNativeAd)object, u712.m, j612.i(), new bx1());
        qx0 qx02 = new qx0(new i53(u712));
        oy0 oy02 = new oy0();
        bz0 bz02 = new bz0();
        j612.a((b8<a71>)b82, new v51((h4)new sx0(u712.a, u712.b.a()), (t51)qx02, (bc1)object, (ex0)oy02, (v62)bz02));
    }

    private static final void a(u71 u712, s51 s512) {
        u712.c.a(s512);
    }

    private final void b(MediatedNativeAd mediatedNativeAd, jr1 jr12) {
        j61 j612 = (j61)this.g.getValue(this, o[0]);
        if (j612 != null) {
            Object object = this.b.a();
            object = object != null && (object = object.a()) != null ? object.a() : null;
            if (object != null) {
                j612.a(object.getAd(), object.getInfo(), new a<k0>(this, mediatedNativeAd, jr12){
                    final u71 b;
                    final MediatedNativeAd c;
                    final jr1 d;
                    {
                        this.b = u712;
                        this.c = mediatedNativeAd;
                        this.d = jr12;
                        super(0);
                    }

                    public final Object invoke() {
                        this.b.a(this.c, this.d);
                        return k0.a;
                    }
                }, (l<String, k0>)new l<String, k0>(this){
                    final u71 b;
                    {
                        this.b = u712;
                        super(1);
                    }

                    public final void a(@NotNull String string2) {
                        u71 u712 = this.b;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Ad is blocked by quality verification with reasons:  ");
                        stringBuilder.append(string2);
                        u712.onAdFailedToLoad(new MediatedAdRequestError(1, stringBuilder.toString()));
                    }
                });
            } else {
                int n10 = op0.b;
                this.a(mediatedNativeAd, jr12);
            }
        }
    }

    public static /* synthetic */ void b(MediatedNativeAd mediatedNativeAd, u71 u712, j61 j612, b8 b82) {
        u71.a(mediatedNativeAd, u712, j612, b82);
    }

    public static /* synthetic */ void c(u71 u712, s51 s512) {
        u71.a(u712, s512);
    }

    public final void onAdClicked() {
        j61 j612 = (j61)this.g.getValue(this, o[0]);
        if (j612 != null && (j612 = j612.i()) != null) {
            j612.a();
        }
        this.b.a(this.f, (Map)this.h);
        Context context = this.f;
        Object object = sp1.b.C;
        j612 = new tp1((Map)this.h, 2);
        j612.b(object.a(), "event_type");
        j612.b(this.i, "ad_info");
        j612.a(this.a.b());
        object = this.a.r();
        if (object != null) {
            j612.a((Map)object);
        }
        this.b.d(context, j612.b());
        this.c.a();
    }

    public final void onAdClosed() {
        this.c.b();
        j61 j612 = (j61)this.g.getValue(this, o[0]);
        if (j612 != null && (j612 = j612.i()) != null) {
            j612.b();
        }
    }

    public final void onAdFailedToLoad(@NotNull MediatedAdRequestError mediatedAdRequestError) {
        j61 j612 = (j61)this.g.getValue(this, o[0]);
        if (j612 != null) {
            mediatedAdRequestError = new f3(mediatedAdRequestError.getCode(), mediatedAdRequestError.getDescription(), mediatedAdRequestError.getDescription(), null);
            this.b.b(j612.k(), (f3)mediatedAdRequestError, (Object)this);
        }
    }

    public final void onAdImpression() {
        if (!this.n) {
            this.n = true;
            this.b.b(this.f, (Map)this.h);
            Context context = this.f;
            Object object = sp1.b.y;
            tp1 tp12 = new tp1((Map)this.h, 2);
            tp12.b((Object)object.a(), "event_type");
            tp12.b((Object)this.i, "ad_info");
            tp12.a(this.a.b());
            object = this.a.r();
            if (object != null) {
                tp12.a((Map)object);
            }
            this.b.d(context, tp12.b());
            context = this.e.a();
            this.c.a((c4)context);
        }
    }

    public final void onAdLeftApplication() {
        this.c.c();
    }

    public final void onAdOpened() {
        this.c.d();
    }

    public final void onAppInstallAdLoaded(@NotNull MediatedNativeAd mediatedNativeAd) {
        this.b(mediatedNativeAd, jr1.d);
    }

    public final void onContentAdLoaded(@NotNull MediatedNativeAd mediatedNativeAd) {
        this.b(mediatedNativeAd, jr1.c);
    }
}


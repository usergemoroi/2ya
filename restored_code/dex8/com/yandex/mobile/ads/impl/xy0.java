/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  com.monetization.ads.mediation.rewarded.MediatedRewardedAdapter
 *  com.monetization.ads.mediation.rewarded.MediatedRewardedAdapterListener
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.dy0
 *  com.yandex.mobile.ads.impl.fz0
 *  com.yandex.mobile.ads.impl.jg1
 *  com.yandex.mobile.ads.impl.mx0
 *  com.yandex.mobile.ads.impl.nx0
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.p4
 *  com.yandex.mobile.ads.impl.tx0
 *  com.yandex.mobile.ads.impl.ux0
 *  com.yandex.mobile.ads.impl.vc0
 *  com.yandex.mobile.ads.impl.x2
 *  kotlin.collections.s0
 */
package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapter;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapterListener;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.cd0;
import com.yandex.mobile.ads.impl.dy0;
import com.yandex.mobile.ads.impl.es1;
import com.yandex.mobile.ads.impl.fz0;
import com.yandex.mobile.ads.impl.iy0;
import com.yandex.mobile.ads.impl.jg1;
import com.yandex.mobile.ads.impl.ms1;
import com.yandex.mobile.ads.impl.mx0;
import com.yandex.mobile.ads.impl.nx0;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.p4;
import com.yandex.mobile.ads.impl.sd0;
import com.yandex.mobile.ads.impl.tx0;
import com.yandex.mobile.ads.impl.ux0;
import com.yandex.mobile.ads.impl.vc0;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.yy0;
import com.yandex.mobile.ads.impl.zy0;
import java.util.Map;
import kotlin.collections.s0;
import kotlin.k0;
import kotlin.u;
import kotlin.v;
import kotlin.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class xy0
implements vc0<es1> {
    @NotNull
    private final cd0<es1> a;
    @NotNull
    private final mx0<MediatedRewardedAdapter, MediatedRewardedAdapterListener> b;
    @NotNull
    private final zy0 c;
    @NotNull
    private final ms1 d;
    @NotNull
    private final dy0 e;

    public xy0(@NotNull cd0<es1> cd02, @NotNull b8<String> dy02, @NotNull fz0 object) {
        this.a = cd02;
        x2 x22 = cd02.e();
        Object object2 = new iy0(x22);
        this.e = dy02 = new dy0(x22, dy02);
        object2 = new yy0((ux0<MediatedRewardedAdapter>)new ux0(object.c(), (iy0)object2, dy02));
        p4 p42 = cd02.h();
        jg1 jg12 = new jg1(cd02, object);
        object = new zy0();
        this.c = object;
        this.b = dy02 = new mx0(x22, p42, (tx0)object, dy02, (nx0)object2, jg12);
        this.d = new ms1(cd02, (mx0)dy02);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object a(sd0 object, Activity activity) {
        u.a a14;
        block5: {
            Throwable throwable2;
            block4: {
                block3: {
                    object = (es1)object;
                    try {
                        a14 = u.d;
                        a14 = this.c.a();
                        if (a14 == null) break block3;
                        this.d.a((es1)object);
                        this.a.i().c();
                        a14.showRewardedAd(activity);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object = u.b(k0.a);
                break block5;
            }
            a14 = u.d;
            object = u.b(v.a(throwable2));
        }
        Object object2 = u.e(object);
        if (object2 != null && (a14 = this.b.a()) != null) {
            activity = activity.getApplicationContext();
            int n10 = op0.b;
            object2 = s0.g(z.a("reason", s0.g(z.a("exception_in_adapter", ((Throwable)object2).toString()))));
            this.e.a((Context)activity, a14.c(), (Map)object2, a14.a().b().getNetworkName());
        }
        return object;
    }

    public final void a(@NotNull Context context) {
        this.a.i().d();
        this.b.a(context);
    }

    public final void a(@NotNull Context context, @NotNull b8<String> b82) {
        this.b.a(context, (Object)this.d);
    }

    @Nullable
    public final String getAdInfo() {
        return null;
    }
}


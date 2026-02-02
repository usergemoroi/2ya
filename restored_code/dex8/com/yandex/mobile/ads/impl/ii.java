/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  com.yandex.mobile.ads.impl.aw2
 *  com.yandex.mobile.ads.impl.bw2
 *  com.yandex.mobile.ads.impl.c3
 *  com.yandex.mobile.ads.impl.c4
 *  com.yandex.mobile.ads.impl.f3
 *  com.yandex.mobile.ads.impl.mr1
 *  com.yandex.mobile.ads.impl.ns
 *  com.yandex.mobile.ads.impl.oq1
 *  com.yandex.mobile.ads.impl.p4
 *  com.yandex.mobile.ads.impl.r4
 *  com.yandex.mobile.ads.impl.wv2
 *  com.yandex.mobile.ads.impl.x2
 *  com.yandex.mobile.ads.impl.xv2
 *  com.yandex.mobile.ads.impl.yv2
 *  com.yandex.mobile.ads.impl.zv2
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.impl.aw2;
import com.yandex.mobile.ads.impl.bw2;
import com.yandex.mobile.ads.impl.c3;
import com.yandex.mobile.ads.impl.c4;
import com.yandex.mobile.ads.impl.dg0;
import com.yandex.mobile.ads.impl.f3;
import com.yandex.mobile.ads.impl.l7;
import com.yandex.mobile.ads.impl.mr1;
import com.yandex.mobile.ads.impl.ns;
import com.yandex.mobile.ads.impl.oq1;
import com.yandex.mobile.ads.impl.p4;
import com.yandex.mobile.ads.impl.r4;
import com.yandex.mobile.ads.impl.wv2;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.xv2;
import com.yandex.mobile.ads.impl.yv2;
import com.yandex.mobile.ads.impl.zv2;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ii
implements c3 {
    @NotNull
    private final Handler a;
    @NotNull
    private final r4 b;
    @Nullable
    private ns c;

    public /* synthetic */ ii(Context context, x2 x22, p4 p42) {
        this(new Handler(Looper.getMainLooper()), new r4(context, x22, p42));
    }

    @JvmOverloads
    public ii(@NotNull Handler handler, @NotNull r4 r43) {
        this.a = handler;
        this.b = r43;
    }

    private static final void a(ii ii3) {
        ii3 = ii3.c;
        if (ii3 != null) {
            ii3.closeBannerAd();
        }
    }

    private static final void a(ii ii3, c4 c43) {
        ii3 = ii3.c;
        if (ii3 != null) {
            ii3.a(c43);
        }
    }

    private static final void a(ii ii3, f3 f33) {
        ii3 = ii3.c;
        if (ii3 != null) {
            ii3.a(f33);
        }
    }

    private static final void b(ii ii3) {
        ii3 = ii3.c;
        if (ii3 != null) {
            ii3.onAdLoaded();
        }
    }

    private static final void c(ii ii3) {
        ii3 = ii3.c;
        if (ii3 != null) {
            ii3.onAdClicked();
            ii3.onLeftApplication();
        }
    }

    private static final void d(ii ii3) {
        ii3 = ii3.c;
        if (ii3 != null) {
            ii3.onReturnedToApplication();
        }
    }

    public static /* synthetic */ void e(ii ii3) {
        ii.d(ii3);
    }

    public static /* synthetic */ void f(ii ii3) {
        ii.c(ii3);
    }

    public static /* synthetic */ void g(ii ii3, f3 f33) {
        ii.a(ii3, f33);
    }

    public static /* synthetic */ void h(ii ii3) {
        ii.b(ii3);
    }

    public static /* synthetic */ void i(ii ii3) {
        ii.a(ii3);
    }

    public static /* synthetic */ void j(ii ii3, c4 c43) {
        ii.a(ii3, c43);
    }

    public final void a() {
        this.a.post((Runnable)new wv2(this));
    }

    public final void a(@Nullable c4 c43) {
        this.a.post((Runnable)new yv2(this, c43));
    }

    public final void a(@NotNull dg0 dg02) {
        this.b.a((mr1)dg02);
    }

    public final void a(@NotNull f3 f33) {
        String string2 = f33.c();
        this.b.a(string2);
        this.a.post((Runnable)new xv2(this, f33));
    }

    public final void a(@Nullable ns ns3) {
        this.c = ns3;
        this.b.a(new Object[]{ns3});
    }

    public final void a(@NotNull x2 object) {
        object = new l7((x2)object);
        this.b.a((oq1)object);
    }

    public final void b() {
        this.a.post((Runnable)new zv2(this));
    }

    public final void c() {
        this.a.post((Runnable)new aw2(this));
    }

    public final void onAdLoaded() {
        this.b.a();
        this.a.post((Runnable)new bw2(this));
    }
}


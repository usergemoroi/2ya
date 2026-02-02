/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.be2
 *  com.yandex.mobile.ads.impl.dh2
 *  com.yandex.mobile.ads.impl.fg2
 *  com.yandex.mobile.ads.impl.id2
 *  com.yandex.mobile.ads.impl.id2$a
 *  com.yandex.mobile.ads.impl.kc2
 *  com.yandex.mobile.ads.impl.md2
 *  com.yandex.mobile.ads.impl.md2$a
 *  com.yandex.mobile.ads.impl.mg1
 *  com.yandex.mobile.ads.impl.mg1$a
 *  com.yandex.mobile.ads.impl.n00
 *  com.yandex.mobile.ads.impl.o4
 *  com.yandex.mobile.ads.impl.og1
 *  com.yandex.mobile.ads.impl.p4
 *  com.yandex.mobile.ads.impl.qf2
 *  com.yandex.mobile.ads.impl.wd2
 *  com.yandex.mobile.ads.impl.wd2$a
 *  com.yandex.mobile.ads.impl.wd2$b
 *  com.yandex.mobile.ads.impl.x2
 *  com.yandex.mobile.ads.impl.xd2
 *  com.yandex.mobile.ads.impl.xd2$a
 *  com.yandex.mobile.ads.impl.xg2
 *  kotlin.jvm.internal.e0
 *  kotlin.jvm.internal.f0
 *  kotlin.reflect.KProperty
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.be2;
import com.yandex.mobile.ads.impl.dh2;
import com.yandex.mobile.ads.impl.fg2;
import com.yandex.mobile.ads.impl.id2;
import com.yandex.mobile.ads.impl.k53;
import com.yandex.mobile.ads.impl.kc2;
import com.yandex.mobile.ads.impl.md2;
import com.yandex.mobile.ads.impl.mg1;
import com.yandex.mobile.ads.impl.n00;
import com.yandex.mobile.ads.impl.o4;
import com.yandex.mobile.ads.impl.og1;
import com.yandex.mobile.ads.impl.p4;
import com.yandex.mobile.ads.impl.qf2;
import com.yandex.mobile.ads.impl.sd2;
import com.yandex.mobile.ads.impl.td2;
import com.yandex.mobile.ads.impl.wd2;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.xd2;
import com.yandex.mobile.ads.impl.xg2;
import com.yandex.mobile.ads.impl.yg2;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.v0;
import kotlin.jvm.internal.y;
import kotlin.properties.a;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ud2
implements xd2.a,
md2.a {
    static final KProperty<Object>[] k = new KProperty[]{v0.f((e0)new f0(ud2.class, "adParameterManager", "getAdParameterManager()Lcom/monetization/ads/video/render/report/VideoAdRenderingResultReporter$ResponseReportParameterManager;", 0)), v0.f((e0)new f0(ud2.class, "requestParameterManager", "getRequestParameterManager()Lcom/monetization/ads/video/render/report/VideoAdRenderingResultReporter$RequestReportParameterManager;", 0))};
    private static final long l = TimeUnit.SECONDS.toMillis(10L);
    @NotNull
    private final p4 a;
    @NotNull
    private final xg2 b;
    @NotNull
    private final mg1 c;
    @NotNull
    private final xd2 d;
    @NotNull
    private final md2 e;
    @NotNull
    private final wd2 f;
    @NotNull
    private final qf2 g;
    private boolean h;
    @NotNull
    private final sd2 i;
    @NotNull
    private final td2 j;

    public /* synthetic */ ud2(Context context, x2 x22, b8 b82, kc2 kc22, p4 p42, be2 be22, dh2 dh22, fg2 fg22, yg2 yg22) {
        int n10 = mg1.a;
        this(context, x22, b82, kc22, p42, be22, dh22, fg22, yg22, mg1.a.a((boolean)false));
    }

    public ud2(@NotNull Context object, @NotNull x2 x22, @Nullable b8 b82, @NotNull kc2 kc22, @NotNull p4 p42, @NotNull be2 be22, @NotNull dh2 dh22, @NotNull fg2 fg22, @NotNull yg2 yg22, @NotNull mg1 mg12) {
        this.a = p42;
        this.b = yg22;
        this.c = mg12;
        this.d = new xd2(fg22, (xd2.a)this);
        this.e = new md2(be22, (md2.a)this);
        this.f = new wd2(object, x22, b82, p42);
        this.g = new qf2(kc22, dh22);
        object = kotlin.properties.a.a;
        this.i = new sd2(this);
        this.j = new td2(this);
    }

    public static final /* synthetic */ wd2 a(ud2 ud22) {
        return ud22.f;
    }

    private static final void b(ud2 ud22) {
        n00 n002 = new n00();
        ud22.a(new id2(id2.a.i, (Throwable)n002));
    }

    public static /* synthetic */ void c(ud2 ud22) {
        ud2.b(ud22);
    }

    public final void a() {
        this.d.b();
        this.a.a(o4.u, null);
        this.b.i();
        this.e.a();
        this.c.a(l, (og1)new k53(this));
    }

    public final void a(@NotNull id2 object) {
        this.d.b();
        this.e.b();
        this.c.stop();
        if (!this.h) {
            this.h = true;
            String string2 = object.a().name().toLowerCase(Locale.ROOT);
            y.i(string2, "toLowerCase(...)");
            String string3 = object.b().getMessage();
            object = string3;
            if (string3 == null) {
                object = "";
            }
            this.f.a(string2, (String)object);
        }
    }

    public final void a(@Nullable wd2.a a14) {
        this.j.setValue(this, k[1], a14);
    }

    public final void a(@Nullable wd2.b b10) {
        this.i.setValue(this, k[0], b10);
    }

    public final void b() {
        this.d.b();
        this.e.b();
        this.c.stop();
    }

    public final void c() {
        this.d.b();
        this.e.b();
        this.c.stop();
    }

    public final void d() {
        this.f.b(this.g.a());
        this.a.a(o4.u);
        if (!this.h) {
            this.h = true;
            this.f.a();
        }
    }

    public final void e() {
        this.h = false;
        this.f.b(null);
        this.d.b();
        this.e.b();
        this.c.stop();
    }

    public final void f() {
        this.d.a();
    }
}


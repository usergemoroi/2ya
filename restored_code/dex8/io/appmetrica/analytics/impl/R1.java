/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.content.Context
 *  android.content.Intent
 *  android.location.Location
 *  android.webkit.WebView
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.impl.A4;
import io.appmetrica.analytics.impl.Ci;
import io.appmetrica.analytics.impl.Ii;
import io.appmetrica.analytics.impl.J0;
import io.appmetrica.analytics.impl.Jc;
import io.appmetrica.analytics.impl.Jo;
import io.appmetrica.analytics.impl.K0;
import io.appmetrica.analytics.impl.Ki;
import io.appmetrica.analytics.impl.Ko;
import io.appmetrica.analytics.impl.L0;
import io.appmetrica.analytics.impl.Lo;
import io.appmetrica.analytics.impl.M0;
import io.appmetrica.analytics.impl.Mo;
import io.appmetrica.analytics.impl.N0;
import io.appmetrica.analytics.impl.O0;
import io.appmetrica.analytics.impl.P0;
import io.appmetrica.analytics.impl.P2;
import io.appmetrica.analytics.impl.Q0;
import io.appmetrica.analytics.impl.R0;
import io.appmetrica.analytics.impl.S0;
import io.appmetrica.analytics.impl.T0;
import io.appmetrica.analytics.impl.U0;
import io.appmetrica.analytics.impl.V0;
import io.appmetrica.analytics.impl.V1;
import io.appmetrica.analytics.impl.W0;
import io.appmetrica.analytics.impl.X0;
import io.appmetrica.analytics.impl.Y0;
import io.appmetrica.analytics.impl.Z0;
import io.appmetrica.analytics.impl.Z9;
import io.appmetrica.analytics.impl.a1;
import io.appmetrica.analytics.impl.b1;
import io.appmetrica.analytics.impl.c1;
import io.appmetrica.analytics.impl.d1;
import io.appmetrica.analytics.impl.d8;
import io.appmetrica.analytics.impl.e1;
import io.appmetrica.analytics.impl.f1;
import io.appmetrica.analytics.impl.g1;
import io.appmetrica.analytics.impl.gl;
import io.appmetrica.analytics.impl.h1;
import io.appmetrica.analytics.impl.i1;
import io.appmetrica.analytics.impl.ib;
import io.appmetrica.analytics.impl.j1;
import io.appmetrica.analytics.impl.k1;
import io.appmetrica.analytics.impl.l1;
import io.appmetrica.analytics.impl.m;
import io.appmetrica.analytics.impl.m1;
import io.appmetrica.analytics.impl.n1;
import io.appmetrica.analytics.impl.o1;
import io.appmetrica.analytics.impl.on;
import io.appmetrica.analytics.impl.p1;
import io.appmetrica.analytics.impl.q1;
import io.appmetrica.analytics.impl.ql;
import io.appmetrica.analytics.impl.qq;
import io.appmetrica.analytics.impl.rb;
import io.appmetrica.analytics.impl.rq;
import io.appmetrica.analytics.impl.sq;
import io.appmetrica.analytics.impl.tb;
import io.appmetrica.analytics.impl.u1;
import io.appmetrica.analytics.impl.v0;
import io.appmetrica.analytics.impl.w0;
import io.appmetrica.analytics.internal.IdentifiersResult;
import io.appmetrica.analytics.internal.js.AppMetricaInitializerJsInterface;
import io.appmetrica.analytics.internal.js.AppMetricaJsInterface;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.List;
import java.util.Map;

public final class r1 {
    public final w0 a;
    public final Mo b;
    public final Ki c;
    public final d8 d;
    public final ql e;
    public final P2 f;
    public final on g;
    public final gl h;

    public r1() {
        this(A4.l().d(), new Mo());
    }

    public r1(w0 w04, Mo mo3) {
        this(w04, new P2(w04), new ql(w04), mo3, new on(w04, mo3), Ki.a(), A4.l().j(), A4.l().o());
    }

    public r1(w0 w04, P2 p23, ql ql3, Mo mo3, on on3, Ki ki3, d8 d84, gl gl2) {
        this.a = w04;
        this.b = mo3;
        this.c = ki3;
        this.d = d84;
        this.f = p23;
        this.g = on3;
        this.e = ql3;
        this.h = gl2;
    }

    public static ib a(r1 r14) {
        return r14.d().a;
    }

    public static /* synthetic */ void a(Object[] objectArray) {
        ModuleAdRevenueProcessor moduleAdRevenueProcessor = A4.l().m().b();
        if (moduleAdRevenueProcessor != null) {
            moduleAdRevenueProcessor.process(objectArray);
        }
    }

    public static IHandlerExecutor c() {
        return A4.l().c.a();
    }

    @NonNull
    public final rb a(@NonNull Context context, @NonNull String string2) {
        Object object = this.f;
        ((P2)object).f.a(context);
        ((P2)object).k.a(string2);
        object = this.g;
        Context context2 = context.getApplicationContext();
        ((on)object).e.a(context2);
        return this.c.a(context.getApplicationContext(), string2);
    }

    @NonNull
    public final IdentifiersResult a(@NonNull Context context) {
        this.f.f.a(context);
        on on3 = this.g;
        Context context2 = context.getApplicationContext();
        on3.e.a(context2);
        on3.f.a(context2);
        return A4.l().a(context.getApplicationContext()).a();
    }

    public final void a() {
        this.f.getClass();
        this.g.getClass();
        IHandlerExecutor iHandlerExecutor = r1.c();
        f1 f12 = new f1(this);
        ((Z9)iHandlerExecutor).b.post((Runnable)f12);
    }

    public final void a(@Nullable Activity object) {
        this.f.a.a(null);
        this.g.getClass();
        IHandlerExecutor iHandlerExecutor = r1.c();
        object = new k1(this, (Activity)object);
        ((Z9)iHandlerExecutor).b.post((Runnable)object);
    }

    public final void a(@NonNull Application object) {
        this.f.e.a(object);
        this.g.c.a((Application)object);
        IHandlerExecutor iHandlerExecutor = r1.c();
        object = new sq(this);
        ((Z9)iHandlerExecutor).b.post((Runnable)object);
    }

    public final void a(@NonNull Context object, @NonNull AppMetricaConfig appMetricaConfig) {
        Object object2 = this.f;
        ((P2)object2).f.a(object);
        ((P2)object2).b.a(appMetricaConfig);
        on on3 = this.g;
        object2 = object.getApplicationContext();
        on3.e.a((Context)object2);
        PublicLogger publicLogger = LoggerStorage.getOrCreatePublicLogger(appMetricaConfig.apiKey);
        if (WrapUtils.getOrDefault(appMetricaConfig.sessionsAutoTrackingEnabled, Boolean.TRUE).booleanValue()) {
            publicLogger.info("Session auto tracking enabled", new Object[0]);
            on3.d.a();
        } else {
            publicLogger.info("Session auto tracking disabled", new Object[0]);
        }
        on3.a.getClass();
        object2 = v0.a((Context)object2);
        ((v0)object2).d.a(appMetricaConfig, (tb)object2);
        object2 = r1.c();
        object = new rq(this, (Context)object, appMetricaConfig);
        ((Z9)object2).b.post((Runnable)object);
        this.a.getClass();
        synchronized (v0.class) {
            v0.f = true;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(@NonNull Context object, @NonNull ReporterConfig reporterConfig) {
        Object object2 = this.f;
        ((P2)object2).f.a(object);
        ((P2)object2).h.a(reporterConfig);
        object2 = this.g;
        Object object3 = object.getApplicationContext();
        ((on)object2).e.a((Context)object3);
        object2 = this.c;
        Context context = object.getApplicationContext();
        if ((Ci)((Ki)object2).a.get(reporterConfig.apiKey) != null) return;
        object = ((Ki)object2).a;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                Object object4;
                Object object5;
                block3: {
                    try {
                        if ((Ci)((Ki)object2).a.get(reporterConfig.apiKey) != null) return;
                        object3 = reporterConfig.apiKey;
                        object5 = A4.l().c.a();
                        ((Ki)object2).b.getClass();
                        if (v0.e != null) break block3;
                        object4 = new Ii((Ki)object2, context);
                        ((Z9)object5).b.post((Runnable)object4);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                context = context.getApplicationContext();
                object4 = new w0();
                object5 = new Ci(context, (String)object3, (w0)object4);
                ((Ki)object2).a.put(object3, object5);
                ((Ci)object5).a(reporterConfig);
                return;
            }
            throw throwable2;
        }
    }

    public final void a(@NonNull Context object, @NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list) {
        Object object2 = this.f;
        ((P2)object2).f.a(object);
        ((P2)object2).p.a(startupParamsCallback);
        on on3 = this.g;
        object2 = object.getApplicationContext();
        on3.e.a((Context)object2);
        object2 = r1.c();
        object = new g1(this, (Context)object, startupParamsCallback, list);
        ((Z9)object2).b.post((Runnable)object);
    }

    public final void a(@NonNull Intent object) {
        Object object2 = this.f;
        ((P2)object2).a.a(null);
        ((P2)object2).d.a(object);
        this.g.getClass();
        object2 = r1.c();
        object = new L0(this, (Intent)object);
        ((Z9)object2).b.post((Runnable)object);
    }

    public final void a(@Nullable Location object) {
        this.f.getClass();
        this.g.getClass();
        IHandlerExecutor iHandlerExecutor = r1.c();
        object = new N0(this, (Location)object);
        ((Z9)iHandlerExecutor).b.post((Runnable)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a(@NonNull WebView object) {
        Object object2;
        block10: {
            Throwable throwable3;
            block11: {
                block6: {
                    Throwable throwable22;
                    block9: {
                        block8: {
                            Object object3;
                            block7: {
                                object2 = this.f;
                                ((P2)object2).a.a(null);
                                ((P2)object2).m.a(object);
                                object2 = this.g.b;
                                object2.getClass();
                                try {
                                    if (!object.getSettings().getJavaScriptEnabled()) break block6;
                                    object3 = new AppMetricaJsInterface(this);
                                    object.addJavascriptInterface(object3, "AppMetrica");
                                    object3 = new AppMetricaInitializerJsInterface(this);
                                    object.addJavascriptInterface(object3, "AppMetricaInitializer");
                                    object = new Jo();
                                    // MONITORENTER : object2
                                }
                                catch (Throwable throwable3) {}
                                try {
                                    object3 = ((Mo)object2).b;
                                    if (object3 != null) break block7;
                                    ((Mo)object2).a.add(object);
                                    break block8;
                                }
                                catch (Throwable throwable22) {
                                    break block9;
                                }
                            }
                            ((Jo)object).consume(object3);
                        }
                        // MONITOREXIT : object2
                        break block10;
                    }
                    // MONITOREXIT : object2
                    throw throwable22;
                    break block11;
                }
                object = new Ko();
                ((Mo)object2).a((Consumer)object);
                break block10;
            }
            ((Mo)object2).a(new Lo(throwable3));
        }
        object = r1.c();
        object2 = new a1(this);
        ((Z9)object).b.post((Runnable)object2);
    }

    public final void a(@NonNull AdRevenue object) {
        Object object2 = this.f;
        ((P2)object2).a.a(null);
        ((P2)object2).y.a(object);
        this.g.getClass();
        object2 = r1.c();
        object = new V0(this, (AdRevenue)object);
        ((Z9)object2).b.post((Runnable)object);
    }

    public final void a(@NonNull AnrListener object) {
        Object object2 = this.f;
        ((P2)object2).a.a(null);
        ((P2)object2).q.a(object);
        this.g.getClass();
        object2 = r1.c();
        object = new h1(this, (AnrListener)object);
        ((Z9)object2).b.post((Runnable)object);
    }

    public final void a(@NonNull DeferredDeeplinkListener object) {
        Object object2 = this.f;
        ((P2)object2).a.a(null);
        ((P2)object2).g.a(object);
        this.g.getClass();
        object2 = r1.c();
        object = new Y0(this, (DeferredDeeplinkListener)object);
        ((Z9)object2).b.post((Runnable)object);
    }

    public final void a(@NonNull DeferredDeeplinkParametersListener object) {
        Object object2 = this.f;
        ((P2)object2).a.a(null);
        ((P2)object2).g.a(object);
        this.g.getClass();
        object2 = r1.c();
        object = new X0(this, (DeferredDeeplinkParametersListener)object);
        ((Z9)object2).b.post((Runnable)object);
    }

    public final void a(@NonNull ExternalAttribution object) {
        Object object2 = this.f;
        ((P2)object2).a.a(null);
        ((P2)object2).r.a(object);
        this.g.getClass();
        object2 = r1.c();
        object = new i1(this, (ExternalAttribution)object);
        ((Z9)object2).b.post((Runnable)object);
    }

    public final void a(@NonNull Revenue object) {
        Object object2 = this.f;
        ((P2)object2).a.a(null);
        ((P2)object2).x.a(object);
        this.g.getClass();
        object2 = r1.c();
        object = new U0(this, (Revenue)object);
        ((Z9)object2).b.post((Runnable)object);
    }

    public final void a(@NonNull ECommerceEvent object) {
        Object object2 = this.f;
        ((P2)object2).a.a(null);
        ((P2)object2).z.a(object);
        this.g.getClass();
        object2 = r1.c();
        object = new W0(this, (ECommerceEvent)object);
        ((Z9)object2).b.post((Runnable)object);
    }

    public final void a(@NonNull UserProfile object) {
        Object object2 = this.f;
        ((P2)object2).a.a(null);
        ((P2)object2).w.a(object);
        this.g.getClass();
        object2 = r1.c();
        object = new S0(this, (UserProfile)object);
        ((Z9)object2).b.post((Runnable)object);
    }

    public final void a(@NonNull String object) {
        Object object2 = this.f;
        ((P2)object2).a.a(null);
        ((P2)object2).i.a(object);
        this.g.getClass();
        object2 = r1.c();
        object = new K0(this, (String)object);
        ((Z9)object2).b.post((Runnable)object);
    }

    public final void a(@NonNull String object, @Nullable String string2) {
        this.f.getClass();
        this.g.getClass();
        IHandlerExecutor iHandlerExecutor = r1.c();
        object = new d1(this, (String)object, string2);
        ((Z9)iHandlerExecutor).b.post((Runnable)object);
    }

    public final void a(@NonNull String object, @Nullable String string2, @Nullable Throwable throwable) {
        Object object2 = this.f;
        ((P2)object2).a.a(null);
        ((P2)object2).u.a(object);
        this.g.getClass();
        object2 = r1.c();
        object = new p1(this, (String)object, string2, throwable);
        ((Z9)object2).b.post((Runnable)object);
    }

    public final void a(@NonNull String object, @Nullable Throwable object2) {
        Object object3 = this.f;
        ((P2)object3).a.a(null);
        ((P2)object3).t.a(object);
        this.g.getClass();
        object3 = object2;
        if (object2 == null) {
            object3 = new V1();
            ((Throwable)object3).fillInStackTrace();
        }
        object2 = r1.c();
        object = new o1(this, (String)object, (Throwable)object3);
        ((Z9)object2).b.post((Runnable)object);
    }

    public final void a(@NonNull String object, @Nullable Map<String, Object> object2) {
        Object object3 = this.f;
        ((P2)object3).a.a(null);
        ((P2)object3).s.a(object);
        this.g.getClass();
        object3 = CollectionUtils.getListFromMap(object2);
        object2 = r1.c();
        object = new n1(this, (String)object, (List)object3);
        ((Z9)object2).b.post((Runnable)object);
    }

    public final void a(@NonNull Throwable object) {
        Object object2 = this.f;
        ((P2)object2).a.a(null);
        ((P2)object2).v.a(object);
        this.g.getClass();
        object2 = r1.c();
        object = new q1(this, (Throwable)object);
        ((Z9)object2).b.post((Runnable)object);
    }

    public final void a(@NonNull Map<Thread, StackTraceElement[]> object) {
        this.f.A.a(object);
        this.g.getClass();
        Object object2 = CollectionUtils.getListFromMap(object);
        object = r1.c();
        object2 = new j1(this, (List)object2);
        ((Z9)object).b.post((Runnable)object2);
    }

    public final void a(boolean bl2) {
        this.f.getClass();
        this.g.getClass();
        IHandlerExecutor iHandlerExecutor = r1.c();
        P0 p02 = new P0(this, bl2);
        ((Z9)iHandlerExecutor).b.post((Runnable)p02);
    }

    @Nullable
    public final String b() {
        this.a.getClass();
        Object object = v0.e;
        object = object == null ? null : ((v0)object).f().e();
        return object;
    }

    public final void b(@NonNull Activity object) {
        Object object2 = this.f;
        ((P2)object2).a.a(null);
        ((P2)object2).c.a(object);
        this.g.getClass();
        object2 = on.a(object);
        object = r1.c();
        object2 = new J0(this, (Intent)object2);
        ((Z9)object).b.post((Runnable)object2);
    }

    public final void b(@NonNull Context context) {
        this.f.f.a(context);
        this.g.e.a(context);
        this.a.getClass();
        v0.a(context);
    }

    public final void b(Context object, AppMetricaConfig object2) {
        w0 w04 = this.a;
        object = object.getApplicationContext();
        w04.getClass();
        object = v0.a((Context)object);
        object2 = this.d.a((AppMetricaConfig)object2);
        ((v0)object).f().b((AppMetricaConfig)object2);
        object2 = ((v0)object).a;
        object = A4.l().c.a();
        object2 = new u1((Context)object2);
        ((Z9)object).execute((Runnable)object2);
    }

    public final void b(@NonNull String object) {
        Object object2 = this.f;
        ((P2)object2).a.a(null);
        ((P2)object2).s.a(object);
        this.g.getClass();
        object2 = r1.c();
        object = new l1(this, (String)object);
        ((Z9)object2).b.post((Runnable)object);
    }

    public final void b(@NonNull String object, @Nullable String string2) {
        this.f.l.a(object);
        this.g.getClass();
        IHandlerExecutor iHandlerExecutor = r1.c();
        object = new Z0(this, (String)object, string2);
        ((Z9)iHandlerExecutor).b.post((Runnable)object);
    }

    public final void b(boolean bl2) {
        this.f.getClass();
        this.g.getClass();
        IHandlerExecutor iHandlerExecutor = r1.c();
        Q0 q02 = new Q0(this, bl2);
        ((Z9)iHandlerExecutor).b.post((Runnable)q02);
    }

    public final void b(Object ... object) {
        this.f.a.a(null);
        this.g.getClass();
        IHandlerExecutor iHandlerExecutor = r1.c();
        object = new qq((Object[])object);
        ((Z9)iHandlerExecutor).b.post((Runnable)object);
    }

    public final void c(@Nullable Activity object) {
        this.f.a.a(null);
        this.g.getClass();
        IHandlerExecutor iHandlerExecutor = r1.c();
        object = new e1(this, (Activity)object);
        ((Z9)iHandlerExecutor).b.post((Runnable)object);
    }

    public final void c(@NonNull String object) {
        if (!this.e.a(null).a) {
            return;
        }
        if (!this.f.n.a((String)object).a) {
            return;
        }
        this.g.getClass();
        IHandlerExecutor iHandlerExecutor = r1.c();
        object = new c1(this, (String)object);
        ((Z9)iHandlerExecutor).b.post((Runnable)object);
    }

    public final void c(@NonNull String object, @Nullable String string2) {
        Object object2 = this.f;
        ((P2)object2).a.a(null);
        ((P2)object2).s.a(object);
        this.g.getClass();
        object2 = r1.c();
        object = new m1(this, (String)object, string2);
        ((Z9)object2).b.post((Runnable)object);
    }

    public final void c(boolean bl2) {
        this.f.getClass();
        this.g.getClass();
        IHandlerExecutor iHandlerExecutor = r1.c();
        O0 o02 = new O0(this, bl2);
        ((Z9)iHandlerExecutor).b.post((Runnable)o02);
    }

    public final Jc d() {
        this.a.getClass();
        return v0.e.f().i();
    }

    public final void d(@NonNull String object) {
        Object object2 = this.f;
        ((P2)object2).a.a(null);
        ((P2)object2).j.a(object);
        this.g.getClass();
        object2 = r1.c();
        object = new M0(this, (String)object);
        ((Z9)object2).b.post((Runnable)object);
    }

    public final void d(@NonNull String object, @Nullable String string2) {
        Object object2 = this.f;
        ((P2)object2).a.a(null);
        if (!((P2)object2).o.a((String)object).a) {
            return;
        }
        this.g.getClass();
        object2 = r1.c();
        object = new b1(this, (String)object, string2);
        ((Z9)object2).b.post((Runnable)object);
    }

    public final void e() {
        m m12 = this.h.a();
        this.d().a.a(m12);
    }

    public final void e(@Nullable String object) {
        this.f.getClass();
        this.g.getClass();
        IHandlerExecutor iHandlerExecutor = r1.c();
        object = new R0(this, (String)object);
        ((Z9)iHandlerExecutor).b.post((Runnable)object);
    }

    public final void f() {
        this.f.a.a(null);
        this.g.getClass();
        IHandlerExecutor iHandlerExecutor = r1.c();
        T0 t02 = new T0(this);
        ((Z9)iHandlerExecutor).b.post((Runnable)t02);
    }
}


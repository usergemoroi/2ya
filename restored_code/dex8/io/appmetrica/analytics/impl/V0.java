/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.location.Location
 *  androidx.annotation.AnyThread
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  androidx.annotation.WorkerThread
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.impl.A4;
import io.appmetrica.analytics.impl.B0;
import io.appmetrica.analytics.impl.C4;
import io.appmetrica.analytics.impl.Jc;
import io.appmetrica.analytics.impl.Ud;
import io.appmetrica.analytics.impl.bb;
import io.appmetrica.analytics.impl.cb;
import io.appmetrica.analytics.impl.hd;
import io.appmetrica.analytics.impl.q0;
import io.appmetrica.analytics.impl.q4;
import io.appmetrica.analytics.impl.rb;
import io.appmetrica.analytics.impl.sb;
import io.appmetrica.analytics.impl.tb;
import io.appmetrica.analytics.impl.u0;
import io.appmetrica.analytics.impl.u1;
import io.appmetrica.analytics.impl.u4;
import io.appmetrica.analytics.impl.vq;
import io.appmetrica.analytics.impl.wq;
import io.appmetrica.analytics.impl.xa;
import io.appmetrica.analytics.impl.z0;
import java.util.List;
import java.util.Map;
import java.util.concurrent.FutureTask;

public final class v0
implements tb {
    public static volatile v0 e;
    public static volatile boolean f;
    public static volatile boolean g;
    public final Context a;
    public final q0 b;
    public final FutureTask c;
    public final bb d;

    @AnyThread
    public v0(@NonNull Context context) {
        q0 q02;
        this.a = context;
        this.b = q02 = A4.l().c();
        this.d = q02.a(context, A4.l().g());
        this.c = new FutureTask(new wq(this));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @AnyThread
    @NonNull
    public static v0 a(@NonNull Context object) {
        Object object2 = e;
        v0 v04 = object2;
        if (object2 != null) return v04;
        synchronized (v0.class) {
            try {
                object2 = e;
                v04 = object2;
                if (object2 != null) return v04;
                v04 = new v0((Context)object);
                v04.j();
                object2 = A4.l().c.a();
                object = new u0(v04);
                object2.execute((Runnable)object);
                e = v04;
                return v04;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @WorkerThread
    public static void a(@Nullable Location location) {
        v0.c().a(location);
    }

    @VisibleForTesting(otherwise=5)
    public static void a(@Nullable v0 v04) {
        synchronized (v0.class) {
            e = v04;
            return;
        }
    }

    @WorkerThread
    public static void a(@NonNull String string2) {
        v0.c().a(string2);
    }

    @WorkerThread
    public static void a(String string2, String string3) {
        v0.c().a(string2, string3);
    }

    @WorkerThread
    public static void a(boolean bl2) {
        v0.c().a(bl2);
    }

    @WorkerThread
    public static void b(boolean bl2) {
        v0.c().b(bl2);
    }

    public static hd c() {
        hd hd3 = v0.m() ? e.f() : A4.l().b;
        return hd3;
    }

    @WorkerThread
    public static void clearAppEnvironment() {
        v0.c().clearAppEnvironment();
    }

    @AnyThread
    public static boolean k() {
        synchronized (v0.class) {
            boolean bl2 = f;
            return bl2;
        }
    }

    @AnyThread
    public static boolean l() {
        return g;
    }

    @AnyThread
    public static boolean m() {
        synchronized (v0.class) {
            Throwable throwable2;
            block6: {
                boolean bl2;
                block5: {
                    block4: {
                        Object object;
                        try {
                            object = e;
                            if (object == null) break block4;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                        if (!((v0)object).c.isDone() || (object = ((v0)object).f().i()) == null) break block4;
                        bl2 = true;
                        break block5;
                    }
                    bl2 = false;
                }
                return bl2;
            }
            throw throwable2;
        }
    }

    @VisibleForTesting(otherwise=5)
    public static void n() {
        synchronized (v0.class) {
            e = null;
            f = false;
            g = false;
            return;
        }
    }

    @WorkerThread
    public static void putAppEnvironmentValue(String string2, String string3) {
        v0.c().putAppEnvironmentValue(string2, string3);
    }

    @AnyThread
    public static void q() {
        synchronized (v0.class) {
            f = true;
            return;
        }
    }

    @AnyThread
    public static void r() {
        g = true;
    }

    @AnyThread
    @Nullable
    public static v0 s() {
        return e;
    }

    @WorkerThread
    public static void setDataSendingEnabled(boolean bl2) {
        v0.c().setDataSendingEnabled(bl2);
    }

    @WorkerThread
    public static void setUserProfileID(@Nullable String string2) {
        v0.c().setUserProfileID(string2);
    }

    @Override
    @NonNull
    public final sb a() {
        return this.f().a();
    }

    @WorkerThread
    public final void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f().a(deferredDeeplinkListener);
    }

    @WorkerThread
    public final void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f().a(deferredDeeplinkParametersListener);
    }

    @WorkerThread
    public final void a(@NonNull ReporterConfig reporterConfig) {
        this.f().a(reporterConfig);
    }

    @WorkerThread
    public final void a(@NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list) {
        this.f().a(startupParamsCallback, list);
    }

    @AnyThread
    @NonNull
    public final C4 b() {
        return this.d.a();
    }

    @WorkerThread
    public final void b(@NonNull AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        this.f().a(appMetricaLibraryAdapterConfig);
        appMetricaLibraryAdapterConfig = this.a;
        A4.l().c.a().execute(new u1((Context)appMetricaLibraryAdapterConfig));
    }

    @NonNull
    @WorkerThread
    public final rb c(@NonNull ReporterConfig reporterConfig) {
        return this.f().c(reporterConfig);
    }

    @AnyThread
    public final void c(@Nullable AppMetricaConfig appMetricaConfig) {
        this.d.a(appMetricaConfig, this);
    }

    @AnyThread
    @NonNull
    public final xa d() {
        return this.f().d();
    }

    @WorkerThread
    public final void d(@NonNull AppMetricaConfig appMetricaConfig) {
        this.f().b(appMetricaConfig);
        appMetricaConfig = this.a;
        A4.l().c.a().execute(new u1((Context)appMetricaConfig));
    }

    @AnyThread
    @Nullable
    public final String e() {
        return this.f().e();
    }

    public final cb f() {
        try {
            cb cb2 = (cb)this.c.get();
            return cb2;
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    @AnyThread
    @Nullable
    public final Map<String, String> g() {
        return this.f().g();
    }

    @AnyThread
    @NonNull
    public final AdvIdentifiersResult h() {
        return this.f().h();
    }

    @Nullable
    @WorkerThread
    public final Jc i() {
        return this.f().i();
    }

    public final void j() {
        Object object = A4.l().c;
        vq vq3 = new vq(this);
        ((q4)object).a.getClass();
        object = new StringBuilder();
        ((StringBuilder)object).append("IAA-INIT_CORE");
        ((StringBuilder)object).append("-");
        ((StringBuilder)object).append(Ud.a.incrementAndGet());
        new InterruptionSafeThread(vq3, ((StringBuilder)object).toString()).start();
    }

    public final void o() {
        A4.l().r.a(this.a);
        new u4(this.a).a(this.a);
        A4.l().a(this.a).a();
        this.c.run();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final cb p() {
        q0 q02 = this.b;
        Object object = this.a;
        bb bb4 = this.d;
        synchronized (q02) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (q02.d != null) return q02.d;
                        if (!q02.a((Context)object)) break block3;
                        object = new B0();
                        q02.d = object;
                        return q02.d;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                z0 z02 = new z0((Context)object, bb4);
                q02.d = z02;
                return q02.d;
            }
            throw throwable2;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.location.Location
 *  android.os.Bundle
 *  androidx.annotation.AnyThread
 *  androidx.annotation.WorkerThread
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import androidx.annotation.AnyThread;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.impl.A0;
import io.appmetrica.analytics.impl.A4;
import io.appmetrica.analytics.impl.Fg;
import io.appmetrica.analytics.impl.Fi;
import io.appmetrica.analytics.impl.Gb;
import io.appmetrica.analytics.impl.Jc;
import io.appmetrica.analytics.impl.K5;
import io.appmetrica.analytics.impl.Od;
import io.appmetrica.analytics.impl.Si;
import io.appmetrica.analytics.impl.Vf;
import io.appmetrica.analytics.impl.Wc;
import io.appmetrica.analytics.impl.Xl;
import io.appmetrica.analytics.impl.Y7;
import io.appmetrica.analytics.impl.bb;
import io.appmetrica.analytics.impl.cb;
import io.appmetrica.analytics.impl.d8;
import io.appmetrica.analytics.impl.gl;
import io.appmetrica.analytics.impl.ib;
import io.appmetrica.analytics.impl.j4;
import io.appmetrica.analytics.impl.l0;
import io.appmetrica.analytics.impl.pf;
import io.appmetrica.analytics.impl.rb;
import io.appmetrica.analytics.impl.sb;
import io.appmetrica.analytics.impl.t0;
import io.appmetrica.analytics.impl.ve;
import io.appmetrica.analytics.impl.x0;
import io.appmetrica.analytics.impl.xa;
import io.appmetrica.analytics.impl.y0;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.logger.common.BaseImportantLogger;
import io.appmetrica.analytics.logger.common.BaseReleaseLogger;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class z0
implements cb {
    public final Context a;
    public final bb b;
    public final pf c;
    public final Xl d;
    public final Fg e;
    public final Vf f;
    public final Fi g;
    public final Si h;
    public final d8 i;
    public final gl j;
    public volatile Jc k;
    public final l0 l;
    public boolean m;

    @WorkerThread
    public z0(@NotNull Context context, @NotNull bb bb4) {
        Si si3;
        Vf vf3;
        pf pf3;
        this.a = context;
        this.b = bb4;
        this.c = pf3 = A4.l().b(context);
        Od.a();
        A4 a44 = A4.l();
        a44.m().a(new j4(context));
        this.f = vf3 = A0.a(context, A0.a(bb4.b(), this));
        Object object = a44.j();
        this.i = object;
        this.h = si3 = A0.a(vf3, context, bb4.getDefaultExecutor());
        ((d8)object).a(si3);
        this.d = object = A0.a(context, si3, pf3, bb4.b());
        si3.a((Xl)object);
        this.e = A0.a(si3, pf3, bb4.b());
        this.g = A0.a(context, vf3, si3, bb4.b(), (Xl)object);
        this.j = a44.o();
        this.l = new l0(pf3);
    }

    public static final /* synthetic */ d8 a(z0 z02) {
        return z02.i;
    }

    public static final /* synthetic */ Fi b(z0 z02) {
        return z02.g;
    }

    @Override
    public final sb a() {
        return this.g;
    }

    @Override
    @AnyThread
    public final void a(int n10, @NotNull Bundle bundle) {
        this.d.b(bundle, null);
    }

    @Override
    @WorkerThread
    public final void a(@Nullable Location location) {
        this.j().a(location);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a(AppMetricaConfig appMetricaConfig, PublicLogger map2) {
        Object object = Boolean.TRUE;
        Boolean bl2 = appMetricaConfig.logs;
        if (((Boolean)object).equals(bl2)) {
            ((BaseReleaseLogger)((Object)map2)).setEnabled(true);
            PublicLogger.Companion.getAnonymousInstance().setEnabled(true);
        } else {
            ((BaseReleaseLogger)((Object)map2)).setEnabled(false);
            PublicLogger.Companion.getAnonymousInstance().setEnabled(false);
        }
        if (WrapUtils.getOrDefault(appMetricaConfig.crashReporting, object).booleanValue()) {
            this.b.d().a(this.a, appMetricaConfig, this);
            this.b.d().b();
            ((BaseReleaseLogger)((Object)map2)).info("Register application crash handler", new Object[0]);
        } else {
            this.b.d().a();
            ((BaseReleaseLogger)((Object)map2)).info("Disable all crash handlers", new Object[0]);
        }
        if (WrapUtils.getOrDefault(appMetricaConfig.sessionsAutoTrackingEnabled, object).booleanValue()) {
            this.j.a();
        } else {
            object = this.j;
            // MONITORENTER : object
            if (((gl)object).g) {
                ((gl)object).a.unregisterListener(((gl)object).c, ActivityEvent.RESUMED);
                ((gl)object).a.unregisterListener(((gl)object).d, ActivityEvent.PAUSED);
                ((gl)object).g = false;
            }
        }
        this.f.d(appMetricaConfig);
        object = this.d;
        ((Xl)object).e = map2;
        ((Xl)object).b(appMetricaConfig.customHosts);
        object = this.d;
        map2 = appMetricaConfig.additionalConfig.get("YMM_clids");
        map2 = map2 instanceof Map ? (Map)map2 : null;
        ((Xl)object).a(map2);
        map2 = (String)appMetricaConfig.additionalConfig.get("YMM_distributionReferrer");
        this.d.a((String)((Object)map2));
        if (map2 != null) {
            this.d.b("api");
        }
        this.h.a(appMetricaConfig.locationTracking, appMetricaConfig.dataSendingEnabled, appMetricaConfig.advIdentifiersTracking);
        this.d.i();
    }

    @Override
    @WorkerThread
    public final void a(@NotNull AppMetricaLibraryAdapterConfig object) {
        Object object2 = this.l;
        Object object3 = ((l0)object2).a.f();
        if (object3 != null) {
            object = object3;
        } else {
            object3 = ((l0)object2).b;
            object3.getClass();
            object2 = AppMetricaConfig.newConfigBuilder("629a824d-c717-4ba5-bc0f-3f3968554d01");
            if (((t0)object3).a.b() && y.e(((t0)object3).b.a, Boolean.TRUE)) {
                ((AppMetricaConfig.Builder)object2).handleFirstActivationAsUpdate(true);
            }
            object = object3 = ((AppMetricaLibraryAdapterConfig)object).advIdentifiersTracking;
            if (object3 == null) {
                object = Boolean.FALSE;
            }
            ((AppMetricaConfig.Builder)object2).withAdvIdentifiersTracking((Boolean)object);
            object = ((AppMetricaConfig.Builder)object2).build();
        }
        object3 = LoggerStorage.getMainPublicOrAnonymousLogger();
        if (this.a((PublicLogger)object3, (AppMetricaConfig)object, new y0(this, (AppMetricaConfig)object, (PublicLogger)object3))) {
            ImportantLogger.INSTANCE.info("AppMetrica", "Activate AppMetrica in anonymous mode", new Object[0]);
        }
    }

    @Override
    @WorkerThread
    public final void a(@NotNull DeferredDeeplinkListener deferredDeeplinkListener) {
        this.e.a(deferredDeeplinkListener);
    }

    @Override
    @WorkerThread
    public final void a(@NotNull DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.e.a(deferredDeeplinkParametersListener);
    }

    @Override
    @WorkerThread
    public final void a(@NotNull ReporterConfig reporterConfig) {
        this.g.a(reporterConfig);
    }

    @Override
    @WorkerThread
    public final void a(@NotNull StartupParamsCallback startupParamsCallback, @NotNull List<String> list) {
        this.d.a(startupParamsCallback, list, Gb.c(this.f.a.getAsString("PROCESS_CFG_CLIDS")));
    }

    @Override
    @WorkerThread
    public final void a(@NotNull String string2) {
        this.j().a(string2);
    }

    @Override
    @WorkerThread
    public final void a(@NotNull String string2, @NotNull String string3) {
        this.j().a(string2, string3);
    }

    @Override
    @WorkerThread
    public final void a(boolean bl2) {
        this.j().a(bl2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean a(PublicLogger object, AppMetricaConfig object2, Wc iterator) {
        if (this.k != null) {
            iterator.a();
            return false;
        }
        this.a((AppMetricaConfig)object2, (PublicLogger)object);
        this.e.a();
        object = iterator.a();
        object2 = new Y7((ib)object);
        iterator = new Jc((ib)object, (Y7)object2);
        this.b.c().a((Y7)object2);
        this.k = iterator;
        object2 = this.j.b;
        synchronized (object2) {
            try {
                ((K5)object2).a = object;
                iterator = ((K5)object2).b.iterator();
                while (true) {
                    if (!iterator.hasNext()) {
                        ((K5)object2).b.clear();
                        return true;
                    }
                    ((ve)iterator.next()).consume(object);
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    @WorkerThread
    public final void b(@NotNull AppMetricaConfig appMetricaConfig) {
        StringBuilder stringBuilder;
        boolean bl2;
        Object object = LoggerStorage.getOrCreateMainPublicLogger(appMetricaConfig.apiKey);
        boolean bl3 = this.a((PublicLogger)object, appMetricaConfig, new x0(this, appMetricaConfig, (PublicLogger)object));
        if (!bl3 && !this.m) {
            this.a(appMetricaConfig, (PublicLogger)object);
            bl2 = true;
        } else {
            bl2 = false;
        }
        if (!bl3 && !bl2) {
            ((BaseReleaseLogger)object).warning("AppMetrica SDK already has been activated", new Object[0]);
        } else {
            this.c.a(appMetricaConfig);
        }
        if (bl3) {
            object = ImportantLogger.INSTANCE;
            stringBuilder = new StringBuilder("Activate AppMetrica with APIKey ");
            stringBuilder.append(ApiKeyUtils.createPartialApiKey(appMetricaConfig.apiKey));
            ((BaseImportantLogger)object).info("AppMetrica", stringBuilder.toString(), new Object[0]);
        }
        if (bl2) {
            object = ImportantLogger.INSTANCE;
            stringBuilder = new StringBuilder("Upgrade AppMetrica anonymous mode to normal with APIKey ");
            stringBuilder.append(ApiKeyUtils.createPartialApiKey(appMetricaConfig.apiKey));
            ((BaseImportantLogger)object).info("AppMetrica", stringBuilder.toString(), new Object[0]);
        }
        this.m = true;
    }

    @Override
    @WorkerThread
    public final void b(boolean bl2) {
        this.j().b(bl2);
    }

    @Override
    @WorkerThread
    @NotNull
    public final rb c(@NotNull ReporterConfig reporterConfig) {
        return this.g.b(reporterConfig);
    }

    @Override
    @WorkerThread
    public final void clearAppEnvironment() {
        this.j().clearAppEnvironment();
    }

    @Override
    @AnyThread
    @NotNull
    public final xa d() {
        return this.d.e();
    }

    @Override
    @AnyThread
    @Nullable
    public final String e() {
        return this.d.d();
    }

    @Override
    @AnyThread
    @Nullable
    public final Map<String, String> g() {
        return this.d.b();
    }

    @Override
    @AnyThread
    @NotNull
    public final AdvIdentifiersResult h() {
        return this.d.a();
    }

    @Override
    @AnyThread
    @Nullable
    public final Jc i() {
        return this.k;
    }

    public final ib j() {
        Jc jc3 = this.k;
        y.g(jc3);
        return jc3.a;
    }

    @AnyThread
    @NotNull
    public final Fi k() {
        return this.g;
    }

    @Override
    @WorkerThread
    public final void putAppEnvironmentValue(@NotNull String string2, @NotNull String string3) {
        this.j().putAppEnvironmentValue(string2, string3);
    }

    @Override
    @WorkerThread
    public final void setDataSendingEnabled(boolean bl2) {
        this.j().setDataSendingEnabled(bl2);
    }

    @Override
    @WorkerThread
    public final void setUserProfileID(@Nullable String string2) {
        this.j().setUserProfileID(string2);
    }
}


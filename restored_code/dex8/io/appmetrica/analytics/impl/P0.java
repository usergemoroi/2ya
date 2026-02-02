/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.C4;
import io.appmetrica.analytics.impl.Kb;
import io.appmetrica.analytics.impl.a2;
import io.appmetrica.analytics.impl.bb;
import io.appmetrica.analytics.impl.e4;
import io.appmetrica.analytics.impl.nq;
import io.appmetrica.analytics.impl.q4;
import io.appmetrica.analytics.impl.tb;
import io.appmetrica.analytics.impl.v0;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.common.BaseReleaseLogger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class p0
implements bb {
    public final Context a;
    public final IHandlerExecutor b;
    public final C4 c;
    public final Handler d;
    public final a2 e;
    public final Kb f;

    public p0(@NotNull Context context, @NotNull q4 q44) {
        this.a = context;
        this.b = q44.a();
        this.c = new C4();
        this.d = this.f().getHandler();
        this.e = new a2();
        this.f = new Kb();
        BaseReleaseLogger.init(context);
        this.f().execute(new nq());
        this.a().a();
        e4.a().onCreate();
    }

    public static final void e() {
        CharSequence charSequence = new StringBuilder("Initializing of AppMetrica, ");
        charSequence.append(StringUtils.capitalize("release"));
        charSequence.append(" type, Version 7.12.0, API Level ");
        charSequence.append(AppMetrica.getLibraryApiLevel());
        charSequence.append(", Dated 04.09.2025.");
        charSequence = charSequence.toString();
        ImportantLogger.INSTANCE.info("AppMetrica", (String)charSequence, new Object[0]);
    }

    @Override
    @NotNull
    public final C4 a() {
        return this.c;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a(@Nullable AppMetricaConfig var1_1, @NotNull tb var2_3) {
        synchronized (this) {
            block13: {
                block11: {
                    block12: {
                        try {
                            if (v0.g) break block11;
                            if (var1_1 != null) {
                                var3_5 = var4_4 = var1_1.crashReporting;
                                if (var4_4 != null) break block12;
                                var3_5 = Boolean.TRUE;
                            }
                            ** GOTO lbl-1000
                        }
                        catch (Throwable var1_2) {
                            break block13;
                        }
                    }
                    if (!var3_5.booleanValue()) {
                        this.f.a();
                    } else lbl-1000:
                    // 2 sources

                    {
                        this.f.c();
                        this.f.b();
                        if (var1_1 != null) {
                            this.f.a(this.a, var1_1, (tb)var2_3);
                        }
                    }
                    if (var1_1 == null) ** GOTO lbl-1000
                    var3_5 = var1_1.appOpenTrackingEnabled;
                    var2_3 = var3_5;
                    if (var3_5 == null) {
                        var2_3 = Boolean.TRUE;
                    }
                    if (!var2_3.booleanValue()) {
                        this.e.c();
                    } else lbl-1000:
                    // 2 sources

                    {
                        this.e.b();
                    }
                    if (var1_1 != null) {
                        v0.g = true;
                    }
                }
                return;
            }
            throw var1_2;
        }
    }

    @Override
    @NotNull
    public final Handler b() {
        return this.d;
    }

    @Override
    @NotNull
    public final a2 c() {
        return this.e;
    }

    @Override
    @NotNull
    public final Kb d() {
        return this.f;
    }

    @NotNull
    public final IHandlerExecutor f() {
        return this.b;
    }

    @Override
    public final ICommonExecutor getDefaultExecutor() {
        return this.b;
    }
}


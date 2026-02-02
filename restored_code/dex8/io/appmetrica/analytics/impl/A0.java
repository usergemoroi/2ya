/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.impl.A4;
import io.appmetrica.analytics.impl.Z9;
import io.appmetrica.analytics.impl.gl;
import io.appmetrica.analytics.impl.q4;
import io.appmetrica.analytics.impl.tb;
import io.appmetrica.analytics.impl.u1;
import io.appmetrica.analytics.impl.v0;
import io.appmetrica.analytics.impl.w0;
import io.appmetrica.analytics.impl.wp;
import io.appmetrica.analytics.logger.common.BaseReleaseLogger;
import java.util.concurrent.TimeUnit;

public final class a0 {
    public final w0 a;
    public final gl b;
    public final q4 c;
    public final long d;

    public a0(w0 w04, gl gl2, q4 q44) {
        this.a = w04;
        this.b = gl2;
        this.c = q44;
        this.d = TimeUnit.SECONDS.toMillis(10L);
    }

    public static final void a(a0 object, Context context, AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        ((a0)object).a.getClass();
        object = v0.a(context);
        ((v0)object).f().a(appMetricaLibraryAdapterConfig);
        object = ((v0)object).a;
        A4.l().c.a().execute(new u1((Context)object));
    }

    public final void a(Context object, AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        Object object2 = LoggerStorage.getMainPublicOrAnonymousLogger();
        this.a.getClass();
        synchronized (v0.class) {
            block4: {
                boolean bl2 = v0.f;
                if (bl2) break block4;
                ((BaseReleaseLogger)object2).info("Session autotracking enabled", new Object[0]);
                this.b.a();
            }
            this.a.getClass();
            object2 = v0.a(object);
            ((v0)object2).d.a(null, (tb)object2);
            object2 = this.c.a();
            object = new wp(this, (Context)object, appMetricaLibraryAdapterConfig);
            ((Z9)object2).b.post((Runnable)object);
            this.a.getClass();
            w0.a();
            return;
            finally {
            }
        }
    }
}


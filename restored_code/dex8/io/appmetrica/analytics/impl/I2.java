/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.VisibleForTesting
 *  androidx.annotation.WorkerThread
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdProvider;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;
import io.appmetrica.analytics.impl.h2;
import io.appmetrica.analytics.impl.j2;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

public final class i2
implements AppSetIdProvider {
    public final Context a;
    public final IAppSetIdRetriever b;
    public volatile AppSetId c;
    public CountDownLatch d;
    public final long e;
    public final h2 f;

    public i2(@NotNull Context context) {
        this(context, j2.a());
    }

    @VisibleForTesting
    public i2(@NotNull Context context, @NotNull IAppSetIdRetriever iAppSetIdRetriever) {
        this.a = context;
        this.b = iAppSetIdRetriever;
        this.d = new CountDownLatch(1);
        this.e = 20L;
        this.f = new h2(this);
    }

    public static final /* synthetic */ CountDownLatch a(i2 i23) {
        return i23.d;
    }

    public static final /* synthetic */ void a(i2 i23, AppSetId appSetId) {
        i23.c = appSetId;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @WorkerThread
    @NotNull
    public final AppSetId getAppSetId() {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                Object object;
                block7: {
                    block6: {
                        try {
                            object = this.c;
                            if (object != null) break block6;
                        }
                        catch (Throwable throwable2) {}
                        try {
                            this.d = object = new CountDownLatch(1);
                            this.b.retrieveAppSetId(this.a, this.f);
                            this.d.await(this.e, TimeUnit.SECONDS);
                        }
                        catch (Throwable throwable3) {}
                    }
                    AppSetId appSetId = this.c;
                    object = appSetId;
                    if (appSetId != null) break block7;
                    this.c = object = new AppSetId(null, AppSetIdScope.UNKNOWN);
                    break block8;
                }
                return object;
            }
            throw throwable2;
        }
    }
}


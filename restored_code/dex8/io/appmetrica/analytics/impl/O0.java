/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.impl.P1;
import io.appmetrica.analytics.impl.m0;
import io.appmetrica.analytics.impl.n0;
import io.appmetrica.analytics.internal.IAppMetricaService;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class o0 {
    public static final long j = TimeUnit.SECONDS.toMillis(10L);
    public final Context a;
    public final ICommonExecutor b;
    public boolean c;
    public IAppMetricaService d = null;
    public CountDownLatch e;
    public final Object f = new Object();
    public final P1 g;
    public final m0 h = new m0(this);
    public final n0 i = new n0(this);

    public o0(Context context, ICommonExecutor iCommonExecutor, P1 p14) {
        this.a = context.getApplicationContext();
        this.b = iCommonExecutor;
        this.c = false;
        this.g = p14;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(Long var1_1) {
        ** synchronized (this)
        {
            catch (InterruptedException var1_3) {
                return;
            }
        }
lbl-1000:
        // 1 sources

        {
            ** try [egrp 1[TRYBLOCK] [1 : 2->20)] { 
lbl-1000:
            // 1 sources

            {
                catch (Throwable var1_2) {}
            }
lbl7:
            // 1 sources

            ** GOTO lbl9
            {
                throw var1_2;
lbl9:
                // 1 sources

                var2_4 = this.e;
                if (var2_4 == null) {
                    return;
                }
                // MONITOREXIT @DISABLED, blocks:[2, 4] lbl14 : MonitorExitStatement: MONITOREXIT : this
                var2_4.await(var1_1, TimeUnit.MILLISECONDS);
                return;
            }
        }
    }

    public final boolean a() {
        synchronized (this) {
            IAppMetricaService iAppMetricaService = this.d;
            boolean bl2 = iAppMetricaService != null;
            return bl2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        Object object = this.f;
        synchronized (object) {
            this.b.remove(this.h);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c() {
        ICommonExecutor iCommonExecutor = this.b;
        Object object = this.f;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        iCommonExecutor.remove(this.h);
                        if (this.c) break block3;
                        iCommonExecutor.executeDelayed(this.h, j);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}


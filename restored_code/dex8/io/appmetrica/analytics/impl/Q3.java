/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.billinginterface.internal.BillingType;
import io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import io.appmetrica.analytics.billingv8.internal.BillingLibraryMonitor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.n3;
import io.appmetrica.analytics.impl.o3;
import io.appmetrica.analytics.impl.om;
import io.appmetrica.analytics.impl.p3;
import io.appmetrica.analytics.impl.t8;
import io.appmetrica.analytics.impl.tm;
import java.util.concurrent.Executor;

public final class q3
implements tm {
    public BillingMonitor a;
    public final Context b;
    public final Executor c;
    public final Executor d;
    public final BillingType e;
    public final BillingInfoStorage f;
    public final BillingInfoSender g;
    public final ApplicationStateProvider h;
    public final o3 i;

    public q3(@NonNull Context context, @NonNull Executor executor, @NonNull Executor executor2, @NonNull BillingType billingType, @NonNull BillingInfoStorage billingInfoStorage, @NonNull BillingInfoSender billingInfoSender) {
        this(context, executor, executor2, billingType, billingInfoStorage, billingInfoSender, Na.j().d(), new o3());
    }

    public q3(@NonNull Context context, @NonNull Executor executor, @NonNull Executor executor2, @NonNull BillingType billingType, @NonNull BillingInfoStorage billingInfoStorage, @NonNull BillingInfoSender billingInfoSender, @NonNull ApplicationStateProvider applicationStateProvider, @NonNull o3 o34) {
        this.b = context;
        this.c = executor;
        this.d = executor2;
        this.e = billingType;
        this.f = billingInfoStorage;
        this.g = billingInfoSender;
        this.h = applicationStateProvider;
        this.i = o34;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final void a(@NonNull om om3) {
        // MONITORENTER : this
        BillingMonitor billingMonitor = this.a;
        // MONITOREXIT : this
        if (billingMonitor == null) {
            // MONITOREXIT : this
            return;
        }
        billingMonitor.onBillingConfigChanged(om3.x);
        return;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a(@NonNull om object, @Nullable Boolean object2) {
        block7: {
            BillingInfoSender billingInfoSender;
            BillingInfoStorage billingInfoStorage;
            Executor executor;
            Context context;
            block5: {
                block6: {
                    if (WrapUtils.getOrDefault(object2, Boolean.TRUE) == false) return;
                    // MONITORENTER : this
                    o3 o34 = this.i;
                    context = this.b;
                    object2 = this.c;
                    executor = this.d;
                    BillingType billingType = this.e;
                    billingInfoStorage = this.f;
                    billingInfoSender = this.g;
                    o34.getClass();
                    int n10 = n3.a[billingType.ordinal()];
                    if (n10 == 1) break block5;
                    if (n10 == 2) break block6;
                    object2 = new t8();
                    break block7;
                }
                object2 = new BillingLibraryMonitor(context, (Executor)object2, executor, billingInfoStorage, billingInfoSender, null, null, 96, null);
                break block7;
            }
            object2 = new io.appmetrica.analytics.billingv6.internal.BillingLibraryMonitor(context, (Executor)object2, executor, billingInfoStorage, billingInfoSender, null, null, 96, null);
        }
        this.a = object2;
        // MONITOREXIT : this
        object2.onBillingConfigChanged(((om)object).x);
        object = new p3(this);
        if (this.h.registerStickyObserver((ApplicationStateObserver)object) != ApplicationState.VISIBLE) return;
        try {
            object = this.a;
            if (object == null) return;
            object.onSessionResumed();
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }
}


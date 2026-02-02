/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Configuration
 *  android.os.IBinder
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.internal;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.A1;
import io.appmetrica.analytics.impl.B5;
import io.appmetrica.analytics.impl.C1;
import io.appmetrica.analytics.impl.D1;
import io.appmetrica.analytics.impl.E1;
import io.appmetrica.analytics.impl.F1;
import io.appmetrica.analytics.impl.G1;
import io.appmetrica.analytics.impl.Ij;
import io.appmetrica.analytics.impl.Jj;
import io.appmetrica.analytics.impl.K1;
import io.appmetrica.analytics.impl.L1;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.O1;
import io.appmetrica.analytics.impl.w1;
import io.appmetrica.analytics.impl.x1;
import io.appmetrica.analytics.impl.y1;
import io.appmetrica.analytics.impl.z1;
import io.appmetrica.analytics.internal.a;
import io.appmetrica.analytics.logger.common.BaseReleaseLogger;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class AppMetricaService
extends Service {
    private static K1 c;
    private final w1 a = new w1(this);
    private final a b = new a();

    static /* synthetic */ z1 a() {
        return c;
    }

    public IBinder onBind(Intent intent) {
        Object object = intent.getAction();
        object = object != null && ((String)object).startsWith("io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK") ? new x1() : this.b;
        K1 k12 = c;
        k12.a.execute(new E1(k12, intent));
        return object;
    }

    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        K1 k12 = c;
        k12.a.execute(new A1(k12, configuration));
    }

    public void onCreate() {
        Object object;
        Object object2;
        super.onCreate();
        Na.a(this.getApplicationContext());
        BaseReleaseLogger.init(this.getApplicationContext());
        Object object3 = c;
        if (object3 == null) {
            object2 = this.getApplicationContext();
            L1 l13 = new L1((Context)object2, this.a, new B5((Context)object2));
            object2 = Na.F.v;
            object = new O1(l13);
            LinkedHashMap linkedHashMap = object2.a;
            Integer n10 = 1;
            object3 = linkedHashMap.get(n10);
            object2 = object3;
            if (object3 == null) {
                object2 = new ArrayList();
                linkedHashMap.put(n10, object2);
            }
            ((List)object2).add(object);
            c = new K1(Na.F.d.b(), l13);
        } else {
            object2 = this.a;
            ((K1)object3).b.a((y1)object2);
        }
        object2 = Na.F;
        object3 = new Jj(c);
        synchronized (object2) {
            object2.f = object = new Ij(object2.a, (Jj)object3);
            // MONITOREXIT @DISABLED, blocks:[0, 1] lbl29 : MonitorExitStatement: MONITOREXIT : var1_3 /* !! */ 
            c.onCreate();
            return;
        }
    }

    public void onDestroy() {
        c.onDestroy();
        super.onDestroy();
    }

    public void onRebind(Intent intent) {
        super.onRebind(intent);
        K1 k12 = c;
        k12.a.execute(new F1(k12, intent));
    }

    public void onStart(Intent intent, int n10) {
        K1 k12 = c;
        k12.a.execute(new C1(k12, intent, n10));
    }

    public int onStartCommand(Intent intent, int n10, int n13) {
        K1 k12 = c;
        k12.a.execute(new D1(k12, intent, n10, n13));
        return 2;
    }

    public boolean onUnbind(Intent intent) {
        Object object = c;
        ((K1)object).a.execute(new G1((K1)object, intent));
        object = intent.getAction();
        if (object != null && ((String)object).startsWith("io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK")) {
            return false;
        }
        return intent.getData() != null;
    }
}


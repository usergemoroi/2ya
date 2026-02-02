/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 */
package io.appmetrica.analytics;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.IModuleReporter;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.impl.Bd;
import io.appmetrica.analytics.impl.Dd;
import io.appmetrica.analytics.impl.Ed;
import io.appmetrica.analytics.impl.Fd;
import io.appmetrica.analytics.impl.Gd;
import io.appmetrica.analytics.impl.Hd;
import io.appmetrica.analytics.impl.Id;
import io.appmetrica.analytics.impl.Jd;
import io.appmetrica.analytics.impl.Ji;
import io.appmetrica.analytics.impl.Pd;
import io.appmetrica.analytics.impl.v0;

public final class ModulesFacade {
    public static final int EXTERNAL_ATTRIBUTION_ADJUST = 2;
    public static final int EXTERNAL_ATTRIBUTION_AIRBRIDGE = 5;
    public static final int EXTERNAL_ATTRIBUTION_APPSFLYER = 1;
    public static final int EXTERNAL_ATTRIBUTION_KOCHAVA = 3;
    public static final int EXTERNAL_ATTRIBUTION_SINGULAR = 6;
    public static final int EXTERNAL_ATTRIBUTION_TENJIN = 4;
    private static Jd a = new Jd();

    @NonNull
    public static IModuleReporter getModuleReporter(@NonNull Context context, @NonNull String string2) {
        Jd jd3 = a;
        Object object = jd3.b;
        ((Bd)object).b.a(context);
        ((Bd)object).d.a(string2);
        object = jd3.c;
        jd3 = context.getApplicationContext();
        ((Pd)object).a.a(jd3.getApplicationContext());
        return Ji.a.a(context.getApplicationContext(), string2);
    }

    public static boolean isActivatedForApp() {
        Jd jd3 = a;
        jd3.b.getClass();
        jd3.c.getClass();
        jd3.a.getClass();
        synchronized (v0.class) {
            boolean bl2 = v0.f;
            return bl2;
        }
    }

    public static void reportAdRevenue(@NonNull AdRevenue adRevenue) {
        ModulesFacade.reportAdRevenue(adRevenue, Boolean.TRUE);
    }

    public static void reportAdRevenue(@NonNull AdRevenue adRevenue, @NonNull Boolean bl2) {
        Jd jd3 = a;
        boolean bl3 = bl2;
        jd3.b.getClass();
        jd3.c.getClass();
        jd3.d.execute(new Dd(jd3, adRevenue, bl3));
    }

    public static void reportEvent(@NonNull ModuleEvent moduleEvent) {
        Jd jd3 = a;
        jd3.b.a.a(null);
        jd3.c.getClass();
        jd3.d.execute(new Ed(jd3, moduleEvent));
    }

    public static void reportExternalAttribution(int n10, @NonNull String string2) {
        Jd jd3 = a;
        jd3.b.getClass();
        jd3.c.getClass();
        jd3.d.execute(new Fd(jd3, n10, string2));
    }

    public static void sendEventsBuffer() {
        Jd jd3 = a;
        jd3.b.getClass();
        jd3.c.getClass();
        AppMetrica.sendEventsBuffer();
    }

    public static void setAdvIdentifiersTracking(boolean bl2) {
        Jd jd3 = a;
        jd3.b.getClass();
        jd3.c.getClass();
        jd3.d.execute(new Gd(jd3, bl2));
    }

    @VisibleForTesting
    public static void setProxy(@NonNull Jd jd3) {
        a = jd3;
    }

    public static void setSessionExtra(@NonNull String string2, @Nullable byte[] byArray) {
        Jd jd3 = a;
        jd3.b.c.a(string2);
        jd3.c.getClass();
        jd3.d.execute(new Hd(jd3, string2, byArray));
    }

    public static void subscribeForAutoCollectedData(@NonNull Context context, @NonNull String string2) {
        Jd jd3 = a;
        Bd bd3 = jd3.b;
        bd3.b.a(context);
        bd3.d.a(string2);
        jd3.c.a.a(context.getApplicationContext());
        jd3.d.execute(new Id(string2));
    }
}


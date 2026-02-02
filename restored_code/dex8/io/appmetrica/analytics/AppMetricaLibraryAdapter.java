/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 */
package io.appmetrica.analytics;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.ModulesFacade;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.impl.A4;
import io.appmetrica.analytics.impl.C0;
import io.appmetrica.analytics.impl.Z;
import io.appmetrica.analytics.impl.a0;
import io.appmetrica.analytics.impl.bc;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.common.BaseImportantLogger;

public class AppMetricaLibraryAdapter {
    private static C0 a = new C0();

    public static void activate(@NonNull Context context) {
        Object object = a;
        if (((C0)object).a.a.a((Object)context).a) {
            object = ((C0)object).b;
            context = context.getApplicationContext();
            object.getClass();
            A4.l().g.a(context);
            A4.l().b().a(context, AppMetricaLibraryAdapterConfig.newConfigBuilder().build());
        } else {
            ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Activation failed due to context is null", new Object[0]);
        }
    }

    public static void activate(@NonNull Context context, @NonNull AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        C0 c04 = a;
        Object object = c04.a;
        if (((bc)object).a.a((Object)context).a && ((bc)object).b.a((Object)appMetricaLibraryAdapterConfig).a) {
            object = c04.b;
            context = context.getApplicationContext();
            object.getClass();
            A4.l().g.a(context);
            A4.l().b().a(context, appMetricaLibraryAdapterConfig);
        } else {
            ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Activation failed due to context is null or invalid config", new Object[0]);
        }
    }

    public static void reportEvent(@NonNull String string2, @NonNull String string3, @NonNull String string4) {
        a.a(string2, string3, string4);
    }

    public static void setAdvIdentifiersTracking(boolean bl2) {
        C0 c04 = a;
        if (c04.a.c.a(null).a) {
            c04.b.getClass();
            ModulesFacade.setAdvIdentifiersTracking(bl2);
        }
    }

    @VisibleForTesting
    public static void setProxy(@NonNull C0 c04) {
        a = c04;
    }

    public static void subscribeForAutoCollectedData(@NonNull Context context, @NonNull String string2) {
        Object object = a;
        object.getClass();
        Object object2 = ImportantLogger.INSTANCE;
        StringBuilder stringBuilder = new StringBuilder("Subscribe for auto-collected data with api key: ");
        stringBuilder.append(ApiKeyUtils.createPartialApiKey(string2));
        ((BaseImportantLogger)object2).info("[AppMetricaLibraryAdapterProxy]", stringBuilder.toString(), new Object[0]);
        object2 = ((C0)object).a;
        if (((bc)object2).g.a((String)string2).a && ((bc)object2).a.a((Object)context).a) {
            ((C0)object).b.getClass();
            A4.l().g.a(context);
            object = A4.l().b();
            ((a0)object).c.a().executeDelayed(new Z((a0)object, context), ((a0)object).d);
            ModulesFacade.subscribeForAutoCollectedData(context, string2);
        }
    }
}


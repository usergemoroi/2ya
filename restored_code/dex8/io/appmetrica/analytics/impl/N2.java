/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.impl.Fc;
import io.appmetrica.analytics.impl.Xh;
import io.appmetrica.analytics.impl.fb;
import io.appmetrica.analytics.impl.kq;
import io.appmetrica.analytics.impl.ma;
import io.appmetrica.analytics.impl.tb;
import org.jetbrains.annotations.NotNull;

public final class n2 {
    public static final boolean a(Throwable throwable) {
        return true;
    }

    @NotNull
    public final fb a(@NotNull Context context, @NotNull AppMetricaConfig appMetricaConfig, @NotNull tb tb3) {
        return new Xh(new Fc(tb3, appMetricaConfig), new kq(), appMetricaConfig.crashTransformer, new ma(context));
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.impl.A5;
import io.appmetrica.analytics.impl.Dh;
import io.appmetrica.analytics.impl.M4;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.j0;
import io.appmetrica.analytics.impl.n5;
import io.appmetrica.analytics.impl.o5;
import io.appmetrica.analytics.impl.om;
import io.appmetrica.analytics.impl.t5;
import io.appmetrica.analytics.impl.v5;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

public final class ok
extends v5 {
    public ok(Context context, o5 o54, j0 j04, TimePassedChecker timePassedChecker, A5 a52, M4 m44) {
        super(context, o54, j04, timePassedChecker, a52, m44);
    }

    public ok(@NonNull Context context, @NonNull om om3, @NonNull o5 o54, @NonNull M4 m44, @NonNull Dh dh3, @NonNull t5 t54, @NonNull n5 n54) {
        this(context, o54, new j0(), new TimePassedChecker(), new A5(context, o54, m44, t54, om3, dh3, Na.j().w().d(), PackageManagerUtils.getAppVersionCodeInt(context), Na.j().k(), n54), m44);
    }

    @Override
    @NonNull
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.SELF_SDK;
    }
}


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
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.Q3;
import io.appmetrica.analytics.impl.Y3;
import io.appmetrica.analytics.impl.im;
import io.appmetrica.analytics.impl.k6;
import io.appmetrica.analytics.impl.km;
import io.appmetrica.analytics.impl.l6;
import io.appmetrica.analytics.impl.om;
import io.appmetrica.analytics.impl.q8;
import io.appmetrica.analytics.impl.r8;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

public final class jm
extends l6 {
    public final Y3 b;

    public jm(@NonNull Context context, @NonNull String string2) {
        this(context, string2, new SafePackageManager(), Na.j().e());
    }

    public jm(@NonNull Context context, @NonNull String string2, @NonNull SafePackageManager safePackageManager, @NonNull Y3 y34) {
        super(context, string2, safePackageManager);
        this.b = y34;
    }

    @NonNull
    public final km a() {
        return new km();
    }

    @NonNull
    public final km b(@NonNull k6 object) {
        km km3 = (km)super.a((k6)object);
        Object object2 = ((k6)object).a;
        km3.d = ((om)object2).f;
        km3.e = ((om)object2).g;
        object2 = (im)((BaseRequestConfig.DataSource)object).componentArguments;
        String string2 = ((im)object2).a;
        if (string2 != null) {
            km3.f = string2;
            km3.g = ((im)object2).b;
        }
        object2 = ((im)object2).c;
        km3.h = object2;
        object2 = new Q3((Map<String, String>)object2, q8.c);
        km3.i = (Q3)this.b.a((r8)object2);
        object2 = (im)((BaseRequestConfig.DataSource)object).componentArguments;
        km3.k = ((im)object2).d;
        km3.j = ((im)object2).e;
        object = ((k6)object).a;
        km3.l = ((om)object).p;
        km3.m = ((om)object).r;
        long l10 = ((om)object).v;
        if (km3.n == 0L) {
            km3.n = l10;
        }
        return km3;
    }

    @NonNull
    public final BaseRequestConfig createBlankConfig() {
        return new km();
    }
}


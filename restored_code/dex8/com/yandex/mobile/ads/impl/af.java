/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.zd
 *  kotlin.jvm.functions.a
 *  kotlin.jvm.internal.a0
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.bf;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.zd;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.IReporter;
import io.appmetrica.analytics.ReporterConfig;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.a0;

final class af
extends a0
implements a<IReporter> {
    final zd b;
    final Context c;
    final bf d;
    final String e;

    af(zd zd2, Context context, bf bf3, String string2) {
        this.b = zd2;
        this.c = context;
        this.d = bf3;
        this.e = string2;
        super(0);
    }

    public final Object invoke() {
        this.b.a(this.c);
        bf bf3 = this.d;
        Context context = this.c;
        String string2 = this.e;
        bf3.getClass();
        try {
            AppMetrica.activateReporter(context, ReporterConfig.newConfigBuilder(string2).build());
        }
        catch (Throwable throwable) {
            int n10 = op0.b;
        }
        return AppMetrica.getReporter(this.c, this.e);
    }
}


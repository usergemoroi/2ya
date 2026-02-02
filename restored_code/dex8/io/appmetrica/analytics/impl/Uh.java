/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.collections.s0
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.impl.Kj;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.kk;
import io.appmetrica.analytics.impl.lk;
import io.appmetrica.analytics.impl.tf;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinVersion;
import kotlin.collections.s0;
import kotlin.t;
import kotlin.z;

public final class uh
implements Runnable {
    @Override
    public final void run() {
        Object object = new TimePassedChecker();
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        tf tf2 = Na.F.x();
        if (((TimePassedChecker)object).didTimePassMillis(tf2.f(), TimeUnit.DAYS.toMillis(1L), "[ReportKotlinVersionTask]")) {
            KotlinVersion kotlinVersion = KotlinVersion.CURRENT;
            t<String, Integer> t13 = z.a("major", kotlinVersion.getMajor());
            object = z.a("minor", kotlinVersion.getMinor());
            Object object2 = z.a("patch", kotlinVersion.getPatch());
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(kotlinVersion.getMajor());
            stringBuilder.append('.');
            stringBuilder.append(kotlinVersion.getMinor());
            stringBuilder.append('.');
            stringBuilder.append(kotlinVersion.getPatch());
            object = s0.m((t[])new t[]{t13, object, object2, z.a("version", stringBuilder.toString())});
            object2 = Kj.a;
            object2.getClass();
            ((lk)object2).a(new kk("kotlin_version", (Map)object));
            tf2.c(systemTimeProvider.currentTimeMillis()).b();
        }
    }
}


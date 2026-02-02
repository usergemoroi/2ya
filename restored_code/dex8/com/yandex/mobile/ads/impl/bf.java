/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.ef
 *  com.yandex.mobile.ads.impl.ke
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.ye
 *  com.yandex.mobile.ads.impl.zd
 *  com.yandex.mobile.ads.impl.ze
 *  kotlin.jvm.functions.a
 *  kotlin.n
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.af;
import com.yandex.mobile.ads.impl.cf;
import com.yandex.mobile.ads.impl.df;
import com.yandex.mobile.ads.impl.ef;
import com.yandex.mobile.ads.impl.ke;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.ye;
import com.yandex.mobile.ads.impl.zd;
import com.yandex.mobile.ads.impl.ze;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.IReporter;
import kotlin.jvm.functions.a;
import kotlin.m;
import kotlin.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class bf
implements ke {
    @Nullable
    public final cf a(@NotNull Context object, @NotNull String object2, @NotNull zd zd2) {
        try {
            af af2 = new af(zd2, (Context)object, this, (String)object2);
            object2 = n.b((a)af2);
            object = new cf((m<? extends IReporter>)object2);
        }
        catch (Throwable throwable) {
            int n10 = op0.b;
            object = null;
        }
        return object;
    }

    @Nullable
    public final String a() {
        String string2;
        try {
            string2 = AppMetrica.getLibraryVersion();
        }
        catch (Throwable throwable) {
            int n10 = op0.b;
            string2 = null;
        }
        return string2;
    }

    @Nullable
    public final String a(@NotNull Context object) {
        try {
            object = AppMetrica.getUuid(object);
        }
        catch (Throwable throwable) {
            int n10 = op0.b;
            object = null;
        }
        return object;
    }

    public final void a(@NotNull Context context, @NotNull ze ze2) {
        try {
            df df2 = new df(ze2);
            AppMetrica.requestStartupParams(context, df2, ef.a());
        }
        catch (Throwable throwable) {
            int n10 = op0.b;
            ze2.a(ye.b);
        }
    }

    @Nullable
    public final String b(@NotNull Context object) {
        try {
            object = AppMetrica.getDeviceId(object);
        }
        catch (Throwable throwable) {
            int n10 = op0.b;
            object = null;
        }
        return object;
    }
}


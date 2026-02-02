/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  com.monetization.ads.core.identifiers.ad.huawei.a
 *  com.yandex.mobile.ads.impl.ec
 *  com.yandex.mobile.ads.impl.kc
 *  com.yandex.mobile.ads.impl.mt1
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.qf0
 *  com.yandex.mobile.ads.impl.rf0
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.monetization.ads.core.identifiers.ad.huawei.a;
import com.yandex.mobile.ads.impl.ec;
import com.yandex.mobile.ads.impl.kc;
import com.yandex.mobile.ads.impl.mt1;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.qf0;
import com.yandex.mobile.ads.impl.rf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class of0
implements kc {
    @NotNull
    private final mt1 a;
    @NotNull
    private final Context b;
    @NotNull
    private final qf0 c;
    @NotNull
    private final rf0 d;

    public /* synthetic */ of0(Context context) {
        this(context, new mt1());
    }

    public of0(@NotNull Context context, @NotNull mt1 mt12) {
        this.a = mt12;
        this.b = context.getApplicationContext();
        this.c = new qf0();
        this.d = new rf0();
    }

    @Nullable
    public final ec a() {
        int n10;
        this.d.getClass();
        Intent intent = rf0.a();
        mt1 mt12 = this.a;
        Context context = this.b;
        mt12.getClass();
        Object var4_6 = null;
        try {
            mt12 = context.getPackageManager().resolveService(intent, 0);
        }
        catch (Throwable throwable) {
            n10 = op0.b;
            mt12 = null;
        }
        context = var4_6;
        if (mt12 != null) {
            try {
                mt12 = new a();
                if (this.b.bindService(intent, (ServiceConnection)mt12, 1)) {
                    context = this.c.a((a)mt12);
                    this.b.unbindService((ServiceConnection)mt12);
                } else {
                    n10 = op0.b;
                    context = var4_6;
                }
            }
            catch (Throwable throwable) {
                n10 = op0.b;
                context = var4_6;
            }
        }
        return context;
    }
}


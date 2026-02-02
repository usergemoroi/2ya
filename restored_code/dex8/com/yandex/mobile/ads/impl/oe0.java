/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.ec
 *  com.yandex.mobile.ads.impl.kc
 *  com.yandex.mobile.ads.impl.re0
 *  com.yandex.mobile.ads.impl.te0
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ec;
import com.yandex.mobile.ads.impl.kc;
import com.yandex.mobile.ads.impl.re0;
import com.yandex.mobile.ads.impl.te0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class oe0
implements kc {
    @NotNull
    private final re0 a;
    @NotNull
    private final te0 b;

    public /* synthetic */ oe0(Context context) {
        this(new re0(context), new te0(context));
    }

    public oe0(@NotNull re0 re02, @NotNull te0 te02) {
        this.a = re02;
        this.b = te02;
    }

    @Nullable
    public final ec a() {
        ec ec2;
        ec ec3 = ec2 = this.a.a();
        if (ec2 == null) {
            ec3 = this.b.a();
        }
        return ec3;
    }
}


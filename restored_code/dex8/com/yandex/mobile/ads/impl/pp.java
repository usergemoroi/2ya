/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  com.yandex.mobile.ads.impl.f10
 *  com.yandex.mobile.ads.impl.nr
 *  com.yandex.mobile.ads.impl.sp
 */
package com.yandex.mobile.ads.impl;

import android.app.Dialog;
import com.yandex.mobile.ads.impl.f10;
import com.yandex.mobile.ads.impl.nr;
import com.yandex.mobile.ads.impl.sp;
import org.jetbrains.annotations.NotNull;

public final class pp
implements sp {
    @NotNull
    private final Dialog a;
    @NotNull
    private final nr b;

    public pp(@NotNull Dialog dialog, @NotNull nr nr2) {
        this.a = dialog;
        this.b = nr2;
    }

    public final void a() {
        f10.a((Dialog)this.a);
        this.b.e();
    }

    public final void b() {
        f10.a((Dialog)this.a);
    }
}


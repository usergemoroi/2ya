/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.gk2
 *  com.yandex.mobile.ads.impl.x2
 */
package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.gk2;
import com.yandex.mobile.ads.impl.hg0;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.zf1;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

@SuppressLint(value={"ViewConstructor"})
public final class id0
extends hg0 {
    @NotNull
    private final gk2 o = new gk2((zf1)this);

    public id0(@NotNull Context context, @NotNull b8<?> b82, @NotNull x2 x22) {
        super(context, b82, x22);
    }

    @Override
    protected final void a(@NotNull Context context) {
        super.a(context);
        context = this.getSettings();
        context.setDatabasePath(this.getContext().getDatabasePath("com.monetization.ads.db").getAbsolutePath());
        context.setDomStorageEnabled(true);
        context.setDatabaseEnabled(true);
        context.setCacheMode(-1);
    }

    @Override
    @SuppressLint(value={"AddJavascriptInterface"})
    protected final void b(@NotNull Context context) {
        this.addJavascriptInterface(this.c(context), "AdPerformActionsJSI");
    }

    @Override
    public final void h() {
        this.o.a((Map)this.l());
    }
}


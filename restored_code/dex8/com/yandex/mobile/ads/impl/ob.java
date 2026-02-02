/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.gf1
 *  com.yandex.mobile.ads.impl.qb
 *  com.yandex.mobile.ads.impl.wt0
 */
package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import com.yandex.mobile.ads.impl.gf1;
import com.yandex.mobile.ads.impl.pb;
import com.yandex.mobile.ads.impl.qb;
import com.yandex.mobile.ads.impl.wt0;
import com.yandex.mobile.ads.impl.zf1;
import org.jetbrains.annotations.NotNull;

@SuppressLint(value={"ViewConstructor"})
public final class ob
extends zf1 {
    @NotNull
    private final pb k;

    public ob(@NotNull Context context) {
        this(context, new wt0());
    }

    public /* synthetic */ ob(Context context, wt0 wt02) {
        this(context, wt02, new pb(new gf1(context)));
    }

    public ob(@NotNull Context context, @NotNull wt0 wt02, @NotNull pb pb2) {
        super(context);
        this.k = pb2;
        if (wt02.a()) {
            this.setLayerType(2, null);
        }
        this.setVisibility(0);
        this.setHtmlWebViewErrorListener(pb2);
    }

    @Override
    public final void a(@NotNull Context context, @NotNull String string2) {
        this.k.a(string2);
    }

    @Override
    protected final void h() {
    }

    public final void setAdtuneWebViewListener(@NotNull qb qb3) {
        this.k.a(qb3);
    }
}


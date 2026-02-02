/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.nb
 *  com.yandex.mobile.ads.impl.wt0
 *  com.yandex.mobile.ads.impl.xb
 */
package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import com.yandex.mobile.ads.impl.nb;
import com.yandex.mobile.ads.impl.vb;
import com.yandex.mobile.ads.impl.wt0;
import com.yandex.mobile.ads.impl.xb;
import com.yandex.mobile.ads.impl.zf1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressLint(value={"ViewConstructor"})
public final class ub
extends zf1 {
    @NotNull
    private final vb k;

    public ub(@NotNull Context context) {
        this(context, new wt0());
    }

    public /* synthetic */ ub(Context context, wt0 wt02) {
        this(context, wt02, new vb(new nb(context)));
    }

    public ub(@NotNull Context context, @NotNull wt0 wt02, @NotNull vb vb2) {
        super(context);
        this.k = vb2;
        if (wt02.a()) {
            this.setLayerType(2, null);
        }
        this.setVisibility(0);
        this.setHtmlWebViewErrorListener(vb2);
    }

    @Override
    public final void a(@NotNull Context context, @NotNull String string2) {
        this.k.a(string2);
    }

    @Override
    protected final void h() {
    }

    public final void setAdtuneWebViewListener(@NotNull xb xb3) {
        this.k.a(xb3);
    }

    public final void setOptOutUrl(@Nullable String string2) {
        this.k.b(string2);
    }
}


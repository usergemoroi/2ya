/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ImageView
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 *  com.yandex.mobile.ads.impl.gh2
 *  com.yandex.mobile.ads.impl.hh2
 *  com.yandex.mobile.ads.impl.jj0
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.impl.gh2;
import com.yandex.mobile.ads.impl.hh2;
import com.yandex.mobile.ads.impl.jj0;
import com.yandex.mobile.ads.impl.rj0;
import org.jetbrains.annotations.NotNull;

public final class m31
extends RecyclerView.ViewHolder {
    @NotNull
    private final hh2<ImageView, jj0> a;

    public m31(@NotNull ImageView imageView, @NotNull rj0 rj02) {
        super((View)imageView);
        this.a = new hh2((gh2)rj02);
    }

    public final void a(@NotNull jj0 jj02) {
        this.a.b((Object)jj02);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.ej0
 *  com.yandex.mobile.ads.impl.jj0
 *  com.yandex.mobile.ads.impl.n31
 */
package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.ej0;
import com.yandex.mobile.ads.impl.jj0;
import com.yandex.mobile.ads.impl.m31;
import com.yandex.mobile.ads.impl.n31;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public final class q31
extends RecyclerView.Adapter<m31> {
    @NotNull
    private final List<jj0> a;
    @NotNull
    private final n31 b;

    public q31(@NotNull ej0 ej02, @NotNull List<jj0> list, @NotNull b8<?> b82) {
        this.a = list;
        this.b = new n31(ej02, b82);
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int n10) {
        ((m31)viewHolder).a(this.a.get(n10));
    }

    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int n10) {
        return this.b.a(viewGroup);
    }
}


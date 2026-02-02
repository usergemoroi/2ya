/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 *  com.yandex.mobile.ads.impl.zx
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.impl.zx;
import org.jetbrains.annotations.NotNull;

public abstract class cy<T extends zx>
extends RecyclerView.ViewHolder {
    public cy(@NotNull View view) {
        super(view);
    }

    public abstract void a(@NotNull T var1);
}


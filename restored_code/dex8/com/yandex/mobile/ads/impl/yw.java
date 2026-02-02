/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.recyclerview.widget.DiffUtil$ItemCallback
 *  com.yandex.mobile.ads.impl.zx
 */
package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.DiffUtil;
import com.yandex.mobile.ads.impl.zx;

public final class yw
extends DiffUtil.ItemCallback<zx> {
    public final boolean areContentsTheSame(Object object, Object object2) {
        return ((zx)object).a((Object)((zx)object2));
    }

    public final boolean areItemsTheSame(Object object, Object object2) {
        return ((zx)object).a((Object)((zx)object2));
    }
}


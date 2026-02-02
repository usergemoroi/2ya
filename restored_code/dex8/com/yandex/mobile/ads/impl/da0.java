/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.recyclerview.widget.DiffUtil$ItemCallback
 *  com.yandex.mobile.ads.impl.ca0
 */
package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.DiffUtil;
import com.yandex.mobile.ads.impl.ba0;
import com.yandex.mobile.ads.impl.ca0;
import com.yandex.mobile.ads.impl.h90;
import kotlin.jvm.internal.y;

public final class da0
extends DiffUtil.ItemCallback<ca0> {
    public final boolean areContentsTheSame(Object object, Object object2) {
        return y.e((ca0)object, (ca0)object2);
    }

    public final boolean areItemsTheSame(Object object, Object object2) {
        ba0 ba02;
        object = (ca0)object;
        object2 = (ca0)object2;
        boolean bl2 = object instanceof h90 && object2 instanceof h90 ? y.e(((h90)((Object)object)).a(), ((h90)((Object)object2)).a()) : y.e(object, (Object)(ba02 = ba0.a)) && y.e(object2, (Object)ba02);
        return bl2;
    }
}


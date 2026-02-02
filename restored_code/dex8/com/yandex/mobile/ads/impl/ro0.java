/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  com.yandex.mobile.ads.impl.dh2
 *  com.yandex.mobile.ads.impl.ic2
 *  com.yandex.mobile.ads.impl.zm0
 *  kotlin.collections.t
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.dh2;
import com.yandex.mobile.ads.impl.ic2;
import com.yandex.mobile.ads.impl.zm0;
import java.util.List;
import kotlin.collections.t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ro0
implements dh2 {
    @NotNull
    private final zm0 a;

    public ro0(@NotNull zm0 zm02) {
        this.a = zm02;
    }

    @NotNull
    public final List<ic2> a() {
        Object object;
        block3: {
            block2: {
                object = this.a.a();
                if (object == null) break block2;
                List list = object.a();
                object = list;
                if (list != null) break block3;
            }
            object = t.m();
        }
        return object;
    }

    @Nullable
    public final View getView() {
        Object object = this.a.a();
        object = object != null ? object.b() : null;
        return object;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.z2
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.g8;
import com.yandex.mobile.ads.impl.jj;
import com.yandex.mobile.ads.impl.z2;
import org.jetbrains.annotations.NotNull;

public abstract class xf0
extends jj<String>
implements z2 {
    @NotNull
    private final g8 d;

    public xf0(@NotNull Context context, @NotNull b8<String> b82) {
        this(context, b82, new g8());
    }

    public xf0(@NotNull Context context, @NotNull b8<String> b82, @NotNull g8 g84) {
        super(context, b82);
        this.d = g84;
        g84.a(this);
    }

    @Override
    public void b() {
        synchronized (this) {
            this.d.a(null);
            return;
        }
    }

    @NotNull
    public final g8 i() {
        return this.d;
    }
}


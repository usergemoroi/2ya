/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.jg
 *  com.yandex.mobile.ads.impl.jj0
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.f32;
import com.yandex.mobile.ads.impl.jg;
import com.yandex.mobile.ads.impl.jj0;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

public final class ri0
implements jg<jj0> {
    @NotNull
    private final f32 a;

    public /* synthetic */ ri0() {
        this(new f32());
    }

    public ri0(@NotNull f32 f322) {
        this.a = f322;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean a(@NotNull jj0 object) {
        if ((object = object.f()) == null) return false;
        this.a.getClass();
        if (((String)object).length() <= 0) return false;
        if (y.e("null", object)) return false;
        return true;
    }
}


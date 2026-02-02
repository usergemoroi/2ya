/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.ld2
 *  com.yandex.mobile.ads.impl.qb2
 *  com.yandex.mobile.ads.impl.se1
 *  com.yandex.mobile.ads.impl.te1
 *  com.yandex.mobile.ads.impl.vg2
 *  com.yandex.mobile.ads.impl.zd2
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.go2;
import com.yandex.mobile.ads.impl.ld2;
import com.yandex.mobile.ads.impl.qb2;
import com.yandex.mobile.ads.impl.se1;
import com.yandex.mobile.ads.impl.te1;
import com.yandex.mobile.ads.impl.vg2;
import com.yandex.mobile.ads.impl.xn2;
import com.yandex.mobile.ads.impl.zd2;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ho2
implements qb2 {
    @NotNull
    private final se1 a;

    public ho2(@NotNull se1 se12) {
        this.a = se12;
    }

    @Nullable
    public final go2 a(@NotNull Context object, @NotNull ld2 ld22, @Nullable zd2 zd22, @NotNull List list) {
        object = this.a.a(object) ? new go2((Context)object, ld22, zd22, list, new vg2(object), new te1(), new xn2((Context)object).c()) : null;
        return object;
    }
}


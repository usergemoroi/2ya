/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.a71
 *  com.yandex.mobile.ads.impl.ar1
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.j81
 *  com.yandex.mobile.ads.impl.oj$a
 *  com.yandex.mobile.ads.impl.tp1
 *  com.yandex.mobile.ads.impl.x2
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.a71;
import com.yandex.mobile.ads.impl.ar1;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.j81;
import com.yandex.mobile.ads.impl.oj;
import com.yandex.mobile.ads.impl.tp1;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.x71;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class aa1
implements oj.a<a71> {
    @NotNull
    private final j81 a;

    public /* synthetic */ aa1() {
        this(new x71());
    }

    public aa1(@NotNull j81 j812) {
        this.a = j812;
    }

    @NotNull
    public final tp1 a(@Nullable ar1<b8<a71>> object, @NotNull x2 x22) {
        a71 a712 = null;
        object = object != null ? (b8)object.a : null;
        j81 j812 = this.a;
        if (object != null) {
            a712 = (a71)object.J();
        }
        return j812.a(object, x22, a712);
    }
}


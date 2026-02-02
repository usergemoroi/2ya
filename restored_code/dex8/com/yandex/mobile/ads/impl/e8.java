/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ar1
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.kq
 *  com.yandex.mobile.ads.impl.oj$a
 *  com.yandex.mobile.ads.impl.tp1
 *  com.yandex.mobile.ads.impl.x2
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ar1;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.kq;
import com.yandex.mobile.ads.impl.oj;
import com.yandex.mobile.ads.impl.tp1;
import com.yandex.mobile.ads.impl.x2;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class e8
implements oj.a<String> {
    @NotNull
    private final kq a;

    public /* synthetic */ e8() {
        this(new kq());
    }

    @JvmOverloads
    public e8(@NotNull kq kq3) {
        this.a = kq3;
    }

    @NotNull
    public final tp1 a(@Nullable ar1<b8<String>> object, @NotNull x2 x22) {
        kq kq3 = this.a;
        object = object != null ? (b8)object.a : null;
        return kq3.a(object, x22);
    }
}


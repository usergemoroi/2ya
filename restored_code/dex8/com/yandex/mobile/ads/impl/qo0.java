/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.be2
 *  com.yandex.mobile.ads.impl.dh2
 *  com.yandex.mobile.ads.impl.eh2
 *  com.yandex.mobile.ads.impl.fg2
 *  com.yandex.mobile.ads.impl.kc2
 *  com.yandex.mobile.ads.impl.so0
 *  com.yandex.mobile.ads.impl.us
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.be2;
import com.yandex.mobile.ads.impl.dh2;
import com.yandex.mobile.ads.impl.eh2;
import com.yandex.mobile.ads.impl.fg2;
import com.yandex.mobile.ads.impl.kc2;
import com.yandex.mobile.ads.impl.ro0;
import com.yandex.mobile.ads.impl.so0;
import com.yandex.mobile.ads.impl.us;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;

public final class qo0
implements fg2 {
    @NotNull
    private final eh2 a;
    @NotNull
    private final so0 b;

    @JvmOverloads
    public qo0(@NotNull eh2 eh22, @NotNull so0 so02) {
        this.a = eh22;
        this.b = so02;
    }

    public /* synthetic */ qo0(us us3, kc2 kc22, be2 be22, ro0 ro02) {
        this(new eh2((dh2)ro02), new so0(be22, us3, kc22));
    }

    public final boolean a() {
        boolean bl2 = this.b.a() && this.a.a();
        return bl2;
    }
}


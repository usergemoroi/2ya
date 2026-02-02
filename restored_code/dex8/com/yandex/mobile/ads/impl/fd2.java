/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.a71
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.j81
 *  com.yandex.mobile.ads.impl.sp1$a
 *  com.yandex.mobile.ads.impl.tp1
 *  com.yandex.mobile.ads.impl.wd2$b
 *  com.yandex.mobile.ads.impl.x2
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.a71;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.j81;
import com.yandex.mobile.ads.impl.sp1;
import com.yandex.mobile.ads.impl.tp1;
import com.yandex.mobile.ads.impl.wd2;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.x71;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;

public final class fd2
implements wd2.b {
    @NotNull
    private final x2 a;
    @NotNull
    private final b8<?> b;
    @NotNull
    private final j81 c;

    public /* synthetic */ fd2(x2 x22, b8 b82) {
        this(x22, b82, new x71());
    }

    @JvmOverloads
    public fd2(@NotNull x2 x22, @NotNull b8<?> b82, @NotNull j81 j812) {
        this.a = x22;
        this.b = b82;
        this.c = j812;
    }

    @NotNull
    public final tp1 a() {
        Object object = this.b.J();
        object = object instanceof a71 ? (a71)object : null;
        object = this.c.a(this.b, this.a, (a71)object);
        object.b((Object)sp1.a.a, "adapter");
        object.a(this.b.a());
        return object;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.gk0
 *  com.yandex.mobile.ads.impl.hy1
 *  com.yandex.mobile.ads.impl.ik0
 *  com.yandex.mobile.ads.impl.ld1
 *  com.yandex.mobile.ads.impl.rd1
 *  com.yandex.mobile.ads.impl.u92
 *  kotlin.collections.s0
 *  kotlin.collections.t
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.gk0;
import com.yandex.mobile.ads.impl.hy1;
import com.yandex.mobile.ads.impl.ik0;
import com.yandex.mobile.ads.impl.ld1;
import com.yandex.mobile.ads.impl.rd1;
import com.yandex.mobile.ads.impl.u92;
import java.util.List;
import java.util.Map;
import kotlin.collections.s0;
import kotlin.collections.t;
import kotlin.z;
import org.jetbrains.annotations.NotNull;

public final class y62
implements ld1 {
    @NotNull
    private final gk0 a;
    @NotNull
    private final ik0 b;
    private boolean c;
    private int d;
    private boolean e;
    private boolean f;

    public y62(@NotNull gk0 gk02, @NotNull ik0 ik02) {
        this.a = gk02;
        this.b = ik02;
    }

    public final void a(@NotNull b8<?> b82) {
        this.a.a(b82);
    }

    public final void a(@NotNull hy1 hy12) {
        if (!this.c) {
            this.c = true;
            this.a.a(this.b.c());
        }
    }

    public final void a(@NotNull hy1 hy12, @NotNull u92 u922) {
        int n10;
        this.d = n10 = this.d + 1;
        if (n10 == 20) {
            this.e = true;
            this.a.b(this.b.b(), u922);
        }
    }

    public final void a(@NotNull hy1 object, @NotNull List<? extends hy1> list) {
        if (!this.f) {
            this.f = true;
            object = s0.g(z.a("failure_tracked", this.e));
            this.a.a(this.b.d(), (Map)object);
        }
    }

    public final void a(@NotNull List<rd1> rd12) {
        if ((rd12 = (rd1)t.t0(rd12)) == null) {
            return;
        }
        this.a.a(this.b.a(), rd12.b());
    }

    public final void invalidate() {
        this.c = false;
        this.d = 0;
        this.e = false;
        this.f = false;
    }
}


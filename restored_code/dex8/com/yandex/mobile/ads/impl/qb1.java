/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.bm1
 *  com.yandex.mobile.ads.impl.cm1
 *  com.yandex.mobile.ads.impl.ib1
 *  com.yandex.mobile.ads.impl.rc0
 *  com.yandex.mobile.ads.impl.v1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bm1;
import com.yandex.mobile.ads.impl.cm1;
import com.yandex.mobile.ads.impl.db1;
import com.yandex.mobile.ads.impl.ib1;
import com.yandex.mobile.ads.impl.rc0;
import com.yandex.mobile.ads.impl.v1;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;

public final class qb1
implements rc0,
ib1 {
    @NotNull
    private final db1 a;
    @NotNull
    private final cm1 b;
    @NotNull
    private final bm1 c;
    @NotNull
    private final v1 d;

    @JvmOverloads
    public qb1(@NotNull db1 db12, @NotNull cm1 cm12, @NotNull bm1 bm12, @NotNull v1 v14) {
        this.a = db12;
        this.b = cm12;
        this.c = bm12;
        this.d = v14;
    }

    public final void a(long l10, long l11) {
        l11 = this.c.a() + l11;
        if (l11 >= (l10 = this.d.a(l10))) {
            this.a.b(this);
            this.b.a();
        } else {
            this.b.a(l10, l11);
        }
    }

    public final void b() {
        this.b.a();
        this.a.b(this);
    }

    public final void c() {
        this.b.a();
        this.a.b(this);
    }

    public final void invalidate() {
        this.a.b(this);
    }

    public final void pause() {
    }

    public final void resume() {
    }

    public final void start() {
        this.a.a(this);
    }
}


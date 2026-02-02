/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ib1
 *  com.yandex.mobile.ads.impl.np
 *  com.yandex.mobile.ads.impl.rc0
 *  com.yandex.mobile.ads.impl.yo
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.db1;
import com.yandex.mobile.ads.impl.ib1;
import com.yandex.mobile.ads.impl.np;
import com.yandex.mobile.ads.impl.op;
import com.yandex.mobile.ads.impl.rc0;
import com.yandex.mobile.ads.impl.yo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class bb1
implements rc0,
ib1 {
    @NotNull
    private final db1 a;
    @NotNull
    private final np b;
    @Nullable
    private final Long c;
    @NotNull
    private final op d;
    @NotNull
    private final yo e;

    public bb1(@NotNull db1 db12, @NotNull np np2, @Nullable Long l10, @NotNull op op2, @NotNull yo yo2) {
        this.a = db12;
        this.b = np2;
        this.c = l10;
        this.d = op2;
        this.e = yo2;
    }

    public final void a(long l10, long l11) {
        if (this.e.a()) {
            this.d.a(l10 - l11, l11);
            l10 = this.d.a();
            Long l13 = this.c;
            if (l13 != null && l10 + l11 >= l13) {
                this.b.a();
                this.a.b(this);
            }
        }
    }

    public final void b() {
        this.b.a();
        this.a.b(this);
    }

    public final void c() {
        if (this.e.a()) {
            this.b.a();
            this.a.b(this);
        }
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
        if (this.e.a() && this.c != null && this.d.a() >= this.c) {
            this.b.a();
            this.a.b(this);
        }
    }
}


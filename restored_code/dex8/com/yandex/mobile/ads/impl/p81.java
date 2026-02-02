/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.h52
 *  com.yandex.mobile.ads.impl.mg1
 *  com.yandex.mobile.ads.impl.mg1$a
 *  com.yandex.mobile.ads.impl.np
 *  com.yandex.mobile.ads.impl.og1
 *  com.yandex.mobile.ads.impl.p52
 *  com.yandex.mobile.ads.impl.q81
 *  com.yandex.mobile.ads.impl.rc0
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.h52;
import com.yandex.mobile.ads.impl.mg1;
import com.yandex.mobile.ads.impl.np;
import com.yandex.mobile.ads.impl.og1;
import com.yandex.mobile.ads.impl.op;
import com.yandex.mobile.ads.impl.p52;
import com.yandex.mobile.ads.impl.q81;
import com.yandex.mobile.ads.impl.rc0;
import org.jetbrains.annotations.NotNull;

public final class p81
implements rc0 {
    @NotNull
    private final np a;
    @NotNull
    private final op b;
    private final long c;
    @NotNull
    private final mg1 d;
    @NotNull
    private final a e;

    public /* synthetic */ p81(b8 b82, np np2, h52 object) {
        object = object.c();
        long l10 = q81.a((b8)b82);
        int n10 = mg1.a;
        this(np2, (op)object, l10, mg1.a.a((boolean)false));
    }

    public p81(@NotNull np np2, @NotNull op op2, long l10, @NotNull mg1 mg12) {
        this.a = np2;
        this.b = op2;
        this.c = l10;
        this.d = mg12;
        this.e = new a(this);
    }

    public static final void a(p81 p812) {
        p812.a.a();
    }

    public final void invalidate() {
        this.d.invalidate();
    }

    public final void pause() {
        this.d.pause();
    }

    public final void resume() {
        this.d.resume();
    }

    public final void start() {
        long l10 = Math.max(0L, this.c - this.b.a());
        this.d.a((p52)this.b);
        this.d.a(l10, (og1)this.e);
    }

    private final class a
    implements og1 {
        final p81 a;

        public a(p81 p812) {
            this.a = p812;
        }

        public final void a() {
            p81.a(this.a);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.bm1
 *  com.yandex.mobile.ads.impl.cm1
 *  com.yandex.mobile.ads.impl.ez
 *  com.yandex.mobile.ads.impl.mg1
 *  com.yandex.mobile.ads.impl.og1
 *  com.yandex.mobile.ads.impl.p52
 *  com.yandex.mobile.ads.impl.rc0
 *  com.yandex.mobile.ads.impl.v1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bm1;
import com.yandex.mobile.ads.impl.cm1;
import com.yandex.mobile.ads.impl.ez;
import com.yandex.mobile.ads.impl.mg1;
import com.yandex.mobile.ads.impl.og1;
import com.yandex.mobile.ads.impl.p52;
import com.yandex.mobile.ads.impl.rc0;
import com.yandex.mobile.ads.impl.v1;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;

public final class f91
implements rc0 {
    @NotNull
    private final cm1 a;
    @NotNull
    private final mg1 b;
    @NotNull
    private final bm1 c;
    @NotNull
    private final v1 d;
    @NotNull
    private final ez e;

    @JvmOverloads
    public f91(@NotNull cm1 cm12, @NotNull mg1 mg12, @NotNull bm1 bm12, @NotNull v1 v14, @NotNull ez ez3) {
        this.a = cm12;
        this.b = mg12;
        this.c = bm12;
        this.d = v14;
        this.e = ez3;
    }

    public final void invalidate() {
        this.b.invalidate();
    }

    public final void pause() {
        this.b.pause();
    }

    public final void resume() {
        this.b.resume();
    }

    public final void start() {
        a a13 = new a(this);
        long l10 = this.e.a();
        this.b.a(l10, (og1)a13);
        this.b.a((p52)a13);
    }

    private final class a
    implements og1,
    p52 {
        final f91 a;

        public a(f91 f912) {
            this.a = f912;
        }

        public final void a() {
            this.a.a.a();
        }

        public final void a(long l10, long l11) {
            l11 = this.a.e.a();
            long l13 = this.a.c.a();
            long l14 = this.a.d.a();
            this.a.a.a(l14, l13 + (l11 - l10));
        }
    }
}


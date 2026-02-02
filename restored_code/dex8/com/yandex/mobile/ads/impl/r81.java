/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.cm1
 *  com.yandex.mobile.ads.impl.ez
 *  com.yandex.mobile.ads.impl.h52
 *  com.yandex.mobile.ads.impl.mg1
 *  com.yandex.mobile.ads.impl.mg1$a
 *  com.yandex.mobile.ads.impl.og1
 *  com.yandex.mobile.ads.impl.p52
 *  com.yandex.mobile.ads.impl.rc0
 *  com.yandex.mobile.ads.impl.t2
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.cm1;
import com.yandex.mobile.ads.impl.ez;
import com.yandex.mobile.ads.impl.h52;
import com.yandex.mobile.ads.impl.mg1;
import com.yandex.mobile.ads.impl.og1;
import com.yandex.mobile.ads.impl.p52;
import com.yandex.mobile.ads.impl.rc0;
import com.yandex.mobile.ads.impl.t2;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class r81
implements rc0 {
    @NotNull
    private final mg1 a;
    @NotNull
    private final ez b;
    @Nullable
    private t2 c;
    @Nullable
    private cm1 d;

    @JvmOverloads
    public r81(@NotNull t2 t24, @NotNull cm1 cm12, @NotNull mg1 mg12, @NotNull ez ez3) {
        this.a = mg12;
        this.b = ez3;
        this.c = t24;
        this.d = cm12;
    }

    public /* synthetic */ r81(t2 t24, h52 h522, cm1 cm12) {
        int n10 = mg1.a;
        this(t24, cm12, mg1.a.a((boolean)false), h522.d());
    }

    public static final void b(r81 r812) {
        cm1 cm12 = r812.d;
        if (cm12 != null) {
            cm12.a();
        }
        if ((r812 = r812.c) != null) {
            r812.b();
        }
    }

    public final void invalidate() {
        this.a.invalidate();
        this.a.a(null);
        this.c = null;
        this.d = null;
    }

    public final void pause() {
        this.a.pause();
    }

    public final void resume() {
        this.a.resume();
    }

    public final void start() {
        a a14 = new a(this);
        long l10 = this.b.a();
        b b10 = new b(this, l10);
        this.a.a((p52)b10);
        this.a.a(l10, (og1)a14);
    }

    private final class a
    implements og1 {
        final r81 a;

        public a(r81 r812) {
            this.a = r812;
        }

        public final void a() {
            r81.b(this.a);
        }
    }

    private final class b
    implements p52 {
        private final long a;
        final r81 b;

        public b(r81 r812, long l10) {
            this.b = r812;
            this.a = l10;
        }

        public final void a(long l10, long l11) {
            cm1 cm12 = this.b.d;
            if (cm12 != null) {
                l11 = this.a;
                cm12.a(l11, l11 - l10);
            }
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 *  com.yandex.mobile.ads.impl.a1
 *  com.yandex.mobile.ads.impl.b1
 *  com.yandex.mobile.ads.impl.da1
 *  com.yandex.mobile.ads.impl.h52
 *  com.yandex.mobile.ads.impl.m91
 *  com.yandex.mobile.ads.impl.q52
 *  com.yandex.mobile.ads.impl.t00
 */
package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.yandex.mobile.ads.impl.a1;
import com.yandex.mobile.ads.impl.b1;
import com.yandex.mobile.ads.impl.da1;
import com.yandex.mobile.ads.impl.h52;
import com.yandex.mobile.ads.impl.m91;
import com.yandex.mobile.ads.impl.q52;
import com.yandex.mobile.ads.impl.r52;
import com.yandex.mobile.ads.impl.t00;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;

public final class vs1<V extends ViewGroup>
implements t00<V> {
    @NotNull
    private final a1 a;
    @NotNull
    private final q52 b;
    @NotNull
    private final da1 c;
    @NotNull
    private final b1 d;

    @JvmOverloads
    public vs1(@NotNull a1 a14, @NotNull r52 r522, @NotNull da1 da12, @NotNull b1 b14) {
        this.a = a14;
        this.b = r522;
        this.c = da12;
        this.d = b14;
    }

    public /* synthetic */ vs1(a1 a14, r52 r522, m91 m912, h52 h522) {
        m912 = new da1(r522, m912, h522);
        this(a14, r522, (da1)m912, new a((da1)m912));
    }

    public final void a(@NotNull V object) {
        this.a.a(this.d);
        object = this.b.b(object);
        this.c.a(object);
    }

    public final void c() {
        this.a.b(this.d);
        this.c.a();
    }

    private static final class a
    implements b1 {
        @NotNull
        private final da1 a;

        public a(@NotNull da1 da12) {
            this.a = da12;
        }

        public final void a() {
            this.a.c();
        }

        public final void b() {
            this.a.b();
        }
    }
}


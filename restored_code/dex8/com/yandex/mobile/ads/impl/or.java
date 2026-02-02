/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 *  com.yandex.mobile.ads.impl.a1
 *  com.yandex.mobile.ads.impl.b1
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.h52
 *  com.yandex.mobile.ads.impl.m91
 *  com.yandex.mobile.ads.impl.pr
 *  com.yandex.mobile.ads.impl.qr
 *  com.yandex.mobile.ads.impl.rc0
 *  com.yandex.mobile.ads.impl.t00
 *  com.yandex.mobile.ads.impl.t2
 *  com.yandex.mobile.ads.impl.t20
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.impl.a1;
import com.yandex.mobile.ads.impl.b1;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.h52;
import com.yandex.mobile.ads.impl.m91;
import com.yandex.mobile.ads.impl.pr;
import com.yandex.mobile.ads.impl.pr0;
import com.yandex.mobile.ads.impl.qr;
import com.yandex.mobile.ads.impl.rc0;
import com.yandex.mobile.ads.impl.t00;
import com.yandex.mobile.ads.impl.t2;
import com.yandex.mobile.ads.impl.t20;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class or<V extends ViewGroup>
implements t00<V> {
    @NotNull
    private final b8<?> a;
    @NotNull
    private final a1 b;
    @NotNull
    private final t2 c;
    @NotNull
    private final m91 d;
    @NotNull
    private final h52 e;
    @Nullable
    private final t20 f;
    @NotNull
    private final qr g;
    @NotNull
    private final pr0 h;
    @Nullable
    private rc0 i;
    @Nullable
    private b1 j;

    public /* synthetic */ or(b8 b82, a1 a14, t2 t24, m91 m912, h52 h522, t20 t202) {
        this(b82, a14, t24, m912, h522, t202, new qr(), new pr0(0));
    }

    @JvmOverloads
    public or(@NotNull b8<?> b82, @NotNull a1 a14, @NotNull t2 t24, @NotNull m91 m912, @NotNull h52 h522, @Nullable t20 t202, @NotNull qr qr3, @NotNull pr0 pr02) {
        this.a = b82;
        this.b = a14;
        this.c = t24;
        this.d = m912;
        this.e = h522;
        this.f = t202;
        this.g = qr3;
        this.h = pr02;
    }

    public final void a(@NotNull V object) {
        a a14 = new a(this);
        this.b.a((b1)a14);
        this.j = a14;
        this.h.a((View)object);
        qr qr3 = this.g;
        b8<?> b82 = this.a;
        t2 t24 = this.c;
        m91 m912 = this.d;
        object = this.e;
        a14 = this.f;
        pr0 pr02 = this.h;
        qr3.getClass();
        object = new pr(b82, t24, m912, object, (t20)a14, pr02).a();
        object.start();
        this.i = object;
    }

    public final void c() {
        b1 b14 = this.j;
        if (b14 != null) {
            this.b.b(b14);
        }
        if ((b14 = this.i) != null) {
            b14.invalidate();
        }
        this.h.b();
    }

    private final class a
    implements b1 {
        final or<V> a;

        public a(or or3) {
            this.a = or3;
        }

        public final void a() {
            rc0 rc02 = this.a.i;
            if (rc02 != null) {
                rc02.resume();
            }
        }

        public final void b() {
            rc0 rc02 = this.a.i;
            if (rc02 != null) {
                rc02.pause();
            }
        }
    }
}


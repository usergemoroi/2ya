/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  androidx.annotation.CallSuper
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.a40
 *  com.yandex.mobile.ads.impl.a40$a
 *  com.yandex.mobile.ads.impl.gw0
 *  com.yandex.mobile.ads.impl.k72
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.qw0
 *  com.yandex.mobile.ads.impl.qw0$c
 *  com.yandex.mobile.ads.impl.rw0
 *  com.yandex.mobile.ads.impl.rw0$a
 *  com.yandex.mobile.ads.impl.tq$b
 *  com.yandex.mobile.ads.impl.zr0
 */
package com.yandex.mobile.ads.impl;

import android.os.Handler;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.a40;
import com.yandex.mobile.ads.impl.gw0;
import com.yandex.mobile.ads.impl.k72;
import com.yandex.mobile.ads.impl.l52;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.qw0;
import com.yandex.mobile.ads.impl.rw0;
import com.yandex.mobile.ads.impl.s43;
import com.yandex.mobile.ads.impl.tq;
import com.yandex.mobile.ads.impl.zj;
import com.yandex.mobile.ads.impl.zr0;
import java.io.IOException;
import java.util.HashMap;

public abstract class tq<T>
extends zj {
    private final HashMap<T, b<T>> h = new HashMap();
    @Nullable
    private Handler i;
    @Nullable
    private k72 j;

    protected tq() {
    }

    private /* synthetic */ void a(Object object, qw0 qw02, l52 l522) {
        this.b(object, qw02, l522);
    }

    public static /* synthetic */ void f(tq tq3, Object object, qw0 qw02, l52 l522) {
        tq3.a(object, qw02, l522);
    }

    @Nullable
    protected abstract qw0.b a(T var1, qw0.b var2);

    @Override
    @CallSuper
    protected final void a() {
        for (b<T> b10 : this.h.values()) {
            b10.a.b(b10.b);
        }
    }

    @Override
    @CallSuper
    protected void a(@Nullable k72 k722) {
        this.j = k722;
        this.i = m92.a(null);
    }

    protected final void a(T object, qw0 qw02) {
        if (this.h.containsKey(object) ^ true) {
            s43 s432 = new s43(this, object);
            a a13 = new a(this, object);
            this.h.put(object, new /* Unavailable Anonymous Inner Class!! */);
            object = this.i;
            object.getClass();
            qw02.a((Handler)object, (rw0)a13);
            object = this.i;
            object.getClass();
            qw02.a((Handler)object, (a40)a13);
            qw02.a((qw0.c)s432, this.j, this.c());
            if (!this.d()) {
                qw02.b((qw0.c)s432);
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override
    @CallSuper
    protected final void b() {
        for (b<T> b10 : this.h.values()) {
            b10.a.c(b10.b);
        }
    }

    protected abstract void b(T var1, qw0 var2, l52 var3);

    @Override
    @CallSuper
    protected void e() {
        for (b<T> b10 : this.h.values()) {
            b10.a.a(b10.b);
            b10.a.a((rw0)b10.c);
            b10.a.a((a40)b10.c);
        }
        this.h.clear();
    }

    private final class a
    implements rw0,
    a40 {
        private final T a;
        private rw0.a b;
        private a40.a c;
        final tq d;

        public a(tq tq3, T t13) {
            this.d = tq3;
            this.b = tq3.b((qw0.b)null);
            this.c = tq3.a((qw0.b)null);
            this.a = t13;
        }

        private gw0 a(gw0 gw02) {
            tq tq3 = this.d;
            long l10 = gw02.f;
            tq3.getClass();
            tq3 = this.d;
            long l11 = gw02.g;
            tq3.getClass();
            if (l10 == gw02.f && l11 == gw02.g) {
                return gw02;
            }
            return new gw0(gw02.a, gw02.b, gw02.c, gw02.d, gw02.e, l10, l11);
        }

        private boolean e(int n10, @Nullable qw0.b b10) {
            qw0.b b11;
            if (b10 != null) {
                b10 = b11 = this.d.a(this.a, b10);
                if (b11 == null) {
                    return false;
                }
            } else {
                b10 = null;
            }
            this.d.getClass();
            b11 = this.b;
            if (((rw0.a)b11).a != n10 || !m92.a((Object)((Object)((rw0.a)b11).b), (Object)((Object)b10))) {
                this.b = this.d.b(n10, b10);
            }
            b11 = this.c;
            if (((a40.a)b11).a != n10 || !m92.a((Object)((Object)((a40.a)b11).b), (Object)((Object)b10))) {
                this.c = this.d.a(n10, b10);
            }
            return true;
        }

        public final void a(int n10, @Nullable qw0.b b10) {
            if (this.e(n10, b10)) {
                this.c.c();
            }
        }

        public final void a(int n10, @Nullable qw0.b b10, int n12) {
            if (this.e(n10, b10)) {
                this.c.a(n12);
            }
        }

        public final void a(int n10, @Nullable qw0.b b10, gw0 gw02) {
            if (this.e(n10, b10)) {
                this.b.a(this.a(gw02));
            }
        }

        public final void a(int n10, @Nullable qw0.b b10, zr0 zr02, gw0 gw02) {
            if (this.e(n10, b10)) {
                this.b.a(zr02, this.a(gw02));
            }
        }

        public final void a(int n10, @Nullable qw0.b b10, zr0 zr02, gw0 gw02, IOException iOException, boolean bl2) {
            if (this.e(n10, b10)) {
                this.b.a(zr02, this.a(gw02), iOException, bl2);
            }
        }

        public final void a(int n10, @Nullable qw0.b b10, Exception exception) {
            if (this.e(n10, b10)) {
                this.c.a(exception);
            }
        }

        public final void b(int n10, @Nullable qw0.b b10) {
            if (this.e(n10, b10)) {
                this.c.d();
            }
        }

        public final void b(int n10, @Nullable qw0.b b10, zr0 zr02, gw0 gw02) {
            if (this.e(n10, b10)) {
                this.b.b(zr02, this.a(gw02));
            }
        }

        public final void c(int n10, @Nullable qw0.b b10) {
            if (this.e(n10, b10)) {
                this.c.a();
            }
        }

        public final void c(int n10, @Nullable qw0.b b10, zr0 zr02, gw0 gw02) {
            if (this.e(n10, b10)) {
                this.b.c(zr02, this.a(gw02));
            }
        }

        public final void d(int n10, @Nullable qw0.b b10) {
            if (this.e(n10, b10)) {
                this.c.b();
            }
        }
    }
}


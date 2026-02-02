/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.a40
 *  com.yandex.mobile.ads.impl.a40$a
 *  com.yandex.mobile.ads.impl.k72
 *  com.yandex.mobile.ads.impl.mi1
 *  com.yandex.mobile.ads.impl.qw0
 *  com.yandex.mobile.ads.impl.qw0$c
 *  com.yandex.mobile.ads.impl.rw0
 *  com.yandex.mobile.ads.impl.rw0$a
 */
package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.a40;
import com.yandex.mobile.ads.impl.k72;
import com.yandex.mobile.ads.impl.l52;
import com.yandex.mobile.ads.impl.mi1;
import com.yandex.mobile.ads.impl.qw0;
import com.yandex.mobile.ads.impl.rw0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public abstract class zj
implements qw0 {
    private final ArrayList<qw0.c> a = new ArrayList(1);
    private final HashSet<qw0.c> b = new HashSet(1);
    private final rw0.a c = new rw0.a();
    private final a40.a d = new a40.a();
    @Nullable
    private Looper e;
    @Nullable
    private l52 f;
    @Nullable
    private mi1 g;

    protected final a40.a a(int n10, @Nullable qw0.b b10) {
        return this.d.a(n10, b10);
    }

    protected final a40.a a(@Nullable qw0.b b10) {
        return this.d.a(0, b10);
    }

    protected void a() {
    }

    public final void a(Handler handler, a40 a402) {
        this.d.a(handler, a402);
    }

    public final void a(Handler handler, rw0 rw02) {
        this.c.a(handler, rw02);
    }

    public final void a(a40 a402) {
        this.d.e(a402);
    }

    protected abstract void a(@Nullable k72 var1);

    protected final void a(l52 l522) {
        this.f = l522;
        Iterator<qw0.c> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().a((qw0)this, l522);
        }
    }

    public final void a(qw0.c c10) {
        this.a.remove(c10);
        if (this.a.isEmpty()) {
            this.e = null;
            this.f = null;
            this.g = null;
            this.b.clear();
            this.e();
        } else {
            this.b(c10);
        }
    }

    public final void a(qw0.c c10, @Nullable k72 k722, mi1 object) {
        Looper looper = Looper.myLooper();
        Looper looper2 = this.e;
        if (looper2 != null && looper2 != looper) {
            throw new IllegalArgumentException();
        }
        this.g = object;
        object = this.f;
        this.a.add(c10);
        if (this.e == null) {
            this.e = looper;
            this.b.add(c10);
            this.a(k722);
        } else if (object != null) {
            this.c(c10);
            c10.a((qw0)this, (l52)object);
        }
    }

    public final void a(rw0 rw02) {
        this.c.a(rw02);
    }

    protected final rw0.a b(int n10, @Nullable qw0.b b10) {
        return this.c.a(n10, b10);
    }

    protected final rw0.a b(@Nullable qw0.b b10) {
        return this.c.a(0, b10);
    }

    protected void b() {
    }

    public final void b(qw0.c c10) {
        boolean bl2 = this.b.isEmpty();
        this.b.remove(c10);
        if (bl2 ^ true && this.b.isEmpty()) {
            this.a();
        }
    }

    protected final mi1 c() {
        mi1 mi12 = this.g;
        if (mi12 != null) {
            return mi12;
        }
        throw new IllegalStateException();
    }

    public final void c(qw0.c c10) {
        this.e.getClass();
        boolean bl2 = this.b.isEmpty();
        this.b.add(c10);
        if (bl2) {
            this.b();
        }
    }

    protected final boolean d() {
        return this.b.isEmpty() ^ true;
    }

    protected abstract void e();
}


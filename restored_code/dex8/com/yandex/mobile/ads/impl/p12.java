/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.jh
 *  com.yandex.mobile.ads.impl.jh$a
 *  com.yandex.mobile.ads.impl.jh$b
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.o12
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.jh;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.o12;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

public final class p12
implements jh {
    private int b;
    private float c = 1.0f;
    private float d = 1.0f;
    private jh.a e;
    private jh.a f;
    private jh.a g;
    private jh.a h;
    private boolean i;
    @Nullable
    private o12 j;
    private ByteBuffer k;
    private ShortBuffer l;
    private ByteBuffer m;
    private long n;
    private long o;
    private boolean p;

    public p12() {
        Object object = jh.a.e;
        this.e = object;
        this.f = object;
        this.g = object;
        this.h = object;
        object = jh.a;
        this.k = object;
        this.l = ((ByteBuffer)object).asShortBuffer();
        this.m = object;
        this.b = -1;
    }

    public final long a(long l10) {
        if (this.o >= 1024L) {
            long l11 = this.n;
            o12 o122 = this.j;
            o122.getClass();
            int n10 = this.h.a;
            int n13 = this.g.a;
            l10 = n10 == n13 ? m92.a((long)l10, (long)l11, (long)this.o) : m92.a((long)l10, (long)((l11 -= (long)o122.c()) * (long)n10), (long)(this.o * (long)n13));
            return l10;
        }
        return (long)((double)this.c * (double)l10);
    }

    public final jh.a a(jh.a a14) throws jh.b {
        if (a14.c == 2) {
            int n10;
            int n13 = n10 = this.b;
            if (n10 == -1) {
                n13 = a14.a;
            }
            this.e = a14;
            this.f = a14 = new jh.a(n13, a14.b, 2);
            this.i = true;
            return a14;
        }
        throw new jh.b(a14);
    }

    public final void a(float f11) {
        if (this.d != f11) {
            this.d = f11;
            this.i = true;
        }
    }

    public final void a(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        o12 o122 = this.j;
        o122.getClass();
        ShortBuffer shortBuffer = byteBuffer.asShortBuffer();
        int n10 = byteBuffer.remaining();
        this.n += (long)n10;
        o122.b(shortBuffer);
        byteBuffer.position(byteBuffer.position() + n10);
    }

    public final boolean a() {
        o12 o122;
        boolean bl2 = this.p && ((o122 = this.j) == null || o122.b() == 0);
        return bl2;
    }

    public final void b() {
        this.c = 1.0f;
        this.d = 1.0f;
        Object object = jh.a.e;
        this.e = object;
        this.f = object;
        this.g = object;
        this.h = object;
        object = jh.a;
        this.k = object;
        this.l = ((ByteBuffer)object).asShortBuffer();
        this.m = object;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    public final void b(float f11) {
        if (this.c != f11) {
            this.c = f11;
            this.i = true;
        }
    }

    public final ByteBuffer c() {
        ByteBuffer byteBuffer;
        int n10;
        o12 o122 = this.j;
        if (o122 != null && (n10 = o122.b()) > 0) {
            if (this.k.capacity() < n10) {
                this.k = byteBuffer = ByteBuffer.allocateDirect(n10).order(ByteOrder.nativeOrder());
                this.l = byteBuffer.asShortBuffer();
            } else {
                this.k.clear();
                this.l.clear();
            }
            o122.a(this.l);
            this.o += (long)n10;
            this.k.limit(n10);
            this.m = this.k;
        }
        byteBuffer = this.m;
        this.m = jh.a;
        return byteBuffer;
    }

    public final void d() {
        o12 o122 = this.j;
        if (o122 != null) {
            o122.e();
        }
        this.p = true;
    }

    public final void flush() {
        if (this.isActive()) {
            jh.a a14;
            jh.a a15;
            this.g = a15 = this.e;
            this.h = a14 = this.f;
            if (this.i) {
                this.j = new o12(a15.a, a15.b, this.c, this.d, a14.a);
            } else {
                a15 = this.j;
                if (a15 != null) {
                    a15.a();
                }
            }
        }
        this.m = jh.a;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    public final boolean isActive() {
        boolean bl2 = this.f.a != -1 && (Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.a != this.e.a);
        return bl2;
    }
}


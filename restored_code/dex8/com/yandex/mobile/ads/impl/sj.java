/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.CallSuper
 *  com.yandex.mobile.ads.impl.jh
 *  com.yandex.mobile.ads.impl.jh$a
 *  com.yandex.mobile.ads.impl.jh$b
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.CallSuper;
import com.yandex.mobile.ads.impl.jh;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public abstract class sj
implements jh {
    protected jh.a b;
    protected jh.a c;
    private jh.a d;
    private jh.a e;
    private ByteBuffer f;
    private ByteBuffer g;
    private boolean h;

    public sj() {
        ByteBuffer byteBuffer;
        this.f = byteBuffer = jh.a;
        this.g = byteBuffer;
        byteBuffer = jh.a.e;
        this.d = byteBuffer;
        this.e = byteBuffer;
        this.b = byteBuffer;
        this.c = byteBuffer;
    }

    public final jh.a a(jh.a a13) throws jh.b {
        this.d = a13;
        this.e = this.b(a13);
        a13 = this.isActive() ? this.e : jh.a.e;
        return a13;
    }

    protected final ByteBuffer a(int n10) {
        ByteBuffer byteBuffer;
        if (this.f.capacity() < n10) {
            this.f = ByteBuffer.allocateDirect(n10).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        this.g = byteBuffer = this.f;
        return byteBuffer;
    }

    @CallSuper
    public boolean a() {
        boolean bl2 = this.h && this.g == jh.a;
        return bl2;
    }

    protected abstract jh.a b(jh.a var1) throws jh.b;

    public final void b() {
        jh.a a13;
        this.flush();
        this.f = jh.a;
        this.d = a13 = jh.a.e;
        this.e = a13;
        this.b = a13;
        this.c = a13;
        this.h();
    }

    @CallSuper
    public ByteBuffer c() {
        ByteBuffer byteBuffer = this.g;
        this.g = jh.a;
        return byteBuffer;
    }

    public final void d() {
        this.h = true;
        this.g();
    }

    protected final boolean e() {
        return this.g.hasRemaining();
    }

    protected void f() {
    }

    public final void flush() {
        this.g = jh.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        this.f();
    }

    protected void g() {
    }

    protected void h() {
    }

    public boolean isActive() {
        boolean bl2 = this.e != jh.a.e;
        return bl2;
    }
}


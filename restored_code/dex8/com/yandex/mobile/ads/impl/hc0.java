/*
 * Decompiled with CFR 0.152.
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.l52;

public abstract class hc0
extends l52 {
    protected final l52 c;

    public hc0(l52 l522) {
        this.c = l522;
    }

    @Override
    public final int a() {
        return this.c.a();
    }

    @Override
    public final int a(int n10, int n12, boolean bl2) {
        return this.c.a(n10, n12, bl2);
    }

    @Override
    public int a(Object object) {
        return this.c.a(object);
    }

    @Override
    public final int a(boolean bl2) {
        return this.c.a(bl2);
    }

    @Override
    public l52.d a(int n10, l52.d d10, long l10) {
        return this.c.a(n10, d10, l10);
    }

    @Override
    public Object a(int n10) {
        return this.c.a(n10);
    }

    @Override
    public final int b() {
        return this.c.b();
    }

    @Override
    public final int b(int n10, int n12, boolean bl2) {
        return this.c.b(n10, n12, bl2);
    }

    @Override
    public final int b(boolean bl2) {
        return this.c.b(bl2);
    }
}


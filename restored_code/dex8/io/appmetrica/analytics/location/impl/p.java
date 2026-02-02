/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.location.impl.h;
import io.appmetrica.analytics.location.impl.i;
import io.appmetrica.analytics.location.impl.m;
import java.util.HashMap;
import java.util.List;

public final class p {
    public i a;
    public final m b;
    public final h c;
    public final List d;
    public final HashMap e = new HashMap();

    public p(List object, i i14) {
        this.d = object;
        this.a = i14;
        this.b = object = new m();
        this.c = new h((m)object);
    }

    public final m a() {
        return this.b;
    }
}


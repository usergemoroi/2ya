/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ky1
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.sw0
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.d;
import com.yandex.mobile.ads.impl.ky1;
import com.yandex.mobile.ads.impl.l52;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.sw0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

final class ij1
extends d {
    private final int f;
    private final int g;
    private final int[] h;
    private final int[] i;
    private final l52[] j;
    private final Object[] k;
    private final HashMap<Object, Integer> l;

    public ij1(List object, ky1 ky12) {
        super(ky12);
        int n10 = object.size();
        this.h = new int[n10];
        this.i = new int[n10];
        this.j = new l52[n10];
        this.k = new Object[n10];
        this.l = new HashMap();
        object = object.iterator();
        int n13 = 0;
        int n14 = 0;
        n10 = 0;
        while (object.hasNext()) {
            ky12 = (sw0)object.next();
            this.j[n10] = ky12.b();
            this.i[n10] = n13;
            this.h[n10] = n14;
            n13 += this.j[n10].b();
            n14 += this.j[n10].a();
            this.k[n10] = ky12.a();
            this.l.put(this.k[n10], n10);
            ++n10;
        }
        this.f = n13;
        this.g = n14;
    }

    @Override
    public final int a() {
        return this.g;
    }

    @Override
    public final int b() {
        return this.f;
    }

    @Override
    protected final int b(int n10) {
        return m92.a((int[])this.h, (int)(n10 + 1), (boolean)false, (boolean)false);
    }

    @Override
    protected final int b(Object object) {
        int n10 = (object = this.l.get(object)) == null ? -1 : (Integer)object;
        return n10;
    }

    @Override
    protected final int c(int n10) {
        return m92.a((int[])this.i, (int)(n10 + 1), (boolean)false, (boolean)false);
    }

    @Override
    protected final Object d(int n10) {
        return this.k[n10];
    }

    final List<l52> d() {
        return Arrays.asList(this.j);
    }

    @Override
    protected final int e(int n10) {
        return this.h[n10];
    }

    @Override
    protected final int f(int n10) {
        return this.i[n10];
    }

    @Override
    protected final l52 g(int n10) {
        return this.j[n10];
    }
}


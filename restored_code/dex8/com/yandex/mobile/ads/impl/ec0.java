/*
 * Decompiled with CFR 0.152.
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.oz;
import com.yandex.mobile.ads.impl.u70;
import java.io.IOException;

public class ec0
implements u70 {
    private final u70 a;

    public ec0(oz oz3) {
        this.a = oz3;
    }

    @Override
    public long a() {
        return this.a.a();
    }

    @Override
    public final void a(int n10) throws IOException {
        this.a.a(n10);
    }

    @Override
    public final void a(byte[] byArray, int n10, int n12) throws IOException {
        this.a.a(byArray, n10, n12);
    }

    @Override
    public final boolean a(byte[] byArray, int n10, int n12, boolean bl2) throws IOException {
        return this.a.a(byArray, 0, n12, bl2);
    }

    @Override
    public long b() {
        return this.a.b();
    }

    @Override
    public final void b(int n10) throws IOException {
        this.a.b(n10);
    }

    @Override
    public final void b(byte[] byArray, int n10, int n12) throws IOException {
        this.a.b(byArray, n10, n12);
    }

    @Override
    public final boolean b(byte[] byArray, int n10, int n12, boolean bl2) throws IOException {
        return this.a.b(byArray, 0, n12, bl2);
    }

    @Override
    public final void c() {
        this.a.c();
    }

    @Override
    public long d() {
        return this.a.d();
    }

    public final int read(byte[] byArray, int n10, int n12) throws IOException {
        return this.a.read(byArray, n10, n12);
    }
}


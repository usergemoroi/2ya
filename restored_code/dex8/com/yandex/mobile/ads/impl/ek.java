/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.er2
 *  com.yandex.mobile.ads.impl.ps2
 *  com.yandex.mobile.ads.impl.uf
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.b62;
import com.yandex.mobile.ads.impl.b70;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.er2;
import com.yandex.mobile.ads.impl.ps2;
import com.yandex.mobile.ads.impl.uf;
import java.util.Arrays;

public abstract class ek
implements b70 {
    protected final b62 a;
    protected final int b;
    protected final int[] c;
    private final cc0[] d;
    private int e;

    public ek(b62 object, int[] nArray) {
        int n10 = nArray.length;
        int n12 = 0;
        boolean bl2 = n10 > 0;
        uf.b((boolean)bl2);
        this.a = (b62)uf.a((Object)object);
        this.b = n10 = nArray.length;
        this.d = new cc0[n10];
        for (n10 = 0; n10 < nArray.length; ++n10) {
            this.d[n10] = ((b62)object).a(nArray[n10]);
        }
        Arrays.sort(this.d, new ps2());
        this.c = new int[this.b];
        for (n10 = n12; n10 < (n12 = this.b); ++n10) {
            this.c[n10] = ((b62)object).a(this.d[n10]);
        }
        object = new long[n12];
    }

    private static /* synthetic */ int a(cc0 cc02, cc0 cc03) {
        return cc03.i - cc02.i;
    }

    public static /* synthetic */ int b(cc0 cc02, cc0 cc03) {
        return ek.a(cc02, cc03);
    }

    public final b62 a() {
        return this.a;
    }

    public final cc0 a(int n10) {
        return this.d[n10];
    }

    @Override
    public void a(float f11) {
    }

    @Override
    public /* synthetic */ void a(boolean bl2) {
        er2.a((b70)this, (boolean)bl2);
    }

    public final int b() {
        return this.c.length;
    }

    public final int b(int n10) {
        return this.c[n10];
    }

    public final int c(int n10) {
        for (int i14 = 0; i14 < this.b; ++i14) {
            if (this.c[i14] != n10) continue;
            return i14;
        }
        return -1;
    }

    @Override
    public void c() {
    }

    @Override
    public void d() {
    }

    @Override
    public final cc0 e() {
        return this.d[0];
    }

    public final boolean equals(@Nullable Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (ek)object;
            if (this.a != ((ek)object).a || !Arrays.equals(this.c, ((ek)object).c)) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    @Override
    public /* synthetic */ void f() {
        er2.b((b70)this);
    }

    @Override
    public /* synthetic */ void g() {
        er2.c((b70)this);
    }

    public final int hashCode() {
        if (this.e == 0) {
            int n10 = System.identityHashCode(this.a);
            this.e = Arrays.hashCode(this.c) + n10 * 31;
        }
        return this.e;
    }
}


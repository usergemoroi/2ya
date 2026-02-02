/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.iv
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.o60
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.iv;
import com.yandex.mobile.ads.impl.lv;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.o60;
import com.yandex.mobile.ads.impl.u70;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

public final class oz
implements u70 {
    private final byte[] a;
    private final iv b;
    private final long c;
    private long d;
    private byte[] e;
    private int f;
    private int g;

    static {
        o60.a((String)"goog.exo.extractor");
    }

    public oz(lv lv2, long l10, long l11) {
        this.b = lv2;
        this.d = l10;
        this.c = l11;
        this.e = new byte[65536];
        this.a = new byte[4096];
    }

    private int a(byte[] byArray, int n10, int n13, int n14, boolean bl2) throws IOException {
        if (!Thread.interrupted()) {
            if ((n10 = this.b.read(byArray, n10 + n14, n13 - n14)) == -1) {
                if (n14 == 0 && bl2) {
                    return -1;
                }
                throw new EOFException();
            }
            return n14 + n10;
        }
        throw new InterruptedIOException();
    }

    private void d(int n10) {
        int n13;
        this.g = n13 = this.g - n10;
        this.f = 0;
        byte[] byArray = this.e;
        byte[] byArray2 = n13 < byArray.length - 524288 ? new byte[65536 + n13] : byArray;
        System.arraycopy(byArray, n10, byArray2, 0, n13);
        this.e = byArray2;
    }

    @Override
    public final long a() {
        return this.d;
    }

    @Override
    public final void a(int n10) throws IOException {
        int n13 = Math.min(this.g, n10);
        this.d(n13);
        while (n13 < n10 && n13 != -1) {
            int n14 = Math.min(n10, this.a.length + n13);
            n13 = this.a(this.a, -n13, n14, n13, false);
        }
        if (n13 != -1) {
            this.d += (long)n13;
        }
    }

    @Override
    public final void a(byte[] byArray, int n10, int n13) throws IOException {
        this.b(byArray, n10, n13, false);
    }

    public final boolean a(boolean bl2, int n10) throws IOException {
        int n13;
        int n14 = this.f + n10;
        byte[] byArray = this.e;
        if (n14 > byArray.length) {
            n13 = byArray.length;
            int n15 = m92.a;
            n13 = Math.max(65536 + n14, Math.min(n13 * 2, n14 + 524288));
            this.e = Arrays.copyOf(this.e, n13);
        }
        n13 = this.g - this.f;
        while (n13 < n10) {
            if ((n13 = this.a(this.e, this.f, n10, n13, bl2)) == -1) {
                return false;
            }
            this.g = this.f + n13;
        }
        this.f += n10;
        return true;
    }

    @Override
    public final boolean a(byte[] byArray, int n10, int n13, boolean bl2) throws IOException {
        int n14 = this.g;
        boolean bl3 = false;
        if (n14 == 0) {
            n14 = 0;
        } else {
            n14 = Math.min(n14, n13);
            System.arraycopy(this.e, 0, byArray, n10, n14);
            this.d(n14);
        }
        while (n14 < n13 && n14 != -1) {
            n14 = this.a(byArray, n10, n13, n14, bl2);
        }
        if (n14 != -1) {
            this.d += (long)n14;
        }
        bl2 = bl3;
        if (n14 != -1) {
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public final long b() {
        return this.c;
    }

    @Override
    public final void b(int n10) throws IOException {
        this.a(false, n10);
    }

    @Override
    public final void b(byte[] byArray, int n10, int n13) throws IOException {
        this.a(byArray, n10, n13, false);
    }

    @Override
    public final boolean b(byte[] byArray, int n10, int n13, boolean bl2) throws IOException {
        if (!this.a(bl2, n13)) {
            return false;
        }
        System.arraycopy(this.e, this.f - n13, byArray, n10, n13);
        return true;
    }

    public final int c(int n10) throws IOException {
        int n13 = Math.min(this.g, n10);
        this.d(n13);
        int n14 = n13;
        if (n13 == 0) {
            byte[] byArray = this.a;
            n14 = this.a(byArray, 0, Math.min(n10, byArray.length), 0, true);
        }
        if (n14 != -1) {
            this.d += (long)n14;
        }
        return n14;
    }

    public final int c(byte[] byArray, int n10, int n13) throws IOException {
        int n14;
        int n15;
        int n16 = this.f + n13;
        byte[] byArray2 = this.e;
        if (n16 > byArray2.length) {
            n15 = byArray2.length;
            n14 = m92.a;
            n14 = Math.max(65536 + n16, Math.min(n15 * 2, n16 + 524288));
            this.e = Arrays.copyOf(this.e, n14);
        }
        n15 = this.g;
        n14 = this.f;
        if ((n15 -= n14) == 0) {
            if ((n13 = this.a(this.e, n14, n13, 0, true)) == -1) {
                return -1;
            }
            this.g += n13;
        } else {
            n13 = Math.min(n13, n15);
        }
        System.arraycopy(this.e, this.f, byArray, n10, n13);
        this.f += n13;
        return n13;
    }

    @Override
    public final void c() {
        this.f = 0;
    }

    @Override
    public final long d() {
        return this.d + (long)this.f;
    }

    public final int read(byte[] byArray, int n10, int n13) throws IOException {
        int n14 = this.g;
        int n15 = 0;
        if (n14 != 0) {
            n15 = Math.min(n14, n13);
            System.arraycopy(this.e, 0, byArray, n10, n15);
            this.d(n15);
        }
        n14 = n15;
        if (n15 == 0) {
            n14 = this.a(byArray, n10, n13, 0, true);
        }
        if (n14 != -1) {
            this.d += (long)n14;
        }
        return n14;
    }
}


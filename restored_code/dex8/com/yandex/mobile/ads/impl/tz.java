/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.wr0
 *  com.yandex.mobile.ads.impl.y43
 */
package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import com.yandex.mobile.ads.impl.ew0;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.wr0;
import com.yandex.mobile.ads.impl.y43;

public final class tz
implements wr0 {
    private final long a;
    private final long b;
    private final float c;
    private long d;
    private long e;
    private long f;
    private long g;
    private long h;
    private long i;
    private float j;
    private float k;
    private float l;
    private long m;
    private long n;
    private long o;

    private tz(long l10, long l11, float f11) {
        this.a = l10;
        this.b = l11;
        this.c = f11;
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.g = -9223372036854775807L;
        this.h = -9223372036854775807L;
        this.k = 0.97f;
        this.j = 1.03f;
        this.l = 1.0f;
        this.m = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.i = -9223372036854775807L;
        this.n = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    /* synthetic */ tz(long l10, long l11, float f11, y43 y432) {
        this(l10, l11, f11);
    }

    private void b() {
        long l10 = this.d;
        if (l10 != -9223372036854775807L) {
            long l11 = this.e;
            if (l11 != -9223372036854775807L) {
                l10 = l11;
            }
            long l13 = this.g;
            l11 = l10;
            if (l13 != -9223372036854775807L) {
                l11 = l10;
                if (l10 < l13) {
                    l11 = l13;
                }
            }
            l13 = this.h;
            l10 = l11;
            if (l13 != -9223372036854775807L) {
                l10 = l11;
                if (l11 > l13) {
                    l10 = l13;
                }
            }
        } else {
            l10 = -9223372036854775807L;
        }
        if (this.f == l10) {
            return;
        }
        this.f = l10;
        this.i = l10;
        this.n = -9223372036854775807L;
        this.o = -9223372036854775807L;
        this.m = -9223372036854775807L;
    }

    public final float a(long l10, long l11) {
        int n10;
        float f11;
        float f12;
        if (this.d == -9223372036854775807L) {
            return 1.0f;
        }
        l11 = l10 - l11;
        long l13 = this.n;
        if (l13 == -9223372036854775807L) {
            this.n = l11;
            this.o = 0L;
        } else {
            f12 = this.c;
            f11 = l13;
            this.n = l13 = Math.max(l11, (long)((1.0f - f12) * (float)l11 + f11 * f12));
            l13 = Math.abs(l11 - l13);
            l11 = this.o;
            f12 = this.c;
            f11 = l11;
            this.o = (long)((1.0f - f12) * (float)l13 + f11 * f12);
        }
        if (this.m != -9223372036854775807L && SystemClock.elapsedRealtime() - this.m < 1000L) {
            return this.l;
        }
        this.m = SystemClock.elapsedRealtime();
        l11 = this.n;
        if (this.i > (l11 = this.o * 3L + l11)) {
            l13 = m92.a((long)1000L);
            f12 = this.l;
            f11 = l13;
            l13 = (long)((f12 - 1.0f) * f11);
            long l14 = (long)((this.j - 1.0f) * f11);
            long l15 = this.f;
            long l16 = this.i;
            long[] lArray = new long[]{l11, l15, l16 - (l13 + l14)};
            l11 = lArray[0];
            for (n10 = 1; n10 < 3; ++n10) {
                l14 = lArray[n10];
                l13 = l11;
                if (l14 > l11) {
                    l13 = l14;
                }
                l11 = l13;
            }
            this.i = l11;
        } else {
            l13 = (long)(Math.max(0.0f, this.l - 1.0f) / 1.0E-7f);
            long l17 = this.i;
            n10 = m92.a;
            this.i = l13 = Math.max(l17, Math.min(l10 - l13, l11));
            l11 = this.h;
            if (l11 != -9223372036854775807L && l13 > l11) {
                this.i = l11;
            }
        }
        if (Math.abs(l10 -= this.i) < this.a) {
            this.l = 1.0f;
        } else {
            f11 = l10;
            f12 = this.k;
            float f13 = this.j;
            n10 = m92.a;
            this.l = Math.max(f12, Math.min(f11 * 1.0E-7f + 1.0f, f13));
        }
        return this.l;
    }

    public final long a() {
        return this.i;
    }

    public final void a(long l10) {
        this.e = l10;
        this.b();
    }

    public final void a(ew0.e e11) {
        this.d = m92.a((long)e11.b);
        this.g = m92.a((long)e11.c);
        this.h = m92.a((long)e11.d);
        float f11 = e11.e;
        if (f11 == -3.4028235E38f) {
            f11 = 0.97f;
        }
        this.k = f11;
        float f12 = e11.f;
        if (f12 == -3.4028235E38f) {
            f12 = 1.03f;
        }
        this.j = f12;
        if (f11 == 1.0f && f12 == 1.0f) {
            this.d = -9223372036854775807L;
        }
        this.b();
    }

    public final void c() {
        long l10;
        long l11 = this.i;
        if (l11 == -9223372036854775807L) {
            return;
        }
        this.i = l10 = l11 + this.b;
        l11 = this.h;
        if (l11 != -9223372036854775807L && l10 > l11) {
            this.i = l11;
        }
        this.m = -9223372036854775807L;
    }
}


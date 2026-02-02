/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.uf
 *  com.yandex.mobile.ads.impl.xr0
 *  com.yandex.mobile.ads.impl.zs0
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.b70;
import com.yandex.mobile.ads.impl.cp1;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.uf;
import com.yandex.mobile.ads.impl.vy;
import com.yandex.mobile.ads.impl.xr0;
import com.yandex.mobile.ads.impl.zs0;

public final class uz
implements xr0 {
    private final vy a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final int f;
    private final boolean g;
    private final long h;
    private final boolean i;
    private int j;
    private boolean k;

    public uz() {
        this(new vy());
    }

    protected uz(vy vy3) {
        uz.a(2500, 0, "bufferForPlaybackMs", "0");
        uz.a(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        uz.a(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        uz.a(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        uz.a(50000, 50000, "maxBufferMs", "minBufferMs");
        uz.a(0, 0, "backBufferDurationMs", "0");
        this.a = vy3;
        long l10 = 50000;
        this.b = m92.a((long)l10);
        this.c = m92.a((long)l10);
        this.d = m92.a((long)2500);
        this.e = m92.a((long)5000);
        this.f = -1;
        this.j = 0xC80000;
        this.g = false;
        this.h = m92.a((long)0);
        this.i = false;
    }

    private static void a(int n10, int n13, String string2, String string3) {
        boolean bl2 = n10 >= n13;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(" cannot be less than ");
        stringBuilder.append(string3);
        uf.a((String)stringBuilder.toString(), (boolean)bl2);
    }

    public final void a(cp1[] cp1Array, b70[] b70Array) {
        int n10;
        int n13 = n10 = this.f;
        if (n10 == -1) {
            n10 = 0;
            int n14 = 0;
            while (true) {
                n13 = cp1Array.length;
                int n15 = 0xC80000;
                if (n10 >= n13) break;
                n13 = n14;
                if (b70Array[n10] != null) {
                    n13 = n15;
                    switch (cp1Array[n10].m()) {
                        default: {
                            throw new IllegalArgumentException();
                        }
                        case 3: 
                        case 4: 
                        case 5: 
                        case 6: {
                            n13 = 131072;
                            break;
                        }
                        case 2: {
                            n13 = 0x7D00000;
                            break;
                        }
                        case 0: {
                            n13 = 144310272;
                            break;
                        }
                        case -2: {
                            n13 = 0;
                        }
                        case 1: 
                    }
                    n13 = n14 + n13;
                }
                ++n10;
                n14 = n13;
            }
            n13 = Math.max(0xC80000, n14);
        }
        this.j = n13;
        this.a.a(n13);
    }

    public final boolean a() {
        return this.i;
    }

    public final boolean a(long l10, float f11) {
        int n10 = this.a.c();
        int n13 = this.j;
        boolean bl2 = true;
        n13 = n10 >= n13 ? 1 : 0;
        long l11 = this.b;
        float f12 = f11 - 1.0f;
        float f13 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
        long l13 = l11;
        if (f13 > 0) {
            n10 = m92.a;
            if (f13 != false) {
                l11 = Math.round((double)l11 * (double)f11);
            }
            l13 = Math.min(l11, this.c);
        }
        if (l10 < Math.max(l13, 500000L)) {
            boolean bl3 = bl2;
            if (!this.g) {
                bl3 = n13 == 0 ? bl2 : false;
            }
            this.k = bl3;
            if (!bl3 && l10 < 500000L) {
                zs0.d((String)"DefaultLoadControl", (String)"Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (l10 >= this.c || n13 != 0) {
            this.k = false;
        }
        return this.k;
    }

    public final boolean a(long l10, float f11, boolean bl2, long l11) {
        int n10 = m92.a;
        long l13 = f11 == 1.0f ? l10 : Math.round((double)l10 / (double)f11);
        l10 = bl2 ? this.e : this.d;
        long l14 = l10;
        if (l11 != -9223372036854775807L) {
            l14 = Math.min(l11 / 2L, l10);
        }
        bl2 = l14 <= 0L || l13 >= l14 || !this.g && this.a.c() >= this.j;
        return bl2;
    }

    public final void b() {
        int n10;
        int n13 = n10 = this.f;
        if (n10 == -1) {
            n13 = 0xC80000;
        }
        this.j = n13;
        this.k = false;
        this.a.d();
    }

    public final vy c() {
        return this.a;
    }

    public final void d() {
        int n10;
        int n13 = n10 = this.f;
        if (n10 == -1) {
            n13 = 0xC80000;
        }
        this.j = n13;
        this.k = false;
        this.a.d();
    }

    public final long e() {
        return this.h;
    }

    public final void f() {
        int n10;
        int n13 = n10 = this.f;
        if (n10 == -1) {
            n13 = 0xC80000;
        }
        this.j = n13;
        this.k = false;
    }
}


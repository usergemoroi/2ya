/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.cx1
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.s52
 *  com.yandex.mobile.ads.impl.v70
 *  com.yandex.mobile.ads.impl.w72
 *  com.yandex.mobile.ads.impl.w72$d
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.cx1;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.s52;
import com.yandex.mobile.ads.impl.v70;
import com.yandex.mobile.ads.impl.w72;

public final class dx1
implements w72 {
    private final cx1 a;
    private final bg1 b;
    private int c;
    private int d;
    private boolean e;
    private boolean f;

    public dx1(cx1 cx12) {
        this.a = cx12;
        this.b = new bg1(32);
    }

    public final void a() {
        this.f = true;
    }

    public final void a(int n10, bg1 bg12) {
        int n12;
        if ((n10 = (n10 & 1) != 0 ? 1 : 0) != 0) {
            n12 = bg12.t();
            n12 = bg12.d() + n12;
        } else {
            n12 = -1;
        }
        if (this.f) {
            if (n10 == 0) {
                return;
            }
            this.f = false;
            bg12.e(n12);
            this.d = 0;
        }
        while (bg12.a() > 0) {
            n10 = this.d;
            if (n10 < 3) {
                if (n10 == 0) {
                    n10 = bg12.t();
                    bg12.e(bg12.d() - 1);
                    if (n10 == 255) {
                        this.f = true;
                        return;
                    }
                }
                n10 = Math.min(bg12.a(), 3 - this.d);
                bg12.a(this.b.c(), this.d, n10);
                this.d = n10 = this.d + n10;
                if (n10 != 3) continue;
                this.b.e(0);
                this.b.d(3);
                this.b.f(1);
                n12 = this.b.t();
                n10 = this.b.t();
                boolean bl2 = (n12 & 0x80) != 0;
                this.e = bl2;
                this.c = ((n12 & 0xF) << 8 | n10) + 3;
                n12 = this.b.b();
                if (n12 >= (n10 = this.c)) continue;
                n10 = Math.min(4098, Math.max(n10, this.b.b() * 2));
                this.b.a(n10);
                continue;
            }
            n10 = Math.min(bg12.a(), this.c - this.d);
            bg12.a(this.b.c(), this.d, n10);
            this.d = n12 = this.d + n10;
            n10 = this.c;
            if (n12 != n10) continue;
            if (this.e) {
                byte[] byArray = this.b.c();
                if (m92.a((int)this.c, (byte[])byArray) != 0) {
                    this.f = true;
                    return;
                }
                this.b.d(this.c - 4);
            } else {
                this.b.d(n10);
            }
            this.b.e(0);
            this.a.a(this.b);
            this.d = 0;
        }
    }

    public final void a(s52 s522, v70 v702, w72.d d10) {
        this.a.a(s522, v702, d10);
        this.f = true;
    }
}


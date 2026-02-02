/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.a
 *  com.yandex.mobile.ads.impl.a$a
 *  com.yandex.mobile.ads.impl.ag1
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.fg1
 *  com.yandex.mobile.ads.impl.g62
 *  com.yandex.mobile.ads.impl.u40
 *  com.yandex.mobile.ads.impl.v70
 *  com.yandex.mobile.ads.impl.w72$d
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.a;
import com.yandex.mobile.ads.impl.ag1;
import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.fg1;
import com.yandex.mobile.ads.impl.g62;
import com.yandex.mobile.ads.impl.u40;
import com.yandex.mobile.ads.impl.v70;
import com.yandex.mobile.ads.impl.w72;
import java.util.Collections;

public final class zq0
implements u40 {
    @Nullable
    private final String a;
    private final bg1 b;
    private final ag1 c;
    private g62 d;
    private String e;
    private cc0 f;
    private int g;
    private int h;
    private int i;
    private int j;
    private long k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private long q;
    private int r;
    private long s;
    private int t;
    @Nullable
    private String u;

    public zq0(@Nullable String string2) {
        this.a = string2;
        string2 = new bg1(1024);
        this.b = string2;
        this.c = new ag1(string2.c());
        this.k = -9223372036854775807L;
    }

    public final void a() {
        this.g = 0;
        this.k = -9223372036854775807L;
        this.l = false;
    }

    public final void a(int n10, long l10) {
        if (l10 != -9223372036854775807L) {
            this.k = l10;
        }
    }

    public final void a(bg1 bg12) throws fg1 {
        block28: {
            if (this.d == null) break block28;
            while (bg12.a() > 0) {
                block29: {
                    int n10;
                    block30: {
                        Object object;
                        ag1 ag12;
                        block31: {
                            block32: {
                                block39: {
                                    block40: {
                                        block41: {
                                            block38: {
                                                int n13;
                                                block37: {
                                                    block33: {
                                                        block34: {
                                                            block35: {
                                                                block36: {
                                                                    boolean bl2;
                                                                    n10 = this.g;
                                                                    if (n10 == 0) break block29;
                                                                    if (n10 == 1) break block30;
                                                                    if (n10 == 2) break block31;
                                                                    if (n10 != 3) break block32;
                                                                    n10 = Math.min(bg12.a(), this.i - this.h);
                                                                    bg12.a(this.c.a, this.h, n10);
                                                                    this.h = n10 = this.h + n10;
                                                                    if (n10 != this.i) continue;
                                                                    this.c.c(0);
                                                                    ag12 = this.c;
                                                                    if (ag12.f()) break block33;
                                                                    this.l = true;
                                                                    n13 = ag12.b(1);
                                                                    n10 = n13 == 1 ? ag12.b(1) : 0;
                                                                    this.m = n10;
                                                                    if (n10 != 0) break block34;
                                                                    if (n13 == 1) {
                                                                        ag12.b((ag12.b(2) + 1) * 8);
                                                                    }
                                                                    if (!ag12.f()) break block35;
                                                                    this.n = ag12.b(6);
                                                                    n10 = ag12.b(4);
                                                                    int n14 = ag12.b(3);
                                                                    if (n10 != 0 || n14 != 0) break block36;
                                                                    if (n13 == 0) {
                                                                        n10 = ag12.e();
                                                                        n14 = ag12.b();
                                                                        object = com.yandex.mobile.ads.impl.a.a((ag1)ag12, (boolean)true);
                                                                        this.u = ((a.a)object).c;
                                                                        this.r = ((a.a)object).a;
                                                                        this.t = ((a.a)object).b;
                                                                        ag12.c(n10);
                                                                        object = new byte[((n14 -= ag12.b()) + 7) / 8];
                                                                        ag12.a((byte[])object, n14);
                                                                        object = new /* Unavailable Anonymous Inner Class!! */.b(this.e).e("audio/mp4a-latm").a(this.u).c(this.t).l(this.r).a(Collections.singletonList(object)).d(this.a).a();
                                                                        if (!((cc0)object).equals(this.f)) {
                                                                            this.f = object;
                                                                            this.s = 1024000000L / (long)((cc0)object).A;
                                                                            this.d.a((cc0)object);
                                                                        }
                                                                    } else {
                                                                        n10 = (int)((long)ag12.b((ag12.b(2) + 1) * 8));
                                                                        n14 = ag12.b();
                                                                        object = com.yandex.mobile.ads.impl.a.a((ag1)ag12, (boolean)true);
                                                                        this.u = ((a.a)object).c;
                                                                        this.r = ((a.a)object).a;
                                                                        this.t = ((a.a)object).b;
                                                                        ag12.d(n10 - (n14 - ag12.b()));
                                                                    }
                                                                    this.o = n10 = ag12.b(3);
                                                                    if (n10 != 0) {
                                                                        if (n10 != 1) {
                                                                            if (n10 != 3 && n10 != 4 && n10 != 5) {
                                                                                if (n10 != 6 && n10 != 7) {
                                                                                    throw new IllegalStateException();
                                                                                }
                                                                                ag12.d(1);
                                                                            } else {
                                                                                ag12.d(6);
                                                                            }
                                                                        } else {
                                                                            ag12.d(9);
                                                                        }
                                                                    } else {
                                                                        ag12.d(8);
                                                                    }
                                                                    this.p = bl2 = ag12.f();
                                                                    this.q = 0L;
                                                                    if (bl2) {
                                                                        if (n13 == 1) {
                                                                            this.q = ag12.b((ag12.b(2) + 1) * 8);
                                                                        } else {
                                                                            do {
                                                                                bl2 = ag12.f();
                                                                                this.q = (this.q << 8) + (long)ag12.b(8);
                                                                            } while (bl2);
                                                                        }
                                                                    }
                                                                    if (ag12.f()) {
                                                                        ag12.d(8);
                                                                    }
                                                                    break block37;
                                                                }
                                                                throw fg1.a(null, null);
                                                            }
                                                            throw fg1.a(null, null);
                                                        }
                                                        throw fg1.a(null, null);
                                                    }
                                                    if (!this.l) break block38;
                                                }
                                                if (this.m != 0) break block39;
                                                if (this.n != 0) break block40;
                                                if (this.o != 0) break block41;
                                                n10 = 0;
                                                do {
                                                    n13 = ag12.b(8);
                                                    n10 += n13;
                                                } while (n13 == 255);
                                                n13 = ag12.e();
                                                if ((n13 & 7) == 0) {
                                                    this.b.e(n13 >> 3);
                                                } else {
                                                    ag12.a(this.b.c(), n10 * 8);
                                                    this.b.e(0);
                                                }
                                                this.d.a(n10, this.b);
                                                long l10 = this.k;
                                                if (l10 != -9223372036854775807L) {
                                                    this.d.a(l10, 1, n10, 0, null);
                                                    this.k += this.s;
                                                }
                                                if (this.p) {
                                                    ag12.d((int)this.q);
                                                }
                                            }
                                            this.g = 0;
                                            continue;
                                        }
                                        throw fg1.a(null, null);
                                    }
                                    throw fg1.a(null, null);
                                }
                                throw fg1.a(null, null);
                            }
                            throw new IllegalStateException();
                        }
                        this.i = n10 = (this.j & 0xFFFFFF1F) << 8 | bg12.t();
                        if (n10 > this.b.c().length) {
                            n10 = this.i;
                            this.b.c(n10);
                            ag12 = this.c;
                            object = this.b.c();
                            ag12.getClass();
                            ag12.a(((byte[])object).length, (byte[])object);
                        }
                        this.h = 0;
                        this.g = 3;
                        continue;
                    }
                    n10 = bg12.t();
                    if ((n10 & 0xE0) == 224) {
                        this.j = n10;
                        this.g = 2;
                        continue;
                    }
                    if (n10 == 86) continue;
                    this.g = 0;
                    continue;
                }
                if (bg12.t() != 86) continue;
                this.g = 1;
            }
            return;
        }
        throw new IllegalStateException();
    }

    public final void a(v70 v702, w72.d d14) {
        d14.a();
        this.d = v702.a(d14.c(), 1);
        this.e = d14.b();
    }

    public final void b() {
    }
}


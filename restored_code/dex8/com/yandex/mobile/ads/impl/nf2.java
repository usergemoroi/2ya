/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.du
 *  com.yandex.mobile.ads.impl.no0
 *  com.yandex.mobile.ads.impl.pf2
 *  com.yandex.mobile.ads.impl.qg2
 *  com.yandex.mobile.ads.impl.rg2
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.du;
import com.yandex.mobile.ads.impl.no0;
import com.yandex.mobile.ads.impl.pf2;
import com.yandex.mobile.ads.impl.qg2;
import com.yandex.mobile.ads.impl.rf2;
import com.yandex.mobile.ads.impl.rg2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class nf2
implements du {
    @NotNull
    private final rf2 a;
    @NotNull
    private final no0 b;
    @NotNull
    private final rg2 c;
    @Nullable
    private pf2 d;

    public nf2(@NotNull rf2 rf22, @NotNull no0 no02) {
        this.a = rf22;
        this.b = no02;
        this.c = rf22.a();
    }

    public final void a() {
        int n10 = this.c.a().ordinal();
        if (n10 != 0) {
            if (n10 != 7) {
                if (n10 != 4) {
                    if (n10 == 5) {
                        this.b.b();
                    }
                } else {
                    this.a.d();
                    this.b.i();
                }
            } else {
                this.b.e();
            }
        } else {
            this.b.g();
        }
    }

    public final void a(@Nullable pf2 pf22) {
        this.d = pf22;
    }

    public final void b() {
        int n10 = this.c.a().ordinal();
        if (n10 == 1 || n10 == 2 || n10 == 3 || n10 == 4 || n10 == 6 || n10 == 7) {
            this.c.a(qg2.b);
            pf2 pf22 = this.d;
            if (pf22 != null) {
                pf22.a();
            }
        }
    }

    public final void c() {
        int n10 = this.c.a().ordinal();
        if (n10 == 2 || n10 == 3) {
            this.a.d();
        }
    }

    public final void d() {
        this.c.a(qg2.c);
        this.a.e();
    }

    public final void e() {
        int n10 = this.c.a().ordinal();
        if (n10 == 2 || n10 == 6) {
            this.a.f();
        }
    }

    public final void f() {
        int n10 = this.c.a().ordinal();
        if (n10 != 1) {
            if (n10 == 2 || n10 == 3 || n10 == 6) {
                this.c.a(qg2.f);
            }
        } else {
            this.c.a(qg2.b);
        }
    }

    public final void onVideoCompleted() {
        this.c.a(qg2.g);
        pf2 pf22 = this.d;
        if (pf22 != null) {
            pf22.onVideoCompleted();
        }
    }

    public final void onVideoError() {
        this.c.a(qg2.i);
        pf2 pf22 = this.d;
        if (pf22 != null) {
            pf22.onVideoError();
        }
    }

    public final void onVideoPaused() {
        this.c.a(qg2.h);
        pf2 pf22 = this.d;
        if (pf22 != null) {
            pf22.onVideoPaused();
        }
    }

    public final void onVideoPrepared() {
        if (qg2.c == this.c.a()) {
            this.c.a(qg2.d);
            this.b.f();
        }
    }

    public final void onVideoResumed() {
        this.c.a(qg2.e);
        pf2 pf22 = this.d;
        if (pf22 != null) {
            pf22.onVideoResumed();
        }
    }
}


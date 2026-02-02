/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ho0
 *  com.yandex.mobile.ads.impl.k8
 *  com.yandex.mobile.ads.impl.l8
 *  com.yandex.mobile.ads.impl.m8
 *  com.yandex.mobile.ads.impl.n8
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ho0;
import com.yandex.mobile.ads.impl.k8;
import com.yandex.mobile.ads.impl.l8;
import com.yandex.mobile.ads.impl.m8;
import com.yandex.mobile.ads.impl.n8;
import com.yandex.mobile.ads.impl.yb2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class h8
implements l8 {
    @NotNull
    private final k8 a;
    @NotNull
    private final n8 b;
    @NotNull
    private final yb2 c;
    @Nullable
    private l8 d;

    public h8(@NotNull k8 k82, @NotNull n8 n82, @NotNull yb2 yb22) {
        this.a = k82;
        this.b = n82;
        this.c = yb22;
        k82.a((l8)this);
        k82.a((ho0)yb22);
    }

    public final void a() {
        this.b.a(m8.f);
        l8 l82 = this.d;
        if (l82 != null) {
            l82.a();
        }
    }

    public final void a(@Nullable ho0 ho02) {
        this.c.a(ho02);
    }

    public final void a(@Nullable l8 l82) {
        this.d = l82;
    }

    public final void b() {
        this.b.a(m8.c);
        l8 l82 = this.d;
        if (l82 != null) {
            l82.b();
        }
    }

    public final void c() {
        this.b.a(m8.e);
        l8 l82 = this.d;
        if (l82 != null) {
            l82.c();
        }
    }

    public final void d() {
        int n10 = this.b.a().ordinal();
        if (n10 == 0 || n10 == 1 || n10 == 2) {
            this.a.c();
        }
    }

    public final void e() {
        int n10 = this.b.a().ordinal();
        if (n10 == 0 || n10 == 1 || n10 == 2) {
            this.a.f();
        }
    }

    public final void f() {
        int n10 = this.b.a().ordinal();
        if (n10 != 0) {
            if (n10 != 1) {
                l8 l82;
                if (n10 == 4 && (l82 = this.d) != null) {
                    l82.a();
                }
            } else {
                l8 l84 = this.d;
                if (l84 != null) {
                    l84.b();
                }
            }
        } else {
            this.a.prepare();
        }
    }

    public final void g() {
        int n10 = this.b.a().ordinal();
        if (n10 != 0) {
            if (n10 != 2) {
                if (n10 != 3) {
                    l8 l82;
                    if (n10 == 4 && (l82 = this.d) != null) {
                        l82.a();
                    }
                } else {
                    l8 l84 = this.d;
                    if (l84 != null) {
                        l84.c();
                    }
                }
            } else {
                this.a.resume();
            }
        } else {
            this.a.prepare();
        }
    }

    public final void h() {
        int n10 = this.b.a().ordinal();
        if (n10 != 0) {
            if (n10 != 1) {
                if (n10 != 2) {
                    if (n10 != 3) {
                        l8 l82;
                        if (n10 == 4 && (l82 = this.d) != null) {
                            l82.a();
                        }
                    } else {
                        l8 l84 = this.d;
                        if (l84 != null) {
                            l84.c();
                        }
                    }
                } else {
                    this.a.resume();
                }
            } else {
                this.b.a(m8.d);
                this.a.start();
            }
        } else {
            this.a.prepare();
        }
    }
}


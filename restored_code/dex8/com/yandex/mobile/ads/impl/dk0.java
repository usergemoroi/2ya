/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.b4
 *  com.yandex.mobile.ads.impl.c4
 *  com.yandex.mobile.ads.impl.dk0$a
 *  com.yandex.mobile.ads.impl.ff2
 *  com.yandex.mobile.ads.impl.fk0
 *  com.yandex.mobile.ads.impl.gp1
 *  com.yandex.mobile.ads.impl.gy1
 *  com.yandex.mobile.ads.impl.hk0
 *  com.yandex.mobile.ads.impl.ou1
 *  com.yandex.mobile.ads.impl.pw1
 *  com.yandex.mobile.ads.impl.pw1$a
 *  com.yandex.mobile.ads.impl.s11
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.b4;
import com.yandex.mobile.ads.impl.c4;
import com.yandex.mobile.ads.impl.dk0;
import com.yandex.mobile.ads.impl.ff2;
import com.yandex.mobile.ads.impl.fk0;
import com.yandex.mobile.ads.impl.gp1;
import com.yandex.mobile.ads.impl.gy1;
import com.yandex.mobile.ads.impl.hk0;
import com.yandex.mobile.ads.impl.ou1;
import com.yandex.mobile.ads.impl.pw1;
import com.yandex.mobile.ads.impl.s11;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class dk0
implements hk0,
s11,
ff2,
gp1 {
    @NotNull
    private final a a;
    @NotNull
    private final b4 b;
    @NotNull
    private final fk0 c;
    private final Context d;
    @Nullable
    private List<gy1> e;
    @Nullable
    private c4 f;

    public dk0(@NotNull Context context, @NotNull a a12, @NotNull b4 b43, @NotNull fk0 fk02) {
        this.a = a12;
        this.b = b43;
        this.c = fk02;
        this.d = context.getApplicationContext();
    }

    private final boolean a() {
        int n10 = pw1.l;
        ou1 ou12 = pw1.a.a().a(this.d);
        boolean bl2 = ou12 == null || ou12.f0();
        return bl2;
    }

    private final boolean i() {
        List<gy1> list = this.e;
        boolean bl2 = list != null && !list.isEmpty();
        return bl2;
    }

    public final void a(@NotNull List<gy1> list, @Nullable c4 c43) {
        this.e = list;
        this.f = c43;
        this.c.a();
    }

    public final void b() {
        if (!this.i()) {
            this.c.c();
            if (this.a()) {
                this.b.a();
                this.a.a(this.f);
            }
        }
    }

    public final void c() {
        if (this.i() && !this.a()) {
            this.b.a();
            this.a.a(this.f);
        }
    }

    public final void d() {
        if (!this.i()) {
            this.c.b();
            if (!this.a()) {
                this.b.a();
                this.a.a(this.f);
            }
        }
    }

    public final void e() {
        if (!this.i()) {
            this.c.b();
            if (!this.a()) {
                this.b.a();
                this.a.a(this.f);
            }
        }
    }

    public final void f() {
    }

    public final void g() {
        if (this.i() && this.a()) {
            this.b.a();
            this.a.a(this.f);
        }
    }

    public final void h() {
        if (!this.i()) {
            this.c.c();
            if (this.a()) {
                this.b.a();
                this.a.a(this.f);
            }
        }
    }
}


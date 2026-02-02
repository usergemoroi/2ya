/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.gv1
 *  com.yandex.mobile.ads.impl.ho0
 *  com.yandex.mobile.ads.impl.i2
 *  com.yandex.mobile.ads.impl.im0
 *  com.yandex.mobile.ads.impl.jm0
 *  com.yandex.mobile.ads.impl.n70
 *  com.yandex.mobile.ads.impl.o82
 *  com.yandex.mobile.ads.impl.ot0
 *  com.yandex.mobile.ads.impl.pt0
 *  com.yandex.mobile.ads.impl.us
 *  com.yandex.mobile.ads.impl.xl0
 *  com.yandex.mobile.ads.impl.ys
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.an2;
import com.yandex.mobile.ads.impl.gv1;
import com.yandex.mobile.ads.impl.ho0;
import com.yandex.mobile.ads.impl.i2;
import com.yandex.mobile.ads.impl.im0;
import com.yandex.mobile.ads.impl.jm0;
import com.yandex.mobile.ads.impl.n70;
import com.yandex.mobile.ads.impl.o82;
import com.yandex.mobile.ads.impl.ot0;
import com.yandex.mobile.ads.impl.pt0;
import com.yandex.mobile.ads.impl.sm2;
import com.yandex.mobile.ads.impl.tt0;
import com.yandex.mobile.ads.impl.us;
import com.yandex.mobile.ads.impl.xl0;
import com.yandex.mobile.ads.impl.yb2;
import com.yandex.mobile.ads.impl.ys;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class mt0
implements o82 {
    @NotNull
    private final us a;
    @NotNull
    private final tt0 b;
    @NotNull
    private final yb2 c;
    @NotNull
    private final pt0 d;
    @NotNull
    private final im0 e;
    @Nullable
    private ot0 f;
    @Nullable
    private ys g;

    public /* synthetic */ mt0(Context context, gv1 gv12, us us3, i2 i23) {
        xl0 xl02 = new xl0();
        jm0 jm02 = new jm0();
        tt0 tt02 = new tt0();
        this(us3, xl02, jm02, tt02, new yb2(), new pt0(context, gv12, us3, i23, tt02, xl02));
    }

    public mt0(@NotNull us us3, @NotNull xl0 xl02, @NotNull jm0 jm02, @NotNull tt0 tt02, @NotNull yb2 yb22, @NotNull pt0 pt02) {
        this.a = us3;
        this.b = tt02;
        this.c = yb22;
        this.d = pt02;
        jm02.getClass();
        this.e = jm0.a((o82)this);
    }

    @NotNull
    public final us a() {
        return this.a;
    }

    public final void a(@NotNull an2 an22) {
        ot0 ot02 = this.f;
        if (ot02 != null) {
            ot02.a();
        }
        if ((ot02 = this.g) != null) {
            this.e.b((ys)ot02);
        }
        this.f = null;
        this.g = an22;
        this.e.a((ys)an22);
        an22 = this.d.a(an22);
        an22.a(this.c);
        an22.c();
        this.f = an22;
    }

    public final void a(@Nullable ho0 ho02) {
        this.c.a(ho02);
    }

    public final void a(@NotNull n70 n702) {
        ot0 ot02 = this.f;
        if (ot02 != null) {
            ot02.a(n702);
        }
    }

    public final void a(@Nullable sm2 sm22) {
        this.b.a(sm22);
    }

    public final void b() {
        ot0 ot02 = this.f;
        if (ot02 != null) {
            ot02.a();
        }
        if ((ot02 = this.g) != null) {
            this.e.b((ys)ot02);
        }
        this.f = null;
        this.g = null;
    }

    public final void c() {
        ot0 ot02 = this.f;
        if (ot02 != null) {
            ot02.b();
        }
    }

    public final void d() {
        ot0 ot02 = this.f;
        if (ot02 != null) {
            ot02.d();
        }
    }

    public final void invalidateAdPlayer() {
        ot0 ot02 = this.f;
        if (ot02 != null) {
            ot02.a();
        }
        if ((ot02 = this.g) != null) {
            this.e.b((ys)ot02);
        }
        this.f = null;
        this.g = null;
    }
}


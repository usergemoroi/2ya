/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.c4
 *  com.yandex.mobile.ads.impl.dt0
 *  com.yandex.mobile.ads.impl.gi2
 *  com.yandex.mobile.ads.impl.jp0
 *  com.yandex.mobile.ads.impl.x2
 *  com.yandex.mobile.ads.impl.xi
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.c4;
import com.yandex.mobile.ads.impl.dt0;
import com.yandex.mobile.ads.impl.gi2;
import com.yandex.mobile.ads.impl.ha;
import com.yandex.mobile.ads.impl.jp0;
import com.yandex.mobile.ads.impl.n62;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.xi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class gi
extends n62 {
    @NotNull
    private final jp0 k;
    @NotNull
    private final xi l;
    @NotNull
    private final dt0 m;
    private boolean n;

    public gi(@NotNull Context context, @NotNull b8<String> b82, @NotNull x2 x22, @NotNull jp0 jp02, @NotNull xi xi2, @NotNull dt0 dt02) {
        super(context, new ha(jp02), b82, x22);
        this.k = jp02;
        this.l = xi2;
        this.m = dt02;
    }

    public final void a(@Nullable c4 c43) {
        if (!this.n) {
            this.n = true;
            this.l.a(c43);
        }
    }

    @Override
    protected final boolean a(int n10) {
        return gi2.a((View)this.k.findViewById(2), (int)n10);
    }

    @Override
    public final void c() {
        this.m.a();
        super.c();
    }

    @Override
    protected final boolean k() {
        return gi2.d((View)this.k.findViewById(2));
    }

    @Override
    protected final boolean l() {
        boolean bl2;
        block3: {
            block2: {
                View view = this.k.findViewById(2);
                if (view == null) break block2;
                int n10 = gi2.b((View)view);
                bl2 = true;
                if (n10 >= 1) break block3;
            }
            bl2 = false;
        }
        return bl2;
    }

    public final void onLeftApplication() {
        this.l.onLeftApplication();
    }

    public final void onReturnedToApplication() {
        this.l.onReturnedToApplication();
    }
}


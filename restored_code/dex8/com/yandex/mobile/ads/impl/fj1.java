/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.bo1
 *  com.yandex.mobile.ads.impl.cg2
 *  com.yandex.mobile.ads.impl.co1
 *  com.yandex.mobile.ads.impl.dm1
 *  com.yandex.mobile.ads.impl.hj1
 *  com.yandex.mobile.ads.impl.us
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bo1;
import com.yandex.mobile.ads.impl.cg2;
import com.yandex.mobile.ads.impl.co1;
import com.yandex.mobile.ads.impl.dm1;
import com.yandex.mobile.ads.impl.hj1;
import com.yandex.mobile.ads.impl.us;
import org.jetbrains.annotations.NotNull;

public final class fj1
implements dm1 {
    @NotNull
    private final cg2 a;
    @NotNull
    private final co1 b;
    @NotNull
    private final bo1 c;
    @NotNull
    private final hj1 d;
    private boolean e;

    public fj1(@NotNull cg2 cg22, @NotNull co1 co12, @NotNull bo1 bo12, @NotNull hj1 hj12) {
        this.a = cg22;
        this.b = co12;
        this.c = bo12;
        this.d = hj12;
    }

    public final void a() {
        if (!this.e) {
            this.e = true;
            this.a.a((dm1)this);
            this.a.a();
        }
    }

    public final void a(long l10) {
        us us3 = this.c.a(l10);
        if (us3 != null) {
            this.d.a(us3);
        } else {
            us3 = this.b.a(l10);
            if (us3 != null) {
                this.d.b(us3);
            }
        }
    }

    public final void b() {
        if (this.e) {
            this.a.a(null);
            this.a.b();
            this.e = false;
        }
    }
}


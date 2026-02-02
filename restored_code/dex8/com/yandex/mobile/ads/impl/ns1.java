/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.nr
 *  com.yandex.mobile.ads.impl.rp
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.nr;
import com.yandex.mobile.ads.impl.r20;
import com.yandex.mobile.ads.impl.rp;
import org.jetbrains.annotations.NotNull;

public final class ns1
implements nr {
    @NotNull
    private final Context a;
    @NotNull
    private final rp b;
    @NotNull
    private final nr c;
    private boolean d;

    public ns1(@NotNull Context context, @NotNull r20 r202, @NotNull nr nr2) {
        this.a = context;
        this.b = r202;
        this.c = nr2;
    }

    public final void a() {
        this.d = true;
        this.b.a();
    }

    public final void e() {
        if (this.d) {
            this.c.e();
        } else {
            this.b.a(this.a);
        }
    }
}


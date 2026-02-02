/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 *  com.yandex.mobile.ads.impl.a1
 *  com.yandex.mobile.ads.impl.b1
 *  com.yandex.mobile.ads.impl.e51
 *  com.yandex.mobile.ads.impl.h00
 *  com.yandex.mobile.ads.impl.nz1
 *  com.yandex.mobile.ads.impl.pg1
 *  com.yandex.mobile.ads.impl.t00
 *  com.yandex.mobile.ads.impl.v5
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.impl.a1;
import com.yandex.mobile.ads.impl.b1;
import com.yandex.mobile.ads.impl.e51;
import com.yandex.mobile.ads.impl.h00;
import com.yandex.mobile.ads.impl.nz1;
import com.yandex.mobile.ads.impl.pg1;
import com.yandex.mobile.ads.impl.t00;
import com.yandex.mobile.ads.impl.v5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class xz1<V extends ViewGroup>
implements t00<V>,
b1 {
    @Nullable
    private final v5 a;
    @NotNull
    private final a1 b;
    @NotNull
    private final e51 c;
    @NotNull
    private final nz1 d;
    @Nullable
    private h00 e;

    public xz1(@Nullable v5 v54, @NotNull a1 a14, @NotNull e51 e512, @NotNull nz1 nz12) {
        this.a = v54;
        this.b = a14;
        this.c = e512;
        this.d = nz12;
    }

    public final void a() {
        h00 h002 = this.e;
        if (h002 != null) {
            h002.d();
        }
    }

    public final void a(@NotNull V object) {
        View view = this.c.b(object);
        if (view != null) {
            this.b.a((b1)this);
            nz1 nz12 = this.d;
            object = this.a;
            object = object != null && (object = object.b()) != null ? Long.valueOf(object.a()) : null;
            long l10 = object != null ? (Long)object : 0L;
            object = new h00(view, nz12, l10, pg1.a());
            this.e = object;
            object.b();
            if (view.getTag() == null) {
                view.setTag((Object)"skip_button");
            }
        }
    }

    public final void b() {
        h00 h002 = this.e;
        if (h002 != null) {
            h002.c();
        }
    }

    public final void c() {
        this.b.b((b1)this);
        h00 h002 = this.e;
        if (h002 != null) {
            h002.a();
        }
    }
}


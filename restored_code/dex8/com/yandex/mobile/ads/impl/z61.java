/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.a71
 *  com.yandex.mobile.ads.impl.ar1
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.d71
 *  com.yandex.mobile.ads.impl.sp1$c
 *  com.yandex.mobile.ads.impl.tp1
 *  com.yandex.mobile.ads.impl.x2
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.a71;
import com.yandex.mobile.ads.impl.aa1;
import com.yandex.mobile.ads.impl.ar1;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.d71;
import com.yandex.mobile.ads.impl.oj;
import com.yandex.mobile.ads.impl.sp1;
import com.yandex.mobile.ads.impl.tp1;
import com.yandex.mobile.ads.impl.x2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class z61
extends oj<a71> {
    @NotNull
    private final d71 c;

    public /* synthetic */ z61() {
        this(new aa1(), new d71());
    }

    public z61(@NotNull aa1 aa12, @NotNull d71 d712) {
        super(aa12);
        this.c = d712;
    }

    @Override
    @NotNull
    protected final tp1 a(int n10, @NotNull x2 x22, @Nullable ar1 object) {
        tp1 tp12 = super.a(n10, x22, (ar1)object);
        x22 = null;
        object = object != null ? (b8)object.a : null;
        if (204 == n10) {
            x22 = sp1.c.e;
        } else if (object != null && n10 == 200) {
            this.c.getClass();
            a71 a712 = (a71)object.J();
            if (a712 != null) {
                x22 = (sp1.c)a712.f().get("status");
            } else if (object.D() == null) {
                x22 = sp1.c.d;
            }
        } else {
            x22 = sp1.c.d;
        }
        if (x22 != null) {
            tp12.b((Object)x22.a(), "status");
        }
        return tp12;
    }

    @Override
    @NotNull
    protected final tp1 a(@NotNull x2 object) {
        tp1 tp12 = super.a((x2)object);
        tp12.b((Object)object.t(), "image_loading_automatically");
        object = object.l();
        if (object.isEmpty() ^ true) {
            tp12.b(object, "image_sizes");
        }
        return tp12;
    }
}


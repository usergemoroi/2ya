/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.a71
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.j81
 *  com.yandex.mobile.ads.impl.kz0
 *  com.yandex.mobile.ads.impl.mr1
 *  com.yandex.mobile.ads.impl.sp1$a
 *  com.yandex.mobile.ads.impl.tp1
 *  com.yandex.mobile.ads.impl.up1
 *  com.yandex.mobile.ads.impl.vz0
 *  com.yandex.mobile.ads.impl.x2
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.a71;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.j81;
import com.yandex.mobile.ads.impl.kz0;
import com.yandex.mobile.ads.impl.mr1;
import com.yandex.mobile.ads.impl.sp1;
import com.yandex.mobile.ads.impl.tp1;
import com.yandex.mobile.ads.impl.up1;
import com.yandex.mobile.ads.impl.vz0;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.x71;
import java.util.LinkedHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class f71
implements mr1 {
    @NotNull
    private final x2 a;
    @NotNull
    private final j81 b;
    @NotNull
    private final vz0 c;
    @Nullable
    private b8<a71> d;

    public /* synthetic */ f71(x2 x22) {
        this(x22, new x71(), new vz0());
    }

    public f71(@NotNull x2 x22, @NotNull j81 j812, @NotNull vz0 vz02) {
        this.a = x22;
        this.b = j812;
        this.c = vz02;
    }

    @NotNull
    public final tp1 a() {
        tp1 tp12 = new tp1(null, 3);
        b8<a71> b82 = this.d;
        tp1 tp13 = tp12;
        if (b82 != null) {
            j81 j812 = this.b;
            tp13 = (a71)b82.J();
            tp12 = up1.a((tp1)tp12, (tp1)j812.a(b82, this.a, (a71)tp13));
            tp13 = this.a.h();
            this.c.getClass();
            if (tp13 != null) {
                tp13 = vz0.a((kz0)tp13);
            } else {
                tp13 = new tp1(new LinkedHashMap(), 2);
                tp13.b((Object)sp1.a.a, "adapter");
            }
            tp13 = up1.a((tp1)tp12, (tp1)tp13);
        }
        return tp13;
    }

    public final void a(@Nullable b8<a71> b82) {
        this.d = b82;
    }
}


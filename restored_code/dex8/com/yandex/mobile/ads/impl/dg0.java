/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.kq
 *  com.yandex.mobile.ads.impl.kz0
 *  com.yandex.mobile.ads.impl.mr1
 *  com.yandex.mobile.ads.impl.sp1$a
 *  com.yandex.mobile.ads.impl.tp1
 *  com.yandex.mobile.ads.impl.up1
 *  com.yandex.mobile.ads.impl.vz0
 *  com.yandex.mobile.ads.impl.x2
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.kq;
import com.yandex.mobile.ads.impl.kz0;
import com.yandex.mobile.ads.impl.mr1;
import com.yandex.mobile.ads.impl.sp1;
import com.yandex.mobile.ads.impl.tp1;
import com.yandex.mobile.ads.impl.up1;
import com.yandex.mobile.ads.impl.vz0;
import com.yandex.mobile.ads.impl.x2;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class dg0
implements mr1 {
    @NotNull
    private final kq a;
    @NotNull
    private final vz0 b;
    @Nullable
    private b8<String> c;
    @Nullable
    private x2 d;

    public /* synthetic */ dg0() {
        this(new kq(), new vz0());
    }

    @JvmOverloads
    public dg0(@NotNull kq kq3, @NotNull vz0 vz02) {
        this.a = kq3;
        this.b = vz02;
    }

    @NotNull
    public final tp1 a() {
        tp1 tp12 = new tp1(new HashMap(), 2);
        b8<String> b82 = this.c;
        x2 x22 = this.d;
        tp1 tp13 = tp12;
        if (b82 != null) {
            tp13 = tp12;
            if (x22 != null) {
                tp12 = up1.a((tp1)tp12, (tp1)this.a.a(b82, x22));
                tp13 = x22.h();
                this.b.getClass();
                if (tp13 != null) {
                    tp13 = vz0.a((kz0)tp13);
                } else {
                    tp13 = new tp1(new LinkedHashMap(), 2);
                    tp13.b((Object)sp1.a.a, "adapter");
                }
                tp13 = up1.a((tp1)tp12, (tp1)tp13);
                tp13.b((Object)b82.N().a().a(), "size_type");
                tp13.b((Object)b82.N().getWidth(), "width");
                tp13.b((Object)b82.N().getHeight(), "height");
            }
        }
        return tp13;
    }

    public final void a(@NotNull b8<String> b82) {
        this.c = b82;
    }

    public final void a(@NotNull x2 x22) {
        this.d = x22;
    }
}


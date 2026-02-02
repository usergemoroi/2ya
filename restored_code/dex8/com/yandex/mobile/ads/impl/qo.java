/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.aa2
 *  com.yandex.mobile.ads.impl.b
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.bd
 *  com.yandex.mobile.ads.impl.c51
 *  com.yandex.mobile.ads.impl.gd
 *  com.yandex.mobile.ads.impl.kq
 *  com.yandex.mobile.ads.impl.sp1
 *  com.yandex.mobile.ads.impl.sp1$a
 *  com.yandex.mobile.ads.impl.sp1$b
 *  com.yandex.mobile.ads.impl.tp1
 *  com.yandex.mobile.ads.impl.up1
 *  com.yandex.mobile.ads.impl.x2
 *  com.yandex.mobile.ads.impl.xp1
 *  com.yandex.mobile.ads.impl.zd
 *  kotlin.collections.s0
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.aa2;
import com.yandex.mobile.ads.impl.b;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.bd;
import com.yandex.mobile.ads.impl.c51;
import com.yandex.mobile.ads.impl.co2;
import com.yandex.mobile.ads.impl.gd;
import com.yandex.mobile.ads.impl.kq;
import com.yandex.mobile.ads.impl.sp1;
import com.yandex.mobile.ads.impl.tp1;
import com.yandex.mobile.ads.impl.up1;
import com.yandex.mobile.ads.impl.wp1;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.xp1;
import com.yandex.mobile.ads.impl.zd;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.s0;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class qo
implements xp1 {
    @NotNull
    private final b8<?> a;
    @NotNull
    private final x2 b;
    @Nullable
    private final c51 c;
    @NotNull
    private final wp1 d;
    @NotNull
    private final kq e;
    @NotNull
    private final bd f;

    public /* synthetic */ qo(Context context, b8 b82, x2 x22, c51 c512) {
        x22.p().f();
        this(b82, x22, c512, gd.a((Context)context, (aa2)co2.a, (zd)x22.p().b()), new kq(), new bd(context));
    }

    @JvmOverloads
    public qo(@NotNull b8 b82, @NotNull x2 x22, @Nullable c51 c512, @NotNull wp1 wp12, @NotNull kq kq3, @NotNull bd bd3) {
        this.a = b82;
        this.b = x22;
        this.c = c512;
        this.d = wp12;
        this.e = kq3;
        this.f = bd3;
    }

    private final sp1 b(sp1.b b10, Map<String, ? extends Object> tp12) {
        tp12 = new tp1(tp12, 2);
        tp12.b((Object)sp1.a.a, "adapter");
        tp12 = up1.a((tp1)tp12, (tp1)this.e.a(this.a, this.b));
        Object object = this.b.q();
        if (object != null) {
            tp12.b((Object)object.a().a(), "size_type");
            tp12.b((Object)object.getWidth(), "width");
            tp12.b((Object)object.getHeight(), "height");
        }
        if ((object = this.c) != null) {
            tp12.a(object.a());
        }
        object = tp12.b();
        tp12 = tp12.a();
        return new sp1(b10.a(), s0.C((Map)object), (b)tp12);
    }

    public final void a(@NotNull sp1.b b10) {
        b10 = this.b(b10, new HashMap());
        this.d.a((sp1)b10);
    }

    public final void a(@NotNull sp1.b b10, @NotNull Map<String, Object> sp12) {
        sp12 = this.b(b10, (Map<String, ? extends Object>)sp12);
        this.d.a(sp12);
        this.f.a(b10, sp12.b(), sp1.a.a, null);
    }
}


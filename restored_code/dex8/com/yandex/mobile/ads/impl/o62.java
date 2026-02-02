/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.ar1
 *  com.yandex.mobile.ads.impl.bd
 *  com.yandex.mobile.ads.impl.c8
 *  com.yandex.mobile.ads.impl.dj2
 *  com.yandex.mobile.ads.impl.gh0
 *  com.yandex.mobile.ads.impl.hf0
 *  com.yandex.mobile.ads.impl.iq1
 *  com.yandex.mobile.ads.impl.lh0
 *  com.yandex.mobile.ads.impl.pq1
 *  com.yandex.mobile.ads.impl.pw1
 *  com.yandex.mobile.ads.impl.pw1$a
 *  com.yandex.mobile.ads.impl.r7
 *  com.yandex.mobile.ads.impl.sp1
 *  com.yandex.mobile.ads.impl.sp1$b
 *  com.yandex.mobile.ads.impl.tp1
 *  com.yandex.mobile.ads.impl.uc1
 *  com.yandex.mobile.ads.impl.x2
 *  kotlin.collections.s0
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ak;
import com.yandex.mobile.ads.impl.ar1;
import com.yandex.mobile.ads.impl.bd;
import com.yandex.mobile.ads.impl.c8;
import com.yandex.mobile.ads.impl.dj2;
import com.yandex.mobile.ads.impl.gh0;
import com.yandex.mobile.ads.impl.hf0;
import com.yandex.mobile.ads.impl.iq1;
import com.yandex.mobile.ads.impl.lh0;
import com.yandex.mobile.ads.impl.pq1;
import com.yandex.mobile.ads.impl.pw1;
import com.yandex.mobile.ads.impl.r7;
import com.yandex.mobile.ads.impl.sp1;
import com.yandex.mobile.ads.impl.tp1;
import com.yandex.mobile.ads.impl.uc1;
import com.yandex.mobile.ads.impl.wp1;
import com.yandex.mobile.ads.impl.x2;
import java.util.Map;
import kotlin.collections.s0;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class o62<R, T>
extends ak<T> {
    @NotNull
    private final bd A;
    @NotNull
    private final r7 B;
    @NotNull
    private final x2 w;
    private final R x;
    @NotNull
    private final pq1<R, T> y;
    @NotNull
    private final wp1 z;

    public /* synthetic */ o62(Context context, x2 x22, int n10, String string2, ak.a a12, Object object, pq1 pq12, iq1 iq12, int n12) {
        if ((n12 & 0x80) != 0) {
            iq12 = null;
        }
        this(context, x22, n10, string2, a12, object, pq12, iq12, x22.p().c(), new bd(context), new r7());
    }

    public o62(@NotNull Context context, @NotNull x2 x22, int n10, @NotNull String string2, @NotNull ak.a<T> a12, R r12, @NotNull pq1<R, T> pq12, @Nullable iq1 iq12, @NotNull wp1 wp12, @NotNull bd bd2, @NotNull r7 r72) {
        super(context, n10, string2, a12, iq12);
        this.w = x22;
        this.x = r12;
        this.y = pq12;
        this.z = wp12;
        this.A = bd2;
        this.B = r72;
        this.a(context);
        this.r();
        this.s();
        this.x();
    }

    @Override
    private final void a(Context context) {
        int n10 = pw1.l;
        Object object = pw1.a.a().a(context);
        n10 = object != null && (object = object.X()) != null ? (Integer)object : lh0.a();
        this.a(this.B.a(context, n10));
    }

    private final void x() {
        sp1 sp12 = this.y.a(this.x);
        this.z.a(sp12);
        String string2 = sp12.c();
        sp1.b b10 = sp1.b.k;
        if (kotlin.jvm.internal.y.e(string2, b10.a())) {
            this.A.a(b10, sp12.b(), null, null);
        }
    }

    @NotNull
    public final ar1<T> a(@NotNull uc1 object) {
        int n10 = object.a;
        ar1<T> ar12 = this.a((uc1)object, n10);
        sp1 sp12 = this.y.a(ar12, n10, this.x);
        tp1 tp12 = new tp1(sp12.b(), 2);
        tp12.a((Object)hf0.c((Map)object.c, (gh0)gh0.x), "server_log_id");
        object = object.c;
        if (object != null) {
            tp12.a(c8.a((Map)object));
        }
        this.z.a(sp12);
        return ar12;
    }

    @NotNull
    protected abstract ar1<T> a(@NotNull uc1 var1, int var2);

    @Override
    @NotNull
    public dj2 b(@NotNull dj2 dj22) {
        uc1 uc12 = dj22.b;
        int n10 = uc12 != null ? uc12.a : -1;
        uc12 = this.y.a(null, n10, this.x);
        this.z.a((sp1)uc12);
        return dj22;
    }

    @NotNull
    public Map<String, String> e() {
        Map map2 = s0.d();
        map2.putAll(this.w.j().d());
        return s0.c((Map)map2);
    }
}


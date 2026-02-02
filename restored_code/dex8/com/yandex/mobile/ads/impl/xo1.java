/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.ap1
 *  com.yandex.mobile.ads.impl.b4
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.f9
 *  com.yandex.mobile.ads.impl.g7
 *  com.yandex.mobile.ads.impl.gp1
 *  com.yandex.mobile.ads.impl.t91
 *  com.yandex.mobile.ads.impl.uo1
 *  com.yandex.mobile.ads.impl.uo1$b
 *  com.yandex.mobile.ads.impl.wo1
 *  com.yandex.mobile.ads.impl.x2
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ap1;
import com.yandex.mobile.ads.impl.b4;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.f9;
import com.yandex.mobile.ads.impl.g7;
import com.yandex.mobile.ads.impl.gp1;
import com.yandex.mobile.ads.impl.t91;
import com.yandex.mobile.ads.impl.uo1;
import com.yandex.mobile.ads.impl.wo1;
import com.yandex.mobile.ads.impl.x2;
import java.util.List;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class xo1
implements uo1.b {
    @NotNull
    private final b4 a;
    @NotNull
    private final gp1 b;
    @Nullable
    private final ap1 c;
    @NotNull
    private final wo1 d;
    @NotNull
    private final uo1 e;
    private boolean f;

    public /* synthetic */ xo1(Context context, g7 g74, b8 b82, x2 x22, f9 f94, b4 b44, gp1 gp12, ap1 ap12, List list) {
        this(g74, b44, gp12, ap12, new wo1(context, b82, x22, f94, list));
    }

    @JvmOverloads
    public xo1(@NotNull g7 g74, @NotNull b4 b44, @NotNull gp1 gp12, @Nullable ap1 ap12, @NotNull wo1 wo12) {
        this.a = b44;
        this.b = gp12;
        this.c = ap12;
        this.d = wo12;
        this.e = new uo1(g74, (uo1.b)this);
    }

    public final void a() {
        ap1 ap12 = this.c;
        if (ap12 != null) {
            ap12.a();
        }
        this.d.a();
        this.a.b();
        this.b.f();
    }

    public final void a(@NotNull t91 t912) {
        this.d.a(t912);
    }

    public final void b() {
        if (!this.f) {
            this.f = true;
            this.e.a();
        }
    }

    public final void c() {
        this.f = false;
        this.e.b();
    }
}


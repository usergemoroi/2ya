/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.f3
 *  com.yandex.mobile.ads.impl.gk2
 *  com.yandex.mobile.ads.impl.jo
 *  com.yandex.mobile.ads.impl.kg0
 *  com.yandex.mobile.ads.impl.m21
 *  com.yandex.mobile.ads.impl.og0
 *  com.yandex.mobile.ads.impl.ou1
 *  com.yandex.mobile.ads.impl.pw1
 *  com.yandex.mobile.ads.impl.pw1$a
 *  kotlin.collections.s0
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bf2;
import com.yandex.mobile.ads.impl.f3;
import com.yandex.mobile.ads.impl.gk2;
import com.yandex.mobile.ads.impl.jo;
import com.yandex.mobile.ads.impl.kg0;
import com.yandex.mobile.ads.impl.m21;
import com.yandex.mobile.ads.impl.o21;
import com.yandex.mobile.ads.impl.og0;
import com.yandex.mobile.ads.impl.ou1;
import com.yandex.mobile.ads.impl.pw1;
import com.yandex.mobile.ads.impl.r21;
import com.yandex.mobile.ads.impl.wj;
import com.yandex.mobile.ads.impl.x21;
import com.yandex.mobile.ads.impl.zf1;
import java.util.Map;
import kotlin.collections.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class b31
implements og0 {
    @NotNull
    private final x21 a;
    @NotNull
    private final o21 b;
    @NotNull
    private final bf2 c;
    @NotNull
    private final gk2 d;
    @NotNull
    private final m21 e;
    @NotNull
    private final kg0 f;
    @Nullable
    private final ou1 g;
    @Nullable
    private jo h;
    private boolean i;

    public /* synthetic */ b31(x21 x212, o21 o212) {
        bf2 bf22 = new bf2();
        gk2 gk22 = new gk2((zf1)x212);
        m21 m212 = new m21();
        kg0 kg02 = new kg0();
        int n10 = pw1.l;
        this(x212, o212, bf22, gk22, m212, kg02, pw1.a.a().a(x212.i()));
    }

    public b31(@NotNull x21 x212, @NotNull o21 o212, @NotNull bf2 bf22, @NotNull gk2 gk22, @NotNull m21 m212, @NotNull kg0 kg02, @Nullable ou1 ou12) {
        this.a = x212;
        this.b = o212;
        this.c = bf22;
        this.d = gk22;
        this.e = m212;
        this.f = kg02;
        this.g = ou12;
    }

    public final void a() {
        this.i = true;
    }

    public final void a(@NotNull f3 f33) {
    }

    public final void a(@Nullable jo jo3) {
        this.h = jo3;
    }

    public final void a(@NotNull zf1 zf12, @NotNull Map map2) {
    }

    public final void a(@NotNull String string2) {
        ou1 ou12 = this.g;
        if (ou12 == null || !ou12.Y() || this.i) {
            ou12 = this.h;
            if (ou12 != null) {
                ou12.a(this.a, string2);
            }
            this.i = false;
        }
    }

    public final void a(boolean bl2) {
    }

    public final void b() {
        this.d.a(s0.j());
    }

    public final void b(@NotNull String string2) {
        this.e.getClass();
        boolean bl2 = m21.a((String)string2);
        this.f.getClass();
        Object object = bl2 ? new r21() : new wj();
        x21 x212 = this.a;
        bf2 bf22 = this.c;
        o21 o212 = this.b;
        object.a(x212, this, bf22, o212, o212, o212).a(string2);
    }
}


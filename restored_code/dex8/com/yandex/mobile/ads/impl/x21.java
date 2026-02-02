/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.jk2
 *  com.yandex.mobile.ads.impl.jo
 *  com.yandex.mobile.ads.impl.ou0
 *  com.yandex.mobile.ads.impl.ou0$a
 *  com.yandex.mobile.ads.impl.x21$a
 */
package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import com.yandex.mobile.ads.impl.b31;
import com.yandex.mobile.ads.impl.jk2;
import com.yandex.mobile.ads.impl.jo;
import com.yandex.mobile.ads.impl.o21;
import com.yandex.mobile.ads.impl.ou0;
import com.yandex.mobile.ads.impl.pm1;
import com.yandex.mobile.ads.impl.ty1;
import com.yandex.mobile.ads.impl.x21;
import com.yandex.mobile.ads.impl.zf1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressLint(value={"ViewConstructor"})
public final class x21
extends zf1 {
    @NotNull
    private final o21 k;
    @NotNull
    private jk2 l;
    @NotNull
    private final b31 m;
    @NotNull
    private ou0 n;

    public x21(@NotNull Context object) {
        super((Context)object);
        object = new o21();
        this.k = object;
        this.l = jk2.c.a;
        this.m = new b31(this, (o21)object);
        this.n = new ty1();
    }

    @Override
    public final void a() {
        super.a();
        jk2 jk22 = this.l;
        jk22 = jk22 instanceof jk2.b ? (jk2.b)jk22 : null;
        if (jk22 != null) {
            if ((jk22 = jk22.a()) != null) {
                jk22.b();
            }
            this.l = jk2.a.a;
        }
    }

    @Override
    public final void a(int n10) {
        super.a(n10);
        jk2 jk22 = this.l;
        jk22 = jk22 instanceof jk2.b ? (jk2.b)jk22 : null;
        if (jk22 != null) {
            if ((jk22 = jk22.a()) != null) {
                jk22.a();
            }
            this.stopLoading();
            this.l = jk2.c.a;
        }
    }

    public final void a(@NotNull String string2, @Nullable a a14) {
        if (this.l instanceof jk2.c) {
            this.l = new jk2.b(a14);
            this.m.b(string2);
        }
    }

    @Override
    public final void h() {
        this.m.b();
    }

    @NotNull
    public final o21 k() {
        return this.k;
    }

    protected final void onMeasure(int n10, int n13) {
        ou0.a a14 = this.n.a(n10, n13);
        super.onMeasure(a14.a, a14.b);
    }

    public final void setAspectRatio(float f11) {
        this.n = new pm1(f11);
    }

    public final void setClickListener(@NotNull jo jo3) {
        this.m.a(jo3);
    }

    public final void setPreloadingState(@NotNull jk2 jk22) {
        this.l = jk22;
    }
}


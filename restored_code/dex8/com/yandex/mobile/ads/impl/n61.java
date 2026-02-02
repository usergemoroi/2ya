/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.au
 *  com.yandex.mobile.ads.impl.gv1
 *  com.yandex.mobile.ads.impl.i61
 *  com.yandex.mobile.ads.impl.is
 *  com.yandex.mobile.ads.impl.k61
 *  com.yandex.mobile.ads.impl.lt
 *  com.yandex.mobile.ads.impl.m61
 *  com.yandex.mobile.ads.impl.o61
 *  com.yandex.mobile.ads.impl.p4
 *  com.yandex.mobile.ads.impl.rt
 *  com.yandex.mobile.ads.impl.s61
 *  com.yandex.mobile.ads.impl.x2
 *  com.yandex.mobile.ads.impl.x61
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.au;
import com.yandex.mobile.ads.impl.gv1;
import com.yandex.mobile.ads.impl.i61;
import com.yandex.mobile.ads.impl.is;
import com.yandex.mobile.ads.impl.j61;
import com.yandex.mobile.ads.impl.k61;
import com.yandex.mobile.ads.impl.lj;
import com.yandex.mobile.ads.impl.lt;
import com.yandex.mobile.ads.impl.m61;
import com.yandex.mobile.ads.impl.o61;
import com.yandex.mobile.ads.impl.p4;
import com.yandex.mobile.ads.impl.rt;
import com.yandex.mobile.ads.impl.s61;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.x61;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class n61
implements m61 {
    @NotNull
    private final o61 a;
    @NotNull
    private final j61 b;

    public /* synthetic */ n61(Context context, gv1 gv12, x61 x612, o61 o612, is is3, int n10) {
        p4 p42 = new p4();
        if ((n10 & 0x20) != 0) {
            is3 = is.g;
        }
        this(context, gv12, x612, o612, p42, new x2(is3, gv12), new i61(), new k61());
    }

    @JvmOverloads
    public n61(@NotNull Context object, @NotNull gv1 gv12, @NotNull x61 x612, @NotNull o61 o612, @NotNull p4 p42, @NotNull x2 x22, @NotNull i61 i612, @NotNull k61 k612) {
        this.a = o612;
        i612.getClass();
        o612 = i61.a((Context)object, (x2)x22, (p4)p42, (m61)this);
        k612.getClass();
        object = k61.a((Context)object, (gv1)gv12, (x61)x612, (x2)x22, (s61)o612, (p4)p42);
        this.b = object;
        o612.a(((lj)object).e());
    }

    public final void a() {
        this.a.a(this);
    }

    public final void a(@Nullable au au3) {
        this.b.a(au3);
    }

    public final void a(@Nullable lt lt3) {
        this.b.a(lt3);
    }

    public final void a(@Nullable rt rt2) {
        this.b.a(rt2);
    }

    public final void b() {
        this.b.x();
    }

    public final void c() {
        this.b.y();
    }
}


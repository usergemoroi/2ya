/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.bu1
 *  com.yandex.mobile.ads.impl.f3
 *  com.yandex.mobile.ads.impl.gu1
 *  com.yandex.mobile.ads.impl.gv1
 *  com.yandex.mobile.ads.impl.ni
 *  com.yandex.mobile.ads.impl.o4
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.ov1
 *  com.yandex.mobile.ads.impl.pv1
 *  com.yandex.mobile.ads.impl.ra
 *  kotlin.collections.t
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.bu1;
import com.yandex.mobile.ads.impl.du1;
import com.yandex.mobile.ads.impl.f3;
import com.yandex.mobile.ads.impl.gu1;
import com.yandex.mobile.ads.impl.gv1;
import com.yandex.mobile.ads.impl.ji;
import com.yandex.mobile.ads.impl.ni;
import com.yandex.mobile.ads.impl.o4;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.ov1;
import com.yandex.mobile.ads.impl.pv1;
import com.yandex.mobile.ads.impl.ra;
import java.util.List;
import kotlin.collections.t;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class eu1
implements ni {
    @NotNull
    private final ji a;
    @NotNull
    private final ov1<gu1> b;
    @NotNull
    private final bu1 c;
    @Nullable
    private b8<String> d;

    @JvmOverloads
    public eu1(@NotNull ji ji3, @NotNull gv1 gv12, @NotNull ov1 ov12, @NotNull bu1 bu12) {
        this.a = ji3;
        this.b = ov12;
        this.c = bu12;
    }

    @NotNull
    public final List<ra> a() {
        return t.m();
    }

    public final void a(@NotNull Context context) {
        int n10 = op0.b;
        this.b.a();
        this.d = null;
    }

    public final void a(@NotNull Context context, @NotNull b8<String> b82) {
        this.d = b82;
        this.a.h().a(o4.c, null);
        this.c.a(context, b82, null);
        this.c.a(context, b82);
        a a13 = new a(this.a);
        this.b.a(context, b82, (pv1)a13);
    }

    @Nullable
    public final String getAdInfo() {
        Object object = this.d;
        object = object != null ? object.e() : null;
        return object;
    }

    public static final class a
    implements pv1<gu1> {
        @NotNull
        private final ji a;

        public a(@NotNull ji ji3) {
            this.a = ji3;
        }

        public static final /* synthetic */ ji a(a a13) {
            return a13.a;
        }

        public final void a(@NotNull f3 f33) {
            this.a.b(f33);
        }

        public final void a(Object object) {
            ((gu1)object).a(new du1(this));
        }
    }
}


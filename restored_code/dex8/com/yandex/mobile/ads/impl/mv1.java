/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.ek2
 *  com.yandex.mobile.ads.impl.f3
 *  com.yandex.mobile.ads.impl.gv1
 *  com.yandex.mobile.ads.impl.iz1
 *  com.yandex.mobile.ads.impl.kg0
 *  com.yandex.mobile.ads.impl.ld0
 *  com.yandex.mobile.ads.impl.lv1
 *  com.yandex.mobile.ads.impl.nv1
 *  com.yandex.mobile.ads.impl.pv1
 *  com.yandex.mobile.ads.impl.tr
 *  com.yandex.mobile.ads.impl.x2
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ad0;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.ed0;
import com.yandex.mobile.ads.impl.ek2;
import com.yandex.mobile.ads.impl.f3;
import com.yandex.mobile.ads.impl.g8;
import com.yandex.mobile.ads.impl.gv1;
import com.yandex.mobile.ads.impl.iz1;
import com.yandex.mobile.ads.impl.kg0;
import com.yandex.mobile.ads.impl.ld0;
import com.yandex.mobile.ads.impl.lv1;
import com.yandex.mobile.ads.impl.nv1;
import com.yandex.mobile.ads.impl.pv1;
import com.yandex.mobile.ads.impl.qc0;
import com.yandex.mobile.ads.impl.tr;
import com.yandex.mobile.ads.impl.x2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class mv1
implements nv1<lv1> {
    @NotNull
    private final Context a;
    @NotNull
    private final gv1 b;
    @NotNull
    private final x2 c;
    @Nullable
    private lv1 d;

    public mv1(@NotNull Context context, @NotNull gv1 gv12, @NotNull x2 x22) {
        this.a = context;
        this.b = gv12;
        this.c = x22;
    }

    public static final void a(mv1 mv12) {
        lv1 lv12 = mv12.d;
        if (lv12 != null) {
            lv12.a(null);
        }
        mv12.d = null;
    }

    public final void a() {
        lv1 lv12 = this.d;
        if (lv12 != null) {
            lv12.d();
        }
        if ((lv12 = this.d) != null) {
            lv12.a(null);
        }
        this.d = null;
    }

    public final void a(@NotNull b8<String> lv12, @NotNull iz1 iz12, @NotNull String string2, @NotNull pv1<lv1> pv12) throws ek2 {
        iz12 = this.a;
        gv1 gv12 = this.b;
        x2 x22 = this.c;
        g8 g84 = new g8();
        this.d = lv12 = new lv1((Context)iz12, x22, lv12, string2, g84, new ad0(iz12.getApplicationContext(), gv12, x22, (b8)lv12, g84), new ed0(iz12.getApplicationContext(), x22, (b8<String>)lv12, g84), new qc0(), new kg0(), new ld0(gv12));
        lv12.a((tr)new a(this, lv12, pv12));
        lv12.h();
    }

    private final class a
    implements tr {
        @NotNull
        private final lv1 a;
        @NotNull
        private final pv1<lv1> b;
        final mv1 c;

        public a(mv1 mv12, @NotNull lv1 lv12, @NotNull pv1<lv1> pv12) {
            this.c = mv12;
            this.a = lv12;
            this.b = pv12;
        }

        public final void a() {
            mv1.a(this.c);
            this.b.a((Object)this.a);
        }

        public final void a(@NotNull f3 f33) {
            mv1.a(this.c);
            this.b.a(f33);
        }
    }
}


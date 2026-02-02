/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  com.yandex.mobile.ads.impl.ay1
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.eb1
 *  com.yandex.mobile.ads.impl.ej0
 *  com.yandex.mobile.ads.impl.ff2
 *  com.yandex.mobile.ads.impl.gh2
 *  com.yandex.mobile.ads.impl.gv1
 *  com.yandex.mobile.ads.impl.h51
 *  com.yandex.mobile.ads.impl.if2
 *  com.yandex.mobile.ads.impl.jh2
 *  com.yandex.mobile.ads.impl.kc2
 *  com.yandex.mobile.ads.impl.ko
 *  com.yandex.mobile.ads.impl.ld2
 *  com.yandex.mobile.ads.impl.pb1
 *  com.yandex.mobile.ads.impl.qb2
 *  com.yandex.mobile.ads.impl.vb1
 *  com.yandex.mobile.ads.impl.vf
 *  com.yandex.mobile.ads.impl.wb2
 *  com.yandex.mobile.ads.impl.x2
 *  com.yandex.mobile.ads.impl.zg2
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.ah2;
import com.yandex.mobile.ads.impl.ay1;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.ck0;
import com.yandex.mobile.ads.impl.db1;
import com.yandex.mobile.ads.impl.eb1;
import com.yandex.mobile.ads.impl.ej0;
import com.yandex.mobile.ads.impl.ff2;
import com.yandex.mobile.ads.impl.gh2;
import com.yandex.mobile.ads.impl.gv1;
import com.yandex.mobile.ads.impl.h51;
import com.yandex.mobile.ads.impl.if2;
import com.yandex.mobile.ads.impl.jh2;
import com.yandex.mobile.ads.impl.kc2;
import com.yandex.mobile.ads.impl.ko;
import com.yandex.mobile.ads.impl.ld2;
import com.yandex.mobile.ads.impl.pb1;
import com.yandex.mobile.ads.impl.qb2;
import com.yandex.mobile.ads.impl.re2;
import com.yandex.mobile.ads.impl.u81;
import com.yandex.mobile.ads.impl.vb1;
import com.yandex.mobile.ads.impl.vf;
import com.yandex.mobile.ads.impl.wb2;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.yg2;
import com.yandex.mobile.ads.impl.zg2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ch2
extends gh2<vb1, wb2> {
    @NotNull
    private final b8<?> c;
    @NotNull
    private final ah2 d;
    @NotNull
    private final pb1 e;
    @NotNull
    private final zg2 f;
    @NotNull
    private final eb1 g;
    @Nullable
    private yg2 h;

    public ch2(@NotNull gv1 gv12, @NotNull vb1 vb12, @NotNull if2 if22, @NotNull x2 x22, @NotNull b8 b82, @NotNull ck0 ck02, @NotNull db1 db12, @NotNull u81 u812, @NotNull h51 h512, @NotNull ej0 ej02, @Nullable ay1 ay12, @NotNull ah2 ah22) {
        super((View)vb12);
        this.c = b82;
        this.d = ah22;
        this.e = new pb1(vb12.getContext(), this, if22, x22, b82, (ff2)ck02, db12, u812, ej02, ay12);
        this.f = new zg2((qb2)gv12.d());
        this.g = h512.a();
        ck02.a(ah22);
    }

    public final void a() {
        yg2 yg22 = this.h;
        if (yg22 != null) {
            yg22.k();
        }
        this.d.a(null);
    }

    public final void a(View view) {
        view = (vb1)view;
        this.e.a((vb1)view);
        view.setVisibility(8);
        view.setOnClickListener(null);
        view.setOnTouchListener(null);
        view.setSelected(false);
    }

    public final void a(vf vf3, jh2 jh22, Object object) {
        wb2 wb22 = (wb2)object;
        object = (vb1)this.b();
        if (object != null) {
            jh22.a((View)object, vf3);
            if (wb22 != null && this.h != null) {
                wb22 = wb22.b();
                jh22.a(vf3, (ko)new re2((vb1)object, wb22.b()));
                this.e.a((vb1)object, (kc2)wb22);
            }
        }
    }

    public final void b(View view, Object object) {
        yg2 yg22;
        view = (vb1)view;
        wb2 wb22 = (wb2)object;
        object = wb22.b();
        this.h = yg22 = this.f.a(view.getContext(), (kc2)object, ld2.e);
        this.d.a(yg22);
        this.g.a(view.getContext(), (kc2)object, this.c);
        this.e.a((vb1)view, wb22, yg22);
    }
}


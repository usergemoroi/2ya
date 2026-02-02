/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ProgressBar
 *  com.yandex.mobile.ads.impl.a1
 *  com.yandex.mobile.ads.impl.b1
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.bm1
 *  com.yandex.mobile.ads.impl.cp
 *  com.yandex.mobile.ads.impl.e51
 *  com.yandex.mobile.ads.impl.fp
 *  com.yandex.mobile.ads.impl.h52
 *  com.yandex.mobile.ads.impl.mp
 *  com.yandex.mobile.ads.impl.nr
 *  com.yandex.mobile.ads.impl.pw1
 *  com.yandex.mobile.ads.impl.pw1$a
 *  com.yandex.mobile.ads.impl.rd
 *  com.yandex.mobile.ads.impl.t00
 *  com.yandex.mobile.ads.impl.vv
 *  com.yandex.mobile.ads.impl.y00
 *  com.yandex.mobile.ads.impl.yo
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.yandex.mobile.ads.impl.a1;
import com.yandex.mobile.ads.impl.a50;
import com.yandex.mobile.ads.impl.b1;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.bm1;
import com.yandex.mobile.ads.impl.cp;
import com.yandex.mobile.ads.impl.dz;
import com.yandex.mobile.ads.impl.e51;
import com.yandex.mobile.ads.impl.fp;
import com.yandex.mobile.ads.impl.h52;
import com.yandex.mobile.ads.impl.mp;
import com.yandex.mobile.ads.impl.nr;
import com.yandex.mobile.ads.impl.pw1;
import com.yandex.mobile.ads.impl.rd;
import com.yandex.mobile.ads.impl.t00;
import com.yandex.mobile.ads.impl.ul1;
import com.yandex.mobile.ads.impl.vv;
import com.yandex.mobile.ads.impl.y00;
import com.yandex.mobile.ads.impl.yo;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class tp<V extends ViewGroup>
implements t00<V>,
b1 {
    @NotNull
    private final b8<?> a;
    @NotNull
    private final a1 b;
    @NotNull
    private final cp c;
    @NotNull
    private final nr d;
    @NotNull
    private final e51 e;
    @NotNull
    private final vv f;
    @NotNull
    private final h52 g;
    @Nullable
    private fp h;
    @NotNull
    private final bm1 i;
    @NotNull
    private final yo j;

    public tp(@NotNull b8<?> b82, @NotNull a1 a14, @NotNull cp cp2, @NotNull nr nr2, @NotNull e51 e512, @NotNull vv vv2, @NotNull h52 h522) {
        this.a = b82;
        this.b = a14;
        this.c = cp2;
        this.d = nr2;
        this.e = e512;
        this.f = vv2;
        this.g = h522;
        this.i = h522.e();
        this.j = h522.b();
    }

    private final void a(View object, ProgressBar progressBar) {
        Long l10 = this.a.t();
        long l11 = l10 != null ? l10 : 0L;
        object = progressBar != null ? new ul1((View)object, progressBar, new a50(), new mp(new rd()), this.f, this.i, l11) : (this.j.a() ? new dz((View)object, this.c, this.f, l11, this.g.c()) : null);
        this.h = object;
        if (object != null) {
            object.c();
        }
    }

    public final void a() {
        fp fp2 = this.h;
        if (fp2 != null) {
            fp2.a();
        }
    }

    public final void a(@NotNull V object) {
        View view = this.e.c(object);
        object = this.e.a(object);
        if (view != null) {
            this.b.a((b1)this);
            Context context = view.getContext();
            int n10 = pw1.l;
            context = pw1.a.a().a(context);
            boolean bl2 = false;
            n10 = context != null && context.C0() ? 1 : 0;
            boolean bl3 = bl2;
            if (y.e(y00.c.a(), this.a.v())) {
                bl3 = bl2;
                if (n10 != 0) {
                    bl3 = true;
                }
            }
            if (bl3 ^ true) {
                view.setOnClickListener((View.OnClickListener)new /* Unavailable Anonymous Inner Class!! */);
            }
            this.a(view, (ProgressBar)object);
            if (view.getTag() == null) {
                view.setTag((Object)"close");
            }
        }
    }

    public final void b() {
        fp fp2 = this.h;
        if (fp2 != null) {
            fp2.b();
        }
    }

    public final void c() {
        this.b.b((b1)this);
        fp fp2 = this.h;
        if (fp2 != null) {
            fp2.invalidate();
        }
    }
}


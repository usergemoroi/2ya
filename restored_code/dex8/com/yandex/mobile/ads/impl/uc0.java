/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.fp
 *  com.yandex.mobile.ads.impl.ur
 *  com.yandex.mobile.ads.impl.y7
 *  com.yandex.mobile.ads.impl.z7
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.fp;
import com.yandex.mobile.ads.impl.id0;
import com.yandex.mobile.ads.impl.ur;
import com.yandex.mobile.ads.impl.y7;
import com.yandex.mobile.ads.impl.z7;
import org.jetbrains.annotations.NotNull;

public final class uc0
implements ur {
    @NotNull
    private final fp a;

    public uc0(@NotNull fp fp2) {
        this.a = fp2;
    }

    @NotNull
    public final RelativeLayout a(@NotNull id0 id02, @NotNull b8 b82) {
        Context context = id02.getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        b82 = new RelativeLayout(context);
        b82.setBackgroundColor(0);
        b82.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        b82.addView((View)id02, (ViewGroup.LayoutParams)new RelativeLayout.LayoutParams(-1, -1));
        id02 = z7.a((Context)context, (id0)id02);
        b82.addView(this.a.d(), (ViewGroup.LayoutParams)id02);
        return b82;
    }

    public final void a() {
        this.a.a();
    }

    public final void a(@NotNull RelativeLayout relativeLayout) {
        relativeLayout.setBackground((Drawable)y7.b);
    }

    public final void a(boolean bl2) {
        this.a.a(bl2);
    }

    public final void b() {
        this.a.b();
    }

    public final void c() {
        this.a.c();
    }

    public final void d() {
        this.a.invalidate();
    }
}


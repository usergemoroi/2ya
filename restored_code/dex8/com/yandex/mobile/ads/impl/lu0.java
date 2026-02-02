/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup$MarginLayoutParams
 *  com.yandex.mobile.ads.impl.gi2
 *  com.yandex.mobile.ads.impl.ou0
 *  com.yandex.mobile.ads.impl.ou0$a
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.impl.gi2;
import com.yandex.mobile.ads.impl.ou0;
import org.jetbrains.annotations.NotNull;

public final class lu0
implements ou0 {
    @NotNull
    private final View a;
    private final float b;
    @NotNull
    private final Context c;
    @NotNull
    private final ou0.a d;

    public /* synthetic */ lu0(View view, float f11, Context context) {
        this(view, f11, context, new ou0.a());
    }

    public lu0(@NotNull View view, float f11, @NotNull Context context, @NotNull ou0.a a13) {
        this.a = view;
        this.b = f11;
        this.c = context;
        this.d = a13;
    }

    @NotNull
    public final ou0.a a(int n10, int n13) {
        int n14 = View.MeasureSpec.getMode((int)n13);
        int n15 = View.MeasureSpec.getSize((int)n13);
        int n16 = Math.round((float)gi2.c((Context)this.c) * this.b);
        Object object = this.a.getLayoutParams();
        object = object instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams)object : null;
        n13 = n16;
        if (object != null) {
            n13 = n16 - object.topMargin - object.bottomMargin;
        }
        n13 = (int)Math.max(Math.min((double)n15, (double)n13), 0.0);
        object = this.d;
        object.a = n10;
        object.b = View.MeasureSpec.makeMeasureSpec((int)n13, (int)n14);
        return this.d;
    }
}


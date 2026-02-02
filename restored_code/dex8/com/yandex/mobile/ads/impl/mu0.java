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

public final class mu0
implements ou0 {
    @NotNull
    private final View a;
    private final float b;
    @NotNull
    private final Context c;
    @NotNull
    private final ou0.a d;

    public /* synthetic */ mu0(View view, float f11, Context context) {
        this(view, f11, context, new ou0.a());
    }

    public mu0(@NotNull View view, float f11, @NotNull Context context, @NotNull ou0.a a13) {
        this.a = view;
        this.b = f11;
        this.c = context;
        this.d = a13;
    }

    @NotNull
    public final ou0.a a(int n10, int n13) {
        int n14 = View.MeasureSpec.getMode((int)n10);
        int n15 = View.MeasureSpec.getSize((int)n10);
        Object object = this.c;
        n10 = gi2.b;
        int n16 = Math.round((float)object.getResources().getDisplayMetrics().widthPixels * this.b);
        object = this.a.getLayoutParams();
        object = object instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams)object : null;
        n10 = n16;
        if (object != null) {
            n10 = n16 - object.leftMargin - object.rightMargin;
        }
        n10 = (int)Math.max(Math.min((double)n15, (double)n10), 0.0);
        this.d.a = View.MeasureSpec.makeMeasureSpec((int)n10, (int)n14);
        object = this.d;
        object.b = n13;
        return object;
    }
}


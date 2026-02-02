/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ArgbEvaluator
 *  android.animation.TypeEvaluator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.view.View
 *  android.widget.TextView
 *  androidx.annotation.ColorInt
 *  com.yandex.mobile.ads.impl.sd
 */
package com.yandex.mobile.ads.impl;

import android.animation.ArgbEvaluator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import com.yandex.mobile.ads.impl.sd;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class r42<T extends TextView>
implements sd<T> {
    private final int a;
    @NotNull
    private final ArgbEvaluator b;
    @Nullable
    private ValueAnimator c;

    public /* synthetic */ r42(int n10) {
        this(n10, new ArgbEvaluator());
    }

    @JvmOverloads
    public r42(@ColorInt int n10, @NotNull ArgbEvaluator argbEvaluator) {
        this.a = n10;
        this.b = argbEvaluator;
    }

    public final void a(View view) {
        TextView textView = (TextView)view;
        int n10 = textView.getCurrentTextColor();
        view = ValueAnimator.ofObject((TypeEvaluator)this.b, (Object[])new Object[]{n10, this.a});
        this.c = view;
        textView = new /* Unavailable Anonymous Inner Class!! */;
        if (view != null) {
            view.addUpdateListener((ValueAnimator.AnimatorUpdateListener)textView);
        }
        if ((view = this.c) != null) {
            view.setDuration((long)500);
        }
        view = this.c;
        if (view != null) {
            view.start();
        }
    }

    public final void cancel() {
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
        if ((valueAnimator = this.c) != null) {
            valueAnimator.cancel();
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.widget.RatingBar
 *  androidx.annotation.AttrRes
 *  com.yandex.mobile.ads.impl.qn1
 */
package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RatingBar;
import androidx.annotation.AttrRes;
import com.yandex.mobile.ads.impl.qn1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class tn1
extends RatingBar
implements qn1 {
    public tn1(@NotNull Context context) {
        super(context);
    }

    public tn1(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public tn1(@NotNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int n10) {
        super(context, attributeSet, n10);
    }

    public final float getRating() {
        return super.getRating();
    }

    @SuppressLint(value={"ClickableViewAccessibility"})
    public final boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        boolean bl2 = this.isClickable() && motionEvent.getAction() == 0;
        return bl2;
    }

    public void setRating(float f11) {
        super.setRating(f11);
    }
}


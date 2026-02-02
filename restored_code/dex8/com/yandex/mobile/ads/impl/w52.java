/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.PointF
 *  android.view.GestureDetector
 *  android.view.GestureDetector$OnGestureListener
 *  android.view.GestureDetector$SimpleOnGestureListener
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
 *  androidx.annotation.BinderThread
 *  com.yandex.mobile.ads.impl.nf1$a
 *  com.yandex.mobile.ads.impl.w52$a
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.BinderThread;
import com.yandex.mobile.ads.impl.nf1;
import com.yandex.mobile.ads.impl.s12;
import com.yandex.mobile.ads.impl.w52;

final class w52
extends GestureDetector.SimpleOnGestureListener
implements View.OnTouchListener,
nf1.a {
    private final PointF a = new PointF();
    private final PointF b = new PointF();
    private final a c;
    private final float d;
    private final GestureDetector e;
    private volatile float f;

    public w52(Context context, a a14) {
        this.c = a14;
        this.d = 25.0f;
        this.e = new GestureDetector(context, (GestureDetector.OnGestureListener)this);
        this.f = (float)Math.PI;
    }

    @BinderThread
    public final void a(float[] fArray, float f11) {
        this.f = -f11;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        this.a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f11, float f12) {
        f11 = (motionEvent2.getX() - this.a.x) / this.d;
        f12 = motionEvent2.getY();
        motionEvent = this.a;
        f12 = (f12 - motionEvent.y) / this.d;
        motionEvent.set(motionEvent2.getX(), motionEvent2.getY());
        double d14 = this.f;
        float f13 = (float)Math.cos(d14);
        float f14 = (float)Math.sin(d14);
        motionEvent = this.b;
        motionEvent.x -= f13 * f11 - f14 * f12;
        motionEvent.y = f11 = f13 * f12 + f14 * f11 + motionEvent.y;
        motionEvent.y = Math.max(-45.0f, Math.min(45.0f, f11));
        motionEvent = this.c;
        motionEvent2 = this.b;
        ((s12.a)motionEvent).a((PointF)motionEvent2);
        return true;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return ((s12.a)this.c).a(motionEvent);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.e.onTouchEvent(motionEvent);
    }
}


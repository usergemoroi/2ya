/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.GestureDetector
 *  android.view.GestureDetector$OnGestureListener
 *  android.view.GestureDetector$SimpleOnGestureListener
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
 *  androidx.appcompat.widget.AppCompatImageView
 */
package io.intercom.android.sdk.lightbox;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import io.intercom.android.sdk.lightbox.LightBoxListener;

public class LightBoxImageView
extends AppCompatImageView {
    GestureDetector gestureDetector;
    LightBoxListener lightBoxListener;

    public LightBoxImageView(Context context) {
        super(context);
        this.init();
    }

    public LightBoxImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.init();
    }

    private void init() {
        this.gestureDetector = new GestureDetector(this.getContext(), (GestureDetector.OnGestureListener)new GestureListener(this));
        this.setOnTouchListener(new View.OnTouchListener(this){
            final LightBoxImageView this$0;
            {
                this.this$0 = lightBoxImageView;
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                return this.this$0.gestureDetector.onTouchEvent(motionEvent);
            }
        });
    }

    void setLightBoxListener(LightBoxListener lightBoxListener) {
        this.lightBoxListener = lightBoxListener;
    }

    private class GestureListener
    extends GestureDetector.SimpleOnGestureListener {
        final LightBoxImageView this$0;

        GestureListener(LightBoxImageView lightBoxImageView) {
            this.this$0 = lightBoxImageView;
        }

        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            LightBoxListener lightBoxListener = this.this$0.lightBoxListener;
            if (lightBoxListener != null) {
                lightBoxListener.closeLightBox();
            }
            return super.onSingleTapConfirmed(motionEvent);
        }
    }
}


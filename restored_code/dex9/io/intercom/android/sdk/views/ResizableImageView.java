/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Point
 *  android.util.AttributeSet
 *  androidx.appcompat.widget.AppCompatImageView
 *  io.intercom.android.sdk.utilities.ImageUtils
 *  io.intercom.android.sdk.utilities.commons.ScreenUtils
 */
package io.intercom.android.sdk.views;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import io.intercom.android.sdk.utilities.ImageUtils;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;

public class ResizableImageView
extends AppCompatImageView {
    private int imageHeight;
    private int imageWidth;
    private int totalViewPadding;

    public ResizableImageView(Context context) {
        this(context, null);
    }

    public ResizableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ResizableImageView(Context context, AttributeSet attributeSet, int n4) {
        super(context, attributeSet, n4);
    }

    private int calculateContainerWidth() {
        return ScreenUtils.getScreenDimensions((Context)this.getContext()).x;
    }

    public Point getImageDimens() {
        double d4 = ImageUtils.getAspectRatio((int)this.imageWidth, (int)this.imageHeight);
        int n4 = this.calculateContainerWidth();
        int n5 = this.totalViewPadding;
        n4 = Math.min(this.imageWidth, n4 - n5);
        return new Point(n4, ImageUtils.getAspectHeight((int)n4, (double)d4));
    }

    protected void onMeasure(int n4, int n5) {
        Point point = this.getImageDimens();
        if (this.imageWidth > 0 && this.imageHeight > 0) {
            this.setMeasuredDimension(point.x, point.y);
        } else {
            super.onMeasure(n4, n5);
        }
    }

    public void setDisplayImageDimensions(int n4, int n5) {
        this.imageHeight = n5;
        this.imageWidth = n4;
    }

    public void setTotalViewPadding(int n4) {
        this.totalViewPadding = n4;
    }
}


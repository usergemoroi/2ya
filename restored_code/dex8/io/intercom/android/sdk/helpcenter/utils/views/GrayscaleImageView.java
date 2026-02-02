/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.ColorFilter
 *  android.graphics.ColorMatrix
 *  android.graphics.ColorMatrixColorFilter
 *  android.util.AttributeSet
 *  androidx.appcompat.widget.AppCompatImageView
 */
package io.intercom.android.sdk.helpcenter.utils.views;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2={"Lio/intercom/android/sdk/helpcenter/utils/views/GrayscaleImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "percentage", "Lkotlin/k0;", "setGrayscale", "(I)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
public final class GrayscaleImageView
extends AppCompatImageView {
    public GrayscaleImageView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        y.j(context, "context");
        y.j(attributeSet, "attributeSet");
        super(context, attributeSet);
    }

    public final void setGrayscale(int n10) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(1.0f - (float)n10 / (float)100);
        this.setColorFilter((ColorFilter)new ColorMatrixColorFilter(colorMatrix));
    }
}


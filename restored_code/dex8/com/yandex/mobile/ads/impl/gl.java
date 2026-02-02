/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 *  com.yandex.mobile.ads.impl.el
 */
package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.yandex.mobile.ads.impl.el;
import kotlin.jvm.internal.y;

public final class gl
implements el<BitmapDrawable> {
    public final boolean a(Drawable drawable2, Bitmap bitmap) {
        return y.e(bitmap, ((BitmapDrawable)drawable2).getBitmap());
    }
}


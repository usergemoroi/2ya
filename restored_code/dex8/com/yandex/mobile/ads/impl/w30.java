/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 *  com.yandex.mobile.ads.impl.el
 *  com.yandex.mobile.ads.impl.hl
 *  com.yandex.mobile.ads.impl.qt1
 */
package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.yandex.mobile.ads.impl.el;
import com.yandex.mobile.ads.impl.hl;
import com.yandex.mobile.ads.impl.qt1;
import org.jetbrains.annotations.NotNull;

public final class w30
implements el<Drawable> {
    @NotNull
    private final qt1 a;
    @NotNull
    private final hl b;

    public w30(@NotNull qt1 qt12, @NotNull hl hl3) {
        this.a = qt12;
        this.b = hl3;
    }

    public final boolean a(@NotNull Drawable drawable2, @NotNull Bitmap bitmap) {
        BitmapDrawable bitmapDrawable;
        drawable2 = drawable2 instanceof BitmapDrawable && (bitmapDrawable = (BitmapDrawable)drawable2).getBitmap() != null ? bitmapDrawable.getBitmap() : this.a.a(drawable2);
        this.b.getClass();
        boolean bl2 = true;
        bitmapDrawable = Bitmap.createScaledBitmap((Bitmap)drawable2, (int)1, (int)1, (boolean)true);
        this.b.getClass();
        drawable2 = Bitmap.createScaledBitmap((Bitmap)bitmap, (int)1, (int)1, (boolean)true);
        bitmap = new /* Unavailable Anonymous Inner Class!! */;
        drawable2 = new /* Unavailable Anonymous Inner Class!! */;
        if (Math.abs(bitmap.a() - drawable2.a()) > 20 || Math.abs(bitmap.d() - drawable2.d()) > 20 || Math.abs(bitmap.c() - drawable2.c()) > 20 || Math.abs(bitmap.b() - drawable2.b()) > 20) {
            bl2 = false;
        }
        return bl2;
    }
}


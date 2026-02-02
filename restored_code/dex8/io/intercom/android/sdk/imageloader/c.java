/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.widget.ImageView
 *  kotlin.jvm.functions.l
 */
package io.intercom.android.sdk.imageloader;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import io.intercom.android.sdk.imageloader.WallpaperLoader;
import kotlin.jvm.functions.l;

public final class c
implements l {
    public final ImageView c;

    public /* synthetic */ c(ImageView imageView) {
        this.c = imageView;
    }

    public final Object invoke(Object object) {
        return WallpaperLoader.b(this.c, (Drawable)object);
    }
}


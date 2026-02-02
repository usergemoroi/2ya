/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Shader$TileMode
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 *  android.text.TextUtils
 *  android.widget.ImageView
 *  coil.request.i
 *  coil.request.i$a
 *  kotlin.jvm.functions.l
 */
package io.intercom.android.sdk.imageloader;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import coil.request.i;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.imageloader.a;
import io.intercom.android.sdk.imageloader.b;
import io.intercom.android.sdk.imageloader.c;
import io.intercom.android.sdk.utilities.BitmapUtilsKt;
import io.intercom.android.sdk.utilities.IntercomCoilKt;
import java.io.IOException;
import kotlin.jvm.functions.l;
import kotlin.k0;

public class WallpaperLoader {
    private final Provider<AppConfig> appConfigProvider;

    WallpaperLoader(Provider<AppConfig> provider) {
        this.appConfigProvider = provider;
    }

    public static /* synthetic */ k0 a(Drawable drawable2) {
        return WallpaperLoader.lambda$loadWallpaperInto$0(drawable2);
    }

    public static /* synthetic */ k0 b(ImageView imageView, Drawable drawable2) {
        return WallpaperLoader.lambda$loadWallpaperInto$2(imageView, drawable2);
    }

    public static /* synthetic */ k0 c(Drawable drawable2) {
        return WallpaperLoader.lambda$loadWallpaperInto$1(drawable2);
    }

    public static WallpaperLoader create(Context context, Provider<AppConfig> provider) {
        return new WallpaperLoader(provider);
    }

    private static /* synthetic */ k0 lambda$loadWallpaperInto$0(Drawable drawable2) {
        return k0.a;
    }

    private static /* synthetic */ k0 lambda$loadWallpaperInto$1(Drawable drawable2) {
        return k0.a;
    }

    private static /* synthetic */ k0 lambda$loadWallpaperInto$2(ImageView imageView, Drawable drawable2) {
        drawable2 = BitmapUtilsKt.drawableToBitmap(drawable2, 1, 1);
        drawable2.setDensity(160);
        drawable2 = new BitmapDrawable(imageView.getContext().getResources(), (Bitmap)drawable2);
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        drawable2.setTileModeXY(tileMode, tileMode);
        imageView.setBackground(drawable2);
        return k0.a;
    }

    public void close() throws IOException {
        IntercomCoilKt.cleanUp();
    }

    public void loadWallpaperInto(ImageView imageView) {
        String string2 = this.appConfigProvider.get().getWallpaper();
        if (TextUtils.isEmpty((CharSequence)string2)) {
            return;
        }
        string2 = new i.a(imageView.getContext()).d((Object)string2).D((l)new a(), (l)new b(), (l)new c(imageView)).a();
        IntercomCoilKt.loadIntercomImage(imageView.getContext(), (i)string2);
    }
}


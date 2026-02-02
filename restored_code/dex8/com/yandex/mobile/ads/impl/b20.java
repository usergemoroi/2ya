/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.net.Uri
 *  android.widget.ImageView
 *  com.yandex.div.core.images.BitmapSource
 *  com.yandex.div.core.images.CachedBitmap
 *  com.yandex.div.core.images.DivImageDownloadCallback
 *  com.yandex.div.core.images.DivImageLoader
 *  com.yandex.div.core.images.LoadReference
 *  com.yandex.mobile.ads.impl.aj0$c
 *  com.yandex.mobile.ads.impl.ct0
 *  com.yandex.mobile.ads.impl.dj2
 *  com.yandex.mobile.ads.impl.fd1
 *  com.yandex.mobile.ads.impl.qq2
 *  com.yandex.mobile.ads.impl.rq2
 *  com.yandex.mobile.ads.impl.tq2
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;
import com.yandex.div.core.images.BitmapSource;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageDownloadCallback;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;
import com.yandex.mobile.ads.impl.aj0;
import com.yandex.mobile.ads.impl.ct0;
import com.yandex.mobile.ads.impl.dj2;
import com.yandex.mobile.ads.impl.fd1;
import com.yandex.mobile.ads.impl.lz1;
import com.yandex.mobile.ads.impl.qq2;
import com.yandex.mobile.ads.impl.rq2;
import com.yandex.mobile.ads.impl.sq2;
import com.yandex.mobile.ads.impl.tq2;
import com.yandex.mobile.ads.impl.uq2;
import kotlin.jvm.internal.u0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class b20
implements DivImageLoader {
    @NotNull
    private final lz1 a;
    @NotNull
    private final ct0 b;

    public b20(@NotNull Context context) {
        this.a = fd1.c.a(context).b();
        this.b = new ct0();
    }

    private final LoadReference a(String string2, DivImageDownloadCallback divImageDownloadCallback) {
        u0 u03 = new u0();
        this.b.a((Runnable)new tq2(u03, this, string2, divImageDownloadCallback));
        return new uq2(this, u03);
    }

    private static final void a(b20 b202, u0 u03) {
        b202.b.a((Runnable)new qq2(u03));
    }

    private static final void a(u0 u03) {
        u03 = (aj0.c)u03.c;
        if (u03 != null) {
            u03.a();
        }
    }

    private static final void a(u0 u03, b20 b202, String string2, ImageView imageView) {
        u03.c = b202.a.a(string2, new aj0.d(imageView){
            final ImageView a;
            {
                this.a = imageView;
            }

            @Override
            public final void a(@Nullable aj0.c c10, boolean bl2) {
                if ((c10 = c10.b()) != null) {
                    this.a.setImageBitmap((Bitmap)c10);
                }
            }

            public final void a(@Nullable dj2 dj22) {
            }
        }, 0, 0);
    }

    private static final void a(u0 u03, b20 b202, String string2, DivImageDownloadCallback divImageDownloadCallback) {
        u03.c = b202.a.a(string2, new aj0.d(string2, divImageDownloadCallback){
            final DivImageDownloadCallback a;
            final String b;
            {
                this.a = divImageDownloadCallback;
                this.b = string2;
            }

            @Override
            public final void a(@Nullable aj0.c c10, boolean bl2) {
                Bitmap bitmap = c10.b();
                if (bitmap != null) {
                    String string2 = this.b;
                    DivImageDownloadCallback divImageDownloadCallback = this.a;
                    c10 = bl2 ? BitmapSource.MEMORY : BitmapSource.NETWORK;
                    divImageDownloadCallback.onSuccess(new CachedBitmap(bitmap, Uri.parse((String)string2), (BitmapSource)c10));
                }
            }

            public final void a(@Nullable dj2 dj22) {
                this.a.onError();
            }
        }, 0, 0);
    }

    private static final void b(u0 u03) {
        u03 = (aj0.c)u03.c;
        if (u03 != null) {
            u03.a();
        }
    }

    public static /* synthetic */ void c(u0 u03) {
        b20.a(u03);
    }

    public static /* synthetic */ void d(u0 u03, b20 b202, String string2, DivImageDownloadCallback divImageDownloadCallback) {
        b20.a(u03, b202, string2, divImageDownloadCallback);
    }

    public static /* synthetic */ void e(u0 u03) {
        b20.b(u03);
    }

    public static /* synthetic */ void f(b20 b202, u0 u03) {
        b20.a(b202, u03);
    }

    public static /* synthetic */ void g(u0 u03, b20 b202, String string2, ImageView imageView) {
        b20.a(u03, b202, string2, imageView);
    }

    @NotNull
    public final LoadReference loadImage(@NotNull String string2, @NotNull ImageView imageView) {
        u0 u03 = new u0();
        this.b.a((Runnable)new rq2(u03, this, string2, imageView));
        return new sq2(u03);
    }

    @NotNull
    public final LoadReference loadImage(@NotNull String string2, @NotNull DivImageDownloadCallback divImageDownloadCallback) {
        return this.a(string2, divImageDownloadCallback);
    }

    @NotNull
    public final LoadReference loadImageBytes(@NotNull String string2, @NotNull DivImageDownloadCallback divImageDownloadCallback) {
        return this.a(string2, divImageDownloadCallback);
    }
}


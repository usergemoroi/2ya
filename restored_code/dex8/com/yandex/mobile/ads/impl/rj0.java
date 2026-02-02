/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.view.View
 *  android.widget.ImageView
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.ej0
 *  com.yandex.mobile.ads.impl.gh2
 *  com.yandex.mobile.ads.impl.jj0
 *  com.yandex.mobile.ads.impl.n02
 *  com.yandex.mobile.ads.impl.nj0
 *  com.yandex.mobile.ads.impl.vi0
 *  com.yandex.mobile.ads.impl.vi0$a
 *  com.yandex.mobile.ads.impl.vi0$b
 */
package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.d33;
import com.yandex.mobile.ads.impl.e91;
import com.yandex.mobile.ads.impl.ej0;
import com.yandex.mobile.ads.impl.gh2;
import com.yandex.mobile.ads.impl.jj0;
import com.yandex.mobile.ads.impl.n02;
import com.yandex.mobile.ads.impl.nj0;
import com.yandex.mobile.ads.impl.vi0;
import org.jetbrains.annotations.NotNull;

public final class rj0
extends gh2<ImageView, jj0> {
    @NotNull
    private final ej0 c;
    @NotNull
    private final vi0 d;
    @NotNull
    private final nj0 e;
    @NotNull
    private final n02 f;

    public /* synthetic */ rj0(ImageView imageView, ej0 ej02, b8 b82) {
        this(imageView, ej02, new vi0(imageView.getContext(), (vi0.a)new e91(b82), ej02), new nj0(ej02), new n02());
    }

    public rj0(@NotNull ImageView imageView, @NotNull ej0 ej02, @NotNull vi0 vi02, @NotNull nj0 nj02, @NotNull n02 n022) {
        super((View)imageView);
        this.c = ej02;
        this.d = vi02;
        this.e = nj02;
        this.f = n022;
    }

    private static final void a(rj0 rj02, jj0 jj02, Bitmap bitmap) {
        ImageView imageView;
        if (bitmap != null && (imageView = (ImageView)rj02.b()) != null) {
            if (jj02.e() != null) {
                rj02.f.a(bitmap, imageView, jj02);
            } else {
                imageView.setImageBitmap(bitmap);
            }
        }
    }

    private final void b(jj0 jj02) {
        this.d.a(jj02, (vi0.b)new d33(this, jj02));
    }

    public static /* synthetic */ void d(rj0 rj02, jj0 jj02, Bitmap bitmap) {
        rj0.a(rj02, jj02, bitmap);
    }

    public final void a(@NotNull ImageView imageView) {
        imageView.setImageDrawable(null);
        this.f.a(imageView);
        imageView.setVisibility(8);
        imageView.setOnClickListener(null);
        imageView.setOnTouchListener(null);
        imageView.setSelected(false);
    }

    public final void a(@NotNull jj0 jj02) {
        this.b(jj02);
    }

    public final boolean a(View view, Object object) {
        view = (ImageView)view;
        object = (jj0)object;
        return this.e.a(view.getDrawable(), (jj0)object);
    }

    public final void b(View view, Object object) {
        view = (ImageView)view;
        this.b((jj0)object);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.view.View
 *  android.widget.ImageView
 *  com.yandex.mobile.ads.impl.cn0
 *  com.yandex.mobile.ads.impl.ga
 *  com.yandex.mobile.ads.impl.jj0
 *  com.yandex.mobile.ads.impl.lo1
 *  com.yandex.mobile.ads.impl.vf
 *  com.yandex.mobile.ads.impl.vi0
 *  com.yandex.mobile.ads.impl.vi0$b
 *  com.yandex.mobile.ads.impl.zb2
 *  com.yandex.mobile.ads.impl.zf
 *  kotlin.reflect.KProperty
 */
package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.yandex.mobile.ads.impl.cn0;
import com.yandex.mobile.ads.impl.ga;
import com.yandex.mobile.ads.impl.jj0;
import com.yandex.mobile.ads.impl.ko1;
import com.yandex.mobile.ads.impl.lo1;
import com.yandex.mobile.ads.impl.vf;
import com.yandex.mobile.ads.impl.vi0;
import com.yandex.mobile.ads.impl.zb2;
import com.yandex.mobile.ads.impl.zf;
import kotlin.k0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class p80
implements cn0 {
    @NotNull
    private final vi0 a;
    @Nullable
    private final vf<jj0> b;
    @NotNull
    private final zf c;

    public p80(@NotNull vi0 vi02, @Nullable vf<jj0> vf3, @NotNull zf zf2) {
        this.a = vi02;
        this.b = vf3;
        this.c = zf2;
    }

    public final void a(@NotNull zb2 object) {
        ImageView imageView = object.g();
        if (imageView != null) {
            object = this.b;
            k0 k02 = null;
            if ((object = object != null ? (jj0)object.d() : null) != null) {
                this.a.a(object, (vi0.b)new a(imageView));
                k02 = k0.a;
            }
            if (k02 == null) {
                imageView.setVisibility(8);
            }
            this.c.a((View)imageView, this.b);
        }
    }

    private static final class a
    implements vi0.b {
        static final KProperty<Object>[] b = new KProperty[]{ga.a(a.class, (String)"faviconView", (String)"getFaviconView()Landroid/widget/ImageView;", (int)0)};
        @NotNull
        private final ko1 a;

        public a(@NotNull ImageView imageView) {
            this.a = lo1.a((Object)imageView);
        }

        public final void a(@Nullable Bitmap object) {
            ImageView imageView;
            if (object != null && (imageView = (ImageView)this.a.getValue(this, b[0])) != null) {
                imageView.setImageBitmap(object);
                imageView.setVisibility(0);
                object = k0.a;
            } else {
                object = null;
            }
            if (object == null && (object = (ImageView)this.a.getValue(this, b[0])) != null) {
                object.setVisibility(8);
            }
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.TextView
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
import android.widget.TextView;
import com.yandex.mobile.ads.impl.cn0;
import com.yandex.mobile.ads.impl.ga;
import com.yandex.mobile.ads.impl.jj0;
import com.yandex.mobile.ads.impl.ko1;
import com.yandex.mobile.ads.impl.lo1;
import com.yandex.mobile.ads.impl.vf;
import com.yandex.mobile.ads.impl.vi0;
import com.yandex.mobile.ads.impl.zb2;
import com.yandex.mobile.ads.impl.zf;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class j72
implements cn0 {
    @NotNull
    private final vi0 a;
    @Nullable
    private final vf<?> b;
    @NotNull
    private final zf c;

    public j72(@NotNull vi0 vi02, @Nullable vf<?> vf3, @NotNull zf zf2) {
        this.a = vi02;
        this.b = vf3;
        this.c = zf2;
    }

    public final void a(@NotNull zb2 object) {
        ImageView imageView = object.r();
        TextView textView = object.q();
        if (imageView != null) {
            object = this.b;
            jj0 jj02 = null;
            if ((object = object != null ? object.d() : null) instanceof jj0) {
                jj02 = (jj0)object;
            }
            if (jj02 != null) {
                this.a.a(jj02, (vi0.b)new a(imageView, textView));
            }
            this.c.a((View)imageView, this.b);
        }
    }

    private static final class a
    implements vi0.b {
        static final KProperty<Object>[] c = new KProperty[]{ga.a(a.class, (String)"trademarkView", (String)"getTrademarkView()Landroid/widget/ImageView;", (int)0), ga.a(a.class, (String)"delimiterView", (String)"getDelimiterView()Landroid/widget/TextView;", (int)0)};
        @NotNull
        private final ko1 a;
        @NotNull
        private final ko1 b;

        public a(@NotNull ImageView imageView, @Nullable TextView textView) {
            this.a = lo1.a((Object)imageView);
            this.b = lo1.a((Object)textView);
        }

        public final void a(@Nullable Bitmap bitmap) {
            if (bitmap != null) {
                ko1 ko12 = this.a;
                KProperty<Object>[] kPropertyArray = c;
                if ((ko12 = (ImageView)ko12.getValue(this, kPropertyArray[0])) != null) {
                    ko12.setImageBitmap(bitmap);
                    ko12.setVisibility(0);
                }
                if ((bitmap = (TextView)this.b.getValue(this, kPropertyArray[1])) != null) {
                    bitmap.setVisibility(0);
                }
            }
        }
    }
}


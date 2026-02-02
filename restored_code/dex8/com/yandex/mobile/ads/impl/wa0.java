/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.view.View
 *  android.widget.ImageView
 *  androidx.core.content.ContextCompat
 *  com.yandex.mobile.ads.R$drawable
 *  com.yandex.mobile.ads.impl.gh2
 *  com.yandex.mobile.ads.impl.jj0
 *  com.yandex.mobile.ads.impl.ta0
 *  com.yandex.mobile.ads.impl.vi0
 *  com.yandex.mobile.ads.impl.vi0$b
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.gh2;
import com.yandex.mobile.ads.impl.jj0;
import com.yandex.mobile.ads.impl.ta0;
import com.yandex.mobile.ads.impl.v63;
import com.yandex.mobile.ads.impl.vi0;
import org.jetbrains.annotations.NotNull;

public final class wa0
extends gh2<ImageView, ta0> {
    @NotNull
    private final vi0 c;

    public wa0(@NotNull ImageView imageView, @NotNull vi0 vi02) {
        super((View)imageView);
        this.c = vi02;
    }

    private final void a(jj0 jj02) {
        this.c.a(jj02, (vi0.b)new v63(this));
    }

    private static final void a(wa0 wa02, Bitmap bitmap) {
        if (bitmap != null) {
            if ((wa02 = (ImageView)wa02.b()) != null) {
                wa02.setImageBitmap(bitmap);
            }
        } else if ((wa02 = (ImageView)wa02.b()) != null) {
            wa02.setImageDrawable(ContextCompat.getDrawable((Context)wa02.getContext(), (int)R.drawable.monetization_ads_internal_default_adtune_feedback_icon));
        }
    }

    public static /* synthetic */ void d(wa0 wa02, Bitmap bitmap) {
        wa0.a(wa02, bitmap);
    }

    public final void b(View view, Object object) {
        view = (ImageView)view;
        if ((object = ((ta0)object).a()) != null) {
            view.setForeground(null);
            view.setBackground(null);
            this.a((jj0)object);
        }
    }
}


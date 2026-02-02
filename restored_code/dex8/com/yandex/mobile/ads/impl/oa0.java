/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  androidx.core.content.ContextCompat
 *  com.yandex.mobile.ads.R$drawable
 *  com.yandex.mobile.ads.impl.cf2
 *  com.yandex.mobile.ads.impl.cn0
 *  com.yandex.mobile.ads.impl.j20
 *  com.yandex.mobile.ads.impl.na0
 *  com.yandex.mobile.ads.impl.rb
 *  com.yandex.mobile.ads.impl.t
 *  com.yandex.mobile.ads.impl.vf
 *  com.yandex.mobile.ads.impl.xg2
 *  com.yandex.mobile.ads.impl.zb2
 *  com.yandex.mobile.ads.impl.zf
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.cf2;
import com.yandex.mobile.ads.impl.cn0;
import com.yandex.mobile.ads.impl.j20;
import com.yandex.mobile.ads.impl.na0;
import com.yandex.mobile.ads.impl.qj;
import com.yandex.mobile.ads.impl.rb;
import com.yandex.mobile.ads.impl.t;
import com.yandex.mobile.ads.impl.vf;
import com.yandex.mobile.ads.impl.xg2;
import com.yandex.mobile.ads.impl.zb2;
import com.yandex.mobile.ads.impl.zf;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class oa0
implements cn0 {
    private static final int f = R.drawable.monetization_ads_internal_instream_adtune_control_v2;
    @Nullable
    private final vf<?> a;
    @NotNull
    private final zf b;
    @NotNull
    private final xg2 c;
    @NotNull
    private final rb d;
    @NotNull
    private final j20 e;

    public oa0(@Nullable vf<?> vf3, @NotNull zf zf2, @NotNull xg2 xg22, @NotNull rb rb2, @NotNull j20 j202) {
        this.a = vf3;
        this.b = zf2;
        this.c = xg22;
        this.d = rb2;
        this.e = j202;
    }

    private final qj a() {
        Object object = this.a;
        qj qj3 = null;
        if (object != null && (object = object.a()) != null && (object = object.a()) != null) {
            block5: {
                for (Object t13 : object) {
                    t t14 = (t)t13;
                    object = t13;
                    if (!y.e(t14.a(), "adtune")) {
                        if (!y.e(t14.a(), "divkit_adtune")) continue;
                        object = t13;
                    }
                    break block5;
                }
                object = null;
            }
            object = (t)object;
        } else {
            object = null;
        }
        if (object instanceof qj) {
            qj3 = (qj)object;
        }
        return qj3;
    }

    public final void a(@NotNull zb2 zb22) {
        ImageView imageView = zb22.h();
        if (imageView != null) {
            Object object = imageView.getDrawable();
            zb22 = object;
            if (object == null) {
                zb22 = ContextCompat.getDrawable((Context)imageView.getContext(), (int)f);
            }
            imageView.setImageDrawable((Drawable)zb22);
            int n10 = this.a() != null ? 0 : 8;
            imageView.setVisibility(n10);
            object = this.a();
            if (object != null) {
                zb22 = new cf2(imageView.getContext());
                imageView.setOnClickListener((View.OnClickListener)new na0((qj)object, this.d, this.e, this.c, (cf2)zb22));
            } else {
                this.b.a((View)imageView, this.a);
            }
        }
    }
}


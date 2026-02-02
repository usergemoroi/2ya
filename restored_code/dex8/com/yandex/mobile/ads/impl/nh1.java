/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 *  com.yandex.mobile.ads.R$id
 *  com.yandex.mobile.ads.impl.gt
 *  com.yandex.mobile.ads.impl.j41
 *  com.yandex.mobile.ads.impl.jt
 *  com.yandex.mobile.ads.impl.t00
 *  com.yandex.mobile.ads.impl.uh2
 */
package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.gt;
import com.yandex.mobile.ads.impl.j41;
import com.yandex.mobile.ads.impl.jt;
import com.yandex.mobile.ads.impl.m41;
import com.yandex.mobile.ads.impl.t00;
import com.yandex.mobile.ads.impl.uh2;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;

public final class nh1<V extends ViewGroup>
implements t00<V> {
    @NotNull
    private final gt a;
    @NotNull
    private final j41 b;
    @NotNull
    private final m41 c;

    public /* synthetic */ nh1(gt gt3) {
        this(gt3, new j41(), new m41());
    }

    @JvmOverloads
    public nh1(@NotNull gt gt3, @NotNull j41 j412, @NotNull m41 m412) {
        this.a = gt3;
        this.b = j412;
        this.c = m412;
    }

    public final void a(@NotNull V object) {
        this.b.getClass();
        ImageView imageView = (ImageView)object.findViewById(R.id.icon_placeholder);
        jt jt2 = this.a.g();
        jt jt3 = this.a.e();
        if (imageView != null && jt2 == null && jt3 == null) {
            this.c.getClass();
            object = new uh2((TextView)object.findViewById(R.id.title));
            imageView.setVisibility(0);
            imageView.setOnClickListener(object);
        }
    }

    public final void c() {
    }
}


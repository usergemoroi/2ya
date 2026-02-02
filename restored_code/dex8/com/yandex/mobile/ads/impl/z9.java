/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 *  com.yandex.mobile.ads.R$id
 *  com.yandex.mobile.ads.R$string
 *  com.yandex.mobile.ads.impl.gb3
 *  kotlin.jvm.functions.a
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.cy;
import com.yandex.mobile.ads.impl.gb3;
import com.yandex.mobile.ads.impl.zx;
import kotlin.jvm.functions.a;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

public final class z9
extends cy<zx.b> {
    @NotNull
    private final a<k0> a;
    @NotNull
    private final TextView b;

    public z9(@NotNull View view, @NotNull a<k0> a14) {
        super(view);
        this.a = a14;
        this.b = (TextView)view.findViewById(R.id.item_text);
    }

    private static final void a(z9 z94, View view) {
        z94.a.invoke();
    }

    public static /* synthetic */ void b(z9 z94, View view) {
        z9.a(z94, view);
    }

    public final void a() {
        this.b.setText((CharSequence)this.itemView.getContext().getString(R.string.ad_units));
        this.b.setOnClickListener((View.OnClickListener)new gb3(this));
    }
}


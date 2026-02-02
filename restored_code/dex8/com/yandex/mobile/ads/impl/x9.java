/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 *  com.yandex.mobile.ads.R$id
 *  com.yandex.mobile.ads.impl.ba3
 *  kotlin.jvm.functions.l
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.ba3;
import com.yandex.mobile.ads.impl.cy;
import com.yandex.mobile.ads.impl.zx;
import kotlin.jvm.functions.l;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

public final class x9
extends cy<zx.a> {
    @NotNull
    private final l<String, k0> a;
    @NotNull
    private final TextView b;
    @NotNull
    private final TextView c;
    @NotNull
    private final TextView d;

    public x9(@NotNull l l10, @NotNull View view) {
        super(view);
        this.a = l10;
        this.b = (TextView)view.findViewById(R.id.item_name);
        this.c = (TextView)view.findViewById(R.id.item_ad_unit_format);
        this.d = (TextView)view.findViewById(R.id.item_ad_unit_id);
    }

    private static final void a(x9 x94, zx.a a14, View view) {
        x94.a.invoke((Object)a14.b());
    }

    public static /* synthetic */ void b(x9 x94, zx.a a14, View view) {
        x9.a(x94, a14, view);
    }

    @Override
    public final void a(@NotNull zx.a a14) {
        this.b.setText((CharSequence)a14.c());
        this.c.setText((CharSequence)a14.a());
        this.d.setText((CharSequence)a14.b());
        this.itemView.setOnClickListener((View.OnClickListener)new ba3(this, a14));
    }
}


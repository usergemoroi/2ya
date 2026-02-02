/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 *  com.yandex.mobile.ads.R$id
 *  com.yandex.mobile.ads.impl.z43
 *  com.yandex.mobile.ads.impl.zx$c$a
 *  kotlin.jvm.functions.l
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.cy;
import com.yandex.mobile.ads.impl.z43;
import com.yandex.mobile.ads.impl.zx;
import kotlin.jvm.functions.l;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

public final class u
extends cy<zx.c> {
    @NotNull
    private final l<zx.c.a, k0> a;
    @NotNull
    private final TextView b;

    public u(@NotNull l l10, @NotNull View view) {
        super(view);
        this.a = l10;
        this.b = (TextView)view.findViewById(R.id.item_button);
    }

    private static final void a(u u11, zx.c c11, View view) {
        u11.a.invoke((Object)c11.a());
    }

    public static /* synthetic */ void b(u u11, zx.c c11, View view) {
        u.a(u11, c11, view);
    }

    @Override
    public final void a(@NotNull zx.c c11) {
        this.b.setText((CharSequence)c11.b());
        this.b.setOnClickListener((View.OnClickListener)new z43(this, c11));
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.widget.TextView
 *  com.yandex.mobile.ads.R$id
 *  com.yandex.mobile.ads.impl.ch
 *  com.yandex.mobile.ads.impl.tx
 *  com.yandex.mobile.ads.impl.zx
 *  kotlin.text.p
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.ch;
import com.yandex.mobile.ads.impl.cy;
import com.yandex.mobile.ads.impl.tx;
import com.yandex.mobile.ads.impl.zx;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;

public final class tq0
extends cy<zx.f> {
    @NotNull
    private final TextView a;
    @NotNull
    private final TextView b;
    @NotNull
    private final TextView c;

    public tq0(@NotNull View view) {
        super(view);
        this.a = (TextView)view.findViewById(R.id.item_title);
        this.b = (TextView)view.findViewById(R.id.item_subtitle);
        this.c = (TextView)view.findViewById(R.id.item_text);
    }

    @Override
    public final void a(zx zx2) {
        int n10;
        zx2 = (zx.f)zx2;
        Object object = zx2.a();
        tx tx2 = zx2.b();
        zx2 = zx2.c();
        Context context = this.itemView.getContext();
        if (object != null) {
            this.a.setVisibility(0);
            this.a.setText((CharSequence)object);
        } else {
            this.a.setVisibility(8);
        }
        if (tx2 != null && p.h0((CharSequence)tx2.d()) ^ true) {
            this.b.setVisibility(0);
            this.b.setText((CharSequence)tx2.d());
            n10 = ch.a((Context)context, (int)tx2.a());
            this.b.setTextColor(n10);
            object = tx2.b();
            n10 = object != null ? (Integer)object : 0;
            this.b.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, n10, 0);
        } else {
            this.b.setVisibility(8);
        }
        if (zx2 != null && p.h0((CharSequence)zx2.c()) ^ true) {
            this.c.setVisibility(0);
            this.c.setText((CharSequence)zx2.c());
            n10 = ch.a((Context)context, (int)zx2.a());
            this.c.setTextColor(n10);
        } else {
            this.c.setVisibility(8);
        }
    }
}


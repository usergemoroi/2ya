/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  com.yandex.div.core.images.LoadReference
 *  com.yandex.mobile.ads.R$id
 *  com.yandex.mobile.ads.impl.cb3
 *  com.yandex.mobile.ads.impl.ch
 *  com.yandex.mobile.ads.impl.db3
 *  com.yandex.mobile.ads.impl.dx
 *  kotlin.jvm.functions.l
 *  kotlin.text.p
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yandex.div.core.images.LoadReference;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.cb3;
import com.yandex.mobile.ads.impl.ch;
import com.yandex.mobile.ads.impl.cy;
import com.yandex.mobile.ads.impl.db3;
import com.yandex.mobile.ads.impl.dx;
import com.yandex.mobile.ads.impl.zx;
import kotlin.jvm.functions.l;
import kotlin.k0;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class yz0
extends cy<zx.g> {
    @NotNull
    private final dx a;
    @NotNull
    private final l<zx.g, k0> b;
    @NotNull
    private final l<String, k0> c;
    @Nullable
    private LoadReference d;
    @NotNull
    private final LinearLayout e;
    @NotNull
    private final ImageView f;
    @NotNull
    private final TextView g;
    @NotNull
    private final ImageView h;
    @NotNull
    private final TextView i;
    @NotNull
    private final TextView j;
    @NotNull
    private final ImageView k;

    public yz0(@NotNull View view, @NotNull dx dx3, @NotNull l<? super zx.g, k0> l10, @NotNull l<? super String, k0> l11) {
        super(view);
        this.a = dx3;
        this.b = l10;
        this.c = l11;
        this.e = (LinearLayout)view.findViewById(R.id.item_mediation_adapter);
        this.f = (ImageView)view.findViewById(R.id.item_logo);
        this.g = (TextView)view.findViewById(R.id.item_name);
        this.h = (ImageView)view.findViewById(R.id.navigation_icon);
        this.i = (TextView)view.findViewById(R.id.item_info_first);
        this.j = (TextView)view.findViewById(R.id.item_info_second);
        this.k = (ImageView)view.findViewById(R.id.item_warning_button);
    }

    private static final void a(yz0 yz02, zx.g g11, View view) {
        yz02.c.invoke((Object)g11.j());
    }

    private static final void b(yz0 yz02, zx.g g11, View view) {
        yz02.b.invoke((Object)g11);
    }

    public static /* synthetic */ void c(yz0 yz02, zx.g g11, View view) {
        yz0.a(yz02, g11, view);
    }

    public static /* synthetic */ void d(yz0 yz02, zx.g g11, View view) {
        yz0.b(yz02, g11, view);
    }

    @Override
    public final void a(@NotNull zx.g g11) {
        Object object;
        Object object2 = this.itemView.getContext();
        this.g.setText((CharSequence)g11.f());
        Object object3 = g11.c();
        if (object3 != null) {
            this.i.setVisibility(0);
            this.i.setText((CharSequence)object3.d());
            this.i.setTextAppearance(object2, object3.c());
            this.i.setTextColor(ch.a((Context)this.itemView.getContext(), (int)object3.a()));
            object = this.i;
            object3 = object3.b();
            int n10 = object3 != null ? (Integer)object3 : 0;
            object.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, n10, 0);
        } else {
            this.i.setVisibility(8);
        }
        object = g11.d();
        this.j.setText((CharSequence)object.c());
        this.j.setTextAppearance(object2, object.b());
        this.j.setTextColor(ch.a((Context)this.itemView.getContext(), (int)object.a()));
        object = this.e;
        object2 = g11.j();
        boolean bl2 = object2 != null && !p.h0((CharSequence)object2) || g11.g() != null;
        object.setClickable(bl2);
        object2 = g11.j();
        if (object2 != null && !p.h0((CharSequence)object2)) {
            this.k.setVisibility(0);
            this.e.setOnClickListener((View.OnClickListener)new cb3(this, g11));
        } else {
            this.k.setVisibility(8);
        }
        this.f.setImageResource(0);
        object2 = this.d;
        if (object2 != null) {
            object2.cancel();
        }
        object3 = this.a;
        object = g11.e();
        object2 = object;
        if (object == null) {
            object2 = "";
        }
        this.d = object3.a((String)object2, this.f);
        if (g11.g() != null) {
            this.h.setVisibility(0);
            this.e.setOnClickListener((View.OnClickListener)new db3(this, g11));
        } else {
            this.h.setVisibility(8);
        }
    }
}


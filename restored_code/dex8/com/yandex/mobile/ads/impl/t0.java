/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window
 *  android.webkit.WebView
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.ProgressBar
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  android.widget.TextView
 *  com.yandex.mobile.ads.impl.c43
 *  com.yandex.mobile.ads.impl.ca
 *  com.yandex.mobile.ads.impl.d43
 *  com.yandex.mobile.ads.impl.f1
 *  com.yandex.mobile.ads.impl.f92
 *  com.yandex.mobile.ads.impl.gi2
 *  com.yandex.mobile.ads.impl.i1
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.q2$c
 *  com.yandex.mobile.ads.impl.t7
 *  com.yandex.mobile.ads.impl.u7
 *  com.yandex.mobile.ads.impl.v7
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.yandex.mobile.ads.impl.c43;
import com.yandex.mobile.ads.impl.ca;
import com.yandex.mobile.ads.impl.d43;
import com.yandex.mobile.ads.impl.f1;
import com.yandex.mobile.ads.impl.f92;
import com.yandex.mobile.ads.impl.gi2;
import com.yandex.mobile.ads.impl.i1;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.q2;
import com.yandex.mobile.ads.impl.r1;
import com.yandex.mobile.ads.impl.t7;
import com.yandex.mobile.ads.impl.u7;
import com.yandex.mobile.ads.impl.v7;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;

public final class t0
implements i1,
q2.c {
    @NotNull
    private final Context a;
    @NotNull
    private final RelativeLayout b;
    @NotNull
    private final f1 c;
    @NotNull
    private final Window d;
    @NotNull
    private final String e;
    @NotNull
    private q2 f;
    @NotNull
    private final LinearLayout g;
    @NotNull
    private final TextView h;
    @NotNull
    private final ProgressBar i;
    @NotNull
    private final f92 j;

    @JvmOverloads
    public t0(@NotNull Context context, @NotNull RelativeLayout relativeLayout, @NotNull r1 r14, @NotNull Window window, @NotNull String string2, @NotNull q2 q22, @NotNull LinearLayout linearLayout, @NotNull TextView textView, @NotNull ProgressBar progressBar, @NotNull f92 f922) {
        this.a = context;
        this.b = relativeLayout;
        this.c = r14;
        this.d = window;
        this.e = string2;
        this.f = q22;
        this.g = linearLayout;
        this.h = textView;
        this.i = progressBar;
        this.j = f922;
    }

    private final void a(int n10) {
        if (n10 == 0 && this.i.getVisibility() != 0) {
            this.i.bringToFront();
            this.b.requestLayout();
            this.b.invalidate();
        }
        this.i.setVisibility(n10);
    }

    private final void a(ImageView imageView, ImageView imageView2) {
        imageView.setOnClickListener((View.OnClickListener)new c43(this));
        imageView2.setOnClickListener((View.OnClickListener)new d43(this));
    }

    private static final void a(t0 t02, View object) {
        object = t02.f.getUrl();
        if (object != null) {
            t02.j.a(t02.a, (String)object);
        }
    }

    private static final void b(t0 t02, View view) {
        t02.c.a();
    }

    public static /* synthetic */ void c(t0 t02, View view) {
        t0.b(t02, view);
    }

    public static /* synthetic */ void d(t0 t02, View view) {
        t0.a(t02, view);
    }

    public final void a() {
        this.f.f();
    }

    public final void a(@NotNull WebView webView, int n10) {
        ProgressBar progressBar = this.i;
        progressBar.setProgress(n10 *= 100);
        if (10000 > n10) {
            this.a(0);
        } else {
            this.h.setText((CharSequence)webView.getTitle());
            this.a(8);
        }
    }

    public final void b() {
        this.f.e();
    }

    public final void c() {
        this.b.setBackgroundDrawable((Drawable)t7.a);
        LinearLayout linearLayout = this.g;
        ImageView imageView = u7.b((Context)this.a);
        ImageView imageView2 = u7.a((Context)this.a);
        this.a(imageView, imageView2);
        linearLayout.addView((View)this.h, (ViewGroup.LayoutParams)new LinearLayout.LayoutParams(0, -1, 1.0f));
        linearLayout.addView((View)imageView, (ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-2, -1));
        linearLayout.addView((View)imageView2, (ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-2, -1));
        imageView2 = this.b;
        linearLayout = this.g;
        imageView = this.a;
        imageView = new RelativeLayout.LayoutParams(-1, gi2.a((Context)imageView, (float)v7.d.a((Context)imageView)));
        imageView.addRule(10);
        imageView2.addView((View)linearLayout, (ViewGroup.LayoutParams)imageView);
        linearLayout = this.a;
        imageView2 = this.g;
        linearLayout = new RelativeLayout.LayoutParams(-1, gi2.a((Context)linearLayout, (float)2.0f));
        linearLayout.addRule(3, imageView2.getId());
        this.b.addView((View)this.i, (ViewGroup.LayoutParams)linearLayout);
        this.a(8);
        imageView = this.b;
        q2 q22 = this.f;
        linearLayout = this.g;
        imageView2 = new RelativeLayout.LayoutParams(-1, -1);
        imageView2.addRule(3, linearLayout.getId());
        imageView.addView((View)q22, (ViewGroup.LayoutParams)imageView2);
        this.f.loadUrl(this.e);
        this.c.a(6, null);
        int n10 = op0.b;
    }

    public final void d() {
        this.f.d();
    }

    public final void e() {
        this.a(8);
    }

    public final boolean f() {
        boolean bl2;
        if (this.f.canGoBack()) {
            q2 q22 = this.f;
            if (q22.canGoBack()) {
                q22.goBack();
            }
            bl2 = true;
        } else {
            bl2 = false;
        }
        return bl2 ^ true;
    }

    public final void g() {
        this.d.requestFeature(1);
        if (ca.a((int)16)) {
            this.d.getDecorView().setSystemUiVisibility(256);
        }
    }

    public final void h() {
        this.a(0);
    }

    public final void onAdClosed() {
        this.c.a(8, null);
    }
}


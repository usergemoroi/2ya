/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.view.MotionEvent
 *  android.view.View
 *  android.webkit.WebChromeClient
 *  android.webkit.WebViewClient
 *  com.yandex.mobile.ads.impl.ca
 *  com.yandex.mobile.ads.impl.ck2
 *  com.yandex.mobile.ads.impl.dh1
 *  com.yandex.mobile.ads.impl.fk
 *  com.yandex.mobile.ads.impl.fz1
 *  com.yandex.mobile.ads.impl.gg0
 *  com.yandex.mobile.ads.impl.gh1
 *  com.yandex.mobile.ads.impl.gh1$b
 *  com.yandex.mobile.ads.impl.hb3
 *  com.yandex.mobile.ads.impl.ht1
 *  com.yandex.mobile.ads.impl.ii2
 *  com.yandex.mobile.ads.impl.ii2$a
 *  com.yandex.mobile.ads.impl.lg0
 *  com.yandex.mobile.ads.impl.lk2
 *  com.yandex.mobile.ads.impl.mg0
 *  com.yandex.mobile.ads.impl.ng0
 *  com.yandex.mobile.ads.impl.og0
 */
package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import com.yandex.mobile.ads.impl.ca;
import com.yandex.mobile.ads.impl.ck2;
import com.yandex.mobile.ads.impl.dh1;
import com.yandex.mobile.ads.impl.fk;
import com.yandex.mobile.ads.impl.fz1;
import com.yandex.mobile.ads.impl.gg0;
import com.yandex.mobile.ads.impl.gh1;
import com.yandex.mobile.ads.impl.hb3;
import com.yandex.mobile.ads.impl.ht1;
import com.yandex.mobile.ads.impl.ii2;
import com.yandex.mobile.ads.impl.lg0;
import com.yandex.mobile.ads.impl.lk2;
import com.yandex.mobile.ads.impl.mg0;
import com.yandex.mobile.ads.impl.ng0;
import com.yandex.mobile.ads.impl.og0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class zf1
extends fk
implements mg0,
gh1.b,
ii2.a {
    private static boolean j;
    @NotNull
    private final Context b;
    @NotNull
    private final ii2 c;
    @NotNull
    private final gh1 d;
    @NotNull
    private final fz1 e;
    @Nullable
    private og0 f;
    @Nullable
    private ng0 g;
    private boolean h;
    private boolean i;

    public /* synthetic */ zf1(Context context) {
        Context context2 = context.getApplicationContext();
        this(context, context2, new ii2(), gh1.h.a(context2));
    }

    public zf1(@NotNull Context context, @NotNull Context context2, @NotNull ii2 ii22, @NotNull gh1 gh12) {
        super(context2);
        this.b = context2;
        this.c = ii22;
        this.d = gh12;
        this.e = new fz1();
        this.a(context);
        if (!j) {
            j = true;
        }
    }

    private static final void a(zf1 zf12) {
        zf12.h();
    }

    private final void a(boolean bl2) {
        if (this.h != bl2) {
            this.h = bl2;
            og0 og02 = this.j();
            if (og02 != null) {
                og02.a(this.h);
            }
        }
    }

    public static /* synthetic */ void h(zf1 zf12) {
        zf1.a(zf12);
    }

    public void a() {
        this.e.a((Runnable)new hb3(this));
    }

    public void a(int n10) {
        ng0 ng02 = this.g;
        if (ng02 != null) {
            ng02.a(n10);
        }
    }

    @SuppressLint(value={"SetJavaScriptEnabled"})
    protected void a(@NotNull Context context) {
        this.setBackgroundColor(0);
        this.setVisibility(4);
        this.setHorizontalScrollBarEnabled(false);
        this.setHorizontalScrollbarOverlay(false);
        this.setVerticalScrollBarEnabled(false);
        this.setVerticalScrollbarOverlay(false);
        this.setScrollBarStyle(0);
        this.getSettings().setJavaScriptEnabled(true);
        this.getSettings().setSupportZoom(false);
        this.getSettings().setBuiltInZoomControls(false);
        this.getSettings().setTextZoom(100);
        this.getSettings().setMinimumFontSize(1);
        this.getSettings().setMinimumLogicalFontSize(1);
        context = this.getSettings();
        if (ca.a((int)21)) {
            context.setMixedContentMode(2);
        }
        this.getSettings().setMediaPlaybackRequiresUserGesture(false);
        this.setWebViewClient((WebViewClient)new lg0((mg0)this, (lk2)ht1.b()));
        this.setWebChromeClient((WebChromeClient)new gg0());
    }

    public void a(@NotNull Context context, @NotNull String string2) {
        context = this.j();
        if (context != null) {
            context.a(string2);
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void a(@NotNull dh1 var1_1) {
        if (var1_1 == dh1.c) ** GOTO lbl-1000
        this.c.getClass();
        if (ii2.a((View)this) && this.d.b()) {
            var2_2 = true;
        } else // 2 sources

        {
            var2_2 = false;
        }
        this.a(var2_2);
    }

    public final boolean b() {
        return this.i;
    }

    @NotNull
    public String c() {
        String string2 = ck2.a();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append("<style type='text/css'> \n  * { \n      -webkit-tap-highlight-color: rgba(0, 0, 0, 0) !important; \n      -webkit-focus-ring-color: rgba(0, 0, 0, 0) !important; \n      outline: none !important; \n    } \n</style> \n");
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public void d() {
        this.setHtmlWebViewListener(null);
        super.d();
    }

    public final boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        og0 og02;
        if (motionEvent != null && motionEvent.getAction() == 0 && (og02 = this.j()) != null) {
            og02.a();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    protected abstract void h();

    @NotNull
    public final Context i() {
        return this.b;
    }

    @Nullable
    public og0 j() {
        return this.f;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.i = true;
        this.d.a((gh1.b)this);
        this.c.getClass();
        this.a(ii2.a((View)this));
    }

    public final void onDetachedFromWindow() {
        this.i = false;
        this.c.getClass();
        this.a(ii2.a((View)this));
        this.d.b((gh1.b)this);
        super.onDetachedFromWindow();
    }

    public final void onVisibilityChanged(@NotNull View view, int n10) {
        super.onVisibilityChanged(view, n10);
        this.c.getClass();
        this.a(ii2.a((View)this));
    }

    public final void onWindowFocusChanged(boolean bl2) {
        super.onWindowFocusChanged(bl2);
        this.c.getClass();
        this.a(ii2.a((View)this));
    }

    public final void setHtmlWebViewErrorListener(@Nullable ng0 ng02) {
        this.g = ng02;
    }

    public void setHtmlWebViewListener(@Nullable og0 og02) {
        this.f = og02;
    }
}


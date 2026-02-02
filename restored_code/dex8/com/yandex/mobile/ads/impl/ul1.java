/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ProgressBar
 *  com.yandex.mobile.ads.impl.bm1
 *  com.yandex.mobile.ads.impl.cp
 *  com.yandex.mobile.ads.impl.fp
 *  com.yandex.mobile.ads.impl.mg1
 *  com.yandex.mobile.ads.impl.mg1$a
 *  com.yandex.mobile.ads.impl.mp
 *  com.yandex.mobile.ads.impl.og1
 *  com.yandex.mobile.ads.impl.p52
 *  com.yandex.mobile.ads.impl.uv
 *  com.yandex.mobile.ads.impl.vv
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ProgressBar;
import com.yandex.mobile.ads.impl.a50;
import com.yandex.mobile.ads.impl.bm1;
import com.yandex.mobile.ads.impl.cp;
import com.yandex.mobile.ads.impl.fp;
import com.yandex.mobile.ads.impl.mg1;
import com.yandex.mobile.ads.impl.mp;
import com.yandex.mobile.ads.impl.og1;
import com.yandex.mobile.ads.impl.p52;
import com.yandex.mobile.ads.impl.uv;
import com.yandex.mobile.ads.impl.vv;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;

public final class ul1
implements fp {
    @NotNull
    private final View a;
    @NotNull
    private final ProgressBar b;
    @NotNull
    private final cp c;
    @NotNull
    private final mp d;
    @NotNull
    private final vv e;
    @NotNull
    private final bm1 f;
    private final long g;
    @NotNull
    private final mg1 h;
    @NotNull
    private final og1 i;
    @NotNull
    private final p52 j;

    public ul1(@NotNull View view, @NotNull ProgressBar progressBar, @NotNull a50 a502, @NotNull mp mp3, @NotNull vv vv2, @NotNull bm1 bm12, long l10) {
        this.a = view;
        this.b = progressBar;
        this.c = a502;
        this.d = mp3;
        this.e = vv2;
        this.f = bm12;
        this.g = l10;
        int n10 = mg1.a;
        this.h = mg1.a.a((boolean)true);
        this.i = new b(this.d(), a502, vv2);
        this.j = new a(progressBar, mp3, l10);
    }

    public final void a() {
        this.h.resume();
    }

    public final void a(boolean bl2) {
    }

    public final void b() {
        this.h.pause();
    }

    public final void c() {
        mp mp3 = this.d;
        ProgressBar progressBar = this.b;
        int n10 = (int)this.g;
        int n13 = (int)this.f.a();
        mp3.getClass();
        progressBar.setMax(n10);
        progressBar.setVisibility(0);
        progressBar.setProgress(n13);
        long l10 = Math.max(0L, this.g - this.f.a());
        if (l10 != 0L) {
            this.c.a(this.a);
            this.h.a(this.j);
            this.h.a(l10, this.i);
            this.e.a(uv.d);
        }
    }

    @NotNull
    public final View d() {
        return this.a;
    }

    public final void invalidate() {
        this.h.invalidate();
    }

    private static final class a
    implements p52 {
        @NotNull
        private final mp a;
        private final long b;
        @NotNull
        private final WeakReference<ProgressBar> c;

        public a(@NotNull ProgressBar progressBar, @NotNull mp mp3, long l10) {
            this.a = mp3;
            this.b = l10;
            this.c = new WeakReference<ProgressBar>(progressBar);
        }

        public final void a(long l10, long l11) {
            ProgressBar progressBar = (ProgressBar)this.c.get();
            if (progressBar != null) {
                mp mp3 = this.a;
                l11 = this.b;
                mp3.a(progressBar, l11, l11 - l10);
            }
        }
    }

    private static final class b
    implements og1 {
        @NotNull
        private final cp a;
        @NotNull
        private final vv b;
        @NotNull
        private final WeakReference<View> c;

        public b(@NotNull View view, @NotNull a50 a502, @NotNull vv vv2) {
            this.a = a502;
            this.b = vv2;
            this.c = new WeakReference<View>(view);
        }

        public final void a() {
            View view = (View)this.c.get();
            if (view != null) {
                this.a.b(view);
                this.b.a(uv.e);
            }
        }
    }
}


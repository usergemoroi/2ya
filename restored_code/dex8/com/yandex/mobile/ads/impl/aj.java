/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.ck2
 *  com.yandex.mobile.ads.impl.da
 *  com.yandex.mobile.ads.impl.dp0
 *  com.yandex.mobile.ads.impl.f3
 *  com.yandex.mobile.ads.impl.gi2
 *  com.yandex.mobile.ads.impl.iz1
 *  com.yandex.mobile.ads.impl.j7
 *  com.yandex.mobile.ads.impl.og0
 *  com.yandex.mobile.ads.impl.x2
 */
package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.ck2;
import com.yandex.mobile.ads.impl.da;
import com.yandex.mobile.ads.impl.dp0;
import com.yandex.mobile.ads.impl.f3;
import com.yandex.mobile.ads.impl.gi2;
import com.yandex.mobile.ads.impl.hg0;
import com.yandex.mobile.ads.impl.iz1;
import com.yandex.mobile.ads.impl.j7;
import com.yandex.mobile.ads.impl.kb0;
import com.yandex.mobile.ads.impl.og0;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.zf1;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressLint(value={"ViewConstructor"})
public final class aj
extends hg0 {
    @NotNull
    private final iz1 o;
    @NotNull
    private kb0 p;
    private boolean q;
    private int r;
    private int s;

    public aj(@NotNull Context context, @NotNull b8<?> b82, @NotNull x2 x22, @NotNull iz1 iz12) {
        super(context, b82, x22);
        this.o = iz12;
        this.q = true;
        if (this.n()) {
            this.r = iz12.c(context);
            this.s = iz12.a(context);
        } else {
            int n10 = b82.q() == 0 ? iz12.c(context) : b82.q();
            this.r = n10;
            this.s = b82.c();
        }
        this.p = this.a(this.r, this.s);
    }

    private final kb0 a(int n10, int n12) {
        return new kb0(n10, n12, this.o.a());
    }

    @Override
    public final void b(int n10, @Nullable String string2) {
        if (this.k().c() != 0) {
            n10 = this.k().c();
        }
        this.s = n10;
        super.b(n10, string2);
    }

    @Override
    @SuppressLint(value={"AddJavascriptInterface"})
    protected final void b(@NotNull Context context) {
        this.addJavascriptInterface(this.c(context), "AdPerformActionsJSI");
    }

    @Override
    @NotNull
    public final String c() {
        String string2;
        int n10;
        boolean bl2 = this.k().W();
        String string3 = "";
        if (bl2) {
            n10 = ck2.c;
            string2 = ck2.a((int)this.r);
        } else {
            string2 = "";
        }
        int n12 = this.o.c(this.getContext());
        n10 = this.o.a(this.getContext());
        if (this.n()) {
            string3 = ck2.a((int)n12, (int)n10);
        }
        String string4 = super.c();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(string3);
        stringBuilder.append(string4);
        return stringBuilder.toString();
    }

    @Override
    protected final void h() {
        if (this.q) {
            this.p = new kb0(this.r, this.s, this.o.a());
            og0 og02 = this.j();
            if (og02 != null) {
                if (!da.a((Context)this.getContext(), (iz1)this.p, (iz1)this.o) && !this.k().P()) {
                    Context context = this.getContext();
                    context = j7.a((int)this.o.c(context), (int)this.o.a(context), (int)this.p.getWidth(), (int)this.p.getHeight(), (int)gi2.d((Context)context), (int)gi2.b((Context)context));
                    dp0.a((String)context.d(), (Object[])new Object[0]);
                    og02.a((f3)context);
                } else {
                    og02.a((zf1)this, (Map)this.l());
                }
            }
            this.q = false;
        }
    }

    @VisibleForTesting
    public final boolean n() {
        boolean bl2 = this.m() && this.k().q() == 0 && this.k().c() == 0 && this.o.c(this.getContext()) > 0 && this.o.a(this.getContext()) > 0;
        return bl2;
    }

    @NotNull
    public final iz1 o() {
        return this.p;
    }

    public final void setBannerHeight(int n10) {
        this.s = n10;
    }

    public final void setBannerWidth(int n10) {
        this.r = n10;
    }
}


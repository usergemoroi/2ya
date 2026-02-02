/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.content.res.Configuration
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.ck2
 *  com.yandex.mobile.ads.impl.hg0$a
 *  com.yandex.mobile.ads.impl.hg1
 *  com.yandex.mobile.ads.impl.ig1
 *  com.yandex.mobile.ads.impl.og0
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.pg0
 *  com.yandex.mobile.ads.impl.x2
 */
package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.ck2;
import com.yandex.mobile.ads.impl.hg0;
import com.yandex.mobile.ads.impl.hg1;
import com.yandex.mobile.ads.impl.ig1;
import com.yandex.mobile.ads.impl.og0;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.pg0;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.zf1;
import java.util.LinkedHashMap;
import java.util.Objects;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class hg0
extends zf1
implements pg0 {
    @NotNull
    private final b8<?> k;
    @NotNull
    private final hg1 l;
    @Nullable
    private og0 m;
    @NotNull
    private final LinkedHashMap n;

    public /* synthetic */ hg0(Context context, b8 b82, x2 x22) {
        this(context, b82, x22, new ig1());
    }

    @JvmOverloads
    protected hg0(@NotNull Context context, @NotNull b8<?> b82, @NotNull x2 x22, @NotNull ig1 ig12) {
        super(context);
        this.k = b82;
        ig12.getClass();
        this.l = ig1.a((pg0)this);
        this.n = new LinkedHashMap();
        this.b(context);
    }

    @Override
    public final void a() {
        if (y.e("partner-code", this.k.j())) {
            this.l.b();
        } else {
            super.a();
        }
    }

    public final void a(int n10, @Nullable String string2) {
        int n12 = op0.b;
        this.b(n10, string2);
        super.a();
    }

    @VisibleForTesting(otherwise=4)
    public void b(int n10, @Nullable String string2) {
        if (string2 != null && string2.length() != 0 && !y.e(string2, "undefined")) {
            this.n.put("test-tag", string2);
        }
    }

    @SuppressLint(value={"AddJavascriptInterface"})
    protected abstract void b(@NotNull Context var1);

    @VisibleForTesting(otherwise=4)
    @NotNull
    public final a c(@NotNull Context context) {
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    @Override
    @VisibleForTesting(otherwise=4)
    @NotNull
    public String c() {
        String string2 = super.c();
        CharSequence charSequence = ck2.b();
        if (!y.e("partner-code", this.k.j())) {
            charSequence = null;
        }
        String string3 = charSequence;
        if (charSequence == null) {
            string3 = "";
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append(string3);
        return ((StringBuilder)charSequence).toString();
    }

    @Override
    public final void d() {
        this.l.a();
        super.d();
    }

    @Override
    @Nullable
    public final og0 j() {
        return this.m;
    }

    @NotNull
    public final b8<?> k() {
        return this.k;
    }

    @NotNull
    public final LinkedHashMap l() {
        return this.n;
    }

    protected final boolean m() {
        return y.e("partner-code", this.k.j());
    }

    @VisibleForTesting(otherwise=4)
    public final void onConfigurationChanged(@NotNull Configuration configuration) {
        Objects.toString(configuration);
        int n10 = op0.b;
        Object object = this.a.get("AdPerformActionsJSI");
        if (object != null && object instanceof a) {
            object = object;
        }
        super.onConfigurationChanged(configuration);
    }

    @Override
    public void setHtmlWebViewListener(@Nullable og0 og02) {
        this.l.a(og02);
        this.m = og02;
    }
}


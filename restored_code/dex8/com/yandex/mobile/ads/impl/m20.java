/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.ContextThemeWrapper
 *  android.view.View
 *  android.view.ViewGroup
 *  androidx.lifecycle.LifecycleOwner
 *  com.monetization.ads.nativeads.ExtendedNativeAdView
 *  com.yandex.div.DivDataTag
 *  com.yandex.div.R$style
 *  com.yandex.div.core.Div2Context
 *  com.yandex.div.core.DivConfiguration
 *  com.yandex.div.core.view2.Div2View
 *  com.yandex.div2.ca
 *  com.yandex.mobile.ads.impl.g30
 *  com.yandex.mobile.ads.impl.m10
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.t00
 *  com.yandex.mobile.ads.impl.z10
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import com.yandex.div.DivDataTag;
import com.yandex.div.R;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.DivConfiguration;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div2.ca;
import com.yandex.mobile.ads.impl.c20;
import com.yandex.mobile.ads.impl.g30;
import com.yandex.mobile.ads.impl.m10;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.t00;
import com.yandex.mobile.ads.impl.wp1;
import com.yandex.mobile.ads.impl.z10;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class m20
implements t00<ExtendedNativeAdView> {
    @NotNull
    private final ca a;
    @NotNull
    private final c20 b;
    @NotNull
    private final DivConfiguration c;
    @NotNull
    private final wp1 d;
    @NotNull
    private final String e;
    @Nullable
    private final LifecycleOwner f;
    @NotNull
    private final g30 g;
    @NotNull
    private final z10 h;

    public /* synthetic */ m20(ca ca3, c20 c202, DivConfiguration divConfiguration, wp1 wp12, String string2, LifecycleOwner lifecycleOwner, int n10) {
        if ((n10 & 0x10) != 0) {
            string2 = "";
        }
        this(ca3, c202, divConfiguration, wp12, string2, lifecycleOwner, new g30(), new z10());
    }

    public m20(@NotNull ca ca3, @NotNull c20 c202, @NotNull DivConfiguration divConfiguration, @NotNull wp1 wp12, @NotNull String string2, @Nullable LifecycleOwner lifecycleOwner, @NotNull g30 g302, @NotNull z10 z102) {
        this.a = ca3;
        this.b = c202;
        this.c = divConfiguration;
        this.d = wp12;
        this.e = string2;
        this.f = lifecycleOwner;
        this.g = g302;
        this.h = z102;
    }

    public final void a(ViewGroup viewGroup) {
        viewGroup = (ExtendedNativeAdView)viewGroup;
        try {
            Context context = viewGroup.getContext();
            g30 g302 = this.g;
            DivConfiguration divConfiguration = this.c;
            LifecycleOwner lifecycleOwner = this.f;
            String string2 = this.e;
            g302.getClass();
            g302 = new ContextThemeWrapper(context, R.style.Div);
            context = new Div2Context((ContextThemeWrapper)g302, divConfiguration, 0, lifecycleOwner, 4, null);
            divConfiguration = new Div2View((Div2Context)context, null, 0, 6, null);
            divConfiguration.setTag((Object)string2);
            viewGroup.addView((View)divConfiguration);
            this.h.getClass();
            string2 = UUID.randomUUID().toString();
            viewGroup = new DivDataTag(string2);
            divConfiguration.setData(this.a, (DivDataTag)viewGroup);
            m10.a((Div2View)divConfiguration).a(this.b);
        }
        catch (Throwable throwable) {
            int n10 = op0.b;
            this.d.reportError("Failed to bind DivKit", throwable);
        }
    }

    public final void c() {
    }
}


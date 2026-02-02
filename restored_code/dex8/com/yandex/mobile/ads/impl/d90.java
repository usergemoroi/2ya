/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ContextThemeWrapper
 *  androidx.lifecycle.LifecycleOwner
 *  com.yandex.div.core.Div2Context
 *  com.yandex.div.core.DivConfiguration
 *  com.yandex.div2.ca
 */
package com.yandex.mobile.ads.impl;

import android.view.ContextThemeWrapper;
import androidx.lifecycle.LifecycleOwner;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.DivConfiguration;
import com.yandex.div2.ca;
import com.yandex.mobile.ads.impl.c02;
import com.yandex.mobile.ads.impl.f02;
import com.yandex.mobile.ads.impl.lb0;
import org.jetbrains.annotations.NotNull;

public final class d90
extends Div2Context {
    @NotNull
    private final f02 a;

    public d90(@NotNull ContextThemeWrapper contextThemeWrapper, @NotNull DivConfiguration divConfiguration, @NotNull f02 f022) {
        super(contextThemeWrapper, divConfiguration, 0, (LifecycleOwner)new lb0(), 4, null);
        this.a = f022;
    }

    public final void a(@NotNull ca ca2, @NotNull c02 c022) {
        this.a.a(ca2, c022);
    }
}


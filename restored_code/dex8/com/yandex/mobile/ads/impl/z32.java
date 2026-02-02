/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.view.View
 *  android.widget.CompoundButton
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  android.widget.Switch
 *  com.yandex.mobile.ads.R$id
 *  com.yandex.mobile.ads.impl.fb3
 *  com.yandex.mobile.ads.impl.zx$h$a
 *  kotlin.jvm.functions.p
 */
package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.cy;
import com.yandex.mobile.ads.impl.fb3;
import com.yandex.mobile.ads.impl.zx;
import kotlin.jvm.functions.p;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

public final class z32
extends cy<zx.h> {
    @NotNull
    private final p<zx.h.a, Boolean, k0> a;
    @SuppressLint(value={"UseSwitchCompatOrMaterialCode"})
    @NotNull
    private final Switch b;

    public z32(@NotNull View view, @NotNull p<? super zx.h.a, ? super Boolean, k0> p14) {
        super(view);
        this.a = p14;
        this.b = (Switch)view.findViewById(R.id.item_switch);
    }

    private static final void a(z32 z322, zx.h h14, CompoundButton compoundButton, boolean bl2) {
        z322.a.invoke((Object)h14.b(), (Object)bl2);
    }

    public static /* synthetic */ void b(z32 z322, zx.h h14, CompoundButton compoundButton, boolean bl2) {
        z32.a(z322, h14, compoundButton, bl2);
    }

    @Override
    public final void a(@NotNull zx.h h14) {
        this.b.setOnCheckedChangeListener(null);
        this.b.setText((CharSequence)h14.c());
        this.b.setChecked(h14.a());
        this.b.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)new fb3(this, h14));
    }
}


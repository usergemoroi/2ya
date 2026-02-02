/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.TextView
 *  com.yandex.mobile.ads.R$id
 *  com.yandex.mobile.ads.impl.zx
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.cy;
import com.yandex.mobile.ads.impl.zx;
import org.jetbrains.annotations.NotNull;

public final class jf0
extends cy<zx.e> {
    @NotNull
    private final TextView a;

    public jf0(@NotNull View view) {
        super(view);
        this.a = (TextView)view.findViewById(R.id.item_text);
    }

    @Override
    public final void a(zx zx2) {
        zx2 = (zx.e)zx2;
        this.a.setText((CharSequence)zx2.a());
    }
}


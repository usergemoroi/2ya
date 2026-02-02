/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  com.yandex.mobile.ads.impl.do
 *  com.yandex.mobile.ads.impl.ko
 *  com.yandex.mobile.ads.impl.mo
 *  com.yandex.mobile.ads.impl.qe2
 *  com.yandex.mobile.ads.impl.qr0
 *  com.yandex.mobile.ads.impl.vb1
 */
package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.view.View;
import com.yandex.mobile.ads.impl.do;
import com.yandex.mobile.ads.impl.ko;
import com.yandex.mobile.ads.impl.lu;
import com.yandex.mobile.ads.impl.mo;
import com.yandex.mobile.ads.impl.qe2;
import com.yandex.mobile.ads.impl.qr0;
import com.yandex.mobile.ads.impl.vb1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class re2
implements ko {
    @NotNull
    private final vb1 a;
    @Nullable
    private final lu b;

    public re2(@NotNull vb1 vb12, @Nullable lu lu3) {
        this.a = vb12;
        this.b = lu3;
    }

    @SuppressLint(value={"ClickableViewAccessibility"})
    public final void a(@NotNull qr0 qr02, @NotNull mo mo3) {
        qr02 = new do(this.a.getContext(), (View.OnClickListener)new qe2(qr02, mo3, this.b));
        mo3 = this.a;
        mo3.setOnTouchListener((View.OnTouchListener)qr02);
        mo3.setOnClickListener((View.OnClickListener)qr02);
        mo3 = this.a.b().a();
        if (mo3 != null) {
            mo3.setOnTouchListener((View.OnTouchListener)qr02);
            mo3.setOnClickListener((View.OnClickListener)qr02);
        }
    }
}


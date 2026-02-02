/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  com.yandex.mobile.ads.impl.b61
 *  com.yandex.mobile.ads.impl.b61$a
 *  com.yandex.mobile.ads.impl.do
 *  com.yandex.mobile.ads.impl.g71
 *  com.yandex.mobile.ads.impl.ko
 *  com.yandex.mobile.ads.impl.mo
 *  com.yandex.mobile.ads.impl.qr0
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.b61;
import com.yandex.mobile.ads.impl.do;
import com.yandex.mobile.ads.impl.g71;
import com.yandex.mobile.ads.impl.ko;
import com.yandex.mobile.ads.impl.mo;
import com.yandex.mobile.ads.impl.qr0;
import org.jetbrains.annotations.NotNull;

public final class ih2
implements ko {
    @NotNull
    private final View a;

    public ih2(@NotNull View view) {
        this.a = view;
    }

    public final void a(@NotNull qr0 qr02, @NotNull mo mo3) {
        qr02 = new do(this.a.getContext(), mo3.a(qr02));
        int n10 = b61.e;
        qr02 = new g71((do)qr02, b61.a.a());
        this.a.setOnTouchListener((View.OnTouchListener)qr02);
        this.a.setOnClickListener((View.OnClickListener)qr02);
    }
}


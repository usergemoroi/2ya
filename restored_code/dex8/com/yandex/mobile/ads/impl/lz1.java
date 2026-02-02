/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.ImageView$ScaleType
 *  com.yandex.mobile.ads.impl.aj0
 *  com.yandex.mobile.ads.impl.mq1
 *  com.yandex.mobile.ads.impl.si0
 */
package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import com.yandex.mobile.ads.impl.aj0;
import com.yandex.mobile.ads.impl.fd1;
import com.yandex.mobile.ads.impl.mq1;
import com.yandex.mobile.ads.impl.si0;
import org.jetbrains.annotations.NotNull;

public final class lz1
extends aj0 {
    @NotNull
    private final si0 g;

    public lz1(@NotNull mq1 mq12, @NotNull fd1.b b10, @NotNull si0 si02) {
        super(mq12, b10);
        this.g = si02;
    }

    @NotNull
    public final String a(@NotNull String string2, int n10, int n13, @NotNull ImageView.ScaleType scaleType) {
        this.g.getClass();
        return si0.b((String)string2, (ImageView.ScaleType)scaleType);
    }
}


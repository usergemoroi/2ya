/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.R$string
 *  com.yandex.mobile.ads.impl.cn0
 *  com.yandex.mobile.ads.impl.zb2
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.cn0;
import com.yandex.mobile.ads.impl.zb2;
import java.util.Arrays;
import kotlin.jvm.internal.y;
import kotlin.jvm.internal.z0;
import org.jetbrains.annotations.NotNull;

public final class y5
implements cn0 {
    private static final int c = R.string.monetization_ads_internal_instream_ad_position;
    private final int a;
    private final int b;

    public y5(int n10, int n13) {
        this.a = n10;
        this.b = n13;
    }

    public final void a(@NotNull zb2 zb22) {
        if ((zb22 = zb22.b()) != null) {
            String string2 = zb22.getContext().getResources().getString(c);
            z0 z02 = z0.a;
            string2 = String.format(string2, Arrays.copyOf(new Object[]{this.a, this.b}, 2));
            y.i(string2, "format(...)");
            zb22.setText((CharSequence)string2);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  com.yandex.mobile.ads.impl.gh2
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.qn1
 *  kotlin.ranges.j
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.gh2;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.qn1;
import com.yandex.mobile.ads.impl.wp1;
import java.util.Arrays;
import kotlin.jvm.internal.y;
import kotlin.jvm.internal.z0;
import kotlin.ranges.j;
import org.jetbrains.annotations.NotNull;

public final class pn1<V extends View>
extends gh2<V, String> {
    @NotNull
    private final wp1 c;

    public pn1(@NotNull V v14, @NotNull wp1 wp12) {
        super(v14);
        this.c = wp12;
    }

    public final void a(@NotNull V v14) {
        ((qn1)v14).setRating(0.0f);
        v14.setVisibility(8);
        v14.setOnClickListener(null);
        v14.setOnTouchListener(null);
        v14.setSelected(false);
    }

    public final void b(View object, Object object2) {
        object2 = (String)object2;
        try {
            float f11 = Float.parseFloat((String)object2);
            ((qn1)object).setRating(j.d((float)f11, (float)0.0f));
        }
        catch (NumberFormatException numberFormatException) {
            object = z0.a;
            y.i(String.format("Could not parse rating value. Rating value is %s", Arrays.copyOf(new Object[]{object2}, 1)), "format(...)");
            int n10 = op0.b;
            this.c.reportError("Could not parse rating value", numberFormatException);
        }
    }
}


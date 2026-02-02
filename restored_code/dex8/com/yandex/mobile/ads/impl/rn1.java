/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 *  android.widget.TextView
 *  com.yandex.mobile.ads.R$id
 *  com.yandex.mobile.ads.impl.d51
 *  com.yandex.mobile.ads.impl.gt
 *  com.yandex.mobile.ads.impl.j41
 *  com.yandex.mobile.ads.impl.sn1
 *  com.yandex.mobile.ads.impl.t00
 */
package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.d51;
import com.yandex.mobile.ads.impl.gt;
import com.yandex.mobile.ads.impl.j41;
import com.yandex.mobile.ads.impl.sn1;
import com.yandex.mobile.ads.impl.t00;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;

public final class rn1<V extends ViewGroup>
implements t00<V> {
    @NotNull
    private final gt a;
    @NotNull
    private final sn1 b;
    @NotNull
    private final j41 c;
    @NotNull
    private final d51 d;

    @JvmOverloads
    public rn1(@NotNull gt gt3, @NotNull sn1 sn12, @NotNull j41 j412, @NotNull d51 d512) {
        this.a = gt3;
        this.b = sn12;
        this.c = j412;
        this.d = d512;
    }

    public final void a(@NotNull V object) {
        this.d.getClass();
        ViewGroup viewGroup = (ViewGroup)object.findViewById(R.id.rating_container);
        Serializable serializable = this.a.k();
        if (serializable != null) {
            this.c.getClass();
            viewGroup = (TextView)object.findViewById(R.id.rating_text);
            if (viewGroup != null) {
                object = this.b;
                float f11 = ((Float)serializable).floatValue();
                object.getClass();
                try {
                    serializable = new DecimalFormatSymbols();
                    ((DecimalFormatSymbols)serializable).setDecimalSeparator(',');
                    object = new DecimalFormat("0.0", (DecimalFormatSymbols)serializable);
                    object = ((NumberFormat)object).format(f11);
                }
                catch (RuntimeException runtimeException) {
                    object = String.valueOf(f11);
                }
                viewGroup.setText((CharSequence)object);
            }
        } else if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }

    public final void c() {
    }
}


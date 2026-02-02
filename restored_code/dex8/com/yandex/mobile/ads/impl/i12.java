/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 *  androidx.core.content.ContextCompat
 *  com.yandex.mobile.ads.R$drawable
 *  com.yandex.mobile.ads.R$string
 *  com.yandex.mobile.ads.impl.e92
 *  com.yandex.mobile.ads.impl.f92
 *  com.yandex.mobile.ads.impl.h12
 *  com.yandex.mobile.ads.impl.j12
 *  com.yandex.mobile.ads.impl.zb2
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.e92;
import com.yandex.mobile.ads.impl.f92;
import com.yandex.mobile.ads.impl.h12;
import com.yandex.mobile.ads.impl.j12;
import com.yandex.mobile.ads.impl.zb;
import com.yandex.mobile.ads.impl.zb2;
import org.jetbrains.annotations.NotNull;

public final class i12
implements zb {
    @NotNull
    private final j12 a;

    public i12(@NotNull j12 j122) {
        this.a = j122;
    }

    public final void a(@NotNull zb2 zb22) {
        TextView textView = zb22.p();
        if (textView != null) {
            textView.setText(R.string.monetization_ads_internal_instream_sponsored_social);
            textView.setVisibility(0);
            textView.setOnClickListener((View.OnClickListener)new h12(this.a, new f92(new e92())));
        }
        if ((zb22 = zb22.o()) != null) {
            zb22.setImageDrawable(ContextCompat.getDrawable((Context)zb22.getContext(), (int)R.drawable.monetization_ads_instream_internal_advertiser_social));
            zb22.setVisibility(0);
            zb22.setOnClickListener((View.OnClickListener)new h12(this.a, new f92(new e92())));
        }
    }
}


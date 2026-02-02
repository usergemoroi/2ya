/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.widget.TextView
 *  androidx.core.content.ContextCompat
 *  com.yandex.mobile.ads.R$drawable
 *  com.yandex.mobile.ads.R$string
 *  com.yandex.mobile.ads.impl.zb2
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.zb;
import com.yandex.mobile.ads.impl.zb2;
import org.jetbrains.annotations.NotNull;

public final class sy
implements zb {
    public final void a(@NotNull zb2 zb22) {
        TextView textView = zb22.p();
        if (textView != null) {
            textView.setText(R.string.monetization_ads_internal_instream_sponsored_default);
            textView.setVisibility(0);
        }
        if ((zb22 = zb22.o()) != null) {
            zb22.setImageDrawable(ContextCompat.getDrawable((Context)zb22.getContext(), (int)R.drawable.monetization_ads_instream_internal_advertiser));
            zb22.setVisibility(0);
        }
    }
}


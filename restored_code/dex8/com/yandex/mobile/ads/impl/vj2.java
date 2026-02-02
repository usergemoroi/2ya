/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.TextView
 *  com.monetization.ads.fullscreen.template.view.ExtendedTextView
 *  com.yandex.mobile.ads.impl.cn0
 *  com.yandex.mobile.ads.impl.ou0
 *  com.yandex.mobile.ads.impl.vf
 *  com.yandex.mobile.ads.impl.zb2
 *  com.yandex.mobile.ads.impl.zf
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;
import com.monetization.ads.fullscreen.template.view.ExtendedTextView;
import com.yandex.mobile.ads.impl.cn0;
import com.yandex.mobile.ads.impl.db0;
import com.yandex.mobile.ads.impl.ou0;
import com.yandex.mobile.ads.impl.vf;
import com.yandex.mobile.ads.impl.zb2;
import com.yandex.mobile.ads.impl.zf;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class vj2
implements cn0 {
    @Nullable
    private final vf<?> a;
    @NotNull
    private final zf b;

    public vj2(@Nullable vf<?> vf3, @NotNull zf zf2) {
        this.a = vf3;
        this.b = zf2;
    }

    public final void a(@NotNull zb2 object) {
        TextView textView = object.s();
        object = this.a;
        object = object != null ? object.d() : null;
        if (textView instanceof ExtendedTextView && object instanceof String) {
            db0 db02 = new db0();
            ExtendedTextView extendedTextView = (ExtendedTextView)textView;
            extendedTextView.setText((CharSequence)object);
            extendedTextView.setVisibility(0);
            extendedTextView.setAutoSizeTextType(1);
            extendedTextView.setMeasureSpecProvider((ou0)db02);
            this.b.a((View)textView, this.a);
        } else if (textView != null) {
            textView.setVisibility(8);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.TextView
 *  com.yandex.mobile.ads.impl.cn0
 *  com.yandex.mobile.ads.impl.vf
 *  com.yandex.mobile.ads.impl.zb2
 *  com.yandex.mobile.ads.impl.zf
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.impl.cn0;
import com.yandex.mobile.ads.impl.vf;
import com.yandex.mobile.ads.impl.zb2;
import com.yandex.mobile.ads.impl.zf;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class n30
implements cn0 {
    @Nullable
    private final vf<?> a;
    @NotNull
    private final zf b;

    public n30(@Nullable vf<?> vf3, @NotNull zf zf2) {
        this.a = vf3;
        this.b = zf2;
    }

    public final void a(@NotNull zb2 object) {
        TextView textView = object.f();
        object = this.a;
        object = object != null ? object.d() : null;
        if (textView != null) {
            if (object instanceof String) {
                textView.setText((CharSequence)object);
                textView.setVisibility(0);
                this.b.a((View)textView, this.a);
            } else {
                textView.setVisibility(8);
            }
        }
    }
}


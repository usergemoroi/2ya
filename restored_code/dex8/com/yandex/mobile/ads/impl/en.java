/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.TextView
 *  com.yandex.mobile.ads.impl.cn0
 *  com.yandex.mobile.ads.impl.go
 *  com.yandex.mobile.ads.impl.vf
 *  com.yandex.mobile.ads.impl.zb2
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.mobile.ads.impl.cn0;
import com.yandex.mobile.ads.impl.go;
import com.yandex.mobile.ads.impl.vf;
import com.yandex.mobile.ads.impl.zb2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class en
implements cn0 {
    @Nullable
    private final vf<?> a;
    @NotNull
    private final go b;

    public en(@Nullable vf<?> vf3, @NotNull go go3) {
        this.a = vf3;
        this.b = go3;
    }

    public final void a(@NotNull zb2 object) {
        TextView textView = object.e();
        ImageView imageView = object.d();
        if (textView != null) {
            object = this.a;
            object = object != null ? object.d() : null;
            if (object instanceof String) {
                textView.setVisibility(0);
                textView.setText((CharSequence)object);
            } else {
                textView.setVisibility(8);
            }
            this.b.a((View)textView);
        }
        if (imageView != null) {
            this.b.a((View)imageView);
        }
    }
}


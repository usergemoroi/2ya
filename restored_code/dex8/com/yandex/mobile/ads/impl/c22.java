/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils$TruncateAt
 *  android.view.View
 *  android.widget.TextView
 *  com.yandex.mobile.ads.impl.cn0
 *  com.yandex.mobile.ads.impl.d22
 *  com.yandex.mobile.ads.impl.j9
 *  com.yandex.mobile.ads.impl.vf
 *  com.yandex.mobile.ads.impl.zb2
 *  com.yandex.mobile.ads.impl.zf
 */
package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.impl.cn0;
import com.yandex.mobile.ads.impl.d22;
import com.yandex.mobile.ads.impl.j9;
import com.yandex.mobile.ads.impl.vf;
import com.yandex.mobile.ads.impl.zb2;
import com.yandex.mobile.ads.impl.zf;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class c22
implements cn0 {
    @Nullable
    private final vf<?> a;
    @Nullable
    private final j9 b;
    @NotNull
    private final zf c;
    @NotNull
    private final d22 d;

    public c22(@Nullable vf<?> vf3, @Nullable j9 j92, @NotNull zf zf2, @NotNull d22 d222) {
        this.a = vf3;
        this.b = j92;
        this.c = zf2;
        this.d = d222;
    }

    public final void a(@NotNull zb2 object) {
        TextView textView = object.p();
        if (textView != null) {
            object = this.a;
            object = object != null ? object.d() : null;
            if (object instanceof String) {
                textView.setText((CharSequence)object);
                textView.setVisibility(0);
            }
            if ((object = this.b) != null && object.b()) {
                object = this.b;
                String string2 = ((Object)textView.getText()).toString();
                textView.setText((CharSequence)this.d.a(string2, object));
                textView.setVisibility(0);
                textView.setSelected(true);
                textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                textView.setMarqueeRepeatLimit(-1);
            }
            this.c.a((View)textView, this.a);
        }
    }
}


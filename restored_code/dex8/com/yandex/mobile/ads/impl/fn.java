/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.TextView
 *  com.yandex.mobile.ads.impl.cn0
 *  com.yandex.mobile.ads.impl.zb2
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.impl.cn0;
import com.yandex.mobile.ads.impl.zb2;
import org.jetbrains.annotations.NotNull;

public final class fn
implements cn0 {
    public final void a(@NotNull zb2 zb22) {
        View view = zb22.c();
        TextView textView = zb22.f();
        zb22 = zb22.g();
        if (textView != null && textView.getVisibility() == 8 && zb22 != null && zb22.getVisibility() == 8 && view != null) {
            view.setBackground(null);
        }
    }
}


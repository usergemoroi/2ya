/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.TextView
 *  com.yandex.mobile.ads.impl.q52
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.impl.q52;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class r52
implements q52 {
    @Nullable
    public final TextView a(@NotNull View object) {
        object = (object = object.findViewWithTag((Object)"timer_value")) instanceof TextView ? (TextView)object : null;
        return object;
    }

    @Nullable
    public final View b(@NotNull View view) {
        if (!((view = view.findViewWithTag((Object)"timer_container")) instanceof View)) {
            view = null;
        }
        return view;
    }
}


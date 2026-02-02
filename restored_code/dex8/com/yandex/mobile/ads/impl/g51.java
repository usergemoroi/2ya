/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ProgressBar
 *  com.yandex.mobile.ads.impl.e51
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ProgressBar;
import com.yandex.mobile.ads.impl.e51;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class g51
implements e51 {
    @Nullable
    public final ProgressBar a(@NotNull View view) {
        return (ProgressBar)view.findViewWithTag((Object)"close_progress_view");
    }

    @Nullable
    public final View b(@NotNull View view) {
        return view.findViewWithTag((Object)"skip_button");
    }

    @Nullable
    public final View c(@NotNull View view) {
        return view.findViewWithTag((Object)"close");
    }
}


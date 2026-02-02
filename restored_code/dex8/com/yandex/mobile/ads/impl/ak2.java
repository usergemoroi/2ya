/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.CheckBox
 *  android.widget.ProgressBar
 *  android.widget.TextView
 *  com.yandex.mobile.ads.impl.s71
 *  com.yandex.mobile.ads.impl.uv0
 */
package com.yandex.mobile.ads.impl;

import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.yandex.mobile.ads.impl.s71;
import com.yandex.mobile.ads.impl.uv0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ak2
implements uv0 {
    @NotNull
    private final s71 a;

    public ak2(@NotNull s71 s712) {
        this.a = s712;
    }

    @Nullable
    public final TextView getCountDownProgress() {
        return null;
    }

    @Nullable
    public final CheckBox getMuteControl() {
        return this.a.d();
    }

    @Nullable
    public final ProgressBar getVideoProgress() {
        return this.a.f();
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.CheckBox
 *  android.widget.ProgressBar
 *  android.widget.TextView
 *  com.yandex.mobile.ads.impl.uv0
 */
package com.yandex.mobile.ads.impl;

import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.yandex.mobile.ads.impl.uv0;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ev
implements uv0 {
    @Nullable
    private final CheckBox a;
    @Nullable
    private final ProgressBar b;
    @Nullable
    private final TextView c;

    public ev() {
        this(0);
    }

    public /* synthetic */ ev(int n10) {
        this(null, null, null);
    }

    public ev(@Nullable CheckBox checkBox, @Nullable ProgressBar progressBar, @Nullable TextView textView) {
        this.a = checkBox;
        this.b = progressBar;
        this.c = textView;
    }

    public final boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ev)) {
            return false;
        }
        object = (ev)object;
        if (!y.e(this.a, ((ev)object).a)) {
            return false;
        }
        if (!y.e(this.b, ((ev)object).b)) {
            return false;
        }
        return y.e(this.c, ((ev)object).c);
    }

    @Nullable
    public final TextView getCountDownProgress() {
        return this.c;
    }

    @Nullable
    public final CheckBox getMuteControl() {
        return this.a;
    }

    @Nullable
    public final ProgressBar getVideoProgress() {
        return this.b;
    }

    public final int hashCode() {
        CheckBox checkBox = this.a;
        int n10 = 0;
        int n12 = checkBox == null ? 0 : checkBox.hashCode();
        checkBox = this.b;
        int n13 = checkBox == null ? 0 : checkBox.hashCode();
        checkBox = this.c;
        if (checkBox != null) {
            n10 = checkBox.hashCode();
        }
        return (n12 * 31 + n13) * 31 + n10;
    }

    @NotNull
    public final String toString() {
        CheckBox checkBox = this.a;
        ProgressBar progressBar = this.b;
        TextView textView = this.c;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CustomControlsContainer(muteControl=");
        stringBuilder.append(checkBox);
        stringBuilder.append(", videoProgress=");
        stringBuilder.append(progressBar);
        stringBuilder.append(", countDownProgress=");
        stringBuilder.append(textView);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}


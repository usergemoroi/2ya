/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  com.yandex.mobile.ads.impl.nz1
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.nz1;
import org.jetbrains.annotations.NotNull;

public final class g00
implements nz1 {
    public final void a(@NotNull View view) {
        view.setVisibility(8);
        view.setEnabled(false);
    }

    public final void b(@NotNull View view) {
        view.setVisibility(0);
        view.setEnabled(true);
    }
}


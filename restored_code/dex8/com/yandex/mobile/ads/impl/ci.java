/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.TransitionDrawable
 *  android.view.View
 *  com.yandex.mobile.ads.impl.sd
 */
package com.yandex.mobile.ads.impl;

import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import com.yandex.mobile.ads.impl.sd;
import org.jetbrains.annotations.NotNull;

public final class ci<T extends View>
implements sd<T> {
    public final void a(@NotNull T object) {
        if ((object = object.getBackground()) instanceof TransitionDrawable) {
            ((TransitionDrawable)object).startTransition(500);
        }
    }

    public final void cancel() {
    }
}


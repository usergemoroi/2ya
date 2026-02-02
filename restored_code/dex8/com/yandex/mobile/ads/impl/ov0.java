/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.Surface
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.gv0
 */
package com.yandex.mobile.ads.impl;

import android.view.Surface;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.fv0;
import com.yandex.mobile.ads.impl.gv0;

public final class ov0
extends fv0 {
    public ov0(IllegalStateException illegalStateException, @Nullable gv0 gv02, @Nullable Surface surface) {
        super(illegalStateException, gv02);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
    }
}


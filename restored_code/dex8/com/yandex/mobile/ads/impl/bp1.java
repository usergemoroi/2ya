/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  com.yandex.mobile.ads.impl.ap1
 */
package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import com.yandex.mobile.ads.impl.ap1;
import org.jetbrains.annotations.Nullable;

public final class bp1
implements ap1 {
    @Nullable
    private Long a;

    public final void a() {
        this.a = SystemClock.elapsedRealtime();
    }

    public final long b() {
        long l10;
        Long l11 = this.a;
        if (l11 != null) {
            l10 = l11;
            l10 = SystemClock.elapsedRealtime() - l10;
        } else {
            l10 = 0L;
        }
        return l10;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 *  android.os.SystemClock
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.bf0
 *  com.yandex.mobile.ads.impl.xo
 */
package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.bf0;
import com.yandex.mobile.ads.impl.d42;
import com.yandex.mobile.ads.impl.xo;

public final class b42
implements xo {
    protected b42() {
    }

    public final long a() {
        return SystemClock.uptimeMillis();
    }

    public final bf0 a(Looper looper, @Nullable Handler.Callback callback) {
        return new d42(new Handler(looper, callback));
    }

    public final long b() {
        return SystemClock.elapsedRealtime();
    }
}


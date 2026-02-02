/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  com.yandex.mobile.ads.impl.bu
 *  com.yandex.mobile.ads.impl.gf2
 *  com.yandex.mobile.ads.impl.jr2
 */
package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.impl.bu;
import com.yandex.mobile.ads.impl.gf2;
import com.yandex.mobile.ads.impl.jr2;
import com.yandex.mobile.ads.impl.lo2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class bf2
implements gf2 {
    @NotNull
    private final Handler a = new Handler(Looper.getMainLooper());
    @Nullable
    private bu b;

    private static final void a(bf2 bf22) {
        bf22 = bf22.b;
        if (bf22 != null) {
            bf22.onVideoComplete();
        }
    }

    public static /* synthetic */ void b(bf2 bf22) {
        bf2.a(bf22);
    }

    public final void a(@Nullable lo2 lo22) {
        this.b = lo22;
    }

    public final void onVideoComplete() {
        this.a.post((Runnable)new jr2(this));
    }
}


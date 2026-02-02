/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  com.yandex.mobile.ads.impl.f1
 *  com.yandex.mobile.ads.impl.op0
 */
package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import com.yandex.mobile.ads.impl.f1;
import com.yandex.mobile.ads.impl.g8;
import com.yandex.mobile.ads.impl.op0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class r1
implements f1 {
    @NotNull
    private final Activity a;
    @Nullable
    private final g8 b;

    public r1(@NotNull Activity activity, @Nullable g8 g84) {
        this.a = activity;
        this.b = g84;
    }

    public final void a() {
        this.a.finish();
    }

    public final void a(int n10) {
        try {
            if (Build.VERSION.SDK_INT != 26) {
                this.a.setRequestedOrientation(n10);
            }
        }
        catch (Exception exception) {
            n10 = op0.b;
        }
    }

    public final void a(int n10, @Nullable Bundle bundle) {
        g8 g84 = this.b;
        if (g84 != null) {
            g84.a(n10, bundle);
        }
    }
}


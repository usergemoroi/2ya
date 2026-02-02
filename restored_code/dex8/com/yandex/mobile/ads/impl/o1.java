/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 *  android.view.Window
 *  android.widget.RelativeLayout
 *  com.yandex.mobile.ads.impl.a1
 *  com.yandex.mobile.ads.impl.i1
 *  com.yandex.mobile.ads.impl.j1
 *  com.yandex.mobile.ads.impl.q0
 *  com.yandex.mobile.ads.impl.y0
 */
package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Intent;
import android.view.Window;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.impl.a1;
import com.yandex.mobile.ads.impl.i1;
import com.yandex.mobile.ads.impl.j1;
import com.yandex.mobile.ads.impl.n1;
import com.yandex.mobile.ads.impl.q0;
import com.yandex.mobile.ads.impl.r1;
import com.yandex.mobile.ads.impl.wp1;
import com.yandex.mobile.ads.impl.y0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class o1
implements j1 {
    @Nullable
    public final i1 a(@NotNull Activity activity, @NotNull RelativeLayout relativeLayout, @NotNull r1 r12, @NotNull a1 a14, @NotNull Intent intent, @NotNull Window window, @Nullable y0 y04) {
        if (y04 == null) {
            return null;
        }
        return new n1(activity, y04, new q0((wp1)y04.b().p().c()));
    }
}


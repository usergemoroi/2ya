/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.n50
 *  com.yandex.mobile.ads.impl.sp1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.n50;
import com.yandex.mobile.ads.impl.sp1;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

public interface wp1
extends n50 {
    public void a(@NotNull sp1 var1);

    public void reportAnr(@NotNull Map<Thread, StackTraceElement[]> var1);

    public void reportUnhandledException(@NotNull Throwable var1);
}


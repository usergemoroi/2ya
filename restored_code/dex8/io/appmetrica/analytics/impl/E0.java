/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 */
package io.appmetrica.analytics.impl;

import android.os.Looper;
import io.appmetrica.analytics.impl.f0;
import java.util.Map;

public final class e0 {
    public final Map a;
    public final Thread b;

    public e0(f0 f04, Map map2) {
        this.a = map2;
        this.b = Looper.getMainLooper().getThread();
    }
}


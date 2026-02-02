/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.M4;
import io.appmetrica.analytics.impl.M5;
import io.appmetrica.analytics.impl.k6;
import io.appmetrica.analytics.impl.om;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

public abstract class e5
extends M5 {
    public e5(@NonNull BaseRequestConfig.ComponentLoader<Object, Object, k6> componentLoader, @NonNull om om3, @NonNull BaseRequestConfig.BaseRequestArguments<M4, Object> baseRequestArguments) {
        super(componentLoader, om3, baseRequestArguments);
    }

    public final void a(@NonNull M4 m44) {
        synchronized (this) {
            super.a(m44);
            return;
        }
    }

    @Override
    public final void a(@NonNull Object object) {
        object = (M4)object;
        synchronized (this) {
            super.a(object);
            return;
        }
    }
}


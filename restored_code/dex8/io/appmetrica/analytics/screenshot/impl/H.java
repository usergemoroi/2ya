/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package io.appmetrica.analytics.screenshot.impl;

import android.os.Bundle;
import io.appmetrica.analytics.modulesapi.internal.client.BundleToServiceConfigConverter;
import io.appmetrica.analytics.screenshot.impl.B;
import io.appmetrica.analytics.screenshot.impl.g0;
import org.jetbrains.annotations.NotNull;

public final class h
implements BundleToServiceConfigConverter {
    @NotNull
    public final B a(@NotNull Bundle object) {
        object.setClassLoader(B.class.getClassLoader());
        B b11 = (B)object.getParcelable("config");
        object = b11;
        if (b11 == null) {
            object = new B(new g0());
        }
        return object;
    }
}


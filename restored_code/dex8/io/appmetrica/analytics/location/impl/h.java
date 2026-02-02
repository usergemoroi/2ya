/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.location.impl;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.location.impl.m;

public final class h
implements Consumer {
    public final m a;

    public h(@NonNull m m12) {
        this.a = m12;
    }

    public final void a(@Nullable Location location) {
        if (location != null) {
            this.a.updateData(location);
        }
    }
}


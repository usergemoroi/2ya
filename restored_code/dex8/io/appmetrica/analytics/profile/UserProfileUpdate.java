/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.Vd;
import io.appmetrica.analytics.impl.ko;

public class UserProfileUpdate<T extends ko> {
    private final ko a;

    UserProfileUpdate(Vd vd3) {
        this.a = vd3;
    }

    @NonNull
    public T getUserProfileUpdatePatcher() {
        return (T)this.a;
    }
}


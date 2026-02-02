/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.impl.Ch;
import io.appmetrica.analytics.impl.d7;

public final class mk
extends Ch {
    public mk(@NonNull d7 d72) {
        super(d72);
    }

    @Override
    public final boolean a(@Nullable Boolean bl2) {
        boolean bl3 = !this.a.isRestrictedForSdk() && WrapUtils.getOrDefault(bl2, Boolean.TRUE) != false;
        return bl3;
    }
}


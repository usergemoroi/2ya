/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.impl.R4;
import io.appmetrica.analytics.impl.Rn;
import io.appmetrica.analytics.impl.Z2;
import io.appmetrica.analytics.impl.lo;
import io.appmetrica.analytics.impl.no;
import io.appmetrica.analytics.impl.yo;

public final class gn
extends R4 {
    public final Rn g;

    public gn(@NonNull String string2, @NonNull String string3, @NonNull Rn rn3, @NonNull yo yo3, @NonNull Z2 z24) {
        super(0, string2, string3, yo3, z24);
        this.g = rn3;
    }

    @Override
    public final void a(@NonNull lo object) {
        String string2 = (String)this.g.a((String)this.f);
        no no3 = ((lo)object).d;
        object = string2 == null ? (Object)new byte[0] : (Object)string2.getBytes();
        no3.a = (byte[])object;
    }

    @VisibleForTesting
    public final Rn h() {
        return this.g;
    }
}


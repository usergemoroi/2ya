/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.Qb;
import io.appmetrica.analytics.impl.S6;
import io.appmetrica.analytics.impl.gc;
import io.appmetrica.analytics.impl.ko;
import io.appmetrica.analytics.impl.p6;
import io.appmetrica.analytics.profile.UserProfileUpdate;

public final class CounterAttribute {
    private final S6 a;

    CounterAttribute(String string2, Qb qb3, gc gc2) {
        this.a = new S6(string2, qb3, gc2);
    }

    @NonNull
    public UserProfileUpdate<? extends ko> withDelta(double d14) {
        return new UserProfileUpdate(new p6(this.a.c, d14));
    }
}


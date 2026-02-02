/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.Ae;
import io.appmetrica.analytics.impl.K4;
import io.appmetrica.analytics.impl.Q4;
import io.appmetrica.analytics.impl.Qb;
import io.appmetrica.analytics.impl.S6;
import io.appmetrica.analytics.impl.Xi;
import io.appmetrica.analytics.impl.Z2;
import io.appmetrica.analytics.impl.gc;
import io.appmetrica.analytics.impl.hl;
import io.appmetrica.analytics.impl.ko;
import io.appmetrica.analytics.impl.yo;
import io.appmetrica.analytics.profile.UserProfileUpdate;

public final class NumberAttribute {
    private final S6 a;

    NumberAttribute(String string2, Qb qb3, gc gc2) {
        this.a = new S6(string2, qb3, gc2);
    }

    @NonNull
    public UserProfileUpdate<? extends ko> withValue(double d14) {
        return new UserProfileUpdate(new Ae(this.a.c, d14, (yo)new Qb(), (Z2)new Q4(new gc(new K4(100)))));
    }

    @NonNull
    public UserProfileUpdate<? extends ko> withValueIfUndefined(double d14) {
        return new UserProfileUpdate(new Ae(this.a.c, d14, (yo)new Qb(), (Z2)new hl(new gc(new K4(100)))));
    }

    @NonNull
    public UserProfileUpdate<? extends ko> withValueReset() {
        return new UserProfileUpdate(new Xi(1, this.a.c, (yo)new Qb(), new gc(new K4(100))));
    }
}


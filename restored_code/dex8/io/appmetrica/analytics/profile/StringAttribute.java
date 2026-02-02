/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.Q4;
import io.appmetrica.analytics.impl.Rn;
import io.appmetrica.analytics.impl.S6;
import io.appmetrica.analytics.impl.Xi;
import io.appmetrica.analytics.impl.Z2;
import io.appmetrica.analytics.impl.fn;
import io.appmetrica.analytics.impl.gn;
import io.appmetrica.analytics.impl.hl;
import io.appmetrica.analytics.impl.ko;
import io.appmetrica.analytics.impl.r2;
import io.appmetrica.analytics.impl.yo;
import io.appmetrica.analytics.profile.UserProfileUpdate;

public class StringAttribute {
    private final Rn a;
    private final S6 b;

    StringAttribute(String string2, fn fn3, yo yo3, r2 r24) {
        this.b = new S6(string2, yo3, r24);
        this.a = fn3;
    }

    @NonNull
    public UserProfileUpdate<? extends ko> withValue(@NonNull String string2) {
        S6 s64 = this.b;
        return new UserProfileUpdate(new gn(s64.c, string2, this.a, s64.a, (Z2)new Q4(s64.b)));
    }

    @NonNull
    public UserProfileUpdate<? extends ko> withValueIfUndefined(@NonNull String string2) {
        S6 s64 = this.b;
        return new UserProfileUpdate(new gn(s64.c, string2, this.a, s64.a, (Z2)new hl(s64.b)));
    }

    @NonNull
    public UserProfileUpdate<? extends ko> withValueReset() {
        S6 s64 = this.b;
        return new UserProfileUpdate(new Xi(0, s64.c, s64.a, s64.b));
    }
}


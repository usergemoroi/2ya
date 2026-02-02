/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.Q4;
import io.appmetrica.analytics.impl.S6;
import io.appmetrica.analytics.impl.Xi;
import io.appmetrica.analytics.impl.Z2;
import io.appmetrica.analytics.impl.hl;
import io.appmetrica.analytics.impl.ko;
import io.appmetrica.analytics.impl.r2;
import io.appmetrica.analytics.impl.w3;
import io.appmetrica.analytics.impl.yo;
import io.appmetrica.analytics.profile.UserProfileUpdate;

public class BooleanAttribute {
    private final S6 a;

    BooleanAttribute(String string2, yo yo3, r2 r24) {
        this.a = new S6(string2, yo3, r24);
    }

    @NonNull
    public UserProfileUpdate<? extends ko> withValue(boolean bl2) {
        S6 s64 = this.a;
        return new UserProfileUpdate(new w3(s64.c, bl2, s64.a, (Z2)new Q4(s64.b)));
    }

    @NonNull
    public UserProfileUpdate<? extends ko> withValueIfUndefined(boolean bl2) {
        S6 s64 = this.a;
        return new UserProfileUpdate(new w3(s64.c, bl2, s64.a, (Z2)new hl(s64.b)));
    }

    @NonNull
    public UserProfileUpdate<? extends ko> withValueReset() {
        S6 s64 = this.a;
        return new UserProfileUpdate(new Xi(3, s64.c, s64.a, s64.b));
    }
}


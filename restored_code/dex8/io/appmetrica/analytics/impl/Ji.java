/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Ci;
import io.appmetrica.analytics.profile.UserProfile;

public final class ji
implements Runnable {
    public final UserProfile a;
    public final Ci b;

    public ji(Ci ci2, UserProfile userProfile) {
        this.b = ci2;
        this.a = userProfile;
    }

    @Override
    public final void run() {
        Ci ci2 = this.b;
        Ci.a(ci2.a, ci2.d, ci2.e).reportUserProfile(this.a);
    }
}


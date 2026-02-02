/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Ci;

public final class ii
implements Runnable {
    public final String a;
    public final Ci b;

    public ii(Ci ci2, String string2) {
        this.b = ci2;
        this.a = string2;
    }

    @Override
    public final void run() {
        Ci ci2 = this.b;
        Ci.a(ci2.a, ci2.d, ci2.e).setUserProfileID(this.a);
    }
}


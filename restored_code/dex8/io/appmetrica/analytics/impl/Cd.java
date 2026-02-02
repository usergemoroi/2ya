/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.K4;
import io.appmetrica.analytics.impl.fn;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

public final class cd {
    public final fn a;
    public final fn b;
    public final K4 c;
    public final PublicLogger d;
    public final String e;

    public cd(K4 k44, fn fn3, fn fn4, String string2, PublicLogger publicLogger) {
        this.c = k44;
        this.a = fn3;
        this.b = fn4;
        this.e = string2;
        this.d = publicLogger;
    }

    public cd(String string2, PublicLogger publicLogger) {
        this(new K4(30), new fn(50, string2.concat("map key"), publicLogger), new fn(4000, string2.concat("map value"), publicLogger), string2, publicLogger);
    }
}


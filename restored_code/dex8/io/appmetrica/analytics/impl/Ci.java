/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.Ci;
import java.util.List;

public final class ci
implements Runnable {
    public final String a;
    public final List b;
    public final Ci c;

    public ci(Ci ci2, String string2, List list) {
        this.c = ci2;
        this.a = string2;
        this.b = list;
    }

    @Override
    public final void run() {
        Ci ci2 = this.c;
        Ci.a(ci2.a, ci2.d, ci2.e).reportEvent(this.a, CollectionUtils.getMapFromList(this.b));
    }
}


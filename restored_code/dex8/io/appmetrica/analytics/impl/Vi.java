/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.Ci;
import java.util.List;

public final class vi
implements Runnable {
    public final List a;
    public final Ci b;

    public vi(Ci ci2, List list) {
        this.b = ci2;
        this.a = list;
    }

    @Override
    public final void run() {
        Ci ci2 = this.b;
        Ci.a(ci2.a, ci2.d, ci2.e).reportAnr(CollectionUtils.getMapFromList(this.a));
    }
}


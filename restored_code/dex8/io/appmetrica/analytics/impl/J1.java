/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.r1;
import java.util.List;

public final class j1
implements Runnable {
    public final List a;
    public final r1 b;

    public j1(r1 r14, List list) {
        this.b = r14;
        this.a = list;
    }

    @Override
    public final void run() {
        r1.a(this.b).reportAnr(CollectionUtils.getMapFromList(this.a));
    }
}


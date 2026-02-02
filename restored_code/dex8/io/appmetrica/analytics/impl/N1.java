/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.r1;
import java.util.List;

public final class n1
implements Runnable {
    public final String a;
    public final List b;
    public final r1 c;

    public n1(r1 r14, String string2, List list) {
        this.c = r14;
        this.a = string2;
        this.b = list;
    }

    @Override
    public final void run() {
        r1.a(this.c).reportEvent(this.a, CollectionUtils.getMapFromList(this.b));
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.v0;
import java.util.concurrent.Callable;

public final class wq
implements Callable {
    public final v0 a;

    public /* synthetic */ wq(v0 v04) {
        this.a = v04;
    }

    public final Object call() {
        return this.a.p();
    }
}


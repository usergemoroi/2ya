/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.T;
import java.util.concurrent.Callable;

public final class up
implements Callable {
    public final T a;

    public /* synthetic */ up(T t13) {
        this.a = t13;
    }

    public final Object call() {
        return T.e(this.a);
    }
}


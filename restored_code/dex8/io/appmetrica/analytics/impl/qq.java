/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.r1;

public final class qq
implements Runnable {
    public final Object[] c;

    public /* synthetic */ qq(Object[] objectArray) {
        this.c = objectArray;
    }

    @Override
    public final void run() {
        r1.a(this.c);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.r1;

public final class l1
implements Runnable {
    public final String a;
    public final r1 b;

    public l1(r1 r14, String string2) {
        this.b = r14;
        this.a = string2;
    }

    @Override
    public final void run() {
        r1.a(this.b).reportEvent(this.a);
    }
}


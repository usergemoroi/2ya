/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.r1;

public final class m1
implements Runnable {
    public final String a;
    public final String b;
    public final r1 c;

    public m1(r1 r14, String string2, String string3) {
        this.c = r14;
        this.a = string2;
        this.b = string3;
    }

    @Override
    public final void run() {
        r1.a(this.c).reportEvent(this.a, this.b);
    }
}


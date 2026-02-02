/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.C0;

public final class cp
implements Runnable {
    public final C0 c;
    public final String d;
    public final String e;
    public final String f;

    public /* synthetic */ cp(C0 c04, String string2, String string3, String string4) {
        this.c = c04;
        this.d = string2;
        this.e = string3;
        this.f = string4;
    }

    @Override
    public final void run() {
        C0.a(this.c, this.d, this.e, this.f);
    }
}


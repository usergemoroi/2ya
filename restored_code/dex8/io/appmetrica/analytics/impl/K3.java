/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import io.appmetrica.analytics.impl.cg;
import io.appmetrica.analytics.impl.l3;
import io.appmetrica.analytics.impl.o6;
import io.appmetrica.analytics.impl.pb;
import io.appmetrica.analytics.impl.v5;

public final class k3
extends SafeRunnable {
    public final ProductInfo a;
    public final l3 b;

    public k3(l3 l33, ProductInfo productInfo) {
        this.b = l33;
        this.a = productInfo;
    }

    @Override
    public final void runSafety() {
        pb pb3 = this.b.a;
        o6 o63 = o6.a(new cg(this.a));
        ((v5)pb3).a(o63);
    }
}


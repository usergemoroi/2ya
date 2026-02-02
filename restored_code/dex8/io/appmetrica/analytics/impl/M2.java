/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.A4;
import io.appmetrica.analytics.impl.Gc;
import io.appmetrica.analytics.impl.l2;
import java.util.LinkedHashSet;

public final class m2 {
    public final LinkedHashSet a = new LinkedHashSet();

    public final void a(Gc gc2, long l10) {
        synchronized (this) {
            l2 l22 = new l2(gc2, A4.l().c.a(), l10);
            this.a.add(l22);
            return;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Jg;
import io.appmetrica.analytics.impl.Sg;
import java.util.Comparator;

public final class tp
implements Comparator {
    public final Sg c;

    public /* synthetic */ tp(Sg sg2) {
        this.c = sg2;
    }

    public final int compare(Object object, Object object2) {
        return Sg.a(this.c, (Jg)object, (Jg)object2);
    }
}


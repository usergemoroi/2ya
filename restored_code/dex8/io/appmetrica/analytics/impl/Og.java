/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.wo;
import io.appmetrica.analytics.impl.yo;

public final class og
implements yo {
    @Override
    public final wo a(Object object) {
        Integer n10 = (Integer)object;
        if (n10 != null && n10 <= 0) {
            object = new StringBuilder("Invalid quantity value ");
            ((StringBuilder)object).append(n10);
            object = new wo(this, false, ((StringBuilder)object).toString());
        } else {
            object = new wo(this, true, "");
        }
        return object;
    }
}


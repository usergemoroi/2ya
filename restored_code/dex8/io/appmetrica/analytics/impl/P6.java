/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.K4;
import io.appmetrica.analytics.impl.Q4;
import io.appmetrica.analytics.impl.Qb;
import io.appmetrica.analytics.impl.R4;
import io.appmetrica.analytics.impl.gc;
import io.appmetrica.analytics.impl.lo;
import io.appmetrica.analytics.impl.no;

public final class p6
extends R4 {
    public p6(@NonNull String string2, double d14) {
        super(2, string2, d14, new Qb(), new Q4(new gc(new K4(100))));
    }

    @Override
    public final void a(@NonNull lo messageNano) {
        messageNano = messageNano.d;
        double d14 = ((no)messageNano).c;
        ((no)messageNano).c = (Double)this.f + d14;
    }
}


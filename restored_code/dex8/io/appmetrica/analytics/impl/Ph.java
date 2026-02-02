/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.IReporter;
import io.appmetrica.analytics.impl.gd;
import io.appmetrica.analytics.impl.nh;
import io.appmetrica.analytics.impl.o6;
import io.appmetrica.analytics.impl.v5;
import java.util.HashMap;

public final class ph
extends nh {
    public final IReporter b;

    public ph(@NonNull v5 v54, @NonNull IReporter iReporter) {
        super(v54);
        this.b = iReporter;
    }

    @Override
    public final boolean a(@NonNull o6 object) {
        int n10 = ((o6)object).d;
        object = (gd)gd.c.get(n10);
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("type", ((gd)object).a);
        hashMap.put("delivery_method", ((gd)object).b);
        this.b.reportEvent("crash_saved", hashMap);
        return false;
    }
}


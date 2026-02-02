/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.LocationManager
 */
package io.appmetrica.analytics.location.impl;

import android.location.LocationManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.location.impl.u;

public final class y
implements FunctionWithThrowable {
    public final u a;

    public /* synthetic */ y(u u11) {
        this.a = u11;
    }

    public final Object apply(Object object) {
        return u.a(this.a, (LocationManager)object);
    }
}


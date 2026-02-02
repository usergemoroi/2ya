/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.LocationManager
 */
package io.appmetrica.analytics.location.impl;

import android.location.LocationManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.location.impl.r;

public final class x
implements FunctionWithThrowable {
    public final r a;

    public /* synthetic */ x(r r14) {
        this.a = r14;
    }

    public final Object apply(Object object) {
        return r.a(this.a, (LocationManager)object);
    }
}


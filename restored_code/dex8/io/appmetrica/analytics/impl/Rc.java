/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.jvm.functions.l
 *  kotlin.jvm.internal.a0
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.a0;
import kotlin.k0;

public final class rc
extends a0
implements l {
    public static final rc a = new rc();

    public rc() {
        super(1);
    }

    public final Object invoke(Object object) {
        ((LocationControllerObserver)object).stopLocationTracking();
        return k0.a;
    }
}


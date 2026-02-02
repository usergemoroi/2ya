/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 */
package io.appmetrica.analytics.impl;

import android.app.ActivityManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.impl.J2;

public final class op
implements FunctionWithThrowable {
    public final Object apply(Object object) {
        return J2.b((ActivityManager)object);
    }
}


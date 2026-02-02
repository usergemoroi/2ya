/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.telephony.TelephonyManager
 */
package io.appmetrica.analytics.impl;

import android.telephony.TelephonyManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

public final class ul
implements FunctionWithThrowable {
    public final Object apply(Object object) {
        return ((TelephonyManager)object).getSimOperatorName();
    }
}


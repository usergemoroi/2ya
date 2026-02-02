/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.telephony.TelephonyManager
 */
package io.appmetrica.analytics.impl;

import android.telephony.TelephonyManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.impl.wl;

public final class vl
implements FunctionWithThrowable {
    public final wl a;

    public vl(wl wl3) {
        this.a = wl3;
    }

    public final Object apply(Object object) {
        TelephonyManager telephonyManager = (TelephonyManager)object;
        object = this.a;
        object = ((wl)object).b.hasPermission(((wl)object).a, "android.permission.READ_PHONE_STATE") ? Boolean.valueOf(telephonyManager.isNetworkRoaming()) : null;
        return object;
    }
}


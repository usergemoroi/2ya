/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.telephony.TelephonyManager
 *  android.text.TextUtils
 */
package io.appmetrica.analytics.impl;

import android.telephony.TelephonyManager;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

public final class tl
implements FunctionWithThrowable {
    public final Object apply(Object object) {
        object = ((TelephonyManager)object).getSimOperator();
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        Object var3_3 = null;
        object = !bl2 ? ((String)object).substring(3) : null;
        object = TextUtils.isEmpty((CharSequence)object) ? var3_3 : Integer.valueOf(Integer.parseInt((String)object));
        return object;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.UiModeManager
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.app.UiModeManager;
import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.impl.iq;

public abstract class l8 {
    public static final SafePackageManager a = new SafePackageManager();

    public static final Integer a(UiModeManager uiModeManager) {
        return uiModeManager.getCurrentModeType();
    }

    public static boolean a(Context context) {
        Object object = context.getSystemService("uimode");
        object = object instanceof UiModeManager ? (UiModeManager)object : null;
        object = SystemServiceUtils.accessSystemServiceSafelyOrDefault(object, "getting current mode type", "UiModeManager", null, new iq());
        boolean bl2 = true;
        boolean bl3 = object != null && (Integer)object == 4;
        object = a;
        boolean bl4 = ((SafePackageManager)object).hasSystemFeature(context, "android.software.leanback");
        boolean bl5 = AndroidUtils.isApiAchieved(26) ? ((SafePackageManager)object).hasSystemFeature(context, "android.software.leanback_only") : false;
        boolean bl6 = bl2;
        if (!bl3) {
            bl6 = bl2;
            if (!bl4) {
                bl6 = bl5 ? bl2 : false;
            }
        }
        return bl6;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.os.UserManager
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.impl.do;

public final class eo {
    public static boolean a(Context context) {
        boolean bl2 = Build.VERSION.SDK_INT >= 24 ? SystemServiceUtils.accessSystemServiceSafelyOrDefault((UserManager)context.getSystemService(UserManager.class), "detect unlocked user state", "User manager", Boolean.TRUE, new do()) : true;
        return bl2;
    }
}


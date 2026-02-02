/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$ComponentInfoFlags
 *  android.content.pm.ProviderInfo
 */
package io.appmetrica.analytics.coreutils.internal.services;

import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;

public final class c {
    public static /* bridge */ /* synthetic */ ProviderInfo a(PackageManager packageManager, String string2, PackageManager.ComponentInfoFlags componentInfoFlags) {
        return packageManager.resolveContentProvider(string2, componentInfoFlags);
    }
}


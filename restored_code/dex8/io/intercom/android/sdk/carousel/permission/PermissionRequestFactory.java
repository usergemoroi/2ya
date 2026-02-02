/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
package io.intercom.android.sdk.carousel.permission;

import android.os.Build;
import io.intercom.android.sdk.carousel.PermissionManager;
import io.intercom.android.sdk.carousel.permission.PermissionRequest;
import io.intercom.android.sdk.carousel.permission.PermissionRequest30;
import io.intercom.android.sdk.carousel.permission.PermissionRequestBefore30;

public final class PermissionRequestFactory {
    private PermissionRequestFactory() {
    }

    public static PermissionRequest create(PermissionManager permissionManager) {
        if (Build.VERSION.SDK_INT >= 30) {
            return new PermissionRequest30(permissionManager);
        }
        return new PermissionRequestBefore30(permissionManager);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.RequiresApi
 */
package io.intercom.android.sdk.carousel.permission;

import androidx.annotation.RequiresApi;
import io.intercom.android.sdk.carousel.PermissionManager;
import io.intercom.android.sdk.carousel.permission.PermissionRequestBefore30;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RequiresApi(api=30)
class PermissionRequest30
extends PermissionRequestBefore30 {
    PermissionRequest30(PermissionManager permissionManager) {
        super(permissionManager);
    }

    private boolean askForBackgroundPermission(List<String> list) {
        boolean bl2 = this.isLocationPermission(list) && this.isBackgroundPermissionInManifest();
        return bl2;
    }

    private boolean isBackgroundPermissionDeniedPermanently() {
        boolean bl2 = this.permissionManager.getPermissionStatus("android.permission.ACCESS_BACKGROUND_LOCATION") == 2;
        return bl2;
    }

    private boolean isBackgroundPermissionInManifest() {
        return this.permissionManager.permissionsExistInManifest(Collections.singletonList("android.permission.ACCESS_BACKGROUND_LOCATION")).isEmpty() ^ true;
    }

    private boolean isLocationPermission(List<String> list) {
        boolean bl2 = list.contains("android.permission.ACCESS_COARSE_LOCATION") || list.contains("android.permission.ACCESS_FINE_LOCATION");
        return bl2;
    }

    @Override
    protected void handleGranted(String[] stringArray) {
        if (this.askForBackgroundPermission(Arrays.asList(stringArray))) {
            if (this.isBackgroundPermissionDeniedPermanently()) {
                this.getListener().showDeniedPermanently();
            } else {
                this.getListener().requestBackgroundLocationPermission();
            }
        } else {
            this.getListener().showGranted();
        }
    }

    @Override
    protected void handleRequest(List<String> list, int n10) {
        list.remove("android.permission.ACCESS_BACKGROUND_LOCATION");
        super.handleRequest(list, n10);
    }
}


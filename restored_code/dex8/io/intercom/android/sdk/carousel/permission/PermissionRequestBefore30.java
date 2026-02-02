/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.intercom.android.sdk.carousel.permission;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.intercom.android.sdk.carousel.PermissionManager;
import io.intercom.android.sdk.carousel.permission.PermissionRequest;
import io.intercom.android.sdk.carousel.permission.PermissionResultListener;
import io.intercom.android.sdk.models.carousel.ScreenAction;
import java.util.Arrays;
import java.util.List;

class PermissionRequestBefore30
implements PermissionRequest {
    private final PermissionResultListener nullListener = new NullPermissionResultListener();
    protected final PermissionManager permissionManager;
    @Nullable
    private PermissionResultListener permissionResultListener;

    PermissionRequestBefore30(PermissionManager permissionManager) {
        this.permissionManager = permissionManager;
    }

    private void handleRequestResult(@NonNull String[] stringArray, @NonNull int[] nArray) {
        if (this.permissionManager.anyPermissionPermanentlyDeniedInResult(stringArray, nArray)) {
            this.getListener().showDeniedPermanently();
        } else if (this.permissionManager.permissionsGranted(Arrays.asList(stringArray))) {
            this.handleGranted(stringArray);
        } else {
            this.getListener().showDeniedTemporarily();
        }
    }

    @Override
    public void attach(@Nullable PermissionResultListener permissionResultListener) {
        this.permissionResultListener = permissionResultListener;
    }

    @Override
    public void detach() {
        this.permissionResultListener = null;
    }

    @NonNull
    PermissionResultListener getListener() {
        PermissionResultListener permissionResultListener;
        PermissionResultListener permissionResultListener2 = permissionResultListener = this.permissionResultListener;
        if (permissionResultListener == null) {
            permissionResultListener2 = this.nullListener;
        }
        return permissionResultListener2;
    }

    protected void handleGranted(String[] stringArray) {
        this.getListener().showGranted();
    }

    protected void handleRequest(List<String> stringArray, int n10) {
        stringArray = stringArray.toArray(new String[0]);
        this.permissionManager.requestPermissions(stringArray, n10);
    }

    @Override
    public void handleResult(@NonNull String[] stringArray, @NonNull int[] nArray) {
        this.handleRequestResult(stringArray, nArray);
    }

    @Override
    public void request(ScreenAction object, int n10) {
        if (!(object = ((ScreenAction)object).getValidPermissions(this.permissionManager)).isEmpty()) {
            this.handleRequest((List<String>)object, n10);
        }
    }

    private static final class NullPermissionResultListener
    implements PermissionResultListener {
        private NullPermissionResultListener() {
        }

        @Override
        public void requestBackgroundLocationPermission() {
        }

        @Override
        public void showDeniedPermanently() {
        }

        @Override
        public void showDeniedTemporarily() {
        }

        @Override
        public void showGranted() {
        }
    }
}


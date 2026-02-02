/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.RequiresApi
 */
package io.intercom.android.sdk.carousel.permission;

import androidx.annotation.RequiresApi;

public interface PermissionResultListener {
    @RequiresApi(api=30)
    public void requestBackgroundLocationPermission();

    public void showDeniedPermanently();

    public void showDeniedTemporarily();

    public void showGranted();
}


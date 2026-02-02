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
import io.intercom.android.sdk.carousel.permission.PermissionResultListener;
import io.intercom.android.sdk.models.carousel.ScreenAction;

public interface PermissionRequest {
    public void attach(@Nullable PermissionResultListener var1);

    public void detach();

    public void handleResult(@NonNull String[] var1, @NonNull int[] var2);

    public void request(ScreenAction var1, int var2);
}


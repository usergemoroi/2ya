/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
 */
package org.chromium.support_lib_boundary;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface;

public interface WebMessagePayloadBoundaryInterface
extends FeatureFlagHolderBoundaryInterface {
    @NonNull
    public byte[] getAsArrayBuffer();

    @Nullable
    public String getAsString();

    public int getType();
}


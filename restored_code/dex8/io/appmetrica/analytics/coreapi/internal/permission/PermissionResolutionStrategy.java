/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.coreapi.internal.permission;

import android.content.Context;
import androidx.annotation.NonNull;

public interface PermissionResolutionStrategy {
    public boolean hasNecessaryPermissions(@NonNull Context var1);
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.coreapi.internal.data;

import androidx.annotation.NonNull;

public interface IBinaryDataHelper {
    public byte[] get(@NonNull String var1);

    public void insert(@NonNull String var1, @NonNull byte[] var2);

    public void remove(@NonNull String var1);
}


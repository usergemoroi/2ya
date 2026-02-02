/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.networktasks.internal.RequestBodyEncryptionMode;

public interface RequestBodyEncrypter {
    @Nullable
    public byte[] encrypt(byte[] var1);

    @NonNull
    public RequestBodyEncryptionMode getEncryptionMode();
}


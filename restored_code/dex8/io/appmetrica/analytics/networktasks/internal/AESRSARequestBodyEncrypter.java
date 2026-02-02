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
import io.appmetrica.analytics.coreutils.internal.encryption.AESRSAEncrypter;
import io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter;
import io.appmetrica.analytics.networktasks.internal.RequestBodyEncryptionMode;

public class AESRSARequestBodyEncrypter
implements RequestBodyEncrypter {
    private final AESRSAEncrypter a;

    public AESRSARequestBodyEncrypter() {
        this(new AESRSAEncrypter());
    }

    AESRSARequestBodyEncrypter(AESRSAEncrypter aESRSAEncrypter) {
        this.a = aESRSAEncrypter;
    }

    @Override
    @Nullable
    public byte[] encrypt(@Nullable byte[] byArray) {
        return this.a.encrypt(byArray);
    }

    @Override
    @NonNull
    public RequestBodyEncryptionMode getEncryptionMode() {
        return RequestBodyEncryptionMode.AES_RSA;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri$Builder
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.networktasks.internal;

import android.net.Uri;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter;
import io.appmetrica.analytics.networktasks.internal.RequestBodyEncryptionMode;

public class NetworkTaskForSendingDataParamsAppender {
    private final RequestBodyEncrypter a;

    public NetworkTaskForSendingDataParamsAppender(@NonNull RequestBodyEncrypter requestBodyEncrypter) {
        this.a = requestBodyEncrypter;
    }

    public void appendEncryptedData(@NonNull Uri.Builder builder) {
        if (this.a.getEncryptionMode() == RequestBodyEncryptionMode.AES_RSA) {
            builder.appendQueryParameter("encrypted_request", "1");
        }
    }
}


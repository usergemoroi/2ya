/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 */
package io.appmetrica.analytics.coreutils.internal.encryption;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.crypto.Encrypter;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AESEncrypter
implements Encrypter {
    public static final String DEFAULT_ALGORITHM = "AES/CBC/PKCS5Padding";
    public static final int DEFAULT_KEY_LENGTH = 16;
    public static final String TAG = "[AESEncrypter]";
    private final String a;
    private final byte[] b;
    private final byte[] c;

    public AESEncrypter(String string2, byte[] byArray, byte[] byArray2) {
        this.a = string2;
        this.b = byArray;
        this.c = byArray2;
    }

    @SuppressLint(value={"TrulyRandom"})
    @Nullable
    public byte[] decrypt(@NonNull byte[] byArray) {
        return this.decrypt(byArray, 0, byArray.length);
    }

    @Nullable
    public byte[] decrypt(@NonNull byte[] byArray, int n10, int n13) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.b, "AES");
            Cipher cipher = Cipher.getInstance(this.a);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(this.c);
            cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
            byArray = cipher.doFinal(byArray, n10, n13);
            return byArray;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    @Override
    @SuppressLint(value={"TrulyRandom"})
    @Nullable
    public byte[] encrypt(@NonNull byte[] byArray) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.b, "AES");
            Cipher cipher = Cipher.getInstance(this.a);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(this.c);
            cipher.init(1, (Key)secretKeySpec, ivParameterSpec);
            byArray = cipher.doFinal(byArray);
            return byArray;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    @VisibleForTesting
    public String getAlgorithm() {
        return this.a;
    }

    @VisibleForTesting
    public byte[] getIV() {
        return this.c;
    }

    @VisibleForTesting
    public byte[] getPassword() {
        return this.b;
    }
}


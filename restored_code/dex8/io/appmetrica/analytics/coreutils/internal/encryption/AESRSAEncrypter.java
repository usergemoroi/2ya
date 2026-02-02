/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.util.Base64
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.coreutils.internal.encryption;

import android.annotation.SuppressLint;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.crypto.Encrypter;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import io.appmetrica.analytics.coreutils.internal.io.CloseableUtilsKt;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.OutputStream;
import java.security.Key;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.KeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

public class AESRSAEncrypter
implements Encrypter {
    private final String a;
    private final String b;

    public AESRSAEncrypter() {
        this(0);
    }

    AESRSAEncrypter(int n10) {
        this.a = "AES/CBC/PKCS5Padding";
        this.b = "RSA/ECB/PKCS1Padding";
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final byte[] a(byte[] byArray, byte[] byArray2, byte[] byArray3, PublicKey object) {
        block4: {
            Object object2 = new ByteArrayOutputStream(byArray2.length + byArray3.length);
            ((OutputStream)object2).write(byArray2);
            ((OutputStream)object2).write(byArray3);
            Object object3 = ((ByteArrayOutputStream)object2).toByteArray();
            ((ByteArrayOutputStream)object2).close();
            object2 = Cipher.getInstance(this.b);
            ((Cipher)object2).init(1, (Key)object);
            object = new ByteArrayOutputStream(byArray.length);
            ((OutputStream)object).write(((Cipher)object2).doFinal((byte[])object3));
            object3 = new AESEncrypter;
            ((AESEncrypter)object3)(this.a, byArray2, byArray3);
            byArray = ((AESEncrypter)object3).encrypt(byArray);
            if (byArray == null) break block4;
            ((OutputStream)object).write(byArray);
            byArray = ((ByteArrayOutputStream)object).toByteArray();
            CloseableUtilsKt.closeSafely((Closeable)object);
            return byArray;
        }
        CloseableUtilsKt.closeSafely((Closeable)object);
        return null;
        catch (Throwable throwable) {
            Object object4;
            block5: {
                object4 = null;
                break block5;
                catch (Throwable throwable2) {
                    object4 = object;
                }
            }
            CloseableUtilsKt.closeSafely(object4);
        }
        return null;
    }

    @Override
    @SuppressLint(value={"TrulyRandom"})
    @Nullable
    public byte[] encrypt(@NonNull byte[] byArray) {
        try {
            Object object = new SecureRandom();
            byte[] byArray2 = new byte[16];
            byte[] byArray3 = new byte[16];
            ((SecureRandom)object).nextBytes(byArray3);
            ((SecureRandom)object).nextBytes(byArray2);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            object = new X509EncodedKeySpec(Base64.decode((String)"MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDhmH/m2qrRjxDHP794CeaZpENQNYydf8pqyXJilo6XxK+n+pvo27VxWfB3Z1yHrtKow+eZXKLQzrQ8wZMfRgADrYCQJ20y2hGZEUCN1tGSM+xqVKMeCtVi3NvQa54Cx7mT5ECVsH5DKEs/aeScDHP56FzcgEbtOSwyRZ8dsEM0wwIDAQAB", (int)0));
            byArray = this.a(byArray, byArray3, byArray2, keyFactory.generatePublic((KeySpec)object));
            return byArray;
        }
        catch (Throwable throwable) {
            return null;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import io.appmetrica.analytics.coreutils.internal.io.GZIPCompressor;
import io.appmetrica.analytics.impl.t3;
import java.util.Arrays;

public final class u3 {
    public final t3 a;
    public final GZIPCompressor b;

    public u3() {
        this(new t3(), new GZIPCompressor());
    }

    public u3(t3 t33, GZIPCompressor gZIPCompressor) {
        this.a = t33;
        this.b = gZIPCompressor;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final byte[] a(byte[] byArray) {
        Object object;
        byte[] byArray2;
        byte[] byArray3 = null;
        try {
            byArray2 = Arrays.copyOfRange(byArray, 0, 16);
            object = this.a;
            byte[] byArray4 = "hBnBQbZrmjPXEWVJ".getBytes();
            object.getClass();
            object = new AESEncrypter("AES/CBC/PKCS5Padding", byArray4, byArray2);
            byArray2 = byArray3;
            if (byArray == null) return byArray2;
        }
        catch (Throwable throwable) {}
        if (byArray.length == 0) {
        }
        byArray = ((AESEncrypter)object).decrypt(byArray, 16, byArray.length - 16);
        byArray2 = this.b.uncompress(byArray);
        return byArray2;
        finally {
            return byArray3;
        }
    }
}


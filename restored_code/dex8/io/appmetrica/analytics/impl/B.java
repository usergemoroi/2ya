/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.util.Base64
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.X8;
import io.appmetrica.analytics.impl.a;
import io.appmetrica.analytics.impl.e9;
import io.appmetrica.analytics.impl.g9;
import io.appmetrica.analytics.impl.o6;

public final class b
implements e9 {
    public final AESEncrypter a;

    public b() {
        this(new a(Na.j().f()));
    }

    public b(AESEncrypter aESEncrypter) {
        this.a = aESEncrypter;
    }

    public b(a a14) {
        this(new AESEncrypter("AES/CBC/PKCS5Padding", a14.b(), a14.a()));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @NonNull
    public final X8 a(@NonNull o6 o63) {
        Object object;
        block3: {
            object = o63.getValue();
            if (!TextUtils.isEmpty((CharSequence)object)) {
                try {
                    object = ((String)object).getBytes("UTF-8");
                    object = this.a.encrypt((byte[])object);
                    if (object == null) break block3;
                    object = Base64.encodeToString((byte[])object, (int)0);
                }
                catch (Throwable throwable) {}
            }
        }
        object = null;
        o63.setValue((String)object);
        return new X8(o63, g9.d);
    }

    @NonNull
    public final g9 a() {
        return g9.d;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    @NonNull
    public final byte[] a(@Nullable byte[] byArray) {
        byte[] byArray2;
        byte[] byArray3 = byArray2 = new byte[0];
        if (byArray == null) return byArray3;
        byArray3 = byArray2;
        if (byArray.length <= 0) return byArray3;
        try {
            byArray = Base64.decode((byte[])byArray, (int)0);
            return this.a.decrypt(byArray);
        }
        catch (Throwable throwable) {
            return byArray2;
        }
    }
}


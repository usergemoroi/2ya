/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.RemoteException
 *  android.os.SystemClock
 *  android.text.TextUtils
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.vl
 */
package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.vl;
import com.yandex.mobile.ads.impl.wa3;

public class yh1
extends Exception
implements vl {
    public final int b;
    public final long c;

    static {
        new wa3();
    }

    protected yh1(Bundle bundle) {
        this(bundle.getString(yh1.a(2)), yh1.a(bundle), bundle.getInt(yh1.a(0), 1000), bundle.getLong(yh1.a(1), SystemClock.elapsedRealtime()));
    }

    protected yh1(@Nullable String string2, @Nullable Throwable throwable, int n10, long l10) {
        super(string2, throwable);
        this.b = n10;
        this.c = l10;
    }

    protected static String a(int n10) {
        return Integer.toString(n10, 36);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    private static Throwable a(Bundle object) {
        void var0_7;
        String string2 = object.getString(Integer.toString(3, 36));
        String string3 = object.getString(Integer.toString(4, 36));
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        Object var0_1 = null;
        Throwable throwable = null;
        if (bl2) return var0_7;
        try {
            Class<?> clazz = Class.forName(string2, true, yh1.class.getClassLoader());
            if (Throwable.class.isAssignableFrom(clazz)) {
                throwable = (Throwable)clazz.getConstructor(String.class).newInstance(string3);
            }
            Throwable throwable2 = throwable;
            if (throwable != null) return var0_7;
        }
        catch (Throwable throwable3) {
            RemoteException remoteException = new RemoteException(string3);
        }
        RemoteException remoteException = new RemoteException(string3);
        return var0_7;
    }
}


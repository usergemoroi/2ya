/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 */
package io.appmetrica.analytics.impl;

import android.util.Base64;
import io.appmetrica.analytics.impl.X8;
import io.appmetrica.analytics.impl.e9;
import io.appmetrica.analytics.impl.g9;
import io.appmetrica.analytics.impl.o6;

public final class la
implements e9 {
    @Override
    public final X8 a(o6 o63) {
        throw new UnsupportedOperationException();
    }

    public final g9 a() {
        return g9.c;
    }

    @Override
    public final byte[] a(byte[] byArray) {
        try {
            byArray = Base64.decode((byte[])byArray, (int)0);
            return byArray;
        }
        catch (Throwable throwable) {
            return new byte[0];
        }
    }
}


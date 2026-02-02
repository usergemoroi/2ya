/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.impl.c3;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

public final class y3
extends c3 {
    public y3(int n10, @NonNull String string2, @NonNull PublicLogger publicLogger) {
        super(n10, string2, publicLogger);
    }

    @NonNull
    @VisibleForTesting(otherwise=3)
    public final String a() {
        return this.b;
    }

    @Nullable
    public final byte[] a(@Nullable byte[] byArray) {
        byte[] byArray2 = byArray;
        if (byArray != null) {
            int n10 = byArray.length;
            int n13 = this.a;
            byArray2 = byArray;
            if (n10 > n13) {
                byArray2 = new byte[n13];
                System.arraycopy(byArray, 0, byArray2, 0, n13);
                this.c.warning("\"%s\" %s exceeded limit of %d bytes", this.b, byArray, this.a);
            }
        }
        return byArray2;
    }

    @VisibleForTesting(otherwise=3)
    public final int b() {
        return this.a;
    }
}


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

public final class fn
extends c3 {
    public fn(int n10, @NonNull String string2) {
        this(n10, string2, PublicLogger.getAnonymousInstance());
    }

    public fn(int n10, @NonNull String string2, @NonNull PublicLogger publicLogger) {
        super(n10, string2, publicLogger);
    }

    @NonNull
    @VisibleForTesting(otherwise=3)
    public final String a() {
        return this.b;
    }

    @Nullable
    public final String a(@Nullable String string2) {
        int n10;
        int n13;
        if (string2 != null && (n13 = string2.length()) > (n10 = this.a)) {
            String string3 = string2.substring(0, n10);
            this.c.warning("\"%s\" %s size exceeded limit of %d characters", this.b, string2, this.a);
            return string3;
        }
        return string2;
    }

    @VisibleForTesting(otherwise=3)
    public final int b() {
        return this.a;
    }
}


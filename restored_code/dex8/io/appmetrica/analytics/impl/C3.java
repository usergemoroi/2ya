/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.Rn;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

public abstract class c3
implements Rn {
    public final int a;
    public final String b;
    @NonNull
    protected final PublicLogger c;

    public c3(int n10, String string2, PublicLogger publicLogger) {
        this.a = n10;
        this.b = string2;
        this.c = publicLogger;
    }
}


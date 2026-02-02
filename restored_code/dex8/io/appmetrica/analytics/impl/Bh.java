/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.Km;
import io.appmetrica.analytics.impl.Tl;
import io.appmetrica.analytics.impl.eb;
import io.appmetrica.analytics.impl.eh;
import io.appmetrica.analytics.impl.t5;

public final class bh
extends t5 {
    public bh(@NonNull Km km3) {
        super(km3);
    }

    @Override
    public final <C extends eb> Tl a() {
        return new eh(this.a);
    }
}


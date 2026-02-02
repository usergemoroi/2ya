/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.impl.Q1;
import io.appmetrica.analytics.impl.S1;

public final class sp
implements Q1 {
    public final S1 a;

    public /* synthetic */ sp(S1 s13) {
        this.a = s13;
    }

    @Override
    public final boolean a(Intent intent) {
        return S1.a(this.a, intent);
    }
}


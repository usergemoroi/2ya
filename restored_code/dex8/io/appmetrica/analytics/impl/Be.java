/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Process
 */
package io.appmetrica.analytics.impl;

import android.os.Process;
import io.appmetrica.analytics.impl.jl;
import org.jetbrains.annotations.NotNull;

public final class be
implements jl {
    public final int a;

    public be(int n10) {
        this.a = n10;
    }

    public final boolean a(@NotNull String string2) {
        boolean bl2 = this.a != Process.myPid();
        return bl2;
    }
}


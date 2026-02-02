/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.Km;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.Tl;
import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;

public final class eh
implements Tl {
    public final Km a;

    public eh(@NonNull Km km3) {
        this.a = km3;
    }

    @Override
    public final void a() {
        NetworkTask networkTask = this.a.c();
        if (networkTask != null) {
            Na.F.getClass();
            NetworkServiceLocator.getInstance().getNetworkCore().startTask(networkTask);
        }
    }
}


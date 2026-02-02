/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.impl.Ad;
import io.appmetrica.analytics.impl.R1;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleObserver;

public final class bp
implements R1 {
    public final ModuleServiceLifecycleObserver a;

    public /* synthetic */ bp(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver) {
        this.a = moduleServiceLifecycleObserver;
    }

    @Override
    public final void a(Intent intent) {
        Ad.b(this.a, intent);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcelable
 */
package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcelable;
import io.appmetrica.analytics.impl.Th;
import io.appmetrica.analytics.impl.Vf;
import io.appmetrica.analytics.impl.il;
import io.appmetrica.analytics.impl.o0;
import io.appmetrica.analytics.internal.IAppMetricaService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class aj
extends Th {
    public final Vf e;

    public aj(@NotNull o0 o02, @Nullable il il3, @NotNull Vf vf3) {
        super(o02, il3);
        this.e = vf3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a(@NotNull IAppMetricaService iAppMetricaService) {
        Bundle bundle = new Bundle();
        Vf vf3 = this.e;
        synchronized (vf3) {
            bundle.putParcelable("PROCESS_CFG_OBJ", (Parcelable)vf3);
        }
        iAppMetricaService.resumeUserSession(bundle);
    }
}


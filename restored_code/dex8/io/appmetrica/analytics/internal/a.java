/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package io.appmetrica.analytics.internal;

import android.os.Bundle;
import io.appmetrica.analytics.internal.AppMetricaService;
import io.appmetrica.analytics.internal.IAppMetricaService;

public final class a
extends IAppMetricaService.Stub {
    @Override
    public final void pauseUserSession(Bundle bundle) {
        AppMetricaService.a().pauseUserSession(bundle);
    }

    @Override
    public final void reportData(int n10, Bundle bundle) {
        AppMetricaService.a().reportData(n10, bundle);
    }

    @Override
    public final void resumeUserSession(Bundle bundle) {
        AppMetricaService.a().resumeUserSession(bundle);
    }
}


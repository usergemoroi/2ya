/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.A4;
import io.appmetrica.analytics.modulesapi.internal.client.ProcessDetector;

public final class i4
implements ProcessDetector {
    @Override
    public final boolean isMainProcess() {
        return A4.l().a.b();
    }
}


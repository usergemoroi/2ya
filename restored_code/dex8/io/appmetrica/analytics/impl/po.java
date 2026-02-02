/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceConfiguration;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;
import io.appmetrica.analytics.impl.om;
import io.appmetrica.analytics.impl.tm;
import org.jetbrains.annotations.NotNull;

public final class po
implements tm {
    public final UtilityServiceProvider a;

    public po(@NotNull UtilityServiceProvider utilityServiceProvider) {
        this.a = utilityServiceProvider;
    }

    @Override
    public final void a(@NotNull om om3) {
        this.a.updateConfiguration(new UtilityServiceConfiguration(om3.v, om3.u));
    }
}


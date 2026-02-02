/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.jvm.functions.a
 *  kotlin.jvm.internal.a0
 */
package io.appmetrica.analytics.coreutils.impl;

import io.appmetrica.analytics.coreutils.internal.services.FirstExecutionConditionServiceImpl;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.a0;

public final class l
extends a0
implements a {
    public final UtilityServiceProvider a;

    public l(UtilityServiceProvider utilityServiceProvider) {
        this.a = utilityServiceProvider;
        super(0);
    }

    public final Object invoke() {
        return new FirstExecutionConditionServiceImpl(this.a);
    }
}


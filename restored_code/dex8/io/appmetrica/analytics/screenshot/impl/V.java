/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.collections.s0
 */
package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent;
import io.appmetrica.analytics.screenshot.impl.Q;
import kotlin.collections.s0;
import kotlin.z;
import org.jetbrains.annotations.NotNull;

public final class v
implements Q {
    public final ClientContext a;

    public v(@NotNull ClientContext clientContext) {
        this.a = clientContext;
    }

    public final void a(@NotNull String string2) {
        this.a.getInternalClientModuleFacade().reportEvent(InternalModuleEvent.Companion.newBuilder(4).withName("appmetrica_system_event_screenshot").withAttributes(s0.g(z.a("type", string2))).withCategory(InternalModuleEvent.Category.SYSTEM).build());
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.impl.K9;
import io.appmetrica.analytics.impl.bl;
import io.appmetrica.analytics.impl.o6;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter;
import org.jetbrains.annotations.NotNull;

public final class vd
implements ModuleEventServiceHandlerReporter {
    public final boolean a;
    public final K9 b;
    public final o6 c;

    public vd(boolean bl2, @NotNull K9 k94, @NotNull o6 o63) {
        this.a = bl2;
        this.b = k94;
        this.c = o63;
    }

    @Override
    public final boolean isMain() {
        return this.a;
    }

    @Override
    public final void report(@NotNull CounterReportApi object) {
        o6 o63 = o6.d(this.c);
        o63.d = object.getType();
        o63.e = object.getCustomType();
        o63.setName(object.getName());
        Object object2 = object.getValue();
        if (object2 != null) {
            o63.setValue((String)object2);
        }
        if ((object2 = (Object)object.getValueBytes()) != null) {
            o63.setValueBytes((byte[])object2);
        }
        o63.g = object.getBytesTruncated();
        object = this.b;
        ((K9)object).a(o63, bl.a(((K9)object).c.b(o63), o63.i));
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.impl.Lj;
import io.appmetrica.analytics.impl.ak;
import io.appmetrica.analytics.impl.lk;
import io.appmetrica.analytics.impl.v1;
import io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class zd
implements ModuleSelfReporter {
    public final lk a = v1.a();
    public final int b;

    public zd() {
        this.b = 4;
    }

    @Override
    public final void reportError(@NotNull String string2, @Nullable String string3) {
        this.a.reportError(string2, string3);
    }

    @Override
    public final void reportError(@NotNull String string2, @Nullable Throwable throwable) {
        lk lk3 = this.a;
        lk3.getClass();
        lk3.a(new Lj(string2, throwable));
    }

    @Override
    public final void reportEvent(int n10, @NotNull String object, @Nullable String string2) {
        lk lk3 = this.a;
        object = ModuleEvent.newBuilder(n10).withName((String)object).withValue(string2).build();
        lk3.getClass();
        lk3.a(new ak((ModuleEvent)object));
    }

    @Override
    public final void reportEvent(@NotNull String object) {
        lk lk3 = this.a;
        object = ModuleEvent.newBuilder(this.b).withName((String)object).build();
        lk3.getClass();
        lk3.a(new ak((ModuleEvent)object));
    }

    @Override
    public final void reportEvent(@NotNull String object, @Nullable String string2) {
        lk lk3 = this.a;
        object = ModuleEvent.newBuilder(this.b).withName((String)object).withValue(string2).build();
        lk3.getClass();
        lk3.a(new ak((ModuleEvent)object));
    }

    @Override
    public final void reportEvent(@NotNull String object, @Nullable Map<String, ? extends Object> map2) {
        lk lk3 = this.a;
        object = ModuleEvent.newBuilder(this.b).withName((String)object).withAttributes(map2).build();
        lk3.getClass();
        lk3.a(new ak((ModuleEvent)object));
    }
}


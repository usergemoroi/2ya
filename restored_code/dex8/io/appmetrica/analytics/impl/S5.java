/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.el;
import io.appmetrica.analytics.impl.qf;
import io.appmetrica.analytics.impl.r5;
import io.appmetrica.analytics.impl.v5;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

public final class s5
extends r5 {
    public s5(@NotNull v5 v54) {
        super(v54);
    }

    @Override
    public final boolean b(int n10) {
        boolean bl2 = n10 < 113;
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void c() {
        el el3;
        Object object = this.a.c;
        try {
            el3 = new el((qf)object, "background");
            Long l10 = el3.c.a("SESSION_SLEEP_START");
            if (l10 != null) {
                el3.a("SESSION_SLEEP_START", TimeUnit.SECONDS.toMillis(l10));
            }
            if ((l10 = el3.c.a("SESSION_LAST_EVENT_OFFSET")) != null) {
                el3.a("SESSION_LAST_EVENT_OFFSET", TimeUnit.SECONDS.toMillis(l10));
            }
        }
        catch (Throwable throwable) {}
        try {
            el3 = new el((qf)object, "foreground");
            object = el3.c.a("SESSION_SLEEP_START");
            if (object != null) {
                el3.a("SESSION_SLEEP_START", TimeUnit.SECONDS.toMillis((Long)object));
            }
            if ((object = el3.c.a("SESSION_LAST_EVENT_OFFSET")) == null) return;
            el3.a("SESSION_LAST_EVENT_OFFSET", TimeUnit.SECONDS.toMillis((Long)object));
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }
}


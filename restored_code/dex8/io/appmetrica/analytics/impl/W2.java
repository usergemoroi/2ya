/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.impl.o5;
import io.appmetrica.analytics.impl.qf;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class w2 {
    public final qf a;
    public final long b;
    public final long c;
    public final SystemTimeProvider d;
    public final Map e;

    public w2(o5 object, qf qf3) {
        this.a = qf3;
        ((o5)object).b();
        this.b = TimeUnit.MINUTES.toMillis(1L);
        this.c = TimeUnit.DAYS.toMillis(7L);
        this.d = new SystemTimeProvider();
        object = qf3.f();
        this.a((Map)object);
        this.e = object;
    }

    public final void a(Map map2) {
        Object object;
        long l10 = this.d.currentTimeMillis();
        LinkedHashSet<Object> linkedHashSet = new LinkedHashSet<Object>();
        for (Map.Entry entry : map2.entrySet()) {
            object = (String)entry.getKey();
            if (((Number)entry.getValue()).longValue() >= l10 - this.c) continue;
            linkedHashSet.add(object);
        }
        object = linkedHashSet.iterator();
        while (object.hasNext()) {
            map2.remove((String)object.next());
        }
    }
}


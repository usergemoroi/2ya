/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  kotlin.jvm.functions.a
 *  kotlin.n
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.impl.mn;
import io.appmetrica.analytics.impl.s;
import io.appmetrica.analytics.impl.t;
import io.appmetrica.analytics.impl.u;
import io.appmetrica.analytics.impl.v;
import java.util.Map;
import kotlin.jvm.functions.a;
import kotlin.m;
import kotlin.n;
import org.jetbrains.annotations.NotNull;

public final class nn
implements s {
    public final t a = new t();
    public final u b;
    public final m c;

    public nn(@NotNull Context context) {
        this.b = new u(context);
        this.c = n.b((a)new mn(this));
    }

    public static final /* synthetic */ v a(nn nn3) {
        return nn3.a;
    }

    public static final /* synthetic */ v b(nn nn3) {
        return nn3.b;
    }

    @NotNull
    public final Map<String, String> a(@NotNull Map<String, String> map2) {
        map2.putAll((Map)this.c.getValue());
        return map2;
    }
}


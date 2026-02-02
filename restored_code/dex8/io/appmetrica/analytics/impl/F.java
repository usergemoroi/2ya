/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.D4;
import io.appmetrica.analytics.impl.N4;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.Xg;
import io.appmetrica.analytics.impl.o6;

public abstract class f
implements D4 {
    public final Context a;
    public final Xg b;

    public f(@NonNull Context context, @NonNull Xg xg3) {
        this.a = context.getApplicationContext();
        this.b = xg3;
        xg3.a(this);
        Na.j().m().b(this);
    }

    @Override
    public final void a() {
        this.b.b(this);
        Na.F.l().a(this);
    }

    @Override
    public final void a(@NonNull o6 o63, @NonNull N4 n42) {
        this.b(o63, n42);
    }

    @NonNull
    public final Xg b() {
        return this.b;
    }

    public abstract void b(@NonNull o6 var1, @NonNull N4 var2);

    @NonNull
    public final Context c() {
        return this.a;
    }
}


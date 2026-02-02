/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.IReporter;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.impl.c6;
import io.appmetrica.analytics.impl.n;
import io.appmetrica.analytics.impl.v1;

public final class d6 {
    public final n a;
    public final IReporter b;
    public Context c;
    public final c6 d;

    public d6(n n10) {
        this(n10, 0);
    }

    public /* synthetic */ d6(n n10, int n13) {
        this(n10, v1.a());
    }

    public d6(n n10, IReporter iReporter) {
        this.a = n10;
        this.b = iReporter;
        this.d = new c6(this);
    }

    public final Context a() {
        synchronized (this) {
            Context context = this.c;
            return context;
        }
    }

    public final void a(Context context) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (this.c != null) break block3;
                        context = context.getApplicationContext();
                        this.a.a(context);
                        this.a.registerListener(this.d, ActivityEvent.RESUMED, ActivityEvent.PAUSED);
                        this.c = context;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}


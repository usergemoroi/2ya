/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import io.appmetrica.analytics.impl.X9;
import io.appmetrica.analytics.impl.jl;
import io.appmetrica.analytics.impl.oq;
import io.appmetrica.analytics.impl.za;
import java.io.File;

public final class pg
implements Runnable {
    public final File a;
    public final Function b;
    public final Consumer c;
    public final Consumer d;
    public final za e;
    public final jl f;

    public pg(File file, Function function, Consumer consumer, Consumer consumer2, za za4, jl jl2) {
        this.a = file;
        this.b = function;
        this.c = consumer;
        this.d = consumer2;
        this.e = za4;
        this.f = jl2;
    }

    public static final void a(File file) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        if (this.a.exists()) {
            Object object;
            X9 x94;
            block9: {
                Object object2;
                block8: {
                    x94 = this.e.b(this.a.getName());
                    object2 = this.c;
                    x94.a.lock();
                    x94.b.a();
                    boolean bl2 = this.a.exists();
                    if (bl2) break block8;
                    object2.consume(this.a);
                    x94.c();
                    za za4 = this.e;
                    object2 = this.a.getName();
                    synchronized (za4) {
                        za4.b.remove(object2);
                        return;
                    }
                }
                try {
                    Object r14 = this.b.apply(this.a);
                    object = object2;
                    if (r14 == null) break block9;
                    if (this.f.a(r14)) {
                        this.d.consume(r14);
                        object = object2;
                    } else {
                        object = new oq();
                    }
                }
                catch (Throwable throwable) {
                    object = object2;
                }
            }
            object.consume(this.a);
            x94.c();
            this.e.a(this.a.getName());
        }
    }
}


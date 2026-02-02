/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.impl.bb;
import io.appmetrica.analytics.impl.cb;
import io.appmetrica.analytics.impl.eo;
import io.appmetrica.analytics.impl.p0;
import io.appmetrica.analytics.impl.q4;
import io.appmetrica.analytics.impl.s0;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;

public final class q0 {
    public final eo a;
    public volatile Boolean b;
    public bb c;
    public cb d;

    public q0() {
        this(new eo());
    }

    public q0(eo eo3) {
        this.a = eo3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final bb a(Context object, q4 q44) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (this.c != null) return this.c;
                        if (!this.a((Context)object)) break block3;
                        object = new s0();
                        this.c = object;
                        return this.c;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                p0 p02 = new p0((Context)object, q44);
                this.c = p02;
                return this.c;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean a(Context object) {
        Boolean bl2;
        Boolean bl3 = bl2 = this.b;
        if (bl2 != null) return bl3;
        synchronized (this) {
            try {
                bl3 = bl2 = this.b;
                if (bl2 != null) return bl3;
                this.a.getClass();
                boolean bl4 = eo.a(object) ^ true;
                object = bl4;
                this.b = object;
                bl3 = object;
                if (!bl4) return bl3;
                ImportantLogger.INSTANCE.info("AppMetrica", "User is locked. So use stubs. Events will not be sent.", new Object[0]);
                bl3 = object;
                return bl3;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}


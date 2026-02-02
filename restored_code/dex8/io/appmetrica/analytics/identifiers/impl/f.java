/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.os.IBinder
 *  kotlin.jvm.functions.l
 */
package io.appmetrica.analytics.identifiers.impl;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.identifiers.impl.e;
import io.appmetrica.analytics.identifiers.impl.g;
import io.appmetrica.analytics.identifiers.impl.l;

public final class f {
    public final e a;
    public final kotlin.jvm.functions.l b;
    public final String c;
    public final SafePackageManager d;

    public f(Intent intent, kotlin.jvm.functions.l l10, String string2) {
        this(new e(intent, string2), l10, string2, new SafePackageManager());
    }

    public f(e e11, kotlin.jvm.functions.l l10, String string2, SafePackageManager safePackageManager) {
        this.a = e11;
        this.b = l10;
        this.c = string2;
        this.d = safePackageManager;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Object a(Context object) {
        block13: {
            Object object2;
            block11: {
                block12: {
                    block10: {
                        object2 = this.a.a;
                        if (this.d.resolveService((Context)object, (Intent)object2, 0) == null) {
                            object = new StringBuilder("could not resolve ");
                            ((StringBuilder)object).append(this.c);
                            ((StringBuilder)object).append(" services");
                            throw new l(((StringBuilder)object).toString());
                        }
                        try {
                            object2 = this.a;
                            if (!object.bindService(object2.a, (ServiceConnection)object2, 1)) break block10;
                            object2 = this.a;
                            if (object2.b != null) break block11;
                            object = object2.c;
                            // MONITORENTER : object
                        }
                        catch (Throwable throwable) {}
                        try {
                            IBinder iBinder = object2.b;
                            if (iBinder != null) break block12;
                            object2.c.wait(3000L);
                        }
                        catch (Throwable throwable) {}
                        throw throwable;
                    }
                    object = null;
                    break block13;
                    catch (InterruptedException interruptedException) {}
                }
                // MONITOREXIT : object
            }
            object = object2.b;
        }
        if (object != null) {
            return this.b.invoke(object);
        }
        object = new StringBuilder("could not bind to ");
        ((StringBuilder)object).append(this.c);
        ((StringBuilder)object).append(" services");
        throw new g(((StringBuilder)object).toString());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void b(Context context) {
        try {
            this.a.a(context);
            return;
        }
        catch (IllegalArgumentException | Throwable throwable) {
            return;
        }
    }
}


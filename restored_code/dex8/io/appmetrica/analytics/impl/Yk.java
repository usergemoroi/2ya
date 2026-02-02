/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
package io.appmetrica.analytics.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

public final class yk
implements Executor {
    public final Handler a;

    public yk(Handler handler) {
        this.a = handler;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.a.post(runnable);
    }
}


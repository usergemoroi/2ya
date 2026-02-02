/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.impl.F6;
import java.io.File;

public final class qg
implements Runnable {
    public final File a;
    public final Consumer b;

    public qg(File file, F6 f62) {
        this.a = file;
        this.b = f62;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        File[] fileArray;
        if (this.a.exists() && this.a.isDirectory() && (fileArray = this.a.listFiles()) != null && fileArray.length != 0) {
            for (File file : fileArray) {
                try {
                    this.b.consume(file);
                }
                catch (Throwable throwable) {}
            }
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.WorkerThread
 */
package io.appmetrica.analytics;

import androidx.annotation.WorkerThread;

public interface AnrListener {
    @WorkerThread
    public void onAppNotResponding();
}


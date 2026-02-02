/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.coreapi.internal.executors;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

public interface IHandlerExecutor
extends ICommonExecutor {
    @NonNull
    public Handler getHandler();

    @NonNull
    public Looper getLooper();
}


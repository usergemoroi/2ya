/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.coreapi.internal.backport;

import androidx.annotation.NonNull;

public interface FunctionWithThrowable<T, R> {
    public R apply(@NonNull T var1) throws Throwable;
}


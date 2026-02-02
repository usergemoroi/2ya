/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.coreapi.internal.backport;

import androidx.annotation.NonNull;

public interface ConsumerWithThrowable<T> {
    public void consume(@NonNull T var1) throws Throwable;
}


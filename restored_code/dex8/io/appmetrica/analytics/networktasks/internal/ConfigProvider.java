/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;

public interface ConfigProvider<T> {
    @NonNull
    public T getConfig();
}


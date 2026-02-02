/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.coreapi.internal.data;

import androidx.annotation.NonNull;

public interface ProtobufStateStorage<T> {
    public void delete();

    @NonNull
    public T read();

    public void save(@NonNull T var1);
}


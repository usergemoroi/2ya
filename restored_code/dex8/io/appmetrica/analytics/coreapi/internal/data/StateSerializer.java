/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.coreapi.internal.data;

import androidx.annotation.NonNull;
import java.io.IOException;

public interface StateSerializer<T> {
    @NonNull
    public T defaultValue();

    @NonNull
    public byte[] toByteArray(@NonNull T var1);

    @NonNull
    public T toState(@NonNull byte[] var1) throws IOException;
}


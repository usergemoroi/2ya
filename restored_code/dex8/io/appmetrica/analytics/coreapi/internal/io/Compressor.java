/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.coreapi.internal.io;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;

public interface Compressor {
    @Nullable
    public byte[] compress(@NonNull byte[] var1) throws IOException;

    @Nullable
    public byte[] uncompress(@NonNull byte[] var1) throws IOException;
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.coreutils.internal.io;

import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.io.Compressor;
import io.appmetrica.analytics.coreutils.internal.io.GZIPUtils;
import java.io.IOException;

public class GZIPCompressor
implements Compressor {
    @Override
    @Nullable
    public byte[] compress(@Nullable byte[] byArray) throws IOException {
        if (byArray == null) {
            return null;
        }
        return GZIPUtils.gzipBytes(byArray);
    }

    @Override
    @Nullable
    public byte[] uncompress(@Nullable byte[] byArray) throws IOException {
        if (byArray == null) {
            return null;
        }
        return GZIPUtils.unGzipBytes(byArray);
    }
}


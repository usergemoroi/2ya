/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  okio.e
 */
package okio;

import java.io.Closeable;
import java.io.IOException;
import kotlin.Metadata;
import okio.e;
import okio.m0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u001f\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&\u00a2\u0006\u0004\b\r\u0010\u000e\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u0006\u000f\u00c0\u0006\u0001"}, d2={"Lokio/l0;", "Ljava/io/Closeable;", "Lokio/Closeable;", "Lokio/e;", "sink", "", "byteCount", "read", "(Lokio/e;J)J", "Lokio/m0;", "timeout", "()Lokio/m0;", "Lkotlin/k0;", "close", "()V", "okio"}, k=1, mv={1, 9, 0})
public interface l0
extends Closeable {
    @Override
    public void close() throws IOException;

    public long read(@NotNull e var1, long var2) throws IOException;

    @NotNull
    public m0 timeout();
}


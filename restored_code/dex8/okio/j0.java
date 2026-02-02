/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  okio.e
 */
package okio;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import kotlin.Metadata;
import okio.e;
import okio.m0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&\u00a2\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H&\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H&\u00a2\u0006\u0004\b\u000f\u0010\u000b\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u0006\u0010\u00c0\u0006\u0001"}, d2={"Lokio/j0;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lokio/e;", "source", "", "byteCount", "Lkotlin/k0;", "write", "(Lokio/e;J)V", "flush", "()V", "Lokio/m0;", "timeout", "()Lokio/m0;", "close", "okio"}, k=1, mv={1, 9, 0})
public interface j0
extends Closeable,
Flushable {
    @Override
    public void close() throws IOException;

    @Override
    public void flush() throws IOException;

    @NotNull
    public m0 timeout();

    public void write(@NotNull e var1, long var2) throws IOException;
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Deprecated
 *  kotlin.Metadata
 *  kotlin.ReplaceWith
 *  kotlin.e
 *  okio.h
 *  okio.j0
 *  okio.l0
 *  org.jetbrains.annotations.NotNull
 */
package okio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import okio.e;
import okio.h;
import okio.j0;
import okio.l0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H'\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H&\u00a2\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH&\u00a2\u0006\u0004\b\f\u0010\rJ'\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH&\u00a2\u0006\u0004\b\f\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u0012H&\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H&\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u000eH&\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u000eH&\u00a2\u0006\u0004\b\u001e\u0010\u001cJ\u0017\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u000eH&\u00a2\u0006\u0004\b \u0010\u001cJ\u0017\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0013H&\u00a2\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0013H&\u00a2\u0006\u0004\b$\u0010#J\u000f\u0010&\u001a\u00020%H&\u00a2\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0000H&\u00a2\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0000H&\u00a2\u0006\u0004\b*\u0010)J\u000f\u0010,\u001a\u00020+H&\u00a2\u0006\u0004\b,\u0010-R\u0014\u0010\u0004\u001a\u00020\u00038&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b.\u0010\u0005\u0082\u0001\u0002\u0003/\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u00060\u00c0\u0006\u0001"}, d2={"Lokio/f;", "Lokio/j0;", "Ljava/nio/channels/WritableByteChannel;", "Lokio/e;", "buffer", "()Lokio/e;", "Lokio/h;", "byteString", "j", "(Lokio/h;)Lokio/f;", "", "source", "write", "([B)Lokio/f;", "", "offset", "byteCount", "([BII)Lokio/f;", "Lokio/l0;", "", "G", "(Lokio/l0;)J", "", "string", "writeUtf8", "(Ljava/lang/String;)Lokio/f;", "b", "writeByte", "(I)Lokio/f;", "s", "writeShort", "i", "writeInt", "v", "writeDecimalLong", "(J)Lokio/f;", "writeHexadecimalUnsignedLong", "Lkotlin/k0;", "flush", "()V", "emit", "()Lokio/f;", "emitCompleteSegments", "Ljava/io/OutputStream;", "outputStream", "()Ljava/io/OutputStream;", "getBuffer", "Lokio/e0;", "okio"}, k=1, mv={1, 9, 0})
public interface f
extends j0,
WritableByteChannel {
    public long G(@NotNull l0 var1) throws IOException;

    @Deprecated(level=kotlin.e.c, message="moved to val: use getBuffer() instead", replaceWith=@ReplaceWith(expression="buffer", imports={}))
    @NotNull
    public e buffer();

    @NotNull
    public f emit() throws IOException;

    @NotNull
    public f emitCompleteSegments() throws IOException;

    public void flush() throws IOException;

    @NotNull
    public e getBuffer();

    @NotNull
    public f j(@NotNull h var1) throws IOException;

    @NotNull
    public OutputStream outputStream();

    @NotNull
    public f write(@NotNull byte[] var1) throws IOException;

    @NotNull
    public f write(@NotNull byte[] var1, int var2, int var3) throws IOException;

    @NotNull
    public f writeByte(int var1) throws IOException;

    @NotNull
    public f writeDecimalLong(long var1) throws IOException;

    @NotNull
    public f writeHexadecimalUnsignedLong(long var1) throws IOException;

    @NotNull
    public f writeInt(int var1) throws IOException;

    @NotNull
    public f writeShort(int var1) throws IOException;

    @NotNull
    public f writeUtf8(@NotNull String var1) throws IOException;
}


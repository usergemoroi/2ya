/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  okio.h
 *  okio.j0
 *  okio.l0
 *  org.jetbrains.annotations.NotNull
 */
package okio;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import kotlin.Metadata;
import okio.a0;
import okio.e;
import okio.h;
import okio.j0;
import okio.l0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H&\u00a2\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H&\u00a2\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0014H&\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H&\u00a2\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0006H&\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H&\u00a2\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0006H&\u00a2\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u0006H&\u00a2\u0006\u0004\b\u001c\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&\u00a2\u0006\u0004\b\u001d\u0010\nJ\u000f\u0010\u001f\u001a\u00020\u001eH&\u00a2\u0006\u0004\b\u001f\u0010 J\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0007\u001a\u00020\u0006H&\u00a2\u0006\u0004\b\u001f\u0010!J\u0017\u0010$\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\"H&\u00a2\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H&\u00a2\u0006\u0004\b'\u0010(J\u0017\u0010'\u001a\u00020&2\u0006\u0010\u0007\u001a\u00020\u0006H&\u00a2\u0006\u0004\b'\u0010)J\u0017\u0010+\u001a\u00020\b2\u0006\u0010*\u001a\u00020&H&\u00a2\u0006\u0004\b+\u0010,J\u001f\u0010.\u001a\u00020\b2\u0006\u0010*\u001a\u00020-2\u0006\u0010\u0007\u001a\u00020\u0006H&\u00a2\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00062\u0006\u0010*\u001a\u000200H&\u00a2\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u0002032\u0006\u0010\u0007\u001a\u00020\u0006H&\u00a2\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u000203H&\u00a2\u0006\u0004\b6\u00107J\u0017\u00106\u001a\u0002032\u0006\u00108\u001a\u00020\u0006H&\u00a2\u0006\u0004\b6\u00105J\u0017\u0010;\u001a\u0002032\u0006\u0010:\u001a\u000209H&\u00a2\u0006\u0004\b;\u0010<J\u001f\u0010?\u001a\u00020\u00032\u0006\u0010=\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u001eH&\u00a2\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u0000H&\u00a2\u0006\u0004\bA\u0010BJ\u000f\u0010D\u001a\u00020CH&\u00a2\u0006\u0004\bD\u0010ER\u0014\u0010H\u001a\u00020-8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\bF\u0010G\u0082\u0001\u0002-I\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u0006J\u00c0\u0006\u0001"}, d2={"Lokio/g;", "Lokio/l0;", "Ljava/nio/channels/ReadableByteChannel;", "", "exhausted", "()Z", "", "byteCount", "Lkotlin/k0;", "require", "(J)V", "request", "(J)Z", "", "readByte", "()B", "", "readShort", "()S", "readShortLe", "", "readInt", "()I", "readIntLe", "readLong", "()J", "readLongLe", "readDecimalLong", "readHexadecimalUnsignedLong", "skip", "Lokio/h;", "readByteString", "()Lokio/h;", "(J)Lokio/h;", "Lokio/a0;", "options", "R", "(Lokio/a0;)I", "", "readByteArray", "()[B", "(J)[B", "sink", "readFully", "([B)V", "Lokio/e;", "F", "(Lokio/e;J)V", "Lokio/j0;", "n", "(Lokio/j0;)J", "", "readUtf8", "(J)Ljava/lang/String;", "readUtf8LineStrict", "()Ljava/lang/String;", "limit", "Ljava/nio/charset/Charset;", "charset", "readString", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "offset", "bytes", "b", "(JLokio/h;)Z", "peek", "()Lokio/g;", "Ljava/io/InputStream;", "inputStream", "()Ljava/io/InputStream;", "getBuffer", "()Lokio/e;", "buffer", "Lokio/f0;", "okio"}, k=1, mv={1, 9, 0})
public interface g
extends l0,
ReadableByteChannel {
    public void F(@NotNull e var1, long var2) throws IOException;

    public int R(@NotNull a0 var1) throws IOException;

    public boolean b(long var1, @NotNull h var3) throws IOException;

    public boolean exhausted() throws IOException;

    @NotNull
    public e getBuffer();

    @NotNull
    public InputStream inputStream();

    public long n(@NotNull j0 var1) throws IOException;

    @NotNull
    public g peek();

    public byte readByte() throws IOException;

    @NotNull
    public byte[] readByteArray() throws IOException;

    @NotNull
    public byte[] readByteArray(long var1) throws IOException;

    @NotNull
    public h readByteString() throws IOException;

    @NotNull
    public h readByteString(long var1) throws IOException;

    public long readDecimalLong() throws IOException;

    public void readFully(@NotNull byte[] var1) throws IOException;

    public long readHexadecimalUnsignedLong() throws IOException;

    public int readInt() throws IOException;

    public int readIntLe() throws IOException;

    public long readLong() throws IOException;

    public long readLongLe() throws IOException;

    public short readShort() throws IOException;

    public short readShortLe() throws IOException;

    @NotNull
    public String readString(@NotNull Charset var1) throws IOException;

    @NotNull
    public String readUtf8(long var1) throws IOException;

    @NotNull
    public String readUtf8LineStrict() throws IOException;

    @NotNull
    public String readUtf8LineStrict(long var1) throws IOException;

    public boolean request(long var1) throws IOException;

    public void require(long var1) throws IOException;

    public void skip(long var1) throws IOException;
}


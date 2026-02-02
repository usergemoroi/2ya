/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.JvmField
 *  kotlin.jvm.JvmName
 *  kotlin.jvm.JvmOverloads
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlin.text.d
 *  okio.b
 *  okio.e$a
 *  okio.e$b
 *  okio.e$c
 *  okio.g0
 *  okio.h
 *  okio.h0
 *  okio.internal.a
 *  okio.j0
 *  okio.l0
 *  okio.m0
 *  okio.x
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.collections.l;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.text.d;
import okio.a0;
import okio.d0;
import okio.e;
import okio.f;
import okio.g;
import okio.g0;
import okio.h;
import okio.h0;
import okio.i0;
import okio.j0;
import okio.l0;
import okio.m0;
import okio.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u00b6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u00b4\u0001B\b\u00a2\u0006\u0005\b\u00b3\u0001\u0010XJ\u000f\u0010\u0005\u001a\u00020\u0000H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0000H\u0016\u00a2\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0000H\u0016\u00a2\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\r\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0001H\u0016\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u000f\u00a2\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016\u00a2\u0006\u0004\b\"\u0010#J\u0018\u0010%\u001a\u00020!2\u0006\u0010$\u001a\u00020\u000fH\u0087\u0002\u00a2\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016\u00a2\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016\u00a2\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b-\u0010 J\u000f\u0010.\u001a\u00020'H\u0016\u00a2\u0006\u0004\b.\u0010)J\u000f\u0010/\u001a\u00020*H\u0016\u00a2\u0006\u0004\b/\u0010,J\u000f\u00100\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b0\u0010 J\u000f\u00101\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b1\u0010 J\u000f\u00102\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b2\u0010 J\u000f\u00104\u001a\u000203H\u0016\u00a2\u0006\u0004\b4\u00105J\u0017\u00104\u001a\u0002032\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b4\u00106J\u0017\u00109\u001a\u00020*2\u0006\u00108\u001a\u000207H\u0016\u00a2\u0006\u0004\b9\u0010:J\u001f\u0010<\u001a\u00020\u00112\u0006\u0010;\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020>H\u0016\u00a2\u0006\u0004\b?\u0010@J\u000f\u0010B\u001a\u00020AH\u0016\u00a2\u0006\u0004\bB\u0010CJ\u0017\u0010B\u001a\u00020A2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\bB\u0010DJ\u0017\u0010G\u001a\u00020A2\u0006\u0010F\u001a\u00020EH\u0016\u00a2\u0006\u0004\bG\u0010HJ\u001f\u0010G\u001a\u00020A2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010F\u001a\u00020EH\u0016\u00a2\u0006\u0004\bG\u0010IJ\u000f\u0010J\u001a\u00020AH\u0016\u00a2\u0006\u0004\bJ\u0010CJ\u0017\u0010J\u001a\u00020A2\u0006\u0010K\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\bJ\u0010DJ\u000f\u0010L\u001a\u00020*H\u0016\u00a2\u0006\u0004\bL\u0010,J\u000f\u0010N\u001a\u00020MH\u0016\u00a2\u0006\u0004\bN\u0010OJ\u0017\u0010N\u001a\u00020M2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\bN\u0010PJ\u0017\u0010Q\u001a\u00020\u00112\u0006\u0010;\u001a\u00020MH\u0016\u00a2\u0006\u0004\bQ\u0010RJ'\u0010S\u001a\u00020*2\u0006\u0010;\u001a\u00020M2\u0006\u0010\u001c\u001a\u00020*2\u0006\u0010\u0010\u001a\u00020*H\u0016\u00a2\u0006\u0004\bS\u0010TJ\u0017\u0010S\u001a\u00020*2\u0006\u0010;\u001a\u00020UH\u0016\u00a2\u0006\u0004\bS\u0010VJ\r\u0010W\u001a\u00020\u0011\u00a2\u0006\u0004\bW\u0010XJ\u0017\u0010Y\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\bY\u0010\u0013J\u0017\u0010[\u001a\u00020\u00002\u0006\u0010Z\u001a\u000203H\u0016\u00a2\u0006\u0004\b[\u0010\\J\u0017\u0010^\u001a\u00020\u00002\u0006\u0010]\u001a\u00020AH\u0016\u00a2\u0006\u0004\b^\u0010_J'\u0010b\u001a\u00020\u00002\u0006\u0010]\u001a\u00020A2\u0006\u0010`\u001a\u00020*2\u0006\u0010a\u001a\u00020*H\u0016\u00a2\u0006\u0004\bb\u0010cJ\u0017\u0010e\u001a\u00020\u00002\u0006\u0010d\u001a\u00020*H\u0016\u00a2\u0006\u0004\be\u0010fJ\u001f\u0010g\u001a\u00020\u00002\u0006\u0010]\u001a\u00020A2\u0006\u0010F\u001a\u00020EH\u0016\u00a2\u0006\u0004\bg\u0010hJ/\u0010i\u001a\u00020\u00002\u0006\u0010]\u001a\u00020A2\u0006\u0010`\u001a\u00020*2\u0006\u0010a\u001a\u00020*2\u0006\u0010F\u001a\u00020EH\u0016\u00a2\u0006\u0004\bi\u0010jJ\u0017\u0010l\u001a\u00020\u00002\u0006\u0010k\u001a\u00020MH\u0016\u00a2\u0006\u0004\bl\u0010mJ'\u0010n\u001a\u00020\u00002\u0006\u0010k\u001a\u00020M2\u0006\u0010\u001c\u001a\u00020*2\u0006\u0010\u0010\u001a\u00020*H\u0016\u00a2\u0006\u0004\bn\u0010oJ\u0017\u0010p\u001a\u00020*2\u0006\u0010k\u001a\u00020UH\u0016\u00a2\u0006\u0004\bp\u0010VJ\u0017\u0010r\u001a\u00020\u000f2\u0006\u0010k\u001a\u00020qH\u0016\u00a2\u0006\u0004\br\u0010sJ\u001f\u0010t\u001a\u00020\u00002\u0006\u0010k\u001a\u00020q2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\bt\u0010uJ\u0017\u0010w\u001a\u00020\u00002\u0006\u0010v\u001a\u00020*H\u0016\u00a2\u0006\u0004\bw\u0010fJ\u0017\u0010x\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020*H\u0016\u00a2\u0006\u0004\bx\u0010fJ\u0017\u0010z\u001a\u00020\u00002\u0006\u0010y\u001a\u00020*H\u0016\u00a2\u0006\u0004\bz\u0010fJ\u0017\u0010{\u001a\u00020\u00002\u0006\u0010y\u001a\u00020*H\u0016\u00a2\u0006\u0004\b{\u0010fJ\u0017\u0010}\u001a\u00020\u00002\u0006\u0010|\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b}\u0010~J\u0017\u0010\u007f\u001a\u00020\u00002\u0006\u0010|\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u007f\u0010~J\u0019\u0010\u0080\u0001\u001a\u00020\u00002\u0006\u0010|\u001a\u00020\u000fH\u0016\u00a2\u0006\u0005\b\u0080\u0001\u0010~J\u001c\u0010\u0083\u0001\u001a\u00030\u0082\u00012\u0007\u0010\u0081\u0001\u001a\u00020*H\u0000\u00a2\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u001f\u0010p\u001a\u00020\u00112\u0006\u0010k\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\bp\u0010=J \u0010S\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0005\bS\u0010\u0085\u0001J#\u0010\u0087\u0001\u001a\u00020\u000f2\u0006\u0010v\u001a\u00020!2\u0007\u0010\u0086\u0001\u001a\u00020\u000fH\u0016\u00a2\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J,\u0010\u0087\u0001\u001a\u00020\u000f2\u0006\u0010v\u001a\u00020!2\u0007\u0010\u0086\u0001\u001a\u00020\u000f2\u0007\u0010\u0089\u0001\u001a\u00020\u000fH\u0016\u00a2\u0006\u0006\b\u0087\u0001\u0010\u008a\u0001J\u001b\u0010\u008c\u0001\u001a\u00020\u000f2\u0007\u0010\u008b\u0001\u001a\u000203H\u0016\u00a2\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J$\u0010\u008e\u0001\u001a\u00020\u000f2\u0007\u0010\u008b\u0001\u001a\u0002032\u0007\u0010\u0086\u0001\u001a\u00020\u000fH\u0016\u00a2\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J!\u0010v\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u000f2\u0007\u0010\u0090\u0001\u001a\u000203H\u0016\u00a2\u0006\u0005\bv\u0010\u0091\u0001J4\u0010\u0093\u0001\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u000f2\u0007\u0010\u0090\u0001\u001a\u0002032\u0007\u0010\u0092\u0001\u001a\u00020*2\u0006\u0010\u0010\u001a\u00020*H\u0016\u00a2\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u0011\u0010\u0095\u0001\u001a\u00020\u0011H\u0016\u00a2\u0006\u0005\b\u0095\u0001\u0010XJ\u0011\u0010\u0096\u0001\u001a\u00020\fH\u0016\u00a2\u0006\u0005\b\u0096\u0001\u0010\u000eJ\u0011\u0010\u0097\u0001\u001a\u00020\u0011H\u0016\u00a2\u0006\u0005\b\u0097\u0001\u0010XJ\u0013\u0010\u0099\u0001\u001a\u00030\u0098\u0001H\u0016\u00a2\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u001f\u0010\u009d\u0001\u001a\u00020\f2\n\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u009b\u0001H\u0096\u0002\u00a2\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u0011\u0010\u009f\u0001\u001a\u00020*H\u0016\u00a2\u0006\u0005\b\u009f\u0001\u0010,J\u0011\u0010\u00a0\u0001\u001a\u00020AH\u0016\u00a2\u0006\u0005\b\u00a0\u0001\u0010CJ\u000f\u0010\u00a1\u0001\u001a\u00020\u0000\u00a2\u0006\u0005\b\u00a1\u0001\u0010\u0006J\u0011\u0010\u00a2\u0001\u001a\u00020\u0000H\u0016\u00a2\u0006\u0005\b\u00a2\u0001\u0010\u0006J\u000f\u0010\u00a3\u0001\u001a\u000203\u00a2\u0006\u0005\b\u00a3\u0001\u00105J\u0018\u0010\u00a4\u0001\u001a\u0002032\u0006\u0010\u0010\u001a\u00020*\u00a2\u0006\u0006\b\u00a4\u0001\u0010\u00a5\u0001J\u001f\u0010\u00a8\u0001\u001a\u00030\u00a6\u00012\n\b\u0002\u0010\u00a7\u0001\u001a\u00030\u00a6\u0001H\u0007\u00a2\u0006\u0006\b\u00a8\u0001\u0010\u00a9\u0001R\u001c\u0010\u00ac\u0001\u001a\u0005\u0018\u00010\u0082\u00018\u0000@\u0000X\u0081\u000e\u00a2\u0006\b\n\u0006\b\u00aa\u0001\u0010\u00ab\u0001R0\u0010\u00b0\u0001\u001a\u00020\u000f2\u0007\u0010\u00ad\u0001\u001a\u00020\u000f8G@@X\u0086\u000e\u00a2\u0006\u0016\n\u0006\b\u00ae\u0001\u0010\u00af\u0001\u001a\u0005\b\u00b0\u0001\u0010 \"\u0005\b\u00b1\u0001\u0010\u0013R\u0015\u0010\u0005\u001a\u00020\u00008VX\u0096\u0004\u00a2\u0006\u0007\u001a\u0005\b\u00b2\u0001\u0010\u0006\u00a8\u0006\u00b5\u0001"}, d2={"Lokio/e;", "Lokio/g;", "Lokio/f;", "", "Ljava/nio/channels/ByteChannel;", "buffer", "()Lokio/e;", "Ljava/io/OutputStream;", "outputStream", "()Ljava/io/OutputStream;", "s", "r", "", "exhausted", "()Z", "", "byteCount", "Lkotlin/k0;", "require", "(J)V", "request", "(J)Z", "peek", "()Lokio/g;", "Ljava/io/InputStream;", "inputStream", "()Ljava/io/InputStream;", "out", "offset", "q", "(Lokio/e;JJ)Lokio/e;", "m", "()J", "", "readByte", "()B", "pos", "w", "(J)B", "", "readShort", "()S", "", "readInt", "()I", "readLong", "readShortLe", "readIntLe", "readLongLe", "readDecimalLong", "readHexadecimalUnsignedLong", "Lokio/h;", "readByteString", "()Lokio/h;", "(J)Lokio/h;", "Lokio/a0;", "options", "R", "(Lokio/a0;)I", "sink", "F", "(Lokio/e;J)V", "Lokio/j0;", "n", "(Lokio/j0;)J", "", "readUtf8", "()Ljava/lang/String;", "(J)Ljava/lang/String;", "Ljava/nio/charset/Charset;", "charset", "readString", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "(JLjava/nio/charset/Charset;)Ljava/lang/String;", "readUtf8LineStrict", "limit", "readUtf8CodePoint", "", "readByteArray", "()[B", "(J)[B", "readFully", "([B)V", "read", "([BII)I", "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)I", "k", "()V", "skip", "byteString", "U", "(Lokio/h;)Lokio/e;", "string", "h0", "(Ljava/lang/String;)Lokio/e;", "beginIndex", "endIndex", "i0", "(Ljava/lang/String;II)Lokio/e;", "codePoint", "j0", "(I)Lokio/e;", "g0", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lokio/e;", "f0", "(Ljava/lang/String;IILjava/nio/charset/Charset;)Lokio/e;", "source", "W", "([B)Lokio/e;", "X", "([BII)Lokio/e;", "write", "Lokio/l0;", "G", "(Lokio/l0;)J", "V", "(Lokio/l0;J)Lokio/e;", "b", "Y", "e0", "i", "b0", "c0", "v", "d0", "(J)Lokio/e;", "Z", "a0", "minimumCapacity", "Lokio/g0;", "T", "(I)Lokio/g0;", "(Lokio/e;J)J", "fromIndex", "indexOf", "(BJ)J", "toIndex", "(BJJ)J", "targetBytes", "y", "(Lokio/h;)J", "z", "(Lokio/h;J)J", "bytes", "(JLokio/h;)Z", "bytesOffset", "A", "(JLokio/h;II)Z", "flush", "isOpen", "close", "Lokio/m0;", "timeout", "()Lokio/m0;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "p", "l", "M", "S", "(I)Lokio/h;", "Lokio/e$a;", "unsafeCursor", "C", "(Lokio/e$a;)Lokio/e$a;", "c", "Lokio/g0;", "head", "<set-?>", "d", "J", "size", "L", "getBuffer", "<init>", "a", "okio"}, k=1, mv={1, 9, 0})
@SourceDebugExtension(value={"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/Buffer\n+ 2 Util.kt\nokio/-SegmentedByteString\n+ 3 Buffer.kt\nokio/internal/-Buffer\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,641:1\n89#2:642\n86#2:675\n86#2:677\n74#2:737\n74#2:763\n83#2:802\n77#2:813\n89#2:1003\n74#2:1018\n86#2:1122\n89#2:1615\n244#3,32:643\n279#3,10:678\n292#3,18:688\n414#3,2:706\n112#3:708\n416#3:709\n114#3,18:710\n313#3,9:728\n322#3,15:738\n340#3,10:753\n350#3,3:764\n348#3,25:767\n376#3,10:792\n386#3:803\n384#3,9:804\n393#3,7:814\n391#3,20:821\n682#3,60:841\n745#3,56:901\n803#3:957\n806#3:958\n807#3,6:960\n817#3,7:966\n827#3,6:973\n835#3,5:979\n867#3,6:984\n877#3:990\n878#3,11:992\n889#3,5:1004\n898#3,9:1009\n908#3,61:1019\n633#3:1080\n636#3:1081\n637#3,5:1083\n644#3:1088\n647#3,7:1089\n656#3,20:1096\n420#3:1116\n423#3,5:1117\n428#3,10:1123\n439#3,7:1133\n444#3,2:1140\n973#3:1142\n974#3,87:1144\n1064#3,48:1231\n603#3:1279\n610#3,21:1280\n1115#3,7:1301\n1125#3,7:1308\n1135#3,4:1315\n1142#3,8:1319\n1153#3,10:1327\n1166#3,14:1337\n449#3,91:1351\n543#3,40:1442\n586#3:1482\n588#3,13:1484\n1183#3:1497\n1234#3:1498\n1235#3,39:1500\n1276#3,2:1539\n1278#3,4:1542\n1285#3,3:1546\n1289#3,4:1550\n112#3:1554\n1293#3,22:1555\n114#3,18:1577\n1319#3,2:1595\n1321#3,3:1598\n112#3:1601\n1324#3,13:1602\n1337#3,13:1616\n114#3,18:1629\n1354#3,2:1647\n1357#3:1650\n112#3:1651\n1358#3,50:1652\n114#3,18:1702\n1417#3,14:1720\n1434#3,32:1734\n1469#3,12:1766\n1484#3,18:1778\n1506#3:1796\n1507#3:1798\n1512#3,34:1799\n1#4:676\n1#4:959\n1#4:991\n1#4:1082\n1#4:1143\n1#4:1483\n1#4:1499\n1#4:1541\n1#4:1549\n1#4:1597\n1#4:1649\n1#4:1797\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/Buffer\n*L\n167#1:642\n197#1:675\n235#1:677\n261#1:737\n264#1:763\n267#1:802\n267#1:813\n335#1:1003\n338#1:1018\n374#1:1122\n483#1:1615\n181#1:643,32\n252#1:678,10\n255#1:688,18\n258#1:706,2\n258#1:708\n258#1:709\n258#1:710,18\n261#1:728,9\n261#1:738,15\n264#1:753,10\n264#1:764,3\n264#1:767,25\n267#1:792,10\n267#1:803\n267#1:804,9\n267#1:814,7\n267#1:821,20\n279#1:841,60\n282#1:901,56\n284#1:957\n287#1:958\n287#1:960,6\n289#1:966,7\n292#1:973,6\n295#1:979,5\n329#1:984,6\n335#1:990\n335#1:992,11\n335#1:1004,5\n338#1:1009,9\n338#1:1019,61\n340#1:1080\n343#1:1081\n343#1:1083,5\n345#1:1088\n348#1:1089,7\n351#1:1096,20\n371#1:1116\n374#1:1117,5\n374#1:1123,10\n376#1:1133,7\n379#1:1140,2\n384#1:1142\n384#1:1144,87\n387#1:1231,48\n410#1:1279\n416#1:1280,21\n437#1:1301,7\n441#1:1308,7\n443#1:1315,4\n445#1:1319,8\n449#1:1327,10\n453#1:1337,14\n457#1:1351,91\n460#1:1442,40\n463#1:1482\n463#1:1484,13\n465#1:1497\n465#1:1498\n465#1:1500,39\n467#1:1539,2\n467#1:1542,4\n477#1:1546,3\n477#1:1550,4\n477#1:1554\n477#1:1555,22\n477#1:1577,18\n483#1:1595,2\n483#1:1598,3\n483#1:1601\n483#1:1602,13\n483#1:1616,13\n483#1:1629,18\n488#1:1647,2\n488#1:1650\n488#1:1651\n488#1:1652,50\n488#1:1702,18\n498#1:1720,14\n568#1:1734,32\n570#1:1766,12\n578#1:1778,18\n586#1:1796\n586#1:1798\n588#1:1799,34\n287#1:959\n335#1:991\n343#1:1082\n384#1:1143\n463#1:1483\n465#1:1499\n467#1:1541\n477#1:1549\n483#1:1597\n488#1:1649\n586#1:1797\n*E\n"})
public final class e
implements g,
f,
Cloneable,
ByteChannel {
    @JvmField
    @Nullable
    public g0 c;
    private long d;

    public static /* synthetic */ a H(e e4, a a4, int n4, Object object) {
        if ((n4 & 1) != 0) {
            a4 = okio.b.d();
        }
        return e4.C(a4);
    }

    public boolean A(long l4, @NotNull h h4, int n4, int n5) {
        boolean bl;
        block7: {
            boolean bl2;
            y.j((Object)h4, (String)"bytes");
            bl = bl2 = false;
            if (l4 >= 0L) {
                bl = bl2;
                if (n4 >= 0) {
                    bl = bl2;
                    if (n5 >= 0) {
                        bl = bl2;
                        if (this.size() - l4 >= (long)n5) {
                            if (h4.C() - n4 < n5) {
                                bl = bl2;
                            } else {
                                for (int i4 = 0; i4 < n5; ++i4) {
                                    if (this.w((long)i4 + l4) == h4.g(n4 + i4)) continue;
                                    bl = bl2;
                                    break block7;
                                }
                                bl = true;
                            }
                        }
                    }
                }
            }
        }
        return bl;
    }

    @JvmOverloads
    @NotNull
    public final a C(@NotNull a a4) {
        y.j((Object)a4, (String)"unsafeCursor");
        return okio.internal.a.a((e)this, a4);
    }

    @Override
    public void F(@NotNull e e4, long l4) throws EOFException {
        y.j((Object)e4, (String)"sink");
        if (this.size() >= l4) {
            e4.write(this, l4);
            return;
        }
        e4.write(this, this.size());
        throw new EOFException();
    }

    @Override
    public long G(@NotNull l0 l02) throws IOException {
        long l4;
        y.j((Object)l02, (String)"source");
        long l5 = 0L;
        while ((l4 = l02.read(this, 8192L)) != -1L) {
            l5 += l4;
        }
        return l5;
    }

    public final void L(long l4) {
        this.d = l4;
    }

    @NotNull
    public final h M() {
        if (this.size() <= Integer.MAX_VALUE) {
            return this.S((int)this.size());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("size > Int.MAX_VALUE: ");
        stringBuilder.append(this.size());
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    @Override
    public int R(@NotNull a0 a02) {
        y.j((Object)a02, (String)"options");
        int n4 = okio.internal.a.e((e)this, (a0)a02, (boolean)false, (int)2, null);
        if (n4 == -1) {
            n4 = -1;
        } else {
            this.skip(a02.e()[n4].C());
        }
        return n4;
    }

    @NotNull
    public final h S(int n4) {
        h h4;
        if (n4 == 0) {
            h4 = h.g;
        } else {
            okio.b.b((long)this.size(), (long)0L, (long)n4);
            h4 = this.c;
            int n5 = 0;
            int n6 = 0;
            int n7 = 0;
            while (n6 < n4) {
                y.g((Object)h4);
                int n8 = h4.c;
                int n9 = h4.b;
                if (n8 != n9) {
                    n6 += n8 - n9;
                    ++n7;
                    h4 = h4.f;
                    continue;
                }
                throw new AssertionError((Object)"s.limit == s.pos");
            }
            byte[][] byArrayArray = new byte[n7][];
            int[] nArray = new int[n7 * 2];
            h4 = this.c;
            n6 = 0;
            while (n5 < n4) {
                y.g((Object)h4);
                byArrayArray[n6] = h4.a;
                nArray[n6] = Math.min(n5 += h4.c - h4.b, n4);
                nArray[n6 + n7] = h4.b;
                h4.d = true;
                ++n6;
                h4 = h4.f;
            }
            h4 = new i0(byArrayArray, nArray);
        }
        return h4;
    }

    @NotNull
    public final g0 T(int n4) {
        if (n4 >= 1 && n4 <= 8192) {
            g0 g02 = this.c;
            if (g02 == null) {
                this.c = g02 = h0.c();
                g02.g = g02;
                g02.f = g02;
            } else {
                y.g((Object)g02);
                g02 = g02.g;
                y.g((Object)g02);
                if (g02.c + n4 > 8192 || !g02.e) {
                    g02 = g02.c(h0.c());
                }
            }
            return g02;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    @NotNull
    public e U(@NotNull h h4) {
        y.j((Object)h4, (String)"byteString");
        h4.J(this, 0, h4.C());
        return this;
    }

    @NotNull
    public e V(@NotNull l0 l02, long l4) throws IOException {
        y.j((Object)l02, (String)"source");
        while (l4 > 0L) {
            long l5 = l02.read(this, l4);
            if (l5 != -1L) {
                l4 -= l5;
                continue;
            }
            throw new EOFException();
        }
        return this;
    }

    @NotNull
    public e W(@NotNull byte[] byArray) {
        y.j((Object)byArray, (String)"source");
        return this.X(byArray, 0, byArray.length);
    }

    @NotNull
    public e X(@NotNull byte[] byArray, int n4, int n5) {
        y.j((Object)byArray, (String)"source");
        long l4 = byArray.length;
        long l5 = n4;
        long l6 = n5;
        okio.b.b((long)l4, (long)l5, (long)l6);
        int n6 = n5 + n4;
        while (n4 < n6) {
            g0 g02 = this.T(1);
            int n7 = Math.min(n6 - n4, 8192 - g02.c);
            byte[] byArray2 = g02.a;
            int n8 = g02.c;
            n5 = n4 + n7;
            l.h(byArray, byArray2, n8, n4, n5);
            g02.c += n7;
            n4 = n5;
        }
        this.L(this.size() + l6);
        return this;
    }

    @NotNull
    public e Y(int n4) {
        g0 g02 = this.T(1);
        byte[] byArray = g02.a;
        int n5 = g02.c;
        g02.c = n5 + 1;
        byArray[n5] = (byte)n4;
        this.L(this.size() + 1L);
        return this;
    }

    @NotNull
    public e Z(long l4) {
        Object object;
        block11: {
            int n4;
            long l5;
            block14: {
                block12: {
                    block13: {
                        block10: {
                            long l6 = l4 - 0L;
                            l5 = l6 == 0L ? 0 : (l6 < 0L ? -1 : 1);
                            if (l5 != false) break block10;
                            object = this.Y(48);
                            break block11;
                        }
                        n4 = 1;
                        if (l5 >= 0) break block12;
                        if ((l4 = -l4) >= 0L) break block13;
                        object = this.h0("-9223372036854775808");
                        break block11;
                    }
                    l5 = 1;
                    break block14;
                }
                l5 = 0;
            }
            if (l4 < 100000000L) {
                if (l4 < 10000L) {
                    if (l4 < 100L) {
                        if (l4 >= 10L) {
                            n4 = 2;
                        }
                    } else {
                        n4 = l4 < 1000L ? 3 : 4;
                    }
                } else {
                    n4 = l4 < 1000000L ? (l4 < 100000L ? 5 : 6) : (l4 < 10000000L ? 7 : 8);
                }
            } else {
                n4 = l4 < 1000000000000L ? (l4 < 10000000000L ? (l4 < 1000000000L ? 9 : 10) : (l4 < 100000000000L ? 11 : 12)) : (l4 < 1000000000000000L ? (l4 < 10000000000000L ? 13 : (l4 < 100000000000000L ? 14 : 15)) : (l4 < 100000000000000000L ? (l4 < 10000000000000000L ? 16 : 17) : (l4 < 1000000000000000000L ? 18 : 19)));
            }
            int n5 = n4;
            if (l5 != false) {
                n5 = n4 + 1;
            }
            g0 g02 = this.T(n5);
            object = g02.a;
            n4 = g02.c + n5;
            while (l4 != 0L) {
                long l7 = 10;
                int n6 = (int)(l4 % l7);
                object[--n4] = okio.internal.a.b()[n6];
                l4 /= l7;
            }
            if (l5 != false) {
                object[n4 - 1] = 45;
            }
            g02.c += n5;
            this.L(this.size() + (long)n5);
            object = this;
        }
        return object;
    }

    @NotNull
    public e a0(long l4) {
        Object object;
        if (l4 == 0L) {
            object = this.Y(48);
        } else {
            long l5 = l4 >>> 1 | l4;
            l5 |= l5 >>> 2;
            l5 |= l5 >>> 4;
            l5 |= l5 >>> 8;
            l5 |= l5 >>> 16;
            l5 |= l5 >>> 32;
            l5 -= l5 >>> 1 & 0x5555555555555555L;
            l5 = (l5 >>> 2 & 0x3333333333333333L) + (l5 & 0x3333333333333333L);
            l5 = (l5 >>> 4) + l5 & 0xF0F0F0F0F0F0F0FL;
            l5 += l5 >>> 8;
            l5 += l5 >>> 16;
            int n4 = (int)(((l5 & 0x3FL) + (l5 >>> 32 & 0x3FL) + (long)3) / (long)4);
            g0 g02 = this.T(n4);
            object = g02.a;
            int n5 = g02.c;
            for (int i4 = n5 + n4 - 1; i4 >= n5; --i4) {
                object[i4] = okio.internal.a.b()[(int)(0xFL & l4)];
                l4 >>>= 4;
            }
            g02.c += n4;
            this.L(this.size() + (long)n4);
            object = this;
        }
        return object;
    }

    @Override
    public boolean b(long l4, @NotNull h h4) {
        y.j((Object)h4, (String)"bytes");
        return this.A(l4, h4, 0, h4.C());
    }

    @NotNull
    public e b0(int n4) {
        g0 g02 = this.T(4);
        byte[] byArray = g02.a;
        int n5 = g02.c;
        byArray[n5] = (byte)(n4 >>> 24 & 0xFF);
        byArray[n5 + 1] = (byte)(n4 >>> 16 & 0xFF);
        byArray[n5 + 2] = (byte)(n4 >>> 8 & 0xFF);
        byArray[n5 + 3] = (byte)(n4 & 0xFF);
        g02.c = n5 + 4;
        this.L(this.size() + 4L);
        return this;
    }

    @Override
    @NotNull
    public e buffer() {
        return this;
    }

    @NotNull
    public e c0(int n4) {
        return this.b0(okio.b.h((int)n4));
    }

    @Override
    public void close() {
    }

    @NotNull
    public e d0(long l4) {
        g0 g02 = this.T(8);
        byte[] byArray = g02.a;
        int n4 = g02.c;
        byArray[n4] = (byte)(l4 >>> 56 & 0xFFL);
        byArray[n4 + 1] = (byte)(l4 >>> 48 & 0xFFL);
        byArray[n4 + 2] = (byte)(l4 >>> 40 & 0xFFL);
        byArray[n4 + 3] = (byte)(l4 >>> 32 & 0xFFL);
        byArray[n4 + 4] = (byte)(l4 >>> 24 & 0xFFL);
        byArray[n4 + 5] = (byte)(l4 >>> 16 & 0xFFL);
        byArray[n4 + 6] = (byte)(l4 >>> 8 & 0xFFL);
        byArray[n4 + 7] = (byte)(l4 & 0xFFL);
        g02.c = n4 + 8;
        this.L(this.size() + 8L);
        return this;
    }

    @NotNull
    public e e0(int n4) {
        g0 g02 = this.T(2);
        byte[] byArray = g02.a;
        int n5 = g02.c;
        byArray[n5] = (byte)(n4 >>> 8 & 0xFF);
        byArray[n5 + 1] = (byte)(n4 & 0xFF);
        g02.c = n5 + 2;
        this.L(this.size() + 2L);
        return this;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public boolean equals(@Nullable Object object) {
        boolean bl = true;
        if (this == object) {
            return bl;
        }
        if (!(object instanceof e)) return false;
        long l4 = this.size();
        if (l4 == ((e)(object = (e)object)).size()) {
            if (this.size() == 0L) {
                return bl;
            }
            g0 g02 = this.c;
            y.g((Object)g02);
            object = ((e)object).c;
            y.g((Object)object);
            int n4 = g02.b;
            int n5 = ((g0)object).b;
            l4 = 0L;
            block0: while (true) {
                void var14_9;
                void var14_6;
                boolean bl2 = bl;
                if (l4 >= this.size()) return bl2;
                long l5 = Math.min(var14_6.c - n4, ((g0)object).c - n5);
                int n6 = n4;
                for (long i4 = 0L; i4 < l5; ++i4, ++n6, ++n5) {
                    if (var14_6.a[n6] != ((g0)object).a[n5]) break block0;
                }
                g0 g03 = var14_6;
                n4 = n6;
                if (n6 == var14_6.c) {
                    g03 = var14_6.f;
                    y.g((Object)g03);
                    n4 = g03.b;
                }
                Object object2 = object;
                n6 = n5;
                if (n5 == ((g0)object).c) {
                    g0 g04 = ((g0)object).f;
                    y.g((Object)g04);
                    n6 = g04.b;
                }
                l4 += l5;
                object = var14_9;
                g0 g05 = g03;
                n5 = n6;
            }
        }
        return false;
    }

    @Override
    public boolean exhausted() {
        boolean bl = this.d == 0L;
        return bl;
    }

    @NotNull
    public e f0(@NotNull String object, int n4, int n5, @NotNull Charset comparable) {
        y.j((Object)object, (String)"string");
        y.j((Object)comparable, (String)"charset");
        if (n4 >= 0) {
            if (n5 >= n4) {
                if (n5 <= ((String)object).length()) {
                    if (y.e((Object)comparable, (Object)kotlin.text.d.b)) {
                        return this.i0((String)object, n4, n5);
                    }
                    object = ((String)object).substring(n4, n5);
                    y.i((Object)object, (String)"this as java.lang.String\u2026ing(startIndex, endIndex)");
                    object = ((String)object).getBytes((Charset)comparable);
                    y.i((Object)object, (String)"this as java.lang.String).getBytes(charset)");
                    return this.X((byte[])object, 0, ((Object)object).length);
                }
                comparable = new StringBuilder();
                ((StringBuilder)comparable).append("endIndex > string.length: ");
                ((StringBuilder)comparable).append(n5);
                ((StringBuilder)comparable).append(" > ");
                ((StringBuilder)comparable).append(((String)object).length());
                throw new IllegalArgumentException(((StringBuilder)comparable).toString().toString());
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("endIndex < beginIndex: ");
            ((StringBuilder)object).append(n5);
            ((StringBuilder)object).append(" < ");
            ((StringBuilder)object).append(n4);
            throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("beginIndex < 0: ");
        ((StringBuilder)object).append(n4);
        throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
    }

    @Override
    public void flush() {
    }

    @NotNull
    public e g0(@NotNull String string, @NotNull Charset charset) {
        y.j((Object)string, (String)"string");
        y.j((Object)charset, (String)"charset");
        return this.f0(string, 0, string.length(), charset);
    }

    @Override
    @NotNull
    public e getBuffer() {
        return this;
    }

    @NotNull
    public e h0(@NotNull String string) {
        y.j((Object)string, (String)"string");
        return this.i0(string, 0, string.length());
    }

    public int hashCode() {
        int n4;
        g0 g02 = this.c;
        if (g02 == null) {
            n4 = 0;
        } else {
            g0 g03;
            int n5 = 1;
            do {
                int n6 = g02.c;
                n4 = n5;
                for (int i4 = g02.b; i4 < n6; ++i4) {
                    n4 = n4 * 31 + g02.a[i4];
                }
                g03 = g02.f;
                y.g((Object)g03);
                g02 = g03;
                n5 = n4;
            } while (g03 != this.c);
        }
        return n4;
    }

    /*
     * Enabled aggressive block sorting
     */
    @NotNull
    public e i0(@NotNull String charSequence, int n4, int n5) {
        y.j((Object)charSequence, (String)"string");
        if (n4 < 0) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("beginIndex < 0: ");
            ((StringBuilder)charSequence).append(n4);
            throw new IllegalArgumentException(((StringBuilder)charSequence).toString().toString());
        }
        if (n5 < n4) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("endIndex < beginIndex: ");
            ((StringBuilder)charSequence).append(n5);
            ((StringBuilder)charSequence).append(" < ");
            ((StringBuilder)charSequence).append(n4);
            throw new IllegalArgumentException(((StringBuilder)charSequence).toString().toString());
        }
        if (n5 > ((String)charSequence).length()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("endIndex > string.length: ");
            stringBuilder.append(n5);
            stringBuilder.append(" > ");
            stringBuilder.append(((String)charSequence).length());
            throw new IllegalArgumentException(stringBuilder.toString().toString());
        }
        while (n4 < n5) {
            int n6;
            int n7;
            char c4 = ((String)charSequence).charAt(n4);
            if (c4 < '\u0080') {
                g0 g02 = this.T(1);
                byte[] byArray = g02.a;
                n7 = g02.c - n4;
                int n8 = Math.min(n5, 8192 - n7);
                n6 = n4 + 1;
                byArray[n4 + n7] = (byte)c4;
                n4 = n6;
                while (n4 < n8 && (c4 = ((String)charSequence).charAt(n4)) < '\u0080') {
                    n6 = n4 + 1;
                    byArray[n4 + n7] = (byte)c4;
                    n4 = n6;
                }
                n6 = g02.c;
                n7 = n7 + n4 - n6;
                g02.c = n6 + n7;
                this.L(this.size() + (long)n7);
                continue;
            }
            if (c4 < '\u0800') {
                g0 g03 = this.T(2);
                byte[] byArray = g03.a;
                n6 = g03.c;
                byArray[n6] = (byte)(c4 >> 6 | 0xC0);
                byArray[n6 + 1] = (byte)(c4 & 0x3F | 0x80);
                g03.c = n6 + 2;
                this.L(this.size() + 2L);
            } else {
                if (c4 >= '\ud800' && c4 <= '\udfff') {
                    n7 = n4 + 1;
                    n6 = n7 < n5 ? (int)((String)charSequence).charAt(n7) : 0;
                    if (c4 <= '\udbff' && 56320 <= n6 && n6 < 57344) {
                        n6 = ((c4 & 0x3FF) << 10 | n6 & 0x3FF) + 65536;
                        g0 g04 = this.T(4);
                        byte[] byArray = g04.a;
                        n7 = g04.c;
                        byArray[n7] = (byte)(n6 >> 18 | 0xF0);
                        byArray[n7 + 1] = (byte)(n6 >> 12 & 0x3F | 0x80);
                        byArray[n7 + 2] = (byte)(n6 >> 6 & 0x3F | 0x80);
                        byArray[n7 + 3] = (byte)(n6 & 0x3F | 0x80);
                        g04.c = n7 + 4;
                        this.L(this.size() + 4L);
                        n4 += 2;
                        continue;
                    }
                    this.Y(63);
                    n4 = n7;
                    continue;
                }
                g0 g05 = this.T(3);
                byte[] byArray = g05.a;
                n6 = g05.c;
                byArray[n6] = (byte)(c4 >> 12 | 0xE0);
                byArray[n6 + 1] = (byte)(0x3F & c4 >> 6 | 0x80);
                byArray[n6 + 2] = (byte)(c4 & 0x3F | 0x80);
                g05.c = n6 + 3;
                this.L(this.size() + 3L);
            }
            ++n4;
        }
        return this;
    }

    public long indexOf(byte by, long l4) {
        return this.indexOf(by, l4, Long.MAX_VALUE);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public long indexOf(byte by, long l4, long l5) {
        int n4;
        g0 g02;
        long l6;
        long l7;
        long l8;
        block14: {
            long l9;
            block13: {
                l8 = 0L;
                if (0L <= l4 && l4 <= l5) {
                    l7 = l5;
                    if (l5 > this.size()) {
                        l7 = this.size();
                    }
                    l6 = -1L;
                    if (l4 == l7) {
                        return l6;
                    }
                    g02 = this.c;
                    if (g02 == null) {
                        return l6;
                    }
                    l5 = l8;
                    g0 g03 = g02;
                    if (this.size() - l4 < l4) {
                        l8 = this.size();
                        g0 g04 = g02;
                        while (true) {
                            void var17_11;
                            l5 = l8;
                            g02 = var17_11;
                            l9 = l4;
                            if (l8 > l4) {
                                g0 g05 = var17_11.g;
                                y.g((Object)g05);
                                l8 -= (long)(g05.c - g05.b);
                                continue;
                            }
                            break block13;
                            break;
                        }
                    }
                    while (true) {
                        void var17_15;
                        long l10 = (long)(var17_15.c - var17_15.b) + l5;
                        g02 = var17_15;
                        l8 = l4;
                        if (l10 <= l4) {
                            g0 g06 = var17_15.f;
                            y.g((Object)g06);
                            l5 = l10;
                            continue;
                        }
                        break block14;
                        break;
                    }
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("size=");
                stringBuilder.append(this.size());
                stringBuilder.append(" fromIndex=");
                stringBuilder.append(l4);
                stringBuilder.append(" toIndex=");
                stringBuilder.append(l5);
                throw new IllegalArgumentException(stringBuilder.toString().toString());
            }
            while (true) {
                l4 = l6;
                if (l5 >= l7) return l4;
                byte[] byArray = g02.a;
                int n5 = (int)Math.min((long)g02.c, (long)g02.b + l7 - l5);
                for (n4 = (int)((long)g02.b + l9 - l5); n4 < n5; ++n4) {
                    if (byArray[n4] == by) return (long)(n4 - g02.b) + l5;
                }
                g02 = g02.f;
                y.g((Object)g02);
                l9 = l5 += (long)(g02.c - g02.b);
            }
        }
        while (true) {
            l4 = l6;
            if (l5 >= l7) return l4;
            byte[] byArray = g02.a;
            int n6 = (int)Math.min((long)g02.c, (long)g02.b + l7 - l5);
            for (n4 = (int)((long)g02.b + l8 - l5); n4 < n6; ++n4) {
                if (byArray[n4] != by) continue;
                return (long)(n4 - g02.b) + l5;
            }
            g02 = g02.f;
            y.g((Object)g02);
            l8 = l5 += (long)(g02.c - g02.b);
        }
    }

    @Override
    @NotNull
    public InputStream inputStream() {
        return new b(this);
    }

    @Override
    public boolean isOpen() {
        return true;
    }

    @NotNull
    public e j0(int n4) {
        block7: {
            block3: {
                block6: {
                    block5: {
                        block4: {
                            block2: {
                                if (n4 >= 128) break block2;
                                this.Y(n4);
                                break block3;
                            }
                            if (n4 >= 2048) break block4;
                            g0 g02 = this.T(2);
                            byte[] byArray = g02.a;
                            int n5 = g02.c;
                            byArray[n5] = (byte)(n4 >> 6 | 0xC0);
                            byArray[n5 + 1] = (byte)(n4 & 0x3F | 0x80);
                            g02.c = n5 + 2;
                            this.L(this.size() + 2L);
                            break block3;
                        }
                        if (55296 > n4 || n4 >= 57344) break block5;
                        this.Y(63);
                        break block3;
                    }
                    if (n4 >= 65536) break block6;
                    g0 g03 = this.T(3);
                    byte[] byArray = g03.a;
                    int n6 = g03.c;
                    byArray[n6] = (byte)(n4 >> 12 | 0xE0);
                    byArray[n6 + 1] = (byte)(n4 >> 6 & 0x3F | 0x80);
                    byArray[n6 + 2] = (byte)(n4 & 0x3F | 0x80);
                    g03.c = n6 + 3;
                    this.L(this.size() + 3L);
                    break block3;
                }
                if (n4 > 0x10FFFF) break block7;
                g0 g04 = this.T(4);
                byte[] byArray = g04.a;
                int n7 = g04.c;
                byArray[n7] = (byte)(n4 >> 18 | 0xF0);
                byArray[n7 + 1] = (byte)(n4 >> 12 & 0x3F | 0x80);
                byArray[n7 + 2] = (byte)(n4 >> 6 & 0x3F | 0x80);
                byArray[n7 + 3] = (byte)(n4 & 0x3F | 0x80);
                g04.c = n7 + 4;
                this.L(this.size() + 4L);
            }
            return this;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected code point: 0x");
        stringBuilder.append(okio.b.l((int)n4));
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final void k() {
        this.skip(this.size());
    }

    @NotNull
    public e l() {
        return this.p();
    }

    public final long m() {
        long l4 = this.size();
        long l5 = 0L;
        if (l4 != 0L) {
            g0 g02 = this.c;
            y.g((Object)g02);
            g02 = g02.g;
            y.g((Object)g02);
            int n4 = g02.c;
            l5 = l4;
            if (n4 < 8192) {
                l5 = l4;
                if (g02.e) {
                    l5 = l4 - (long)(n4 - g02.b);
                }
            }
        }
        return l5;
    }

    @Override
    public long n(@NotNull j0 j02) throws IOException {
        y.j((Object)j02, (String)"sink");
        long l4 = this.size();
        if (l4 > 0L) {
            j02.write(this, l4);
        }
        return l4;
    }

    @Override
    @NotNull
    public OutputStream outputStream() {
        return new c(this);
    }

    @NotNull
    public final e p() {
        e e4 = new e();
        if (this.size() != 0L) {
            g0 g02;
            g0 g03 = this.c;
            y.g((Object)g03);
            e4.c = g02 = g03.d();
            g02.g = g02;
            g02.f = g02;
            g0 g04 = g03.f;
            while (g04 != g03) {
                g0 g05 = g02.g;
                y.g((Object)g05);
                y.g((Object)g04);
                g05.c(g04.d());
                g04 = g04.f;
            }
            e4.L(this.size());
        }
        return e4;
    }

    @Override
    @NotNull
    public g peek() {
        return x.d((l0)new d0(this));
    }

    @NotNull
    public final e q(@NotNull e e4, long l4, long l5) {
        y.j((Object)e4, (String)"out");
        okio.b.b((long)this.size(), (long)l4, (long)l5);
        if (l5 != 0L) {
            long l6;
            g0 g02;
            int n4;
            e4.L(e4.size() + l5);
            g0 g03 = this.c;
            while (true) {
                y.g((Object)g03);
                n4 = g03.c;
                int n5 = g03.b;
                g02 = g03;
                l6 = l4;
                if (l4 < (long)(n4 - n5)) break;
                l4 -= (long)(n4 - n5);
                g03 = g03.f;
            }
            for (long i4 = l5; i4 > 0L; i4 -= (long)(g03.c - g03.b)) {
                y.g((Object)g02);
                g03 = g02.d();
                g03.b = n4 = g03.b + (int)l6;
                g03.c = Math.min(n4 + (int)i4, g03.c);
                g0 g04 = e4.c;
                if (g04 == null) {
                    g03.g = g03;
                    g03.f = g03;
                    e4.c = g03;
                } else {
                    y.g((Object)g04);
                    g04 = g04.g;
                    y.g((Object)g04);
                    g04.c(g03);
                }
                g02 = g02.f;
                l6 = 0L;
            }
        }
        return this;
    }

    @NotNull
    public e r() {
        return this;
    }

    @Override
    public int read(@NotNull ByteBuffer byteBuffer) throws IOException {
        int n4;
        y.j((Object)byteBuffer, (String)"sink");
        g0 g02 = this.c;
        if (g02 == null) {
            return -1;
        }
        int n5 = Math.min(byteBuffer.remaining(), g02.c - g02.b);
        byteBuffer.put(g02.a, g02.b, n5);
        g02.b = n4 = g02.b + n5;
        this.d -= (long)n5;
        if (n4 == g02.c) {
            this.c = g02.b();
            h0.b((g0)g02);
        }
        return n5;
    }

    public int read(@NotNull byte[] byArray, int n4, int n5) {
        y.j((Object)byArray, (String)"sink");
        okio.b.b((long)byArray.length, (long)n4, (long)n5);
        g0 g02 = this.c;
        if (g02 == null) {
            n4 = -1;
        } else {
            n5 = Math.min(n5, g02.c - g02.b);
            byte[] byArray2 = g02.a;
            int n6 = g02.b;
            l.h(byArray2, byArray, n4, n6, n6 + n5);
            g02.b += n5;
            this.L(this.size() - (long)n5);
            if (g02.b == g02.c) {
                this.c = g02.b();
                h0.b((g0)g02);
            }
            n4 = n5;
        }
        return n4;
    }

    public long read(@NotNull e object, long l4) {
        y.j((Object)object, (String)"sink");
        if (l4 >= 0L) {
            long l5;
            if (this.size() == 0L) {
                l5 = -1L;
            } else {
                l5 = l4;
                if (l4 > this.size()) {
                    l5 = this.size();
                }
                ((e)object).write(this, l5);
            }
            return l5;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("byteCount < 0: ");
        ((StringBuilder)object).append(l4);
        throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
    }

    @Override
    public byte readByte() throws EOFException {
        if (this.size() != 0L) {
            g0 g02 = this.c;
            y.g((Object)g02);
            int n4 = g02.b;
            int n5 = g02.c;
            byte[] byArray = g02.a;
            int n6 = n4 + 1;
            byte by = byArray[n4];
            this.L(this.size() - 1L);
            if (n6 == n5) {
                this.c = g02.b();
                h0.b((g0)g02);
            } else {
                g02.b = n6;
            }
            return by;
        }
        throw new EOFException();
    }

    @Override
    @NotNull
    public byte[] readByteArray() {
        return this.readByteArray(this.size());
    }

    @Override
    @NotNull
    public byte[] readByteArray(long l4) throws EOFException {
        if (l4 >= 0L && l4 <= Integer.MAX_VALUE) {
            if (this.size() >= l4) {
                byte[] byArray = new byte[(int)l4];
                this.readFully(byArray);
                return byArray;
            }
            throw new EOFException();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("byteCount: ");
        stringBuilder.append(l4);
        throw new IllegalArgumentException(stringBuilder.toString().toString());
    }

    @Override
    @NotNull
    public h readByteString() {
        return this.readByteString(this.size());
    }

    @Override
    @NotNull
    public h readByteString(long l4) throws EOFException {
        if (l4 >= 0L && l4 <= Integer.MAX_VALUE) {
            if (this.size() >= l4) {
                h h4;
                if (l4 >= 4096L) {
                    h4 = this.S((int)l4);
                    this.skip(l4);
                } else {
                    h4 = new h(this.readByteArray(l4));
                }
                return h4;
            }
            throw new EOFException();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("byteCount: ");
        stringBuilder.append(l4);
        throw new IllegalArgumentException(stringBuilder.toString().toString());
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public long readDecimalLong() throws EOFException {
        Object object;
        Object object2;
        if (this.size() == 0L) throw new EOFException();
        int n4 = 0;
        boolean bl = false;
        long l4 = 0L;
        long l5 = -7L;
        int n5 = 0;
        while (true) {
            int n6;
            int n7;
            int n8;
            block9: {
                object2 = this.c;
                y.g((Object)object2);
                object = ((g0)object2).a;
                n8 = ((g0)object2).b;
                n7 = ((g0)object2).c;
                while (true) {
                    block10: {
                        n6 = n5;
                        if (n8 >= n7) break block9;
                        byte by = object[n8];
                        if (by >= 48 && by <= 57) {
                            int n9 = 48 - by;
                            long l6 = l4 - -922337203685477580L;
                            n6 = l6 == 0L ? 0 : (l6 < 0L ? -1 : 1);
                            if (n6 >= 0 && (n6 != 0 || (long)n9 >= l5)) {
                                l4 = l4 * 10L + (long)n9;
                                break block10;
                            } else {
                                object2 = new e().Z(l4).Y(by);
                                if (!bl) {
                                    ((e)object2).readByte();
                                }
                                object = new StringBuilder();
                                ((StringBuilder)object).append("Number too large: ");
                                ((StringBuilder)object).append(((e)object2).readUtf8());
                                throw new NumberFormatException(((StringBuilder)object).toString());
                            }
                        }
                        if (by != 45 || n4 != 0) break;
                        --l5;
                        bl = true;
                    }
                    ++n8;
                    ++n4;
                }
                n6 = 1;
            }
            if (n8 == n7) {
                this.c = object2.b();
                h0.b((g0)object2);
            } else {
                ((g0)object2).b = n8;
            }
            if (n6 != 0 || this.c == null) break;
            n5 = n6;
        }
        this.L(this.size() - (long)n4);
        n5 = bl ? 2 : 1;
        if (n4 < n5) {
            if (this.size() == 0L) throw new EOFException();
            object = bl ? (Object)"Expected a digit" : (Object)"Expected a digit or '-'";
            object2 = new StringBuilder();
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(" but was 0x");
            ((StringBuilder)object2).append(okio.b.k((byte)this.w(0L)));
            throw new NumberFormatException(((StringBuilder)object2).toString());
        }
        if (!bl) return -l4;
        return l4;
    }

    @Override
    public void readFully(@NotNull byte[] byArray) throws EOFException {
        int n4;
        y.j((Object)byArray, (String)"sink");
        for (int i4 = 0; i4 < byArray.length; i4 += n4) {
            n4 = this.read(byArray, i4, byArray.length - i4);
            if (n4 != -1) {
                continue;
            }
            throw new EOFException();
        }
    }

    @Override
    public long readHexadecimalUnsignedLong() throws EOFException {
        if (this.size() != 0L) {
            int n4;
            long l4;
            int n5 = 0;
            boolean bl = false;
            long l5 = 0L;
            do {
                boolean bl2;
                int n6;
                int n7;
                Object object;
                block11: {
                    byte by;
                    block12: {
                        object = this.c;
                        y.g((Object)object);
                        Object object2 = ((g0)object).a;
                        n7 = ((g0)object).b;
                        n6 = ((g0)object).c;
                        l4 = l5;
                        n4 = n5;
                        while (true) {
                            bl2 = bl;
                            if (n7 >= n6) break block11;
                            by = object2[n7];
                            if (by >= 48 && by <= 57) {
                                n5 = by - 48;
                            } else if (by >= 97 && by <= 102) {
                                n5 = by - 87;
                            } else {
                                if (by < 65 || by > 70) break block12;
                                n5 = by - 55;
                            }
                            if ((0xF000000000000000L & l4) != 0L) break;
                            l4 = l4 << 4 | (long)n5;
                            ++n7;
                            ++n4;
                        }
                        object = new e().a0(l4).Y(by);
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("Number too large: ");
                        ((StringBuilder)object2).append(((e)object).readUtf8());
                        throw new NumberFormatException(((StringBuilder)object2).toString());
                    }
                    if (n4 != 0) {
                        bl2 = true;
                    } else {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Expected leading [0-9a-fA-F] character but was 0x");
                        ((StringBuilder)object).append(okio.b.k((byte)by));
                        throw new NumberFormatException(((StringBuilder)object).toString());
                    }
                }
                if (n7 == n6) {
                    this.c = object.b();
                    h0.b((g0)object);
                } else {
                    ((g0)object).b = n7;
                }
                if (bl2) break;
                n5 = n4;
                bl = bl2;
                l5 = l4;
            } while (this.c != null);
            this.L(this.size() - (long)n4);
            return l4;
        }
        throw new EOFException();
    }

    @Override
    public int readInt() throws EOFException {
        if (this.size() >= 4L) {
            int n4;
            g0 g02 = this.c;
            y.g((Object)g02);
            int n5 = g02.b;
            int n6 = g02.c;
            if ((long)(n6 - n5) < 4L) {
                n4 = (this.readByte() & 0xFF) << 24 | (this.readByte() & 0xFF) << 16 | (this.readByte() & 0xFF) << 8 | this.readByte() & 0xFF;
            } else {
                byte[] byArray = g02.a;
                byte by = byArray[n5];
                n4 = byArray[n5 + 1];
                byte by2 = byArray[n5 + 2];
                int n7 = n5 + 4;
                n5 = byArray[n5 + 3];
                this.L(this.size() - 4L);
                if (n7 == n6) {
                    this.c = g02.b();
                    h0.b((g0)g02);
                } else {
                    g02.b = n7;
                }
                n4 = n5 & 0xFF | ((n4 & 0xFF) << 16 | (by & 0xFF) << 24 | (by2 & 0xFF) << 8);
            }
            return n4;
        }
        throw new EOFException();
    }

    @Override
    public int readIntLe() throws EOFException {
        return okio.b.h((int)this.readInt());
    }

    @Override
    public long readLong() throws EOFException {
        if (this.size() >= 8L) {
            long l4;
            g0 g02 = this.c;
            y.g((Object)g02);
            int n4 = g02.b;
            int n5 = g02.c;
            if ((long)(n5 - n4) < 8L) {
                l4 = ((long)this.readInt() & 0xFFFFFFFFL) << 32 | 0xFFFFFFFFL & (long)this.readInt();
            } else {
                byte[] byArray = g02.a;
                long l5 = byArray[n4];
                long l6 = byArray[n4 + 1];
                l4 = byArray[n4 + 2];
                long l7 = byArray[n4 + 3];
                long l8 = byArray[n4 + 4];
                long l9 = byArray[n4 + 5];
                long l10 = byArray[n4 + 6];
                int n6 = n4 + 8;
                long l11 = byArray[n4 + 7];
                this.L(this.size() - 8L);
                if (n6 == n5) {
                    this.c = g02.b();
                    h0.b((g0)g02);
                } else {
                    g02.b = n6;
                }
                l4 = (l5 & 0xFFL) << 56 | (l6 & 0xFFL) << 48 | (l4 & 0xFFL) << 40 | (l7 & 0xFFL) << 32 | (l8 & 0xFFL) << 24 | (l9 & 0xFFL) << 16 | (l10 & 0xFFL) << 8 | l11 & 0xFFL;
            }
            return l4;
        }
        throw new EOFException();
    }

    @Override
    public long readLongLe() throws EOFException {
        return okio.b.i((long)this.readLong());
    }

    @Override
    public short readShort() throws EOFException {
        if (this.size() >= 2L) {
            short s3;
            g0 g02 = this.c;
            y.g((Object)g02);
            int n4 = g02.b;
            int n5 = g02.c;
            if (n5 - n4 < 2) {
                s3 = (short)((this.readByte() & 0xFF) << 8 | this.readByte() & 0xFF);
            } else {
                byte[] byArray = g02.a;
                byte by = byArray[n4];
                int n6 = n4 + 2;
                n4 = byArray[n4 + 1];
                this.L(this.size() - 2L);
                if (n6 == n5) {
                    this.c = g02.b();
                    h0.b((g0)g02);
                } else {
                    g02.b = n6;
                }
                s3 = (short)(n4 & 0xFF | (by & 0xFF) << 8);
            }
            return s3;
        }
        throw new EOFException();
    }

    @Override
    public short readShortLe() throws EOFException {
        return okio.b.j((short)this.readShort());
    }

    @NotNull
    public String readString(long l4, @NotNull Charset object) throws EOFException {
        y.j((Object)object, (String)"charset");
        long l5 = l4 - 0L;
        long l6 = l5 == 0L ? 0 : (l5 < 0L ? -1 : 1);
        if (l6 >= 0 && l4 <= Integer.MAX_VALUE) {
            if (this.d >= l4) {
                if (l6 == false) {
                    return "";
                }
                g0 g02 = this.c;
                y.g((Object)g02);
                int n4 = g02.b;
                if ((long)n4 + l4 > (long)g02.c) {
                    return new String(this.readByteArray(l4), (Charset)object);
                }
                byte[] byArray = g02.a;
                l6 = (int)l4;
                object = new String(byArray, n4, (int)l6, (Charset)object);
                l6 = g02.b + l6;
                g02.b = (int)l6;
                this.d -= l4;
                if (l6 == g02.c) {
                    this.c = g02.b();
                    h0.b((g0)g02);
                }
                return object;
            }
            throw new EOFException();
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("byteCount: ");
        ((StringBuilder)object).append(l4);
        throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
    }

    @Override
    @NotNull
    public String readString(@NotNull Charset charset) {
        y.j((Object)charset, (String)"charset");
        return this.readString(this.d, charset);
    }

    @NotNull
    public String readUtf8() {
        return this.readString(this.d, kotlin.text.d.b);
    }

    @Override
    @NotNull
    public String readUtf8(long l4) throws EOFException {
        return this.readString(l4, kotlin.text.d.b);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int readUtf8CodePoint() throws EOFException {
        int n4;
        block12: {
            int n5;
            int n6;
            int n7;
            int n8;
            byte by;
            block9: {
                block11: {
                    block10: {
                        block8: {
                            if (this.size() == 0L) throw new EOFException();
                            by = this.w(0L);
                            n8 = 1;
                            n4 = 65533;
                            if ((by & 0x80) != 0) break block8;
                            n7 = by & 0x7F;
                            n6 = 0;
                            n5 = 1;
                            break block9;
                        }
                        if ((by & 0xE0) != 192) break block10;
                        n7 = by & 0x1F;
                        n5 = 2;
                        n6 = 128;
                        break block9;
                    }
                    if ((by & 0xF0) != 224) break block11;
                    n7 = by & 0xF;
                    n5 = 3;
                    n6 = 2048;
                    break block9;
                }
                if ((by & 0xF8) != 240) break block12;
                n7 = by & 7;
                n5 = 4;
                n6 = 65536;
            }
            long l4 = this.size();
            long l5 = n5;
            if (l4 >= l5) {
                while (n8 < n5) {
                    l4 = n8;
                    byte by2 = this.w(l4);
                    if ((by2 & 0xC0) == 128) {
                        n7 = n7 << 6 | by2 & 0x3F;
                        ++n8;
                        continue;
                    }
                    this.skip(l4);
                    return n4;
                }
                this.skip(l5);
                if (n7 > 0x10FFFF) {
                    return n4;
                }
                if (55296 <= n7 && n7 < 57344) {
                    return n4;
                }
                if (n7 >= n6) return n7;
                return n4;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("size < ");
            stringBuilder.append(n5);
            stringBuilder.append(": ");
            stringBuilder.append(this.size());
            stringBuilder.append(" (to read code point prefixed 0x");
            stringBuilder.append(okio.b.k((byte)by));
            stringBuilder.append(')');
            throw new EOFException(stringBuilder.toString());
        }
        this.skip(1L);
        return n4;
    }

    @Override
    @NotNull
    public String readUtf8LineStrict() throws EOFException {
        return this.readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override
    @NotNull
    public String readUtf8LineStrict(long l4) throws EOFException {
        block4: {
            long l5;
            block7: {
                String string;
                block6: {
                    block5: {
                        if (l4 < 0L) break block4;
                        l5 = Long.MAX_VALUE;
                        if (l4 != Long.MAX_VALUE) {
                            l5 = l4 + 1L;
                        }
                        long l6 = this.indexOf((byte)10, 0L, l5);
                        if (l6 == -1L) break block5;
                        string = okio.internal.a.c((e)this, (long)l6);
                        break block6;
                    }
                    if (l5 >= this.size() || this.w(l5 - 1L) != 13 || this.w(l5) != 10) break block7;
                    string = okio.internal.a.c((e)this, (long)l5);
                }
                return string;
            }
            e e4 = new e();
            l5 = this.size();
            this.q(e4, 0L, Math.min((long)32, l5));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("\\n not found: limit=");
            stringBuilder.append(Math.min(this.size(), l4));
            stringBuilder.append(" content=");
            stringBuilder.append(e4.readByteString().l());
            stringBuilder.append('\u2026');
            throw new EOFException(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("limit < 0: ");
        stringBuilder.append(l4);
        throw new IllegalArgumentException(stringBuilder.toString().toString());
    }

    @Override
    public boolean request(long l4) {
        boolean bl = this.d >= l4;
        return bl;
    }

    @Override
    public void require(long l4) throws EOFException {
        if (this.d >= l4) {
            return;
        }
        throw new EOFException();
    }

    @NotNull
    public e s() {
        return this;
    }

    @JvmName(name="size")
    public final long size() {
        return this.d;
    }

    @Override
    public void skip(long l4) throws EOFException {
        while (l4 > 0L) {
            g0 g02 = this.c;
            if (g02 != null) {
                int n4 = (int)Math.min(l4, (long)(g02.c - g02.b));
                long l5 = this.size();
                long l6 = n4;
                this.L(l5 - l6);
                l6 = l4 - l6;
                g02.b = n4 = g02.b + n4;
                l4 = l6;
                if (n4 != g02.c) continue;
                this.c = g02.b();
                h0.b((g0)g02);
                l4 = l6;
                continue;
            }
            throw new EOFException();
        }
    }

    @NotNull
    public m0 timeout() {
        return m0.NONE;
    }

    @NotNull
    public String toString() {
        return this.M().toString();
    }

    @JvmName(name="getByte")
    public final byte w(long l4) {
        okio.b.b((long)this.size(), (long)l4, (long)1L);
        g0 g02 = this.c;
        if (g02 != null) {
            byte by;
            if (this.size() - l4 < l4) {
                long l5;
                for (l5 = this.size(); l5 > l4; l5 -= (long)(g02.c - g02.b)) {
                    g02 = g02.g;
                    y.g((Object)g02);
                }
                y.g((Object)g02);
                by = g02.a[(int)((long)g02.b + l4 - l5)];
            } else {
                long l6;
                long l7 = 0L;
                while ((l6 = (long)(g02.c - g02.b) + l7) <= l4) {
                    g02 = g02.f;
                    y.g((Object)g02);
                    l7 = l6;
                }
                y.g((Object)g02);
                by = g02.a[(int)((long)g02.b + l4 - l7)];
            }
            return by;
        }
        y.g(null);
        throw null;
    }

    @Override
    public int write(@NotNull ByteBuffer byteBuffer) throws IOException {
        int n4;
        y.j((Object)byteBuffer, (String)"source");
        int n5 = n4 = byteBuffer.remaining();
        while (n5 > 0) {
            g0 g02 = this.T(1);
            int n6 = Math.min(n5, 8192 - g02.c);
            byteBuffer.get(g02.a, g02.c, n6);
            n5 -= n6;
            g02.c += n6;
        }
        this.d += (long)n4;
        return n4;
    }

    public void write(@NotNull e e4, long l4) {
        y.j((Object)e4, (String)"source");
        if (e4 != this) {
            okio.b.b((long)e4.size(), (long)0L, (long)l4);
            while (l4 > 0L) {
                g0 g02;
                long l5;
                g0 g03 = e4.c;
                y.g((Object)g03);
                int n4 = g03.c;
                g03 = e4.c;
                y.g((Object)g03);
                if (l4 < (long)(n4 - g03.b)) {
                    g03 = this.c;
                    if (g03 != null) {
                        y.g((Object)g03);
                        g03 = g03.g;
                    } else {
                        g03 = null;
                    }
                    if (g03 != null && g03.e && (l5 = (long)g03.c) + l4 - (long)(n4 = g03.d ? 0 : g03.b) <= 8192L) {
                        g02 = e4.c;
                        y.g((Object)g02);
                        g02.g(g03, (int)l4);
                        e4.L(e4.size() - l4);
                        this.L(this.size() + l4);
                        break;
                    }
                    g03 = e4.c;
                    y.g((Object)g03);
                    e4.c = g03.e((int)l4);
                }
                g03 = e4.c;
                y.g((Object)g03);
                l5 = g03.c - g03.b;
                e4.c = g03.b();
                g02 = this.c;
                if (g02 == null) {
                    this.c = g03;
                    g03.g = g03;
                    g03.f = g03;
                } else {
                    y.g((Object)g02);
                    g02 = g02.g;
                    y.g((Object)g02);
                    g02.c(g03).a();
                }
                e4.L(e4.size() - l5);
                this.L(this.size() + l5);
                l4 -= l5;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    public long y(@NotNull h h4) {
        y.j((Object)h4, (String)"targetBytes");
        return this.z(h4, 0L);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public long z(@NotNull h var1_1, long var2_2) {
        block20: {
            block19: {
                block22: {
                    block21: {
                        y.j((Object)var1_1 /* !! */ , (String)"targetBytes");
                        var10_3 = 0L;
                        if (var2_2 < 0L) break block20;
                        var17_4 /* !! */  = this.c;
                        var14_5 = -1L;
                        if (var17_4 /* !! */  != null) break block21;
                        var2_2 = var14_5;
                        break block19;
                    }
                    var16_6 = var17_4 /* !! */ ;
                    if (this.size() - var2_2 < var2_2) {
                        var16_6 = var17_4 /* !! */ ;
                        for (var10_3 = this.size(); var10_3 > var2_2; var10_3 -= (long)(var16_6.c - var16_6.b)) {
                            var16_6 = var16_6.g;
                            y.g((Object)var16_6);
                        }
                        if (var1_1 /* !! */ .C() == 2) {
                            var7_7 = var1_1 /* !! */ .g(0);
                            var6_11 = var1_1 /* !! */ .g(1);
                            var12_15 = var2_2;
                            while (true) {
                                var2_2 = var14_5;
                                if (var10_3 >= this.size()) break block19;
                                var17_4 /* !! */  = (g0)var16_6.a;
                                var5_19 = (int)((long)var16_6.b + var12_15 - var10_3);
                                var8_20 = var16_6.c;
                                while (var5_19 < var8_20) {
                                    var9_24 = var17_4 /* !! */ [var5_19];
                                    var2_2 = var10_3;
                                    var1_1 /* !! */  = var16_6;
                                    var4_18 = var5_19++;
                                    if (var9_24 != var7_7) {
                                        if (var9_24 != var6_11) continue;
                                        var2_2 = var10_3;
                                        var1_1 /* !! */  = var16_6;
                                        var4_18 = var5_19;
                                    }
lbl37:
                                    // 5 sources

                                    while (true) {
                                        var5_19 = var1_1 /* !! */ .b;
lbl39:
                                        // 2 sources

                                        while (true) {
                                            var2_2 = (long)(var4_18 - var5_19) + var2_2;
                                            break block19;
                                            break;
                                        }
                                        break;
                                    }
                                }
                                var16_6 = var16_6.f;
                                y.g((Object)var16_6);
                                var12_15 = var10_3 += (long)(var16_6.c - var16_6.b);
                            }
                        }
                        var1_1 /* !! */  = (h)var1_1 /* !! */ .p();
                        var12_16 = var2_2;
                        while (true) {
                            var2_2 = var14_5;
                            if (var10_3 < this.size()) {
                                var17_4 /* !! */  = (g0)var16_6.a;
                                var6_12 = var16_6.c;
                                for (var4_18 = (int)((long)var16_6.b + var12_16 - var10_3); var4_18 < var6_12; ++var4_18) {
                                    var8_21 = var17_4 /* !! */ [var4_18];
                                    var7_8 = ((h)var1_1 /* !! */ ).length;
                                    for (var5_19 = 0; var5_19 < var7_8; ++var5_19) {
                                        if (var8_21 != var1_1 /* !! */ [var5_19]) continue;
                                        while (true) {
                                            var5_19 = var16_6.b;
                                            var2_2 = var10_3;
                                            ** continue;
                                            break;
                                        }
                                    }
                                }
                                var16_6 = var16_6.f;
                                y.g((Object)var16_6);
                                var12_16 = var10_3 += (long)(var16_6.c - var16_6.b);
                                continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    while ((var12_17 = (long)(var16_6.c - var16_6.b) + var10_3) <= var2_2) {
                        var16_6 = var16_6.f;
                        y.g((Object)var16_6);
                        var10_3 = var12_17;
                    }
                    if (var1_1 /* !! */ .C() != 2) break block22;
                    var6_13 = var1_1 /* !! */ .g(0);
                    var7_9 = var1_1 /* !! */ .g(1);
                    var12_17 = var2_2;
                    while (true) {
                        var2_2 = var14_5;
                        if (var10_3 >= this.size()) break block19;
                        var17_4 /* !! */  = (g0)var16_6.a;
                        var5_19 = (int)((long)var16_6.b + var12_17 - var10_3);
                        var8_22 = var16_6.c;
                        while (var5_19 < var8_22) {
                            var9_25 = var17_4 /* !! */ [var5_19];
                            var2_2 = var10_3;
                            var1_1 /* !! */  = var16_6;
                            var4_18 = var5_19++;
                            if (var9_25 == var6_13) ** GOTO lbl37
                            if (var9_25 != var7_9) continue;
                            var2_2 = var10_3;
                            var1_1 /* !! */  = var16_6;
                            var4_18 = var5_19;
                            ** continue;
                        }
                        var16_6 = var16_6.f;
                        y.g((Object)var16_6);
                        var12_17 = var10_3 += (long)(var16_6.c - var16_6.b);
                    }
                }
                var1_1 /* !! */  = (h)var1_1 /* !! */ .p();
                var12_17 = var2_2;
                while (true) {
                    var2_2 = var14_5;
                    if (var10_3 >= this.size()) break;
                    var17_4 /* !! */  = (g0)var16_6.a;
                    var6_14 = var16_6.c;
                    for (var4_18 = (int)((long)var16_6.b + var12_17 - var10_3); var4_18 < var6_14; ++var4_18) {
                        var8_23 = var17_4 /* !! */ [var4_18];
                        var7_10 = ((h)var1_1 /* !! */ ).length;
                        for (var5_19 = 0; var5_19 < var7_10; ++var5_19) {
                            if (var8_23 == var1_1 /* !! */ [var5_19]) ** continue;
                        }
                    }
                    var16_6 = var16_6.f;
                    y.g((Object)var16_6);
                    var12_17 = var10_3 += (long)(var16_6.c - var16_6.b);
                }
            }
            return var2_2;
        }
        var1_1 /* !! */  = new StringBuilder();
        var1_1 /* !! */ .append("fromIndex < 0: ");
        var1_1 /* !! */ .append(var2_2);
        throw new IllegalArgumentException(var1_1 /* !! */ .toString().toString());
    }
}


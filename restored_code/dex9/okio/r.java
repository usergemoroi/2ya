/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  okio.g0
 *  okio.l0
 *  okio.m0
 *  org.jetbrains.annotations.NotNull
 */
package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import okio.e;
import okio.f0;
import okio.g;
import okio.g0;
import okio.l0;
import okio.m0;
import okio.s;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010!\u001a\u00020\u0001\u00a2\u0006\u0004\b.\u0010/J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0004J'\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u001a\u0010\u0004R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b+\u0010,\u00a8\u00060"}, d2={"Lokio/r;", "Lokio/l0;", "Lkotlin/k0;", "d", "()V", "h", "Lokio/e;", "buffer", "", "offset", "byteCount", "i", "(Lokio/e;JJ)V", "", "name", "", "expected", "actual", "a", "(Ljava/lang/String;II)V", "sink", "read", "(Lokio/e;J)J", "Lokio/m0;", "timeout", "()Lokio/m0;", "close", "", "c", "B", "section", "Lokio/f0;", "Lokio/f0;", "source", "Ljava/util/zip/Inflater;", "e", "Ljava/util/zip/Inflater;", "inflater", "Lokio/s;", "f", "Lokio/s;", "inflaterSource", "Ljava/util/zip/CRC32;", "g", "Ljava/util/zip/CRC32;", "crc", "<init>", "(Lokio/l0;)V", "okio"}, k=1, mv={1, 9, 0})
@SourceDebugExtension(value={"SMAP\nGzipSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GzipSource.kt\nokio/GzipSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 4 GzipSource.kt\nokio/-GzipSourceExtensions\n+ 5 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,220:1\n1#2:221\n62#3:222\n62#3:224\n62#3:226\n62#3:227\n62#3:228\n62#3:230\n62#3:232\n202#4:223\n202#4:225\n202#4:229\n202#4:231\n89#5:233\n*S KotlinDebug\n*F\n+ 1 GzipSource.kt\nokio/GzipSource\n*L\n105#1:222\n107#1:224\n119#1:226\n120#1:227\n122#1:228\n133#1:230\n144#1:232\n106#1:223\n117#1:225\n130#1:229\n141#1:231\n187#1:233\n*E\n"})
public final class r
implements l0 {
    private byte c;
    @NotNull
    private final f0 d;
    @NotNull
    private final Inflater e;
    @NotNull
    private final s f;
    @NotNull
    private final CRC32 g;

    public r(@NotNull l0 l02) {
        Inflater inflater;
        y.j((Object)l02, (String)"source");
        l02 = new f0(l02);
        this.d = l02;
        this.e = inflater = new Inflater(true);
        this.f = new s((g)l02, inflater);
        this.g = new CRC32();
    }

    private final void a(String string, int n4, int n5) {
        if (n5 == n4) {
            return;
        }
        string = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{string, n5, n4}, 3));
        y.i((Object)string, (String)"format(this, *args)");
        throw new IOException(string);
    }

    private final void d() throws IOException {
        long l4;
        this.d.require(10L);
        byte by = this.d.d.w(3L);
        boolean bl = (by >> 1 & 1) == 1;
        if (bl) {
            this.i(this.d.d, 0L, 10L);
        }
        this.a("ID1ID2", 8075, this.d.readShort());
        this.d.skip(8L);
        if ((by >> 2 & 1) == 1) {
            this.d.require(2L);
            if (bl) {
                this.i(this.d.d, 0L, 2L);
            }
            l4 = this.d.d.readShortLe() & 0xFFFF;
            this.d.require(l4);
            if (bl) {
                this.i(this.d.d, 0L, l4);
            }
            this.d.skip(l4);
        }
        if ((by >> 3 & 1) == 1) {
            l4 = this.d.indexOf((byte)0);
            if (l4 != -1L) {
                if (bl) {
                    this.i(this.d.d, 0L, l4 + 1L);
                }
                this.d.skip(l4 + 1L);
            } else {
                throw new EOFException();
            }
        }
        if ((by >> 4 & 1) == 1) {
            l4 = this.d.indexOf((byte)0);
            if (l4 != -1L) {
                if (bl) {
                    this.i(this.d.d, 0L, l4 + 1L);
                }
                this.d.skip(l4 + 1L);
            } else {
                throw new EOFException();
            }
        }
        if (bl) {
            this.a("FHCRC", this.d.readShortLe(), (short)this.g.getValue());
            this.g.reset();
        }
    }

    private final void h() throws IOException {
        this.a("CRC", this.d.readIntLe(), (int)this.g.getValue());
        this.a("ISIZE", this.d.readIntLe(), (int)this.e.getBytesWritten());
    }

    private final void i(e e4, long l4, long l5) {
        long l6;
        e e5;
        int n4;
        int n5;
        e4 = e4.c;
        y.g((Object)e4);
        while (true) {
            n5 = ((g0)e4).c;
            n4 = ((g0)e4).b;
            e5 = e4;
            l6 = l4;
            if (l4 < (long)(n5 - n4)) break;
            l4 -= (long)(n5 - n4);
            e4 = ((g0)e4).f;
            y.g((Object)e4);
        }
        for (long i4 = l5; i4 > 0L; i4 -= (long)n5) {
            n4 = (int)((long)((g0)e5).b + l6);
            n5 = (int)Math.min((long)(((g0)e5).c - n4), i4);
            this.g.update(((g0)e5).a, n4, n5);
            e5 = ((g0)e5).f;
            y.g((Object)e5);
            l6 = 0L;
        }
    }

    public void close() throws IOException {
        this.f.close();
    }

    public long read(@NotNull e object, long l4) throws IOException {
        y.j((Object)object, (String)"sink");
        long l5 = l4 - 0L;
        long l6 = l5 == 0L ? 0 : (l5 < 0L ? -1 : 1);
        if (l6 >= 0) {
            if (l6 == false) {
                return 0L;
            }
            if (this.c == 0) {
                this.d();
                this.c = 1;
            }
            if (this.c == 1) {
                long l7 = ((e)object).size();
                if ((l4 = this.f.read((e)object, l4)) != -1L) {
                    this.i((e)object, l7, l4);
                    return l4;
                }
                this.c = (byte)2;
            }
            if (this.c == 2) {
                this.h();
                this.c = (byte)3;
                if (!this.d.exhausted()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("byteCount < 0: ");
        ((StringBuilder)object).append(l4);
        throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
    }

    @NotNull
    public m0 timeout() {
        return this.d.timeout();
    }
}


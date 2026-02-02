/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  okio.g0
 *  okio.j0
 *  okio.m0
 *  org.jetbrains.annotations.NotNull
 */
package okio;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import okio.e;
import okio.e0;
import okio.g0;
import okio.i;
import okio.j0;
import okio.m0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0001\u00a2\u0006\u0004\b&\u0010'J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u00168G\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b#\u0010$\u00a8\u0006("}, d2={"Lokio/q;", "Lokio/j0;", "Lkotlin/k0;", "d", "()V", "Lokio/e;", "buffer", "", "byteCount", "a", "(Lokio/e;J)V", "source", "write", "flush", "Lokio/m0;", "timeout", "()Lokio/m0;", "close", "Lokio/e0;", "c", "Lokio/e0;", "sink", "Ljava/util/zip/Deflater;", "Ljava/util/zip/Deflater;", "deflater", "()Ljava/util/zip/Deflater;", "Lokio/i;", "e", "Lokio/i;", "deflaterSink", "", "f", "Z", "closed", "Ljava/util/zip/CRC32;", "g", "Ljava/util/zip/CRC32;", "crc", "<init>", "(Lokio/j0;)V", "okio"}, k=1, mv={1, 9, 0})
@SourceDebugExtension(value={"SMAP\nGzipSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GzipSink.kt\nokio/GzipSink\n+ 2 RealBufferedSink.kt\nokio/RealBufferedSink\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,153:1\n51#2:154\n1#3:155\n86#4:156\n*S KotlinDebug\n*F\n+ 1 GzipSink.kt\nokio/GzipSink\n*L\n63#1:154\n131#1:156\n*E\n"})
public final class q
implements j0 {
    @NotNull
    private final e0 c;
    @NotNull
    private final Deflater d;
    @NotNull
    private final i e;
    private boolean f;
    @NotNull
    private final CRC32 g;

    public q(@NotNull j0 object) {
        e0 e02;
        y.j((Object)object, (String)"sink");
        this.c = e02 = new e0((j0)object);
        object = new Deflater(-1, true);
        this.d = object;
        this.e = new i(e02, (Deflater)object);
        this.g = new CRC32();
        object = e02.d;
        ((e)object).e0(8075);
        ((e)object).Y(8);
        ((e)object).Y(0);
        ((e)object).b0(0);
        ((e)object).Y(0);
        ((e)object).Y(0);
    }

    private final void a(e e4, long l4) {
        e4 = e4.c;
        y.g((Object)e4);
        while (l4 > 0L) {
            int n4 = (int)Math.min(l4, (long)(((g0)e4).c - ((g0)e4).b));
            this.g.update(((g0)e4).a, ((g0)e4).b, n4);
            l4 -= (long)n4;
            e4 = ((g0)e4).f;
            y.g((Object)e4);
        }
    }

    private final void d() {
        this.c.a((int)this.g.getValue());
        this.c.a((int)this.d.getBytesRead());
    }

    public void close() throws IOException {
        Throwable throwable;
        block9: {
            Throwable throwable2;
            block8: {
                if (this.f) {
                    return;
                }
                try {
                    this.e.d();
                    this.d();
                    throwable = null;
                }
                catch (Throwable throwable3) {
                    // empty catch block
                }
                try {
                    this.d.end();
                    throwable2 = throwable;
                }
                catch (Throwable throwable4) {
                    throwable2 = throwable;
                    if (throwable != null) break block8;
                    throwable2 = throwable4;
                }
            }
            try {
                this.c.close();
                throwable = throwable2;
            }
            catch (Throwable throwable5) {
                throwable = throwable2;
                if (throwable2 != null) break block9;
                throwable = throwable5;
            }
        }
        this.f = true;
        if (throwable == null) {
            return;
        }
        throw throwable;
    }

    public void flush() throws IOException {
        this.e.flush();
    }

    @NotNull
    public m0 timeout() {
        return this.c.timeout();
    }

    public void write(@NotNull e object, long l4) throws IOException {
        y.j((Object)object, (String)"source");
        long l5 = l4 - 0L;
        long l6 = l5 == 0L ? 0 : (l5 < 0L ? -1 : 1);
        if (l6 >= 0) {
            if (l6 == false) {
                return;
            }
            this.a((e)object, l4);
            this.e.write((e)object, l4);
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("byteCount < 0: ");
        ((StringBuilder)object).append(l4);
        throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  okio.b
 *  okio.g0
 *  okio.h0
 *  okio.j0
 *  okio.m0
 *  okio.x
 *  org.jetbrains.annotations.NotNull
 */
package okio;

import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import okio.b;
import okio.e;
import okio.f;
import okio.g0;
import okio.h0;
import okio.j0;
import okio.m0;
import okio.x;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u00a2\u0006\u0004\b!\u0010\"B\u0019\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0001\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u00a2\u0006\u0004\b!\u0010#J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000f\u0010\u001cR\u0016\u0010 \u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u00a8\u0006$"}, d2={"Lokio/i;", "Lokio/j0;", "", "syncFlush", "Lkotlin/k0;", "a", "(Z)V", "Lokio/e;", "source", "", "byteCount", "write", "(Lokio/e;J)V", "flush", "()V", "d", "close", "Lokio/m0;", "timeout", "()Lokio/m0;", "", "toString", "()Ljava/lang/String;", "Lokio/f;", "c", "Lokio/f;", "sink", "Ljava/util/zip/Deflater;", "Ljava/util/zip/Deflater;", "deflater", "e", "Z", "closed", "<init>", "(Lokio/f;Ljava/util/zip/Deflater;)V", "(Lokio/j0;Ljava/util/zip/Deflater;)V", "okio"}, k=1, mv={1, 9, 0})
@SourceDebugExtension(value={"SMAP\nDeflaterSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeflaterSink.kt\nokio/DeflaterSink\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,163:1\n86#2:164\n*S KotlinDebug\n*F\n+ 1 DeflaterSink.kt\nokio/DeflaterSink\n*L\n58#1:164\n*E\n"})
public final class i
implements j0 {
    @NotNull
    private final f c;
    @NotNull
    private final Deflater d;
    private boolean e;

    public i(@NotNull f f4, @NotNull Deflater deflater) {
        y.j((Object)f4, (String)"sink");
        y.j((Object)deflater, (String)"deflater");
        this.c = f4;
        this.d = deflater;
    }

    public i(@NotNull j0 j02, @NotNull Deflater deflater) {
        y.j((Object)j02, (String)"sink");
        y.j((Object)deflater, (String)"deflater");
        this(x.c((j0)j02), deflater);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void a(boolean bl) {
        g0 g02;
        e e4 = this.c.getBuffer();
        while (true) {
            int n4;
            Object object;
            Object object2;
            g02 = e4.T(1);
            if (bl) {
                try {
                    object2 = this.d;
                    object = g02.a;
                    n4 = g02.c;
                    n4 = ((Deflater)object2).deflate((byte[])object, n4, 8192 - n4, 2);
                }
                catch (NullPointerException nullPointerException) {
                    throw new IOException("Deflater already closed", nullPointerException);
                }
            } else {
                object = this.d;
                object2 = g02.a;
                n4 = g02.c;
                n4 = ((Deflater)object).deflate((byte[])object2, n4, 8192 - n4);
            }
            if (n4 > 0) {
                g02.c += n4;
                e4.L(e4.size() + (long)n4);
                this.c.emitCompleteSegments();
                continue;
            }
            if (this.d.needsInput()) break;
        }
        if (g02.b != g02.c) return;
        e4.c = g02.b();
        h0.b((g0)g02);
    }

    public void close() throws IOException {
        Throwable throwable;
        block9: {
            Throwable throwable2;
            block8: {
                if (this.e) {
                    return;
                }
                try {
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
        this.e = true;
        if (throwable == null) {
            return;
        }
        throw throwable;
    }

    public final void d() {
        this.d.finish();
        this.a(false);
    }

    public void flush() throws IOException {
        this.a(true);
        this.c.flush();
    }

    @NotNull
    public m0 timeout() {
        return this.c.timeout();
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DeflaterSink(");
        stringBuilder.append(this.c);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public void write(@NotNull e e4, long l4) throws IOException {
        y.j((Object)e4, (String)"source");
        b.b((long)e4.size(), (long)0L, (long)l4);
        while (l4 > 0L) {
            g0 g02 = e4.c;
            y.g((Object)g02);
            int n4 = (int)Math.min(l4, (long)(g02.c - g02.b));
            this.d.setInput(g02.a, g02.b, n4);
            this.a(false);
            long l5 = e4.size();
            long l6 = n4;
            e4.L(l5 - l6);
            g02.b = n4 = g02.b + n4;
            if (n4 == g02.c) {
                e4.c = g02.b();
                h0.b((g0)g02);
            }
            l4 -= l6;
        }
    }
}


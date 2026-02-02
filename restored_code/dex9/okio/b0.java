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
 *  org.jetbrains.annotations.NotNull
 */
package okio;

import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import okio.b;
import okio.e;
import okio.g0;
import okio.h0;
import okio.j0;
import okio.m0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u00a8\u0006\u001a"}, d2={"Lokio/b0;", "Lokio/j0;", "Lokio/e;", "source", "", "byteCount", "Lkotlin/k0;", "write", "(Lokio/e;J)V", "flush", "()V", "close", "Lokio/m0;", "timeout", "()Lokio/m0;", "", "toString", "()Ljava/lang/String;", "Ljava/io/OutputStream;", "c", "Ljava/io/OutputStream;", "out", "d", "Lokio/m0;", "<init>", "(Ljava/io/OutputStream;Lokio/m0;)V", "okio"}, k=1, mv={1, 9, 0})
@SourceDebugExtension(value={"SMAP\nJvmOkio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmOkio.kt\nokio/OutputStreamSink\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,239:1\n86#2:240\n*S KotlinDebug\n*F\n+ 1 JvmOkio.kt\nokio/OutputStreamSink\n*L\n55#1:240\n*E\n"})
final class b0
implements j0 {
    @NotNull
    private final OutputStream c;
    @NotNull
    private final m0 d;

    public b0(@NotNull OutputStream outputStream, @NotNull m0 m02) {
        y.j((Object)outputStream, (String)"out");
        y.j((Object)m02, (String)"timeout");
        this.c = outputStream;
        this.d = m02;
    }

    public void close() {
        this.c.close();
    }

    public void flush() {
        this.c.flush();
    }

    @NotNull
    public m0 timeout() {
        return this.d;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("sink(");
        stringBuilder.append(this.c);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public void write(@NotNull e e4, long l4) {
        y.j((Object)e4, (String)"source");
        b.b((long)e4.size(), (long)0L, (long)l4);
        while (l4 > 0L) {
            this.d.throwIfReached();
            g0 g02 = e4.c;
            y.g((Object)g02);
            int n4 = (int)Math.min(l4, (long)(g02.c - g02.b));
            this.c.write(g02.a, g02.b, n4);
            g02.b += n4;
            long l5 = n4;
            long l6 = l4 - l5;
            e4.L(e4.size() - l5);
            l4 = l6;
            if (g02.b != g02.c) continue;
            e4.c = g02.b();
            h0.b((g0)g02);
            l4 = l6;
        }
    }
}


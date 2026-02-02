/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  okio.g0
 *  okio.h0
 *  okio.l0
 *  okio.m0
 *  okio.x
 *  org.jetbrains.annotations.NotNull
 */
package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import okio.e;
import okio.g;
import okio.g0;
import okio.h0;
import okio.l0;
import okio.m0;
import okio.x;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u00a2\u0006\u0004\b!\u0010\"B\u0019\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0001\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u00a2\u0006\u0004\b!\u0010#J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b\u000b\u0010\nJ\r\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\r\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u00a8\u0006$"}, d2={"Lokio/s;", "Lokio/l0;", "Lkotlin/k0;", "h", "()V", "Lokio/e;", "sink", "", "byteCount", "read", "(Lokio/e;J)J", "a", "", "d", "()Z", "Lokio/m0;", "timeout", "()Lokio/m0;", "close", "Lokio/g;", "c", "Lokio/g;", "source", "Ljava/util/zip/Inflater;", "Ljava/util/zip/Inflater;", "inflater", "", "e", "I", "bufferBytesHeldByInflater", "f", "Z", "closed", "<init>", "(Lokio/g;Ljava/util/zip/Inflater;)V", "(Lokio/l0;Ljava/util/zip/Inflater;)V", "okio"}, k=1, mv={1, 9, 0})
@SourceDebugExtension(value={"SMAP\nInflaterSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InflaterSource.kt\nokio/InflaterSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,147:1\n1#2:148\n86#3:149\n*S KotlinDebug\n*F\n+ 1 InflaterSource.kt\nokio/InflaterSource\n*L\n73#1:149\n*E\n"})
public final class s
implements l0 {
    @NotNull
    private final g c;
    @NotNull
    private final Inflater d;
    private int e;
    private boolean f;

    public s(@NotNull g g4, @NotNull Inflater inflater) {
        y.j((Object)g4, (String)"source");
        y.j((Object)inflater, (String)"inflater");
        this.c = g4;
        this.d = inflater;
    }

    public s(@NotNull l0 l02, @NotNull Inflater inflater) {
        y.j((Object)l02, (String)"source");
        y.j((Object)inflater, (String)"inflater");
        this(x.d((l0)l02), inflater);
    }

    private final void h() {
        int n4 = this.e;
        if (n4 == 0) {
            return;
        }
        this.e -= (n4 -= this.d.getRemaining());
        this.c.skip(n4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long a(@NotNull e object, long l4) throws IOException {
        g0 g02;
        y.j((Object)object, (String)"sink");
        long l5 = l4 - 0L;
        long l6 = l5 == 0L ? 0 : (l5 < 0L ? -1 : 1);
        if (l6 < 0) {
            object = new StringBuilder();
            ((StringBuilder)object).append("byteCount < 0: ");
            ((StringBuilder)object).append(l4);
            throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
        }
        if (!(this.f ^ true)) throw new IllegalStateException("closed".toString());
        if (l6 == false) {
            return 0L;
        }
        try {
            g02 = ((e)object).T(1);
            l6 = (int)Math.min(l4, (long)(8192 - g02.c));
            this.d();
            l6 = this.d.inflate(g02.a, g02.c, (int)l6);
            this.h();
            if (l6 > 0) {
                g02.c += l6;
                l4 = ((e)object).size();
                long l7 = l6;
                ((e)object).L(l4 + l7);
                return l7;
            }
        }
        catch (DataFormatException dataFormatException) {
            throw new IOException(dataFormatException);
        }
        if (g02.b != g02.c) return 0L;
        ((e)object).c = g02.b();
        h0.b((g0)g02);
        return 0L;
    }

    public void close() throws IOException {
        if (this.f) {
            return;
        }
        this.d.end();
        this.f = true;
        this.c.close();
    }

    public final boolean d() throws IOException {
        if (!this.d.needsInput()) {
            return false;
        }
        if (this.c.exhausted()) {
            return true;
        }
        g0 g02 = this.c.getBuffer().c;
        y.g((Object)g02);
        int n4 = g02.c;
        int n5 = g02.b;
        this.e = n4 -= n5;
        this.d.setInput(g02.a, n5, n4);
        return false;
    }

    public long read(@NotNull e e4, long l4) throws IOException {
        block2: {
            y.j((Object)e4, (String)"sink");
            do {
                long l5;
                if ((l5 = this.a(e4, l4)) > 0L) {
                    return l5;
                }
                if (this.d.finished() || this.d.needsDictionary()) break block2;
            } while (!this.c.exhausted());
            throw new EOFException("source exhausted prematurely");
        }
        return -1L;
    }

    @NotNull
    public m0 timeout() {
        return this.c.timeout();
    }
}


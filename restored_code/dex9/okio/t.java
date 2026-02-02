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

import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import okio.e;
import okio.g0;
import okio.h0;
import okio.l0;
import okio.m0;
import okio.x;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0012\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\f\u001a\u00020\u000b\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0019"}, d2={"Lokio/t;", "Lokio/l0;", "Lokio/e;", "sink", "", "byteCount", "read", "(Lokio/e;J)J", "Lkotlin/k0;", "close", "()V", "Lokio/m0;", "timeout", "()Lokio/m0;", "", "toString", "()Ljava/lang/String;", "Ljava/io/InputStream;", "c", "Ljava/io/InputStream;", "input", "d", "Lokio/m0;", "<init>", "(Ljava/io/InputStream;Lokio/m0;)V", "okio"}, k=1, mv={1, 9, 0})
@SourceDebugExtension(value={"SMAP\nJvmOkio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmOkio.kt\nokio/InputStreamSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,239:1\n1#2:240\n86#3:241\n*S KotlinDebug\n*F\n+ 1 JvmOkio.kt\nokio/InputStreamSource\n*L\n92#1:241\n*E\n"})
class t
implements l0 {
    @NotNull
    private final InputStream c;
    @NotNull
    private final m0 d;

    public t(@NotNull InputStream inputStream, @NotNull m0 m02) {
        y.j((Object)inputStream, (String)"input");
        y.j((Object)m02, (String)"timeout");
        this.c = inputStream;
        this.d = m02;
    }

    public void close() {
        this.c.close();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long read(@NotNull e object, long l4) {
        AssertionError assertionError2;
        block5: {
            y.j((Object)object, (String)"sink");
            long l5 = l4 - 0L;
            long l6 = l5 == 0L ? 0 : (l5 < 0L ? -1 : 1);
            if (l6 == false) {
                return 0L;
            }
            if (l6 < 0) {
                object = new StringBuilder();
                ((StringBuilder)object).append("byteCount < 0: ");
                ((StringBuilder)object).append(l4);
                throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
            }
            try {
                this.d.throwIfReached();
                g0 g02 = ((e)object).T(1);
                l6 = (int)Math.min(l4, (long)(8192 - g02.c));
                l6 = this.c.read(g02.a, g02.c, (int)l6);
                if (l6 == -1) {
                    if (g02.b != g02.c) return -1L;
                    ((e)object).c = g02.b();
                    h0.b((g0)g02);
                    return -1L;
                }
            }
            catch (AssertionError assertionError2) {
                break block5;
            }
            g02.c += l6;
            l4 = ((e)object).size();
            long l7 = l6;
            ((e)object).L(l4 + l7);
            return l7;
        }
        if (!x.e((AssertionError)assertionError2)) throw assertionError2;
        throw new IOException((Throwable)((Object)assertionError2));
    }

    @NotNull
    public m0 timeout() {
        return this.d;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("source(");
        stringBuilder.append(this.c);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}


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
 *  org.jetbrains.annotations.Nullable
 */
package okio;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import okio.e;
import okio.g;
import okio.g0;
import okio.l0;
import okio.m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\u0004\b$\u0010%J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b!\u0010\"\u00a8\u0006&"}, d2={"Lokio/d0;", "Lokio/l0;", "Lokio/e;", "sink", "", "byteCount", "read", "(Lokio/e;J)J", "Lokio/m0;", "timeout", "()Lokio/m0;", "Lkotlin/k0;", "close", "()V", "Lokio/g;", "c", "Lokio/g;", "upstream", "d", "Lokio/e;", "buffer", "Lokio/g0;", "e", "Lokio/g0;", "expectedSegment", "", "f", "I", "expectedPos", "", "g", "Z", "closed", "h", "J", "pos", "<init>", "(Lokio/g;)V", "okio"}, k=1, mv={1, 9, 0})
@SourceDebugExtension(value={"SMAP\nPeekSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PeekSource.kt\nokio/PeekSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
public final class d0
implements l0 {
    @NotNull
    private final g c;
    @NotNull
    private final e d;
    @Nullable
    private g0 e;
    private int f;
    private boolean g;
    private long h;

    public d0(@NotNull g g4) {
        y.j((Object)g4, (String)"upstream");
        this.c = g4;
        g4 = g4.getBuffer();
        this.d = g4;
        g4 = ((e)g4).c;
        this.e = g4;
        int n4 = g4 != null ? ((g0)g4).b : -1;
        this.f = n4;
    }

    public void close() {
        this.g = true;
    }

    public long read(@NotNull e object, long l4) {
        block6: {
            block7: {
                g0 g02;
                long l5;
                block8: {
                    block9: {
                        y.j((Object)object, (String)"sink");
                        long l6 = l4 - 0L;
                        l5 = l6 == 0L ? 0 : (l6 < 0L ? -1 : 1);
                        if (l5 < 0) break block6;
                        if (!(this.g ^ true)) break block7;
                        g02 = this.e;
                        if (g02 == null) break block8;
                        g0 g03 = this.d.c;
                        if (g02 != g03) break block9;
                        int n4 = this.f;
                        y.g((Object)g03);
                        if (n4 == g03.b) break block8;
                    }
                    throw new IllegalStateException("Peek source is invalid because upstream source was used".toString());
                }
                if (l5 == false) {
                    return 0L;
                }
                if (!this.c.request(this.h + 1L)) {
                    return -1L;
                }
                if (this.e == null && (g02 = this.d.c) != null) {
                    this.e = g02;
                    y.g((Object)g02);
                    this.f = g02.b;
                }
                l4 = Math.min(l4, this.d.size() - this.h);
                this.d.q((e)object, this.h, l4);
                this.h += l4;
                return l4;
            }
            throw new IllegalStateException("closed".toString());
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("byteCount < 0: ");
        ((StringBuilder)object).append(l4);
        throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
    }

    @NotNull
    public m0 timeout() {
        return this.c.timeout();
    }
}


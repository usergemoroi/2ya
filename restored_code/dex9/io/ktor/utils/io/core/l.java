/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.ktor.utils.io.bits.a
 *  io.ktor.utils.io.core.a
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.p
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 */
package io.ktor.utils.io.core;

import io.ktor.utils.io.bits.b;
import io.ktor.utils.io.core.internal.a;
import io.ktor.utils.io.pool.d;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0017"}, d2={"Lio/ktor/utils/io/core/l;", "Lio/ktor/utils/io/pool/d;", "Lio/ktor/utils/io/core/internal/a;", "w", "()Lio/ktor/utils/io/core/internal/a;", "instance", "Lkotlin/k0;", "s", "(Lio/ktor/utils/io/core/internal/a;)V", "y", "r", "(Lio/ktor/utils/io/core/internal/a;)Lio/ktor/utils/io/core/internal/a;", "", "j", "I", "bufferSize", "Lio/ktor/utils/io/bits/a;", "k", "Lio/ktor/utils/io/bits/a;", "allocator", "capacity", "<init>", "(IILio/ktor/utils/io/bits/a;)V", "ktor-io"}, k=1, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nBufferFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferFactory.kt\nio/ktor/utils/io/core/DefaultBufferPool\n+ 2 MemoryJvm.kt\nio/ktor/utils/io/bits/Memory\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n15#2:94\n15#2:95\n1#3:96\n*S KotlinDebug\n*F\n+ 1 BufferFactory.kt\nio/ktor/utils/io/core/DefaultBufferPool\n*L\n75#1:94\n76#1:95\n*E\n"})
public final class l
extends d<a> {
    private final int j;
    @NotNull
    private final io.ktor.utils.io.bits.a k;

    public l(int n4, int n5, @NotNull io.ktor.utils.io.bits.a a4) {
        y.j((Object)a4, (String)"allocator");
        super(n5);
        this.j = n4;
        this.k = a4;
    }

    public /* synthetic */ l(int n4, int n5, io.ktor.utils.io.bits.a a4, int n6, p p4) {
        if ((n6 & 1) != 0) {
            n4 = 4096;
        }
        if ((n6 & 2) != 0) {
            n5 = 1000;
        }
        if ((n6 & 4) != 0) {
            a4 = b.a;
        }
        this(n4, n5, a4);
    }

    @NotNull
    protected a r(@NotNull a a4) {
        y.j((Object)((Object)a4), (String)"instance");
        a4 = super.d(a4);
        a4.E();
        a4.q();
        return a4;
    }

    protected void s(@NotNull a a4) {
        y.j((Object)((Object)a4), (String)"instance");
        this.k.a(a4.g());
        super.e(a4);
        a4.D();
    }

    @NotNull
    protected a w() {
        return new a(this.k.b(this.j), null, this, null);
    }

    protected void y(@NotNull a a4) {
        y.j((Object)((Object)a4), (String)"instance");
        super.q(a4);
        if ((long)a4.g().limit() == (long)this.j) {
            if (a4 != a.j.a()) {
                if (a4 != io.ktor.utils.io.core.a.g.a()) {
                    if (a4.z() == 0) {
                        if (a4.x() == null) {
                            if (a4.y() == null) {
                                return;
                            }
                            throw new IllegalStateException("Recycled instance shouldn't be a view or another buffer.".toString());
                        }
                        throw new IllegalStateException("Recycled instance shouldn't be a part of a chain.".toString());
                    }
                    throw new IllegalStateException("Unable to clear buffer: it is still in use.".toString());
                }
                throw new IllegalStateException("Empty instance couldn't be recycled".toString());
            }
            throw new IllegalStateException("ChunkBuffer.Empty couldn't be recycled".toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Buffer size mismatch. Expected: ");
        stringBuilder.append(this.j);
        stringBuilder.append(", actual: ");
        stringBuilder.append((long)a4.g().limit());
        throw new IllegalStateException(stringBuilder.toString().toString());
    }
}


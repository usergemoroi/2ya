/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.concurrent.futures.a
 *  io.ktor.utils.io.bits.c
 *  io.ktor.utils.io.core.a
 *  io.ktor.utils.io.core.internal.a$d
 *  io.ktor.utils.io.pool.g
 *  io.ktor.utils.io.pool.g$a
 *  kotlin.Deprecated
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.p
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package io.ktor.utils.io.core.internal;

import io.ktor.utils.io.bits.b;
import io.ktor.utils.io.bits.c;
import io.ktor.utils.io.core.internal.a;
import io.ktor.utils.io.pool.f;
import io.ktor.utils.io.pool.g;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated(message="\n    We're migrating to the new kotlinx-io library.\n    This declaration is deprecated and will be removed in Ktor 4.0.0\n    If you have any problems with migration, please contact us in \n    https://youtrack.jetbrains.com/issue/KTOR-6030/Migrate-to-new-kotlinx.io-library\n    ")
@Metadata(d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 )2\u00020\u0001:\u0001*B,\u0012\u0006\u0010&\u001a\u00020%\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0000\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b'\u0010(J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u0004\u0018\u00010\u0000\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\bH\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0003H\u0000\u00a2\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0003H\u0000\u00a2\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0000\u00a2\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0012\u0010\rR\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\b8\u0000X\u0080\u0004\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R(\u0010\u001c\u001a\u0004\u0018\u00010\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u00008\u0006@BX\u0086\u000e\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007R(\u0010 \u001a\u0004\u0018\u00010\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u00008F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001e\u0010\u0007\"\u0004\b\u001f\u0010\u0005R\u0011\u0010$\u001a\u00020!8F\u00a2\u0006\u0006\u001a\u0004\b\"\u0010#\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006+"}, d2={"Lio/ktor/utils/io/core/internal/a;", "Lio/ktor/utils/io/core/a;", "chunk", "Lkotlin/k0;", "v", "(Lio/ktor/utils/io/core/internal/a;)V", "w", "()Lio/ktor/utils/io/core/internal/a;", "Lio/ktor/utils/io/pool/g;", "pool", "A", "(Lio/ktor/utils/io/pool/g;)V", "D", "()V", "E", "", "B", "()Z", "q", "h", "Lio/ktor/utils/io/pool/g;", "getParentPool$ktor_io", "()Lio/ktor/utils/io/pool/g;", "parentPool", "<set-?>", "i", "Lio/ktor/utils/io/core/internal/a;", "y", "origin", "newValue", "x", "C", "next", "", "z", "()I", "referenceCount", "Lio/ktor/utils/io/bits/c;", "memory", "<init>", "(Ljava/nio/ByteBuffer;Lio/ktor/utils/io/core/internal/a;Lio/ktor/utils/io/pool/g;Lkotlin/jvm/internal/p;)V", "j", "d", "ktor-io"}, k=1, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nChunkBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChunkBuffer.kt\nio/ktor/utils/io/core/internal/ChunkBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AtomicFU.common.kt\nkotlinx/atomicfu/AtomicFU_commonKt\n*L\n1#1,180:1\n1#2:181\n360#3,4:182\n360#3,4:186\n382#3,4:190\n*S KotlinDebug\n*F\n+ 1 ChunkBuffer.kt\nio/ktor/utils/io/core/internal/ChunkBuffer\n*L\n89#1:182,4\n99#1:186,4\n116#1:190,4\n*E\n"})
public class a
extends io.ktor.utils.io.core.a {
    @NotNull
    public static final d j;
    private static final AtomicReferenceFieldUpdater k;
    private static final AtomicIntegerFieldUpdater l;
    @NotNull
    private static final g<a> m;
    @NotNull
    private static final a n;
    @NotNull
    private static final g<a> o;
    @NotNull
    private static final g<a> p;
    @Nullable
    private final g<a> h;
    @Nullable
    private a i;
    @NotNull
    private volatile Object nextRef;
    @NotNull
    private volatile int refCount;

    static {
        g<a> g4;
        j = new /* Unavailable Anonymous Inner Class!! */;
        m = g4 = new g<a>(){

            public void close() {
                g.a.a((g)this);
            }

            @NotNull
            public a d() {
                return j.a();
            }

            public void dispose() {
            }

            public void e(@NotNull a a4) {
                y.j((Object)((Object)a4), (String)"instance");
                if (a4 == j.a()) {
                    return;
                }
                throw new IllegalArgumentException("Only ChunkBuffer.Empty instance could be recycled.".toString());
            }
        };
        n = new a(c.a.a(), null, (g)g4, null);
        o = new f<a>(){

            @NotNull
            public a d() {
                return new a(b.a.b(4096), null, this, null);
            }

            public void e(@NotNull a a4) {
                y.j((Object)((Object)a4), (String)"instance");
                b.a.a(a4.g());
            }
        };
        p = new f<a>(){

            @NotNull
            public a d() {
                throw new UnsupportedOperationException("This pool doesn't support borrow");
            }

            public void e(@NotNull a a4) {
                y.j((Object)((Object)a4), (String)"instance");
            }
        };
        k = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "nextRef");
        l = AtomicIntegerFieldUpdater.newUpdater(a.class, "refCount");
    }

    private a(ByteBuffer byteBuffer, a a4, g<a> g4) {
        y.j((Object)byteBuffer, (String)"memory");
        super(byteBuffer, null);
        this.h = g4;
        if (a4 != this) {
            this.nextRef = null;
            this.refCount = 1;
            this.i = a4;
            return;
        }
        throw new IllegalArgumentException("A chunk couldn't be a view of itself.".toString());
    }

    public /* synthetic */ a(ByteBuffer byteBuffer, a a4, g g4, p p4) {
        this(byteBuffer, a4, (g<a>)g4);
    }

    public static final /* synthetic */ a t() {
        return n;
    }

    public static final /* synthetic */ g u() {
        return m;
    }

    private final void v(a a4) {
        if (androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)k, (Object)((Object)this), null, (Object)((Object)a4))) {
            return;
        }
        throw new IllegalStateException("This chunk has already a next chunk.");
    }

    public void A(@NotNull g<a> g4) {
        y.j(g4, (String)"pool");
        if (this.B()) {
            g<a> g5 = this.i;
            if (g5 != null) {
                this.D();
                g5.A(g4);
            } else {
                g5 = this.h;
                if (g5 != null) {
                    g4 = g5;
                }
                g4.o((Object)this);
            }
        }
    }

    public final boolean B() {
        int n4;
        while ((n4 = this.refCount) > 0) {
            int n5 = n4 - 1;
            if (!l.compareAndSet(this, n4, n5)) continue;
            boolean bl = n5 == 0;
            return bl;
        }
        throw new IllegalStateException("Unable to release: it is already released.");
    }

    public final void C(@Nullable a a4) {
        if (a4 == null) {
            this.w();
        } else {
            this.v(a4);
        }
    }

    public final void D() {
        if (l.compareAndSet(this, 0, -1)) {
            this.w();
            this.i = null;
            return;
        }
        throw new IllegalStateException("Unable to unlink: buffer is in use.");
    }

    public final void E() {
        int n4;
        while ((n4 = this.refCount) >= 0) {
            if (n4 <= 0) {
                if (!l.compareAndSet(this, n4, 1)) continue;
                return;
            }
            throw new IllegalStateException("This instance is already in use but somehow appeared in the pool.");
        }
        throw new IllegalStateException("This instance is already disposed and couldn't be borrowed.");
    }

    public final void q() {
        if (this.i == null) {
            super.q();
            this.nextRef = null;
            return;
        }
        throw new IllegalArgumentException("Unable to reset buffer with origin".toString());
    }

    @Nullable
    public final a w() {
        return k.getAndSet(this, null);
    }

    @Nullable
    public final a x() {
        return (a)((Object)this.nextRef);
    }

    @Nullable
    public final a y() {
        return this.i;
    }

    public final int z() {
        return this.refCount;
    }
}


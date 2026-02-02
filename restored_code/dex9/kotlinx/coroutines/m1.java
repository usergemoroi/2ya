/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlinx.coroutines.internal.l
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.collections.k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.internal.l;
import kotlinx.coroutines.m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\b \u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b+\u0010\u001bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001f\u0010\tR\"\u0010$\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0018\u00010!8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00048TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b%\u0010\bR\u0011\u0010(\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\b'\u0010\nR\u0011\u0010*\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\b)\u0010\n\u00a8\u0006,"}, d2={"Lkotlinx/coroutines/m1;", "Lkotlinx/coroutines/m0;", "", "unconfined", "", "M", "(Z)J", "Y", "()J", "Z", "()Z", "a0", "Lkotlinx/coroutines/d1;", "task", "Lkotlin/k0;", "S", "(Lkotlinx/coroutines/d1;)V", "U", "(Z)V", "H", "", "parallelism", "", "name", "limitedParallelism", "(ILjava/lang/String;)Lkotlinx/coroutines/m0;", "shutdown", "()V", "c", "J", "useCount", "d", "shared", "Lkotlin/collections/k;", "e", "Lkotlin/collections/k;", "unconfinedQueue", "T", "nextTime", "W", "isUnconfinedLoopActive", "X", "isUnconfinedQueueEmpty", "<init>", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoop\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,547:1\n1#2:548\n*E\n"})
public abstract class m1
extends m0 {
    private long c;
    private boolean d;
    @Nullable
    private k<d1<?>> e;

    public static /* synthetic */ void L(m1 m12, boolean bl, int n4, Object object) {
        if (object == null) {
            if ((n4 & 1) != 0) {
                bl = false;
            }
            m12.H(bl);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
    }

    private final long M(boolean bl) {
        long l4 = bl ? 0x100000000L : 1L;
        return l4;
    }

    public static /* synthetic */ void V(m1 m12, boolean bl, int n4, Object object) {
        if (object == null) {
            if ((n4 & 1) != 0) {
                bl = false;
            }
            m12.U(bl);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    public final void H(boolean bl) {
        long l4;
        this.c = l4 = this.c - this.M(bl);
        if (l4 > 0L) {
            return;
        }
        if (this.d) {
            this.shutdown();
        }
    }

    public final void S(@NotNull d1<?> d12) {
        k<d1<?>> k4;
        k<d1<Object>> k5 = k4 = this.e;
        if (k4 == null) {
            k5 = new k();
            this.e = k5;
        }
        k5.addLast(d12);
    }

    protected long T() {
        k<d1<?>> k4 = this.e;
        long l4 = Long.MAX_VALUE;
        if (k4 == null) {
            return Long.MAX_VALUE;
        }
        if (!k4.isEmpty()) {
            l4 = 0L;
        }
        return l4;
    }

    public final void U(boolean bl) {
        this.c += this.M(bl);
        if (!bl) {
            this.d = true;
        }
    }

    public final boolean W() {
        long l4 = this.c;
        boolean bl = true;
        if (l4 < this.M(true)) {
            bl = false;
        }
        return bl;
    }

    public final boolean X() {
        k<d1<?>> k4 = this.e;
        boolean bl = k4 != null ? k4.isEmpty() : true;
        return bl;
    }

    public long Y() {
        if (!this.Z()) {
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    public final boolean Z() {
        Object object = this.e;
        if (object == null) {
            return false;
        }
        if ((object = ((k)object).o()) == null) {
            return false;
        }
        ((d1)((Object)object)).run();
        return true;
    }

    public boolean a0() {
        return false;
    }

    @Override
    @NotNull
    public final m0 limitedParallelism(int n4, @Nullable String string) {
        l.a((int)n4);
        return l.b((m0)this, (String)string);
    }

    public void shutdown() {
    }
}


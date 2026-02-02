/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.g
 *  kotlin.jvm.JvmField
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlinx.coroutines.internal.b
 *  kotlinx.coroutines.r2
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.b;
import kotlinx.coroutines.r2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B!\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\b\u0010\u001e\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\u001f\u001a\u00020\b\u00a2\u0006\u0004\b \u0010!J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\b\u0007\u0010\u0006J)\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH&\u00a2\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\b8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0006R\u000b\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a8\u0006\""}, d2={"Lkotlinx/coroutines/internal/a0;", "S", "Lkotlinx/coroutines/internal/b;", "Lkotlinx/coroutines/r2;", "", "u", "()Z", "p", "", "index", "", "cause", "Lkotlin/coroutines/g;", "context", "Lkotlin/k0;", "s", "(ILjava/lang/Throwable;Lkotlin/coroutines/g;)V", "t", "()V", "", "e", "J", "id", "r", "()I", "numberOfSlots", "k", "isRemoved", "Lkotlinx/atomicfu/AtomicInt;", "cleanedAndPointers", "prev", "pointers", "<init>", "(JLkotlinx/coroutines/internal/a0;I)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/Segment\n+ 2 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n*L\n1#1,265:1\n248#2,4:266\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/Segment\n*L\n221#1:266,4\n*E\n"})
public abstract class a0<S extends a0<S>>
extends b<S>
implements r2 {
    private static final AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(a0.class, "cleanedAndPointers$volatile");
    private volatile int cleanedAndPointers$volatile;
    @JvmField
    public final long e;

    public a0(long l4, @Nullable S s3, int n4) {
        super(s3);
        this.e = l4;
        this.cleanedAndPointers$volatile = n4 << 16;
    }

    public boolean k() {
        boolean bl = a0.f.get(this) == this.r() && !this.l();
        return bl;
    }

    public final boolean p() {
        boolean bl = a0.f.addAndGet(this, -65536) == this.r() && !this.l();
        return bl;
    }

    public abstract int r();

    public abstract void s(int var1, @Nullable Throwable var2, @NotNull g var3);

    public final void t() {
        if (a0.f.incrementAndGet(this) == this.r()) {
            this.n();
        }
    }

    public final boolean u() {
        boolean bl;
        block1: {
            int n4;
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = a0.f;
            do {
                if ((n4 = atomicIntegerFieldUpdater.get(this)) != this.r() || this.l()) continue;
                bl = false;
                break block1;
            } while (!atomicIntegerFieldUpdater.compareAndSet(this, n4, 65536 + n4));
            bl = true;
        }
        return bl;
    }
}


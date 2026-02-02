/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.g
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlinx.coroutines.sync.l
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.a0;
import kotlinx.coroutines.sync.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0019J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00118\u0006\u00a8\u0006\u001a"}, d2={"Lkotlinx/coroutines/sync/m;", "Lkotlinx/coroutines/internal/a0;", "", "index", "", "cause", "Lkotlin/coroutines/g;", "context", "Lkotlin/k0;", "s", "(ILjava/lang/Throwable;Lkotlin/coroutines/g;)V", "", "toString", "()Ljava/lang/String;", "r", "()I", "numberOfSlots", "Lkotlinx/atomicfu/AtomicArray;", "", "acquirers", "", "id", "prev", "pointers", "<init>", "(JLkotlinx/coroutines/sync/m;I)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nSemaphore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n1#1,396:1\n370#1,2:397\n*S KotlinDebug\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n383#1:397,2\n*E\n"})
final class m
extends a0<m> {
    private final AtomicReferenceArray g = new AtomicReferenceArray(l.h());

    public m(long l4, @Nullable m m4, int n4) {
        super(l4, m4, n4);
    }

    @Override
    public int r() {
        return l.h();
    }

    @Override
    public void s(int n4, @Nullable Throwable throwable, @NotNull g g4) {
        throwable = l.e();
        this.v().set(n4, throwable);
        this.t();
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SemaphoreSegment[id=");
        stringBuilder.append(this.e);
        stringBuilder.append(", hashCode=");
        stringBuilder.append(((Object)((Object)this)).hashCode());
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public final /* synthetic */ AtomicReferenceArray v() {
        return this.g;
    }
}


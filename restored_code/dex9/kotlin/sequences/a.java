/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  kotlin.sequences.i
 *  org.jetbrains.annotations.NotNull
 */
package kotlin.sequences;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import kotlin.sequences.i;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005R.\u0010\n\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \u0007*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00020\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\b\u0010\t\u00a8\u0006\u000e"}, d2={"Lkotlin/sequences/a;", "T", "Lkotlin/sequences/i;", "", "iterator", "()Ljava/util/Iterator;", "Ljava/util/concurrent/atomic/AtomicReference;", "kotlin.jvm.PlatformType", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "sequenceRef", "sequence", "<init>", "(Lkotlin/sequences/i;)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
public final class a<T>
implements i<T> {
    @NotNull
    private final AtomicReference<i<T>> a;

    public a(@NotNull i<? extends T> i4) {
        y.j(i4, (String)"sequence");
        this.a = new AtomicReference<i<? extends T>>(i4);
    }

    @NotNull
    public Iterator<T> iterator() {
        i i4 = this.a.getAndSet(null);
        if (i4 != null) {
            return i4.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}


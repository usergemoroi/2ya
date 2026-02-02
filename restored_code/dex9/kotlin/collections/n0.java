/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.collections.l0
 *  kotlin.jvm.internal.markers.a
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 */
package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.l0;
import kotlin.collections.t;
import kotlin.jvm.internal.markers.a;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u0004H\u0086\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\u0002\u00a2\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\r\u0010\u000e\u00a8\u0006\u0012"}, d2={"Lkotlin/collections/n0;", "T", "", "Lkotlin/collections/l0;", "", "hasNext", "()Z", "a", "()Lkotlin/collections/l0;", "c", "Ljava/util/Iterator;", "iterator", "", "d", "I", "index", "<init>", "(Ljava/util/Iterator;)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
public final class n0<T>
implements Iterator<l0<? extends T>>,
a {
    @NotNull
    private final Iterator<T> c;
    private int d;

    public n0(@NotNull Iterator<? extends T> iterator) {
        y.j(iterator, (String)"iterator");
        this.c = iterator;
    }

    @NotNull
    public final l0<T> a() {
        int n4 = this.d;
        this.d = n4 + 1;
        if (n4 < 0) {
            t.w();
        }
        return new l0(n4, this.c.next());
    }

    @Override
    public final boolean hasNext() {
        return this.c.hasNext();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}


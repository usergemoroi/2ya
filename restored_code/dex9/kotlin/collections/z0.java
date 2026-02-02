/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 */
package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.b0;
import kotlin.collections.c;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\t\b\u0012\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0096\u0002\u00a2\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016\u00a2\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\u000b\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0017"}, d2={"Lkotlin/collections/z0;", "T", "Lkotlin/collections/c;", "", "index", "get", "(I)Ljava/lang/Object;", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "", "c", "Ljava/util/List;", "delegate", "getSize", "()I", "size", "<init>", "(Ljava/util/List;)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
class z0<T>
extends c<T> {
    @NotNull
    private final List<T> c;

    public z0(@NotNull List<? extends T> list) {
        y.j(list, (String)"delegate");
        this.c = list;
    }

    @Override
    public T get(int n4) {
        return this.c.get(b0.V(this, n4));
    }

    @Override
    public int getSize() {
        return this.c.size();
    }

    @Override
    @NotNull
    public Iterator<T> iterator() {
        return this.listIterator(0);
    }

    @Override
    @NotNull
    public ListIterator<T> listIterator() {
        return this.listIterator(0);
    }

    @Override
    @NotNull
    public ListIterator<T> listIterator(int n4) {
        return new ListIterator<T>(this, n4){
            private final ListIterator<T> c;
            final z0<T> d;
            {
                this.d = z02;
                this.c = z02.c.listIterator(b0.X(z02, n4));
            }

            @Override
            public void add(T t3) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override
            public boolean hasNext() {
                return this.c.hasPrevious();
            }

            @Override
            public boolean hasPrevious() {
                return this.c.hasNext();
            }

            @Override
            public T next() {
                return this.c.previous();
            }

            @Override
            public int nextIndex() {
                return b0.W(this.d, this.c.previousIndex());
            }

            @Override
            public T previous() {
                return this.c.next();
            }

            @Override
            public int previousIndex() {
                return b0.W(this.d, this.c.nextIndex());
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override
            public void set(T t3) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }
}


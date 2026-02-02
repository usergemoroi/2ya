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
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.y;
import kotlin.sequences.i;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004BC\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00050\u000b\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005H\u0096\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\f\u0010\rR&\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00050\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000f\u0010\r\u00a8\u0006\u0012"}, d2={"Lkotlin/sequences/f;", "T", "R", "E", "Lkotlin/sequences/i;", "", "iterator", "()Ljava/util/Iterator;", "a", "Lkotlin/sequences/i;", "sequence", "Lkotlin/Function1;", "b", "Lkotlin/jvm/functions/l;", "transformer", "c", "<init>", "(Lkotlin/sequences/i;Lkotlin/jvm/functions/l;Lkotlin/jvm/functions/l;)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
public final class f<T, R, E>
implements i<E> {
    @NotNull
    private final i<T> a;
    @NotNull
    private final l<T, R> b;
    @NotNull
    private final l<R, Iterator<E>> c;

    public f(@NotNull i<? extends T> i4, @NotNull l<? super T, ? extends R> l4, @NotNull l<? super R, ? extends Iterator<? extends E>> l5) {
        y.j(i4, (String)"sequence");
        y.j(l4, (String)"transformer");
        y.j(l5, (String)"iterator");
        this.a = i4;
        this.b = l4;
        this.c = l5;
    }

    @NotNull
    public Iterator<E> iterator() {
        return new Iterator<E>(this){
            private final Iterator<T> c;
            private Iterator<? extends E> d;
            private int e;
            final f<T, R, E> f;
            {
                this.f = f4;
                this.c = f4.a.iterator();
            }

            private final boolean a() {
                Iterator iterator = this.d;
                if (iterator != null && iterator.hasNext()) {
                    this.e = 1;
                    return true;
                }
                while (this.c.hasNext()) {
                    iterator = this.c.next();
                    iterator = (Iterator)this.f.c.invoke(this.f.b.invoke(iterator));
                    if (!iterator.hasNext()) continue;
                    this.d = iterator;
                    this.e = 1;
                    return true;
                }
                this.e = 2;
                this.d = null;
                return false;
            }

            @Override
            public boolean hasNext() {
                int n4 = this.e;
                if (n4 == 1) {
                    return true;
                }
                if (n4 == 2) {
                    return false;
                }
                return this.a();
            }

            @Override
            public E next() {
                int n4 = this.e;
                if (n4 != 2) {
                    if (n4 == 0 && !this.a()) {
                        throw new NoSuchElementException();
                    }
                    this.e = 0;
                    Iterator iterator = this.d;
                    y.g(iterator);
                    return iterator.next();
                }
                throw new NoSuchElementException();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }
}


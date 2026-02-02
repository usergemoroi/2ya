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
import kotlin.Metadata;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.y;
import kotlin.sequences.f;
import kotlin.sequences.i;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B)\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J5\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0002\u0010\u00072\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00040\bH\u0000\u00a2\u0006\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0013"}, d2={"Lkotlin/sequences/u;", "T", "R", "Lkotlin/sequences/i;", "", "iterator", "()Ljava/util/Iterator;", "E", "Lkotlin/Function1;", "e", "(Lkotlin/jvm/functions/l;)Lkotlin/sequences/i;", "a", "Lkotlin/sequences/i;", "sequence", "b", "Lkotlin/jvm/functions/l;", "transformer", "<init>", "(Lkotlin/sequences/i;Lkotlin/jvm/functions/l;)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
public final class u<T, R>
implements i<R> {
    @NotNull
    private final i<T> a;
    @NotNull
    private final l<T, R> b;

    public u(@NotNull i<? extends T> i4, @NotNull l<? super T, ? extends R> l4) {
        y.j(i4, (String)"sequence");
        y.j(l4, (String)"transformer");
        this.a = i4;
        this.b = l4;
    }

    @NotNull
    public final <E> i<E> e(@NotNull l<? super R, ? extends Iterator<? extends E>> l4) {
        y.j(l4, (String)"iterator");
        return new f(this.a, this.b, l4);
    }

    @NotNull
    public Iterator<R> iterator() {
        return new Iterator<R>(this){
            private final Iterator<T> c;
            final u<T, R> d;
            {
                this.d = u3;
                this.c = u3.a.iterator();
            }

            @Override
            public boolean hasNext() {
                return this.c.hasNext();
            }

            @Override
            public R next() {
                return this.d.b.invoke(this.c.next());
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }
}


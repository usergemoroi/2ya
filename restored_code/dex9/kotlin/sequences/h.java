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
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.y;
import kotlin.sequences.i;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B=\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005H\u0096\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000b\u0010\tR&\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0013"}, d2={"Lkotlin/sequences/h;", "T1", "T2", "V", "Lkotlin/sequences/i;", "", "iterator", "()Ljava/util/Iterator;", "a", "Lkotlin/sequences/i;", "sequence1", "b", "sequence2", "Lkotlin/Function2;", "c", "Lkotlin/jvm/functions/p;", "transform", "<init>", "(Lkotlin/sequences/i;Lkotlin/sequences/i;Lkotlin/jvm/functions/p;)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
public final class h<T1, T2, V>
implements i<V> {
    @NotNull
    private final i<T1> a;
    @NotNull
    private final i<T2> b;
    @NotNull
    private final p<T1, T2, V> c;

    public h(@NotNull i<? extends T1> i4, @NotNull i<? extends T2> i5, @NotNull p<? super T1, ? super T2, ? extends V> p4) {
        y.j(i4, (String)"sequence1");
        y.j(i5, (String)"sequence2");
        y.j(p4, (String)"transform");
        this.a = i4;
        this.b = i5;
        this.c = p4;
    }

    @NotNull
    public Iterator<V> iterator() {
        return new Iterator<V>(this){
            private final Iterator<T1> c;
            private final Iterator<T2> d;
            final h<T1, T2, V> e;
            {
                this.e = h4;
                this.c = h4.a.iterator();
                this.d = h4.b.iterator();
            }

            @Override
            public boolean hasNext() {
                boolean bl = this.c.hasNext() && this.d.hasNext();
                return bl;
            }

            @Override
            public V next() {
                return this.e.c.invoke(this.c.next(), this.d.next());
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }
}


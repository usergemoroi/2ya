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

@Metadata(d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0006\u0010\u0007R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000b\u0010\f\u00a8\u0006\u0010"}, d2={"Lkotlin/sequences/t;", "T", "Lkotlin/sequences/i;", "", "iterator", "()Ljava/util/Iterator;", "a", "Lkotlin/sequences/i;", "sequence", "Lkotlin/Function1;", "", "b", "Lkotlin/jvm/functions/l;", "predicate", "<init>", "(Lkotlin/sequences/i;Lkotlin/jvm/functions/l;)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
public final class t<T>
implements i<T> {
    @NotNull
    private final i<T> a;
    @NotNull
    private final l<T, Boolean> b;

    public t(@NotNull i<? extends T> i4, @NotNull l<? super T, Boolean> l4) {
        y.j(i4, (String)"sequence");
        y.j(l4, (String)"predicate");
        this.a = i4;
        this.b = l4;
    }

    @NotNull
    public Iterator<T> iterator() {
        return new Iterator<T>(this){
            private final Iterator<T> c;
            private int d;
            private T e;
            final t<T> f;
            {
                this.f = t3;
                this.c = t3.a.iterator();
                this.d = -1;
            }

            private final void a() {
                if (this.c.hasNext()) {
                    Object t3 = this.c.next();
                    if (((Boolean)this.f.b.invoke(t3)).booleanValue()) {
                        this.d = 1;
                        this.e = t3;
                        return;
                    }
                }
                this.d = 0;
            }

            @Override
            public boolean hasNext() {
                if (this.d == -1) {
                    this.a();
                }
                int n4 = this.d;
                boolean bl = true;
                if (n4 != 1) {
                    bl = false;
                }
                return bl;
            }

            @Override
            public T next() {
                if (this.d == -1) {
                    this.a();
                }
                if (this.d != 0) {
                    Object t3 = this.e;
                    this.e = null;
                    this.d = -1;
                    return t3;
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


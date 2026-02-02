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
import kotlin.jvm.functions.a;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.y;
import kotlin.sequences.i;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B-\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000b\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0096\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\b\u0010\tR\"\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\f\u0010\r\u00a8\u0006\u0011"}, d2={"Lkotlin/sequences/g;", "", "T", "Lkotlin/sequences/i;", "", "iterator", "()Ljava/util/Iterator;", "Lkotlin/Function0;", "a", "Lkotlin/jvm/functions/a;", "getInitialValue", "Lkotlin/Function1;", "b", "Lkotlin/jvm/functions/l;", "getNextValue", "<init>", "(Lkotlin/jvm/functions/a;Lkotlin/jvm/functions/l;)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
final class g<T>
implements i<T> {
    @NotNull
    private final a<T> a;
    @NotNull
    private final l<T, T> b;

    public g(@NotNull a<? extends T> a4, @NotNull l<? super T, ? extends T> l4) {
        y.j(a4, (String)"getInitialValue");
        y.j(l4, (String)"getNextValue");
        this.a = a4;
        this.b = l4;
    }

    @NotNull
    public Iterator<T> iterator() {
        return new Iterator<T>(this){
            private T c;
            private int d;
            final g<T> e;
            {
                this.e = g4;
                this.d = -2;
            }

            private final void a() {
                l l4;
                if (this.d == -2) {
                    l4 = this.e.a.invoke();
                } else {
                    l4 = this.e.b;
                    Object t3 = this.c;
                    y.g(t3);
                    l4 = l4.invoke(t3);
                }
                this.c = l4;
                int n4 = l4 == null ? 0 : 1;
                this.d = n4;
            }

            @Override
            public boolean hasNext() {
                if (this.d < 0) {
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
                if (this.d < 0) {
                    this.a();
                }
                if (this.d != 0) {
                    Object t3 = this.c;
                    y.h(t3, (String)"null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
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


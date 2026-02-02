/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlin.sequences.i
 *  org.jetbrains.annotations.NotNull
 */
package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.sequences.c;
import kotlin.sequences.i;
import kotlin.sequences.r;
import kotlin.sequences.s;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\b\u0010\u0007J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0096\u0002\u00a2\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0006\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\b\u0010\u000e\u00a8\u0006\u0012"}, d2={"Lkotlin/sequences/b;", "T", "Lkotlin/sequences/i;", "Lkotlin/sequences/c;", "", "n", "a", "(I)Lkotlin/sequences/i;", "b", "", "iterator", "()Ljava/util/Iterator;", "Lkotlin/sequences/i;", "sequence", "I", "count", "<init>", "(Lkotlin/sequences/i;I)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
@SourceDebugExtension(value={"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/DropSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,698:1\n1#2:699\n*E\n"})
public final class b<T>
implements i<T>,
c<T> {
    @NotNull
    private final i<T> a;
    private final int b;

    public b(@NotNull i<? extends T> object, int n4) {
        y.j(object, (String)"sequence");
        this.a = object;
        this.b = n4;
        if (n4 >= 0) {
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("count must be non-negative, but was ");
        ((StringBuilder)object).append(n4);
        ((StringBuilder)object).append('.');
        throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
    }

    @Override
    @NotNull
    public i<T> a(int n4) {
        int n5 = this.b + n4;
        b<T> b4 = n5 < 0 ? new b<T>(this, n4) : new b<T>(this.a, n5);
        return b4;
    }

    @Override
    @NotNull
    public i<T> b(int n4) {
        int n5 = this.b;
        int n6 = n5 + n4;
        c c4 = n6 < 0 ? new s(this, n4) : new r<T>(this.a, n5, n6);
        return c4;
    }

    @NotNull
    public Iterator<T> iterator() {
        return new Iterator<T>(this){
            private final Iterator<T> c;
            private int d;
            {
                this.c = b4.a.iterator();
                this.d = b4.b;
            }

            private final void a() {
                while (this.d > 0 && this.c.hasNext()) {
                    this.c.next();
                    --this.d;
                }
            }

            @Override
            public boolean hasNext() {
                this.a();
                return this.c.hasNext();
            }

            @Override
            public T next() {
                this.a();
                return this.c.next();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }
}


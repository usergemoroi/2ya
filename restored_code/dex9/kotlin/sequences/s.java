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
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.sequences.c;
import kotlin.sequences.i;
import kotlin.sequences.l;
import kotlin.sequences.r;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\b\u0010\u0007J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0096\u0002\u00a2\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0006\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\b\u0010\u000e\u00a8\u0006\u0012"}, d2={"Lkotlin/sequences/s;", "T", "Lkotlin/sequences/i;", "Lkotlin/sequences/c;", "", "n", "a", "(I)Lkotlin/sequences/i;", "b", "", "iterator", "()Ljava/util/Iterator;", "Lkotlin/sequences/i;", "sequence", "I", "count", "<init>", "(Lkotlin/sequences/i;I)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
@SourceDebugExtension(value={"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/TakeSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,698:1\n1#2:699\n*E\n"})
public final class s<T>
implements i<T>,
c<T> {
    @NotNull
    private final i<T> a;
    private final int b;

    public s(@NotNull i<? extends T> object, int n4) {
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
        int n5 = this.b;
        r<T> r2 = n4 >= n5 ? l.e() : new r<T>(this.a, n4, n5);
        return r2;
    }

    @Override
    @NotNull
    public i<T> b(int n4) {
        s<T> s3 = n4 >= this.b ? this : new s<T>(this.a, n4);
        return s3;
    }

    @NotNull
    public Iterator<T> iterator() {
        return new Iterator<T>(this){
            private int c;
            private final Iterator<T> d;
            {
                this.c = s3.b;
                this.d = s3.a.iterator();
            }

            @Override
            public boolean hasNext() {
                boolean bl = this.c > 0 && this.d.hasNext();
                return bl;
            }

            @Override
            public T next() {
                int n4 = this.c;
                if (n4 != 0) {
                    this.c = n4 - 1;
                    return this.d.next();
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


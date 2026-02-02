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
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u000e\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\b\u0010\u0007J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0096\u0002\u00a2\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0006\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\b\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0017"}, d2={"Lkotlin/sequences/r;", "T", "Lkotlin/sequences/i;", "Lkotlin/sequences/c;", "", "n", "a", "(I)Lkotlin/sequences/i;", "b", "", "iterator", "()Ljava/util/Iterator;", "Lkotlin/sequences/i;", "sequence", "I", "startIndex", "c", "endIndex", "f", "()I", "count", "<init>", "(Lkotlin/sequences/i;II)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
@SourceDebugExtension(value={"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SubSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,698:1\n1#2:699\n*E\n"})
public final class r<T>
implements i<T>,
c<T> {
    @NotNull
    private final i<T> a;
    private final int b;
    private final int c;

    public r(@NotNull i<? extends T> object, int n4, int n5) {
        y.j(object, (String)"sequence");
        this.a = object;
        this.b = n4;
        this.c = n5;
        if (n4 >= 0) {
            if (n5 >= 0) {
                if (n5 >= n4) {
                    return;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("endIndex should be not less than startIndex, but was ");
                ((StringBuilder)object).append(n5);
                ((StringBuilder)object).append(" < ");
                ((StringBuilder)object).append(n4);
                throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("endIndex should be non-negative, but is ");
            ((StringBuilder)object).append(n5);
            throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("startIndex should be non-negative, but is ");
        ((StringBuilder)object).append(n4);
        throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
    }

    private final int f() {
        return this.c - this.b;
    }

    @Override
    @NotNull
    public i<T> a(int n4) {
        r<T> r2 = n4 >= this.f() ? l.e() : new r<T>(this.a, this.b + n4, this.c);
        return r2;
    }

    @Override
    @NotNull
    public i<T> b(int n4) {
        i<T> i4;
        if (n4 >= this.f()) {
            i4 = this;
        } else {
            i4 = this.a;
            int n5 = this.b;
            i4 = new r<T>(i4, n5, n4 + n5);
        }
        return i4;
    }

    @NotNull
    public Iterator<T> iterator() {
        return new Iterator<T>(this){
            private final Iterator<T> c;
            private int d;
            final r<T> e;
            {
                this.e = r2;
                this.c = r2.a.iterator();
            }

            private final void a() {
                while (this.d < this.e.b && this.c.hasNext()) {
                    this.c.next();
                    ++this.d;
                }
            }

            @Override
            public boolean hasNext() {
                this.a();
                boolean bl = this.d < this.e.c && this.c.hasNext();
                return bl;
            }

            @Override
            public T next() {
                this.a();
                if (this.d < this.e.c) {
                    ++this.d;
                    return this.c.next();
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


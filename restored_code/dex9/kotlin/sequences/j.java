/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.coroutines.g
 *  kotlin.coroutines.jvm.internal.g
 *  kotlin.jvm.internal.markers.a
 *  kotlin.jvm.internal.y
 *  kotlin.k0
 *  kotlin.sequences.k
 *  kotlin.u
 *  kotlin.u$a
 *  kotlin.v
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlin.sequences;

import java.io.Serializable;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.h;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.g;
import kotlin.jvm.internal.markers.a;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlin.sequences.k;
import kotlin.u;
import kotlin.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0007\u00a2\u0006\u0004\b-\u0010.J\u000f\u0010\u0006\u001a\u00028\u0000H\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0096\u0002\u00a2\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\b\u000e\u0010\u0007J\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00028\u0000H\u0096@\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0013\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\u00052\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015H\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\u00060\u0019j\u0002`\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\u001eR\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b \u0010!R*\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b*\u0010+\u00a8\u0006/"}, d2={"Lkotlin/sequences/j;", "T", "Lkotlin/sequences/k;", "", "Lkotlin/coroutines/d;", "Lkotlin/k0;", "g", "()Ljava/lang/Object;", "", "f", "()Ljava/lang/Throwable;", "", "hasNext", "()Z", "next", "value", "a", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "iterator", "d", "(Ljava/util/Iterator;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/u;", "result", "resumeWith", "(Ljava/lang/Object;)V", "", "Lkotlin/sequences/State;", "c", "I", "state", "Ljava/lang/Object;", "nextValue", "e", "Ljava/util/Iterator;", "nextIterator", "Lkotlin/coroutines/d;", "getNextStep", "()Lkotlin/coroutines/d;", "k", "(Lkotlin/coroutines/d;)V", "nextStep", "Lkotlin/coroutines/g;", "getContext", "()Lkotlin/coroutines/g;", "context", "<init>", "()V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
final class j<T>
extends k<T>
implements Iterator<T>,
d<k0>,
a {
    private int c;
    @Nullable
    private T d;
    @Nullable
    private Iterator<? extends T> e;
    @Nullable
    private d<? super k0> f;

    private final Throwable f() {
        Serializable serializable;
        int n4 = this.c;
        if (n4 != 4) {
            if (n4 != 5) {
                serializable = new StringBuilder();
                ((StringBuilder)serializable).append("Unexpected state of the iterator: ");
                ((StringBuilder)serializable).append(this.c);
                serializable = new IllegalStateException(((StringBuilder)serializable).toString());
            } else {
                serializable = new IllegalStateException("Iterator has failed.");
            }
        } else {
            serializable = new NoSuchElementException();
        }
        return serializable;
    }

    private final T g() {
        if (this.hasNext()) {
            return this.next();
        }
        throw new NoSuchElementException();
    }

    @Nullable
    public Object a(T object, @NotNull d<? super k0> d4) {
        this.d = object;
        this.c = 3;
        this.f = d4;
        object = b.f();
        if (object == b.f()) {
            g.c(d4);
        }
        if (object == b.f()) {
            return object;
        }
        return k0.a;
    }

    @Nullable
    public Object d(@NotNull Iterator<? extends T> object, @NotNull d<? super k0> d4) {
        if (!object.hasNext()) {
            return k0.a;
        }
        this.e = object;
        this.c = 2;
        this.f = d4;
        object = b.f();
        if (object == b.f()) {
            g.c(d4);
        }
        if (object == b.f()) {
            return object;
        }
        return k0.a;
    }

    @NotNull
    public kotlin.coroutines.g getContext() {
        return h.c;
    }

    @Override
    public boolean hasNext() {
        while (true) {
            Iterator<? extends T> iterator;
            int n4;
            if ((n4 = this.c) != 0) {
                if (n4 != 1) {
                    if (n4 != 2 && n4 != 3) {
                        if (n4 == 4) {
                            return false;
                        }
                        throw this.f();
                    }
                    return true;
                }
                iterator = this.e;
                y.g(iterator);
                if (iterator.hasNext()) {
                    this.c = 2;
                    return true;
                }
                this.e = null;
            }
            this.c = 5;
            iterator = this.f;
            y.g(iterator);
            this.f = null;
            u.a a4 = u.d;
            iterator.resumeWith(u.b((Object)k0.a));
        }
    }

    public final void k(@Nullable d<? super k0> d4) {
        this.f = d4;
    }

    @Override
    public T next() {
        int n4 = this.c;
        if (n4 != 0 && n4 != 1) {
            if (n4 != 2) {
                if (n4 == 3) {
                    this.c = 0;
                    T t3 = this.d;
                    this.d = null;
                    return t3;
                }
                throw this.f();
            }
            this.c = 1;
            Iterator<T> iterator = this.e;
            y.g(iterator);
            return iterator.next();
        }
        return this.g();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void resumeWith(@NotNull Object object) {
        v.b((Object)object);
        this.c = 4;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.markers.a
 *  org.jetbrains.annotations.Nullable
 */
package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.a;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007\u00a2\u0006\u0004\b\u0015\u0010\u000bJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0003H\u0096\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\u0007\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH$\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00028\u0000H\u0004\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0004\u00a2\u0006\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0016"}, d2={"Lkotlin/collections/b;", "T", "", "", "tryToComputeNext", "()Z", "hasNext", "next", "()Ljava/lang/Object;", "Lkotlin/k0;", "computeNext", "()V", "value", "setNext", "(Ljava/lang/Object;)V", "done", "", "state", "I", "nextValue", "Ljava/lang/Object;", "<init>", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
public abstract class b<T>
implements Iterator<T>,
a {
    @Nullable
    private T nextValue;
    private int state;

    private final boolean tryToComputeNext() {
        this.state = 3;
        this.computeNext();
        int n4 = this.state;
        boolean bl = true;
        if (n4 != 1) {
            bl = false;
        }
        return bl;
    }

    protected abstract void computeNext();

    protected final void done() {
        this.state = 2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean hasNext() {
        int n4 = this.state;
        if (n4 == 0) return this.tryToComputeNext();
        boolean bl = true;
        if (n4 == 1) return bl;
        if (n4 != 2) throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
        return false;
    }

    @Override
    public T next() {
        int n4 = this.state;
        if (n4 == 1) {
            this.state = 0;
            return this.nextValue;
        }
        if (n4 != 2 && this.tryToComputeNext()) {
            this.state = 0;
            return this.nextValue;
        }
        throw new NoSuchElementException();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    protected final void setNext(T t3) {
        this.nextValue = t3;
        this.state = 1;
    }
}


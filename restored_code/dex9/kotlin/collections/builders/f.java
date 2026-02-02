/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 */
package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.builders.d;
import kotlin.collections.h;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001b\b\u0000\u0012\u0010\u0010\u001b\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0018\u00a2\u0006\u0004\b \u0010!J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\r\u0010\tJ\u001d\u0010\u0010\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\u0012\u0010\tJ\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0096\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016\u00a2\u0006\u0004\b\u0016\u0010\u0011J\u001d\u0010\u0017\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0011R\u001e\u0010\u001b\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u00a8\u0006\""}, d2={"Lkotlin/collections/builders/f;", "E", "", "Lkotlin/collections/h;", "", "isEmpty", "()Z", "element", "contains", "(Ljava/lang/Object;)Z", "Lkotlin/k0;", "clear", "()V", "add", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "remove", "", "iterator", "()Ljava/util/Iterator;", "removeAll", "retainAll", "Lkotlin/collections/builders/d;", "c", "Lkotlin/collections/builders/d;", "backing", "", "getSize", "()I", "size", "<init>", "(Lkotlin/collections/builders/d;)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
public final class f<E>
extends h<E>
implements Set<E>,
kotlin.jvm.internal.markers.f {
    @NotNull
    private final d<E, ?> c;

    public f(@NotNull d<E, ?> d4) {
        y.j(d4, (String)"backing");
        this.c = d4;
    }

    @Override
    public boolean add(E e4) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(@NotNull Collection<? extends E> collection) {
        y.j(collection, (String)"elements");
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        this.c.clear();
    }

    @Override
    public boolean contains(Object object) {
        return this.c.containsKey(object);
    }

    @Override
    public int getSize() {
        return this.c.size();
    }

    @Override
    public boolean isEmpty() {
        return this.c.isEmpty();
    }

    @Override
    @NotNull
    public Iterator<E> iterator() {
        return this.c.F();
    }

    @Override
    public boolean remove(Object object) {
        return this.c.O(object);
    }

    @Override
    public boolean removeAll(@NotNull Collection<? extends Object> collection) {
        y.j(collection, (String)"elements");
        this.c.n();
        return super.removeAll(collection);
    }

    @Override
    public boolean retainAll(@NotNull Collection<? extends Object> collection) {
        y.j(collection, (String)"elements");
        this.c.n();
        return super.retainAll(collection);
    }
}


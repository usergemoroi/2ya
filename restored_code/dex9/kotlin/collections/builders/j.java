/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.collections.builders.h
 *  kotlin.collections.builders.j$a
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 */
package kotlin.collections.builders;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.builders.d;
import kotlin.collections.builders.j;
import kotlin.collections.h;
import kotlin.jvm.internal.markers.f;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u0000 \n*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005:\u0001,B\u001b\b\u0000\u0012\u0010\u0010#\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030 \u00a2\u0006\u0004\b(\u0010)B\t\b\u0016\u00a2\u0006\u0004\b(\u0010\u0014B\u0011\b\u0016\u0012\u0006\u0010*\u001a\u00020$\u00a2\u0006\u0004\b(\u0010+J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\u0016\u0010\u0011J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0096\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001e\u001a\u00020\f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016\u00a2\u0006\u0004\b\u001e\u0010\u001dJ\u001d\u0010\u001f\u001a\u00020\f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016\u00a2\u0006\u0004\b\u001f\u0010\u001dR\u001e\u0010#\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b%\u0010&\u00a8\u0006-"}, d2={"Lkotlin/collections/builders/j;", "E", "", "Lkotlin/collections/h;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "()Ljava/lang/Object;", "", "d", "()Ljava/util/Set;", "", "isEmpty", "()Z", "element", "contains", "(Ljava/lang/Object;)Z", "Lkotlin/k0;", "clear", "()V", "add", "remove", "", "iterator", "()Ljava/util/Iterator;", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "removeAll", "retainAll", "Lkotlin/collections/builders/d;", "c", "Lkotlin/collections/builders/d;", "backing", "", "getSize", "()I", "size", "<init>", "(Lkotlin/collections/builders/d;)V", "initialCapacity", "(I)V", "a", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
public final class j<E>
extends h<E>
implements Set<E>,
Serializable,
f {
    @NotNull
    private static final a d = new /* Unavailable Anonymous Inner Class!! */;
    @NotNull
    private static final j e = new j(kotlin.collections.builders.d.p.e());
    @NotNull
    private final d<E, ?> c;

    public j() {
        this(new d());
    }

    public j(int n4) {
        this(new d(n4));
    }

    public j(@NotNull d<E, ?> d4) {
        y.j(d4, (String)"backing");
        this.c = d4;
    }

    private final Object writeReplace() {
        if (this.c.E()) {
            return new kotlin.collections.builders.h((Collection)this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    @Override
    public boolean add(E e4) {
        boolean bl = this.c.k(e4) >= 0;
        return bl;
    }

    @Override
    public boolean addAll(@NotNull Collection<? extends E> collection) {
        y.j(collection, (String)"elements");
        this.c.n();
        return super.addAll(collection);
    }

    @Override
    public void clear() {
        this.c.clear();
    }

    @Override
    public boolean contains(Object object) {
        return this.c.containsKey(object);
    }

    @NotNull
    public final Set<E> d() {
        this.c.m();
        j j4 = this.size() > 0 ? this : e;
        return j4;
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


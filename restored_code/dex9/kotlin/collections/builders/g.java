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
import kotlin.Metadata;
import kotlin.collections.builders.d;
import kotlin.collections.e;
import kotlin.jvm.internal.markers.b;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001b\b\u0000\u0012\u0010\u0010\u001d\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0018\u00a2\u0006\u0004\b\"\u0010#J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\n\u0010\tJ\u001d\u0010\r\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0096\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\u0015\u0010\tJ\u001d\u0010\u0016\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016\u00a2\u0006\u0004\b\u0016\u0010\u000eJ\u001d\u0010\u0017\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016\u00a2\u0006\u0004\b\u0017\u0010\u000eR!\u0010\u001d\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u00188\u0006\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 \u00a8\u0006$"}, d2={"Lkotlin/collections/builders/g;", "V", "", "Lkotlin/collections/e;", "", "isEmpty", "()Z", "element", "contains", "(Ljava/lang/Object;)Z", "add", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "Lkotlin/k0;", "clear", "()V", "", "iterator", "()Ljava/util/Iterator;", "remove", "removeAll", "retainAll", "Lkotlin/collections/builders/d;", "c", "Lkotlin/collections/builders/d;", "getBacking", "()Lkotlin/collections/builders/d;", "backing", "", "getSize", "()I", "size", "<init>", "(Lkotlin/collections/builders/d;)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
public final class g<V>
extends e<V>
implements Collection<V>,
b {
    @NotNull
    private final d<?, V> c;

    public g(@NotNull d<?, V> d4) {
        y.j(d4, (String)"backing");
        this.c = d4;
    }

    @Override
    public boolean add(V v3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(@NotNull Collection<? extends V> collection) {
        y.j(collection, (String)"elements");
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        this.c.clear();
    }

    @Override
    public boolean contains(Object object) {
        return this.c.containsValue(object);
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
    public Iterator<V> iterator() {
        return this.c.R();
    }

    @Override
    public boolean remove(Object object) {
        return this.c.P(object);
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


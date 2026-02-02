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
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.builders.a;
import kotlin.collections.builders.d;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000H\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010)\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u001d\b\u0000\u0012\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001b\u00a2\u0006\u0004\b%\u0010&J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007J#\u0010\n\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016\u00a2\u0006\u0004\b\u000f\u0010\u000bJ)\u0010\u0012\u001a\u00020\u00052\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0010H\u0016\u00a2\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016\u00a2\u0006\u0004\b\u0014\u0010\u000bJ\"\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0015H\u0096\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0018\u001a\u00020\u00052\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0010H\u0016\u00a2\u0006\u0004\b\u0018\u0010\u0013J)\u0010\u0019\u001a\u00020\u00052\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0010H\u0016\u00a2\u0006\u0004\b\u0019\u0010\u0013J)\u0010\u001a\u001a\u00020\u00052\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0010H\u0016\u00a2\u0006\u0004\b\u001a\u0010\u0013R#\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001b8\u0006\u00a2\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\"\u0010#\u00a8\u0006'"}, d2={"Lkotlin/collections/builders/e;", "K", "V", "Lkotlin/collections/builders/a;", "", "", "isEmpty", "()Z", "", "element", "containsEntry", "(Ljava/util/Map$Entry;)Z", "Lkotlin/k0;", "clear", "()V", "add", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "remove", "", "iterator", "()Ljava/util/Iterator;", "containsAll", "removeAll", "retainAll", "Lkotlin/collections/builders/d;", "c", "Lkotlin/collections/builders/d;", "getBacking", "()Lkotlin/collections/builders/d;", "backing", "", "getSize", "()I", "size", "<init>", "(Lkotlin/collections/builders/d;)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
public final class e<K, V>
extends a<Map.Entry<K, V>, K, V> {
    @NotNull
    private final d<K, V> c;

    public e(@NotNull d<K, V> d4) {
        y.j(d4, (String)"backing");
        this.c = d4;
    }

    @Override
    public boolean add(@NotNull Map.Entry<K, V> entry) {
        y.j(entry, (String)"element");
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(@NotNull Collection<? extends Map.Entry<K, V>> collection) {
        y.j(collection, (String)"elements");
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        this.c.clear();
    }

    @Override
    public boolean containsAll(@NotNull Collection<? extends Object> collection) {
        y.j(collection, (String)"elements");
        return this.c.p(collection);
    }

    @Override
    public boolean containsEntry(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        y.j(entry, (String)"element");
        return this.c.q(entry);
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
    public Iterator<Map.Entry<K, V>> iterator() {
        return this.c.u();
    }

    @Override
    public boolean remove(@NotNull Map.Entry entry) {
        y.j((Object)entry, (String)"element");
        return this.c.L(entry);
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


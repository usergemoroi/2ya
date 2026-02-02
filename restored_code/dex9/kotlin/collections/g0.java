/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.markers.a
 *  kotlin.jvm.internal.o
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlin.collections;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.f0;
import kotlin.jvm.internal.markers.a;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\f\b\u00c0\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u00042\u00060\u0005j\u0002`\u0006B\t\b\u0002\u00a2\u0006\u0004\b0\u00101J\u000f\u0010\b\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0096\u0002\u00a2\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0002H\u0096\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\u000b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0016\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u000eH\u0096\u0002\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\"\u0010!J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020#H\u0096\u0002\u00a2\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020&H\u0016\u00a2\u0006\u0004\b'\u0010(J\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020&2\u0006\u0010\u001d\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\b'\u0010)J%\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010*\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b.\u0010\u0010\u00a8\u00062"}, d2={"Lkotlin/collections/g0;", "", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "readResolve", "()Ljava/lang/Object;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "isEmpty", "()Z", "element", "a", "(Ljava/lang/Void;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "d", "(I)Ljava/lang/Void;", "f", "(Ljava/lang/Void;)I", "g", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "e", "size", "<init>", "()V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
public final class g0
implements List,
Serializable,
RandomAccess,
a {
    @NotNull
    public static final g0 c = new g0();

    private g0() {
    }

    private final Object readResolve() {
        return c;
    }

    public boolean a(@NotNull Void void_) {
        y.j((Object)void_, (String)"element");
        return false;
    }

    public boolean addAll(int n4, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean containsAll(@NotNull Collection collection) {
        y.j((Object)collection, (String)"elements");
        return collection.isEmpty();
    }

    @NotNull
    public Void d(int n4) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Empty list doesn't contain element at index ");
        stringBuilder.append(n4);
        stringBuilder.append('.');
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    public int e() {
        return 0;
    }

    @Override
    public boolean equals(@Nullable Object object) {
        boolean bl = object instanceof List && ((List)object).isEmpty();
        return bl;
    }

    public int f(@NotNull Void void_) {
        y.j((Object)void_, (String)"element");
        return -1;
    }

    public int g(@NotNull Void void_) {
        y.j((Object)void_, (String)"element");
        return -1;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    @NotNull
    public Iterator iterator() {
        return f0.c;
    }

    @NotNull
    public ListIterator listIterator() {
        return f0.c;
    }

    @NotNull
    public ListIterator listIterator(int n4) {
        if (n4 == 0) {
            return f0.c;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Index: ");
        stringBuilder.append(n4);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    @Override
    public boolean remove(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @NotNull
    public List subList(int n4, int n5) {
        if (n4 == 0 && n5 == 0) {
            return this;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("fromIndex: ");
        stringBuilder.append(n4);
        stringBuilder.append(", toIndex: ");
        stringBuilder.append(n5);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    @Override
    public Object[] toArray() {
        return o.a((Collection)this);
    }

    @Override
    public <T> T[] toArray(T[] TArray) {
        y.j(TArray, (String)"array");
        return o.b((Collection)this, (Object[])TArray);
    }

    @NotNull
    public String toString() {
        return "[]";
    }
}


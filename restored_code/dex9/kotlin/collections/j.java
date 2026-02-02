/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.collections.u
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.f
 *  kotlin.jvm.internal.markers.a
 *  kotlin.jvm.internal.o
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 */
package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.l;
import kotlin.collections.u;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.markers.a;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u000e\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0096\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00100\u000f\u00a2\u0006\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000f8\u0006\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00038\u0006\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0005R\u0014\u0010\u001c\u001a\u00020\u001a8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u001b\u00a8\u0006\u001f"}, d2={"Lkotlin/collections/j;", "T", "", "", "isEmpty", "()Z", "element", "contains", "(Ljava/lang/Object;)Z", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "iterator", "()Ljava/util/Iterator;", "", "", "toArray", "()[Ljava/lang/Object;", "c", "[Ljava/lang/Object;", "getValues", "values", "d", "Z", "isVarargs", "", "()I", "size", "<init>", "([Ljava/lang/Object;Z)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
@SourceDebugExtension(value={"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/ArrayAsCollection\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,526:1\n1734#2,3:527\n*S KotlinDebug\n*F\n+ 1 Collections.kt\nkotlin/collections/ArrayAsCollection\n*L\n62#1:527,3\n*E\n"})
final class j<T>
implements Collection<T>,
a {
    @NotNull
    private final T[] c;
    private final boolean d;

    public j(@NotNull T[] TArray, boolean bl) {
        y.j(TArray, (String)"values");
        this.c = TArray;
        this.d = bl;
    }

    @Override
    public boolean add(T t3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean contains(Object object) {
        return l.c0((Object[])this.c, object);
    }

    @Override
    public boolean containsAll(@NotNull Collection<? extends Object> object) {
        boolean bl;
        block3: {
            y.j(object, (String)"elements");
            object = (Iterable)object;
            bl = object.isEmpty();
            boolean bl2 = true;
            if (bl) {
                bl = bl2;
            } else {
                object = object.iterator();
                do {
                    bl = bl2;
                    if (!object.hasNext()) break block3;
                } while (this.contains(object.next()));
                bl = false;
            }
        }
        return bl;
    }

    public int d() {
        return this.c.length;
    }

    @Override
    public boolean isEmpty() {
        boolean bl = this.c.length == 0;
        return bl;
    }

    @Override
    @NotNull
    public Iterator<T> iterator() {
        return f.a((Object[])this.c);
    }

    @Override
    public boolean remove(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    @NotNull
    public final Object[] toArray() {
        return u.b((Object[])this.c, (boolean)this.d);
    }

    @Override
    public <T> T[] toArray(T[] TArray) {
        y.j(TArray, (String)"array");
        return o.b((Collection)this, (Object[])TArray);
    }
}


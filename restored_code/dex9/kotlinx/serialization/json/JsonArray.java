/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.markers.a
 *  kotlin.jvm.internal.o
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.Serializable
 *  kotlinx.serialization.json.JsonArray$Companion
 *  kotlinx.serialization.json.JsonElement
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.serialization.json;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.internal.markers.a;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.y;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\u0010\b\u0007\u0018\u0000 /2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002:\u0001/B\u0015\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u00a2\u0006\u0004\b-\u0010.J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0001H\u0096\u0003\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0013\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0096\u0001\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\bH\u0096\u0003\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0001H\u0096\u0001\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005H\u0096\u0001\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u001cH\u0096\u0003\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0001H\u0096\u0001\u00a2\u0006\u0004\b\u001f\u0010\u0019J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010 H\u0096\u0001\u00a2\u0006\u0004\b!\u0010\"J\u001e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010 2\u0006\u0010\u0015\u001a\u00020\bH\u0096\u0001\u00a2\u0006\u0004\b!\u0010#J&\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\bH\u0096\u0001\u00a2\u0006\u0004\b&\u0010'R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\b8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b+\u0010\n\u00a8\u00060"}, d2={"Lkotlinx/serialization/json/JsonArray;", "Lkotlinx/serialization/json/JsonElement;", "", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "element", "a", "(Lkotlinx/serialization/json/JsonElement;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "d", "(I)Lkotlinx/serialization/json/JsonElement;", "f", "(Lkotlinx/serialization/json/JsonElement;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "g", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "c", "Ljava/util/List;", "content", "e", "size", "<init>", "(Ljava/util/List;)V", "Companion", "kotlinx-serialization-json"}, k=1, mv={2, 0, 0})
@Serializable(with=d.class)
public final class JsonArray
extends JsonElement
implements List<JsonElement>,
a {
    @NotNull
    public static final Companion Companion = new /* Unavailable Anonymous Inner Class!! */;
    @NotNull
    private final List<JsonElement> c;

    public JsonArray(@NotNull List<? extends JsonElement> list) {
        y.j(list, (String)"content");
        super(null);
        this.c = list;
    }

    public boolean a(@NotNull JsonElement jsonElement) {
        y.j((Object)jsonElement, (String)"element");
        return this.c.contains(jsonElement);
    }

    @Override
    public boolean addAll(int n4, Collection<? extends JsonElement> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean addAll(Collection<? extends JsonElement> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean containsAll(@NotNull Collection<? extends Object> collection) {
        y.j(collection, (String)"elements");
        return this.c.containsAll(collection);
    }

    @NotNull
    public JsonElement d(int n4) {
        return this.c.get(n4);
    }

    public int e() {
        return this.c.size();
    }

    @Override
    public boolean equals(@Nullable Object object) {
        return y.e(this.c, (Object)object);
    }

    public int f(@NotNull JsonElement jsonElement) {
        y.j((Object)jsonElement, (String)"element");
        return this.c.indexOf(jsonElement);
    }

    public int g(@NotNull JsonElement jsonElement) {
        y.j((Object)jsonElement, (String)"element");
        return this.c.lastIndexOf(jsonElement);
    }

    @Override
    public int hashCode() {
        return ((Object)this.c).hashCode();
    }

    @Override
    public boolean isEmpty() {
        return this.c.isEmpty();
    }

    @Override
    @NotNull
    public Iterator<JsonElement> iterator() {
        return this.c.iterator();
    }

    @Override
    @NotNull
    public ListIterator<JsonElement> listIterator() {
        return this.c.listIterator();
    }

    @Override
    @NotNull
    public ListIterator<JsonElement> listIterator(int n4) {
        return this.c.listIterator(n4);
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
    public void replaceAll(UnaryOperator<JsonElement> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void sort(Comparator<? super JsonElement> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    @NotNull
    public List<JsonElement> subList(int n4, int n5) {
        return this.c.subList(n4, n5);
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
        return t.B0(this.c, ",", "[", "]", 0, null, null, 56, null);
    }
}


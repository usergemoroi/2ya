/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.o
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package io.ktor.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.f;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000P\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003BG\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0017\u0010+\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010(\u00a2\u0006\u0002\b)\u0012\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000(\u00a2\u0006\u0002\b)\u00a2\u0006\u0004\b0\u00101J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004*\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016\u00a2\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0001H\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0001H\u0016\u00a2\u0006\u0004\b\u0012\u0010\u000bJ\u001d\u0010\u0013\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0016\u00a2\u0006\u0004\b\u0013\u0010\u000eJ\u001d\u0010\u0014\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0016\u00a2\u0006\u0004\b\u0014\u0010\u000eJ\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0001H\u0096\u0002\u00a2\u0006\u0004\b\u0015\u0010\u000bJ\u001d\u0010\u0016\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0016\u00a2\u0006\u0004\b\u0016\u0010\u000eJ\u000f\u0010\u0017\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0019H\u0096\u0002\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0096\u0002\u00a2\u0006\u0004\b!\u0010\u000bJ\u000f\u0010#\u001a\u00020\"H\u0016\u00a2\u0006\u0004\b#\u0010$R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b%\u0010&R%\u0010+\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010(\u00a2\u0006\u0002\b)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0005\u0010*R%\u0010,\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000(\u00a2\u0006\u0002\b)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0007\u0010*R\u001a\u0010/\u001a\u00020\u001c8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b-\u0010\u001e\u00a8\u00062"}, d2={"Lio/ktor/util/n;", "From", "To", "", "", "d", "(Ljava/util/Collection;)Ljava/util/Collection;", "e", "element", "", "add", "(Ljava/lang/Object;)Z", "elements", "addAll", "(Ljava/util/Collection;)Z", "Lkotlin/k0;", "clear", "()V", "remove", "removeAll", "retainAll", "contains", "containsAll", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "", "hashCode", "()I", "", "other", "equals", "", "toString", "()Ljava/lang/String;", "c", "Ljava/util/Set;", "delegate", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "Lkotlin/jvm/functions/l;", "convertTo", "convert", "f", "I", "size", "<init>", "(Ljava/util/Set;Lkotlin/jvm/functions/l;Lkotlin/jvm/functions/l;)V", "ktor-utils"}, k=1, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nDelegatingMutableSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegatingMutableSet.kt\nio/ktor/util/DelegatingMutableSet\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,59:1\n1549#2:60\n1620#2,3:61\n1549#2:64\n1620#2,3:65\n*S KotlinDebug\n*F\n+ 1 DelegatingMutableSet.kt\nio/ktor/util/DelegatingMutableSet\n*L\n13#1:60\n13#1:61,3\n14#1:64\n14#1:65,3\n*E\n"})
public class n<From, To>
implements Set<To>,
f {
    @NotNull
    private final Set<From> c;
    @NotNull
    private final l<From, To> d;
    @NotNull
    private final l<To, From> e;
    private final int f;

    public n(@NotNull Set<From> set, @NotNull l<? super From, ? extends To> l4, @NotNull l<? super To, ? extends From> l5) {
        y.j(set, (String)"delegate");
        y.j(l4, (String)"convertTo");
        y.j(l5, (String)"convert");
        this.c = set;
        this.d = l4;
        this.e = l5;
        this.f = set.size();
    }

    @Override
    public boolean add(To To) {
        return this.c.add(this.e.invoke(To));
    }

    @Override
    public boolean addAll(@NotNull Collection<? extends To> collection) {
        y.j(collection, (String)"elements");
        return this.c.addAll(this.d(collection));
    }

    @Override
    public void clear() {
        this.c.clear();
    }

    @Override
    public boolean contains(Object object) {
        return this.c.contains(this.e.invoke(object));
    }

    @Override
    public boolean containsAll(@NotNull Collection<? extends Object> collection) {
        y.j(collection, (String)"elements");
        return this.c.containsAll(this.d(collection));
    }

    @NotNull
    public Collection<From> d(@NotNull Collection<? extends To> collection) {
        y.j(collection, (String)"<this>");
        Object object = collection;
        collection = new ArrayList<To>(t.x((Iterable)object, 10));
        object = object.iterator();
        while (object.hasNext()) {
            Object e4 = object.next();
            collection.add(this.e.invoke(e4));
        }
        return collection;
    }

    @NotNull
    public Collection<To> e(@NotNull Collection<? extends From> collection) {
        y.j(collection, (String)"<this>");
        Iterable iterable2 = collection;
        collection = new ArrayList<From>(t.x(iterable2, 10));
        for (Iterable iterable2 : iterable2) {
            collection.add(this.d.invoke(iterable2));
        }
        return collection;
    }

    @Override
    public boolean equals(@Nullable Object object) {
        boolean bl;
        boolean bl2 = bl = false;
        if (object != null) {
            if (!(object instanceof Set)) {
                bl2 = bl;
            } else {
                Collection<To> collection = this.e((Collection)this.c);
                bl2 = bl;
                if (((Set)object).containsAll(collection)) {
                    bl2 = bl;
                    if (collection.containsAll((Collection)object)) {
                        bl2 = true;
                    }
                }
            }
        }
        return bl2;
    }

    public int f() {
        return this.f;
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
    public Iterator<To> iterator() {
        return new Iterator<To>(this){
            @NotNull
            private final Iterator<From> c;
            final n<From, To> d;
            {
                this.d = n4;
                this.c = n4.c.iterator();
            }

            @Override
            public boolean hasNext() {
                return this.c.hasNext();
            }

            @Override
            public To next() {
                return this.d.d.invoke(this.c.next());
            }

            @Override
            public void remove() {
                this.c.remove();
            }
        };
    }

    @Override
    public boolean remove(Object object) {
        return this.c.remove(this.e.invoke(object));
    }

    @Override
    public boolean removeAll(@NotNull Collection<? extends Object> collection) {
        y.j(collection, (String)"elements");
        return this.c.removeAll(this.d(collection));
    }

    @Override
    public boolean retainAll(@NotNull Collection<? extends Object> collection) {
        y.j(collection, (String)"elements");
        return this.c.retainAll(this.d(collection));
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
        return this.e((Collection)this.c).toString();
    }
}


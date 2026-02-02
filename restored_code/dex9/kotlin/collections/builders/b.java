/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.collections.builders.b$b
 *  kotlin.collections.builders.c
 *  kotlin.collections.builders.h
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.markers.a
 *  kotlin.jvm.internal.p
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlin.collections.builders;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.builders.b;
import kotlin.collections.builders.h;
import kotlin.collections.f;
import kotlin.collections.l;
import kotlin.collections.t;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.d;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u001e\n\u0002\b\u0015\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0012\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0000\u0018\u0000 d*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0003efWB\u0011\u0012\b\b\u0002\u0010b\u001a\u00020\u000f\u00a2\u0006\u0004\bc\u0010\u0012J\u000f\u0010\t\u001a\u00020\bH\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0012J\u001b\u0010\u0018\u001a\u00020\u00172\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0015H\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00028\u0000H\u0002\u00a2\u0006\u0004\b\u001e\u0010\u001fJ-\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b$\u0010%J\u001f\u0010(\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b(\u0010\u001cJ5\u0010*\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u000f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\u0006\u0010)\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\b*\u0010+J\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\u00a2\u0006\u0004\b\u0010\u0010,J\u000f\u0010-\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\b-\u0010.J\u0018\u00100\u001a\u00028\u00002\u0006\u0010/\u001a\u00020\u000fH\u0096\u0002\u00a2\u0006\u0004\b0\u0010%J \u00101\u001a\u00028\u00002\u0006\u0010/\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b5\u00104J\u0016\u00107\u001a\b\u0012\u0004\u0012\u00028\u000006H\u0096\u0002\u00a2\u0006\u0004\b7\u00108J\u0015\u0010:\u001a\b\u0012\u0004\u0012\u00028\u000009H\u0016\u00a2\u0006\u0004\b:\u0010;J\u001d\u0010:\u001a\b\u0012\u0004\u0012\u00028\u0000092\u0006\u0010/\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b:\u0010<J\u0017\u0010=\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b=\u0010>J\u001f\u0010=\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b=\u0010\u001fJ\u001d\u0010?\u001a\u00020\u00172\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0016\u00a2\u0006\u0004\b?\u0010@J%\u0010?\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u000f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0016\u00a2\u0006\u0004\b?\u0010AJ\u000f\u0010B\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\bB\u0010\rJ\u0017\u0010C\u001a\u00028\u00002\u0006\u0010/\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\bC\u0010%J\u0017\u0010D\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\bD\u0010>J\u001d\u0010E\u001a\u00020\u00172\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0016\u00a2\u0006\u0004\bE\u0010@J\u001d\u0010F\u001a\u00020\u00172\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0016\u00a2\u0006\u0004\bF\u0010@J%\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010G\u001a\u00020\u000f2\u0006\u0010H\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\bI\u0010JJ)\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00010L\"\u0004\b\u0001\u0010K2\f\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00010LH\u0016\u00a2\u0006\u0004\bN\u0010OJ\u0017\u0010N\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0LH\u0016\u00a2\u0006\u0004\bN\u0010PJ\u001a\u0010Q\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\bH\u0096\u0002\u00a2\u0006\u0004\bQ\u0010>J\u000f\u0010R\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\bR\u0010SJ\u000f\u0010U\u001a\u00020TH\u0016\u00a2\u0006\u0004\bU\u0010VR\u001c\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000L8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010\\\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010_\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010a\u001a\u00020\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b`\u0010S\u00a8\u0006g"}, d2={"Lkotlin/collections/builders/b;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/f;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "()Ljava/lang/Object;", "Lkotlin/k0;", "t", "()V", "o", "", "n", "r", "(I)V", "minCapacity", "q", "", "other", "", "p", "(Ljava/util/List;)Z", "i", "s", "(II)V", "element", "m", "(ILjava/lang/Object;)V", "", "elements", "l", "(ILjava/util/Collection;I)V", "u", "(I)Ljava/lang/Object;", "rangeOffset", "rangeLength", "v", "retain", "w", "(IILjava/util/Collection;Z)I", "()Ljava/util/List;", "isEmpty", "()Z", "index", "get", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "add", "(Ljava/lang/Object;)Z", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "clear", "removeAt", "remove", "removeAll", "retainAll", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "T", "", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "()[Ljava/lang/Object;", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "c", "[Ljava/lang/Object;", "backing", "d", "I", "length", "e", "Z", "isReadOnly", "getSize", "size", "initialCapacity", "<init>", "f", "a", "b", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
@SourceDebugExtension(value={"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,718:1\n1#2:719\n*E\n"})
public final class b<E>
extends f<E>
implements List<E>,
RandomAccess,
Serializable,
d {
    @NotNull
    private static final b f = new /* Unavailable Anonymous Inner Class!! */;
    @NotNull
    private static final b g;
    @NotNull
    private E[] c;
    private int d;
    private boolean e;

    static {
        b b4 = new b(0);
        b4.e = true;
        g = b4;
    }

    public b() {
        this(0, 1, null);
    }

    public b(int n4) {
        this.c = kotlin.collections.builders.c.d((int)n4);
    }

    public /* synthetic */ b(int n4, int n5, p p4) {
        if ((n5 & 1) != 0) {
            n4 = 10;
        }
        this(n4);
    }

    private final void l(int n4, Collection<? extends E> object, int n5) {
        this.t();
        this.s(n4, n5);
        object = object.iterator();
        for (int i4 = 0; i4 < n5; ++i4) {
            this.c[n4 + i4] = object.next();
        }
    }

    private final void m(int n4, E e4) {
        this.t();
        this.s(n4, 1);
        this.c[n4] = e4;
    }

    private final void o() {
        if (!this.e) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    private final boolean p(List<?> list) {
        return kotlin.collections.builders.c.a((Object[])this.c, (int)0, (int)this.d, list);
    }

    private final void q(int n4) {
        if (n4 >= 0) {
            E[] EArray = this.c;
            if (n4 > EArray.length) {
                n4 = kotlin.collections.c.Companion.e(EArray.length, n4);
                this.c = kotlin.collections.builders.c.e((Object[])this.c, (int)n4);
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    private final void r(int n4) {
        this.q(this.d + n4);
    }

    private final void s(int n4, int n5) {
        this.r(n5);
        Object[] objectArray = this.c;
        l.m(objectArray, objectArray, n4 + n5, n4, this.d);
        this.d += n5;
    }

    private final void t() {
        ++this.modCount;
    }

    private final E u(int n4) {
        this.t();
        Object[] objectArray = this.c;
        E e4 = objectArray[n4];
        l.m(objectArray, objectArray, n4, n4 + 1, this.d);
        kotlin.collections.builders.c.f((Object[])this.c, (int)(this.d - 1));
        --this.d;
        return e4;
    }

    private final void v(int n4, int n5) {
        if (n5 > 0) {
            this.t();
        }
        Object[] objectArray = this.c;
        l.m(objectArray, objectArray, n4, n4 + n5, this.d);
        objectArray = this.c;
        n4 = this.d;
        kotlin.collections.builders.c.g((Object[])objectArray, (int)(n4 - n5), (int)n4);
        this.d -= n5;
    }

    private final int w(int n4, int n5, Collection<? extends E> objectArray, boolean bl) {
        int n6 = 0;
        int n7 = 0;
        while (n6 < n5) {
            E[] EArray = this.c;
            int n8 = n4 + n6;
            if (objectArray.contains(EArray[n8]) == bl) {
                EArray = this.c;
                ++n6;
                EArray[n7 + n4] = EArray[n8];
                ++n7;
                continue;
            }
            ++n6;
        }
        n6 = n5 - n7;
        objectArray = this.c;
        l.m(objectArray, objectArray, n4 + n7, n5 + n4, this.d);
        objectArray = this.c;
        n4 = this.d;
        kotlin.collections.builders.c.g((Object[])objectArray, (int)(n4 - n6), (int)n4);
        if (n6 > 0) {
            this.t();
        }
        this.d -= n6;
        return n6;
    }

    private final Object writeReplace() {
        if (this.e) {
            return new h((Collection)this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override
    public void add(int n4, E e4) {
        this.o();
        kotlin.collections.c.Companion.c(n4, this.d);
        this.m(n4, e4);
    }

    @Override
    public boolean add(E e4) {
        this.o();
        this.m(this.d, e4);
        return true;
    }

    @Override
    public boolean addAll(int n4, @NotNull Collection<? extends E> collection) {
        y.j(collection, (String)"elements");
        this.o();
        kotlin.collections.c.Companion.c(n4, this.d);
        int n5 = collection.size();
        this.l(n4, collection, n5);
        boolean bl = n5 > 0;
        return bl;
    }

    @Override
    public boolean addAll(@NotNull Collection<? extends E> collection) {
        y.j(collection, (String)"elements");
        this.o();
        int n4 = collection.size();
        this.l(this.d, collection, n4);
        boolean bl = n4 > 0;
        return bl;
    }

    @Override
    public void clear() {
        this.o();
        this.v(0, this.d);
    }

    @Override
    public boolean equals(@Nullable Object object) {
        boolean bl = object == this || object instanceof List && this.p((List)object);
        return bl;
    }

    @Override
    public E get(int n4) {
        kotlin.collections.c.Companion.b(n4, this.d);
        return this.c[n4];
    }

    @Override
    public int getSize() {
        return this.d;
    }

    @Override
    public int hashCode() {
        return kotlin.collections.builders.c.b((Object[])this.c, (int)0, (int)this.d);
    }

    @Override
    public int indexOf(Object object) {
        for (int i4 = 0; i4 < this.d; ++i4) {
            if (!y.e(this.c[i4], (Object)object)) continue;
            return i4;
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        boolean bl = this.d == 0;
        return bl;
    }

    @Override
    @NotNull
    public Iterator<E> iterator() {
        return this.listIterator(0);
    }

    @Override
    public int lastIndexOf(Object object) {
        for (int i4 = this.d - 1; i4 >= 0; --i4) {
            if (!y.e(this.c[i4], (Object)object)) continue;
            return i4;
        }
        return -1;
    }

    @Override
    @NotNull
    public ListIterator<E> listIterator() {
        return this.listIterator(0);
    }

    @Override
    @NotNull
    public ListIterator<E> listIterator(int n4) {
        kotlin.collections.c.Companion.c(n4, this.d);
        return new c(this, n4);
    }

    @NotNull
    public final List<E> n() {
        this.o();
        this.e = true;
        b b4 = this.d > 0 ? this : g;
        return b4;
    }

    @Override
    public boolean remove(Object object) {
        this.o();
        int n4 = this.indexOf(object);
        if (n4 >= 0) {
            this.remove(n4);
        }
        boolean bl = n4 >= 0;
        return bl;
    }

    @Override
    public boolean removeAll(@NotNull Collection<? extends Object> collection) {
        y.j(collection, (String)"elements");
        this.o();
        int n4 = this.d;
        boolean bl = false;
        if (this.w(0, n4, collection, false) > 0) {
            bl = true;
        }
        return bl;
    }

    @Override
    public E removeAt(int n4) {
        this.o();
        kotlin.collections.c.Companion.b(n4, this.d);
        return this.u(n4);
    }

    @Override
    public boolean retainAll(@NotNull Collection<? extends Object> collection) {
        y.j(collection, (String)"elements");
        this.o();
        int n4 = this.d;
        boolean bl = false;
        if (this.w(0, n4, collection, true) > 0) {
            bl = true;
        }
        return bl;
    }

    @Override
    public E set(int n4, E e4) {
        this.o();
        kotlin.collections.c.Companion.b(n4, this.d);
        E[] EArray = this.c;
        E e5 = EArray[n4];
        EArray[n4] = e4;
        return e5;
    }

    @Override
    @NotNull
    public List<E> subList(int n4, int n5) {
        kotlin.collections.c.Companion.d(n4, n5, this.d);
        return new a<E>(this.c, n4, n5 - n4, null, this);
    }

    @Override
    @NotNull
    public Object[] toArray() {
        return l.t(this.c, 0, this.d);
    }

    @Override
    @NotNull
    public <T> T[] toArray(@NotNull T[] TArray) {
        y.j(TArray, (String)"array");
        int n4 = TArray.length;
        int n5 = this.d;
        if (n4 < n5) {
            TArray = Arrays.copyOfRange(this.c, 0, n5, TArray.getClass());
            y.i(TArray, (String)"copyOfRange(...)");
            return TArray;
        }
        l.m(this.c, (Object[])TArray, 0, 0, n5);
        return t.f(this.d, TArray);
    }

    @Override
    @NotNull
    public String toString() {
        return kotlin.collections.builders.c.c((Object[])this.c, (int)0, (int)this.d, (Collection)this);
    }

    @Metadata(d1={"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0015\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0012\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00010\u00052\u00060\u0006j\u0002`\u0007:\u0001dBC\u0012\f\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00010E\u0012\u0006\u0010U\u001a\u00020\u0015\u0012\u0006\u0010W\u001a\u00020\u0015\u0012\u000e\u0010Z\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0000\u0012\f\u0010]\u001a\b\u0012\u0004\u0012\u00028\u00010[\u00a2\u0006\u0004\bb\u0010cJ\u000f\u0010\t\u001a\u00020\bH\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u000f\u0010\rJ\u001b\u0010\u0013\u001a\u00020\u00122\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00028\u0001H\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010\f\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00028\u00012\u0006\u0010\u000e\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\b!\u0010\"J5\u0010$\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010#\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\b&\u0010'J\u0018\u0010)\u001a\u00028\u00012\u0006\u0010(\u001a\u00020\u0015H\u0096\u0002\u00a2\u0006\u0004\b)\u0010\u001eJ \u0010*\u001a\u00028\u00012\u0006\u0010(\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00028\u0001H\u0096\u0002\u00a2\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00028\u0001H\u0016\u00a2\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00028\u0001H\u0016\u00a2\u0006\u0004\b.\u0010-J\u0016\u00100\u001a\b\u0012\u0004\u0012\u00028\u00010/H\u0096\u0002\u00a2\u0006\u0004\b0\u00101J\u0015\u00103\u001a\b\u0012\u0004\u0012\u00028\u000102H\u0016\u00a2\u0006\u0004\b3\u00104J\u001d\u00103\u001a\b\u0012\u0004\u0012\u00028\u0001022\u0006\u0010(\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\b3\u00105J\u0017\u00106\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00028\u0001H\u0016\u00a2\u0006\u0004\b6\u00107J\u001f\u00106\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00028\u0001H\u0016\u00a2\u0006\u0004\b6\u0010\u0018J\u001d\u00108\u001a\u00020\u00122\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0019H\u0016\u00a2\u0006\u0004\b8\u00109J%\u00108\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0019H\u0016\u00a2\u0006\u0004\b8\u0010:J\u000f\u0010;\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\b;\u0010\rJ\u0017\u0010<\u001a\u00028\u00012\u0006\u0010(\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\b<\u0010\u001eJ\u0017\u0010=\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00028\u0001H\u0016\u00a2\u0006\u0004\b=\u00107J\u001d\u0010>\u001a\u00020\u00122\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0019H\u0016\u00a2\u0006\u0004\b>\u00109J\u001d\u0010?\u001a\u00020\u00122\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0019H\u0016\u00a2\u0006\u0004\b?\u00109J%\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010@\u001a\u00020\u00152\u0006\u0010A\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\bB\u0010CJ)\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00020E\"\u0004\b\u0002\u0010D2\f\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00020EH\u0016\u00a2\u0006\u0004\bG\u0010HJ\u0017\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0EH\u0016\u00a2\u0006\u0004\bG\u0010IJ\u001a\u0010J\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0096\u0002\u00a2\u0006\u0004\bJ\u00107J\u000f\u0010K\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\bK\u0010LJ\u000f\u0010N\u001a\u00020MH\u0016\u00a2\u0006\u0004\bN\u0010OR\u001c\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00010E8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010U\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010W\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bV\u0010TR\u001c\u0010Z\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bX\u0010YR\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00028\u00010[8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001b\u0010\\R\u0014\u0010_\u001a\u00020\u00128BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b^\u0010'R\u0014\u0010a\u001a\u00020\u00158VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b`\u0010L\u00a8\u0006e"}, d2={"Lkotlin/collections/builders/b$a;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/f;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "()Ljava/lang/Object;", "Lkotlin/k0;", "n", "()V", "i", "k", "", "other", "", "l", "(Ljava/util/List;)Z", "", "element", "h", "(ILjava/lang/Object;)V", "", "elements", "g", "(ILjava/util/Collection;I)V", "o", "(I)Ljava/lang/Object;", "rangeOffset", "rangeLength", "p", "(II)V", "retain", "q", "(IILjava/util/Collection;Z)I", "isEmpty", "()Z", "index", "get", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "add", "(Ljava/lang/Object;)Z", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "clear", "removeAt", "remove", "removeAll", "retainAll", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "T", "", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "()[Ljava/lang/Object;", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "c", "[Ljava/lang/Object;", "backing", "d", "I", "offset", "e", "length", "f", "Lkotlin/collections/builders/b$a;", "parent", "Lkotlin/collections/builders/b;", "Lkotlin/collections/builders/b;", "root", "m", "isReadOnly", "getSize", "size", "<init>", "([Ljava/lang/Object;IILkotlin/collections/builders/b$a;Lkotlin/collections/builders/b;)V", "a", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
    public static final class kotlin.collections.builders.b$a<E>
    extends f<E>
    implements List<E>,
    RandomAccess,
    Serializable,
    d {
        @NotNull
        private E[] c;
        private final int d;
        private int e;
        @Nullable
        private final kotlin.collections.builders.b$a<E> f;
        @NotNull
        private final b<E> g;

        public kotlin.collections.builders.b$a(@NotNull E[] EArray, int n4, int n5, @Nullable kotlin.collections.builders.b$a<E> a4, @NotNull b<E> b4) {
            y.j(EArray, (String)"backing");
            y.j(b4, (String)"root");
            this.c = EArray;
            this.d = n4;
            this.e = n5;
            this.f = a4;
            this.g = b4;
            this.modCount = ((b)b4).modCount;
        }

        private final void g(int n4, Collection<? extends E> collection, int n5) {
            this.n();
            kotlin.collections.builders.b$a<E> a4 = this.f;
            if (a4 != null) {
                super.g(n4, collection, n5);
            } else {
                ((b)this.g).l(n4, collection, n5);
            }
            this.c = ((b)this.g).c;
            this.e += n5;
        }

        private final void h(int n4, E e4) {
            this.n();
            kotlin.collections.builders.b$a<E> a4 = this.f;
            if (a4 != null) {
                super.h(n4, e4);
            } else {
                ((b)this.g).m(n4, e4);
            }
            this.c = ((b)this.g).c;
            ++this.e;
        }

        private final void i() {
            if (((b)this.g).modCount == this.modCount) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        private final void k() {
            if (!this.m()) {
                return;
            }
            throw new UnsupportedOperationException();
        }

        private final boolean l(List<?> list) {
            return kotlin.collections.builders.c.a((Object[])this.c, (int)this.d, (int)this.e, list);
        }

        private final boolean m() {
            return ((b)this.g).e;
        }

        private final void n() {
            ++this.modCount;
        }

        private final E o(int n4) {
            this.n();
            Object object = this.f;
            object = object != null ? super.o(n4) : ((b)this.g).u(n4);
            --this.e;
            return (E)object;
        }

        private final void p(int n4, int n5) {
            kotlin.collections.builders.b$a<E> a4;
            if (n5 > 0) {
                this.n();
            }
            if ((a4 = this.f) != null) {
                super.p(n4, n5);
            } else {
                ((b)this.g).v(n4, n5);
            }
            this.e -= n5;
        }

        private final int q(int n4, int n5, Collection<? extends E> collection, boolean bl) {
            kotlin.collections.builders.b$a<E> a4 = this.f;
            n4 = a4 != null ? super.q(n4, n5, collection, bl) : ((b)this.g).w(n4, n5, collection, bl);
            if (n4 > 0) {
                this.n();
            }
            this.e -= n4;
            return n4;
        }

        private final Object writeReplace() {
            if (this.m()) {
                return new h((Collection)this, 0);
            }
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }

        @Override
        public void add(int n4, E e4) {
            this.k();
            this.i();
            kotlin.collections.c.Companion.c(n4, this.e);
            this.h(this.d + n4, e4);
        }

        @Override
        public boolean add(E e4) {
            this.k();
            this.i();
            this.h(this.d + this.e, e4);
            return true;
        }

        @Override
        public boolean addAll(int n4, @NotNull Collection<? extends E> collection) {
            y.j(collection, (String)"elements");
            this.k();
            this.i();
            kotlin.collections.c.Companion.c(n4, this.e);
            int n5 = collection.size();
            this.g(this.d + n4, collection, n5);
            boolean bl = n5 > 0;
            return bl;
        }

        @Override
        public boolean addAll(@NotNull Collection<? extends E> collection) {
            y.j(collection, (String)"elements");
            this.k();
            this.i();
            int n4 = collection.size();
            this.g(this.d + this.e, collection, n4);
            boolean bl = n4 > 0;
            return bl;
        }

        @Override
        public void clear() {
            this.k();
            this.i();
            this.p(this.d, this.e);
        }

        @Override
        public boolean equals(@Nullable Object object) {
            this.i();
            boolean bl = object == this || object instanceof List && this.l((List)object);
            return bl;
        }

        @Override
        public E get(int n4) {
            this.i();
            kotlin.collections.c.Companion.b(n4, this.e);
            return this.c[this.d + n4];
        }

        @Override
        public int getSize() {
            this.i();
            return this.e;
        }

        @Override
        public int hashCode() {
            this.i();
            return kotlin.collections.builders.c.b((Object[])this.c, (int)this.d, (int)this.e);
        }

        @Override
        public int indexOf(Object object) {
            this.i();
            for (int i4 = 0; i4 < this.e; ++i4) {
                if (!y.e(this.c[this.d + i4], (Object)object)) continue;
                return i4;
            }
            return -1;
        }

        @Override
        public boolean isEmpty() {
            this.i();
            boolean bl = this.e == 0;
            return bl;
        }

        @Override
        @NotNull
        public Iterator<E> iterator() {
            return this.listIterator(0);
        }

        @Override
        public int lastIndexOf(Object object) {
            this.i();
            for (int i4 = this.e - 1; i4 >= 0; --i4) {
                if (!y.e(this.c[this.d + i4], (Object)object)) continue;
                return i4;
            }
            return -1;
        }

        @Override
        @NotNull
        public ListIterator<E> listIterator() {
            return this.listIterator(0);
        }

        @Override
        @NotNull
        public ListIterator<E> listIterator(int n4) {
            this.i();
            kotlin.collections.c.Companion.c(n4, this.e);
            return new a(this, n4);
        }

        @Override
        public boolean remove(Object object) {
            this.k();
            this.i();
            int n4 = this.indexOf(object);
            if (n4 >= 0) {
                this.remove(n4);
            }
            boolean bl = n4 >= 0;
            return bl;
        }

        @Override
        public boolean removeAll(@NotNull Collection<? extends Object> collection) {
            y.j(collection, (String)"elements");
            this.k();
            this.i();
            int n4 = this.d;
            int n5 = this.e;
            boolean bl = false;
            if (this.q(n4, n5, collection, false) > 0) {
                bl = true;
            }
            return bl;
        }

        @Override
        public E removeAt(int n4) {
            this.k();
            this.i();
            kotlin.collections.c.Companion.b(n4, this.e);
            return this.o(this.d + n4);
        }

        @Override
        public boolean retainAll(@NotNull Collection<? extends Object> collection) {
            y.j(collection, (String)"elements");
            this.k();
            this.i();
            int n4 = this.d;
            int n5 = this.e;
            boolean bl = true;
            if (this.q(n4, n5, collection, true) <= 0) {
                bl = false;
            }
            return bl;
        }

        @Override
        public E set(int n4, E e4) {
            this.k();
            this.i();
            kotlin.collections.c.Companion.b(n4, this.e);
            E[] EArray = this.c;
            int n5 = this.d;
            E e5 = EArray[n5 + n4];
            EArray[n5 + n4] = e4;
            return e5;
        }

        @Override
        @NotNull
        public List<E> subList(int n4, int n5) {
            kotlin.collections.c.Companion.d(n4, n5, this.e);
            return new kotlin.collections.builders.b$a<E>(this.c, this.d + n4, n5 - n4, this, this.g);
        }

        @Override
        @NotNull
        public Object[] toArray() {
            this.i();
            Object[] objectArray = this.c;
            int n4 = this.d;
            return l.t(objectArray, n4, this.e + n4);
        }

        @Override
        @NotNull
        public <T> T[] toArray(@NotNull T[] TArray) {
            y.j(TArray, (String)"array");
            this.i();
            int n4 = TArray.length;
            int n5 = this.e;
            if (n4 < n5) {
                E[] EArray = this.c;
                n4 = this.d;
                TArray = Arrays.copyOfRange(EArray, n4, n5 + n4, TArray.getClass());
                y.i(TArray, (String)"copyOfRange(...)");
                return TArray;
            }
            Object[] objectArray = this.c;
            n4 = this.d;
            l.m(objectArray, (Object[])TArray, 0, n4, n5 + n4);
            return t.f(this.e, TArray);
        }

        @Override
        @NotNull
        public String toString() {
            this.i();
            return kotlin.collections.builders.c.c((Object[])this.c, (int)this.d, (int)this.e, (Collection)this);
        }

        @Metadata(d1={"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u001d\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u0016\u0012\u0006\u0010\u001c\u001a\u00020\n\u00a2\u0006\u0004\b!\u0010\"J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H\u0096\u0002\u00a2\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00028\u0002H\u0016\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00028\u0002H\u0096\u0002\u00a2\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00028\u0002H\u0016\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00028\u0002H\u0016\u00a2\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0005R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010 \u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001f\u0010\u001b\u00a8\u0006#"}, d2={"Lkotlin/collections/builders/b$a$a;", "E", "", "Lkotlin/k0;", "a", "()V", "", "hasPrevious", "()Z", "hasNext", "", "previousIndex", "()I", "nextIndex", "previous", "()Ljava/lang/Object;", "next", "element", "set", "(Ljava/lang/Object;)V", "add", "remove", "Lkotlin/collections/builders/b$a;", "c", "Lkotlin/collections/builders/b$a;", "list", "d", "I", "index", "e", "lastIndex", "f", "expectedModCount", "<init>", "(Lkotlin/collections/builders/b$a;I)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
        @SourceDebugExtension(value={"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder$BuilderSubList$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,718:1\n1#2:719\n*E\n"})
        private static final class a<E>
        implements ListIterator<E>,
        kotlin.jvm.internal.markers.a {
            @NotNull
            private final kotlin.collections.builders.b$a<E> c;
            private int d;
            private int e;
            private int f;

            public a(@NotNull kotlin.collections.builders.b$a<E> a4, int n4) {
                y.j(a4, (String)"list");
                this.c = a4;
                this.d = n4;
                this.e = -1;
                this.f = ((kotlin.collections.builders.b$a)a4).modCount;
            }

            private final void a() {
                if (((kotlin.collections.builders.b$a)this.c).g.modCount == this.f) {
                    return;
                }
                throw new ConcurrentModificationException();
            }

            @Override
            public void add(E e4) {
                this.a();
                kotlin.collections.builders.b$a<E> a4 = this.c;
                int n4 = this.d;
                this.d = n4 + 1;
                a4.add(n4, e4);
                this.e = -1;
                this.f = ((kotlin.collections.builders.b$a)this.c).modCount;
            }

            @Override
            public boolean hasNext() {
                boolean bl = this.d < ((kotlin.collections.builders.b$a)this.c).e;
                return bl;
            }

            @Override
            public boolean hasPrevious() {
                boolean bl = this.d > 0;
                return bl;
            }

            @Override
            public E next() {
                this.a();
                if (this.d < ((kotlin.collections.builders.b$a)this.c).e) {
                    int n4 = this.d;
                    this.d = n4 + 1;
                    this.e = n4;
                    return (E)((kotlin.collections.builders.b$a)this.c).c[((kotlin.collections.builders.b$a)this.c).d + this.e];
                }
                throw new NoSuchElementException();
            }

            @Override
            public int nextIndex() {
                return this.d;
            }

            @Override
            public E previous() {
                this.a();
                int n4 = this.d;
                if (n4 > 0) {
                    this.d = --n4;
                    this.e = n4;
                    return (E)((kotlin.collections.builders.b$a)this.c).c[((kotlin.collections.builders.b$a)this.c).d + this.e];
                }
                throw new NoSuchElementException();
            }

            @Override
            public int previousIndex() {
                return this.d - 1;
            }

            @Override
            public void remove() {
                this.a();
                int n4 = this.e;
                if (n4 != -1) {
                    this.c.remove(n4);
                    this.d = this.e;
                    this.e = -1;
                    this.f = ((kotlin.collections.builders.b$a)this.c).modCount;
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
            }

            @Override
            public void set(E e4) {
                this.a();
                int n4 = this.e;
                if (n4 != -1) {
                    this.c.set(n4, e4);
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
            }
        }
    }

    @Metadata(d1={"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001d\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0016\u0012\u0006\u0010\u001c\u001a\u00020\n\u00a2\u0006\u0004\b!\u0010\"J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H\u0096\u0002\u00a2\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00028\u0001H\u0016\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00028\u0001H\u0096\u0002\u00a2\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00028\u0001H\u0016\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00028\u0001H\u0016\u00a2\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0005R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010 \u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001f\u0010\u001b\u00a8\u0006#"}, d2={"Lkotlin/collections/builders/b$c;", "E", "", "Lkotlin/k0;", "a", "()V", "", "hasPrevious", "()Z", "hasNext", "", "previousIndex", "()I", "nextIndex", "previous", "()Ljava/lang/Object;", "next", "element", "set", "(Ljava/lang/Object;)V", "add", "remove", "Lkotlin/collections/builders/b;", "c", "Lkotlin/collections/builders/b;", "list", "d", "I", "index", "e", "lastIndex", "f", "expectedModCount", "<init>", "(Lkotlin/collections/builders/b;I)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
    @SourceDebugExtension(value={"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,718:1\n1#2:719\n*E\n"})
    private static final class c<E>
    implements ListIterator<E>,
    kotlin.jvm.internal.markers.a {
        @NotNull
        private final b<E> c;
        private int d;
        private int e;
        private int f;

        public c(@NotNull b<E> b4, int n4) {
            y.j(b4, (String)"list");
            this.c = b4;
            this.d = n4;
            this.e = -1;
            this.f = ((b)b4).modCount;
        }

        private final void a() {
            if (((b)this.c).modCount == this.f) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        @Override
        public void add(E e4) {
            this.a();
            b<E> b4 = this.c;
            int n4 = this.d;
            this.d = n4 + 1;
            b4.add(n4, e4);
            this.e = -1;
            this.f = ((b)this.c).modCount;
        }

        @Override
        public boolean hasNext() {
            boolean bl = this.d < ((b)this.c).d;
            return bl;
        }

        @Override
        public boolean hasPrevious() {
            boolean bl = this.d > 0;
            return bl;
        }

        @Override
        public E next() {
            this.a();
            if (this.d < ((b)this.c).d) {
                int n4 = this.d;
                this.d = n4 + 1;
                this.e = n4;
                return (E)((b)this.c).c[this.e];
            }
            throw new NoSuchElementException();
        }

        @Override
        public int nextIndex() {
            return this.d;
        }

        @Override
        public E previous() {
            this.a();
            int n4 = this.d;
            if (n4 > 0) {
                this.d = --n4;
                this.e = n4;
                return (E)((b)this.c).c[this.e];
            }
            throw new NoSuchElementException();
        }

        @Override
        public int previousIndex() {
            return this.d - 1;
        }

        @Override
        public void remove() {
            this.a();
            int n4 = this.e;
            if (n4 != -1) {
                this.c.remove(n4);
                this.d = this.e;
                this.e = -1;
                this.f = ((b)this.c).modCount;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }

        @Override
        public void set(E e4) {
            this.a();
            int n4 = this.e;
            if (n4 != -1) {
                this.c.set(n4, e4);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
    }
}


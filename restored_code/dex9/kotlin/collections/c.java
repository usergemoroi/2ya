/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.SinceKotlin
 *  kotlin.collections.c$a
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.markers.a
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.collections.c;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0006\n\u0002\u0010*\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b'\u0018\u0000 \"*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004#$%&B\t\b\u0004\u00a2\u0006\u0004\b \u0010!J\u0018\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u00a6\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0096\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0012J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00048&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u001d\u00a8\u0006'"}, d2={"Lkotlin/collections/c;", "E", "Lkotlin/collections/a;", "", "", "index", "get", "(I)Ljava/lang/Object;", "", "iterator", "()Ljava/util/Iterator;", "element", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getSize", "size", "<init>", "()V", "Companion", "a", "b", "c", "d", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
@SinceKotlin(version="1.1")
@SourceDebugExtension(value={"SMAP\nAbstractList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractList.kt\nkotlin/collections/AbstractList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,175:1\n360#2,7:176\n388#2,7:183\n*S KotlinDebug\n*F\n+ 1 AbstractList.kt\nkotlin/collections/AbstractList\n*L\n27#1:176,7\n29#1:183,7\n*E\n"})
public abstract class c<E>
extends kotlin.collections.a<E>
implements List<E>,
kotlin.jvm.internal.markers.a {
    @NotNull
    public static final a Companion = new /* Unavailable Anonymous Inner Class!! */;
    private static final int maxArraySize = 0x7FFFFFF7;

    protected c() {
    }

    @Override
    public void add(int n4, E e4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean addAll(int n4, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean equals(@Nullable Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof List)) {
            return false;
        }
        return Companion.f((Collection)this, (Collection)object);
    }

    @Override
    public abstract E get(int var1);

    @Override
    public abstract int getSize();

    @Override
    public int hashCode() {
        return Companion.g((Collection)this);
    }

    @Override
    public int indexOf(E e4) {
        int n4;
        block2: {
            Iterator iterator = this.iterator();
            n4 = 0;
            while (iterator.hasNext()) {
                if (!y.e(iterator.next(), e4)) {
                    ++n4;
                    continue;
                }
                break block2;
            }
            n4 = -1;
        }
        return n4;
    }

    @Override
    @NotNull
    public Iterator<E> iterator() {
        return new b(this);
    }

    @Override
    public int lastIndexOf(E e4) {
        int n4;
        block1: {
            ListIterator listIterator = this.listIterator(this.size());
            while (listIterator.hasPrevious()) {
                if (!y.e(listIterator.previous(), e4)) continue;
                n4 = listIterator.nextIndex();
                break block1;
            }
            n4 = -1;
        }
        return n4;
    }

    @Override
    @NotNull
    public ListIterator<E> listIterator() {
        return new c(this, 0);
    }

    @Override
    @NotNull
    public ListIterator<E> listIterator(int n4) {
        return new c(this, n4);
    }

    @Override
    public E remove(int n4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public E set(int n4, E e4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    @NotNull
    public List<E> subList(int n4, int n5) {
        return new d(this, n4, n5);
    }

    @Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\b\u0092\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0011"}, d2={"Lkotlin/collections/c$b;", "", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "", "c", "I", "a", "()I", "b", "(I)V", "index", "<init>", "(Lkotlin/collections/c;)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
    private class b
    implements Iterator<E>,
    kotlin.jvm.internal.markers.a {
        private int c;
        final c<E> d;

        public b(c c4) {
            this.d = c4;
        }

        protected final int a() {
            return this.c;
        }

        protected final void b(int n4) {
            this.c = n4;
        }

        @Override
        public boolean hasNext() {
            boolean bl = this.c < this.d.size();
            return bl;
        }

        @Override
        public E next() {
            if (this.hasNext()) {
                c c4 = this.d;
                int n4 = this.c;
                this.c = n4 + 1;
                return c4.get(n4);
            }
            throw new NoSuchElementException();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Metadata(d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0092\u0004\u0018\u00002\f0\u0001R\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0007\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\f\u0010\t\u00a8\u0006\u0010"}, d2={"Lkotlin/collections/c$c;", "Lkotlin/collections/c$b;", "Lkotlin/collections/c;", "", "", "hasPrevious", "()Z", "", "nextIndex", "()I", "previous", "()Ljava/lang/Object;", "previousIndex", "index", "<init>", "(Lkotlin/collections/c;I)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
    private class c
    extends b
    implements ListIterator<E>,
    kotlin.jvm.internal.markers.a {
        final c<E> e;

        public c(c c4, int n4) {
            this.e = c4;
            super(c4);
            Companion.c(n4, c4.size());
            this.b(n4);
        }

        @Override
        public void add(E e4) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public boolean hasPrevious() {
            boolean bl = this.a() > 0;
            return bl;
        }

        @Override
        public int nextIndex() {
            return this.a();
        }

        @Override
        public E previous() {
            if (this.hasPrevious()) {
                c c4 = this.e;
                this.b(this.a() - 1);
                return c4.get(this.a());
            }
            throw new NoSuchElementException();
        }

        @Override
        public int previousIndex() {
            return this.a() - 1;
        }

        @Override
        public void set(E e4) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Metadata(d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\u00060\u0003j\u0002`\u0004B%\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002\u00a2\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0013\u001a\u00020\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0017"}, d2={"Lkotlin/collections/c$d;", "E", "Lkotlin/collections/c;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "index", "get", "(I)Ljava/lang/Object;", "c", "Lkotlin/collections/c;", "list", "d", "I", "fromIndex", "e", "_size", "getSize", "()I", "size", "toIndex", "<init>", "(Lkotlin/collections/c;II)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
    private static final class d<E>
    extends c<E>
    implements RandomAccess {
        @NotNull
        private final c<E> c;
        private final int d;
        private int e;

        public d(@NotNull c<? extends E> c4, int n4, int n5) {
            y.j(c4, (String)"list");
            this.c = c4;
            this.d = n4;
            Companion.d(n4, n5, c4.size());
            this.e = n5 - n4;
        }

        @Override
        public E get(int n4) {
            Companion.b(n4, this.e);
            return this.c.get(this.d + n4);
        }

        @Override
        public int getSize() {
            return this.e;
        }
    }
}


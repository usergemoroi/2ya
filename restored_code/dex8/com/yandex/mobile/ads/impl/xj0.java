/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.errorprone.annotations.CanIgnoreReturnValue
 *  com.google.errorprone.annotations.DoNotCall
 *  com.google.errorprone.annotations.InlineMe
 *  com.yandex.mobile.ads.impl.fe
 *  com.yandex.mobile.ads.impl.p82
 *  com.yandex.mobile.ads.impl.vj0
 *  com.yandex.mobile.ads.impl.wd1
 *  com.yandex.mobile.ads.impl.wj1
 */
package com.yandex.mobile.ads.impl;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.InlineMe;
import com.yandex.mobile.ads.impl.f;
import com.yandex.mobile.ads.impl.fe;
import com.yandex.mobile.ads.impl.p82;
import com.yandex.mobile.ads.impl.po1;
import com.yandex.mobile.ads.impl.q82;
import com.yandex.mobile.ads.impl.vj0;
import com.yandex.mobile.ads.impl.wd1;
import com.yandex.mobile.ads.impl.wj1;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

public abstract class xj0<E>
extends vj0<E>
implements List<E>,
RandomAccess {
    private static final q82<Object> c = new b<Object>(0, po1.g);
    public static final int d = 0;

    xj0() {
    }

    public static xj0 a(Long l10, Long l11, Long l13, Long l14, Long l15) {
        return xj0.a(new Object[]{l10, l11, l13, l14, l15});
    }

    public static <E> xj0<E> a(E e11) {
        return xj0.a(new Object[]{e11});
    }

    public static <E> xj0<E> a(E e11, E e14) {
        return xj0.a(new Object[]{e11, e14});
    }

    public static <E> xj0<E> a(Collection<? extends E> object) {
        if (object instanceof vj0) {
            Object[] objectArray;
            object = objectArray = ((vj0)object).b();
            if (objectArray.f()) {
                object = objectArray.toArray();
                object = xj0.b(((Object[])object).length, object);
            }
            return object;
        }
        return xj0.a(object.toArray());
    }

    private static <E> xj0<E> a(Object ... objectArray) {
        int n10 = objectArray.length;
        for (int i14 = 0; i14 < n10; ++i14) {
            if (objectArray[i14] != null) {
                continue;
            }
            throw new NullPointerException(fe.a((String)"at index ", (int)i14));
        }
        return xj0.b(objectArray.length, objectArray);
    }

    static xj0 b(int n10, Object[] objectArray) {
        if (n10 == 0) {
            return po1.g;
        }
        return new po1(n10, objectArray);
    }

    public static <E> xj0<E> b(E[] object) {
        object = ((E[])object).length == 0 ? po1.g : xj0.a((Object[])object.clone());
        return object;
    }

    public static <E> a<E> g() {
        return new a();
    }

    public static <E> xj0<E> h() {
        return po1.g;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    int a(int n10, Object[] objectArray) {
        int n13 = ((AbstractCollection)((Object)this)).size();
        for (int i14 = 0; i14 < n13; ++i14) {
            objectArray[n10 + i14] = this.get(i14);
        }
        return n10 + n13;
    }

    public final q82<E> a(int n10) {
        wj1.b((int)n10, (int)((AbstractCollection)((Object)this)).size());
        if (((AbstractCollection)((Object)this)).isEmpty()) {
            return c;
        }
        return new b(n10, this);
    }

    public xj0<E> a(int n10, int n13) {
        wj1.a((int)n10, (int)n13, (int)((AbstractCollection)((Object)this)).size());
        if ((n13 -= n10) == ((AbstractCollection)((Object)this)).size()) {
            return this;
        }
        if (n13 == 0) {
            return po1.g;
        }
        return new d(this, n10, n13);
    }

    @Override
    @Deprecated
    @DoNotCall(value="Always throws UnsupportedOperationException")
    public final void add(int n10, E e11) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    @CanIgnoreReturnValue
    @DoNotCall(value="Always throws UnsupportedOperationException")
    public final boolean addAll(int n10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @InlineMe(replacement="this")
    public final xj0<E> b() {
        return this;
    }

    @Override
    public final boolean contains(@CheckForNull Object object) {
        boolean bl2 = this.indexOf(object) >= 0;
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean equals(@CheckForNull Object iterator) {
        boolean bl2 = true;
        if (iterator == this) {
            return bl2;
        }
        if (!(iterator instanceof List)) return false;
        Object object = (List)((Object)iterator);
        int n10 = this.size();
        if (n10 != object.size()) return false;
        if (object instanceof RandomAccess) {
            int n13 = 0;
            while (true) {
                boolean bl3 = bl2;
                if (n13 >= n10) return bl3;
                if (!wd1.a(this.get(n13), object.get(n13))) return false;
                ++n13;
            }
        }
        iterator = this.iterator();
        object = object.iterator();
        do {
            if (!iterator.hasNext()) return true ^ object.hasNext();
        } while (object.hasNext() && wd1.a(iterator.next(), object.next()));
        return false;
    }

    @Override
    public final int hashCode() {
        int n10 = ((AbstractCollection)((Object)this)).size();
        int n13 = 1;
        for (int i14 = 0; i14 < n10; ++i14) {
            n13 = ~(~(this.get(i14).hashCode() + n13 * 31));
        }
        return n13;
    }

    @Override
    public final int indexOf(@CheckForNull Object object) {
        int n10;
        if (object != null) {
            int n13 = this.size();
            for (n10 = 0; n10 < n13; ++n10) {
                if (!object.equals(this.get(n10))) {
                    continue;
                }
                break;
            }
        } else {
            n10 = -1;
        }
        return n10;
    }

    @Override
    public final p82<E> iterator() {
        return this.a(0);
    }

    @Override
    public Iterator iterator() {
        return this.a(0);
    }

    @Override
    public final int lastIndexOf(@CheckForNull Object object) {
        int n10;
        if (object != null) {
            for (n10 = this.size() - 1; n10 >= 0; --n10) {
                if (!object.equals(this.get(n10))) {
                    continue;
                }
                break;
            }
        } else {
            n10 = -1;
        }
        return n10;
    }

    @Override
    public ListIterator listIterator() {
        return this.a(0);
    }

    @Override
    @Deprecated
    @CanIgnoreReturnValue
    @DoNotCall(value="Always throws UnsupportedOperationException")
    public final E remove(int n10) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    @CanIgnoreReturnValue
    @DoNotCall(value="Always throws UnsupportedOperationException")
    public final E set(int n10, E e11) {
        throw new UnsupportedOperationException();
    }

    Object writeReplace() {
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    public static final class a<E>
    extends vj0.a<E> {
        public a() {
            this(0);
        }

        a(int n10) {
        }

        public final xj0<E> a() {
            this.c = true;
            Object[] objectArray = this.a;
            return xj0.b(this.b, objectArray);
        }

        @CanIgnoreReturnValue
        public final a b(List list) {
            this.a(list);
            return this;
        }
    }

    static final class b<E>
    extends f<E> {
        private final xj0<E> d;

        b(int n10, xj0 xj02) {
            super(((AbstractCollection)((Object)xj02)).size(), n10);
            this.d = xj02;
        }

        @Override
        protected final E a(int n10) {
            return this.d.get(n10);
        }
    }

    final class d
    extends xj0<E> {
        final transient int e;
        final transient int f;
        final xj0 g;

        d(xj0 xj02, int n10, int n13) {
            this.g = xj02;
            this.e = n10;
            this.f = n13;
        }

        @Override
        public final xj0<E> a(int n10, int n13) {
            wj1.a((int)n10, (int)n13, (int)this.f);
            xj0 xj02 = this.g;
            int n14 = this.e;
            return xj02.a(n10 + n14, n13 + n14);
        }

        @CheckForNull
        final Object[] c() {
            return this.g.c();
        }

        final int d() {
            return this.g.e() + this.e + this.f;
        }

        final int e() {
            return this.g.e() + this.e;
        }

        final boolean f() {
            return true;
        }

        @Override
        public final E get(int n10) {
            wj1.a((int)n10, (int)this.f);
            return this.g.get(n10 + this.e);
        }

        @Override
        public final Iterator iterator() {
            return this.a(0);
        }

        @Override
        public final ListIterator listIterator() {
            return this.a(0);
        }

        @Override
        public final int size() {
            return this.f;
        }
    }
}


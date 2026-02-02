/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.du0
 *  com.yandex.mobile.ads.impl.k$c$a
 *  com.yandex.mobile.ads.impl.k$i
 *  com.yandex.mobile.ads.impl.k$i$a
 *  com.yandex.mobile.ads.impl.wj1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.au0;
import com.yandex.mobile.ads.impl.bu0;
import com.yandex.mobile.ads.impl.du0;
import com.yandex.mobile.ads.impl.k;
import com.yandex.mobile.ads.impl.m;
import com.yandex.mobile.ads.impl.wj0;
import com.yandex.mobile.ads.impl.wj1;
import com.yandex.mobile.ads.impl.y31;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

abstract class k<K, V>
extends m<K, V>
implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    private transient Map<K, Collection<V>> e;
    private transient int f;

    protected k(Map<K, Collection<V>> map2) {
        wj1.a((boolean)map2.isEmpty());
        this.e = map2;
    }

    private static <E> Iterator<E> a(Collection<E> iterator) {
        iterator = iterator instanceof List ? ((List)((Object)iterator)).listIterator() : iterator.iterator();
        return iterator;
    }

    static /* bridge */ /* synthetic */ Iterator f(Collection collection) {
        return k.a(collection);
    }

    final void a(Map<K, Collection<V>> collection2) {
        this.e = collection2;
        this.f = 0;
        for (Collection<Collection<V>> collection2 : collection2.values()) {
            if (collection2.isEmpty() ^ true) {
                int n10 = this.f;
                this.f = collection2.size() + n10;
                continue;
            }
            throw new IllegalArgumentException();
        }
    }

    final Map<K, Collection<V>> c() {
        return this.e;
    }

    public final void d() {
        Iterator<Collection<V>> iterator = this.e.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().clear();
        }
        this.e.clear();
        this.f = 0;
    }

    final Map<K, Collection<V>> e() {
        Map<K, Collection<V>> map2 = this.e;
        if (map2 instanceof NavigableMap) {
            return new d(this, (NavigableMap)this.e);
        }
        if (map2 instanceof SortedMap) {
            return new g(this, (SortedMap)this.e);
        }
        return new a(this, this.e);
    }

    final Set<K> f() {
        Map<K, Collection<V>> map2 = this.e;
        if (map2 instanceof NavigableMap) {
            return new e(this, (NavigableMap)this.e);
        }
        if (map2 instanceof SortedMap) {
            return new h(this, (SortedMap)this.e);
        }
        return new c(this, this.e);
    }

    public final int g() {
        return this.f;
    }

    public boolean put(K k11, V v14) {
        List list = this.e.get(k11);
        if (list == null) {
            list = (List)((y31)this).g.get();
            if (list.add(v14)) {
                ++this.f;
                this.e.put(k11, list);
                return true;
            }
            throw new AssertionError((Object)"New Collection violated the Collection spec");
        }
        if (list.add(v14)) {
            ++this.f;
            return true;
        }
        return false;
    }

    @Override
    public final Collection<V> values() {
        return super.values();
    }

    private class com.yandex.mobile.ads.impl.k$a
    extends du0<K, Collection<V>> {
        final transient Map<K, Collection<V>> d;
        final k e;

        com.yandex.mobile.ads.impl.k$a(k k11, Map<K, Collection<V>> map2) {
            this.e = k11;
            this.d = map2;
        }

        final Map.Entry<K, Collection<V>> a(Map.Entry<K, Collection<V>> object) {
            Object k11 = object.getKey();
            k k12 = this.e;
            object = object.getValue();
            k12 = (com.yandex.mobile.ads.impl.i)k12;
            k12.getClass();
            object = (List)object;
            object = object instanceof RandomAccess ? new f(k12, k11, object, null) : new j(k12, k11, object, null);
            return new wj0(k11, object);
        }

        public final void clear() {
            Map map2 = this.d;
            k k11 = this.e;
            if (map2 == k11.e) {
                k11.d();
            } else {
                k11 = new /* Unavailable Anonymous Inner Class!! */;
                while (k11.hasNext()) {
                    k11.next();
                    k11.remove();
                }
            }
        }

        public final boolean containsKey(@CheckForNull Object object) {
            boolean bl2;
            Map map2 = this.d;
            map2.getClass();
            try {
                bl2 = map2.containsKey(object);
            }
            catch (ClassCastException | NullPointerException runtimeException) {
                bl2 = false;
            }
            return bl2;
        }

        public final boolean equals(@CheckForNull Object object) {
            boolean bl2 = this == object || this.d.equals(object);
            return bl2;
        }

        @CheckForNull
        public final Object get(@CheckForNull Object object) {
            Object object2 = this.d;
            object2.getClass();
            List list = null;
            try {
                object2 = object2.get(object);
            }
            catch (ClassCastException | NullPointerException runtimeException) {
                object2 = null;
            }
            Collection collection = (Collection)object2;
            if (collection == null) {
                object = list;
            } else {
                object2 = (com.yandex.mobile.ads.impl.i)this.e;
                object2.getClass();
                list = (List)collection;
                object = list instanceof RandomAccess ? new f((k)object2, object, list, null) : new j((k)object2, object, list, null);
            }
            return object;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public Set<K> keySet() {
            return this.e.b();
        }

        @CheckForNull
        public final Object remove(@CheckForNull Object object) {
            Collection collection = this.d.remove(object);
            if (collection == null) {
                object = null;
            } else {
                object = (List)((y31)this.e).g.get();
                object.addAll(collection);
                k k11 = this.e;
                k11.f = k11.f - collection.size();
                collection.clear();
            }
            return object;
        }

        public final int size() {
            return this.d.size();
        }

        public final String toString() {
            return this.d.toString();
        }

        final class a
        extends au0<K, Collection<V>> {
            final com.yandex.mobile.ads.impl.k$a b;

            a(com.yandex.mobile.ads.impl.k$a a13) {
                this.b = a13;
            }

            public final boolean contains(@CheckForNull Object object) {
                boolean bl2;
                Set set = this.b.d.entrySet();
                set.getClass();
                try {
                    bl2 = set.contains(object);
                }
                catch (ClassCastException | NullPointerException runtimeException) {
                    bl2 = false;
                }
                return bl2;
            }

            public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new /* Unavailable Anonymous Inner Class!! */;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public final boolean remove(@CheckForNull Object object) {
                Object object2 = this.b.d.entrySet();
                object2.getClass();
                try {
                    boolean bl2 = object2.contains(object);
                    if (!bl2) {
                        return false;
                    }
                }
                catch (ClassCastException | NullPointerException runtimeException) {
                    return false;
                }
                object = (Map.Entry)object;
                Objects.requireNonNull(object);
                object = (Map.Entry)object;
                object2 = this.b.e;
                Object k11 = object.getKey();
                object = ((k)object2).e;
                object.getClass();
                try {
                    object = object.remove(k11);
                }
                catch (ClassCastException | NullPointerException runtimeException) {
                    object = null;
                }
                object = (Collection)object;
                if (object == null) return true;
                int n10 = object.size();
                object.clear();
                ((k)object2).f = ((k)object2).f - n10;
                return true;
            }
        }
    }

    private class c
    extends bu0<K, Collection<V>> {
        final k c;

        c(k k11, Map<K, Collection<V>> map2) {
            this.c = k11;
            super(map2);
        }

        public final void clear() {
            a a13;
            Iterator iterator = this.iterator();
            while ((a13 = (a)iterator).hasNext()) {
                a13.next();
                a13.remove();
            }
        }

        public final boolean containsAll(Collection<?> collection) {
            return this.b.keySet().containsAll(collection);
        }

        public final boolean equals(@CheckForNull Object object) {
            boolean bl2 = this == object || this.b.keySet().equals(object);
            return bl2;
        }

        public final int hashCode() {
            return this.b.keySet().hashCode();
        }

        public final Iterator<K> iterator() {
            return new a(this, this.b.entrySet().iterator());
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public final boolean remove(@CheckForNull Object object) {
            if ((object = (Collection)this.b.remove(object)) == null) return false;
            int n10 = object.size();
            object.clear();
            object = this.c;
            ((k)object).f = ((k)object).f - n10;
            if (n10 <= 0) return false;
            return true;
        }
    }

    /*
     * Duplicate member names - consider using --renamedupmembers true
     */
    final class d
    extends g
    implements NavigableMap<K, Collection<V>> {
        final k h;

        d(k k11, NavigableMap<K, Collection<V>> navigableMap) {
            this.h = k11;
            super(k11, navigableMap);
        }

        final SortedSet a() {
            return new e(this.h, this.c());
        }

        final NavigableMap<K, Collection<V>> c() {
            return (NavigableMap)((SortedMap)this.d);
        }

        @Override
        @CheckForNull
        public final Map.Entry<K, Collection<V>> ceilingEntry(K object) {
            object = this.c().ceilingEntry(object);
            object = object == null ? null : this.a(object);
            return object;
        }

        @Override
        @CheckForNull
        public final K ceilingKey(K k11) {
            return this.c().ceilingKey(k11);
        }

        @Override
        public final NavigableSet<K> descendingKeySet() {
            return ((d)this.descendingMap()).navigableKeySet();
        }

        @Override
        public final NavigableMap<K, Collection<V>> descendingMap() {
            return new d(this.h, this.c().descendingMap());
        }

        @Override
        @CheckForNull
        public final Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry entry = this.c().firstEntry();
            entry = entry == null ? null : this.a(entry);
            return entry;
        }

        @Override
        @CheckForNull
        public final Map.Entry<K, Collection<V>> floorEntry(K object) {
            object = this.c().floorEntry(object);
            object = object == null ? null : this.a(object);
            return object;
        }

        @Override
        @CheckForNull
        public final K floorKey(K k11) {
            return this.c().floorKey(k11);
        }

        @Override
        public final NavigableMap<K, Collection<V>> headMap(K k11, boolean bl2) {
            return new d(this.h, this.c().headMap(k11, bl2));
        }

        @Override
        public final SortedMap headMap(Object object) {
            return this.headMap(object, false);
        }

        @Override
        @CheckForNull
        public final Map.Entry<K, Collection<V>> higherEntry(K object) {
            object = this.c().higherEntry(object);
            object = object == null ? null : this.a(object);
            return object;
        }

        @Override
        @CheckForNull
        public final K higherKey(K k11) {
            return this.c().higherKey(k11);
        }

        @Override
        public final Set keySet() {
            return (NavigableSet)super.keySet();
        }

        @Override
        public final SortedSet keySet() {
            return (NavigableSet)super.keySet();
        }

        @Override
        @CheckForNull
        public final Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry entry = this.c().lastEntry();
            entry = entry == null ? null : this.a(entry);
            return entry;
        }

        @Override
        @CheckForNull
        public final Map.Entry<K, Collection<V>> lowerEntry(K object) {
            object = this.c().lowerEntry(object);
            object = object == null ? null : this.a(object);
            return object;
        }

        @Override
        @CheckForNull
        public final K lowerKey(K k11) {
            return this.c().lowerKey(k11);
        }

        @Override
        public final NavigableSet<K> navigableKeySet() {
            return (NavigableSet)super.keySet();
        }

        @Override
        @CheckForNull
        public final Map.Entry<K, Collection<V>> pollFirstEntry() {
            Object object;
            Iterator<Object> iterator = this.entrySet().iterator();
            if (!iterator.hasNext()) {
                object = null;
            } else {
                Map.Entry entry = (Map.Entry)iterator.next();
                object = (List)((y31)this.h).g.get();
                object.addAll((Collection)entry.getValue());
                iterator.remove();
                iterator = entry.getKey();
                ((com.yandex.mobile.ads.impl.i)this.h).getClass();
                object = new wj0(iterator, Collections.unmodifiableList(object));
            }
            return object;
        }

        @Override
        @CheckForNull
        public final Map.Entry<K, Collection<V>> pollLastEntry() {
            Object object;
            Iterator<Object> iterator = ((du0)this.descendingMap()).entrySet().iterator();
            if (!iterator.hasNext()) {
                object = null;
            } else {
                Map.Entry entry = (Map.Entry)iterator.next();
                object = (List)((y31)this.h).g.get();
                object.addAll((Collection)entry.getValue());
                iterator.remove();
                iterator = entry.getKey();
                ((com.yandex.mobile.ads.impl.i)this.h).getClass();
                object = new wj0(iterator, Collections.unmodifiableList(object));
            }
            return object;
        }

        @Override
        public final NavigableMap<K, Collection<V>> subMap(K k11, boolean bl2, K k12, boolean bl3) {
            return new d(this.h, this.c().subMap(k11, bl2, k12, bl3));
        }

        @Override
        public final SortedMap subMap(Object object, Object object2) {
            return this.subMap(object, true, object2, false);
        }

        @Override
        public final NavigableMap<K, Collection<V>> tailMap(K k11, boolean bl2) {
            return new d(this.h, this.c().tailMap(k11, bl2));
        }

        @Override
        public final SortedMap tailMap(Object object) {
            return this.tailMap(object, true);
        }
    }

    final class e
    extends h
    implements NavigableSet<K> {
        final k e;

        e(k k11, NavigableMap<K, Collection<V>> navigableMap) {
            this.e = k11;
            super(k11, navigableMap);
        }

        final NavigableMap<K, Collection<V>> c() {
            return (NavigableMap)((SortedMap)this.b);
        }

        @Override
        @CheckForNull
        public final K ceiling(K k11) {
            return this.c().ceilingKey(k11);
        }

        @Override
        public final Iterator<K> descendingIterator() {
            return ((c)((Object)this.descendingSet())).iterator();
        }

        @Override
        public final NavigableSet<K> descendingSet() {
            return new e(this.e, this.c().descendingMap());
        }

        @Override
        @CheckForNull
        public final K floor(K k11) {
            return this.c().floorKey(k11);
        }

        @Override
        public final NavigableSet<K> headSet(K k11, boolean bl2) {
            return new e(this.e, this.c().headMap(k11, bl2));
        }

        @Override
        public final SortedSet headSet(Object object) {
            return this.headSet((K)object, false);
        }

        @Override
        @CheckForNull
        public final K higher(K k11) {
            return this.c().higherKey(k11);
        }

        @Override
        @CheckForNull
        public final K lower(K k11) {
            return this.c().lowerKey(k11);
        }

        @Override
        @CheckForNull
        public final K pollFirst() {
            Object object;
            c.a a13 = (c.a)this.iterator();
            if (a13.hasNext()) {
                object = a13.next();
                a13.remove();
            } else {
                object = null;
            }
            return object;
        }

        @Override
        @CheckForNull
        public final K pollLast() {
            Object object;
            c.a a13 = (c.a)((c)((Object)this.descendingSet())).iterator();
            if (a13.hasNext()) {
                object = a13.next();
                a13.remove();
            } else {
                object = null;
            }
            return object;
        }

        @Override
        public final NavigableSet<K> subSet(K k11, boolean bl2, K k12, boolean bl3) {
            return new e(this.e, this.c().subMap(k11, bl2, k12, bl3));
        }

        @Override
        public final SortedSet subSet(Object object, Object object2) {
            return this.subSet((K)object, true, (K)object2, false);
        }

        @Override
        public final NavigableSet<K> tailSet(K k11, boolean bl2) {
            return new e(this.e, this.c().tailMap(k11, bl2));
        }

        @Override
        public final SortedSet tailSet(Object object) {
            return this.tailSet((K)object, true);
        }
    }

    private final class f
    extends j
    implements RandomAccess {
        f(k k11, K k12, List<V> list, @CheckForNull i i14) {
            super(k11, k12, list, i14);
        }
    }

    private class g
    extends a
    implements SortedMap<K, Collection<V>> {
        @CheckForNull
        SortedSet<K> f;
        final k g;

        g(k k11, SortedMap<K, Collection<V>> sortedMap) {
            this.g = k11;
            super(k11, sortedMap);
        }

        SortedSet<K> a() {
            return new h(this.g, this.b());
        }

        SortedMap<K, Collection<V>> b() {
            return (SortedMap)this.d;
        }

        @Override
        @CheckForNull
        public final Comparator<? super K> comparator() {
            return this.b().comparator();
        }

        @Override
        public final K firstKey() {
            return this.b().firstKey();
        }

        @Override
        public SortedMap<K, Collection<V>> headMap(K k11) {
            return new g(this.g, this.b().headMap(k11));
        }

        @Override
        public SortedSet<K> keySet() {
            SortedSet sortedSet;
            SortedSet sortedSet2 = sortedSet = this.f;
            if (sortedSet == null) {
                this.f = sortedSet2 = this.a();
            }
            return sortedSet2;
        }

        @Override
        public final K lastKey() {
            return this.b().lastKey();
        }

        @Override
        public SortedMap<K, Collection<V>> subMap(K k11, K k12) {
            return new g(this.g, this.b().subMap(k11, k12));
        }

        @Override
        public SortedMap<K, Collection<V>> tailMap(K k11) {
            return new g(this.g, this.b().tailMap(k11));
        }
    }

    private class h
    extends c
    implements SortedSet<K> {
        final k d;

        h(k k11, SortedMap<K, Collection<V>> sortedMap) {
            this.d = k11;
            super(k11, sortedMap);
        }

        SortedMap<K, Collection<V>> b() {
            return (SortedMap)this.b;
        }

        @Override
        @CheckForNull
        public final Comparator<? super K> comparator() {
            return this.b().comparator();
        }

        @Override
        public final K first() {
            return this.b().firstKey();
        }

        @Override
        public SortedSet<K> headSet(K k11) {
            return new h(this.d, this.b().headMap(k11));
        }

        @Override
        public final K last() {
            return this.b().lastKey();
        }

        @Override
        public SortedSet<K> subSet(K k11, K k12) {
            return new h(this.d, this.b().subMap(k11, k12));
        }

        @Override
        public SortedSet<K> tailSet(K k11) {
            return new h(this.d, this.b().tailMap(k11));
        }
    }

    class j
    extends i
    implements List<V> {
        final k g;

        j(k k11, K k12, List<V> list, @CheckForNull i i14) {
            this.g = k11;
            super(k11, k12, list, i14);
        }

        @Override
        public final void add(int n10, V object) {
            this.d();
            boolean bl2 = this.c.isEmpty();
            ((List)this.c).add(n10, object);
            object = this.g;
            ((k)object).f = ((k)object).f + 1;
            if (bl2) {
                this.b();
            }
        }

        @Override
        public final boolean addAll(int n10, Collection<? extends V> object) {
            if (object.isEmpty()) {
                return false;
            }
            this.d();
            int n13 = this.c.size();
            boolean bl2 = ((List)this.c).addAll(n10, object);
            if (bl2) {
                n10 = this.c.size();
                object = this.g;
                ((k)object).f = n10 - n13 + ((k)object).f;
                if (n13 == 0) {
                    this.b();
                }
            }
            return bl2;
        }

        final List<V> f() {
            return (List)this.c;
        }

        @Override
        public final V get(int n10) {
            this.d();
            return ((List)this.c).get(n10);
        }

        @Override
        public final int indexOf(@CheckForNull Object object) {
            this.d();
            return ((List)this.c).indexOf(object);
        }

        @Override
        public final int lastIndexOf(@CheckForNull Object object) {
            this.d();
            return ((List)this.c).lastIndexOf(object);
        }

        @Override
        public final ListIterator<V> listIterator() {
            this.d();
            return new a(this);
        }

        @Override
        public final ListIterator<V> listIterator(int n10) {
            this.d();
            return new a(this, n10);
        }

        @Override
        public final V remove(int n10) {
            this.d();
            Object e11 = ((List)this.c).remove(n10);
            k k11 = this.g;
            k11.f = k11.f - 1;
            this.e();
            return e11;
        }

        @Override
        public final V set(int n10, V v14) {
            this.d();
            return ((List)this.c).set(n10, v14);
        }

        @Override
        public final List<V> subList(int n10, int n13) {
            i i14;
            this.d();
            k k11 = this.g;
            Object object = this.b;
            List list = ((List)this.c).subList(n10, n13);
            i i15 = i14 = this.d;
            if (i14 == null) {
                i15 = this;
            }
            k11.getClass();
            i15 = list instanceof RandomAccess ? new f(k11, object, list, i15) : new j(k11, object, list, i15);
            return i15;
        }

        /*
         * Signature claims super is com.yandex.mobile.ads.impl.k$i.a, not com.yandex.mobile.ads.impl.k$i$a - discarding signature.
         */
        private final class a
        extends com.yandex.mobile.ads.impl.k$i$a
        implements ListIterator {
            final j e;

            a(j j10) {
                this.e = j10;
                super(j10);
            }

            public a(j j10, int n10) {
                this.e = j10;
                super(j10, j10.f().listIterator(n10));
            }

            private ListIterator<V> a() {
                this.d.d();
                if (this.d.c == this.c) {
                    return (ListIterator)this.b;
                }
                throw new ConcurrentModificationException();
            }

            public final void add(V object) {
                boolean bl2 = ((AbstractCollection)((Object)this.e)).isEmpty();
                this.a().add(object);
                j j10 = this.e;
                object = j10.g;
                ((k)object).f = ((k)object).f + 1;
                if (bl2) {
                    j10.b();
                }
            }

            @Override
            public final boolean hasPrevious() {
                return this.a().hasPrevious();
            }

            @Override
            public final int nextIndex() {
                return this.a().nextIndex();
            }

            public final V previous() {
                return this.a().previous();
            }

            @Override
            public final int previousIndex() {
                return this.a().previousIndex();
            }

            public final void set(V v14) {
                this.a().set(v14);
            }
        }
    }
}

